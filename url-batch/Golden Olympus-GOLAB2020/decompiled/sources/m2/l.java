package m2;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f41361b = new l("INVARIANT", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f41362c = new l("IN", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f41363d = new l("OUT", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ l[] f41364e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f41365f;

    static {
        l[] c4 = c();
        f41364e = c4;
        f41365f = AbstractC1372b.a(c4);
    }

    private l(String str, int i4) {
    }

    private static final /* synthetic */ l[] c() {
        return new l[]{f41361b, f41362c, f41363d};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f41364e.clone();
    }
}
