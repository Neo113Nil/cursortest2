package com.crrepa.band.my.training.presenter;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.health.bloodoxygen.model.BandHeartRateChangeEvent;
import com.crrepa.band.my.health.steps.model.BandStepChangeEvent;
import com.crrepa.band.my.model.GpsTrainingModel;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.BandTempSystemProvider;
import com.crrepa.band.my.model.band.provider.BandUnitSystemProvider;
import com.crrepa.band.my.model.db.GpsTraining;
import com.crrepa.band.my.model.db.MovementHeartRate;
import com.crrepa.band.my.model.db.Step;
import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.crrepa.band.my.model.db.proxy.MovementHeartRateDaoProxy;
import com.crrepa.band.my.model.db.proxy.StepsDaoProxy;
import com.crrepa.band.my.model.gps.GpsLocation;
import com.crrepa.band.my.model.gps.TrainingLocation;
import com.crrepa.band.my.model.user.provider.UserStepLengthProvider;
import com.crrepa.band.my.model.user.provider.UserWeightProvider;
import com.crrepa.band.my.training.TrainingSettingActivity;
import com.crrepa.band.my.training.map.BaseMapTrainingActivity;
import com.crrepa.band.my.training.map.c0;
import com.crrepa.band.my.training.model.BandMovementHeartRateChangeEvent;
import com.crrepa.band.my.training.model.BandTrainingStartedChangeEvent;
import com.crrepa.band.my.training.model.BandTrainingStateChangeEvent;
import com.crrepa.band.my.training.model.PhoneStepsChangeEvent;
import com.crrepa.band.my.training.model.TrainingGoalType;
import com.crrepa.band.my.training.presenter.f;
import com.google.android.exoplayer2.C;
import com.moyoung.dafit.module.common.utils.n;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.t;
import com.moyoung.dafit.module.common.utils.u;
import com.moyoung.dafit.module.common.utils.u0;
import com.moyoung.dafit.module.common.utils.x0;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.l;

/* loaded from: classes3.dex */
public class f implements com.moyoung.dafit.module.common.baseui.f {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int DEFAULT_LATLNG_VALUE = -1;
    public static final int DEFAULT_TRAINING_ID = -1;
    private static final String LOCATION_ALARM = "com.crrepa.band.location.alarm";
    private static final int MAX_DISTANCE = 50;
    private static final long MIN_GPS_TRAINING_TIME = 60000;
    private static final String[] NO_TRAINING_VERSION_ARRAY = {"DBO", "DDF", "DIJ", "DIU", "DMO", "DOX", "DPS", "DRO", "DSU", "DBP", "DFT", "DCA", "DAV", "DBD", "DBL", "DCD", "DCF", "DCR", "DDL", "DFP", "DIF", "DKD", "DKE", "DKF", "DKL", "DLJ", "DLW", "DLX", "DMK", "DOA", "DOM", "DON", "DPC", "DQD", "DQJ", "DBY", "DBZ", "DDR", "DFO", "DGF", "DGX", "DNR", "DHJ", "DII", "DJQ", "DML", "DAZ", "DBT", "DBZ", "DCC", "DDN", "DFU", "DHR", "DHW", "DJN", "DKG", "DKV", "DKZ", "DLC", "DLD", "DLG", "DND", "DOE", "DPE", "DAJ", "DBN", "DGK", "DIE", "DKW", "DPF", "DPG", "DTE", "DUI", "DBX", "DLB", "DJV", "DVQ", "DNY", "DRH", "DPT", "DRY", "DQZ", "DOI", "DMV"};
    public static final int TRAINING_HEART_RATE_DELAY = 30;
    public static final int VALID_ALTITUDE = 4;
    private static final int VALID_LOCATION_ACCURACY = 20;
    private static final long WAKE_LOCATION_PERIOD = 60000;
    private AlarmManager alarmManager;
    private float currentMinutesDistance;
    private int currentMinutesSteps;
    private Disposable heartRateSubscribe;
    private int nowTemperature;
    private long oneKmDuration;
    private long oneMileDuration;
    private PendingIntent pendingIntent;
    private Date startDate;
    private float tenSecondsDistance;
    private Timer trainingTimer;
    private GpsTrainingModel.GpsTrainingType trainingType;
    private c0 view;
    private PowerManager.WakeLock wakeLock;
    private int weatherCode;
    private boolean isNoTrainingVersion = false;
    private final c gpsStateChangeReceiver = new c();
    private int trainingSeconds = 0;
    private boolean startTraining = false;
    private boolean pauseTraining = false;
    private double trainingDistance = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
    private int previousTotalSteps = 0;
    private int trainingSteps = 0;
    private int previousCalories = 0;
    private float trainingCalories = 0.0f;
    private final List<Integer> minuteStepsList = new ArrayList();
    private final List<Float> minuteDistanceList = new ArrayList();
    private final List<Long> realTimePaceList = new ArrayList();
    private final List<Long> oneKmPaceList = new ArrayList();
    private final List<Long> oneMilePaceList = new ArrayList();
    private double previousLatitude = -1.0d;
    private double previousLongitude = -1.0d;
    private int locationCount = 0;
    private final d screenReceiver = new d();
    private final e wakeLocationReceiver = new e();
    private final com.crrepa.band.my.training.utils.d trainingPathManager = new com.crrepa.band.my.training.utils.d();
    private final List<Double> altitudeList = new ArrayList();
    private double prevAltitude = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
    private final boolean imperialSystem = BandUnitSystemProvider.isImperialSystem();
    private long trainingId = -1;
    private boolean trainingEnd = false;
    public boolean isPhoneStepsCounter = true;
    float currentTipsDistance = -1.0f;

