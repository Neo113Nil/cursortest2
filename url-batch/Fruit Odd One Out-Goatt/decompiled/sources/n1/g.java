package n1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class g implements c, d {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f962e = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: a, reason: collision with root package name */
    public i[] f963a;

    /* renamed from: b, reason: collision with root package name */
    public int f964b;

    /* renamed from: c, reason: collision with root package name */
    public int f965c;

    /* renamed from: d, reason: collision with root package name */
    public int f966d;

    public g(Object obj) {
        this._state = obj;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cb A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:13:0x003b, B:17:0x00c3, B:19:0x00cb, B:22:0x00d2, B:23:0x00d6, B:27:0x00d9, B:29:0x00fa, B:31:0x010e, B:32:0x0128, B:38:0x0138, B:34:0x012f, B:37:0x0135, B:47:0x00df, B:50:0x00e6, B:58:0x0055, B:60:0x0060, B:61:0x00b3), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010e A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:13:0x003b, B:17:0x00c3, B:19:0x00cb, B:22:0x00d2, B:23:0x00d6, B:27:0x00d9, B:29:0x00fa, B:31:0x010e, B:32:0x0128, B:38:0x0138, B:34:0x012f, B:37:0x0135, B:47:0x00df, B:50:0x00e6, B:58:0x0055, B:60:0x0060, B:61:0x00b3), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x010a -> B:16:0x010c). Please report as a decompilation issue!!! */
    @Override // n1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(n1.d r17, v0.d r18) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.g.a(n1.d, v0.d):java.lang.Object");
    }

    @Override // n1.d
    public final Object b(Object obj, x0.b bVar) {
        c(obj);
        return t0.g.f1178a;
    }

    public final void c(Object obj) {
        int i2;
        i[] iVarArr;
        o0.a aVar;
        if (obj == null) {
            obj = o1.c.f1027a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f962e;
            if (d1.h.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i3 = this.f966d;
            if ((i3 & 1) != 0) {
                this.f966d = i3 + 2;
                return;
            }
            int i4 = i3 + 1;
            this.f966d = i4;
            i[] iVarArr2 = this.f963a;
            while (true) {
                if (iVarArr2 != null) {
                    for (i iVar : iVarArr2) {
                        if (iVar != null) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i.f969a;
                            while (true) {
                                Object obj2 = atomicReferenceFieldUpdater2.get(iVar);
                                if (obj2 != null && obj2 != (aVar = h.f968b)) {
                                    o0.a aVar2 = h.f967a;
                                    if (obj2 != aVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(iVar, obj2, aVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(iVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((k1.d) obj2).f(t0.g.f1178a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(iVar, obj2, aVar)) {
                                        if (atomicReferenceFieldUpdater2.get(iVar) != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f966d;
                    if (i2 == i4) {
                        this.f966d = i4 + 1;
                        return;
                    }
                    iVarArr = this.f963a;
                }
                iVarArr2 = iVarArr;
                i4 = i2;
            }
        }
    }
}
