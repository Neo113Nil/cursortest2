package x;

import I0.C0194g;
import e2.InterfaceC0424c;
import java.util.List;
import m.C0609E;
import r.AbstractC0856c;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1192e extends f2.k implements InterfaceC0424c {

    /* renamed from: f, reason: collision with root package name */
    public static final C1192e f10074f = new C1192e(1, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final C1192e f10075g = new C1192e(1, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final C1192e f10076h = new C1192e(1, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final C1192e f10077i = new C1192e(1, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final C1192e f10078j = new C1192e(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final C1192e f10079k = new C1192e(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final C1192e f10080l = new C1192e(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final C1192e f10081m = new C1192e(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final C1192e f10082n = new C1192e(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final C1192e f10083o = new C1192e(1, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final C1192e f10084p = new C1192e(1, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final C1192e f10085q = new C1192e(1, 11);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10086e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1192e(int i3, int i4) {
        super(i3);
        this.f10086e = i4;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        R1.y yVar = R1.y.f4171a;
        switch (this.f10086e) {
            case 0:
                return yVar;
            case 1:
                return yVar;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                return yVar;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                return yVar;
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                C0609E c0609e = (C0609E) obj;
                c0609e.getClass();
                c0609e.a(Float.valueOf(1.0f), 0);
                c0609e.a(Float.valueOf(1.0f), 499);
                c0609e.a(Float.valueOf(0.0f), 500);
                c0609e.a(Float.valueOf(0.0f), 999);
                return yVar;
            case 5:
                B.V v3 = (B.V) obj;
                long j3 = v3.f326f;
                int i3 = C0.J.f568c;
                return new C0194g(((int) (j3 & 4294967295L)) - N.p(v3.f327g.f596a, (int) (4294967295L & j3)), 0);
            case 6:
                B.V v4 = (B.V) obj;
                String str = v4.f327g.f596a;
                long j4 = v4.f326f;
                int i4 = C0.J.f568c;
                int m3 = N.m(str, (int) (j4 & 4294967295L));
                if (m3 != -1) {
                    return new C0194g(0, m3 - ((int) (4294967295L & v4.f326f)));
                }
                return null;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                B.V v5 = (B.V) obj;
                Integer e3 = v5.e();
                if (e3 == null) {
                    return null;
                }
                int intValue = e3.intValue();
                long j5 = v5.f326f;
                int i5 = C0.J.f568c;
                return new C0194g(((int) (4294967295L & j5)) - intValue, 0);
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                B.V v6 = (B.V) obj;
                Integer d3 = v6.d();
                if (d3 == null) {
                    return null;
                }
                int intValue2 = d3.intValue();
                long j6 = v6.f326f;
                int i6 = C0.J.f568c;
                return new C0194g(0, intValue2 - ((int) (4294967295L & j6)));
            case AbstractC0856c.f8037c /* 9 */:
                B.V v7 = (B.V) obj;
                Integer c2 = v7.c();
                if (c2 == null) {
                    return null;
                }
                int intValue3 = c2.intValue();
                long j7 = v7.f326f;
                int i7 = C0.J.f568c;
                return new C0194g(((int) (4294967295L & j7)) - intValue3, 0);
            case AbstractC0856c.f8039e /* 10 */:
                B.V v8 = (B.V) obj;
                Integer b3 = v8.b();
                if (b3 == null) {
                    return null;
                }
                int intValue4 = b3.intValue();
                long j8 = v8.f326f;
                int i8 = C0.J.f568c;
                return new C0194g(0, intValue4 - ((int) (4294967295L & j8)));
            default:
                List list = (List) obj;
                Object obj2 = list.get(1);
                f2.j.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                p.P p3 = ((Boolean) obj2).booleanValue() ? p.P.f7567d : p.P.f7568e;
                Object obj3 = list.get(0);
                f2.j.d(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new n0(p3, ((Float) obj3).floatValue());
        }
    }
}
