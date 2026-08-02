package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f2379a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f2380b;

    /* renamed from: c, reason: collision with root package name */
    public static final h f2381c;

    /* renamed from: d, reason: collision with root package name */
    public static final h f2382d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f2383e;
    public static final /* synthetic */ h[] f;

    static {
        h hVar = new h("DESTROYED", 0);
        f2379a = hVar;
        h hVar2 = new h("INITIALIZED", 1);
        f2380b = hVar2;
        h hVar3 = new h("CREATED", 2);
        f2381c = hVar3;
        h hVar4 = new h("STARTED", 3);
        f2382d = hVar4;
        h hVar5 = new h("RESUMED", 4);
        f2383e = hVar5;
        f = new h[]{hVar, hVar2, hVar3, hVar4, hVar5};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f.clone();
    }
}
