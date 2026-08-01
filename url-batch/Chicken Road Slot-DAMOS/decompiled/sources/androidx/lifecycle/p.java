package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final p f707d;

    /* renamed from: e, reason: collision with root package name */
    public static final p f708e;

    /* renamed from: i, reason: collision with root package name */
    public static final p f709i;

    /* renamed from: r, reason: collision with root package name */
    public static final p f710r;

    /* renamed from: s, reason: collision with root package name */
    public static final p f711s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ p[] f712t;

    static {
        p pVar = new p("DESTROYED", 0);
        f707d = pVar;
        p pVar2 = new p("INITIALIZED", 1);
        f708e = pVar2;
        p pVar3 = new p("CREATED", 2);
        f709i = pVar3;
        p pVar4 = new p("STARTED", 3);
        f710r = pVar4;
        p pVar5 = new p("RESUMED", 4);
        f711s = pVar5;
        f712t = new p[]{pVar, pVar2, pVar3, pVar4, pVar5};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f712t.clone();
    }
}
