package com.crrepa.band.my.profile.strava.model;

import android.accounts.NetworkErrorException;
import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import cn.hutool.core.text.l;
import cn.hutool.core.util.g1;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.training.utils.q;
import com.moyoung.dafit.module.common.network.provider.g;
import com.yanzhenjie.kalle.i;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.util.List;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public class StravaModel {
    private static final String KEY_UPLOADED_REFRESH_TOKEN = "key_uploaded_refresh_token";
    private final StravaApiStores apiStores = StravaRetrofitClient.getInstance().getApiStores();

    public static void clearAccessToken() {
        g.getInstance().remove("access_token");
    }

    public static String getSportTypeStr(int i8) {
        return i8 == GpsTrainingModel.GpsTrainingType.WALKING.getValue() ? "Walk" : i8 == GpsTrainingModel.GpsTrainingType.ON_FOOT.getValue() ? "Hike" : (i8 == GpsTrainingModel.GpsTrainingType.RUNNING.getValue() || i8 == GpsTrainingModel.GpsTrainingType.TRAIL_RUNNING.getValue()) ? "Run" : i8 == GpsTrainingModel.GpsTrainingType.CYCLING.getValue() ? "Ride" : "Workout";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DeauthorizeResp lambda$deauthorize$3(DeauthorizeResp deauthorizeResp) {
        if (deauthorizeResp != null) {
            return deauthorizeResp;
        }
        throw new NetworkErrorException("net error");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StravaTokenResp lambda$refreshToken$2(StravaTokenResp stravaTokenResp) {
        if (stravaTokenResp == null) {
            throw new NetworkErrorException("net error");
        }
        saveToken(stravaTokenResp);
        uploadRefreshTokenOnly(stravaTokenResp);
        return stravaTokenResp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ StravaTokenResp lambda$requestToken$0(StravaTokenResp stravaTokenResp) {
        if (stravaTokenResp == null) {
            throw new NetworkErrorException("net error");
        }
        saveToken(stravaTokenResp);
        uploadRefreshTokenOnly(stravaTokenResp);
        return stravaTokenResp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ GPXUploadResp lambda$uploadGPXFile$1(GPXUploadResp gPXUploadResp) {
        if (gPXUploadResp == null) {
            throw new NetworkErrorException("net error");
        }
        uploadRefreshTokenWithShareGPX();
        return gPXUploadResp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$uploadRefreshToken$4(String str, UploadRefreshTokenResp uploadRefreshTokenResp) {
        g.getInstance().putString(KEY_UPLOADED_REFRESH_TOKEN, str);
        Log.d("StravaModel", "upload refresh token success");
    }

    @SuppressLint({"CheckResult"})
    private void uploadRefreshToken(final String str, boolean z7) {
        String str2 = z7 ? "1" : "0";
        Log.d("StravaModel", "upload refresh token:" + str + "---" + str2);
        this.apiStores.uploadRefreshToken(str, str2).subscribeOn(Schedulers.io()).observeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.crrepa.band.my.profile.strava.model.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                StravaModel.lambda$uploadRefreshToken$4(str, (UploadRefreshTokenResp) obj);
            }
        }, new Consumer() { // from class: com.crrepa.band.my.profile.strava.model.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                Log.d("StravaModel", "upload refresh token error");
            }
        });
    }

    public Observable<DeauthorizeResp> deauthorize() {
        return this.apiStores.deauthorize(g.getInstance().getString("access_token", "")).map(new Function() { // from class: com.crrepa.band.my.profile.strava.model.f
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                DeauthorizeResp lambda$deauthorize$3;
                lambda$deauthorize$3 = StravaModel.lambda$deauthorize$3((DeauthorizeResp) obj);
                return lambda$deauthorize$3;
            }
        });
    }

    public Observable<StravaTokenResp> refreshToken() {
        StravaRefreshTokenReq stravaRefreshTokenReq = new StravaRefreshTokenReq();
        return this.apiStores.refreshToken(stravaRefreshTokenReq.getClient_id(), stravaRefreshTokenReq.getClient_secret(), stravaRefreshTokenReq.getGrant_type(), stravaRefreshTokenReq.getRefreshToken()).map(new Function() { // from class: com.crrepa.band.my.profile.strava.model.b
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                StravaTokenResp lambda$refreshToken$2;
                lambda$refreshToken$2 = StravaModel.this.lambda$refreshToken$2((StravaTokenResp) obj);
                return lambda$refreshToken$2;
            }
        });
    }

    public Observable<StravaTokenResp> requestToken(String str) {
        StravaTokenReq stravaTokenReq = new StravaTokenReq();
        stravaTokenReq.setCode(str);
        return this.apiStores.requestToken(stravaTokenReq.getClient_id(), stravaTokenReq.getClient_secret(), stravaTokenReq.getCode(), stravaTokenReq.getGrant_type()).map(new Function() { // from class: com.crrepa.band.my.profile.strava.model.a
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                StravaTokenResp lambda$requestToken$0;
                lambda$requestToken$0 = StravaModel.this.lambda$requestToken$0((StravaTokenResp) obj);
                return lambda$requestToken$0;
            }
        });
    }

    public void saveToken(StravaTokenResp stravaTokenResp) {
        g.getInstance().putString("access_token", stravaTokenResp.getAccess_token());
        g.getInstance().putString("refresh_token", stravaTokenResp.getRefresh_token());
        StravaRetrofitClient.getInstance().resetApiStores();
    }

    public Observable<GPXUploadResp> uploadGPXFile(String str, int i8, List<GPXContentBean> list) {
        if (!v3.a.createGPXFile(str, list)) {
            return new Observable<GPXUploadResp>() { // from class: com.crrepa.band.my.profile.strava.model.StravaModel.1
                @Override // io.reactivex.Observable
                protected void subscribeActual(Observer<? super GPXUploadResp> observer) {
                }
            };
        }
        File file = new File(str);
        MultipartBody.Part createFormData = MultipartBody.Part.createFormData(g1.URL_PROTOCOL_FILE, file.getName(), RequestBody.create(MediaType.parse(i.VALUE_APPLICATION_FORM), file));
        String sportTypeStr = getSportTypeStr(i8);
        RequestBody create = RequestBody.create(MediaType.parse("text/plain"), sportTypeStr);
        String trainingName = q.getTrainingName(com.moyoung.dafit.module.common.utils.d.get(), i8);
        MediaType parse = MediaType.parse("text/plain");
        if (!TextUtils.isEmpty(trainingName)) {
            sportTypeStr = trainingName;
        }
        return this.apiStores.uploadGPXFile(createFormData, create, RequestBody.create(parse, sportTypeStr), RequestBody.create(MediaType.parse("text/plain"), com.moyoung.dafit.module.common.utils.d.get().getString(R.string.strava_share_description) + l.SPACE + com.moyoung.dafit.module.common.utils.d.get().getString(R.string.app_name)), RequestBody.create(MediaType.parse("text/plain"), "0"), RequestBody.create(MediaType.parse("text/plain"), "0"), RequestBody.create(MediaType.parse("text/plain"), "gpx"), RequestBody.create(MediaType.parse("text/plain"), file.getName())).map(new Function() { // from class: com.crrepa.band.my.profile.strava.model.e
            @Override // io.reactivex.functions.Function
            public final Object apply(Object obj) {
                GPXUploadResp lambda$uploadGPXFile$1;
                lambda$uploadGPXFile$1 = StravaModel.this.lambda$uploadGPXFile$1((GPXUploadResp) obj);
                return lambda$uploadGPXFile$1;
            }
        });
    }

    public void uploadRefreshTokenOnly(StravaTokenResp stravaTokenResp) {
        String refresh_token = stravaTokenResp.getRefresh_token();
        if (refresh_token.equals(g.getInstance().getString(KEY_UPLOADED_REFRESH_TOKEN, ""))) {
            Log.d("StravaModel", "refresh token is uploaded");
        } else {
            uploadRefreshToken(refresh_token, false);
        }
    }

    public void uploadRefreshTokenWithShareGPX() {
        uploadRefreshToken(g.getInstance().getString("refresh_token", "empty token"), true);
    }
}
