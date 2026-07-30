package s;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements s0.m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7986a;

    /* renamed from: b, reason: collision with root package name */
    public h6.k f7987b;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(j6.c cVar) {
        b bVar;
        int i7;
        h6.k kVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i8 = bVar.f7983i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f7983i = i8 - Integer.MIN_VALUE;
                Object obj = bVar.f7981g;
                i7 = bVar.f7983i;
                d6.z zVar = d6.z.f2639a;
                if (i7 != 0) {
                    d6.a.e(obj);
                    if (!this.f7986a) {
                        h6.k kVar2 = this.f7987b;
                        bVar.f7980f = kVar2;
                        bVar.f7983i = 1;
                        h6.k kVar3 = new h6.k(a8.m.A(bVar), i6.a.f4957g);
                        this.f7987b = kVar3;
                        Object a3 = kVar3.a();
                        i6.a aVar = i6.a.f4956f;
                        if (a3 == aVar) {
                            return aVar;
                        }
                        kVar = kVar2;
                    }
                    return zVar;
                }
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = bVar.f7980f;
                d6.a.e(obj);
                if (kVar != null) {
                    kVar.resumeWith(zVar);
                }
                return zVar;
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f7981g;
        i7 = bVar.f7983i;
        d6.z zVar2 = d6.z.f2639a;
        if (i7 != 0) {
        }
        if (kVar != null) {
        }
        return zVar2;
    }
}
