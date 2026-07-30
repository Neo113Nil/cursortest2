package defpackage;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kr implements Iterator, yb0 {
    public int d = -1;
    public int e;
    public int g;
    public IntRange h;
    public int i;
    public final /* synthetic */ lr j;

    public kr(lr lrVar) {
        this.j = lrVar;
        int c = b11.c(0, 0, lrVar.a.length());
        this.e = c;
        this.g = c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        lr lrVar = this.j;
        CharSequence charSequence = lrVar.a;
        int i = this.g;
        if (i < 0) {
            this.d = 0;
            this.h = null;
            return;
        }
        int i2 = lrVar.b;
        if (i2 > 0) {
            int i3 = this.i + 1;
            this.i = i3;
        }
        if (i <= charSequence.length()) {
            Pair pair = (Pair) lrVar.c.b(charSequence, Integer.valueOf(this.g));
            if (pair == null) {
                this.h = new IntRange(this.e, charSequence.length() - 1, 1);
                this.g = -1;
            } else {
                int intValue = ((Number) pair.d).intValue();
                int intValue2 = ((Number) pair.e).intValue();
                this.h = b11.g(this.e, intValue);
                int i4 = intValue + intValue2;
                this.e = i4;
                this.g = i4 + (intValue2 == 0 ? 1 : 0);
            }
            this.d = 1;
        }
        this.h = new IntRange(this.e, charSequence.length() - 1, 1);
        this.g = -1;
        this.d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.d == -1) {
            a();
        }
        return this.d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.d == -1) {
            a();
        }
        if (this.d == 0) {
            dd0.c();
            return null;
        }
        IntRange intRange = this.h;
        intRange.getClass();
        this.h = null;
        this.d = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
