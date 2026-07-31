package C2;

import java.util.Arrays;

/* renamed from: C2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0062z extends P {

    /* renamed from: a, reason: collision with root package name */
    public int[] f795a;

    /* renamed from: b, reason: collision with root package name */
    public int f796b;

    @Override // C2.P
    public final Object a() {
        int[] copyOf = Arrays.copyOf(this.f795a, this.f796b);
        f2.j.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // C2.P
    public final void b(int i3) {
        int[] iArr = this.f795a;
        if (iArr.length < i3) {
            int length = iArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            int[] copyOf = Arrays.copyOf(iArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f795a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f796b;
    }
}
