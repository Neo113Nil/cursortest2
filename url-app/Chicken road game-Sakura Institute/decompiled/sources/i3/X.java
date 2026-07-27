package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class X extends P {

    /* renamed from: a, reason: collision with root package name */
    public short[] f7050a;

    /* renamed from: b, reason: collision with root package name */
    public int f7051b;

    @Override // i3.P
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f7050a, this.f7051b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // i3.P
    public final void b(int i2) {
        short[] sArr = this.f7050a;
        if (sArr.length < i2) {
            int length = sArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f7050a = copyOf;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7051b;
    }
}
