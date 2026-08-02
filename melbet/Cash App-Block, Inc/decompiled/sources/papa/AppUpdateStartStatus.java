package papa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AppUpdateStartStatus {
    public static final /* synthetic */ AppUpdateStartStatus[] $VALUES;
    public static final AppUpdateStartStatus FIRST_START_AFTER_CLEAR_DATA;
    public static final AppUpdateStartStatus FIRST_START_AFTER_FRESH_INSTALL;
    public static final AppUpdateStartStatus FIRST_START_AFTER_UPGRADE;
    public static final AppUpdateStartStatus NORMAL_START;

    static {
        AppUpdateStartStatus appUpdateStartStatus = new AppUpdateStartStatus("FIRST_START_AFTER_CLEAR_DATA", 0);
        FIRST_START_AFTER_CLEAR_DATA = appUpdateStartStatus;
        AppUpdateStartStatus appUpdateStartStatus2 = new AppUpdateStartStatus("FIRST_START_AFTER_FRESH_INSTALL", 1);
        FIRST_START_AFTER_FRESH_INSTALL = appUpdateStartStatus2;
        AppUpdateStartStatus appUpdateStartStatus3 = new AppUpdateStartStatus("FIRST_START_AFTER_UPGRADE", 2);
        FIRST_START_AFTER_UPGRADE = appUpdateStartStatus3;
        AppUpdateStartStatus appUpdateStartStatus4 = new AppUpdateStartStatus("NORMAL_START", 3);
        NORMAL_START = appUpdateStartStatus4;
        $VALUES = new AppUpdateStartStatus[]{appUpdateStartStatus, appUpdateStartStatus2, appUpdateStartStatus3, appUpdateStartStatus4};
    }

    public static AppUpdateStartStatus valueOf(String str) {
        return (AppUpdateStartStatus) Enum.valueOf(AppUpdateStartStatus.class, str);
    }

    public static AppUpdateStartStatus[] values() {
        return (AppUpdateStartStatus[]) $VALUES.clone();
    }
}
