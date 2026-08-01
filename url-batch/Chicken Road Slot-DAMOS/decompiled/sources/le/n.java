package le;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.i0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5989e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f5990f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");
    public static final a8.f g = new a8.f("REMOVE_FROZEN", 3);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f5991a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5992b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f5994d;

    public n(int i3, boolean z10) {
        this.f5991a = i3;
        this.f5992b = z10;
        int i10 = i3 - 1;
        this.f5993c = i10;
        this.f5994d = new AtomicReferenceArray(i3);
        if (i10 > 1073741823) {
            i0.l("Check failed.");
            throw null;
        }
        if ((i3 & i10) == 0) {
            return;
        }
        i0.l("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5990f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i3 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            int i11 = this.f5993c;
            if (((i10 + 2) & i11) == (i3 & i11)) {
                return 1;
            }
            boolean z10 = this.f5992b;
            AtomicReferenceArray atomicReferenceArray = this.f5994d;
            if (z10 || atomicReferenceArray.get(i10 & i11) == null) {
                if (f5990f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i10 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i10 & i11, obj);
                    n nVar = this;
                    while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                        nVar = nVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVar.f5994d;
                        int i12 = nVar.f5993c & i10;
                        Object obj2 = atomicReferenceArray2.get(i12);
                        if ((obj2 instanceof m) && ((m) obj2).f5988a == i10) {
                            atomicReferenceArray2.set(i12, obj);
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i13 = this.f5991a;
                if (i13 < 1024 || ((i10 - i3) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f5990f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f5990f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j3 = 1152921504606846976L | j;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j, j3)) {
                j = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5989e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f5991a * 2, nVar.f5992b);
            int i3 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i11 = nVar.f5993c;
                int i12 = i3 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = nVar.f5994d.get(i12);
                if (obj == null) {
                    obj = new m(i3);
                }
                nVar3.f5994d.set(nVar3.f5993c & i3, obj);
                i3++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f5990f;
            long j = atomicLongFieldUpdater.get(nVar);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i3 = (int) (j & 1073741823);
            int i10 = nVar.f5993c;
            int i11 = i3 & i10;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i10) == i11) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f5994d;
            Object obj = atomicReferenceArray.get(i11);
            boolean z10 = nVar.f5992b;
            if (obj == null) {
                if (z10) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j3 = (i3 + 1) & 1073741823;
                if (f5990f.compareAndSet(nVar, j, (j & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i11, null);
                    return obj;
                }
                nVar = this;
                if (z10) {
                    while (true) {
                        long j10 = atomicLongFieldUpdater.get(nVar);
                        int i12 = (int) (j10 & 1073741823);
                        if ((j10 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            if (f5990f.compareAndSet(nVar2, j10, (j10 & (-1073741824)) | j3)) {
                                nVar2.f5994d.set(i12 & nVar2.f5993c, null);
                                nVar = null;
                            } else {
                                nVar = nVar2;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
