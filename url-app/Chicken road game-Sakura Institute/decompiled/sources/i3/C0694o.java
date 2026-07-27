package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0694o extends P {

    /* renamed from: a, reason: collision with root package name */
    public double[] f7096a;

    /* renamed from: b, reason: collision with root package name */
    public int f7097b;

    @Override // i3.P
    public final Object a() {
        double[] copyOf = Arrays.copyOf(this.f7096a, this.f7097b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // i3.P
    public final void b(int i2) {
        double[] dArr = this.f7096a;
        if (dArr.length < i2) {
            int length = dArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            double[] copyOf = Arrays.copyOf(dArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f7096a = copyOf;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7097b;
    }
}
