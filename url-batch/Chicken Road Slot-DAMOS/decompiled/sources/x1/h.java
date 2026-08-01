package x1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f10270d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f10271e;

    /* renamed from: i, reason: collision with root package name */
    public static final h f10272i;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ h[] f10273r;

    static {
        h hVar = new h("Initial", 0);
        f10270d = hVar;
        h hVar2 = new h("Main", 1);
        f10271e = hVar2;
        h hVar3 = new h("Final", 2);
        f10272i = hVar3;
        f10273r = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f10273r.clone();
    }
}
