package D0;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f851a;

    /* renamed from: b, reason: collision with root package name */
    public float f852b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f853c;

    public q(int i3, z0.e eVar) {
        this.f851a = i3;
        this.f853c = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i3, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        int i4;
        int i5 = 1;
        G g3 = (G) this.f853c;
        if (z3) {
            int c2 = B.c(g3.f827f, i3, z3);
            int lineStart = g3.f827f.getLineStart(c2);
            int f3 = g3.f(c2);
            if (i3 == lineStart || i3 == f3) {
                z6 = true;
                int i6 = i3 * 4;
                if (z5) {
                    i5 = z6 ? 2 : 3;
                } else if (z6) {
                    i5 = 0;
                }
                i4 = i6 + i5;
                if (this.f851a != i4) {
                    return this.f852b;
                }
                float h3 = z5 ? g3.h(i3, z3) : g3.i(i3, z3);
                if (z4) {
                    this.f851a = i4;
                    this.f852b = h3;
                }
                return h3;
            }
        }
        z6 = false;
        int i62 = i3 * 4;
        if (z5) {
        }
        i4 = i62 + i5;
        if (this.f851a != i4) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f3, X1.c cVar) {
        z0.h hVar;
        int i3;
        q qVar;
        if (cVar instanceof z0.h) {
            hVar = (z0.h) cVar;
            int i4 = hVar.f10540j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                hVar.f10540j = i4 - Integer.MIN_VALUE;
                Object obj = hVar.f10538h;
                W1.a aVar = W1.a.f4608d;
                i3 = hVar.f10540j;
                if (i3 != 0) {
                    R1.a.e(obj);
                    Float f4 = new Float(f3);
                    hVar.f10537g = this;
                    hVar.f10540j = 1;
                    obj = ((z0.e) this.f853c).h(f4, hVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                    qVar = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar = hVar.f10537g;
                    R1.a.e(obj);
                }
                qVar.f852b += ((Number) obj).floatValue();
                return R1.y.f4171a;
            }
        }
        hVar = new z0.h(this, cVar);
        Object obj2 = hVar.f10538h;
        W1.a aVar2 = W1.a.f4608d;
        i3 = hVar.f10540j;
        if (i3 != 0) {
        }
        qVar.f852b += ((Number) obj2).floatValue();
        return R1.y.f4171a;
    }

    public q(G g3) {
        this.f853c = g3;
        this.f851a = -1;
    }
}
