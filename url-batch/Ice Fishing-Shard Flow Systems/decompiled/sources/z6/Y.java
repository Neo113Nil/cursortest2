package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class Y extends L {

    /* renamed from: a, reason: collision with root package name */
    public int[] f8766a;

    /* renamed from: b, reason: collision with root package name */
    public int f8767b;

    @Override // z6.L
    public final Object a() {
        int[] storage = Arrays.copyOf(this.f8766a, this.f8767b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new R5.y(storage);
    }

    @Override // z6.L
    public final void b(int i2) {
        int[] iArr = this.f8766a;
        if (iArr.length < i2) {
            int length = iArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            int[] storage = Arrays.copyOf(iArr, i2);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f8766a = storage;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8767b;
    }
}
