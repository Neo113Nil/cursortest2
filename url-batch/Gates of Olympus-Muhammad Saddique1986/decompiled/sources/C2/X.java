package C2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class X extends P {

    /* renamed from: a, reason: collision with root package name */
    public short[] f728a;

    /* renamed from: b, reason: collision with root package name */
    public int f729b;

    @Override // C2.P
    public final Object a() {
        short[] copyOf = Arrays.copyOf(this.f728a, this.f729b);
        f2.j.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // C2.P
    public final void b(int i3) {
        short[] sArr = this.f728a;
        if (sArr.length < i3) {
            int length = sArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            short[] copyOf = Arrays.copyOf(sArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f728a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f729b;
    }
}
