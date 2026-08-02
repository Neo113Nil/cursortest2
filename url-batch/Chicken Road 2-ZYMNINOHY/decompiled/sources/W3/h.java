package W3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f3483a;

    /* renamed from: b, reason: collision with root package name */
    public static final h f3484b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h[] f3485c;

    static {
        h hVar = new h("RELEASE", 0);
        f3483a = hVar;
        h hVar2 = new h("LOOP", 1);
        f3484b = hVar2;
        h[] hVarArr = {hVar, hVar2, new h("STOP", 2)};
        f3485c = hVarArr;
        O3.d.m(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f3485c.clone();
    }
}
