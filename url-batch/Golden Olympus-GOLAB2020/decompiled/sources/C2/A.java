package C2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class A extends A0 {

    /* renamed from: a, reason: collision with root package name */
    private double[] f181a;

    /* renamed from: b, reason: collision with root package name */
    private int f182b;

    public A(double[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.f181a = bufferWithData;
        this.f182b = bufferWithData.length;
        b(10);
    }

    @Override // C2.A0
    public void b(int i4) {
        double[] dArr = this.f181a;
        if (dArr.length < i4) {
            double[] copyOf = Arrays.copyOf(dArr, kotlin.ranges.g.d(i4, dArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f181a = copyOf;
        }
    }

    @Override // C2.A0
    public int d() {
        return this.f182b;
    }

    public final void e(double d4) {
        A0.c(this, 0, 1, null);
        double[] dArr = this.f181a;
        int d5 = d();
        this.f182b = d5 + 1;
        dArr[d5] = d4;
    }

    @Override // C2.A0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] copyOf = Arrays.copyOf(this.f181a, d());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }
}
