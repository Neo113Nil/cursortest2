package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class cz {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(cz.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(cz.class, "_state$volatile");
    public static final lm g = new lm("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public cz(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            s9.u("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        s9.u("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            boolean z = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z || atomicReferenceArray.get(i2 & i3) == null) {
                cz czVar = this;
                if (f.compareAndSet(czVar, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    cz czVar2 = czVar;
                    while ((atomicLongFieldUpdater.get(czVar2) & 1152921504606846976L) != 0) {
                        czVar2 = czVar2.c();
                        AtomicReferenceArray atomicReferenceArray2 = czVar2.d;
                        int i4 = czVar2.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof bz) && ((bz) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            czVar2 = null;
                        }
                        if (czVar2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = czVar;
            } else {
                int i5 = this.a;
                if (i5 < 1024 || ((i2 - i) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
            cz czVar = this;
            if (atomicLongFieldUpdater.compareAndSet(czVar, j, 2305843009213693952L | j)) {
                return true;
            }
            this = czVar;
        }
    }

    public final cz c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        cz czVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                czVar = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            czVar = this;
            if (atomicLongFieldUpdater.compareAndSet(czVar, j, j2)) {
                j = j2;
                break;
            }
            this = czVar;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            cz czVar2 = (cz) atomicReferenceFieldUpdater.get(czVar);
            if (czVar2 != null) {
                return czVar2;
            }
            cz czVar3 = new cz(czVar.a * 2, czVar.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = czVar.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = czVar.d.get(i4);
                if (obj == null) {
                    obj = new bz(i);
                }
                czVar3.d.set(czVar3.c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(czVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(czVar, null, czVar3) && atomicReferenceFieldUpdater.get(czVar) == null) {
            }
        }
    }

    public final Object d() {
        cz czVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(czVar);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = czVar.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = czVar.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = czVar.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof bz) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(czVar, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                czVar = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(czVar);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            czVar = czVar.c();
                        } else {
                            cz czVar2 = czVar;
                            if (f.compareAndSet(czVar2, j3, (j3 & (-1073741824)) | j2)) {
                                czVar2.d.set(i4 & czVar2.c, null);
                                czVar = null;
                            } else {
                                czVar = czVar2;
                            }
                        }
                        if (czVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
