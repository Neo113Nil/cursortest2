package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class V extends L {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8761a;

    /* renamed from: b, reason: collision with root package name */
    public int f8762b;

    @Override // z6.L
    public final Object a() {
        byte[] storage = Arrays.copyOf(this.f8761a, this.f8762b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new R5.v(storage);
    }

    @Override // z6.L
    public final void b(int i2) {
        byte[] bArr = this.f8761a;
        if (bArr.length < i2) {
            int length = bArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            byte[] storage = Arrays.copyOf(bArr, i2);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f8761a = storage;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8762b;
    }
}
