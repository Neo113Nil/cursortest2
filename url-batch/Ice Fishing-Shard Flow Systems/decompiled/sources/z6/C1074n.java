package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1074n extends L {

    /* renamed from: a, reason: collision with root package name */
    public double[] f8800a;

    /* renamed from: b, reason: collision with root package name */
    public int f8801b;

    @Override // z6.L
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f8800a, this.f8801b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // z6.L
    public final void b(int i2) {
        double[] dArr = this.f8800a;
        if (dArr.length < i2) {
            int length = dArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f8800a = copyOf;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8801b;
    }
}
