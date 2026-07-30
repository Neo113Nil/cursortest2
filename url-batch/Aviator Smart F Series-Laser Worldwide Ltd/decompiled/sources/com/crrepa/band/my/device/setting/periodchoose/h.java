package com.crrepa.band.my.device.setting.periodchoose;

/* loaded from: classes2.dex */
public interface h {
    public static final int DO_NOT_DISTURB = 1;
    public static final int END_TIME_TYPE = 18;
    public static final int QUICK_VIEW = 2;
    public static final int START_TIME_TYPE = 17;

    void hideDoNotDistrubHint();

    void quickViewPeriodCrossDays();

    void renderEndTime(int i8, int i9);

    void renderStartTime(int i8, int i9);

    void saveFail();

    void saveSuccess();
}
