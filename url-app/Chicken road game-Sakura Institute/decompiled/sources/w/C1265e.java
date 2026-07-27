package w;

import G0.C0243g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.C0760E;
import q.AbstractC1024c;

/* renamed from: w.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1265e extends M2.p implements Function1 {

    /* renamed from: e, reason: collision with root package name */
    public static final C1265e f11162e = new C1265e(1, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final C1265e f11163i = new C1265e(1, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final C1265e f11164j = new C1265e(1, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final C1265e f11165k = new C1265e(1, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final C1265e f11166l = new C1265e(1, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final C1265e f11167m = new C1265e(1, 5);

    /* renamed from: n, reason: collision with root package name */
    public static final C1265e f11168n = new C1265e(1, 6);

    /* renamed from: o, reason: collision with root package name */
    public static final C1265e f11169o = new C1265e(1, 7);

    /* renamed from: p, reason: collision with root package name */
    public static final C1265e f11170p = new C1265e(1, 8);

    /* renamed from: q, reason: collision with root package name */
    public static final C1265e f11171q = new C1265e(1, 9);

    /* renamed from: r, reason: collision with root package name */
    public static final C1265e f11172r = new C1265e(1, 10);

    /* renamed from: s, reason: collision with root package name */
    public static final C1265e f11173s = new C1265e(1, 11);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1265e(int i2, int i4) {
        super(i2);
        this.f11174d = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f11174d) {
            case 0:
                return Unit.f7487a;
            case 1:
                return Unit.f7487a;
            case 2:
                return Unit.f7487a;
            case 3:
                return Unit.f7487a;
            case 4:
                C0760E c0760e = (C0760E) obj;
                c0760e.getClass();
                c0760e.a(Float.valueOf(1.0f), 0);
                c0760e.a(Float.valueOf(1.0f), 499);
                c0760e.a(Float.valueOf(0.0f), 500);
                c0760e.a(Float.valueOf(0.0f), 999);
                return Unit.f7487a;
            case 5:
                A.W w4 = (A.W) obj;
                long j4 = w4.f69f;
                int i2 = A0.K.f300c;
                return new C0243g(((int) (j4 & 4294967295L)) - M.p((int) (4294967295L & j4), w4.f70g.f328a), 0);
            case 6:
                A.W w5 = (A.W) obj;
                String str = w5.f70g.f328a;
                long j5 = w5.f69f;
                int i4 = A0.K.f300c;
                int m4 = M.m((int) (j5 & 4294967295L), str);
                if (m4 != -1) {
                    return new C0243g(0, m4 - ((int) (4294967295L & w5.f69f)));
                }
                return null;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                A.W w6 = (A.W) obj;
                Integer e4 = w6.e();
                if (e4 == null) {
                    return null;
                }
                int intValue = e4.intValue();
                long j6 = w6.f69f;
                int i5 = A0.K.f300c;
                return new C0243g(((int) (4294967295L & j6)) - intValue, 0);
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                A.W w7 = (A.W) obj;
                Integer d4 = w7.d();
                if (d4 == null) {
                    return null;
                }
                int intValue2 = d4.intValue();
                long j7 = w7.f69f;
                int i6 = A0.K.f300c;
                return new C0243g(0, intValue2 - ((int) (4294967295L & j7)));
            case AbstractC1024c.f9242c /* 9 */:
                A.W w8 = (A.W) obj;
                Integer c4 = w8.c();
                if (c4 == null) {
                    return null;
                }
                int intValue3 = c4.intValue();
                long j8 = w8.f69f;
                int i7 = A0.K.f300c;
                return new C0243g(((int) (4294967295L & j8)) - intValue3, 0);
            case 10:
                A.W w9 = (A.W) obj;
                Integer b4 = w9.b();
                if (b4 == null) {
                    return null;
                }
                int intValue4 = b4.intValue();
                long j9 = w9.f69f;
                int i8 = A0.K.f300c;
                return new C0243g(0, intValue4 - ((int) (4294967295L & j9)));
            default:
                List list = (List) obj;
                Object obj2 = list.get(1);
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                o.N n2 = ((Boolean) obj2).booleanValue() ? o.N.f8665d : o.N.f8666e;
                Object obj3 = list.get(0);
                Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new m0(n2, ((Float) obj3).floatValue());
        }
    }
}
