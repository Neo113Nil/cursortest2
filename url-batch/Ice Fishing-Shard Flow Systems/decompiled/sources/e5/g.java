package e5;

import c4.AbstractC0303i;
import c4.C0295a;
import c4.C0297c;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g extends AbstractC0303i {
    @Override // c4.AbstractC0303i
    public final Object b(B.f fVar) {
        T6.f sink;
        T6.i value = T6.i.f2618l;
        d4.d F4 = V6.b.F();
        long e7 = fVar.e();
        String str = "";
        int i2 = 0;
        String str2 = "";
        while (true) {
            int f7 = ((C0295a) fVar.f152e).f();
            if (f7 == -1) {
                break;
            }
            C0297c c0297c = AbstractC0303i.f4232o;
            if (f7 == 1) {
                str = (String) c0297c.b(fVar);
            } else if (f7 == 2) {
                str2 = (String) c0297c.b(fVar);
            } else if (f7 == 3) {
                F4.add((j) j.f4732m.b(fVar));
            } else if (f7 != 4) {
                fVar.q(f7);
            } else {
                i2 = ((Integer) AbstractC0303i.f4226h.b(fVar)).intValue();
            }
        }
        T6.i value2 = fVar.i(e7);
        Intrinsics.checkNotNullParameter(value2, "unknownFields");
        if (value2.a() > 0) {
            sink = new T6.f();
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(value, "value");
            sink.F(value);
            value = T6.i.f2618l;
            Intrinsics.checkNotNullParameter(value2, "value");
            sink.F(value2);
        } else {
            sink = null;
        }
        if (sink != null) {
            value = sink.e(sink.f2617e);
        }
        return new h(str, str2, F4, i2, value);
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c cVar, Object obj) {
        h hVar = (h) obj;
        String str = hVar.f4728i;
        int i2 = hVar.f4731n;
        String str2 = hVar.f4729l;
        boolean equals = Objects.equals(str, "");
        C0297c c0297c = AbstractC0303i.f4232o;
        if (!equals) {
            c0297c.f(cVar, 1, hVar.f4728i);
        }
        if (!Objects.equals(str2, "")) {
            c0297c.f(cVar, 2, str2);
        }
        j.f4732m.a().f(cVar, 3, hVar.f4730m);
        if (!Integer.valueOf(i2).equals(0)) {
            AbstractC0303i.f4226h.f(cVar, 4, Integer.valueOf(i2));
        }
        cVar.F(hVar.a());
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        h hVar = (h) obj;
        String str = hVar.f4728i;
        int i2 = hVar.f4731n;
        String str2 = hVar.f4729l;
        boolean equals = Objects.equals(str, "");
        C0297c c0297c = AbstractC0303i.f4232o;
        int h7 = !equals ? c0297c.h(1, hVar.f4728i) : 0;
        if (!Objects.equals(str2, "")) {
            h7 += c0297c.h(2, str2);
        }
        int h8 = j.f4732m.a().h(3, hVar.f4730m) + h7;
        if (!Integer.valueOf(i2).equals(0)) {
            h8 += AbstractC0303i.f4226h.h(4, Integer.valueOf(i2));
        }
        return hVar.a().a() + h8;
    }
}
