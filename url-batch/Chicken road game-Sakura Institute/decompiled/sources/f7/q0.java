package f7;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q0 extends g7.b implements x, f, g7.s {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3543k = AtomicReferenceFieldUpdater.newUpdater(q0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: j, reason: collision with root package name */
    public int f3544j;

    public q0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // g7.s
    public final f a(h6.i iVar, int i7, e7.a aVar) {
        return (((i7 < 0 || i7 >= 2) && i7 != -2) || aVar != e7.a.f2834g) ? f0.l(this, iVar, i7, aVar) : this;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00e0, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00e0, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:15:0x007d). Please report as a decompilation issue!!! */
    @Override // f7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object b(f7.g r18, h6.d r19) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.q0.b(f7.g, h6.d):java.lang.Object");
    }

    @Override // g7.b
    public final g7.d d() {
        return new r0();
    }

    @Override // g7.b
    public final g7.d[] e() {
        return new r0[2];
    }

    @Override // f7.o0
    public final Object getValue() {
        h7.s sVar = g7.c.f4481b;
        Object obj = f3543k.get(this);
        if (obj == sVar) {
            return null;
        }
        return obj;
    }

    @Override // f7.w
    public final void h() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // f7.w
    public final boolean i(Object obj) {
        l(null, obj);
        return true;
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = g7.c.f4481b;
        }
        l(null, obj);
    }

    @Override // f7.g
    public final Object k(Object obj, h6.d dVar) {
        j(obj);
        return d6.z.f2639a;
    }

    public final boolean l(Object obj, Object obj2) {
        int i7;
        g7.d[] dVarArr;
        h7.s sVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3543k;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !r6.k.a(obj3, obj)) {
                return false;
            }
            if (r6.k.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i8 = this.f3544j;
            if ((i8 & 1) != 0) {
                this.f3544j = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f3544j = i9;
            g7.d[] dVarArr2 = this.f4476f;
            while (true) {
                r0[] r0VarArr = (r0[]) dVarArr2;
                if (r0VarArr != null) {
                    for (r0 r0Var : r0VarArr) {
                        if (r0Var != null) {
                            AtomicReference atomicReference = r0Var.f3550a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (sVar = f0.f3471c)) {
                                    h7.s sVar2 = f0.f3470b;
                                    if (obj4 != sVar2) {
                                        while (!atomicReference.compareAndSet(obj4, sVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((c7.h) obj4).resumeWith(d6.z.f2639a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, sVar)) {
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
                    i7 = this.f3544j;
                    if (i7 == i9) {
                        this.f3544j = i9 + 1;
                        return true;
                    }
                    dVarArr = this.f4476f;
                }
                dVarArr2 = dVarArr;
                i9 = i7;
            }
        }
    }
}
