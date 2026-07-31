package Z0;

import B0.E;
import W0.C0066f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class p extends a1.b implements d, e, a1.j {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1129i = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: h, reason: collision with root package name */
    public int f1130h;

    public p(Object obj) {
        this._state = obj;
    }

    @Override // Z0.e
    public final Object a(Object obj, I0.b bVar) {
        if (obj == null) {
            obj = a1.l.f1161a;
        }
        b(null, obj);
        return D0.h.f206a;
    }

    public final boolean b(Object obj, Object obj2) {
        int i2;
        a1.c[] cVarArr;
        E e2;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1129i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !P0.h.a(obj3, obj)) {
                return false;
            }
            if (P0.h.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f1130h;
            if ((i3 & 1) != 0) {
                this.f1130h = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f1130h = i4;
            a1.c[] cVarArr2 = this.f1141e;
            while (true) {
                r[] rVarArr = (r[]) cVarArr2;
                if (rVarArr != null) {
                    for (r rVar : rVarArr) {
                        if (rVar != null) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = r.f1133a;
                            while (true) {
                                Object obj4 = atomicReferenceFieldUpdater2.get(rVar);
                                if (obj4 != null && obj4 != (e2 = q.f1132b)) {
                                    E e3 = q.f1131a;
                                    if (obj4 != e3) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(rVar, obj4, e3)) {
                                            if (atomicReferenceFieldUpdater2.get(rVar) != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0066f) obj4).g(D0.h.f206a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(rVar, obj4, e2)) {
                                        if (atomicReferenceFieldUpdater2.get(rVar) != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f1130h;
                    if (i2 == i4) {
                        this.f1130h = i4 + 1;
                        return true;
                    }
                    cVarArr = this.f1141e;
                }
                cVarArr2 = cVarArr;
                i4 = i2;
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d4 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:17:0x00cc, B:19:0x00d4, B:22:0x00db, B:23:0x00e1, B:27:0x00e4, B:29:0x0105, B:31:0x0119, B:32:0x0133, B:38:0x0143, B:34:0x013a, B:37:0x0140, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0119 A[Catch: all -> 0x003f, TryCatch #2 {all -> 0x003f, blocks: (B:13:0x0039, B:17:0x00cc, B:19:0x00d4, B:22:0x00db, B:23:0x00e1, B:27:0x00e4, B:29:0x0105, B:31:0x0119, B:32:0x0133, B:38:0x0143, B:34:0x013a, B:37:0x0140, B:47:0x00ea, B:50:0x00f1, B:58:0x0054, B:60:0x005f, B:61:0x00bc), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0115 -> B:16:0x0117). Please report as a decompilation issue!!! */
    @Override // Z0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object m(Z0.e r17, G0.d r18) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z0.p.m(Z0.e, G0.d):java.lang.Object");
    }
}
