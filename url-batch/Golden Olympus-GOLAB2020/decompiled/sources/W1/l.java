package W1;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f9606b = new l("SYNCHRONIZED", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final l f9607c = new l("PUBLICATION", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final l f9608d = new l("NONE", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ l[] f9609e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f9610f;

    static {
        l[] c4 = c();
        f9609e = c4;
        f9610f = AbstractC1372b.a(c4);
    }

    private l(String str, int i4) {
    }

    private static final /* synthetic */ l[] c() {
        return new l[]{f9606b, f9607c, f9608d};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f9609e.clone();
    }
}
