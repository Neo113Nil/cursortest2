package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m6.p0;

/* loaded from: classes.dex */
public abstract class c<T> extends u {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18320a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = b.f18318a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.u
    public c<?> a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.u
    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        if (obj2 == b.f18318a) {
            obj2 = e(g(obj));
        }
        d(obj, obj2);
        return obj2;
    }

    public abstract void d(T t6, Object obj);

    public final Object e(Object obj) {
        if (p0.a()) {
            if (!(obj != b.f18318a)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        Object obj3 = b.f18318a;
        return obj2 != obj3 ? obj2 : androidx.work.impl.utils.futures.b.a(f18320a, this, obj3, obj) ? obj : this._consensus;
    }

    public long f() {
        return 0L;
    }

    public abstract Object g(T t6);
}
