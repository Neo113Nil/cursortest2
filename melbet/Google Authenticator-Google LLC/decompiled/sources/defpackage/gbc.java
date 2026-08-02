package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbc {
    public final hvw c;
    public final huv d;
    private final Executor f;
    public final AtomicLong a = new AtomicLong(b(Integer.MIN_VALUE, Integer.MIN_VALUE));
    public final AtomicReference b = new AtomicReference(null);
    private final AtomicReference e = new AtomicReference(null);

    public gbc(htq htqVar, Executor executor) {
        huf hufVar = huf.a;
        this.f = new hvv(hufVar);
        hvw hvwVar = new hvw();
        this.c = hvwVar;
        huv huvVar = new huv(htqVar, executor, 1);
        this.d = huvVar;
        hvwVar.c(huvVar, hufVar);
    }

    public static int a(long j) {
        return (int) (j >>> 32);
    }

    public static long b(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public final hvi c() {
        AtomicLong atomicLong;
        long j;
        final int a;
        hvw hvwVar = this.c;
        if (hvwVar.isDone()) {
            return hvwVar;
        }
        do {
            atomicLong = this.a;
            j = atomicLong.get();
            a = a(j);
        } while (!atomicLong.compareAndSet(j, b(a, ((int) j) + 1)));
        final hvw hvwVar2 = new hvw();
        hvi hviVar = (hvi) this.e.getAndSet(hvwVar2);
        hvwVar2.q(hviVar == null ? hnu.aN(gvx.b(new htq() { // from class: gay
            @Override // defpackage.htq
            public final hvi a() {
                return gbc.this.d(a);
            }
        }), huf.a) : hso.g(hviVar, Throwable.class, gvx.c(new doi(this, a, 3)), this.f));
        final gba gbaVar = new gba(this, a);
        hvwVar2.c(new Runnable() { // from class: gaz
            @Override // java.lang.Runnable
            public final void run() {
                gba gbaVar2 = gbaVar;
                hvw hvwVar3 = hvwVar2;
                try {
                    Object aR = hnu.aR(hvwVar3);
                    hvw hvwVar4 = gbc.this.c;
                    hvwVar4.o(aR);
                    gbaVar2.q(hvwVar4);
                } catch (Throwable unused) {
                    gbaVar2.q(hvwVar3);
                }
            }
        }, huf.a);
        return gbaVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [htq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final hvi d(int i) {
        AtomicReference atomicReference;
        gbb gbbVar;
        AtomicLong atomicLong = this.a;
        if (a(atomicLong.get()) > i) {
            return hnu.aH();
        }
        gbb gbbVar2 = new gbb(i);
        do {
            atomicReference = this.b;
            gbbVar = (gbb) atomicReference.get();
            if (gbbVar != null && gbbVar.a > i) {
                return hnu.aH();
            }
        } while (!a.a(atomicReference, gbbVar, gbbVar2));
        if (a(atomicLong.get()) > i) {
            gbbVar2.cancel(true);
            a.a(atomicReference, gbbVar2, null);
            return gbbVar2;
        }
        huv huvVar = this.d;
        ?? r0 = huvVar.a;
        ?? r6 = huvVar.b;
        if (r0 == 0 || r6 == 0) {
            gbbVar2.q(this.c);
            return gbbVar2;
        }
        gbbVar2.q(hnu.aN(gvx.b(r0), r6));
        return gbbVar2;
    }

    public final boolean e() {
        return this.c.isDone();
    }
}
