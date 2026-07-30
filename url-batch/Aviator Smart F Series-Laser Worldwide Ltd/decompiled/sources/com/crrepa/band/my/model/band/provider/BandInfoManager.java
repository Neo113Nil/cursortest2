package com.crrepa.band.my.model.band.provider;

import com.crrepa.band.my.model.storage.BaseParamNames;
import com.crrepa.ble.conn.bean.CRPDeviceInfo;
import com.moyoung.dafit.module.common.network.provider.g;

/* loaded from: classes2.dex */
public class BandInfoManager {
    private static String get(String str) {
        return g.getInstance().getString(str, "");
    }

    public static String getAddress() {
        return get(BaseParamNames.BAND_MAC_ADDRESS);
    }

    public static String getFirmwareType() {
        return get(BaseParamNames.BAND_FIRMWARE_TYPE);
    }

    public static String getFirmwareVersion() {
        return get(BaseParamNames.BAND_FIRMWARE_VERSION);
    }

    public static int getFunction() {
        return g.getInstance().getInt(BaseParamNames.BAND_FUNCTION, 0);
    }

    public static String getIgnoreFirmwareVersion() {
        return get(BaseParamNames.BAND_IGNORE_FIRMWARE_VERSION);
    }

    public static int getMcuChipId() {
        return g.getInstance().getInt(BaseParamNames.BAND_MCU_CHIPID, 0);
    }

    public static int getMcuPlatform() {
        return g.getInstance().getInt(BaseParamNames.BAND_MCU_PLATFORM, 0);
    }

    public static String getName() {
        return get(BaseParamNames.BAND_CROADCAST_NAME);
    }

    public static void removeBand() {
        g gVar = g.getInstance();
        gVar.remove(BaseParamNames.BAND_MAC_ADDRESS);
        gVar.remove(BaseParamNames.BAND_CROADCAST_NAME);
        gVar.remove(BaseParamNames.BAND_FIRMWARE_VERSION);
        gVar.remove(BaseParamNames.BAND_FIRMWARE_TYPE);
        gVar.remove(BaseParamNames.BAND_FUNCTION);
    }

    public static void saveBand(String str, String str2) {
        set(BaseParamNames.BAND_MAC_ADDRESS, str2);
        set(BaseParamNames.BAND_CROADCAST_NAME, str);
    }

    public static void saveBandInfo(CRPDeviceInfo cRPDeviceInfo) {
        saveFirmwareType(cRPDeviceInfo.getFirmwareType());
        saveFunction(cRPDeviceInfo.getFeature());
        saveMcuPlatform(cRPDeviceInfo.getMcuPlatform());
        saveMcuChipId(cRPDeviceInfo.getChipId());
    }

    public static void saveFirmwareType(String str) {
        set(BaseParamNames.BAND_FIRMWARE_TYPE, str);
    }

    public static void saveFirmwareVersion(String str) {
        set(BaseParamNames.BAND_FIRMWARE_VERSION, str);
    }

    public static void saveFunction(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_FUNCTION, i8);
    }

    public static void saveIgnoreFirmwareVersion(String str) {
        set(BaseParamNames.BAND_IGNORE_FIRMWARE_VERSION, str);
    }

    public static void saveMcuChipId(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_MCU_CHIPID, i8);
    }

    public static void saveMcuPlatform(int i8) {
        g.getInstance().putInt(BaseParamNames.BAND_MCU_PLATFORM, i8);
    }

    private static void set(String str, String str2) {
        g.getInstance().putString(str, str2);
    }
}
