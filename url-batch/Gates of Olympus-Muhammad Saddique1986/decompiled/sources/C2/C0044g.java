package C2;

import java.util.Arrays;

/* renamed from: C2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044g extends P {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f749a;

    /* renamed from: b, reason: collision with root package name */
    public int f750b;

    @Override // C2.P
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f749a, this.f750b);
        f2.j.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // C2.P
    public final void b(int i3) {
        byte[] bArr = this.f749a;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f749a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f750b;
    }
}
