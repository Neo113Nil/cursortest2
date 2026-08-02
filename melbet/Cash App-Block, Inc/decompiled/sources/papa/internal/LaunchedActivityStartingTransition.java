package papa.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class LaunchedActivityStartingTransition {
    public static final /* synthetic */ LaunchedActivityStartingTransition[] $VALUES;
    public static final LaunchedActivityStartingTransition CREATED_NO_STATE;
    public static final LaunchedActivityStartingTransition CREATED_WITH_STATE;
    public static final LaunchedActivityStartingTransition STARTED;

    static {
        LaunchedActivityStartingTransition launchedActivityStartingTransition = new LaunchedActivityStartingTransition("CREATED_NO_STATE", 0);
        CREATED_NO_STATE = launchedActivityStartingTransition;
        LaunchedActivityStartingTransition launchedActivityStartingTransition2 = new LaunchedActivityStartingTransition("CREATED_WITH_STATE", 1);
        CREATED_WITH_STATE = launchedActivityStartingTransition2;
        LaunchedActivityStartingTransition launchedActivityStartingTransition3 = new LaunchedActivityStartingTransition("STARTED", 2);
        STARTED = launchedActivityStartingTransition3;
        $VALUES = new LaunchedActivityStartingTransition[]{launchedActivityStartingTransition, launchedActivityStartingTransition2, launchedActivityStartingTransition3};
    }

    public static LaunchedActivityStartingTransition valueOf(String str) {
        return (LaunchedActivityStartingTransition) Enum.valueOf(LaunchedActivityStartingTransition.class, str);
    }

    public static LaunchedActivityStartingTransition[] values() {
        return (LaunchedActivityStartingTransition[]) $VALUES.clone();
    }
}
