package com.crrepa.band.my.home.training.model;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.crrepa.band.my.home.training.model.HomeTrainingModel;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.crrepa.band.my.model.net.TrainingRecordsEntity;
import com.crrepa.band.my.profile.strava.StravaHttpDelegate;
import com.crrepa.band.my.profile.strava.g;
import com.crrepa.band.my.profile.strava.o;
import com.crrepa.band.my.training.presenter.i;
import com.crrepa.band.my.training.utils.d;
import com.crrepa.band.my.training.utils.q;
import com.moyoung.dafit.module.common.utils.x0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class HomeTrainingModel {
    private GpsTrainingDaoProxy gpsDaoProxy = new GpsTrainingDaoProxy();
    private MovementHeartRateDaoProxy movementDaoProxy = new MovementHeartRateDaoProxy();
    private StravaHttpDelegate stravaHttpDelegate;

    public static String getTrainingName(Context context, GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        return q.getTrainingName(context, gpsTrainingType.getValue());
    }

    private List<TrainingLocation> getTrainingPathList(GpsTraining gpsTraining) {
        String filePath = gpsTraining.getFilePath();
        if (TextUtils.isEmpty(filePath)) {
            return null;
        }
        return new d().readTrainingPath(new File(filePath), gpsTraining.getEncrypt().booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shareGPSTrainingToStrava$0(List list, String str) {
        Log.d("HomeTrainingModel", "strava succeed!!!!   " + o.getUploadedTrainingIdList());
        list.remove(0);
        shareOneGpsTraining(list);
    }

    private void shareOneGpsTraining(List<GpsTraining> list) {
        if (x0.isEmpty(list)) {
            return;
        }
        GpsTraining gpsTraining = list.get(0);
        this.stravaHttpDelegate.uploadGPXFile(gpsTraining.getId().longValue(), gpsTraining.getTrainingType().intValue(), getTrainingPathList(gpsTraining));
    }

    public HomeTrainingRecordsBean queryAllTrainingHistory() {
        List<TrainingRecordsEntity> mergeTrainingRecordsList = i.mergeTrainingRecordsList(com.moyoung.dafit.module.common.utils.d.get(), this.gpsDaoProxy.getAll(), this.movementDaoProxy.getAll());
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < mergeTrainingRecordsList.size(); i10++) {
            TrainingRecordsEntity trainingRecordsEntity = mergeTrainingRecordsList.get(i10);
            i8 += trainingRecordsEntity.getTrainingSeconds() == null ? 0 : trainingRecordsEntity.getTrainingSeconds().intValue();
            i9++;
        }
        return new HomeTrainingRecordsBean(i8 / 60, i9);
    }

    public void shareGPSTrainingToStrava() {
        if (this.gpsDaoProxy == null) {
            this.gpsDaoProxy = new GpsTrainingDaoProxy();
        }
        List<GpsTraining> all = this.gpsDaoProxy.getAll();
        if (x0.isEmpty(all)) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        for (GpsTraining gpsTraining : all) {
            if (o.isUnsharedTrainingId(gpsTraining.getId().longValue())) {
                arrayList.add(gpsTraining);
            }
        }
        if (x0.isEmpty(arrayList)) {
            return;
        }
        if (this.stravaHttpDelegate == null) {
            this.stravaHttpDelegate = new StravaHttpDelegate(new StravaHttpDelegate.a() { // from class: t3.a
                @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
                public /* synthetic */ void onFailed(String str) {
                    g.a(this, str);
                }

                @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
                public /* synthetic */ void onStravaOauthInvalid() {
                    g.b(this);
                }

                @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
                public final void onSucceed(String str) {
                    HomeTrainingModel.this.lambda$shareGPSTrainingToStrava$0(arrayList, str);
                }

                @Override // com.crrepa.band.my.profile.strava.StravaHttpDelegate.a
                public /* synthetic */ void onTokenRefreshed() {
                    g.c(this);
                }
            });
        }
        shareOneGpsTraining(arrayList);
    }
}
