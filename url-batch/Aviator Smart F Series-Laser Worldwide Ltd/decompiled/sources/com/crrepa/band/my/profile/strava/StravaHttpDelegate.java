package com.crrepa.band.my.profile.strava;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsLocation;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.crrepa.band.my.profile.strava.model.DeauthorizeResp;
import com.crrepa.band.my.profile.strava.model.GPXContentBean;
import com.crrepa.band.my.profile.strava.model.GPXUploadResp;
import com.crrepa.band.my.profile.strava.model.StravaModel;
import com.crrepa.band.my.profile.strava.model.StravaTokenResp;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.moyoung.dafit.module.common.utils.r0;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.HttpException;

/* loaded from: classes2.dex */
public class StravaHttpDelegate {
    private final a callBack;
    private final StravaModel stravaModel = new StravaModel();

    public interface a {
        void onFailed(String str);

        void onStravaOauthInvalid();

        void onSucceed(String str);

        void onTokenRefreshed();
    }

    public StravaHttpDelegate(a aVar) {
        this.callBack = aVar;
    }

    private List<GPXContentBean> convertToGPXList(List<TrainingLocation> list) {
        com.crrepa.band.my.training.utils.g create = com.crrepa.band.my.training.j.create(com.crrepa.band.my.training.utils.h.getMapType(com.moyoung.dafit.module.common.utils.d.get()));
        for (TrainingLocation trainingLocation : list) {
            GpsLocation convert = create.convert(trainingLocation.getLatitude(), trainingLocation.getLongitude());
            trainingLocation.setLatitude(convert.getLatitude());
            trainingLocation.setLongitude(convert.getLongitude());
            trainingLocation.setTimestamp(com.moyoung.dafit.module.common.utils.m.format2GMTTimestamp(trainingLocation.getTimestamp()));
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            TrainingLocation trainingLocation2 = list.get(i8);
            arrayList.add(new GPXContentBean(trainingLocation2.getLatitude(), trainingLocation2.getLongitude(), trainingLocation2.getAltitude(), trainingLocation2.getTimestamp(), trainingLocation2.getSpeed()));
        }
        return v3.a.checkPausePoint(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dealStravaResponseError(Throwable th) {
        if (!(th instanceof HttpException)) {
            this.callBack.onFailed(th.getMessage());
            return;
        }
        HttpException httpException = (HttpException) th;
        if (httpException.code() == 401) {
            refreshToken();
            return;
        }
        if (httpException.code() != 400) {
            this.callBack.onFailed("http:" + httpException.message());
            return;
        }
        try {
            ResponseBody errorBody = httpException.response().errorBody();
            if (errorBody == null) {
                return;
            }
            r0.showShort(com.moyoung.dafit.module.common.utils.d.get(), ((GPXUploadResp) new Gson().fromJson(errorBody.string(), new TypeToken<GPXUploadResp>() { // from class: com.crrepa.band.my.profile.strava.StravaHttpDelegate.1
            }.getType())).getStatus());
        } catch (Exception e8) {
            e8.printStackTrace();
            this.callBack.onFailed(e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deauthorize$1(DeauthorizeResp deauthorizeResp) {
        if (deauthorizeResp != null) {
            this.callBack.onSucceed("Deauthorize succeed");
            return;
        }
        this.callBack.onFailed("error:" + com.moyoung.dafit.module.common.utils.d.get().getString(R.string.classes_network_exception));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$deauthorize$2(Throwable th) {
        if (!(th instanceof HttpException)) {
            this.callBack.onFailed("error1:" + th.getMessage());
            return;
        }
        if (((HttpException) th).code() == 401) {
            this.callBack.onSucceed("Deauthorize succeed");
            return;
        }
        this.callBack.onFailed("error2:" + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshToken$3(StravaTokenResp stravaTokenResp) {
        if (stravaTokenResp == null) {
            this.callBack.onFailed("Token refresh failure");
        } else {
            this.callBack.onTokenRefreshed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$refreshToken$4(Throwable th) {
        this.callBack.onFailed("Token refresh failed. Please log in");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$uploadGPXFile$0(long j8, GPXUploadResp gPXUploadResp) {
        if (gPXUploadResp == null) {
            this.callBack.onFailed("Fail to upload");
        } else {
            this.callBack.onSucceed(gPXUploadResp.getStatus());
            o.saveUploadedTrainingId(j8);
        }
    }

    @SuppressLint({"CheckResult"})
    private void refreshToken() {
        StravaModel.clearAccessToken();
        this.stravaModel.refreshToken().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.profile.strava.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StravaHttpDelegate.this.lambda$refreshToken$3((StravaTokenResp) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.profile.strava.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StravaHttpDelegate.this.lambda$refreshToken$4((Throwable) obj);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public void deauthorize() {
        this.stravaModel.deauthorize().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.profile.strava.e
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StravaHttpDelegate.this.lambda$deauthorize$1((DeauthorizeResp) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.profile.strava.f
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StravaHttpDelegate.this.lambda$deauthorize$2((Throwable) obj);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public void uploadGPXFile(final long j8, int i8, List<TrainingLocation> list) {
        if (TextUtils.isEmpty(com.moyoung.dafit.module.common.network.provider.g.getInstance().getString("access_token", null))) {
            this.callBack.onStravaOauthInvalid();
            return;
        }
        this.stravaModel.uploadGPXFile(com.crrepa.band.my.a.getGpsTrainingDirPath() + "/" + (j8 + "_" + System.currentTimeMillis() + ".gpx"), i8, convertToGPXList(list)).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.profile.strava.a
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StravaHttpDelegate.this.lambda$uploadGPXFile$0(j8, (GPXUploadResp) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.profile.strava.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StravaHttpDelegate.this.dealStravaResponseError((Throwable) obj);
            }
        });
    }
}
