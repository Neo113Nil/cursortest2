package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final p f847d;

    /* renamed from: e, reason: collision with root package name */
    public static final p f848e;

    /* renamed from: f, reason: collision with root package name */
    public static final p f849f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f850g;

    /* renamed from: h, reason: collision with root package name */
    public static final p f851h;
    public static final /* synthetic */ p[] i;

    static {
        p pVar = new p("DESTROYED", 0);
        f847d = pVar;
        p pVar2 = new p("INITIALIZED", 1);
        f848e = pVar2;
        p pVar3 = new p("CREATED", 2);
        f849f = pVar3;
        p pVar4 = new p("STARTED", 3);
        f850g = pVar4;
        p pVar5 = new p("RESUMED", 4);
        f851h = pVar5;
        i = new p[]{pVar, pVar2, pVar3, pVar4, pVar5};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) i.clone();
    }
}