    class a extends TimerTask {
        final /* synthetic */ Handler val$handler;

        a(Handler handler) {
            this.val$handler = handler;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            f.access$108(f.this);
            f.access$208(f.this);
            if (f.this.view == null) {
                return;
            }
            f.this.calculateRealTimeActionDetail();
            f.this.showTrainingTime();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (f.this.pauseTraining) {
                return;
            }
            this.val$handler.post(new Runnable() { // from class: com.crrepa.band.my.training.presenter.e
                @Override // java.lang.Runnable
                public final void run() {
                    f.a.this.lambda$run$0();
                }
            });
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$model$GpsTrainingModel$GpsTrainingType;
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType;

        static {
            int[] iArr = new int[GpsTrainingModel.GpsTrainingType.values().length];
            $SwitchMap$com$crrepa$band$my$model$GpsTrainingModel$GpsTrainingType = iArr;
            try {
                iArr[GpsTrainingModel.GpsTrainingType.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$GpsTrainingModel$GpsTrainingType[GpsTrainingModel.GpsTrainingType.WALKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$GpsTrainingModel$GpsTrainingType[GpsTrainingModel.GpsTrainingType.CYCLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$GpsTrainingModel$GpsTrainingType[GpsTrainingModel.GpsTrainingType.TRAIL_RUNNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$GpsTrainingModel$GpsTrainingType[GpsTrainingModel.GpsTrainingType.ON_FOOT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$GpsTrainingModel$GpsTrainingType[GpsTrainingModel.GpsTrainingType.INDOOR_RUNNING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$GpsTrainingModel$GpsTrainingType[GpsTrainingModel.GpsTrainingType.INDOOR_WALKING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[TrainingGoalType.values().length];
            $SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType = iArr2;
            try {
                iArr2[TrainingGoalType.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType[TrainingGoalType.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType[TrainingGoalType.PACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType[TrainingGoalType.CALORIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    class c extends BroadcastReceiver {
        public static final String LOCATION_BROADCAST = "android.location.PROVIDERS_CHANGED";

        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            f.this.getGpsState(context);
        }
    }

    class d extends BroadcastReceiver {
        d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_ON".equals(action)) {
                com.orhanobut.logger.f.e("开屏", new Object[0]);
                return;
            }
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                com.orhanobut.logger.f.e("锁屏", new Object[0]);
                f.this.wakeLocation();
            } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                com.orhanobut.logger.f.e("解锁", new Object[0]);
                f.this.alarmManager.cancel(f.this.pendingIntent);
                f.this.removeLocation();
                f.this.requestLocation();
            }
        }
    }

    class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.orhanobut.logger.f.e("重新获取定位", new Object[0]);
            if (TextUtils.equals(intent.getAction(), f.LOCATION_ALARM)) {
                f.this.removeLocation();
                f.this.requestLocation();
            }
        }
    }

    public f() {
        org.greenrobot.eventbus.c.getDefault().register(this);
    }

    static /* synthetic */ long access$108(f fVar) {
        long j8 = fVar.oneKmDuration;
        fVar.oneKmDuration = 1 + j8;
        return j8;
    }

    static /* synthetic */ long access$208(f fVar) {
        long j8 = fVar.oneMileDuration;
        fVar.oneMileDuration = 1 + j8;
        return j8;
    }

    private void addInValidLocation(long j8) {
        this.trainingPathManager.writeLocation(new TrainingLocation(200.0d, 200.0d, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, j8, 0.0f));
    }

    private void calculateKmDuration() {
        if (this.trainingDistance <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return;
        }
        if (this.trainingDistance / (this.oneKmPaceList.size() + 1) >= 1000.0d) {
            this.oneKmPaceList.add(Long.valueOf(this.oneKmDuration));
            this.oneKmDuration = 0L;
        }
    }

    private void calculateMilesDuration() {
        if (this.trainingDistance <= com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return;
        }
        if ((this.trainingDistance * 0.6200000047683716d) / (this.oneMilePaceList.size() + 1) >= 1000.0d) {
            this.oneMilePaceList.add(Long.valueOf(this.oneMileDuration));
            this.oneMileDuration = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateRealTimeActionDetail() {
        int i8 = this.trainingSeconds;
        if (i8 > 0 && i8 % 60 == 0) {
            com.orhanobut.logger.f.d("currentMinutesSteps: " + this.currentMinutesSteps + " , currentMinutesDistance: " + this.currentMinutesDistance);
            this.minuteStepsList.add(Integer.valueOf(this.currentMinutesSteps));
            this.currentMinutesSteps = 0;
            this.minuteDistanceList.add(Float.valueOf(this.currentMinutesDistance));
            this.currentMinutesDistance = 0.0f;
        }
        int i9 = this.trainingSeconds;
        if (i9 <= 0 || i9 % 10 != 0) {
            return;
        }
        if (this.tenSecondsDistance > 0.0f) {
            Log.d("tenSecondsDistance", this.tenSecondsDistance + ", trainingSeconds=" + this.trainingSeconds + ", realTimePaceList=" + this.realTimePaceList);
            float f8 = this.tenSecondsDistance / 1000.0f;
            this.tenSecondsDistance = f8;
            this.realTimePaceList.add(Long.valueOf((long) (10.0f / f8)));
            this.tenSecondsDistance = 0.0f;
        }
        double d8 = this.prevAltitude;
        if (d8 != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            this.altitudeList.add(Double.valueOf(d8));
        }
    }

    private void cancelHeartRateSubscrube() {
        Disposable disposable = this.heartRateSubscribe;
        if (disposable == null || disposable.isDisposed()) {
            return;
        }
        this.heartRateSubscribe.dispose();
    }

    private GpsTraining createGpsTraining(int i8) {
        GpsTraining gpsTraining = new GpsTraining();
        gpsTraining.setType(Integer.valueOf(i8));
        GpsTrainingModel.GpsTrainingType gpsTrainingType = this.trainingType;
        if (gpsTrainingType != null) {
            gpsTraining.setTrainingType(Integer.valueOf(gpsTrainingType.getValue()));
        }
        gpsTraining.setNowTemperature(Integer.valueOf(this.nowTemperature));
        gpsTraining.setNowTemperatureUnit(Integer.valueOf(BandTempSystemProvider.isFahrenheit() ? 1 : 0));
        gpsTraining.setWeatherCode(Integer.valueOf(this.weatherCode));
        gpsTraining.setStartDate(this.startDate);
        gpsTraining.setEndDate(new Date());
        gpsTraining.setTrainingSeconds(Integer.valueOf(this.trainingSeconds));
        gpsTraining.setDistance(Integer.valueOf((int) this.trainingDistance));
        gpsTraining.setCalorie(Float.valueOf(this.trainingCalories));
        gpsTraining.setStep(Integer.valueOf(this.trainingSteps));
        long j8 = this.oneKmDuration;
        if (j8 > 0) {
            this.oneKmPaceList.add(Long.valueOf(j8));
        }
        long j9 = this.oneMileDuration;
        if (j9 > 0) {
            this.oneMilePaceList.add(Long.valueOf(j9));
        }
        gpsTraining.setElevation(Float.valueOf((float) com.crrepa.band.my.training.utils.e.calculateElevation(this.altitudeList)));
        gpsTraining.setTwoSecondsAltitudeList(s.bean2Json(this.altitudeList));
        gpsTraining.setRealTimePaceList(s.bean2Json(this.realTimePaceList));
        gpsTraining.setOneKmPaceList(s.bean2Json(this.oneKmPaceList));
        gpsTraining.setOneMilePaceList(s.bean2Json(this.oneMilePaceList));
        if (this.trainingSteps > 0) {
            if (this.trainingSeconds % 60 != 0) {
                this.minuteStepsList.add(Integer.valueOf(this.currentMinutesSteps));
                this.minuteDistanceList.add(Float.valueOf(this.currentMinutesDistance));
            }
            gpsTraining.setAverageStepFrequency(Integer.valueOf(getAverageStepFrequency(this.minuteStepsList)));
            gpsTraining.setStepFrequencyList(s.bean2Json(this.minuteStepsList));
            gpsTraining.setAverageStepLength(Float.valueOf((float) (this.trainingDistance / this.trainingSteps)));
            List<Float> stepLengthList = getStepLengthList(this.minuteStepsList, this.minuteDistanceList);
            if (stepLengthList != null) {
                gpsTraining.setStepLengthList(s.bean2Json(stepLengthList));
            }
        }
        File close = this.trainingPathManager.close();
        if (close != null) {
            gpsTraining.setFilePath(close.getPath());
            gpsTraining.setEncrypt(Boolean.TRUE);
        }
        return gpsTraining;
    }

    private double getAddedDistance(int i8) {
        double userStepLengthCm = UserStepLengthProvider.getUserStepLengthCm() / 100.0d;
        if (this.trainingType == GpsTrainingModel.GpsTrainingType.INDOOR_RUNNING) {
            userStepLengthCm *= 1.2d;
        }
        return i8 * userStepLengthCm;
    }

    private int getAverageStepFrequency(List<Integer> list) {
        int i8 = 0;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        Iterator<Integer> it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i8 += it.next().intValue();
            i9++;
        }
        return i8 / i9;
    }

    private void getCurrentSteps() {
        Step step = StepsDaoProxy.getInstance().getStep(new Date());
        if (step != null) {
            this.previousTotalSteps = step.getSteps().intValue();
            this.previousCalories = step.getCalory().intValue();
        }
    }

    public static int getGoalPaceProgress(int i8, int i9) {
        float f8;
        if (i8 <= 0 || i8 >= i9 * 2) {
            f8 = 0.0f;
        } else {
            f8 = 0.5f;
            if (i8 != i9) {
                f8 = i8 > i9 ? 0.5f - ((i8 - i9) / (i9 * 2.0f)) : 0.5f + ((i9 - i8) / (i9 * 2.0f));
            }
        }
        return (int) (f8 * 100.0f);
    }

    private int getHeartRateLevelSeconds(Integer num, int i8) {
        if (num == null) {
            return 0;
        }
        return num.intValue() * i8;
    }

    private List<Float> getStepLengthList(List<Integer> list, List<Float> list2) {
        ArrayList arrayList = null;
        if (list != null && list2 != null) {
            if (list.size() != list2.size()) {
                return null;
            }
            arrayList = new ArrayList();
            for (int i8 = 0; i8 < list.size(); i8++) {
                if (list.get(i8).intValue() > 0) {
                    arrayList.add(Float.valueOf(list2.get(i8).floatValue() / r2.intValue()));
                } else {
                    arrayList.add(Float.valueOf(0.0f));
                }
            }
        }
        return arrayList;
    }

    public static String getTTSContent(Context context, Double d8) {
        float f8 = com.moyoung.dafit.module.common.network.provider.g.getInstance().getFloat(TrainingSettingActivity.KEY_DISTANCE_TIPS, 1.0f);
        String valueOf = String.valueOf(d8.intValue());
        if (f8 < 1.0f) {
            valueOf = n.format(d8.doubleValue());
        }
        Resources resources = context.getResources();
        if (u.isZH()) {
            return resources.getString(R.string.gps_map_voice_broadcast_per_kilometer_text_zh, valueOf, BandUnitSystemProvider.isImperialSystem() ? t.getStringByLocal(context, R.string.distance_unit_miles, "zh") : t.getStringByLocal(context, R.string.distance_unit_km, "zh"));
        }
        return resources.getString(R.string.gps_map_voice_broadcast_per_kilometer_text_en, valueOf, BandUnitSystemProvider.isImperialSystem() ? t.getStringByLocal(context, R.string.distance_unit_miles, "en") : t.getStringByLocal(context, R.string.distance_unit_km, "en"));
    }

    private boolean isWaitTrainingHeartRate() {
        return com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected() && 0 < this.trainingId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$waitTrainingHeartRate$0(Long l8) {
        com.orhanobut.logger.f.d("wait timeout!");
        showTrainingPath();
    }

    private void registerScreenReceive(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this.screenReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(this.screenReceiver, intentFilter);
        }
    }

    private void registerWakeLocationReceiver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(LOCATION_ALARM);
        ContextCompat.registerReceiver(context, this.wakeLocationReceiver, intentFilter, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLocation() {
        this.view.removeLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestLocation() {
        this.view.requestLocation();
    }

    private long saveTrainingMsg2DB(int i8) {
        if (((int) this.trainingDistance) <= 0 || 60 >= this.trainingSeconds) {
            return -1L;
        }
        return new GpsTrainingDaoProxy().insert(createGpsTraining(i8));
    }

    private void sendStartTrainingByType(GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        byte b8;
        switch (b.$SwitchMap$com$crrepa$band$my$model$GpsTrainingModel$GpsTrainingType[gpsTrainingType.ordinal()]) {
            case 1:
                b8 = 1;
                break;
            case 2:
                b8 = 0;
                break;
            case 3:
                b8 = 2;
                break;
            case 4:
                b8 = 20;
                break;
            case 5:
                b8 = 25;
                break;
            case 6:
                b8 = 27;
                break;
            case 7:
                b8 = 26;
                break;
            default:
                return;
        }
        com.orhanobut.logger.f.d("startTraining: " + ((int) b8));
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            if (!this.isNoTrainingVersion) {
                com.crrepa.band.my.ble.band.cmd.d.getInstance().startTraining(b8);
            } else if (b8 == 1) {
                com.crrepa.band.my.ble.band.cmd.d.getInstance().startTraining(b8);
            }
        }
    }

    private void setupPendingIntent(Context context) {
        new Intent().setAction(LOCATION_ALARM);
        if (Build.VERSION.SDK_INT < 31) {
            this.pendingIntent = PendingIntent.getBroadcast(context, 0, new Intent(), C.BUFFER_FLAG_FIRST_SAMPLE);
        } else {
            this.pendingIntent = PendingIntent.getBroadcast(context, 0, new Intent(), AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        }
        this.alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
    }

    private void showTrainingDistance(int i8) {
        this.view.renderDistance(this.imperialSystem ? u0.m2Miles(i8) : i8 / 1000.0d);
        this.view.renderAveragePace(com.crrepa.band.my.training.utils.c.calculateAveragePace((int) this.trainingDistance, this.trainingSeconds));
    }

    private void showTrainingPath() {
        cancelHeartRateSubscrube();
        this.view.renderGpsTraining(this.trainingId);
    }

    private void showTrainingSpeed(float f8) {
        float f9 = 0.0f;
        if (0.0f < f8) {
            f9 = 1000.0f / f8;
            if (this.imperialSystem) {
                f9 *= 1.6f;
            }
        }
        this.view.renderPace((int) f9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showTrainingTime() {
        int i8 = this.trainingSeconds + 1;
        this.trainingSeconds = i8;
        this.view.renderTime(i8);
    }

    private void unregisterScreenReceive(Context context) {
        context.unregisterReceiver(this.screenReceiver);
    }

    private void unregisterWakeLocationReceiver(Context context) {
        context.unregisterReceiver(this.wakeLocationReceiver);
    }

    private void updateSteps(int i8) {
        int i9 = this.trainingSteps + i8;
        this.trainingSteps = i9;
        this.currentMinutesSteps += i8;
        this.previousTotalSteps += i8;
        this.view.renderSteps(i9);
    }

    private void updateTrainingDataByPhoneSteps(int i8) {
        if (!this.startTraining || this.pauseTraining) {
            this.previousTotalSteps = i8;
            return;
        }
        int i9 = i8 - this.previousTotalSteps;
        updateSteps(i9);
        double addedDistance = getAddedDistance(i9);
        GpsTrainingModel.GpsTrainingType gpsTrainingType = this.trainingType;
        if (gpsTrainingType != null && !isMapMode(gpsTrainingType)) {
            updateTrainingDistance(addedDistance);
        }
        float userWeightKg = this.trainingCalories + ((float) ((UserWeightProvider.getUserWeightKg() * addedDistance) / 800.0d));
        this.trainingCalories = userWeightKg;
        this.view.renderCalories(userWeightKg);
    }

    private void updateTrainingDataByWatchSteps(Step step) {
        int intValue = step.getSteps().intValue();
        int intValue2 = step.getCalory().intValue();
        if (!this.startTraining || this.pauseTraining) {
            this.previousTotalSteps = intValue;
            this.previousCalories = intValue2;
            return;
        }
        if (intValue2 > this.previousCalories) {
            float f8 = this.trainingCalories + (intValue2 - r1);
            this.trainingCalories = f8;
            this.previousCalories = intValue2;
            this.view.renderCalories(f8);
        }
        int i8 = intValue - this.previousTotalSteps;
        updateSteps(i8);
        GpsTrainingModel.GpsTrainingType gpsTrainingType = this.trainingType;
        if (gpsTrainingType == null || isMapMode(gpsTrainingType)) {
            return;
        }
        updateTrainingDistance(getAddedDistance(i8));
    }

    private void updateTrainingDistance(double d8) {
        this.trainingDistance += d8;
        this.currentMinutesDistance = (float) (this.currentMinutesDistance + d8);
        this.tenSecondsDistance = (float) (this.tenSecondsDistance + d8);
        calculateMilesDuration();
        calculateKmDuration();
        showTrainingDistance((int) this.trainingDistance);
    }

    private void updateTrainingDistanceByGPS(double d8) {
        this.trainingDistance += d8;
        this.currentMinutesDistance = (float) (this.currentMinutesDistance + d8);
        this.tenSecondsDistance = (float) (this.tenSecondsDistance + d8);
        calculateMilesDuration();
        calculateKmDuration();
        showTrainingDistance((int) this.trainingDistance);
    }

    private void waitTrainingHeartRate() {
        this.heartRateSubscribe = Observable.timer(30L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.crrepa.band.my.training.presenter.d
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                f.this.lambda$waitTrainingHeartRate$0((Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"WakelockTimeout"})
    public void wakeLocation() {
        this.wakeLock.acquire();
        this.alarmManager.setRepeating(0, System.currentTimeMillis(), 60000L, this.pendingIntent);
    }

    public void addPausePoint() {
        this.trainingPathManager.writeLocation(new TrainingLocation(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, System.currentTimeMillis(), 0.0f));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        stopTimer();
        cancelHeartRateSubscrube();
        this.view = null;
    }

    public void drawRunPath(GpsLocation gpsLocation) {
        double d8;
        double d9;
        int i8;
        float accuracy = gpsLocation.getAccuracy();
        com.orhanobut.logger.f.d("定位精度：" + accuracy);
        this.view.renderLocationAccuracy(accuracy);
        if (!this.startTraining) {
            com.orhanobut.logger.f.d("未开始锻炼...");
            return;
        }
        this.locationCount++;
        if (this.pauseTraining) {
            com.orhanobut.logger.f.d("暂停中...");
            return;
        }
        float speed = gpsLocation.getSpeed();
        com.orhanobut.logger.f.d("速度：" + speed);
        showTrainingSpeed(speed);
        if (20.0f < accuracy) {
            addInValidLocation(gpsLocation.getTimestamp());
            return;
        }
        double latitude = gpsLocation.getLatitude();
        double longitude = gpsLocation.getLongitude();
        double altitude = gpsLocation.getAltitude();
        com.orhanobut.logger.f.d("latitude: " + latitude + ", longitude: " + longitude + ", altitude: " + altitude);
        double d10 = this.previousLatitude;
        if (latitude == d10 && longitude == this.previousLongitude) {
            com.orhanobut.logger.f.e("与上次经纬度一样！", new Object[0]);
            addInValidLocation(gpsLocation.getTimestamp());
            return;
        }
        double d11 = this.previousLongitude;
        if (d11 == -1.0d || d10 == -1.0d) {
            d8 = altitude;
            d9 = longitude;
            i8 = 0;
        } else {
            d8 = altitude;
            double calculateLineDistance = com.crrepa.band.my.training.utils.j.calculateLineDistance(d10, d11, latitude, longitude);
            com.orhanobut.logger.f.d("diatance: " + calculateLineDistance);
            com.orhanobut.logger.f.d("locationCount: " + this.locationCount);
            if (this.locationCount * 50 < calculateLineDistance) {
                com.orhanobut.logger.f.e("定位出现偏差，与上次定位距离过大！", new Object[0]);
                addInValidLocation(gpsLocation.getTimestamp());
                return;
            } else {
                com.orhanobut.logger.f.i("开始绘制运动轨迹", new Object[0]);
                d9 = longitude;
                i8 = 0;
                this.view.renderPathLine(this.previousLatitude, this.previousLongitude, latitude, d9);
                updateTrainingDistanceByGPS(calculateLineDistance);
            }
        }
        this.locationCount = i8;
        this.previousLatitude = latitude;
        this.previousLongitude = d9;
        this.trainingPathManager.writeLocation(new TrainingLocation(latitude, d9, d8, gpsLocation.getTimestamp(), speed));
        double d12 = this.prevAltitude;
        double d13 = d8;
        if (d12 == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || Math.abs(d13 - d12) < 4.0d) {
            this.prevAltitude = d13;
        }
    }

    public void getGpsState(Context context) {
        if (com.crrepa.band.my.training.utils.i.isEnable(context) || !this.startTraining) {
            return;
        }
        this.view.renderStop(true);
    }

    public boolean isMapMode(GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        return (gpsTrainingType == GpsTrainingModel.GpsTrainingType.INDOOR_RUNNING || gpsTrainingType == GpsTrainingModel.GpsTrainingType.INDOOR_WALKING) ? false : true;
    }

    public boolean isShowDistanceTips(double d8) {
        if (d8 == com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
            return false;
        }
        float f8 = com.moyoung.dafit.module.common.network.provider.g.getInstance().getFloat(TrainingSettingActivity.KEY_DISTANCE_TIPS, 1.0f);
        if (f8 == 0.5d) {
            d8 *= 2.0d;
            f8 *= 2.0f;
        }
        double floor = Math.floor(d8);
        double d9 = f8;
        if (floor < d9 || floor % d9 != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON || this.currentTipsDistance == floor) {
            return false;
        }
        this.currentTipsDistance = (int) floor;
        return true;
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandHeartRateChangeEvent(BandHeartRateChangeEvent bandHeartRateChangeEvent) {
        this.view.renderHeartRate(bandHeartRateChangeEvent.getHr());
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandMovementHeartRateChangeEvent(BandMovementHeartRateChangeEvent bandMovementHeartRateChangeEvent) {
        MovementHeartRate gpsTraining;
        if (this.trainingId == -1 || !this.trainingEnd || (gpsTraining = new MovementHeartRateDaoProxy().getGpsTraining(this.startDate.getTime(), this.trainingSeconds)) == null) {
            return;
        }
        GpsTrainingDaoProxy gpsTrainingDaoProxy = new GpsTrainingDaoProxy();
        GpsTraining gpsTraining2 = gpsTrainingDaoProxy.get(this.trainingId);
        if (gpsTraining2 != null) {
            gpsTraining2.setHrList(gpsTraining.getHeartRates());
            gpsTraining2.setHeartRate(gpsTraining.getAverage());
            gpsTraining2.setMinHr(gpsTraining.getMinHeartRate());
            gpsTraining2.setMaxHr(gpsTraining.getMaxHeartRate());
            int intValue = gpsTraining.getInterval() == null ? 60 : gpsTraining.getInterval().intValue();
            gpsTraining2.setLightSeconds(Integer.valueOf(getHeartRateLevelSeconds(gpsTraining.getLightCount(), intValue)));
            gpsTraining2.setWeightSeconds(Integer.valueOf(getHeartRateLevelSeconds(gpsTraining.getWightCount(), intValue)));
            gpsTraining2.setAerobicSeconds(Integer.valueOf(getHeartRateLevelSeconds(gpsTraining.getAerobicCount(), intValue)));
            gpsTraining2.setAnaerobicSeconds(Integer.valueOf(getHeartRateLevelSeconds(gpsTraining.getAnaerobicCount(), intValue)));
            gpsTraining2.setMaxSeconds(Integer.valueOf(getHeartRateLevelSeconds(gpsTraining.getMaxCount(), intValue)));
            gpsTraining2.setInterval(Integer.valueOf(intValue));
            if (x0.isNotEmpty(gpsTraining.getAltitudeListJson())) {
                String altitudeListJson = gpsTraining.getAltitudeListJson();
                Log.d("AltitudeListJson", "AltitudeListJson: " + altitudeListJson);
                gpsTraining2.setAltitudeListJson(altitudeListJson);
            }
            if (gpsTraining.getTrainingAdvancedInfoJson() != null) {
                String trainingAdvancedInfoJson = gpsTraining.getTrainingAdvancedInfoJson();
                Log.d("AdvancedInfoJson", "AdvancedInfoJson: " + trainingAdvancedInfoJson);
                gpsTraining2.setTrainingAdvancedInfoJson(trainingAdvancedInfoJson);
            }
            gpsTrainingDaoProxy.insert(gpsTraining2);
            if (Math.abs(gpsTraining.getStartTime().longValue() - gpsTraining2.getStartDate().getTime()) < 60000) {
                gpsTraining.setRepeated(Boolean.TRUE);
                new MovementHeartRateDaoProxy().save(gpsTraining);
            }
        }
        showTrainingPath();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandStepChangeEvent(BandStepChangeEvent bandStepChangeEvent) {
        if (this.isPhoneStepsCounter) {
            return;
        }
        updateTrainingDataByWatchSteps(bandStepChangeEvent.getStep());
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandTrainingStartedChangeEvent(BandTrainingStartedChangeEvent bandTrainingStartedChangeEvent) {
        c0 c0Var = this.view;
        if (c0Var != null) {
            c0Var.renderTrainStartedTips();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandTrainingStateChangeEvent(BandTrainingStateChangeEvent bandTrainingStateChangeEvent) {
        com.orhanobut.logger.f.d("onBandTrainingStateChangeEvent: " + bandTrainingStateChangeEvent.getState());
        int state = bandTrainingStateChangeEvent.getState();
        if (state == -3) {
            this.view.renderResume();
        } else if (state == -2) {
            this.view.renderPause();
        } else {
            if (state != -1) {
                return;
            }
            this.view.renderStop(false);
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onPhoneStepsChangeEvent(PhoneStepsChangeEvent phoneStepsChangeEvent) {
        updateTrainingDataByPhoneSteps(phoneStepsChangeEvent.getTotalSteps());
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void pauseTraining(boolean z7) {
        this.pauseTraining = true;
        if (z7) {
            if (!this.isNoTrainingVersion) {
                com.crrepa.band.my.ble.band.cmd.d.getInstance().setTrainingState((byte) -2);
            } else if (this.trainingType == GpsTrainingModel.GpsTrainingType.RUNNING) {
                com.crrepa.band.my.ble.band.cmd.d.getInstance().setTrainingState((byte) -2);
            }
        }
    }

    public void registerGpsStateChangeReceiver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.location.PROVIDERS_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this.gpsStateChangeReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(this.gpsStateChangeReceiver, intentFilter);
        }
    }

    public void registerTimerLocation(Context context) {
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, BaseMapTrainingActivity.class.getName());
        this.wakeLock = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        registerScreenReceive(context);
        registerWakeLocationReceiver(context);
        setupPendingIntent(context);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void resumeTraining(boolean z7) {
        this.pauseTraining = false;
        if (z7) {
            if (!this.isNoTrainingVersion) {
                com.crrepa.band.my.ble.band.cmd.d.getInstance().setTrainingState((byte) -3);
            } else if (this.trainingType == GpsTrainingModel.GpsTrainingType.RUNNING) {
                com.crrepa.band.my.ble.band.cmd.d.getInstance().setTrainingState((byte) -3);
            }
        }
    }

    public void setTrainingGoal(Context context, TrainingGoalType trainingGoalType, float f8) {
        String str;
        String str2;
        if (trainingGoalType == null) {
            str2 = this.imperialSystem ? context.getString(R.string.distance_unit_miles) : context.getString(R.string.distance_unit_km);
        } else {
            int i8 = b.$SwitchMap$com$crrepa$band$my$training$model$TrainingGoalType[trainingGoalType.ordinal()];
            if (i8 == 1) {
                str = f8 + (this.imperialSystem ? context.getString(R.string.distance_unit_miles) : context.getString(R.string.distance_unit_km));
            } else if (i8 == 2) {
                str = context.getString(R.string.training_time_format, n.format((int) (f8 / 60.0f), n.TWO_INTEGERS_PATTERN), n.format((int) (f8 % 60.0f), n.TWO_INTEGERS_PATTERN), n.format(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, n.TWO_INTEGERS_PATTERN));
            } else if (i8 == 3) {
                str = com.crrepa.band.my.training.utils.e.formatPace((int) f8, 0);
            } else if (i8 != 4) {
                str = null;
            } else {
                str = Float.valueOf(f8).intValue() + context.getString(R.string.calorie_unit);
            }
            str2 = "/" + str;
        }
        this.view.renderTrainingGoal(str2);
    }

    public void setTrainingWeather(int i8, int i9) {
        this.nowTemperature = i8;
        this.weatherCode = i9;
    }

    public void setView(c0 c0Var) {
        this.view = c0Var;
        for (String str : NO_TRAINING_VERSION_ARRAY) {
            if (str.equals(BandInfoManager.getFirmwareType())) {
                this.isNoTrainingVersion = true;
                return;
            }
        }
    }

    public void startTimer() {
        this.pauseTraining = false;
        a aVar = new a(new Handler());
        Timer timer = new Timer();
        this.trainingTimer = timer;
        timer.scheduleAtFixedRate(aVar, 0L, 1000L);
    }

    public void startTraining(GpsTrainingModel.GpsTrainingType gpsTrainingType) {
        this.trainingType = gpsTrainingType;
        this.startDate = new Date();
        if (isMapMode(gpsTrainingType)) {
            this.trainingPathManager.createFile(this.startDate);
        }
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
            getCurrentSteps();
        }
        this.startTraining = true;
        sendStartTrainingByType(gpsTrainingType);
    }

    public void stopTimer() {
        Timer timer = this.trainingTimer;
        if (timer != null) {
            timer.cancel();
            this.trainingTimer = null;
        }
    }

    public void stopTraining(int i8, boolean z7) {
        com.orhanobut.logger.f.d("stopTraining: " + this.trainingEnd);
        if (this.trainingEnd) {
            return;
        }
        this.trainingEnd = true;
        this.pauseTraining = true;
        this.trainingId = saveTrainingMsg2DB(i8);
        if (z7) {
            if (!this.isNoTrainingVersion) {
                com.crrepa.band.my.ble.band.cmd.d.getInstance().setTrainingState((byte) -1);
            } else if (this.trainingType == GpsTrainingModel.GpsTrainingType.RUNNING) {
                com.crrepa.band.my.ble.band.cmd.d.getInstance().setTrainingState((byte) -1);
            }
        }
        if (!isWaitTrainingHeartRate()) {
            showTrainingPath();
        } else {
            this.view.renderLoadingHeartRate();
            waitTrainingHeartRate();
        }
    }

    public void unregisterGpsStateChangeReceiver(Context context) {
        context.unregisterReceiver(this.gpsStateChangeReceiver);
    }

    public void unregisterTimerLocation(Context context) {
        unregisterWakeLocationReceiver(context);
        unregisterScreenReceive(context);
    }

    public void stopTraining() {
        if (com.github.mikephil.charting.utils.i.DOUBLE_EPSILON < this.trainingDistance && this.trainingSeconds > 60) {
            this.view.renderStop(true);
        } else {
            this.view.renderTrainingTimeLessDialog();
        }
    }
}
