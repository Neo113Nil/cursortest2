package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dib extends AtomicInteger {
    public final dig a;
    public final long b;
    public final AtomicReference c;
    private final hvi d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dib(long j, dig digVar, hvi hviVar) {
        super(r0 + r0);
        digVar.getClass();
        int i = (((int) (j >> 43)) & 63) - 21;
        int i2 = i + i;
        this.a = digVar;
        this.d = hviVar;
        this.b = j & 8796093022207L;
        this.c = new AtomicReference();
    }

    public final void a() {
        int i;
        do {
            i = get();
        } while (!compareAndSet(i, dic.c(i, 0, false, true, 3)));
        if (dic.b(i)) {
            dig digVar = this.a;
            if (!digVar.d) {
                throw new IllegalStateException("Could not have been boosted while not holding a lock.");
            }
            digVar.e = digVar.c;
        }
        for (dia diaVar = (dia) this.c.getAndSet(dhz.a); diaVar != null; diaVar = diaVar.b) {
            LockSupport.unpark(diaVar.a.a);
        }
    }

    @Override // java.lang.Number
    public final /* bridge */ byte byteValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Number
    public final /* bridge */ short shortValue() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.atomic.AtomicInteger
    public final String toString() {
        return "Booster[Thread=[" + this.a.a + ", future=[" + this.d + "]]";
    }
}
