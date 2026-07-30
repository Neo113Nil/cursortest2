package a8;

import java.util.Arrays;

/* renamed from: a8.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0447n extends K {

    /* renamed from: a, reason: collision with root package name */
    public double[] f4492a;

    /* renamed from: b, reason: collision with root package name */
    public int f4493b;

    @Override // a8.K
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f4492a, this.f4493b);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // a8.K
    public final void b(int i) {
        double[] dArr = this.f4492a;
        if (dArr.length < i) {
            int length = dArr.length * 2;
            if (i < length) {
                i = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i);
            kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
            this.f4492a = copyOf;
        }
    }

    @Override // a8.K
    public final int d() {
        return this.f4493b;
    }
}
