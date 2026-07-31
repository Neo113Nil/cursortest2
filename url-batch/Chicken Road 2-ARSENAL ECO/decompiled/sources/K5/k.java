package K5;

import H5.C0147g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k5.v;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class k extends L5.a implements h, c {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1411k = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: j, reason: collision with root package name */
    public int f1412j;

    public k(Object obj) {
        this._state = obj;
    }

    @Override // K5.d
    public final Object a(Object obj, AbstractC0607c abstractC0607c) {
        e(obj);
        return v.f5219a;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:13:0x003b, B:17:0x00cf, B:19:0x00d7, B:22:0x00de, B:23:0x00e4, B:27:0x00e7, B:29:0x0108, B:31:0x011c, B:32:0x0136, B:38:0x0146, B:34:0x013d, B:37:0x0143, B:47:0x00ed, B:50:0x00f4, B:58:0x0056, B:60:0x0061, B:61:0x00c0), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011c A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:13:0x003b, B:17:0x00cf, B:19:0x00d7, B:22:0x00de, B:23:0x00e4, B:27:0x00e7, B:29:0x0108, B:31:0x011c, B:32:0x0136, B:38:0x0146, B:34:0x013d, B:37:0x0143, B:47:0x00ed, B:50:0x00f4, B:58:0x0056, B:60:0x0061, B:61:0x00c0), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0118 -> B:16:0x011a). Please report as a decompilation issue!!! */
    @Override // L5.a, K5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c(K5.d r17, o5.InterfaceC0564d r18) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K5.k.c(K5.d, o5.d):java.lang.Object");
    }

    public final void e(Object obj) {
        int i7;
        L5.b[] bVarArr;
        M5.v vVar;
        if (obj == null) {
            obj = L5.l.f1515a;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1411k;
            if (kotlin.jvm.internal.i.a(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i8 = this.f1412j;
            if ((i8 & 1) != 0) {
                this.f1412j = i8 + 2;
                return;
            }
            int i9 = i8 + 1;
            this.f1412j = i9;
            L5.b[] bVarArr2 = (L5.b[]) this.f1486i;
            while (true) {
                m[] mVarArr = (m[]) bVarArr2;
                if (mVarArr != null) {
                    for (m mVar : mVarArr) {
                        if (mVar != null) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = m.f1415a;
                            while (true) {
                                Object obj2 = atomicReferenceFieldUpdater2.get(mVar);
                                if (obj2 != null && obj2 != (vVar = l.f1414b)) {
                                    M5.v vVar2 = l.f1413a;
                                    if (obj2 != vVar2) {
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(mVar, obj2, vVar2)) {
                                            if (atomicReferenceFieldUpdater2.get(mVar) != obj2) {
                                                break;
                                            }
                                        }
                                        ((C0147g) obj2).resumeWith(v.f5219a);
                                        break;
                                    }
                                    while (!atomicReferenceFieldUpdater2.compareAndSet(mVar, obj2, vVar)) {
                                        if (atomicReferenceFieldUpdater2.get(mVar) != obj2) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f1412j;
                    if (i7 == i9) {
                        this.f1412j = i9 + 1;
                        return;
                    }
                    bVarArr = (L5.b[]) this.f1486i;
                }
                bVarArr2 = bVarArr;
                i9 = i7;
            }
        }
    }
}
