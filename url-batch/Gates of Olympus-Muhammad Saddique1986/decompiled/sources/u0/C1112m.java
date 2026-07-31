package u0;

import e2.InterfaceC0424c;

/* renamed from: u0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1112m extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1112m f9399f = new C1112m(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C1112m f9400g = new C1112m(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C1112m f9401h = new C1112m(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C1112m f9402i = new C1112m(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C1112m f9403j = new C1112m(1, 4);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1112m(int i3, int i4) {
        super(i3);
        this.f9404e = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r3.f129d.containsKey(A0.s.f189x) != false) goto L14;
     */
    @Override // e2.InterfaceC0424c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        boolean z3;
        switch (this.f9404e) {
            case 0:
                return R1.y.f4171a;
            case 1:
                return Boolean.TRUE;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return Boolean.FALSE;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                A0.i o3 = ((t0.E) obj).o();
                if (o3 != null) {
                    z3 = true;
                    if (o3.f130e) {
                        break;
                    }
                }
                z3 = false;
                return Boolean.valueOf(z3);
            default:
                return Boolean.valueOf(L.n(obj));
        }
    }
}
