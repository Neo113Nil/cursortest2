package kotlin.text;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements Iterator, xd.a {

    /* renamed from: d, reason: collision with root package name */
    public int f5608d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f5609e;

    /* renamed from: i, reason: collision with root package name */
    public int f5610i;

    /* renamed from: r, reason: collision with root package name */
    public IntRange f5611r;

    /* renamed from: s, reason: collision with root package name */
    public int f5612s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ c f5613t;

    public b(c cVar) {
        this.f5613t = cVar;
        int c10 = be.f.c(0, 0, cVar.f5614a.length());
        this.f5609e = c10;
        this.f5610i = c10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r4) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        c cVar = this.f5613t;
        CharSequence charSequence = cVar.f5614a;
        int i3 = this.f5610i;
        if (i3 < 0) {
            this.f5608d = 0;
            this.f5611r = null;
            return;
        }
        int i10 = cVar.f5615b;
        if (i10 > 0) {
            int i11 = this.f5612s + 1;
            this.f5612s = i11;
        }
        if (i3 <= charSequence.length()) {
            Pair pair = (Pair) cVar.f5616c.invoke(charSequence, Integer.valueOf(this.f5610i));
            if (pair == null) {
                this.f5611r = new IntRange(this.f5609e, charSequence.length() - 1, 1);
                this.f5610i = -1;
            } else {
                int intValue = ((Number) pair.f5552d).intValue();
                int intValue2 = ((Number) pair.f5553e).intValue();
                this.f5611r = be.f.f(this.f5609e, intValue);
                int i12 = intValue + intValue2;
                this.f5609e = i12;
                this.f5610i = i12 + (intValue2 == 0 ? 1 : 0);
            }
            this.f5608d = 1;
        }
        this.f5611r = new IntRange(this.f5609e, charSequence.length() - 1, 1);
        this.f5610i = -1;
        this.f5608d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5608d == -1) {
            a();
        }
        return this.f5608d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5608d == -1) {
            a();
        }
        if (this.f5608d == 0) {
            i0.c();
            return null;
        }
        IntRange intRange = this.f5611r;
        intRange.getClass();
        this.f5611r = null;
        this.f5608d = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
