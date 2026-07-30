package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class BandConfig {
    private Boolean allDayHeart;
    private Integer bandId;
    private Boolean bo;
    private Boolean bp;
    private String broadcastName;
    private Boolean dyHeart;
    private Integer ecg;
    private Boolean enable;
    private String extendMenu;
    private Integer faceNumber;
    private String firmwareType;
    private Boolean function;
    private Boolean guide;
    private String icon;
    private Long id;
    private String languages;
    private Integer lcm;
    private Integer mcu;
    private String mcuPlatform;
    private Boolean onceHeart;
    private Integer pid;
    private Boolean screenSwitch;
    private String screens;
    private String screensConfig;
    private Integer shape;
    private Integer sportsMode;
    private Long updateTime;
    private Boolean watchFaceStore;
    private Boolean weather;

    public BandConfig(Long l8, Integer num, String str, String str2, String str3, String str4, String str5, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Long l9, Integer num4, Integer num5, String str6, Integer num6, Boolean bool11, String str7, String str8, Integer num7, Integer num8) {
        this.id = l8;
        this.bandId = num;
        this.broadcastName = str;
        this.firmwareType = str2;
        this.icon = str3;
        this.screens = str4;
        this.screensConfig = str5;
        this.pid = num2;
        this.dyHeart = bool;
        this.allDayHeart = bool2;
        this.onceHeart = bool3;
        this.sportsMode = num3;
        this.bp = bool4;
        this.bo = bool5;
        this.screenSwitch = bool6;
        this.function = bool7;
        this.guide = bool8;
        this.weather = bool9;
        this.enable = bool10;
        this.updateTime = l9;
        this.lcm = num4;
        this.ecg = num5;
        this.languages = str6;
        this.mcu = num6;
        this.watchFaceStore = bool11;
        this.extendMenu = str7;
        this.mcuPlatform = str8;
        this.shape = num7;
        this.faceNumber = num8;
    }

    public Boolean getAllDayHeart() {
        return this.allDayHeart;
    }

    public Integer getBandId() {
        return this.bandId;
    }

    public Boolean getBo() {
        return this.bo;
    }

    public Boolean getBp() {
        return this.bp;
    }

    public String getBroadcastName() {
        return this.broadcastName;
    }

    public Boolean getDyHeart() {
        return this.dyHeart;
    }

    public Integer getEcg() {
        return this.ecg;
    }

    public Boolean getEnable() {
        return this.enable;
    }

    public String getExtendMenu() {
        return this.extendMenu;
    }

    public Integer getFaceNumber() {
        return this.faceNumber;
    }

    public String getFirmwareType() {
        return this.firmwareType;
    }

    public Boolean getFunction() {
        return this.function;
    }

    public Boolean getGuide() {
        return this.guide;
    }

    public String getIcon() {
        return this.icon;
    }

    public Long getId() {
        return this.id;
    }

    public String getLanguages() {
        return this.languages;
    }

    public Integer getLcm() {
        return this.lcm;
    }

    public Integer getMcu() {
        return this.mcu;
    }

    public String getMcuPlatform() {
        return this.mcuPlatform;
    }

    public Boolean getOnceHeart() {
        return this.onceHeart;
    }

    public Integer getPid() {
        return this.pid;
    }

    public Boolean getScreenSwitch() {
        return this.screenSwitch;
    }

    public String getScreens() {
        return this.screens;
    }

    public String getScreensConfig() {
        return this.screensConfig;
    }

    public Integer getShape() {
        return this.shape;
    }

    public Integer getSportsMode() {
        return this.sportsMode;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public Boolean getWatchFaceStore() {
        return this.watchFaceStore;
    }

    public Boolean getWeather() {
        return this.weather;
    }

    public void setAllDayHeart(Boolean bool) {
        this.allDayHeart = bool;
    }

    public void setBandId(Integer num) {
        this.bandId = num;
    }

    public void setBo(Boolean bool) {
        this.bo = bool;
    }

    public void setBp(Boolean bool) {
        this.bp = bool;
    }

    public void setBroadcastName(String str) {
        this.broadcastName = str;
    }

    public void setDyHeart(Boolean bool) {
        this.dyHeart = bool;
    }

    public void setEcg(Integer num) {
        this.ecg = num;
    }

    public void setEnable(Boolean bool) {
        this.enable = bool;
    }

    public void setExtendMenu(String str) {
        this.extendMenu = str;
    }

    public void setFaceNumber(Integer num) {
        this.faceNumber = num;
    }

    public void setFirmwareType(String str) {
        this.firmwareType = str;
    }

    public void setFunction(Boolean bool) {
        this.function = bool;
    }

    public void setGuide(Boolean bool) {
        this.guide = bool;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setLanguages(String str) {
        this.languages = str;
    }

    public void setLcm(Integer num) {
        this.lcm = num;
    }

    public void setMcu(Integer num) {
        this.mcu = num;
    }

    public void setMcuPlatform(String str) {
        this.mcuPlatform = str;
    }

    public void setOnceHeart(Boolean bool) {
        this.onceHeart = bool;
    }

    public void setPid(Integer num) {
        this.pid = num;
    }

    public void setScreenSwitch(Boolean bool) {
        this.screenSwitch = bool;
    }

    public void setScreens(String str) {
        this.screens = str;
    }

    public void setScreensConfig(String str) {
        this.screensConfig = str;
    }

    public void setShape(Integer num) {
        this.shape = num;
    }

    public void setSportsMode(Integer num) {
        this.sportsMode = num;
    }

    public void setUpdateTime(Long l8) {
        this.updateTime = l8;
    }

    public void setWatchFaceStore(Boolean bool) {
        this.watchFaceStore = bool;
    }

    public void setWeather(Boolean bool) {
        this.weather = bool;
    }

    public BandConfig() {
    }
}
