package kotlin.text;

import f6.InterfaceC0406a;
import j6.C0588e;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class b implements Iterator, InterfaceC0406a {

    /* renamed from: d, reason: collision with root package name */
    public int f6182d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f6183e;

    /* renamed from: i, reason: collision with root package name */
    public int f6184i;

    /* renamed from: l, reason: collision with root package name */
    public IntRange f6185l;

    /* renamed from: m, reason: collision with root package name */
    public int f6186m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ c f6187n;

    public b(c cVar) {
        this.f6187n = cVar;
        int length = cVar.f6188a.length();
        if (length < 0) {
            throw new IllegalArgumentException(C4.p.h(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
        }
        length = length >= 0 ? 0 : length;
        this.f6183e = length;
        this.f6184i = length;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i2 = this.f6184i;
        if (i2 < 0) {
            this.f6182d = 0;
            this.f6185l = null;
            return;
        }
        c cVar = this.f6187n;
        int i5 = cVar.f6189b;
        if (i5 > 0) {
            int i7 = this.f6186m + 1;
            this.f6186m = i7;
        }
        if (i2 <= cVar.f6188a.length()) {
            Pair pair = (Pair) cVar.f6190c.invoke(cVar.f6188a, Integer.valueOf(this.f6184i));
            if (pair == null) {
                this.f6185l = new IntRange(this.f6183e, StringsKt.w(cVar.f6188a), 1);
                this.f6184i = -1;
            } else {
                int intValue = ((Number) pair.f6112d).intValue();
                int intValue2 = ((Number) pair.f6113e).intValue();
                this.f6185l = C0588e.c(this.f6183e, intValue);
                int i8 = intValue + intValue2;
                this.f6183e = i8;
                this.f6184i = i8 + (intValue2 == 0 ? 1 : 0);
            }
            this.f6182d = 1;
        }
        this.f6185l = new IntRange(this.f6183e, StringsKt.w(cVar.f6188a), 1);
        this.f6184i = -1;
        this.f6182d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6182d == -1) {
            a();
        }
        return this.f6182d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6182d == -1) {
            a();
        }
        if (this.f6182d == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.f6185l;
        Intrinsics.c(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f6185l = null;
        this.f6182d = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
