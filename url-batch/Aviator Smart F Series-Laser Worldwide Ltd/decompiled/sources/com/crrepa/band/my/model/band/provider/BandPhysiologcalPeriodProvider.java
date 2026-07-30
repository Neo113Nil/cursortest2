package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.bean.CRPPhysiologcalPeriodInfo;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.m;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class BandPhysiologcalPeriodProvider {
    private static final String PHYSIOLOGCAL_SUPPORT_ACROSS_YEARS = "PHYSIOLOGCAL_SUPPORT_ACROSS_YEARS";

    private BandPhysiologcalPeriodProvider() {
    }

    public static void delete() {
        g.getInstance().remove(BaseParamNames.SUPPORT_PHYSIOLOGCAL_PERIOD);
        g.getInstance().remove(PHYSIOLOGCAL_SUPPORT_ACROSS_YEARS);
    }

    public static CRPPhysiologcalPeriodInfo getNewMenstrualDate(CRPPhysiologcalPeriodInfo cRPPhysiologcalPeriodInfo) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int i8 = calendar.get(1);
        Date startDate = cRPPhysiologcalPeriodInfo.getStartDate();
        int physiologcalPeriod = cRPPhysiologcalPeriodInfo.getPhysiologcalPeriod();
        calendar.setTime(startDate);
        if (calendar.get(1) < i8) {
            calendar.setTime(date);
            calendar.set(i8, 0, 1);
            int daySpace = m.getDaySpace(startDate, calendar.getTime());
            int i9 = daySpace / physiologcalPeriod;
            if (daySpace % physiologcalPeriod > 0) {
                i9++;
            }
            calendar.setTime(startDate);
            calendar.add(6, i9 * physiologcalPeriod);
            Date time = calendar.getTime();
            if (m.getDaySpace(time, date) >= 0) {
                cRPPhysiologcalPeriodInfo.setStartDate(time);
            }
        }
        return cRPPhysiologcalPeriodInfo;
    }

    public static boolean isAcrossYears() {
        return g.getInstance().getBoolean(PHYSIOLOGCAL_SUPPORT_ACROSS_YEARS, true);
    }

    public static boolean isSupportPhysiologcalPeriod() {
        return g.getInstance().getBoolean(BaseParamNames.SUPPORT_PHYSIOLOGCAL_PERIOD, false);
    }

    public static void saveAcrossYears(boolean z7) {
        g.getInstance().putBoolean(PHYSIOLOGCAL_SUPPORT_ACROSS_YEARS, z7);
    }

    public static void savePhysiologcalPeriodState(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.PHYSIOLOGCAL_STATE, z7);
    }

    public static void saveSupportPhysiologcalPeriod(boolean z7) {
        g.getInstance().putBoolean(BaseParamNames.SUPPORT_PHYSIOLOGCAL_PERIOD, z7);
    }

    public static boolean showPhysiologcalPeriod() {
        return g.getInstance().getBoolean(BaseParamNames.PHYSIOLOGCAL_STATE, true);
    }
}
