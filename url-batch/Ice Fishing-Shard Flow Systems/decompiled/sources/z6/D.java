package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class D extends L {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8734a;

    /* renamed from: b, reason: collision with root package name */
    public int f8735b;

    @Override // z6.L
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f8734a, this.f8735b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // z6.L
    public final void b(int i2) {
        long[] jArr = this.f8734a;
        if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f8734a = copyOf;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8735b;
    }
}
