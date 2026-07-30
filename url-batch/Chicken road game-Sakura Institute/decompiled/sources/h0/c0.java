package h0;

import g0.a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4604a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4605b;

    public c0(int i7, int i8) {
        this.f4604a = i7;
        this.f4605b = i8;
    }

    public abstract void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar);

    public String b(int i7) {
        return "IntParameter(" + i7 + ')';
    }

    public String c(int i7) {
        return "ObjectParameter(" + i7 + ')';
    }

    public final String toString() {
        String b9 = r6.w.a(getClass()).b();
        return b9 == null ? "" : b9;
    }

    public /* synthetic */ c0(int i7, int i8, int i9) {
        this((i9 & 1) != 0 ? 0 : i7, (i9 & 2) != 0 ? 0 : i8);
    }
}
