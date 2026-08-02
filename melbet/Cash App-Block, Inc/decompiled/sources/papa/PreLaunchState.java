package papa;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NO_PROCESS' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes3.dex */
public final class PreLaunchState {
    public static final /* synthetic */ PreLaunchState[] $VALUES;
    public static final PreLaunchState ACTIVITY_WAS_STOPPED;
    public static final PreLaunchState NO_ACTIVITY_BUT_SAVED_STATE;
    public static final PreLaunchState NO_ACTIVITY_NO_SAVED_STATE;
    public static final PreLaunchState NO_PROCESS;
    public static final PreLaunchState NO_PROCESS_FIRST_LAUNCH_AFTER_CLEAR_DATA;
    public static final PreLaunchState NO_PROCESS_FIRST_LAUNCH_AFTER_INSTALL;
    public static final PreLaunchState NO_PROCESS_FIRST_LAUNCH_AFTER_UPGRADE;
    public static final PreLaunchState PROCESS_WAS_LAUNCHING_IN_BACKGROUND;
    public final AppLaunchType launchType;

    static {
        AppLaunchType appLaunchType = AppLaunchType.COLD;
        PreLaunchState preLaunchState = new PreLaunchState("NO_PROCESS", 0, appLaunchType);
        NO_PROCESS = preLaunchState;
        PreLaunchState preLaunchState2 = new PreLaunchState("NO_PROCESS_FIRST_LAUNCH_AFTER_INSTALL", 1, appLaunchType);
        NO_PROCESS_FIRST_LAUNCH_AFTER_INSTALL = preLaunchState2;
        PreLaunchState preLaunchState3 = new PreLaunchState("NO_PROCESS_FIRST_LAUNCH_AFTER_UPGRADE", 2, appLaunchType);
        NO_PROCESS_FIRST_LAUNCH_AFTER_UPGRADE = preLaunchState3;
        PreLaunchState preLaunchState4 = new PreLaunchState("NO_PROCESS_FIRST_LAUNCH_AFTER_CLEAR_DATA", 3, appLaunchType);
        NO_PROCESS_FIRST_LAUNCH_AFTER_CLEAR_DATA = preLaunchState4;
        AppLaunchType appLaunchType2 = AppLaunchType.WARM;
        PreLaunchState preLaunchState5 = new PreLaunchState("PROCESS_WAS_LAUNCHING_IN_BACKGROUND", 4, appLaunchType2);
        PROCESS_WAS_LAUNCHING_IN_BACKGROUND = preLaunchState5;
        PreLaunchState preLaunchState6 = new PreLaunchState("NO_ACTIVITY_NO_SAVED_STATE", 5, appLaunchType2);
        NO_ACTIVITY_NO_SAVED_STATE = preLaunchState6;
        PreLaunchState preLaunchState7 = new PreLaunchState("NO_ACTIVITY_BUT_SAVED_STATE", 6, appLaunchType2);
        NO_ACTIVITY_BUT_SAVED_STATE = preLaunchState7;
        PreLaunchState preLaunchState8 = new PreLaunchState("ACTIVITY_WAS_STOPPED", 7, AppLaunchType.HOT);
        ACTIVITY_WAS_STOPPED = preLaunchState8;
        $VALUES = new PreLaunchState[]{preLaunchState, preLaunchState2, preLaunchState3, preLaunchState4, preLaunchState5, preLaunchState6, preLaunchState7, preLaunchState8};
    }

    public PreLaunchState(String str, int i, AppLaunchType appLaunchType) {
        this.launchType = appLaunchType;
    }

    public static PreLaunchState valueOf(String str) {
        return (PreLaunchState) Enum.valueOf(PreLaunchState.class, str);
    }

    public static PreLaunchState[] values() {
        return (PreLaunchState[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return name() + '(' + this.launchType + ')';
    }
}
