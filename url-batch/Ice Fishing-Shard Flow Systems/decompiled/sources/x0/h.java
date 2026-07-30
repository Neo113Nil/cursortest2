package x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final h f8309d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h[] f8310e;

    /* JADX INFO: Fake field, exist only in values array */
    h EF0;

    static {
        h hVar = new h("STRICT", 0);
        h hVar2 = new h("LOG", 1);
        h hVar3 = new h("QUIET", 2);
        f8309d = hVar3;
        f8310e = new h[]{hVar, hVar2, hVar3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f8310e.clone();
    }
}
