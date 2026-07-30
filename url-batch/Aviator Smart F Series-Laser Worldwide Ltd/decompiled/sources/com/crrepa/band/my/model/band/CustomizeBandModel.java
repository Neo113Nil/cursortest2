package com.crrepa.band.my.model.band;

import android.text.TextUtils;
import android.widget.ImageView;
import com.crrepa.band.my.a;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.db.BandConfig;
import com.crrepa.band.my.model.db.BandLanguage;
import com.crrepa.band.my.model.db.Language;
import com.crrepa.band.my.model.db.proxy.BandLanguageDaoProxy;
import com.crrepa.band.my.model.db.proxy.LanguageDaoProxy;
import com.moyoung.dafit.module.common.imageload.c;
import com.moyoung.dafit.module.common.utils.d;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.s;
import com.moyoung.dafit.module.common.utils.w0;
import com.moyoung.dafit.module.common.utils.z;
import com.realsil.sdk.dfu.DfuException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class CustomizeBandModel extends BaseBandModel {
    private static final String FIRMWARE_TYPE_GBE = "GBE";
    private static final String FIRMWARE_TYPE_GCK = "GCK";
    private static final String FIRMWARE_TYPE_GDM = "GDM";
    private static final String FIRMWARE_TYPE_GDN = "GDN";
    private static final String FIRMWARE_TYPE_GFD = "GFD";
    private static final String GDX = "GDX";
    private static final String HAN = "HAN";
    private static final String HIS = "HIS";
    private static final String JLI = "JLI";
    private static final String NOR = "NOR";
    private static final String RTL = "RTL";
    private static final String SFL = "SFL";
    private static final String ZLX = "ZLX";
    private final BandConfig bandConfig;
    private List<String> watchFaceUrls;

    public CustomizeBandModel(String str, String str2, BandConfig bandConfig) {
        super(str, str2);
        this.bandConfig = bandConfig;
    }

    private File getBandWatchFaceFileByUrl(String str) {
        String fileName = w0.getFileName(str);
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        return new File(a.getBandWatchFacePath(getBandName()), fileName);
    }

    private boolean isMcu(int... iArr) {
        Integer mcu = this.bandConfig.getMcu();
        if (mcu != null && iArr != null) {
            for (int i8 : iArr) {
                if (i8 == mcu.intValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    private void loadWatchFace(ImageView imageView, String str, String str2) {
        String fileName = w0.getFileName(str);
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        c.load(imageView, com.crrepa.band.my.ble.band.utils.a.getInstance().getBandWatchFaceDownloadUrl(str), new File(str2, fileName));
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public void downAllWatchFace() {
        List<String> bandWatchFaceUrls = getBandWatchFaceUrls();
        com.moyoung.dafit.module.common.imageload.a aVar = new com.moyoung.dafit.module.common.imageload.a();
        for (String str : bandWatchFaceUrls) {
            File bandWatchFaceFileByUrl = getBandWatchFaceFileByUrl(str);
            if (bandWatchFaceFileByUrl != null) {
                aVar.donwloadFile(com.crrepa.band.my.ble.band.utils.a.getInstance().getBandWatchFaceDownloadUrl(str), bandWatchFaceFileByUrl.getAbsolutePath());
            }
        }
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public String getBandName() {
        return getBroadcastName();
    }

    public File getBandWatchFaceFile(int i8) {
        return getBandWatchFaceFileByUrl(getBandWatchFaceUrl(i8));
    }

    public String getBandWatchFaceUrl(int i8) {
        List<String> bandWatchFaceUrls = getBandWatchFaceUrls();
        if (bandWatchFaceUrls == null || bandWatchFaceUrls.size() <= i8) {
            return null;
        }
        return bandWatchFaceUrls.get(i8);
    }

    public List<String> getBandWatchFaceUrls() {
        if (this.watchFaceUrls == null) {
            this.watchFaceUrls = s.json2List(this.bandConfig.getScreens(), String[].class);
        }
        return this.watchFaceUrls;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public int getCustomizeWatchFaceIndex() {
        List<Integer> watchFaceConfigList = getWatchFaceConfigList();
        if (watchFaceConfigList == null || watchFaceConfigList.size() <= 0) {
            return -1;
        }
        for (int i8 = 0; i8 < watchFaceConfigList.size(); i8++) {
            if (watchFaceConfigList.get(i8).intValue() > 0) {
                return i8;
            }
        }
        return super.getCustomizeWatchFaceIndex();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public int getEcgType() {
        Integer ecg = this.bandConfig.getEcg();
        if (ecg == null) {
            return 0;
        }
        return ecg.intValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public int getMcu() {
        return this.bandConfig.getMcu().intValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public int getMovementHeartRateMode() {
        Integer sportsMode = this.bandConfig.getSportsMode();
        if (sportsMode == null) {
            return 0;
        }
        return sportsMode.intValue();
    }

    public int getRadiusForWatch() {
        Integer lcm = this.bandConfig.getLcm();
        if (lcm == null) {
            return super.getThumFilletRadius();
        }
        int intValue = lcm.intValue();
        if (intValue != 19) {
            if (intValue == 22) {
                return 14;
            }
            if (intValue == 52) {
                return 113;
            }
            if (intValue != 55 && intValue != 63) {
                if (intValue == 70) {
                    return 45;
                }
                if (intValue == 38) {
                    return 54;
                }
                if (intValue != 39) {
                    return super.getThumFilletRadius();
                }
                return 39;
            }
        }
        return 38;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public int getRoundedRadius() {
        Integer lcm = this.bandConfig.getLcm();
        if (lcm == null) {
            return super.getRoundedRadius();
        }
        int intValue = lcm.intValue();
        if (intValue == 22) {
            return o.dp2px(d.get(), 10.0f);
        }
        if (intValue != 52 && intValue != 55 && intValue != 63 && intValue != 68 && intValue != 82) {
            if (intValue == 89) {
                return o.dp2px(d.get(), 22.0f);
            }
            if (intValue != 94) {
                return super.getThumFilletRadius();
            }
        }
        return o.dp2px(d.get(), 18.0f);
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public ScreenSize getScreenSize() {
        Integer lcm = this.bandConfig.getLcm();
        if (lcm == null) {
            return null;
        }
        if (isRectangleScreen()) {
            return new ScreenSize(120, 240);
        }
        if (lcm.intValue() < 16) {
            return super.getScreenSize();
        }
        switch (lcm.intValue()) {
            case 16:
                return new ScreenSize(240, DfuException.ERROR_ENTER_OTA_MODE_FAILED);
            case 17:
                return new ScreenSize(240, 283);
            case 18:
                return new ScreenSize(240, 295);
            case 19:
                return new ScreenSize(320, 385);
            case 20:
                return new ScreenSize(240, 283);
            default:
                return null;
        }
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public List<Language> getSupportLanguageList() {
        List json2List = s.json2List(this.bandConfig.getLanguages(), Integer[].class);
        if (json2List == null) {
            return super.getSupportLanguageList();
        }
        List<Language> all = new LanguageDaoProxy().getAll();
        ArrayList<Long> arrayList = new ArrayList();
        if (!hasTraditional()) {
            arrayList.add(9L);
        }
        if (!hasItalianAndPortuguese()) {
            arrayList.add(11L);
            arrayList.add(12L);
        }
        if (!hasUkrainian()) {
            arrayList.add(10L);
        }
        for (Long l8 : arrayList) {
            if (json2List.contains(l8)) {
                json2List.remove(l8);
            }
        }
        List<BandLanguage> list = new BandLanguageDaoProxy().get(getBandName());
        ArrayList arrayList2 = new ArrayList();
        Iterator<BandLanguage> it = list.iterator();
        while (it.hasNext()) {
            List json2List2 = s.json2List(it.next().getLanguages(), Integer[].class);
            if (json2List2 != null) {
                arrayList2.addAll(json2List2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Language language : all) {
            int intValue = language.getCmd().intValue();
            if (!hasConfigLanguage() && 12 < intValue) {
                break;
            }
            if (arrayList2.isEmpty() || arrayList2.contains(Integer.valueOf(intValue))) {
                if (json2List.contains(Integer.valueOf(intValue))) {
                    arrayList3.add(language);
                }
            }
        }
        return arrayList3;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public int getThumFilletRadius() {
        Integer lcm = this.bandConfig.getLcm();
        if (lcm == null) {
            return super.getThumFilletRadius();
        }
        int intValue = lcm.intValue();
        if (intValue == 19) {
            return 38;
        }
        if (intValue == 22) {
            return 14;
        }
        if (intValue == 52 || intValue == 55 || intValue == 63) {
            return 38;
        }
        return super.getThumFilletRadius();
    }

    public int getThumbRadiusForWatch(int i8, int i9) {
        return (int) ((i9 / i8) * getRadiusForWatch());
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public List<Integer> getWatchFaceConfigList() {
        if (getFirmwareVersionCode() < 165) {
            return null;
        }
        return s.json2List(this.bandConfig.getScreensConfig(), Integer[].class);
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public int getWatchFaceCount() {
        Integer faceNumber = this.bandConfig.getFaceNumber();
        return faceNumber != null ? faceNumber.intValue() : hasWatchFaceStore() ? 1 : 0;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public int getWechatPid() {
        return this.bandConfig.getPid().intValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean has24HoursHeartRate() {
        return this.bandConfig.getAllDayHeart().booleanValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasBloodOxygen() {
        return this.bandConfig.getBo().booleanValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasBloodPressure() {
        return this.bandConfig.getBp().booleanValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasCustomFunction() {
        return this.bandConfig.getFunction().booleanValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasDrinkWaterReminder() {
        String firmwareType = getFirmwareType();
        if (!TextUtils.isEmpty(firmwareType)) {
            firmwareType.hashCode();
            switch (firmwareType) {
                case "GBE":
                case "GCK":
                case "GDM":
                case "GDN":
                case "GFD":
                    return false;
            }
        }
        return super.hasDrinkWaterReminder();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasDynamicHeartRate() {
        return this.bandConfig.getDyHeart().booleanValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasEcg() {
        Integer ecg = this.bandConfig.getEcg();
        return ecg != null && ecg.intValue() > 0;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasGuide() {
        return this.bandConfig.getGuide().booleanValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasMovementHeartRate() {
        return z.hasMovementHeartRate(getMovementHeartRateMode());
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasOnceHeartRate() {
        Boolean onceHeart = this.bandConfig.getOnceHeart();
        return onceHeart != null && onceHeart.booleanValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasWatchFace() {
        return this.bandConfig.getScreenSwitch().booleanValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasWatchFaceStore() {
        Boolean watchFaceStore = this.bandConfig.getWatchFaceStore();
        if (watchFaceStore == null) {
            return false;
        }
        return watchFaceStore.booleanValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean hasWeather() {
        return this.bandConfig.getWeather().booleanValue();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isBluetrum() {
        String mcuPlatform = this.bandConfig.getMcuPlatform();
        return TextUtils.isEmpty(mcuPlatform) ? BandInfoManager.getMcuPlatform() == 7 : TextUtils.equals(mcuPlatform, ZLX);
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isBond() {
        return (BandInfoManager.getFunction() & 2048) != 0;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isCircleScreen() {
        Integer shape = this.bandConfig.getShape();
        if (shape != null) {
            return shape.intValue() == 2;
        }
        Integer lcm = this.bandConfig.getLcm();
        if (lcm == null) {
            return false;
        }
        int intValue = lcm.intValue();
        return intValue == 5 || intValue == 15 || intValue == 24;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isGoodix() {
        String mcuPlatform = this.bandConfig.getMcuPlatform();
        if (!TextUtils.isEmpty(mcuPlatform)) {
            return TextUtils.equals(mcuPlatform, GDX);
        }
        int mcuPlatform2 = BandInfoManager.getMcuPlatform();
        return mcuPlatform2 == 0 ? isMcu(10) : mcuPlatform2 == 4;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isHisilicon() {
        String mcuPlatform = this.bandConfig.getMcuPlatform();
        return TextUtils.isEmpty(mcuPlatform) ? BandInfoManager.getMcuPlatform() == 8 : TextUtils.equals(mcuPlatform, HIS);
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isHsMcu() {
        String mcuPlatform = this.bandConfig.getMcuPlatform();
        if (!TextUtils.isEmpty(mcuPlatform)) {
            return TextUtils.equals(mcuPlatform, HAN);
        }
        int mcuPlatform2 = BandInfoManager.getMcuPlatform();
        return mcuPlatform2 == 0 ? isMcu(4, 8, 9) : mcuPlatform2 == 2;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isJieli() {
        String mcuPlatform = this.bandConfig.getMcuPlatform();
        return TextUtils.isEmpty(mcuPlatform) ? BandInfoManager.getMcuPlatform() == 6 : TextUtils.equals(mcuPlatform, JLI);
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isLyric() {
        return (BandInfoManager.getFunction() & 4096) != 0;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isRealTek() {
        String mcuPlatform = this.bandConfig.getMcuPlatform();
        if (!TextUtils.isEmpty(mcuPlatform)) {
            return TextUtils.equals(mcuPlatform, RTL);
        }
        int mcuPlatform2 = BandInfoManager.getMcuPlatform();
        return mcuPlatform2 == 0 ? isMcu(7) : mcuPlatform2 == 3;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isRealTek8773() {
        return isRealTek() && 100 <= BandInfoManager.getMcuChipId();
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isRectangleScreen() {
        if (this.bandConfig.getLcm() == null) {
            return false;
        }
        int intValue = this.bandConfig.getLcm().intValue();
        if (intValue != 1) {
            switch (intValue) {
            }
            return false;
        }
        return true;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isRoundedRectangleScreen() {
        Integer shape = this.bandConfig.getShape();
        if (shape != null) {
            return shape.intValue() == 3;
        }
        Integer lcm = this.bandConfig.getLcm();
        if (lcm == null) {
            return false;
        }
        switch (lcm.intValue()) {
        }
        return false;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isScanAndCodeBond() {
        int function = getFunction();
        if (function <= 0) {
            function = BandInfoManager.getFunction();
        }
        return (function & 128) != 0;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isSifli() {
        String mcuPlatform = this.bandConfig.getMcuPlatform();
        if (!TextUtils.isEmpty(mcuPlatform)) {
            return TextUtils.equals(mcuPlatform, SFL);
        }
        int mcuPlatform2 = BandInfoManager.getMcuPlatform();
        return mcuPlatform2 == 0 ? isMcu(86) : mcuPlatform2 == 5;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public boolean isTalkBand() {
        return (BandInfoManager.getFunction() & 32768) != 0;
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public void loadAllBandWatchFace(ImageView... imageViewArr) {
        for (int i8 = 0; i8 < imageViewArr.length; i8++) {
            loadBandWatchFace(i8, imageViewArr[i8]);
        }
    }

    public void loadBandWatchFace(int i8, ImageView imageView) {
        String bandWatchFaceUrl = getBandWatchFaceUrl(i8);
        File bandWatchFaceFileByUrl = getBandWatchFaceFileByUrl(bandWatchFaceUrl);
        if (bandWatchFaceFileByUrl == null) {
            return;
        }
        c.load(imageView, com.crrepa.band.my.ble.band.utils.a.getInstance().getBandWatchFaceDownloadUrl(bandWatchFaceUrl), bandWatchFaceFileByUrl);
    }

    public void loadWatchFaceStorePreview(ImageView imageView, String str) {
        loadWatchFace(imageView, str, a.getWatchFaceStorePath());
    }

    @Override // com.crrepa.band.my.model.band.BaseBandModel
    public void setBandSnapshot(ImageView imageView) {
        String icon = this.bandConfig.getIcon();
        String fileName = w0.getFileName(icon);
        if (TextUtils.isEmpty(fileName)) {
            return;
        }
        c.load(imageView, w1.a.getIconUrl(icon), new File(a.getBandIconPath(), fileName));
    }
}
