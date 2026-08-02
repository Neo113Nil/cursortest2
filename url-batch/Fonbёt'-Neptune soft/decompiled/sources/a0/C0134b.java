package a0;

import b0.InterfaceC0164a;

/* renamed from: a0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0134b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final C0134b f1255g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0134b f1256h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0134b f1257i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0134b f1258j;

    /* renamed from: k, reason: collision with root package name */
    public static final C0134b f1259k;

    /* renamed from: l, reason: collision with root package name */
    public static final C0134b f1260l;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1261e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1262f;

    static {
        int i2 = 0;
        f1255g = new C0134b("NONE", i2);
        f1256h = new C0134b("FULL", i2);
        int i3 = 1;
        f1257i = new C0134b("FLAT", i3);
        f1258j = new C0134b("HALF_OPENED", i3);
        int i4 = 2;
        f1259k = new C0134b("FOLD", i4);
        f1260l = new C0134b("HINGE", i4);
    }

    public /* synthetic */ C0134b(String str, int i2) {
        this.f1261e = i2;
        this.f1262f = str;
    }

    public String toString() {
        switch (this.f1261e) {
            case 0:
                return (String) this.f1262f;
            case 1:
                return (String) this.f1262f;
            case 2:
                return (String) this.f1262f;
            default:
                return super.toString();
        }
    }

    public C0134b(InterfaceC0164a interfaceC0164a) {
        this.f1261e = 3;
        int i2 = o.f1287b;
        this.f1262f = interfaceC0164a;
    }
}
