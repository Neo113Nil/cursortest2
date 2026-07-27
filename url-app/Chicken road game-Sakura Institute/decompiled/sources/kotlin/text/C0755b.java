package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* renamed from: kotlin.text.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0755b implements Iterator, N2.a {

    /* renamed from: d, reason: collision with root package name */
    public int f7516d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f7517e;

    /* renamed from: i, reason: collision with root package name */
    public int f7518i;

    /* renamed from: j, reason: collision with root package name */
    public IntRange f7519j;

    /* renamed from: k, reason: collision with root package name */
    public int f7520k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f7521l;

    public C0755b(c cVar) {
        this.f7521l = cVar;
        int e4 = kotlin.ranges.b.e(cVar.f7523b, 0, cVar.f7522a.length());
        this.f7517e = e4;
        this.f7518i = e4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r3) goto L9;
     */
    /* JADX WARN: Type inference failed for: r0v1, types: [M2.p, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        int i2 = this.f7518i;
        if (i2 < 0) {
            this.f7516d = 0;
            this.f7519j = null;
            return;
        }
        c cVar = this.f7521l;
        int i4 = cVar.f7524c;
        String str = cVar.f7522a;
        if (i4 > 0) {
            int i5 = this.f7520k + 1;
            this.f7520k = i5;
        }
        if (i2 <= str.length()) {
            Pair pair = (Pair) cVar.f7525d.h(str, Integer.valueOf(this.f7518i));
            if (pair == null) {
                this.f7519j = new IntRange(this.f7517e, y.r(str), 1);
                this.f7518i = -1;
            } else {
                int intValue = ((Number) pair.f7485d).intValue();
                int intValue2 = ((Number) pair.f7486e).intValue();
                this.f7519j = kotlin.ranges.b.h(this.f7517e, intValue);
                int i6 = intValue + intValue2;
                this.f7517e = i6;
                this.f7518i = i6 + (intValue2 == 0 ? 1 : 0);
            }
            this.f7516d = 1;
        }
        this.f7519j = new IntRange(this.f7517e, y.r(str), 1);
        this.f7518i = -1;
        this.f7516d = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f7516d == -1) {
            b();
        }
        return this.f7516d == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f7516d == -1) {
            b();
        }
        if (this.f7516d == 0) {
            throw new NoSuchElementException();
        }
        IntRange intRange = this.f7519j;
        Intrinsics.d(intRange, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.f7519j = null;
        this.f7516d = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
