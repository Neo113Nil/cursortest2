package com.crrepa.band.my.model;

/* loaded from: classes2.dex */
public class BandSettingItemModel {
    private int icon;
    private int name;
    private boolean newVersion = false;
    private SettingType type;

    public enum SettingType {
        WATCH_FACE,
        NOTIFICATION,
        FIND_DEVICE,
        LOCAL_MUSIC,
        LOCAL_VIDEO,
        LOCAL_PHOTO,
        ALARM_CLOCK,
        MUSLIM_PRAY,
        WORLD_CLOCK,
        STOCK_SETTING,
        PILL_REMINDER,
        CAMERA_CONTROL,
        CUSTOM_KEY,
        FUNCTION_LIST,
        OTHER_SETTINGS,
        FIRMWARE_UPGRADE,
        CUSTOMER_SERVICE,
        QUICK_CONTART,
        E_CARD,
        CALENDAR_EVENT,
        CRICKET_MATCHES,
        AI_CHAT,
        APP_MARKET,
        MAP_NAVIGATION
    }

    public int getIcon() {
        return this.icon;
    }

    public int getName() {
        return this.name;
    }

    public SettingType getType() {
        return this.type;
    }

    public boolean isNewVersion() {
        return this.newVersion;
    }

    public void setIcon(int i8) {
        this.icon = i8;
    }

    public void setName(int i8) {
        this.name = i8;
    }

    public void setNewVersion(boolean z7) {
        this.newVersion = z7;
    }

    public void setType(SettingType settingType) {
        this.type = settingType;
    }
}
