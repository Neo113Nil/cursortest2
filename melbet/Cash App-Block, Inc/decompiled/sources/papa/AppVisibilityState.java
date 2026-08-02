package papa;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AppVisibilityState {
    public static final /* synthetic */ AppVisibilityState[] $VALUES;
    public static final AppVisibilityState INVISIBLE;
    public static final AppVisibilityState VISIBLE;

    static {
        AppVisibilityState appVisibilityState = new AppVisibilityState("VISIBLE", 0);
        VISIBLE = appVisibilityState;
        AppVisibilityState appVisibilityState2 = new AppVisibilityState("INVISIBLE", 1);
        INVISIBLE = appVisibilityState2;
        $VALUES = new AppVisibilityState[]{appVisibilityState, appVisibilityState2};
    }

    public static AppVisibilityState valueOf(String str) {
        return (AppVisibilityState) Enum.valueOf(AppVisibilityState.class, str);
    }

    public static AppVisibilityState[] values() {
        return (AppVisibilityState[]) $VALUES.clone();
    }
}
