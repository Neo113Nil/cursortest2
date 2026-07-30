package b2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f1289a;

    /* renamed from: b, reason: collision with root package name */
    public float f1290b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1291c;

    public o(int i7, x1.d dVar) {
        this.f1289a = i7;
        this.f1291c = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i7, boolean z8, boolean z9, boolean z10) {
        boolean z11;
        int i8;
        d0 d0Var = (d0) this.f1291c;
        int i9 = 1;
        if (z8) {
            int c4 = y.c(d0Var.f1267e, i7, z8);
            int lineStart = d0Var.f1267e.getLineStart(c4);
            int f9 = d0Var.f(c4);
            if (i7 == lineStart || i7 == f9) {
                z11 = true;
                int i10 = i7 * 4;
                if (z10) {
                    i9 = z11 ? 2 : 3;
                } else if (z11) {
                    i9 = 0;
                }
                i8 = i10 + i9;
                if (this.f1289a != i8) {
                    return this.f1290b;
                }
                float h3 = z10 ? d0Var.h(i7, z8) : d0Var.i(i7, z8);
                if (z9) {
                    this.f1289a = i8;
                    this.f1290b = h3;
                }
                return h3;
            }
        }
        z11 = false;
        int i102 = i7 * 4;
        if (z10) {
        }
        i8 = i102 + i9;
        if (this.f1289a != i8) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f9, j6.c cVar) {
        x1.h hVar;
        int i7;
        o oVar;
        if (cVar instanceof x1.h) {
            hVar = (x1.h) cVar;
            int i8 = hVar.f9664i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                hVar.f9664i = i8 - Integer.MIN_VALUE;
                Object obj = hVar.f9662g;
                i7 = hVar.f9664i;
                if (i7 != 0) {
                    d6.a.e(obj);
                    x1.d dVar = (x1.d) this.f1291c;
                    Float f10 = new Float(f9);
                    hVar.f9661f = this;
                    hVar.f9664i = 1;
                    obj = dVar.d(f10, hVar);
                    i6.a aVar = i6.a.f4956f;
                    if (obj == aVar) {
                        return aVar;
                    }
                    oVar = this;
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = hVar.f9661f;
                    d6.a.e(obj);
                }
                oVar.f1290b += ((Number) obj).floatValue();
                return d6.z.f2639a;
            }
        }
        hVar = new x1.h(this, cVar);
        Object obj2 = hVar.f9662g;
        i7 = hVar.f9664i;
        if (i7 != 0) {
        }
        oVar.f1290b += ((Number) obj2).floatValue();
        return d6.z.f2639a;
    }

    public o(d0 d0Var) {
        this.f1291c = d0Var;
        this.f1289a = -1;
    }
}
