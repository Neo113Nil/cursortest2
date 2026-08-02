package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kua implements Iterator {
    final /* synthetic */ ktz a;
    private int b = -1;
    private int c;
    private int d;
    private kth e;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.CharSequence, java.lang.Object] */
    public kua(ktz ktzVar) {
        this.a = ktzVar;
        int length = ktzVar.b.length();
        if (length < 0) {
            throw new IllegalArgumentException(a.ai(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        this.c = 0;
        this.d = 0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, krx] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.CharSequence, java.lang.Object] */
    private final void a() {
        int i = this.d;
        if (i < 0) {
            this.b = 0;
            this.e = null;
            return;
        }
        ktz ktzVar = this.a;
        ?? r3 = ktzVar.b;
        if (i > r3.length()) {
            this.e = new kth(this.c, ksp.h(r3));
            this.d = -1;
        } else {
            Object a = ktzVar.a.a(r3, Integer.valueOf(this.d));
            if (a == null) {
                this.e = new kth(this.c, ksp.h(r3));
                this.d = -1;
            } else {
                kol kolVar = (kol) a;
                int intValue = ((Number) kolVar.a).intValue();
                int intValue2 = ((Number) kolVar.b).intValue();
                this.e = intValue <= Integer.MIN_VALUE ? kth.d : new kth(this.c, intValue - 1);
                int i2 = intValue + intValue2;
                this.c = i2;
                this.d = i2 + (intValue2 == 0 ? 1 : 0);
            }
        }
        this.b = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.b == -1) {
            a();
        }
        return this.b == 1;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.b == -1) {
            a();
        }
        if (this.b == 0) {
            throw new NoSuchElementException();
        }
        kth kthVar = this.e;
        kthVar.getClass();
        this.e = null;
        this.b = -1;
        return kthVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.c();
    }
}
