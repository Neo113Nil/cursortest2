package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class z81 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(z81.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater c;
    public static final /* synthetic */ AtomicReferenceFieldUpdater d;
    public static final /* synthetic */ AtomicLongFieldUpdater e;
    public static final /* synthetic */ AtomicIntegerFieldUpdater f;
    public static final /* synthetic */ long g;
    public static final /* synthetic */ long h;
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final pk1 a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    static {
        Unsafe unsafe = n51.a;
        g = unsafe.objectFieldOffset(z81.class.getDeclaredField("head$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(z81.class, "deqIdx$volatile");
        d = AtomicReferenceFieldUpdater.newUpdater(z81.class, Object.class, "tail$volatile");
        h = unsafe.objectFieldOffset(z81.class.getDeclaredField("tail$volatile"));
        e = AtomicLongFieldUpdater.newUpdater(z81.class, "enqIdx$volatile");
        f = AtomicIntegerFieldUpdater.newUpdater(z81.class, "_availablePermits$volatile");
    }

    public z81() {
        b91 b91Var = new b91(0L, null, 2);
        this.head$volatile = b91Var;
        this.tail$volatile = b91Var;
        this._availablePermits$volatile = 1;
        this.a = new pk1(3, this);
    }

    public final boolean a(no0 no0Var) {
        Object I;
        Unsafe unsafe;
        z81 z81Var = this;
        d.getClass();
        Unsafe unsafe2 = n51.a;
        long j = h;
        b91 b91Var = (b91) unsafe2.getObjectVolatile(z81Var, j);
        long andIncrement = e.getAndIncrement(z81Var);
        x81 x81Var = x81.m;
        long j2 = andIncrement / a91.f;
        loop0: while (true) {
            I = yr1.I(b91Var, j2, x81Var);
            if (t90.t(I)) {
                break;
            }
            e81 s = t90.s(I);
            while (true) {
                e81 e81Var = (e81) n51.a.getObjectVolatile(z81Var, j);
                if (e81Var.e >= s.e) {
                    z81Var = this;
                    break loop0;
                }
                if (!s.n()) {
                    break;
                }
                do {
                    unsafe = n51.a;
                    z81Var = this;
                    if (unsafe.compareAndSwapObject(z81Var, h, e81Var, s)) {
                        if (e81Var.j()) {
                            e81Var.h();
                        }
                    }
                } while (unsafe.getObjectVolatile(z81Var, j) == e81Var);
                if (s.j()) {
                    s.h();
                }
            }
            z81Var = this;
        }
        b91 b91Var2 = (b91) t90.s(I);
        AtomicReferenceArray atomicReferenceArray = b91Var2.g;
        int i = (int) (andIncrement % a91.f);
        while (!atomicReferenceArray.compareAndSet(i, null, no0Var)) {
            if (atomicReferenceArray.get(i) != null) {
                fv fvVar = a91.b;
                fv fvVar2 = a91.c;
                while (!atomicReferenceArray.compareAndSet(i, fvVar, fvVar2)) {
                    if (atomicReferenceArray.get(i) != fvVar) {
                        return false;
                    }
                }
                no0Var.n(Unit.a, z81Var.a);
                return true;
            }
        }
        no0Var.a(b91Var2, i);
        return true;
    }

    public final void b() {
        int i;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            if (andIncrement >= 1) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!c());
    }

    public final boolean c() {
        Object I;
        Unsafe unsafe;
        b.getClass();
        Unsafe unsafe2 = n51.a;
        long j = g;
        b91 b91Var = (b91) unsafe2.getObjectVolatile(this, j);
        long andIncrement = c.getAndIncrement(this);
        long j2 = andIncrement / a91.f;
        y81 y81Var = y81.m;
        loop0: while (true) {
            I = yr1.I(b91Var, j2, y81Var);
            if (t90.t(I)) {
                break;
            }
            e81 s = t90.s(I);
            while (true) {
                e81 e81Var = (e81) n51.a.getObjectVolatile(this, j);
                if (e81Var.e >= s.e) {
                    break loop0;
                }
                if (!s.n()) {
                    break;
                }
                do {
                    unsafe = n51.a;
                    if (unsafe.compareAndSwapObject(this, g, e81Var, s)) {
                        if (e81Var.j()) {
                            e81Var.h();
                        }
                    }
                } while (unsafe.getObjectVolatile(this, j) == e81Var);
                if (s.j()) {
                    s.h();
                }
            }
        }
        b91 b91Var2 = (b91) t90.s(I);
        AtomicReferenceArray atomicReferenceArray = b91Var2.g;
        b91Var2.a();
        boolean z = false;
        if (b91Var2.e <= j2) {
            int i = (int) (andIncrement % a91.f);
            Object andSet = atomicReferenceArray.getAndSet(i, a91.b);
            if (andSet == null) {
                int i2 = a91.a;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (atomicReferenceArray.get(i) == a91.c) {
                        return true;
                    }
                }
                fv fvVar = a91.b;
                fv fvVar2 = a91.d;
                while (true) {
                    if (atomicReferenceArray.compareAndSet(i, fvVar, fvVar2)) {
                        z = true;
                        break;
                    }
                    if (atomicReferenceArray.get(i) != fvVar) {
                        break;
                    }
                }
                return !z;
            }
            if (andSet != a91.e) {
                if (!(andSet instanceof sf)) {
                    af.j(andSet, "unexpected: ");
                    return false;
                }
                sf sfVar = (sf) andSet;
                fv r = sfVar.r(Unit.a, this.a);
                if (r != null) {
                    sfVar.B(r);
                    return true;
                }
            }
        }
        return false;
    }
}
