package N0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f3544d;

    /* renamed from: e, reason: collision with root package name */
    public static final h f3545e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h[] f3546f;

    static {
        h hVar = new h("Ltr", 0);
        f3544d = hVar;
        h hVar2 = new h("Rtl", 1);
        f3545e = hVar2;
        f3546f = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f3546f.clone();
    }
}
