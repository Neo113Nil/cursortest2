package y1;

import z1.InterfaceC1581a;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: d, reason: collision with root package name */
    public static final b f16229d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f16230e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f16231f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f16232g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f16233h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f16234i;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16235b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f16236c;

    static {
        int i4 = 0;
        f16229d = new b("NONE", i4);
        f16230e = new b("FULL", i4);
        int i5 = 1;
        f16231f = new b("FLAT", i5);
        f16232g = new b("HALF_OPENED", i5);
        int i6 = 2;
        f16233h = new b("FOLD", i6);
        f16234i = new b("HINGE", i6);
    }

    public /* synthetic */ b(String str, int i4) {
        this.f16235b = i4;
        this.f16236c = str;
    }

    public String toString() {
        switch (this.f16235b) {
            case 0:
                return (String) this.f16236c;
            case 1:
                return (String) this.f16236c;
            case 2:
                return (String) this.f16236c;
            default:
                return super.toString();
        }
    }

    public b(InterfaceC1581a interfaceC1581a) {
        this.f16235b = 3;
        int i4 = n.f16259b;
        this.f16236c = interfaceC1581a;
    }
}
