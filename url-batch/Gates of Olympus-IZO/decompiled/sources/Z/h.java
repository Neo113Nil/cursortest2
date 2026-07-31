package Z;

import L1.z;
import h1.C0438i;

/* loaded from: classes.dex */
public final class h extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final h f3426f = new h(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final h f3427g = new h(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final h f3428h = new h(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final h f3429i = new h(1, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i3, int i4) {
        super(i3);
        this.f3430e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f3430e) {
            case 0:
                ((i) obj).b(false);
                return z.f2729a;
            case 1:
                int i3 = ((a) obj).f3414a;
                return n.f3443b;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = ((a) obj).f3414a;
                return n.f3443b;
            default:
                return Boolean.valueOf(c.B((q) obj));
        }
    }
}
