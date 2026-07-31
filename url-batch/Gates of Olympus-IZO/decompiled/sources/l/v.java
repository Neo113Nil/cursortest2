package l;

import b0.C0266Q;
import b0.C0288u;
import c0.C0301d;
import h1.C0438i;
import m.AbstractC0595e;
import m.C0605o;
import m.C0607q;

/* loaded from: classes.dex */
public final class v extends Z1.j implements Y1.c {

    /* renamed from: f, reason: collision with root package name */
    public static final v f5505f = new v(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final v f5506g = new v(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final v f5507h = new v(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final v f5508i = new v(1, 3);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5509e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i3, int i4) {
        super(i3);
        this.f5509e = i4;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f5509e) {
            case 0:
                long a3 = C0288u.a(((C0288u) obj).f4298a, C0301d.f4367t);
                return new C0607q(C0288u.d(a3), C0288u.h(a3), C0288u.g(a3), C0288u.e(a3));
            case 1:
                long j3 = ((C0266Q) obj).f4260a;
                return new C0605o(C0266Q.b(j3), C0266Q.c(j3));
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                C0605o c0605o = (C0605o) obj;
                float f3 = c0605o.f5811a;
                float f4 = c0605o.f5812b;
                return new C0266Q((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            default:
                return AbstractC0595e.h(0.0f, null, 7);
        }
    }
}
