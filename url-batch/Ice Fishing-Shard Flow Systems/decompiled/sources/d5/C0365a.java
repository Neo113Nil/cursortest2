package d5;

import B.f;
import T6.i;
import c4.AbstractC0303i;
import c4.C0295a;
import d4.d;
import f5.C0405d;
import kotlin.jvm.internal.Intrinsics;
import l2.c;

/* renamed from: d5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0365a extends AbstractC0303i {
    @Override // c4.AbstractC0303i
    public final Object b(f fVar) {
        T6.f sink;
        i value = i.f2618l;
        d F4 = V6.b.F();
        long e7 = fVar.e();
        while (true) {
            int f7 = ((C0295a) fVar.f152e).f();
            if (f7 == -1) {
                break;
            }
            if (f7 != 1) {
                fVar.q(f7);
            } else {
                F4.add((C0405d) C0405d.f4818n.b(fVar));
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
        return new C0366b(F4, value);
    }

    @Override // c4.AbstractC0303i
    public final void e(c cVar, Object obj) {
        C0366b c0366b = (C0366b) obj;
        C0405d.f4818n.a().f(cVar, 1, c0366b.f4663i);
        cVar.F(c0366b.a());
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        C0366b c0366b = (C0366b) obj;
        return c0366b.a().a() + C0405d.f4818n.a().h(1, c0366b.f4663i);
    }
}
