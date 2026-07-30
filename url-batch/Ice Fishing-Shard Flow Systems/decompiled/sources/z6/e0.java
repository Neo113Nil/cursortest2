package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 extends L {

    /* renamed from: a, reason: collision with root package name */
    public short[] f8780a;

    /* renamed from: b, reason: collision with root package name */
    public int f8781b;

    @Override // z6.L
    public final Object a() {
        short[] storage = Arrays.copyOf(this.f8780a, this.f8781b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new R5.F(storage);
    }

    @Override // z6.L
    public final void b(int i2) {
        short[] sArr = this.f8780a;
        if (sArr.length < i2) {
            int length = sArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            short[] storage = Arrays.copyOf(sArr, i2);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f8780a = storage;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8781b;
    }
}
