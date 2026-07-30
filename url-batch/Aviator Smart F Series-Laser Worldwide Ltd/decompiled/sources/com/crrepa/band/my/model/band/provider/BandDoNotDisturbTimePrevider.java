package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandDoNotDisturbTimePrevider {
    private BandDoNotDisturbTimePrevider() {
    }

    public static int getDoNotDistrubEndHour() {
        return g.getInstance().getInt(BaseParamNames.BAND_DO_NOT_DISTYRB_END_HOUR, 0);
    }

    public static int getDoNotDistrubEndMinute() {
        return g.getInstance().getInt(BaseParamNames.BAND_DO_NOT_DISTYRB_END_MINUTE, 0);
    }

    public static int getDoNotDistrubStartHour() {
        return g.getInstance().getInt(BaseParamNames.BAND_DO_NOT_DISTYRB_START_HOUR, 0);
    }

    public static int getDoNotDistrubStartMinute() {
        return g.getInstance().getInt(BaseParamNames.BAND_DO_NOT_DISTYRB_START_MINUTE, 0);
    }

    public static void saveDoNotDistrubEndHour(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_DO_NOT_DISTYRB_END_HOUR, i8);
    }

    public static void saveDoNotDistrubEndMinute(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_DO_NOT_DISTYRB_END_MINUTE, i8);
    }

    public static void saveDoNotDistrubStartHour(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_DO_NOT_DISTYRB_START_HOUR, i8);
    }

    public static void saveDoNotDistrubStartMinute(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_DO_NOT_DISTYRB_START_MINUTE, i8);
    }
}
