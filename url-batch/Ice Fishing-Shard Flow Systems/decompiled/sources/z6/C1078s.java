package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1078s extends L {

    /* renamed from: a, reason: collision with root package name */
    public float[] f8812a;

    /* renamed from: b, reason: collision with root package name */
    public int f8813b;

    @Override // z6.L
    public final Object a() {
        float[] copyOf = Arrays.copyOf(this.f8812a, this.f8813b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // z6.L
    public final void b(int i2) {
        float[] fArr = this.f8812a;
        if (fArr.length < i2) {
            int length = fArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            float[] copyOf = Arrays.copyOf(fArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f8812a = copyOf;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8813b;
    }
}
