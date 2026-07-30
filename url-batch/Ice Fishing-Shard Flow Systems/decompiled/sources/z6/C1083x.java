package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1083x extends L {

    /* renamed from: a, reason: collision with root package name */
    public int[] f8827a;

    /* renamed from: b, reason: collision with root package name */
    public int f8828b;

    @Override // z6.L
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f8827a, this.f8828b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // z6.L
    public final void b(int i2) {
        int[] iArr = this.f8827a;
        if (iArr.length < i2) {
            int length = iArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f8827a = copyOf;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8828b;
    }
}
