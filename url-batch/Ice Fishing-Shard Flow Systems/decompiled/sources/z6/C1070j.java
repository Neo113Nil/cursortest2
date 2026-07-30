package z6;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z6.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1070j extends L {

    /* renamed from: a, reason: collision with root package name */
    public char[] f8794a;

    /* renamed from: b, reason: collision with root package name */
    public int f8795b;

    @Override // z6.L
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f8794a, this.f8795b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // z6.L
    public final void b(int i2) {
        char[] cArr = this.f8794a;
        if (cArr.length < i2) {
            int length = cArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f8794a = copyOf;
        }
    }

    @Override // z6.L
    public final int d() {
        return this.f8795b;
    }
}
