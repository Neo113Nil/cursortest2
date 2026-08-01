package u;

import v.InterfaceC0094a;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0088b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final C0088b f1260d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0088b f1261e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0088b f1262f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0088b f1263g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0088b f1264h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0088b f1265i;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1266b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1267c;

    static {
        int i2 = 0;
        f1260d = new C0088b("NONE", i2);
        f1261e = new C0088b("FULL", i2);
        int i3 = 1;
        f1262f = new C0088b("FLAT", i3);
        f1263g = new C0088b("HALF_OPENED", i3);
        int i4 = 2;
        f1264h = new C0088b("FOLD", i4);
        f1265i = new C0088b("HINGE", i4);
    }

    public /* synthetic */ C0088b(String str, int i2) {
        this.f1266b = i2;
        this.f1267c = str;
    }

    public String toString() {
        switch (this.f1266b) {
            case 0:
                return (String) this.f1267c;
            case 1:
                return (String) this.f1267c;
            case 2:
                return (String) this.f1267c;
            default:
                return super.toString();
        }
    }

    public C0088b(InterfaceC0094a interfaceC0094a) {
        this.f1266b = 3;
        int i2 = n.f1291b;
        this.f1267c = interfaceC0094a;
    }
}
