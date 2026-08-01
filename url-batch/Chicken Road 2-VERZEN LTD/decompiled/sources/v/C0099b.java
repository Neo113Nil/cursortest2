package v;

import w.InterfaceC0112a;

/* renamed from: v.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0099b implements InterfaceC0105h {

    /* renamed from: d, reason: collision with root package name */
    public static final C0099b f1263d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0099b f1264e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0099b f1265f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0099b f1266g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0099b f1267h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0099b f1268i;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1269b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1270c;

    static {
        int i2 = 0;
        f1263d = new C0099b("NONE", i2);
        f1264e = new C0099b("FULL", i2);
        int i3 = 1;
        f1265f = new C0099b("FLAT", i3);
        f1266g = new C0099b("HALF_OPENED", i3);
        int i4 = 2;
        f1267h = new C0099b("FOLD", i4);
        f1268i = new C0099b("HINGE", i4);
    }

    public /* synthetic */ C0099b(String str, int i2) {
        this.f1269b = i2;
        this.f1270c = str;
    }

    public String toString() {
        switch (this.f1269b) {
            case 0:
                return (String) this.f1270c;
            case 1:
                return (String) this.f1270c;
            case 2:
                return (String) this.f1270c;
            default:
                return super.toString();
        }
    }

    public C0099b(InterfaceC0112a interfaceC0112a) {
        this.f1269b = 3;
        int i2 = C0111n.f1294b;
        this.f1270c = interfaceC0112a;
    }
}
