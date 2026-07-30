package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean[] f6866a;

    /* renamed from: b, reason: collision with root package name */
    public int f6867b;

    @Override // o7.q0
    public final Object a() {
        boolean[] copyOf = Arrays.copyOf(this.f6866a, this.f6867b);
        r6.k.e(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // o7.q0
    public final void b(int i7) {
        boolean[] zArr = this.f6866a;
        if (zArr.length < i7) {
            int length = zArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            boolean[] copyOf = Arrays.copyOf(zArr, i7);
            r6.k.e(copyOf, "copyOf(...)");
            this.f6866a = copyOf;
        }
    }

    @Override // o7.q0
    public final int d() {
        return this.f6867b;
    }
}
