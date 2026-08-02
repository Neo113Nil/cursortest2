package E3;

import C3.w;
import E.AbstractC0005f;
import f3.C0431i;
import f3.InterfaceC0430h;
import java.util.concurrent.Executor;
import x3.AbstractC1535J;
import x3.AbstractC1558s;

/* loaded from: classes.dex */
public final class d extends AbstractC1535J implements Executor {

    /* renamed from: c, reason: collision with root package name */
    public static final d f709c = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1558s f710d;

    static {
        AbstractC1558s abstractC1558s = m.f726c;
        int i4 = w.f322a;
        if (64 >= i4) {
            i4 = 64;
        }
        int j4 = C3.a.j(i4, 12, "kotlinx.coroutines.io.parallelism");
        abstractC1558s.getClass();
        if (j4 < 1) {
            throw new IllegalArgumentException(AbstractC0005f.j(j4, "Expected positive parallelism level, but got ").toString());
        }
        if (j4 < l.f721d) {
            if (j4 < 1) {
                throw new IllegalArgumentException(AbstractC0005f.j(j4, "Expected positive parallelism level, but got ").toString());
            }
            abstractC1558s = new C3.i(abstractC1558s, j4);
        }
        f710d = abstractC1558s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        s(C0431i.f8817a, runnable);
    }

    @Override // x3.AbstractC1558s
    public final void s(InterfaceC0430h interfaceC0430h, Runnable runnable) {
        f710d.s(interfaceC0430h, runnable);
    }

    @Override // x3.AbstractC1558s
    public final String toString() {
        return "Dispatchers.IO";
    }
}
