package Z3;

import a4.C0428a;

/* loaded from: classes2.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public final j f4267a;

    /* renamed from: b, reason: collision with root package name */
    public final h3.h f4268b;

    public f(j jVar, h3.h hVar) {
        this.f4267a = jVar;
        this.f4268b = hVar;
    }

    @Override // Z3.i
    public final boolean a(C0428a c0428a) {
        if (c0428a.f4377b != 4 || this.f4267a.a(c0428a)) {
            return false;
        }
        String str = c0428a.f4378c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f4268b.b(new a(str, c0428a.f4380e, c0428a.f4381f));
        return true;
    }

    @Override // Z3.i
    public final boolean b(Exception exc) {
        this.f4268b.c(exc);
        return true;
    }
}
