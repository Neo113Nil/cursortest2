package com.crrepa.band.my.model.band;

import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.util.BandFirmwareUtils;
import com.crrepa.band.my.model.db.Language;
import com.crrepa.band.my.model.db.proxy.LanguageDaoProxy;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.o;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class BaseBandModel {
    protected static final int BAND_WATCH_FACE_RECTANGLE_HEIGHT = 240;
    protected static final int BAND_WATCH_FACE_RECTANGLE_WIDTH = 120;
    protected static final int BAND_WATCH_FACE_SQUARE_SIZE = 240;
    protected static final int CUSTIMIZE_WATCH_FACE_CODE = 165;
    protected static final int CUSTOM_FUNCTION_CODE = 145;
    private static final int DEFAULT_VERSION_CODE = 172;
    private static final int DO_NOT_DISTRUB_CODE = 160;
    protected static final int FILLET_RADIUS = 19;
    protected static final int LARGE_FILLET_RADIUS = 15;
    private static final int LINE_AND_KAKAO_MESSAGE_CODE = 161;
    private static final int MEASUREMENT_SYSTEM_CODE = 168;
    private static final int PORTUGUESE_AND_ITALIAN_CODE = 171;
    private static final int QUICK_VIEW_PERIOD_CODE = 160;
    private static final int RESET_CODE = 176;
    protected static final int SMALL_FILLET_RADIUS = 10;
    private static final int SUPPORT_CONFIG_LANGUAGE_CODE = 172;
    private static final int THUM_FILLET_RADIUS = 25;
    protected static final int THUM_LARGE_FILLET_RADIUS = 38;
    protected static final int THUM_SMALL_FILLET_RADIUS = 14;
    private static final int TRADITIONAL_CODE = 159;
    private static final int TRAINING_HEART_RATE_CODE = 160;
    private static final int UKRAINIAN_CODE = 162;
    private static final int WEATHER_TEMP_SYSTEM_CODE = 166;
    private String address;
    private String bandFirmwareType;
    private String broadcastName;
    private String firmwareVersion;
    private int function;
    private int mcuChipId;
    private int mcuPlatform;
    private int rssi;

    public BaseBandModel(String str, String str2) {
        this.broadcastName = str;
        this.address = str2;
    }

    public void downAllWatchFace() {
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof BaseBandModel)) {
            return TextUtils.equals(getAddress(), ((BaseBandModel) obj).getAddress());
        }
        return false;
    }

    public String getAddress() {
        return this.address;
    }

    public String getBandFirmwareType() {
        return this.bandFirmwareType;
    }

    public abstract String getBandName();

    public String getBroadcastName() {
        return this.broadcastName;
    }

    public int getCustomizeWatchFaceIndex() {
        return -1;
    }

    public int getEcgType() {
        return 0;
    }

    public String getFirmwareType() {
        String firmwareType = BandFirmwareUtils.getFirmwareType(getFirmwareVersion());
        return TextUtils.isEmpty(firmwareType) ? BandInfoManager.getFirmwareType() : firmwareType;
    }

    public String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public int getFirmwareVersionCode() {
        int firmwareVersionCode = BandFirmwareUtils.getFirmwareVersionCode(getFirmwareVersion());
        return firmwareVersionCode == 0 ? TsExtractor.TS_STREAM_TYPE_AC4 : firmwareVersionCode;
    }

    public int getFunction() {
        return this.function;
    }

    public int getMcu() {
        return 3;
    }

    public int getMcuChipId() {
        return this.mcuChipId;
    }

    public int getMcuPlatform() {
        return this.mcuPlatform;
    }

    public int getMovementHeartRateMode() {
        return 0;
    }

    public int getRoundedRadius() {
        return o.dp2px(d.get(), 19.0f);
    }

    public int getRssi() {
        return this.rssi;
    }

    public ScreenSize getScreenSize() {
        return new ScreenSize(240, 240);
    }

    public List<Language> getSupportLanguageList() {
        List<Language> all = new LanguageDaoProxy().getAll();
        if (all == null || all.size() < 9) {
            return null;
        }
        return all.subList(0, 9);
    }

    public int getThumFilletRadius() {
        return 25;
    }

    public List<Integer> getWatchFaceConfigList() {
        return null;
    }

    public int getWatchFaceCount() {
        return 0;
    }

    public abstract int getWechatPid();

    public boolean has24HoursHeartRate() {
        return false;
    }

    public abstract boolean hasBloodOxygen();

    public abstract boolean hasBloodPressure();

    public boolean hasConfigLanguage() {
        return 172 <= getFirmwareVersionCode();
    }

    public boolean hasCustomFunction() {
        return false;
    }

    public boolean hasDoNotDistrubPeriod() {
        return getFirmwareVersionCode() >= 160;
    }

    public boolean hasDrinkWaterReminder() {
        return true;
    }

    public abstract boolean hasDynamicHeartRate();

    public boolean hasEcg() {
        return false;
    }

    public boolean hasGuide() {
        return true;
    }

    public boolean hasItalianAndPortuguese() {
        return PORTUGUESE_AND_ITALIAN_CODE <= getFirmwareVersionCode();
    }

    public boolean hasLineAndKakaoMessage() {
        return getFirmwareVersionCode() >= 161;
    }

    public boolean hasMovementHeartRate() {
        return false;
    }

    public boolean hasOnceHeartRate() {
        return false;
    }

    public boolean hasQuickViewPeriod() {
        return getFirmwareVersionCode() >= 160;
    }

    public boolean hasReset() {
        return 176 < getFirmwareVersionCode();
    }

    public boolean hasShutter() {
        return true;
    }

    public boolean hasTraditional() {
        return getFirmwareVersionCode() >= TRADITIONAL_CODE;
    }

    public boolean hasTrainingHeartRate() {
        return 160 <= getFirmwareVersionCode();
    }

    public boolean hasUkrainian() {
        return 162 <= getFirmwareVersionCode();
    }

    public boolean hasUnitSystem() {
        return MEASUREMENT_SYSTEM_CODE <= getFirmwareVersionCode();
    }

    public boolean hasWatchFace() {
        return true;
    }

    public boolean hasWatchFaceStore() {
        return false;
    }

    public boolean hasWeather() {
        return true;
    }

    public boolean hasWeatherTempSystem() {
        return WEATHER_TEMP_SYSTEM_CODE <= getFirmwareVersionCode();
    }

    public int hashCode() {
        return getAddress().hashCode();
    }

    public boolean isBluetrum() {
        return false;
    }

    public boolean isBond() {
        return false;
    }

    public boolean isCircleScreen() {
        return false;
    }

    public boolean isGoodix() {
        return false;
    }

    public boolean isHisilicon() {
        return false;
    }

    public boolean isHsMcu() {
        return false;
    }

    public boolean isJieli() {
        return false;
    }

    public boolean isLyric() {
        return false;
    }

    public boolean isRealTek() {
        return false;
    }

    public boolean isRealTek8773() {
        return false;
    }

    public boolean isRectangleScreen() {
        return true;
    }

    public boolean isRoundedRectangleScreen() {
        return false;
    }

    public boolean isScanAndCodeBond() {
        return false;
    }

    public boolean isSifli() {
        return false;
    }

    public boolean isTalkBand() {
        return false;
    }

    public abstract void loadAllBandWatchFace(ImageView... imageViewArr);

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBandFirmwareType(String str) {
        this.bandFirmwareType = str;
    }

    public abstract void setBandSnapshot(ImageView imageView);

    public void setBroadcastName(String str) {
        this.broadcastName = str;
    }

    public void setFirmwareVersion(String str) {
        this.firmwareVersion = str;
    }

    public void setFunction(int i8) {
        this.function = i8;
    }

    public void setMcuChipId(int i8) {
        this.mcuChipId = i8;
    }

    public void setMcuPlatform(int i8) {
        this.mcuPlatform = i8;
    }

    public void setRssi(int i8) {
        this.rssi = i8;
    }
}
