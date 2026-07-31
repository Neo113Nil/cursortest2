package o2;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: o2.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3344n0 {
    public static final Executor a(AbstractC3313G abstractC3313G) {
        Executor p4;
        AbstractC3340l0 abstractC3340l0 = abstractC3313G instanceof AbstractC3340l0 ? (AbstractC3340l0) abstractC3313G : null;
        return (abstractC3340l0 == null || (p4 = abstractC3340l0.p()) == null) ? new Y(abstractC3313G) : p4;
    }

    public static final AbstractC3313G b(Executor executor) {
        AbstractC3313G abstractC3313G;
        Y y4 = executor instanceof Y ? (Y) executor : null;
        return (y4 == null || (abstractC3313G = y4.f42036b) == null) ? new C3342m0(executor) : abstractC3313G;
    }

    public static final AbstractC3340l0 c(ExecutorService executorService) {
        return new C3342m0(executorService);
    }
}
