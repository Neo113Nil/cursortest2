package f2;

import g2.C0448b;

/* renamed from: f2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0400g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final K1.h f4792a;

    public C0400g(K1.h hVar) {
        this.f4792a = hVar;
    }

    @Override // f2.i
    public final boolean a(C0448b c0448b) {
        int i2 = c0448b.f5021b;
        if (i2 != 3 && i2 != 4 && i2 != 5) {
            return false;
        }
        this.f4792a.d(c0448b.f5020a);
        return true;
    }

    @Override // f2.i
    public final boolean b(Exception exc) {
        return false;
    }
}
