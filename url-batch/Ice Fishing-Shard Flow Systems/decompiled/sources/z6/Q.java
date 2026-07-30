package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Q extends L {

    /* renamed from: a, reason: collision with root package name */
    public short[] f8754a;

    /* renamed from: b, reason: collision with root package name */
    public int f8755b;

    @Override // z6.L
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f8754a, this.f8755b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // z6.L
    public final void b(int i2) {
        short[] sArr = this.f8754a;
        if (sArr.length < i2) {
            int length = sArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f8754a = copyOf;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8755b;
    }
}
