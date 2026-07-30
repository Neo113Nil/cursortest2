package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class vz0 {
    public static final co a = pm0.b;

    public static final void a(final am0 am0Var, final long j, float f, long j2, int i, float f2, hl hlVar, final int i2) {
        final float f3;
        final long j3;
        final int i3;
        final float f4;
        final float f5;
        final float f6;
        long j4;
        final int i4;
        final long j5;
        hlVar.Y(333154241);
        int i5 = i2 | (hlVar.f(am0Var) ? 4 : 2) | 222592;
        if (hlVar.O(i5 & 1, (74899 & i5) != 74898)) {
            hlVar.T();
            if ((i2 & 1) == 0 || hlVar.y()) {
                f5 = 4.0f;
                f6 = 4.0f;
                j4 = hi.f;
                i4 = 1;
            } else {
                hlVar.R();
                f6 = f;
                j4 = j2;
                i4 = i;
                f5 = f2;
            }
            hlVar.q();
            final ze1 ze1Var = new ze1(((nr) hlVar.j(yl.h)).s(f6), 0.0f, i4, 0, 26);
            j80 c0 = yr1.c0(1, hlVar);
            final h80 B = yr1.B(c0, 0.0f, 1080.0f, p4.I(new sj1(6000, qu.a), 6), hlVar, 4536, 8);
            q1 q1Var = new q1(26);
            jc0 jc0Var = new jc0();
            q1Var.invoke(jc0Var);
            final h80 B2 = yr1.B(c0, 0.0f, 360.0f, p4.I(new s40(26, jc0Var), 6), hlVar, 4536, 8);
            jc0 jc0Var2 = new jc0();
            jc0Var2.a = 6000;
            jc0Var2.a(Float.valueOf(0.87f), 3000).b = a;
            jc0Var2.a(Float.valueOf(0.1f), 6000);
            final h80 B3 = yr1.B(c0, 0.1f, 0.87f, p4.I(new s40(26, jc0Var2), 6), hlVar, 4536, 8);
            am0 c = xa1.c(i81.a(am0Var, true, new q1(27)), 40.0f);
            boolean f7 = hlVar.f(B3) | hlVar.f(B) | hlVar.f(B2) | hlVar.e(j4) | hlVar.h(ze1Var);
            Object L = hlVar.L();
            if (f7 || L == bl.a) {
                j5 = j4;
                Object obj = new Function1() { // from class: tz0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        long j6 = j5;
                        ze1 ze1Var2 = ze1Var;
                        long j7 = j;
                        hu huVar = (hu) obj2;
                        float floatValue = ((Number) B3.getValue()).floatValue() * 360.0f;
                        int i6 = i4;
                        float f8 = f5;
                        if (i6 != 0 && Float.intBitsToFloat((int) (huVar.x() & 4294967295L)) <= Float.intBitsToFloat((int) (huVar.x() >> 32))) {
                            f8 += f6;
                        }
                        float k0 = (f8 / ((float) (huVar.k0(Float.intBitsToFloat((int) (huVar.x() >> 32))) * 3.141592653589793d))) * 360.0f;
                        float floatValue2 = ((Number) B2.getValue()).floatValue() + ((Number) B.getValue()).floatValue();
                        long N = huVar.N();
                        i8 v = huVar.v();
                        long i7 = v.i();
                        v.g().k();
                        try {
                            ((s40) v.e).w(floatValue2, N);
                            vz0.c(huVar, Math.min(floatValue, k0) + floatValue, (360.0f - floatValue) - (Math.min(floatValue, k0) * 2.0f), j6, ze1Var2);
                            vz0.c(huVar, 0.0f, floatValue, j7, ze1Var2);
                            qy0.s(v, i7);
                            return Unit.a;
                        } catch (Throwable th) {
                            qy0.s(v, i7);
                            throw th;
                        }
                    }
                };
                hlVar.h0(obj);
                L = obj;
            } else {
                j5 = j4;
            }
            la0.a(c, (Function1) L, hlVar, 0);
            i3 = i4;
            f4 = f5;
            f3 = f6;
            j3 = j5;
        } else {
            hlVar.R();
            f3 = f;
            j3 = j2;
            i3 = i;
            f4 = f2;
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new Function2(j, f3, j3, i3, f4, i2) { // from class: uz0
                public final /* synthetic */ long e;
                public final /* synthetic */ float g;
                public final /* synthetic */ long h;
                public final /* synthetic */ int i;
                public final /* synthetic */ float j;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int P = gb0.P(49);
                    vz0.a(am0.this, this.e, this.g, this.h, this.i, this.j, (hl) obj2, P);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final Function0 function0, final am0 am0Var, long j, long j2, int i, float f, Function1 function1, hl hlVar, final int i2) {
        final long j3;
        final long j4;
        final int i3;
        final float f2;
        final Function1 function12;
        long b;
        long b2;
        Function1 function13;
        int i4;
        final float f3;
        final int i5;
        final Function1 function14;
        final long j5;
        final long j6;
        hlVar.Y(-339970038);
        int i6 = 2;
        int i7 = i2 | (hlVar.h(function0) ? 4 : 2) | 746624;
        if (hlVar.O(i7 & 1, (599187 & i7) != 599186)) {
            hlVar.T();
            int i8 = i2 & 1;
            Object obj = bl.a;
            if (i8 == 0 || hlVar.y()) {
                b = oi.b(wz0.a, hlVar);
                b2 = oi.b(wz0.b, hlVar);
                boolean e = hlVar.e(b);
                Object L = hlVar.L();
                if (e || L == obj) {
                    L = new ne(i6, b);
                    hlVar.h0(L);
                }
                function13 = (Function1) L;
                i4 = i7 & (-3678081);
                f3 = 4.0f;
                i5 = 1;
            } else {
                hlVar.R();
                i4 = i7 & (-3678081);
                b = j;
                b2 = j2;
                i5 = i;
                f3 = f;
                function13 = function1;
            }
            hlVar.q();
            boolean z = (i4 & 14) == 4;
            Object L2 = hlVar.L();
            if (z || L2 == obj) {
                L2 = new i6(5, function0);
                hlVar.h0(L2);
            }
            final Function0 function02 = (Function0) L2;
            am0 c = am0Var.c(s1.a);
            boolean f4 = hlVar.f(function02);
            Object L3 = hlVar.L();
            if (f4 || L3 == obj) {
                L3 = new l(15, function02);
                hlVar.h0(L3);
            }
            am0 d = xa1.d(i81.a(c, true, (Function1) L3), 240.0f, 4.0f);
            boolean f5 = hlVar.f(function02) | hlVar.e(b2) | hlVar.e(b) | hlVar.f(function13);
            Object L4 = hlVar.L();
            if (f5 || L4 == obj) {
                function14 = function13;
                j5 = b;
                j6 = b2;
                Object obj2 = new Function1() { // from class: rz0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        hu huVar = (hu) obj3;
                        float intBitsToFloat = Float.intBitsToFloat((int) (huVar.x() & 4294967295L));
                        int i9 = i5;
                        float f6 = f3;
                        if (i9 != 0 && Float.intBitsToFloat((int) (huVar.x() & 4294967295L)) <= Float.intBitsToFloat((int) (huVar.x() >> 32))) {
                            f6 += huVar.k0(intBitsToFloat);
                        }
                        float k0 = f6 / huVar.k0(Float.intBitsToFloat((int) (huVar.x() >> 32)));
                        float floatValue = ((Number) function02.invoke()).floatValue();
                        float min = Math.min(floatValue, k0) + floatValue;
                        if (min <= 1.0f) {
                            vz0.d(huVar, min, 1.0f, j6, intBitsToFloat, i9);
                        }
                        vz0.d(huVar, 0.0f, floatValue, j5, intBitsToFloat, i9);
                        function14.invoke(huVar);
                        return Unit.a;
                    }
                };
                hlVar.h0(obj2);
                L4 = obj2;
            } else {
                function14 = function13;
                j5 = b;
                j6 = b2;
            }
            la0.a(d, (Function1) L4, hlVar, 0);
            i3 = i5;
            f2 = f3;
            j4 = j6;
            j3 = j5;
            function12 = function14;
        } else {
            hlVar.R();
            j3 = j;
            j4 = j2;
            i3 = i;
            f2 = f;
            function12 = function1;
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new Function2(am0Var, j3, j4, i3, f2, function12, i2) { // from class: sz0
                public final /* synthetic */ am0 e;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;
                public final /* synthetic */ int i;
                public final /* synthetic */ float j;
                public final /* synthetic */ Function1 k;

                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int P = gb0.P(49);
                    vz0.b(Function0.this, this.e, this.g, this.h, this.i, this.j, this.k, (hl) obj3, P);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(hu huVar, float f, float f2, long j, ze1 ze1Var) {
        float intBitsToFloat = Float.intBitsToFloat((int) (huVar.x() >> 32)) - (2.0f * (ze1Var.q / 2.0f));
        hu.g0(huVar, j, f, f2, (Float.floatToRawIntBits(r0) << 32) | (Float.floatToRawIntBits(r0) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), ze1Var, 832);
    }

    public static final void d(hu huVar, float f, float f2, long j, float f3, int i) {
        float intBitsToFloat = Float.intBitsToFloat((int) (huVar.x() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (huVar.x() & 4294967295L));
        float f4 = intBitsToFloat2 / 2.0f;
        boolean z = huVar.getLayoutDirection() == vc0.d;
        float f5 = (z ? f : 1.0f - f2) * intBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * intBitsToFloat;
        if (i == 0 || intBitsToFloat2 > intBitsToFloat) {
            huVar.L(j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f3, (r19 & 16) != 0 ? 0 : 0);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = intBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            huVar.L(j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), f3, (r19 & 16) != 0 ? 0 : i);
        }
    }
}
