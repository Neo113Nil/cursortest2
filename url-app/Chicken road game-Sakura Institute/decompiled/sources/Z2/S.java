package Z2;

import W2.C0286h;
import W2.C0299v;
import W2.InterfaceC0280c0;
import a3.AbstractC0424b;
import a3.AbstractC0425c;
import a3.AbstractC0426d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import y2.AbstractC1341p;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class S extends AbstractC0424b implements z, InterfaceC0330f, a3.q {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4659l = AtomicReferenceFieldUpdater.newUpdater(S.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: k, reason: collision with root package name */
    public int f4660k;

    public S(Object obj) {
        this._state$volatile = obj;
    }

    @Override // Z2.y
    public final void a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // Z2.y
    public final boolean b(Object obj) {
        k(obj);
        return true;
    }

    @Override // a3.q
    public final InterfaceC0330f c(CoroutineContext coroutineContext, int i2, Y2.a aVar) {
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || aVar != Y2.a.f4399e) ? H.l(this, coroutineContext, i2, aVar) : this;
    }

    @Override // Z2.InterfaceC0331g
    public final Object d(Object obj, C2.a aVar) {
        k(obj);
        return Unit.f7487a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0090, code lost:
    
        if (r11.equals(r12) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:15:0x0076, B:17:0x007e, B:20:0x0085, B:21:0x0089, B:25:0x008c, B:27:0x00ad, B:30:0x00bd, B:33:0x0092, B:36:0x0099, B:44:0x004d, B:46:0x0057, B:47:0x0066), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:15:0x0076, B:17:0x007e, B:20:0x0085, B:21:0x0089, B:25:0x008c, B:27:0x00ad, B:30:0x00bd, B:33:0x0092, B:36:0x0099, B:44:0x004d, B:46:0x0057, B:47:0x0066), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bc -> B:15:0x0076). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00cd -> B:15:0x0076). Please report as a decompilation issue!!! */
    @Override // Z2.InterfaceC0330f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(InterfaceC0331g interfaceC0331g, C2.a aVar) {
        Q q2;
        D2.a aVar2;
        int i2;
        S s4;
        T t4;
        InterfaceC0331g interfaceC0331g2;
        InterfaceC0280c0 interfaceC0280c0;
        Object obj;
        Object andSet;
        Object obj2;
        try {
            if (aVar instanceof Q) {
                q2 = (Q) aVar;
                int i4 = q2.f4658q;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    q2.f4658q = i4 - Integer.MIN_VALUE;
                    Object obj3 = q2.f4656o;
                    aVar2 = D2.a.f2163d;
                    i2 = q2.f4658q;
                    if (i2 != 0) {
                        AbstractC1343r.b(obj3);
                        s4 = this;
                        t4 = (T) f();
                    } else if (i2 == 1) {
                        t4 = q2.f4653l;
                        interfaceC0331g = q2.f4652k;
                        s4 = q2.f4651j;
                        AbstractC1343r.b(obj3);
                    } else if (i2 == 2) {
                        obj = q2.f4655n;
                        interfaceC0280c0 = q2.f4654m;
                        t4 = q2.f4653l;
                        interfaceC0331g2 = q2.f4652k;
                        s4 = q2.f4651j;
                        AbstractC1343r.b(obj3);
                        andSet = t4.f4661a.getAndSet(H.f4633b);
                        Intrinsics.c(andSet);
                        if (andSet == H.f4634c) {
                        }
                        Object obj4 = f4659l.get(s4);
                        if (interfaceC0280c0 != null) {
                        }
                        if (obj4 == AbstractC0425c.f4947b) {
                        }
                        q2.f4651j = s4;
                        q2.f4652k = interfaceC0331g2;
                        q2.f4653l = t4;
                        q2.f4654m = interfaceC0280c0;
                        q2.f4655n = obj4;
                        q2.f4658q = 2;
                        if (interfaceC0331g2.d(obj2, q2) == aVar2) {
                        }
                    } else {
                        if (i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = q2.f4655n;
                        interfaceC0280c0 = q2.f4654m;
                        t4 = q2.f4653l;
                        interfaceC0331g2 = q2.f4652k;
                        s4 = q2.f4651j;
                        AbstractC1343r.b(obj3);
                        Object obj42 = f4659l.get(s4);
                        if (interfaceC0280c0 != null && !interfaceC0280c0.b()) {
                            throw interfaceC0280c0.g();
                        }
                        obj2 = obj42 == AbstractC0425c.f4947b ? null : obj42;
                        q2.f4651j = s4;
                        q2.f4652k = interfaceC0331g2;
                        q2.f4653l = t4;
                        q2.f4654m = interfaceC0280c0;
                        q2.f4655n = obj42;
                        q2.f4658q = 2;
                        if (interfaceC0331g2.d(obj2, q2) == aVar2) {
                            return aVar2;
                        }
                        obj = obj42;
                        andSet = t4.f4661a.getAndSet(H.f4633b);
                        Intrinsics.c(andSet);
                        if (andSet == H.f4634c) {
                            q2.f4651j = s4;
                            q2.f4652k = interfaceC0331g2;
                            q2.f4653l = t4;
                            q2.f4654m = interfaceC0280c0;
                            q2.f4655n = obj;
                            q2.f4658q = 3;
                            if (t4.c(q2) == aVar2) {
                                return aVar2;
                            }
                        }
                        Object obj422 = f4659l.get(s4);
                        if (interfaceC0280c0 != null) {
                            throw interfaceC0280c0.g();
                        }
                        if (obj422 == AbstractC0425c.f4947b) {
                        }
                        q2.f4651j = s4;
                        q2.f4652k = interfaceC0331g2;
                        q2.f4653l = t4;
                        q2.f4654m = interfaceC0280c0;
                        q2.f4655n = obj422;
                        q2.f4658q = 2;
                        if (interfaceC0331g2.d(obj2, q2) == aVar2) {
                        }
                    }
                    CoroutineContext coroutineContext = q2.f2311e;
                    Intrinsics.c(coroutineContext);
                    interfaceC0331g2 = interfaceC0331g;
                    interfaceC0280c0 = (InterfaceC0280c0) coroutineContext.k(C0299v.f4296e);
                    obj = null;
                    Object obj4222 = f4659l.get(s4);
                    if (interfaceC0280c0 != null) {
                    }
                    if (obj4222 == AbstractC0425c.f4947b) {
                    }
                    q2.f4651j = s4;
                    q2.f4652k = interfaceC0331g2;
                    q2.f4653l = t4;
                    q2.f4654m = interfaceC0280c0;
                    q2.f4655n = obj4222;
                    q2.f4658q = 2;
                    if (interfaceC0331g2.d(obj2, q2) == aVar2) {
                    }
                }
            }
            if (i2 != 0) {
            }
            CoroutineContext coroutineContext2 = q2.f2311e;
            Intrinsics.c(coroutineContext2);
            interfaceC0331g2 = interfaceC0331g;
            interfaceC0280c0 = (InterfaceC0280c0) coroutineContext2.k(C0299v.f4296e);
            obj = null;
            Object obj42222 = f4659l.get(s4);
            if (interfaceC0280c0 != null) {
            }
            if (obj42222 == AbstractC0425c.f4947b) {
            }
            q2.f4651j = s4;
            q2.f4652k = interfaceC0331g2;
            q2.f4653l = t4;
            q2.f4654m = interfaceC0280c0;
            q2.f4655n = obj42222;
            q2.f4658q = 2;
            if (interfaceC0331g2.d(obj2, q2) == aVar2) {
            }
        } catch (Throwable th) {
            s4.i(t4);
            throw th;
        }
        q2 = new Q(this, aVar);
        Object obj32 = q2.f4656o;
        aVar2 = D2.a.f2163d;
        i2 = q2.f4658q;
    }

    @Override // a3.AbstractC0424b
    public final AbstractC0426d g() {
        return new T();
    }

    @Override // Z2.P
    public final Object getValue() {
        b3.t tVar = AbstractC0425c.f4947b;
        Object obj = f4659l.get(this);
        if (obj == tVar) {
            return null;
        }
        return obj;
    }

    @Override // a3.AbstractC0424b
    public final AbstractC0426d[] h() {
        return new T[2];
    }

    public final void k(Object obj) {
        if (obj == null) {
            obj = AbstractC0425c.f4947b;
        }
        l(null, obj);
    }

    public final boolean l(Object obj, Object obj2) {
        int i2;
        AbstractC0426d[] abstractC0426dArr;
        b3.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4659l;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.a(obj3, obj)) {
                return false;
            }
            if (Intrinsics.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.f4660k;
            if ((i4 & 1) != 0) {
                this.f4660k = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.f4660k = i5;
            AbstractC0426d[] abstractC0426dArr2 = this.f4942d;
            Unit unit = Unit.f7487a;
            while (true) {
                T[] tArr = (T[]) abstractC0426dArr2;
                if (tArr != null) {
                    for (T t4 : tArr) {
                        if (t4 != null) {
                            AtomicReference atomicReference = t4.f4661a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (tVar = H.f4634c)) {
                                    b3.t tVar2 = H.f4633b;
                                    if (obj4 != tVar2) {
                                        while (!atomicReference.compareAndSet(obj4, tVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        AbstractC1341p.a aVar = AbstractC1341p.f11673d;
                                        ((C0286h) obj4).u(Unit.f7487a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, tVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f4660k;
                    if (i2 == i5) {
                        this.f4660k = i5 + 1;
                        return true;
                    }
                    abstractC0426dArr = this.f4942d;
                    Unit unit2 = Unit.f7487a;
                }
                abstractC0426dArr2 = abstractC0426dArr;
                i5 = i2;
            }
        }
    }
}
