package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1064d extends L {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f8775a;

    /* renamed from: b, reason: collision with root package name */
    public int f8776b;

    @Override // z6.L
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f8775a, this.f8776b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // z6.L
    public final void b(int i2) {
        boolean[] zArr = this.f8775a;
        if (zArr.length < i2) {
            int length = zArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f8775a = copyOf;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8776b;
    }
}
