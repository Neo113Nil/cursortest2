package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandQuickViewTimeProvider {
    private BandQuickViewTimeProvider() {
    }

    public static int getQuickViewEndHour() {
        return g.getInstance().getInt(BaseParamNames.BAND_QUICK_VIEW_END_HOUR, 0);
    }

    public static int getQuickViewEndMinute() {
        return g.getInstance().getInt(BaseParamNames.BAND_QUICK_VIEW_END_MINUTE, 0);
    }

    public static int getQuickViewStartHour() {
        return g.getInstance().getInt(BaseParamNames.BAND_QUICK_VIEW_START_HOUR, 0);
    }

    public static int getQuickViewStartMinute() {
        return g.getInstance().getInt(BaseParamNames.BAND_QUICK_VIEW_START_MINUTE, 0);
    }

    public static void saveQuickViewEndHour(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_QUICK_VIEW_END_HOUR, i8);
    }

    public static void saveQuickViewEndMinute(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_QUICK_VIEW_END_MINUTE, i8);
    }

    public static void saveQuickViewStartHour(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_QUICK_VIEW_START_HOUR, i8);
    }

    public static void saveQuickViewStartMinute(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_QUICK_VIEW_START_MINUTE, i8);
    }
}
