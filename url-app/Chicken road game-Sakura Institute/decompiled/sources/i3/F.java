package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F extends P {

    /* renamed from: a, reason: collision with root package name */
    public long[] f7015a;

    /* renamed from: b, reason: collision with root package name */
    public int f7016b;

    @Override // i3.P
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f7015a, this.f7016b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // i3.P
    public final void b(int i2) {
        long[] jArr = this.f7015a;
        if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f7015a = copyOf;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7016b;
    }
}
