package o7;

import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class h1 extends q0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f6888a;

    /* renamed from: b, reason: collision with root package name */
    public int f6889b;

    @Override // o7.q0
    public final Object a() {
        long[] copyOf = Arrays.copyOf(this.f6888a, this.f6889b);
        r6.k.e(copyOf, "copyOf(...)");
        return new d6.v(copyOf);
    }

    @Override // o7.q0
    public final void b(int i7) {
        long[] jArr = this.f6888a;
        if (jArr.length < i7) {
            int length = jArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            long[] copyOf = Arrays.copyOf(jArr, i7);
            r6.k.e(copyOf, "copyOf(...)");
            this.f6888a = copyOf;
        }
    }

    @Override // o7.q0
    public final int d() {
        return this.f6889b;
    }
}
