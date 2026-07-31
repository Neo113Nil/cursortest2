package o6;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.internal.y;
import m6.p0;

/* loaded from: classes.dex */
public class m<E> extends a<E> {

    /* renamed from: e, reason: collision with root package name */
    private final ReentrantLock f19926e;

    /* renamed from: f, reason: collision with root package name */
    private Object f19927f;

    public m(f6.l<? super E, v5.q> lVar) {
        super(lVar);
        this.f19926e = new ReentrantLock();
        this.f19927f = b.f19899a;
    }

    private final g0 x(Object obj) {
        f6.l<E, v5.q> lVar;
        Object obj2 = this.f19927f;
        g0 g0Var = null;
        if (obj2 != b.f19899a && (lVar = this.f19906b) != null) {
            g0Var = kotlinx.coroutines.internal.t.d(lVar, obj2, null, 2, null);
        }
        this.f19927f = obj;
        return g0Var;
    }

    @Override // o6.c
    protected String c() {
        return "(value=" + this.f19927f + ')';
    }

    @Override // o6.c
    protected Object i(E e7) {
        q<E> l7;
        y f7;
        ReentrantLock reentrantLock = this.f19926e;
        reentrantLock.lock();
        try {
            j<?> d7 = d();
            if (d7 != null) {
                return d7;
            }
            if (this.f19927f == b.f19899a) {
                do {
                    l7 = l();
                    if (l7 != null) {
                        if (l7 instanceof j) {
                            return l7;
                        }
                        f7 = l7.f(e7, null);
                    }
                } while (f7 == null);
                if (p0.a()) {
                    if (!(f7 == m6.m.f19306a)) {
                        throw new AssertionError();
                    }
                }
                v5.q qVar = v5.q.f22838a;
                reentrantLock.unlock();
                l7.a(e7);
                return l7.e();
            }
            g0 x6 = x(e7);
            if (x6 == null) {
                return b.f19900b;
            }
            throw x6;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o6.a
    protected boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f19926e;
        reentrantLock.lock();
        try {
            return super.q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o6.a
    protected final boolean r() {
        return false;
    }

    @Override // o6.a
    protected final boolean s() {
        return this.f19927f == b.f19899a;
    }

    @Override // o6.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f19926e;
        reentrantLock.lock();
        try {
            Object obj = this.f19927f;
            y yVar = b.f19899a;
            if (obj != yVar) {
                this.f19927f = yVar;
                v5.q qVar = v5.q.f22838a;
                return obj;
            }
            Object d7 = d();
            if (d7 == null) {
                d7 = b.f19902d;
            }
            return d7;
        } finally {
            reentrantLock.unlock();
        }
    }
}
