package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import y2.C1323C;

/* loaded from: classes.dex */
public final class k0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public short[] f7085a;

    /* renamed from: b, reason: collision with root package name */
    public int f7086b;

    @Override // i3.P
    public final Object a() {
        short[] storage = Arrays.copyOf(this.f7085a, this.f7086b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C1323C(storage);
    }

    @Override // i3.P
    public final void b(int i2) {
        short[] sArr = this.f7085a;
        if (sArr.length < i2) {
            int length = sArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            short[] storage = Arrays.copyOf(sArr, i2);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f7085a = storage;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7086b;
    }
}
