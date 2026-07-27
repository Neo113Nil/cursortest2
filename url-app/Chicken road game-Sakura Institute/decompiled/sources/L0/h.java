package L0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f3506d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f3507e;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ h[] f3508i;

    static {
        h hVar = new h("Ltr", 0);
        f3506d = hVar;
        h hVar2 = new h("Rtl", 1);
        f3507e = hVar2;
        f3508i = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f3508i.clone();
    }
}
