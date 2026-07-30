package com.crrepa.band.my.ble.band.utils;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.crrepa.band.my.device.watchfacenew.delegate.img.m;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.CustomizeBandModel;
import com.crrepa.band.my.model.band.provider.BandDisplayWatchFaceProvider;
import com.crrepa.band.my.model.band.provider.BandNotificationListProvider;
import com.crrepa.band.my.model.band.provider.BandTimingHeartRateProvider;
import com.crrepa.band.my.model.band.provider.BandTimingTempProvider;
import com.crrepa.ble.conn.type.CRPEcgMeasureType;
import com.crrepa.ble.scan.bean.CRPScanRecordInfo;
import com.moyoung.dafit.module.common.utils.u;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class a {
    private static final String ALLURIONT = "AllurionT";
    private static final String CCZ = "CCZ";
    private static final String GFX = "GFX";
    private static final String GKB = "GKB";
    private static final String GMH = "GMH";
    private static final String GOW = "GOW";
    private static final String GSZ = "GSZ";
    private static final String KHL = "KHL";
    private static final int MESSAGE_KAKAOTALK = 10;
    private static final int MESSAGE_LINE = 9;
    private static final String OLV = "OLV";
    private static final String OTM = "OTM";
    private static final String OTY = "OTY";
    private static final String RRO = "RRO";
    private static final int TI_ECG = 2;
    private static final String TKG = "TKG";
    private static final String TMG = "TMG";
    private static final int TYHX_ECG = 1;
    private static final String TZP = "TZP";
    private List<Integer> notificationList;
    private final AtomicReference<BaseBandModel> reference;

    private static class b {
        private static a INSTANCE = new a();

        private b() {
        }
    }

    public static a getInstance() {
        return b.INSTANCE;
    }

    public String getAddress() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return null;
        }
        return connectBand.getAddress();
    }

    @NonNull
    public String getBandWatchFaceDownloadUrl(String str) {
        BaseBandModel connectBand = getConnectBand();
        return w1.a.getWatchFaceUrl(str, connectBand != null ? connectBand.getScreenSize() : null);
    }

    public File getBandWatchFaceFile(int i8) {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand != null && (connectBand instanceof CustomizeBandModel)) {
            return ((CustomizeBandModel) connectBand).getBandWatchFaceFile(i8);
        }
        return null;
    }

    public BaseBandModel getConnectBand() {
        BaseBandModel baseBandModel = this.reference.get();
        if (baseBandModel != null) {
            return baseBandModel;
        }
        BaseBandModel boundBand = new com.crrepa.band.my.ble.band.config.e().getBoundBand();
        updateConnectBand(boundBand);
        return boundBand;
    }

    public File getCustomizeWatchFaceFile(int i8) {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return null;
        }
        return new File(com.crrepa.band.my.a.getCustomizeWatchFacePath(connectBand.getBroadcastName(), i8));
    }

    public int getDownloadWatchFaceCount() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return 0;
        }
        int watchFaceCount = connectBand.getWatchFaceCount();
        if (isJieli() && watchFaceCount <= 1) {
            watchFaceCount = BandDisplayWatchFaceProvider.getJieliDownloadWatchFaceCount();
        }
        com.orhanobut.logger.f.d("count: " + watchFaceCount);
        return watchFaceCount;
    }

    public CRPEcgMeasureType getEcgType() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return null;
        }
        int ecgType = connectBand.getEcgType();
        if (ecgType == 1) {
            return CRPEcgMeasureType.TYHX;
        }
        if (ecgType != 2) {
            return null;
        }
        return CRPEcgMeasureType.TI;
    }

    public String getFirmwareType() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return null;
        }
        String bandFirmwareType = connectBand.getBandFirmwareType();
        return TextUtils.isEmpty(bandFirmwareType) ? getName() : bandFirmwareType;
    }

    public String getFirmwareVersion() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return null;
        }
        return connectBand.getFirmwareVersion();
    }

    public CRPScanRecordInfo.McuPlatform getMcuPlatform() {
        if (isSifli()) {
            return CRPScanRecordInfo.McuPlatform.PLATFORM_SIFLI;
        }
        if (isJieli() || isHisilicon()) {
            return CRPScanRecordInfo.McuPlatform.PLATFORM_JIELI;
        }
        return null;
    }

    public String getName() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return null;
        }
        return connectBand.getBroadcastName();
    }

    public boolean has24HourHeartRate() {
        if (getConnectBand() == null) {
            return false;
        }
        return getConnectBand().has24HoursHeartRate();
    }

    public boolean hasARGB() {
        return m.hasPhotoWatchFaceAvailableSize();
    }

    public boolean hasCamera() {
        if (getConnectBand() == null) {
            return false;
        }
        return !TextUtils.equals(ALLURIONT, getName());
    }

    public boolean hasECG() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.hasEcg();
    }

    public boolean hasEmail() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return TextUtils.equals(connectBand.getBandName(), "ENDURE") || hasMessage(11);
    }

    public boolean hasGmail() {
        if (getConnectBand() == null) {
            return false;
        }
        return hasMessage(17);
    }

    public boolean hasItalianAndPortuguese() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.hasItalianAndPortuguese();
    }

    public boolean hasKakao() {
        if (this.notificationList == null) {
            this.notificationList = BandNotificationListProvider.getNotificationList();
        }
        List<Integer> list = this.notificationList;
        if (list != null && !list.isEmpty()) {
            return this.notificationList.contains(10);
        }
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.hasLineAndKakaoMessage();
    }

    public boolean hasLine() {
        if (this.notificationList == null) {
            this.notificationList = BandNotificationListProvider.getNotificationList();
        }
        List<Integer> list = this.notificationList;
        if (list != null && !list.isEmpty()) {
            return this.notificationList.contains(9);
        }
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.hasLineAndKakaoMessage();
    }

    public boolean hasMessage(int i8) {
        if (this.notificationList == null) {
            this.notificationList = BandNotificationListProvider.getNotificationList();
        }
        List<Integer> list = this.notificationList;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return this.notificationList.contains(Integer.valueOf(i8));
    }

    public boolean hasMessenger() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return TextUtils.equals(connectBand.getBandName(), "ENDURE") || hasMessage(12);
    }

    public boolean hasMovementHeartRate() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.hasMovementHeartRate();
    }

    public boolean hasNateOn() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        String firmwareVersion = connectBand.getFirmwareVersion();
        if (TextUtils.isEmpty(firmwareVersion)) {
            return false;
        }
        String upperCase = firmwareVersion.toUpperCase();
        return upperCase.contains(GFX) || upperCase.contains(GOW) || upperCase.contains(CCZ) || upperCase.contains(KHL) || hasMessage(16);
    }

    public boolean hasPhone() {
        if (this.notificationList == null) {
            this.notificationList = BandNotificationListProvider.getNotificationList();
        }
        List<Integer> list = this.notificationList;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return this.notificationList.contains(0);
    }

    public boolean hasQQ() {
        if (this.notificationList == null) {
            this.notificationList = BandNotificationListProvider.getNotificationList();
        }
        List<Integer> list = this.notificationList;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return this.notificationList.contains(3);
    }

    public boolean hasSMS() {
        if (this.notificationList == null) {
            this.notificationList = BandNotificationListProvider.getNotificationList();
        }
        List<Integer> list = this.notificationList;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return this.notificationList.contains(1);
    }

    public boolean hasSleep() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        if (TextUtils.isEmpty(connectBand.getFirmwareType())) {
            return false;
        }
        return !r0.toUpperCase().contains(RRO);
    }

    public boolean hasTelegram() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        String firmwareVersion = connectBand.getFirmwareVersion();
        if (TextUtils.isEmpty(firmwareVersion)) {
            return false;
        }
        String upperCase = firmwareVersion.toUpperCase();
        return upperCase.contains(TMG) || upperCase.contains(GMH) || upperCase.contains(GFX) || upperCase.contains(GOW) || upperCase.contains(GKB) || upperCase.contains(TKG) || upperCase.contains(TZP) || upperCase.contains(KHL) || upperCase.contains(CCZ) || upperCase.contains(OTM) || upperCase.contains(OTY) || upperCase.contains(OLV) || hasMessage(14);
    }

    public boolean hasTemp() {
        if (getConnectBand() == null) {
            return false;
        }
        return BandTimingTempProvider.hasTemp();
    }

    public boolean hasTimingHeartRate() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        String firmwareType = connectBand.getFirmwareType();
        return (TextUtils.isEmpty(firmwareType) || !BandTimingHeartRateProvider.hasTimingHeartRate() || TextUtils.equals(GSZ, firmwareType)) ? false : true;
    }

    public boolean hasTimingTemp() {
        if (getConnectBand() == null) {
            return false;
        }
        return BandTimingTempProvider.hasTimingTemp();
    }

    public boolean hasUkrainian() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.hasUkrainian();
    }

    public boolean hasViber() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        String firmwareVersion = connectBand.getFirmwareVersion();
        if (TextUtils.isEmpty(firmwareVersion)) {
            return false;
        }
        String upperCase = firmwareVersion.toUpperCase();
        return upperCase.contains(GMH) || upperCase.contains(GKB) || upperCase.contains(TKG) || upperCase.contains(TZP) || upperCase.contains(OTM) || upperCase.contains(OTY) || upperCase.contains(OLV) || hasMessage(15);
    }

    public boolean hasWatchFaceStore() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.hasWatchFaceStore();
    }

    public boolean hasWechat() {
        if (this.notificationList == null) {
            this.notificationList = BandNotificationListProvider.getNotificationList();
        }
        List<Integer> list = this.notificationList;
        if (list == null || list.isEmpty()) {
            return true;
        }
        return this.notificationList.contains(2);
    }

    public boolean isBluetrum() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isBluetrum();
    }

    public boolean isBond() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isBond();
    }

    public boolean isChinese() {
        boolean isSimplified = u.isSimplified();
        BaseBandModel connectBand = getConnectBand();
        return connectBand == null ? isSimplified : !connectBand.hasTraditional() ? u.isZH() : isSimplified;
    }

    public boolean isCircleScreen() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isCircleScreen();
    }

    public boolean isGoodix() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isGoodix();
    }

    public boolean isHSA4() {
        BaseBandModel connectBand = getConnectBand();
        return connectBand != null && connectBand.getMcu() == 8;
    }

    public boolean isHisilicon() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isHisilicon();
    }

    public boolean isJieli() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isJieli();
    }

    public boolean isJieli707() {
        return com.crrepa.band.my.device.watchfacenew.delegate.pointerstyle.e.isJieli707Platform();
    }

    public boolean isLyric() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isLyric();
    }

    public boolean isMultipleDownloadWatchFace() {
        return 1 < getDownloadWatchFaceCount();
    }

    public boolean isNewWatchFace() {
        return isJieli() || isBluetrum() || isRealtek8773();
    }

    public boolean isRealtek() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isRealTek();
    }

    public boolean isRealtek8773() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isRealTek8773();
    }

    public boolean isReset() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isHsMcu() || connectBand.getMcu() <= 3;
    }

    public boolean isRoundedRectangleScreen() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isRoundedRectangleScreen();
    }

    public boolean isScanAndCodeBond() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isScanAndCodeBond();
    }

    public boolean isSifli() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isSifli();
    }

    public boolean isTalkBand() {
        BaseBandModel connectBand = getConnectBand();
        if (connectBand == null) {
            return false;
        }
        return connectBand.isTalkBand();
    }

    public void updateConnectBand(BaseBandModel baseBandModel) {
        this.reference.set(baseBandModel);
        if (baseBandModel == null) {
            this.notificationList = null;
        }
    }

    private a() {
        this.reference = new AtomicReference<>();
    }
}
