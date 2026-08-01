package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class cu {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(cu.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(cu.class, "_state$volatile");
    public static final xj g = new xj("REMOVE_FROZEN", 1);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public cu(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            g9.s("Check failed.");
            throw null;
        }
        if ((i & i2) == 0) {
            return;
        }
        g9.s("Check failed.");
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
                cu cuVar = this;
                if (f.compareAndSet(cuVar, j, ((-1152921503533105153L) & j) | (((i2 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i2 & i3, obj);
                    cu cuVar2 = cuVar;
                    while ((atomicLongFieldUpdater.get(cuVar2) & 1152921504606846976L) != 0) {
                        cuVar2 = cuVar2.c();
                        AtomicReferenceArray atomicReferenceArray2 = cuVar2.d;
                        int i4 = cuVar2.c & i2;
                        Object obj2 = atomicReferenceArray2.get(i4);
                        if ((obj2 instanceof bu) && ((bu) obj2).a == i2) {
                            atomicReferenceArray2.set(i4, obj);
                        } else {
                            cuVar2 = null;
                        }
                        if (cuVar2 == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
                this = cuVar;
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
            cu cuVar = this;
            if (atomicLongFieldUpdater.compareAndSet(cuVar, j, 2305843009213693952L | j)) {
                return true;
            }
            this = cuVar;
        }
    }

    public final cu c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        cu cuVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                cuVar = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            cuVar = this;
            if (atomicLongFieldUpdater.compareAndSet(cuVar, j, j2)) {
                j = j2;
                break;
            }
            this = cuVar;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            cu cuVar2 = (cu) atomicReferenceFieldUpdater.get(cuVar);
            if (cuVar2 != null) {
                return cuVar2;
            }
            cu cuVar3 = new cu(cuVar.a * 2, cuVar.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = cuVar.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = cuVar.d.get(i4);
                if (obj == null) {
                    obj = new bu(i);
                }
                cuVar3.d.set(cuVar3.c & i, obj);
                i++;
            }
            atomicLongFieldUpdater.set(cuVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(cuVar, null, cuVar3) && atomicReferenceFieldUpdater.get(cuVar) == null) {
            }
        }
    }

    public final Object d() {
        cu cuVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(cuVar);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i = (int) (j & 1073741823);
            int i2 = cuVar.c;
            int i3 = i & i2;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == i3) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = cuVar.d;
            Object obj = atomicReferenceArray.get(i3);
            boolean z = cuVar.b;
            if (obj == null) {
                if (z) {
                    break;
                }
            } else {
                if (obj instanceof bu) {
                    break;
                }
                long j2 = (i + 1) & 1073741823;
                if (f.compareAndSet(cuVar, j, (j & (-1073741824)) | j2)) {
                    atomicReferenceArray.set(i3, null);
                    return obj;
                }
                cuVar = this;
                if (z) {
                    while (true) {
                        long j3 = atomicLongFieldUpdater.get(cuVar);
                        int i4 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            cuVar = cuVar.c();
                        } else {
                            cu cuVar2 = cuVar;
                            if (f.compareAndSet(cuVar2, j3, (j3 & (-1073741824)) | j2)) {
                                cuVar2.d.set(i4 & cuVar2.c, null);
                                cuVar = null;
                            } else {
                                cuVar = cuVar2;
                            }
                        }
                        if (cuVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
