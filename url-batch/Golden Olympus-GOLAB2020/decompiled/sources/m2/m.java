package m2;

import b2.AbstractC1372b;
import b2.InterfaceC1371a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final m f41366b = new m("PUBLIC", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final m f41367c = new m("PROTECTED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final m f41368d = new m("INTERNAL", 2);

    /* renamed from: e, reason: collision with root package name */
    public static final m f41369e = new m("PRIVATE", 3);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ m[] f41370f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC1371a f41371g;

    static {
        m[] c4 = c();
        f41370f = c4;
        f41371g = AbstractC1372b.a(c4);
    }

    private m(String str, int i4) {
    }

    private static final /* synthetic */ m[] c() {
        return new m[]{f41366b, f41367c, f41368d, f41369e};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f41370f.clone();
    }
}
