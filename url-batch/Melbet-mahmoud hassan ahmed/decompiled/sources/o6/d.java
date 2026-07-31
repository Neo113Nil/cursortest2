package o6;

import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.y;
import m6.p0;

/* loaded from: classes.dex */
public class d<E> extends o6.a<E> {

    /* renamed from: e, reason: collision with root package name */
    private final int f19909e;

    /* renamed from: f, reason: collision with root package name */
    private final e f19910f;

    /* renamed from: g, reason: collision with root package name */
    private final ReentrantLock f19911g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f19912h;

    /* renamed from: i, reason: collision with root package name */
    private int f19913i;
    private volatile /* synthetic */ int size;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19914a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.SUSPEND.ordinal()] = 1;
            iArr[e.DROP_LATEST.ordinal()] = 2;
            iArr[e.DROP_OLDEST.ordinal()] = 3;
            f19914a = iArr;
        }
    }

    public d(int i7, e eVar, f6.l<? super E, v5.q> lVar) {
        super(lVar);
        this.f19909e = i7;
        this.f19910f = eVar;
        if (!(i7 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i7 + " was specified").toString());
        }
        this.f19911g = new ReentrantLock();
        Object[] objArr = new Object[Math.min(i7, 8)];
        w5.d.e(objArr, b.f19899a, 0, 0, 6, null);
        v5.q qVar = v5.q.f22838a;
        this.f19912h = objArr;
        this.size = 0;
    }

    private final void x(int i7, E e7) {
        if (i7 < this.f19909e) {
            y(i7);
            Object[] objArr = this.f19912h;
            objArr[(this.f19913i + i7) % objArr.length] = e7;
            return;
        }
        if (p0.a()) {
            if (!(this.f19910f == e.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f19912h;
        int i8 = this.f19913i;
        objArr2[i8 % objArr2.length] = null;
        objArr2[(i7 + i8) % objArr2.length] = e7;
        this.f19913i = (i8 + 1) % objArr2.length;
    }

    private final void y(int i7) {
        Object[] objArr = this.f19912h;
        if (i7 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f19909e);
            Object[] objArr2 = new Object[min];
            if (i7 > 0) {
                int i8 = 0;
                while (true) {
                    int i9 = i8 + 1;
                    Object[] objArr3 = this.f19912h;
                    objArr2[i8] = objArr3[(this.f19913i + i8) % objArr3.length];
                    if (i9 >= i7) {
                        break;
                    } else {
                        i8 = i9;
                    }
                }
            }
            w5.d.d(objArr2, b.f19899a, i7, min);
            this.f19912h = objArr2;
            this.f19913i = 0;
        }
    }

    private final y z(int i7) {
        if (i7 < this.f19909e) {
            this.size = i7 + 1;
            return null;
        }
        int i8 = a.f19914a[this.f19910f.ordinal()];
        if (i8 == 1) {
            return b.f19901c;
        }
        if (i8 == 2) {
            return b.f19900b;
        }
        if (i8 == 3) {
            return null;
        }
        throw new v5.i();
    }

    @Override // o6.c
    protected String c() {
        return "(buffer:capacity=" + this.f19909e + ",size=" + this.size + ')';
    }

    @Override // o6.c
    protected Object i(E e7) {
        q<E> l7;
        y f7;
        ReentrantLock reentrantLock = this.f19911g;
        reentrantLock.lock();
        try {
            int i7 = this.size;
            j<?> d7 = d();
            if (d7 != null) {
                return d7;
            }
            y z6 = z(i7);
            if (z6 != null) {
                return z6;
            }
            if (i7 == 0) {
                do {
                    l7 = l();
                    if (l7 != null) {
                        if (l7 instanceof j) {
                            this.size = i7;
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
                this.size = i7;
                v5.q qVar = v5.q.f22838a;
                reentrantLock.unlock();
                l7.a(e7);
                return l7.e();
            }
            x(i7, e7);
            return b.f19900b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // o6.a
    protected boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f19911g;
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
        return this.size == 0;
    }

    @Override // o6.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f19911g;
        reentrantLock.lock();
        try {
            int i7 = this.size;
            if (i7 == 0) {
                Object d7 = d();
                if (d7 == null) {
                    d7 = b.f19902d;
                }
                return d7;
            }
            Object[] objArr = this.f19912h;
            int i8 = this.f19913i;
            Object obj = objArr[i8];
            s sVar = null;
            objArr[i8] = null;
            this.size = i7 - 1;
            Object obj2 = b.f19902d;
            if (i7 == this.f19909e) {
                s sVar2 = null;
                while (true) {
                    s m7 = m();
                    if (m7 == null) {
                        sVar = sVar2;
                        break;
                    }
                    y A = m7.A(null);
                    if (A != null) {
                        if (p0.a()) {
                            if (!(A == m6.m.f19306a)) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = m7.z();
                        sVar = m7;
                        r6 = true;
                    } else {
                        m7.B();
                        sVar2 = m7;
                    }
                }
            }
            if (obj2 != b.f19902d && !(obj2 instanceof j)) {
                this.size = i7;
                Object[] objArr2 = this.f19912h;
                objArr2[(this.f19913i + i7) % objArr2.length] = obj2;
            }
            this.f19913i = (this.f19913i + 1) % this.f19912h.length;
            v5.q qVar = v5.q.f22838a;
            if (r6) {
                kotlin.jvm.internal.i.b(sVar);
                sVar.y();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
