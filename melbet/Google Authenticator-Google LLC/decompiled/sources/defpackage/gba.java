package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gba extends hsw {
    private gbc a;
    private final int b;

    public gba(gbc gbcVar, int i) {
        this.a = gbcVar;
        this.b = i;
    }

    @Override // defpackage.hsw
    protected final String a() {
        Object obj;
        gbc gbcVar = this.a;
        if (gbcVar == null || (obj = gbcVar.d.a) == null) {
            return null;
        }
        String aa = a.aa(obj, "callable=[", "]");
        gbb gbbVar = (gbb) this.a.b.get();
        if (gbbVar == null) {
            return aa;
        }
        return aa + ", trial=[" + gbbVar.toString() + "]";
    }

    @Override // defpackage.hsw
    protected final void b() {
        AtomicLong atomicLong;
        long j;
        int i;
        int a;
        boolean z;
        gbc gbcVar = this.a;
        this.a = null;
        if (gbcVar == null) {
            return;
        }
        do {
            atomicLong = gbcVar.a;
            j = atomicLong.get();
            i = (int) j;
            a = gbc.a(j);
            if (i == Integer.MIN_VALUE) {
                throw new AssertionError("Refcount is: " + j);
            }
            z = i == -2147483647;
            if (z) {
                a++;
            }
        } while (!atomicLong.compareAndSet(j, gbc.b(a, i - 1)));
        if (z) {
            while (true) {
                AtomicReference atomicReference = gbcVar.b;
                gbb gbbVar = (gbb) atomicReference.get();
                if (gbbVar != null) {
                    if (gbbVar.a <= this.b) {
                        gbbVar.cancel(true);
                        while (!atomicReference.compareAndSet(gbbVar, null)) {
                            if (atomicReference.get() != gbbVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }
}
