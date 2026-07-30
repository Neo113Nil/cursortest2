package g5;

import B.f;
import T6.i;
import c4.AbstractC0303i;
import c4.C0295a;
import d4.d;
import e5.j;
import kotlin.jvm.internal.Intrinsics;
import l2.c;

/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0450a extends AbstractC0303i {
    @Override // c4.AbstractC0303i
    public final Object b(f fVar) {
        T6.f sink;
        i value = i.f2618l;
        d F4 = V6.b.F();
        d F7 = V6.b.F();
        long e7 = fVar.e();
        int i2 = 0;
        while (true) {
            int f7 = ((C0295a) fVar.f152e).f();
            if (f7 == -1) {
                break;
            }
            if (f7 == 1) {
                F4.add((j) j.f4732m.b(fVar));
            } else if (f7 == 2) {
                i2 = ((Integer) AbstractC0303i.f4226h.b(fVar)).intValue();
            } else if (f7 != 3) {
                fVar.q(f7);
            } else {
                F7.add((e5.f) e5.f.f4722o.b(fVar));
            }
        }
        i value2 = fVar.i(e7);
        Intrinsics.checkNotNullParameter(value2, "unknownFields");
        if (value2.a() > 0) {
            sink = new T6.f();
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(value, "value");
            sink.F(value);
            value = i.f2618l;
            Intrinsics.checkNotNullParameter(value2, "value");
            sink.F(value2);
        } else {
            sink = null;
        }
        if (sink != null) {
            value = sink.e(sink.f2617e);
        }
        return new C0451b(F4, i2, F7, value);
    }

    @Override // c4.AbstractC0303i
    public final void e(c cVar, Object obj) {
        C0451b c0451b = (C0451b) obj;
        j.f4732m.a().f(cVar, 1, c0451b.f5032i);
        int i2 = c0451b.f5033l;
        if (!Integer.valueOf(i2).equals(0)) {
            AbstractC0303i.f4226h.f(cVar, 2, Integer.valueOf(i2));
        }
        e5.f.f4722o.a().f(cVar, 3, c0451b.f5034m);
        cVar.F(c0451b.a());
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        C0451b c0451b = (C0451b) obj;
        int h7 = j.f4732m.a().h(1, c0451b.f5032i);
        int i2 = c0451b.f5033l;
        if (!Integer.valueOf(i2).equals(0)) {
            h7 += AbstractC0303i.f4226h.h(2, Integer.valueOf(i2));
        }
        return c0451b.a().a() + e5.f.f4722o.a().h(3, c0451b.f5034m) + h7;
    }
}
