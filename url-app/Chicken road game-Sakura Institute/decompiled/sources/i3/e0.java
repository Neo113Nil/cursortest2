package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public int[] f7066a;

    /* renamed from: b, reason: collision with root package name */
    public int f7067b;

    @Override // i3.P
    public final Object a() {
        int[] storage = Arrays.copyOf(this.f7066a, this.f7067b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new y2.x(storage);
    }

    @Override // i3.P
    public final void b(int i2) {
        int[] iArr = this.f7066a;
        if (iArr.length < i2) {
            int length = iArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            int[] storage = Arrays.copyOf(iArr, i2);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f7066a = storage;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7067b;
    }
}
