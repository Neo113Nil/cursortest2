package T5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class D extends L {

    /* renamed from: a, reason: collision with root package name */
    public long[] f2385a;

    /* renamed from: b, reason: collision with root package name */
    public int f2386b;

    @Override // T5.L
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f2385a, this.f2386b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // T5.L
    public final void b(int i7) {
        long[] jArr = this.f2385a;
        if (jArr.length < i7) {
            int length = jArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2385a = copyOf;
        }
    }

    @Override // T5.L
    public final int d() {
        return this.f2386b;
    }
}
