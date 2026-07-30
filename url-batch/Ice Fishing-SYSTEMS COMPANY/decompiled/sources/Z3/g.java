package Z3;

import a4.C0428a;

/* loaded from: classes2.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final h3.h f4269a;

    public g(h3.h hVar) {
        this.f4269a = hVar;
    }

    @Override // Z3.i
    public final boolean a(C0428a c0428a) {
        int i = c0428a.f4377b;
        if (i != 3 && i != 4 && i != 5) {
            return false;
        }
        this.f4269a.d(c0428a.f4376a);
        return true;
    }

    @Override // Z3.i
    public final boolean b(Exception exc) {
        return false;
    }
}
