package e5;

import c4.AbstractC0303i;
import c4.C0295a;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends AbstractC0303i {
    @Override // c4.AbstractC0303i
    public final Object b(B.f fVar) {
        T6.i value = T6.i.f2618l;
        long e7 = fVar.e();
        T6.f sink = null;
        String str = "";
        b bVar = null;
        while (true) {
            int f7 = ((C0295a) fVar.f152e).f();
            if (f7 == -1) {
                break;
            }
            if (f7 == 1) {
                str = (String) AbstractC0303i.f4232o.b(fVar);
            } else if (f7 != 2) {
                fVar.q(f7);
            } else {
                bVar = (b) b.f4712r.b(fVar);
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
        }
        if (sink != null) {
            value = sink.e(sink.f2617e);
        }
        return new j(str, bVar, value);
    }

    @Override // c4.AbstractC0303i
    public final void e(l2.c cVar, Object obj) {
        j jVar = (j) obj;
        String str = jVar.f4733i;
        b bVar = jVar.f4734l;
        if (!Objects.equals(str, "")) {
            AbstractC0303i.f4232o.f(cVar, 1, jVar.f4733i);
        }
        if (!Objects.equals(bVar, null)) {
            b.f4712r.f(cVar, 2, bVar);
        }
        cVar.F(jVar.a());
    }

    @Override // c4.AbstractC0303i
    public final int g(Object obj) {
        int i2;
        j jVar = (j) obj;
        String str = jVar.f4733i;
        b bVar = jVar.f4734l;
        if (Objects.equals(str, "")) {
            i2 = 0;
        } else {
            i2 = AbstractC0303i.f4232o.h(1, jVar.f4733i);
        }
        if (!Objects.equals(bVar, null)) {
            i2 += b.f4712r.h(2, bVar);
        }
        return jVar.a().a() + i2;
    }
}
