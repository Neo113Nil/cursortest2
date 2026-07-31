package w2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f8648a;

    /* renamed from: b, reason: collision with root package name */
    public int f8649b;

    @Override // w2.P
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f8648a, this.f8649b);
        Z1.i.e(copyOf, "copyOf(...)");
        return new L1.r(copyOf);
    }

    @Override // w2.P
    public final void b(int i3) {
        byte[] bArr = this.f8648a;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8648a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8649b;
    }
}
