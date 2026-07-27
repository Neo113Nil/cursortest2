package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public long[] f7076a;

    /* renamed from: b, reason: collision with root package name */
    public int f7077b;

    @Override // i3.P
    public final Object a() {
        long[] storage = Arrays.copyOf(this.f7076a, this.f7077b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new y2.z(storage);
    }

    @Override // i3.P
    public final void b(int i2) {
        long[] jArr = this.f7076a;
        if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            long[] storage = Arrays.copyOf(jArr, i2);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f7076a = storage;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7077b;
    }
}
