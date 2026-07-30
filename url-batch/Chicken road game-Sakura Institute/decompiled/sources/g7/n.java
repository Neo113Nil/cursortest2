package g7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n implements f7.g {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e7.e f4506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f4507g;

    public n(e7.e eVar, int i7) {
        this.f4506f = eVar;
        this.f4507g = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (c7.a0.z(r0) != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r5.f4506f.h(r0, r7) == r4) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // f7.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj, h6.d dVar) {
        m mVar;
        int i7;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i8 = mVar.f4505h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mVar.f4505h = i8 - Integer.MIN_VALUE;
                Object obj2 = mVar.f4503f;
                i7 = mVar.f4505h;
                i6.a aVar = i6.a.f4956f;
                if (i7 != 0) {
                    d6.a.e(obj2);
                    e6.y yVar = new e6.y(this.f4507g, obj);
                    mVar.f4505h = 1;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        d6.a.e(obj2);
                        return d6.z.f2639a;
                    }
                    d6.a.e(obj2);
                }
                mVar.f4505h = 2;
            }
        }
        mVar = new m(this, dVar);
        Object obj22 = mVar.f4503f;
        i7 = mVar.f4505h;
        i6.a aVar2 = i6.a.f4956f;
        if (i7 != 0) {
        }
        mVar.f4505h = 2;
    }
}
