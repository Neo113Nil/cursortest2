package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public long[] f8771a;

    /* renamed from: b, reason: collision with root package name */
    public int f8772b;

    @Override // z6.L
    public final Object a() {
        long[] storage = Arrays.copyOf(this.f8771a, this.f8772b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new R5.B(storage);
    }

    @Override // z6.L
    public final void b(int i2) {
        long[] jArr = this.f8771a;
        if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            long[] storage = Arrays.copyOf(jArr, i2);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f8771a = storage;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8772b;
    }
}
