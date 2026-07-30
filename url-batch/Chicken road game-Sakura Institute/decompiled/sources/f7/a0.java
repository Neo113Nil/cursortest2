package f7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a0 implements f {

    /* renamed from: f, reason: collision with root package name */
    public final j6.i f3441f;

    /* JADX WARN: Multi-variable type inference failed */
    public a0(q6.e eVar) {
        this.f3441f = (j6.i) eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v3, types: [j6.i, q6.e] */
    @Override // f7.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g gVar, h6.d dVar) {
        a aVar;
        int i7;
        Throwable th;
        g7.v vVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f3440i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f3440i = i8 - Integer.MIN_VALUE;
                Object obj = aVar.f3438g;
                i7 = aVar.f3440i;
                d6.z zVar = d6.z.f2639a;
                if (i7 != 0) {
                    d6.a.e(obj);
                    g7.v vVar2 = new g7.v(gVar, aVar.getContext());
                    try {
                        aVar.f3437f = vVar2;
                        aVar.f3440i = 1;
                        Object d8 = this.f3441f.d(vVar2, aVar);
                        i6.a aVar2 = i6.a.f4956f;
                        if (d8 != aVar2) {
                            d8 = zVar;
                        }
                        if (d8 == aVar2) {
                            return aVar2;
                        }
                        vVar = vVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        vVar = vVar2;
                        vVar.releaseIntercepted();
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vVar = aVar.f3437f;
                    try {
                        d6.a.e(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        vVar.releaseIntercepted();
                        throw th;
                    }
                }
                vVar.releaseIntercepted();
                return zVar;
            }
        }
        aVar = new a(this, dVar);
        Object obj2 = aVar.f3438g;
        i7 = aVar.f3440i;
        d6.z zVar2 = d6.z.f2639a;
        if (i7 != 0) {
        }
        vVar.releaseIntercepted();
        return zVar2;
    }
}
