package Z1;

import a2.C0180a;

/* loaded from: classes.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final I1.h f3768a;

    public g(I1.h hVar) {
        this.f3768a = hVar;
    }

    @Override // Z1.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // Z1.i
    public final boolean b(C0180a c0180a) {
        int i2 = c0180a.f3849b;
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            return false;
        }
        this.f3768a.d(c0180a.f3848a);
        return true;
    }
}
