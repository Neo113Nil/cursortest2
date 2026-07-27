package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0698t extends P {

    /* renamed from: a, reason: collision with root package name */
    public float[] f7110a;

    /* renamed from: b, reason: collision with root package name */
    public int f7111b;

    @Override // i3.P
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f7110a, this.f7111b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // i3.P
    public final void b(int i2) {
        float[] fArr = this.f7110a;
        if (fArr.length < i2) {
            int length = fArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f7110a = copyOf;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7111b;
    }
}
