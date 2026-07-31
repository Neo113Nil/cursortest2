package w2;

import java.util.Arrays;

/* renamed from: w2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1025d extends P {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f8652a;

    /* renamed from: b, reason: collision with root package name */
    public int f8653b;

    @Override // w2.P
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f8652a, this.f8653b);
        Z1.i.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // w2.P
    public final void b(int i3) {
        boolean[] zArr = this.f8652a;
        if (zArr.length < i3) {
            int length = zArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i3);
            Z1.i.e(copyOf, "copyOf(...)");
            this.f8652a = copyOf;
        }
    }

    @Override // w2.P
    public final int d() {
        return this.f8653b;
    }
}
