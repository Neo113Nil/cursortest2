package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0683d extends P {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f7061a;

    /* renamed from: b, reason: collision with root package name */
    public int f7062b;

    @Override // i3.P
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f7061a, this.f7062b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // i3.P
    public final void b(int i2) {
        boolean[] zArr = this.f7061a;
        if (zArr.length < i2) {
            int length = zArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f7061a = copyOf;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7062b;
    }
}
