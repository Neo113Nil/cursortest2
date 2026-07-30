package com.crrepa.band.my.training.map;

/* loaded from: classes3.dex */
public interface c0 {
    public static final String MAPVIEW_BUNDLE_KEY = "MapViewBundleKey";

    void removeLocation();

    void renderAveragePace(int i8);

    void renderCalories(float f8);

    void renderDistance(double d8);

    void renderGpsTraining(long j8);

    void renderHeartRate(int i8);

    void renderLoadingHeartRate();

    void renderLocationAccuracy(float f8);

    void renderMapCamera();

    void renderPace(int i8);

    void renderPathLine(double d8, double d9, double d10, double d11);

    void renderPause();

    void renderResume();

    void renderSteps(int i8);

    void renderStop(boolean z7);

    void renderTime(int i8);

    void renderTrainStartedTips();

    void renderTrainingGoal(String str);

    void renderTrainingTimeLessDialog();

    void requestLocation();
}
