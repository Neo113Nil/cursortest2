package l;

import b0.C0352v;
import b0.U;
import c0.C0358d;
import e2.InterfaceC0424c;
import m.AbstractC0620e;
import m.C0630o;
import m.C0632q;

/* loaded from: classes.dex */
public final class q extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final q f6521f = new q(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final q f6522g = new q(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final q f6523h = new q(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final q f6524i = new q(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final q f6525j = new q(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final q f6526k = new q(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final q f6527l = new q(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final q f6528m = new q(1, 7);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i3, int i4) {
        super(i3);
        this.f6529e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f6529e) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                long a3 = C0352v.a(((C0352v) obj).f5441a, C0358d.f5493t);
                return new C0632q(C0352v.d(a3), C0352v.h(a3), C0352v.g(a3), C0352v.e(a3));
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                long j3 = ((U) obj).f5402a;
                return new C0630o(U.b(j3), U.c(j3));
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                C0630o c0630o = (C0630o) obj;
                return new U(b0.M.i(c0630o.f6859a, c0630o.f6860b));
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return AbstractC0620e.i(0.0f, null, 7);
            case 5:
                ((Number) obj).intValue();
                return 0;
            case 6:
                ((Number) obj).intValue();
                return 0;
            default:
                return AbstractC0574B.f6430c;
        }
    }
}
