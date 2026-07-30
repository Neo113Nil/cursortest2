package com.crrepa.band.my.device.worldclock.model;

import android.util.Log;
import com.crrepa.band.my.model.WorldClockModel;
import com.crrepa.band.my.model.db.WorldClock;
import com.crrepa.ble.conn.bean.CRPWorldClockInfo;
import com.moyoung.dafit.module.common.utils.m;
import com.moyoung.dafit.module.common.utils.t;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class WorldClockConvert {
    public static CRPWorldClockInfo convertCRPWorldClock(WorldClock worldClock) {
        CRPWorldClockInfo cRPWorldClockInfo = new CRPWorldClockInfo();
        cRPWorldClockInfo.setId(worldClock.getClockId().byteValue());
        cRPWorldClockInfo.setCity(removeParentheses(t.getStringResourceByName(worldClock.getCityKey())));
        cRPWorldClockInfo.setLatitude(worldClock.getLatitude().doubleValue());
        cRPWorldClockInfo.setLongitude(worldClock.getLongitude().doubleValue());
        cRPWorldClockInfo.setJetLag(worldClock.getJetLag().intValue());
        cRPWorldClockInfo.setTimeZone(worldClock.getTimeZone().intValue());
        return cRPWorldClockInfo;
    }

    public static WorldClock convertWorldClock(WorldClockModel worldClockModel) {
        WorldClock worldClock = new WorldClock();
        worldClock.setCityKey(worldClockModel.getKeyName());
        worldClock.setLatitude(Double.valueOf(worldClockModel.getLatitude()));
        worldClock.setLongitude(Double.valueOf(worldClockModel.getLongitude()));
        worldClock.setJetLag(Integer.valueOf(getJetLag(worldClockModel.getSeconds())));
        worldClock.setTimeZone(Integer.valueOf(worldClockModel.getSeconds()));
        worldClock.setTimeZoneIdentifier(worldClockModel.getTimeIdentifier());
        return worldClock;
    }

    public static int getJetLag(int i8) {
        return ((int) ((m.getGMTTimeInMillis() + (i8 * 1000)) - System.currentTimeMillis())) / 1000;
    }

    public static long getOffsetTimeInMillis(int i8) {
        long gMTTimeInMillis = m.getGMTTimeInMillis() + (i8 * 1000);
        Log.e("WorldClockLog", "UTC Interval：" + i8 + ". TimeResult：" + gMTTimeInMillis);
        return gMTTimeInMillis;
    }

    public static String removeParentheses(String str) {
        Matcher matcher = Pattern.compile("\\(.*\\)*|（.*）*|,.*+").matcher(str);
        while (matcher.find()) {
            str = str.replace(matcher.group(), "");
        }
        return str;
    }
}
