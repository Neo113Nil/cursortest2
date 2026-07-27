package i3;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0686g extends P {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f7071a;

    /* renamed from: b, reason: collision with root package name */
    public int f7072b;

    @Override // i3.P
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f7071a, this.f7072b);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // i3.P
    public final void b(int i2) {
        byte[] bArr = this.f7071a;
        if (bArr.length < i2) {
            int length = bArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f7071a = copyOf;
        }
    }

    @Override // i3.P
    public final int d() {
        return this.f7072b;
    }
}
