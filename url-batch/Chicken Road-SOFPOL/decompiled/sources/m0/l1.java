package m0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class l1 {

    /* renamed from: d, reason: collision with root package name */
    public static final l1 f5007d;

    /* renamed from: e, reason: collision with root package name */
    public static final l1 f5008e;

    /* renamed from: f, reason: collision with root package name */
    public static final l1 f5009f;

    /* renamed from: g, reason: collision with root package name */
    public static final l1 f5010g;

    /* renamed from: h, reason: collision with root package name */
    public static final l1 f5011h;
    public static final l1 i;

    /* renamed from: j, reason: collision with root package name */
    public static final l1 f5012j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ l1[] f5013k;

    static {
        l1 l1Var = new l1("Invalid", 0);
        f5007d = l1Var;
        l1 l1Var2 = new l1("Cancelled", 1);
        f5008e = l1Var2;
        l1 l1Var3 = new l1("InitialPending", 2);
        f5009f = l1Var3;
        l1 l1Var4 = new l1("RecomposePending", 3);
        f5010g = l1Var4;
        l1 l1Var5 = new l1("Recomposing", 4);
        f5011h = l1Var5;
        l1 l1Var6 = new l1("ApplyPending", 5);
        i = l1Var6;
        l1 l1Var7 = new l1("Applied", 6);
        f5012j = l1Var7;
        f5013k = new l1[]{l1Var, l1Var2, l1Var3, l1Var4, l1Var5, l1Var6, l1Var7};
    }

    public static l1 valueOf(String str) {
        return (l1) Enum.valueOf(l1.class, str);
    }

    public static l1[] values() {
        return (l1[]) f5013k.clone();
    }
}
