package C2;

import java.util.Arrays;

/* renamed from: C2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0041d extends P {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f739a;

    /* renamed from: b, reason: collision with root package name */
    public int f740b;

    @Override // C2.P
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f739a, this.f740b);
        f2.j.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // C2.P
    public final void b(int i3) {
        boolean[] zArr = this.f739a;
        if (zArr.length < i3) {
            int length = zArr.length * 2;
            if (i3 < length) {
                i3 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i3);
            f2.j.e(copyOf, "copyOf(...)");
            this.f739a = copyOf;
        }
    }

    @Override // C2.P
    public final int d() {
        return this.f740b;
    }
}
