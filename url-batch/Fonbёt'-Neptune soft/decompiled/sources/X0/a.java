package X0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator, R0.a {

    /* renamed from: e, reason: collision with root package name */
    public int f1143e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f1144f;

    /* renamed from: g, reason: collision with root package name */
    public int f1145g;

    /* renamed from: h, reason: collision with root package name */
    public U0.c f1146h;

    /* renamed from: i, reason: collision with root package name */
    public int f1147i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b f1148j;

    public a(b bVar) {
        this.f1148j = bVar;
        int i2 = bVar.f1150b;
        int length = bVar.f1149a.length();
        if (length < 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 > length) {
            i2 = length;
        }
        this.f1144f = i2;
        this.f1145g = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r7 < r3) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i2 = this.f1145g;
        if (i2 < 0) {
            this.f1143e = 0;
            this.f1146h = null;
            return;
        }
        b bVar = this.f1148j;
        int i3 = bVar.f1151c;
        String str = bVar.f1149a;
        if (i3 > 0) {
            int i4 = this.f1147i + 1;
            this.f1147i = i4;
        }
        if (i2 <= str.length()) {
            F0.c cVar = (F0.c) bVar.f1152d.h(str, Integer.valueOf(this.f1145g));
            if (cVar == null) {
                this.f1146h = new U0.c(this.f1144f, j.P(str), 1);
                this.f1145g = -1;
            } else {
                int intValue = ((Number) cVar.f461e).intValue();
                int intValue2 = ((Number) cVar.f462f).intValue();
                this.f1146h = intValue <= Integer.MIN_VALUE ? U0.c.f1094h : new U0.c(this.f1144f, intValue - 1, 1);
                int i5 = intValue + intValue2;
                this.f1144f = i5;
                this.f1145g = i5 + (intValue2 == 0 ? 1 : 0);
            }
            this.f1143e = 1;
        }
        this.f1146h = new U0.c(this.f1144f, j.P(str), 1);
        this.f1145g = -1;
        this.f1143e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f1143e == -1) {
            a();
        }
        return this.f1143e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f1143e == -1) {
            a();
        }
        if (this.f1143e == 0) {
            throw new NoSuchElementException();
        }
        U0.c cVar = this.f1146h;
        Q0.h.c(cVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f1146h = null;
        this.f1143e = -1;
        return cVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
