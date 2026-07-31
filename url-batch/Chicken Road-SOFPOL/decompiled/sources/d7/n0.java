package d7;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n0 extends e7.b implements w, f, e7.n {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(n0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: h, reason: collision with root package name */
    public int f2402h;

    public n0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // d7.g
    public final Object a(Object obj, g6.c cVar) {
        i(obj);
        return c6.m.f1757a;
    }

    @Override // e7.n
    public final f b(g6.h hVar, int i8, c7.a aVar) {
        return (((i8 < 0 || i8 >= 2) && i8 != -2) || aVar != c7.a.f1761e) ? e0.i(this, hVar, i8, aVar) : this;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00e1, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00e1, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c4 -> B:15:0x007e). Please report as a decompilation issue!!! */
    @Override // d7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(d7.g r18, g6.c r19) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.n0.c(d7.g, g6.c):java.lang.Object");
    }

    @Override // e7.b
    public final e7.d e() {
        return new o0();
    }

    @Override // e7.b
    public final e7.d[] f() {
        return new o0[2];
    }

    @Override // d7.l0
    public final Object getValue() {
        d4.t tVar = e7.c.f2544b;
        Object obj = i.get(this);
        if (obj == tVar) {
            return null;
        }
        return obj;
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = e7.c.f2544b;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i8;
        e7.d[] dVarArr;
        d4.t tVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !q6.i.a(obj3, obj)) {
                return false;
            }
            if (q6.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i9 = this.f2402h;
            if ((i9 & 1) != 0) {
                this.f2402h = i9 + 2;
                return true;
            }
            int i10 = i9 + 1;
            this.f2402h = i10;
            e7.d[] dVarArr2 = this.f2539d;
            while (true) {
                o0[] o0VarArr = (o0[]) dVarArr2;
                if (o0VarArr != null) {
                    for (o0 o0Var : o0VarArr) {
                        if (o0Var != null) {
                            AtomicReference atomicReference = o0Var.f2407a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (tVar = e0.f2357c)) {
                                    d4.t tVar2 = e0.f2356b;
                                    if (obj4 != tVar2) {
                                        while (!atomicReference.compareAndSet(obj4, tVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((a7.h) obj4).k(c6.m.f1757a);
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
                    i8 = this.f2402h;
                    if (i8 == i10) {
                        this.f2402h = i10 + 1;
                        return true;
                    }
                    dVarArr = this.f2539d;
                }
                dVarArr2 = dVarArr;
                i10 = i8;
            }
        }
    }
}
