package p1;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1064e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1065f = AtomicLongFieldUpdater.newUpdater(o.class, "_state");

    /* renamed from: g, reason: collision with root package name */
    public static final o0.a f1066g = new o0.a(2, "REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f1067a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1069c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f1070d;

    public o(int i2, boolean z2) {
        this.f1067a = i2;
        this.f1068b = z2;
        int i3 = i2 - 1;
        this.f1069c = i3;
        this.f1070d = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            f0.l.b("Check failed.");
            throw null;
        }
        if ((i2 & i3) == 0) {
            return;
        }
        f0.l.b("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1065f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j2) != 0) {
                return (2305843009213693952L & j2) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.f1069c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            boolean z2 = this.f1068b;
            AtomicReferenceArray atomicReferenceArray = this.f1070d;
            if (z2 || atomicReferenceArray.get(i3 & i4) == null) {
                if (f1065f.compareAndSet(this, j2, ((-1152921503533105153L) & j2) | (((i3 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i3 & i4, obj);
                    o oVar = this;
                    while ((atomicLongFieldUpdater.get(oVar) & 1152921504606846976L) != 0) {
                        oVar = oVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = oVar.f1070d;
                        int i5 = oVar.f1069c & i3;
                        Object obj2 = atomicReferenceArray2.get(i5);
                        if ((obj2 instanceof n) && ((n) obj2).f1063a == i3) {
                            atomicReferenceArray2.set(i5, obj);
                        } else {
                            oVar = null;
                        }
                        if (oVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i6 = this.f1067a;
                if (i6 < 1024 || ((i3 - i2) & 1073741823) > (i6 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f1065f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final o c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        o oVar;
        while (true) {
            atomicLongFieldUpdater = f1065f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                oVar = this;
                break;
            }
            long j3 = 1152921504606846976L | j2;
            oVar = this;
            if (atomicLongFieldUpdater.compareAndSet(oVar, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1064e;
            o oVar2 = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar2 != null) {
                return oVar2;
            }
            o oVar3 = new o(oVar.f1067a * 2, oVar.f1068b);
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = oVar.f1069c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object obj = oVar.f1070d.get(i5);
                if (obj == null) {
                    obj = new n(i2);
                }
                oVar3.f1070d.set(oVar3.f1069c & i2, obj);
                i2++;
            }
            atomicLongFieldUpdater.set(oVar3, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        o oVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1065f;
            long j2 = atomicLongFieldUpdater.get(oVar);
            if ((j2 & 1152921504606846976L) != 0) {
                return f1066g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i3 = oVar.f1069c;
            int i4 = i2 & i3;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) == i4) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = oVar.f1070d;
            Object obj = atomicReferenceArray.get(i4);
            boolean z2 = oVar.f1068b;
            if (obj == null) {
                if (z2) {
                    break;
                }
            } else {
                if (obj instanceof n) {
                    break;
                }
                long j3 = (i2 + 1) & 1073741823;
                if (f1065f.compareAndSet(oVar, j2, (j2 & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                oVar = this;
                if (z2) {
                    while (true) {
                        long j4 = atomicLongFieldUpdater.get(oVar);
                        int i5 = (int) (j4 & 1073741823);
                        if ((j4 & 1152921504606846976L) != 0) {
                            oVar = oVar.c();
                        } else {
                            o oVar2 = oVar;
                            if (f1065f.compareAndSet(oVar2, j4, (j4 & (-1073741824)) | j3)) {
                                oVar2.f1070d.set(i5 & oVar2.f1069c, null);
                                oVar = null;
                            } else {
                                oVar = oVar2;
                            }
                        }
                        if (oVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
