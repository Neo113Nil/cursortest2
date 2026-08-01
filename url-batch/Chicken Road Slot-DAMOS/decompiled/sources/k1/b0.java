package k1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f5299d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ b0[] f5300e;

    static {
        b0 b0Var = new b0("CounterClockwise", 0);
        f5299d = b0Var;
        f5300e = new b0[]{b0Var, new b0("Clockwise", 1)};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) f5300e.clone();
    }
}
