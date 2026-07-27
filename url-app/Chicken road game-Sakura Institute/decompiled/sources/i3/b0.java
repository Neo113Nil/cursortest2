package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7057a;

    /* renamed from: b, reason: collision with root package name */
    public int f7058b;

    @Override // i3.P
    public final Object a() {
        byte[] storage = Arrays.copyOf(this.f7057a, this.f7058b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new y2.v(storage);
    }

    @Override // i3.P
    public final void b(int i2) {
        byte[] bArr = this.f7057a;
        if (bArr.length < i2) {
            int length = bArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            byte[] storage = Arrays.copyOf(bArr, i2);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f7057a = storage;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7058b;
    }
}
