package je;

import ge.c1;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l0 extends ke.b implements e, ke.n, j0, f {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5198t = AtomicReferenceFieldUpdater.newUpdater(l0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: s, reason: collision with root package name */
    public int f5199s;

    public l0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // ke.n
    public final e a(CoroutineContext coroutineContext, int i3, ie.a aVar) {
        return ((((i3 < 0 || i3 >= 2) && i3 != -2) || aVar != ie.a.f4713e) && !((i3 == 0 || i3 == -3) && aVar == ie.a.f4712d)) ? new ke.h(this, coroutineContext, i3, aVar) : this;
    }

    @Override // je.f
    public final Object b(Object obj, ld.a aVar) {
        j(obj);
        return Unit.f5554a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (r13.equals(r14) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        if (r14 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006c, code lost:
    
        if (kotlin.Unit.f5554a == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x006c, B:16:0x0074, B:19:0x007b, B:20:0x007f, B:24:0x0082, B:26:0x00a3, B:29:0x00b3, B:30:0x00cd, B:36:0x00e1, B:41:0x00ea, B:32:0x00d4, B:35:0x00da, B:46:0x0088, B:49:0x008f, B:57:0x0047, B:59:0x004f, B:60:0x005d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x006c, B:16:0x0074, B:19:0x007b, B:20:0x007f, B:24:0x0082, B:26:0x00a3, B:29:0x00b3, B:30:0x00cd, B:36:0x00e1, B:41:0x00ea, B:32:0x00d4, B:35:0x00da, B:46:0x0088, B:49:0x008f, B:57:0x0047, B:59:0x004f, B:60:0x005d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b2 -> B:14:0x006c). Please report as a decompilation issue!!! */
    @Override // je.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(f fVar, ld.a aVar) {
        k0 k0Var;
        md.a aVar2;
        int i3;
        m0 m0Var;
        f fVar2;
        c1 c1Var;
        Object obj;
        Object andSet;
        Object obj2;
        try {
            if (aVar instanceof k0) {
                k0Var = (k0) aVar;
                int i10 = k0Var.f5194v;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    k0Var.f5194v = i10 - Integer.MIN_VALUE;
                    Object obj3 = k0Var.f5192t;
                    aVar2 = md.a.f6622d;
                    i3 = k0Var.f5194v;
                    if (i3 != 0) {
                        cf.c.M(obj3);
                        m0Var = (m0) d();
                    } else if (i3 == 1) {
                        m0Var = k0Var.f5188e;
                        fVar = k0Var.f5187d;
                        cf.c.M(obj3);
                    } else if (i3 == 2) {
                        obj = k0Var.f5191s;
                        c1Var = k0Var.f5189i;
                        m0Var = k0Var.f5188e;
                        fVar2 = k0Var.f5187d;
                        cf.c.M(obj3);
                        AtomicReference atomicReference = m0Var.f5204a;
                        a8.f fVar3 = b0.f5142b;
                        andSet = atomicReference.getAndSet(fVar3);
                        andSet.getClass();
                        if (andSet == b0.f5143c) {
                        }
                        Object obj4 = f5198t.get(this);
                        if (c1Var != null) {
                        }
                        if (obj4 == ke.c.f5511b) {
                        }
                        k0Var.f5187d = fVar2;
                        k0Var.f5188e = m0Var;
                        k0Var.f5189i = c1Var;
                        k0Var.f5190r = null;
                        k0Var.f5191s = obj4;
                        k0Var.f5194v = 2;
                        if (fVar2.b(obj2, k0Var) == aVar2) {
                        }
                    } else {
                        if (i3 != 3) {
                            kotlin.collections.i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = k0Var.f5190r;
                        c1Var = k0Var.f5189i;
                        m0Var = k0Var.f5188e;
                        fVar2 = k0Var.f5187d;
                        cf.c.M(obj3);
                        Object obj42 = f5198t.get(this);
                        if (c1Var != null && !c1Var.d()) {
                            throw c1Var.x();
                        }
                        obj2 = obj42 == ke.c.f5511b ? null : obj42;
                        k0Var.f5187d = fVar2;
                        k0Var.f5188e = m0Var;
                        k0Var.f5189i = c1Var;
                        k0Var.f5190r = null;
                        k0Var.f5191s = obj42;
                        k0Var.f5194v = 2;
                        if (fVar2.b(obj2, k0Var) == aVar2) {
                            return aVar2;
                        }
                        obj = obj42;
                        AtomicReference atomicReference2 = m0Var.f5204a;
                        a8.f fVar32 = b0.f5142b;
                        andSet = atomicReference2.getAndSet(fVar32);
                        andSet.getClass();
                        if (andSet == b0.f5143c) {
                            k0Var.f5187d = fVar2;
                            k0Var.f5188e = m0Var;
                            k0Var.f5189i = c1Var;
                            k0Var.f5190r = obj;
                            k0Var.f5191s = null;
                            k0Var.f5194v = 3;
                            ge.h hVar = new ge.h(1, md.f.b(k0Var));
                            hVar.s();
                            AtomicReference atomicReference3 = m0Var.f5204a;
                            while (true) {
                                if (atomicReference3.compareAndSet(fVar32, hVar)) {
                                    break;
                                }
                                if (atomicReference3.get() != fVar32) {
                                    hd.l lVar = hd.n.f4511e;
                                    hVar.resumeWith(Unit.f5554a);
                                    break;
                                }
                            }
                            Object r9 = hVar.r();
                            if (r9 != md.a.f6622d) {
                            }
                        }
                        Object obj422 = f5198t.get(this);
                        if (c1Var != null) {
                            throw c1Var.x();
                        }
                        if (obj422 == ke.c.f5511b) {
                        }
                        k0Var.f5187d = fVar2;
                        k0Var.f5188e = m0Var;
                        k0Var.f5189i = c1Var;
                        k0Var.f5190r = null;
                        k0Var.f5191s = obj422;
                        k0Var.f5194v = 2;
                        if (fVar2.b(obj2, k0Var) == aVar2) {
                        }
                    }
                    fVar2 = fVar;
                    c1Var = (c1) k0Var.getContext().m(ge.u.f4403e);
                    obj = null;
                    Object obj4222 = f5198t.get(this);
                    if (c1Var != null) {
                    }
                    if (obj4222 == ke.c.f5511b) {
                    }
                    k0Var.f5187d = fVar2;
                    k0Var.f5188e = m0Var;
                    k0Var.f5189i = c1Var;
                    k0Var.f5190r = null;
                    k0Var.f5191s = obj4222;
                    k0Var.f5194v = 2;
                    if (fVar2.b(obj2, k0Var) == aVar2) {
                    }
                }
            }
            if (i3 != 0) {
            }
            fVar2 = fVar;
            c1Var = (c1) k0Var.getContext().m(ge.u.f4403e);
            obj = null;
            Object obj42222 = f5198t.get(this);
            if (c1Var != null) {
            }
            if (obj42222 == ke.c.f5511b) {
            }
            k0Var.f5187d = fVar2;
            k0Var.f5188e = m0Var;
            k0Var.f5189i = c1Var;
            k0Var.f5190r = null;
            k0Var.f5191s = obj42222;
            k0Var.f5194v = 2;
            if (fVar2.b(obj2, k0Var) == aVar2) {
            }
        } catch (Throwable th) {
            g(m0Var);
            throw th;
        }
        k0Var = new k0(this, aVar);
        Object obj32 = k0Var.f5192t;
        aVar2 = md.a.f6622d;
        i3 = k0Var.f5194v;
    }

    @Override // ke.b
    public final ke.d e() {
        return new m0();
    }

    @Override // ke.b
    public final ke.d[] f() {
        return new m0[2];
    }

    @Override // je.j0
    public final Object getValue() {
        a8.f fVar = ke.c.f5511b;
        Object obj = f5198t.get(this);
        if (obj == fVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        a8.f fVar = ke.c.f5511b;
        if (obj == null) {
            obj = fVar;
        }
        if (obj2 == null) {
            obj2 = fVar;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = ke.c.f5511b;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i3;
        ke.d[] dVarArr;
        a8.f fVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5198t;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.a(obj3, obj)) {
                return false;
            }
            if (Intrinsics.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f5199s;
            if ((i10 & 1) != 0) {
                this.f5199s = i10 + 2;
                return true;
            }
            int i11 = i10 + 1;
            this.f5199s = i11;
            ke.d[] dVarArr2 = this.f5506d;
            while (true) {
                m0[] m0VarArr = (m0[]) dVarArr2;
                if (m0VarArr != null) {
                    for (m0 m0Var : m0VarArr) {
                        if (m0Var != null) {
                            AtomicReference atomicReference = m0Var.f5204a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (fVar = b0.f5143c)) {
                                    a8.f fVar2 = b0.f5142b;
                                    if (obj4 != fVar2) {
                                        while (!atomicReference.compareAndSet(obj4, fVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        Unit unit = Unit.f5554a;
                                        hd.l lVar = hd.n.f4511e;
                                        ((ge.h) obj4).resumeWith(unit);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, fVar)) {
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
                    i3 = this.f5199s;
                    if (i3 == i11) {
                        this.f5199s = i11 + 1;
                        return true;
                    }
                    dVarArr = this.f5506d;
                }
                dVarArr2 = dVarArr;
                i11 = i3;
            }
        }
    }
}
