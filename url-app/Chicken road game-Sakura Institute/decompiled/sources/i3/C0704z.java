package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0704z extends P {

    /* renamed from: a, reason: collision with root package name */
    public int[] f7117a;

    /* renamed from: b, reason: collision with root package name */
    public int f7118b;

    @Override // i3.P
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f7117a, this.f7118b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // i3.P
    public final void b(int i2) {
        int[] iArr = this.f7117a;
        if (iArr.length < i2) {
            int length = iArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f7117a = copyOf;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7118b;
    }
}
