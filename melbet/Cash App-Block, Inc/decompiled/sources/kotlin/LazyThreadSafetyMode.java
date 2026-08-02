package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class LazyThreadSafetyMode {
    public static final /* synthetic */ LazyThreadSafetyMode[] $VALUES;
    public static final LazyThreadSafetyMode NONE;
    public static final LazyThreadSafetyMode PUBLICATION;

    /* JADX INFO: Fake field, exist only in values array */
    LazyThreadSafetyMode EF0;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
        LazyThreadSafetyMode lazyThreadSafetyMode2 = new LazyThreadSafetyMode("PUBLICATION", 1);
        PUBLICATION = lazyThreadSafetyMode2;
        LazyThreadSafetyMode lazyThreadSafetyMode3 = new LazyThreadSafetyMode("NONE", 2);
        NONE = lazyThreadSafetyMode3;
        $VALUES = new LazyThreadSafetyMode[]{lazyThreadSafetyMode, lazyThreadSafetyMode2, lazyThreadSafetyMode3};
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) $VALUES.clone();
    }
}
