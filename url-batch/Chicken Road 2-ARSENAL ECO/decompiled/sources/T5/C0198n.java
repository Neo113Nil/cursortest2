package T5;

import java.util.Arrays;

/* renamed from: T5.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0198n extends L {

    /* renamed from: a, reason: collision with root package name */
    public double[] f2448a;

    /* renamed from: b, reason: collision with root package name */
    public int f2449b;

    @Override // T5.L
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f2448a, this.f2449b);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // T5.L
    public final void b(int i7) {
        double[] dArr = this.f2448a;
        if (dArr.length < i7) {
            int length = dArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f2448a = copyOf;
        }
    }

    @Override // T5.L
    public final int d() {
        return this.f2449b;
    }
}
