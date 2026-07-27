package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0690k extends P {

    /* renamed from: a, reason: collision with root package name */
    public char[] f7083a;

    /* renamed from: b, reason: collision with root package name */
    public int f7084b;

    @Override // i3.P
    public final Object a() {
        char[] copyOf = Arrays.copyOf(this.f7083a, this.f7084b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // i3.P
    public final void b(int i2) {
        char[] cArr = this.f7083a;
        if (cArr.length < i2) {
            int length = cArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            char[] copyOf = Arrays.copyOf(cArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f7083a = copyOf;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7084b;
    }
}
