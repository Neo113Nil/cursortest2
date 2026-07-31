package n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f6216d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f6217e;

    /* renamed from: f, reason: collision with root package name */
    public static final h f6218f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ h[] f6219g;

    static {
        h hVar = new h("Initial", 0);
        f6216d = hVar;
        h hVar2 = new h("Main", 1);
        f6217e = hVar2;
        h hVar3 = new h("Final", 2);
        f6218f = hVar3;
        f6219g = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f6219g.clone();
    }
}
