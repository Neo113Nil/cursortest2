package B1;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k1.h f107a;

    public i(k1.h hVar) {
        this.f107a = hVar;
    }

    @Override // B1.k
    public final boolean a(C1.a aVar) {
        int i7 = aVar.f190b;
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            return false;
        }
        this.f107a.c(aVar.f189a);
        return true;
    }

    @Override // B1.k
    public final boolean b(Exception exc) {
        return false;
    }
}
