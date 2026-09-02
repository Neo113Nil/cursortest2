package q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public static final O f14856a;

    /* renamed from: b, reason: collision with root package name */
    public static final O f14857b;

    /* renamed from: c, reason: collision with root package name */
    public static final O f14858c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ O[] f14859d;

    static {
        O o = new O("PASS_THROUGH", 0);
        f14856a = o;
        O o4 = new O("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f14857b = o4;
        O o5 = new O("DISCARDING", 2);
        f14858c = o5;
        f14859d = new O[]{o, o4, o5};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) f14859d.clone();
    }
}
