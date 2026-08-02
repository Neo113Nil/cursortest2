package g0;

import h0.InterfaceC0338a;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0330b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final C0330b f5010c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0330b f5011d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0330b f5012e;
    public static final C0330b f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0330b f5013g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0330b f5014h;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5015a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5016b;

    static {
        int i3 = 0;
        f5010c = new C0330b("NONE", i3);
        f5011d = new C0330b("FULL", i3);
        int i4 = 1;
        f5012e = new C0330b("FLAT", i4);
        f = new C0330b("HALF_OPENED", i4);
        int i5 = 2;
        f5013g = new C0330b("FOLD", i5);
        f5014h = new C0330b("HINGE", i5);
    }

    public /* synthetic */ C0330b(String str, int i3) {
        this.f5015a = i3;
        this.f5016b = str;
    }

    public String toString() {
        switch (this.f5015a) {
            case 0:
                return (String) this.f5016b;
            case 1:
                return (String) this.f5016b;
            case 2:
                return (String) this.f5016b;
            default:
                return super.toString();
        }
    }

    public C0330b(InterfaceC0338a interfaceC0338a) {
        this.f5015a = 3;
        int i3 = m.f5036b;
        this.f5016b = interfaceC0338a;
    }
}
