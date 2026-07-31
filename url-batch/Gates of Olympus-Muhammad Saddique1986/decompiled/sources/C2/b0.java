package C2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 extends P {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f735a;

    /* renamed from: b, reason: collision with root package name */
    public int f736b;

    @Override // C2.P
    public final Object a() {
        byte[] copyOf = Arrays.copyOf(this.f735a, this.f736b);
        f2.j.e(copyOf, "copyOf(...)");
        return new R1.q(copyOf);
    }

    @Override // C2.P
    public final void b(int i3) {
        byte[] bArr = this.f735a;
        if (bArr.length < i3) {
            int length = bArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f735a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f736b;
    }
}
