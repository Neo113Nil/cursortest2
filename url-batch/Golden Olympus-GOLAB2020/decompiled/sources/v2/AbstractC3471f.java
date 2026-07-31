package v2;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import o2.AbstractC3340l0;

/* renamed from: v2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3471f extends AbstractC3340l0 {

    /* renamed from: e, reason: collision with root package name */
    private final int f46466e;

    /* renamed from: f, reason: collision with root package name */
    private final int f46467f;

    /* renamed from: g, reason: collision with root package name */
    private final long f46468g;

    /* renamed from: h, reason: collision with root package name */
    private final String f46469h;

    /* renamed from: i, reason: collision with root package name */
    private ExecutorC3466a f46470i = U();

    public AbstractC3471f(int i4, int i5, long j4, String str) {
        this.f46466e = i4;
        this.f46467f = i5;
        this.f46468g = j4;
        this.f46469h = str;
    }

    private final ExecutorC3466a U() {
        return new ExecutorC3466a(this.f46466e, this.f46467f, this.f46468g, this.f46469h);
    }

    public final void V(Runnable runnable, InterfaceC3474i interfaceC3474i, boolean z4) {
        this.f46470i.U(runnable, interfaceC3474i, z4);
    }

    @Override // o2.AbstractC3313G
    public void g(CoroutineContext coroutineContext, Runnable runnable) {
        ExecutorC3466a.V(this.f46470i, runnable, null, false, 6, null);
    }

    @Override // o2.AbstractC3313G
    public void h(CoroutineContext coroutineContext, Runnable runnable) {
        ExecutorC3466a.V(this.f46470i, runnable, null, true, 2, null);
    }

    @Override // o2.AbstractC3340l0
    public Executor p() {
        return this.f46470i;
    }
}
