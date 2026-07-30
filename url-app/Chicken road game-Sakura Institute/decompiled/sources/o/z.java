package o;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends j6.i implements q6.e {

    /* renamed from: g, reason: collision with root package name */
    public int f6799g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f6800h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x0 f6801i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ l1.d0 f6802j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ a0.j0 f6803k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0.y f6804l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a0 f6805m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0 f6806n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ d0.b0 f6807o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(x0 x0Var, l1.d0 d0Var, a0.j0 j0Var, a0.y yVar, a0 a0Var, a0 a0Var2, d0.b0 b0Var, h6.d dVar) {
        super(2, dVar);
        this.f6801i = x0Var;
        this.f6802j = d0Var;
        this.f6803k = j0Var;
        this.f6804l = yVar;
        this.f6805m = a0Var;
        this.f6806n = a0Var2;
        this.f6807o = b0Var;
    }

    @Override // j6.a
    public final h6.d create(Object obj, h6.d dVar) {
        z zVar = new z(this.f6801i, this.f6802j, this.f6803k, this.f6804l, this.f6805m, this.f6806n, this.f6807o, dVar);
        zVar.f6800h = obj;
        return zVar;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        return ((z) create((c7.x) obj, (h6.d) obj2)).invokeSuspend(d6.z.f2639a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    @Override // j6.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c7.x xVar;
        e7.e eVar;
        int i7 = this.f6799g;
        d6.z zVar = d6.z.f2639a;
        x0 x0Var = this.f6801i;
        if (i7 == 0) {
            d6.a.e(obj);
            c7.x xVar2 = (c7.x) this.f6800h;
            try {
                j0 j0Var = x0Var.f6792u;
                l1.d0 d0Var = this.f6802j;
                a0.j0 j0Var2 = this.f6803k;
                a0.y yVar = this.f6804l;
                a0 a0Var = this.f6805m;
                a0 a0Var2 = this.f6806n;
                d0.b0 b0Var = this.f6807o;
                this.f6800h = xVar2;
                this.f6799g = 1;
                float f9 = y.f6798a;
                Object r8 = t6.a.r(d0Var, new w(a0Var2, new r6.u(), j0Var, j0Var2, b0Var, a0Var, yVar, null), this);
                i6.a aVar = i6.a.f4956f;
                if (r8 != aVar) {
                    r8 = zVar;
                }
                if (r8 == aVar) {
                    return aVar;
                }
            } catch (CancellationException e9) {
                e = e9;
                xVar = xVar2;
                CancellationException cancellationException = e;
                eVar = x0Var.f6796y;
                if (eVar != null) {
                    eVar.e(n.f6697a);
                }
                if (!c7.a0.n(xVar)) {
                    throw cancellationException;
                }
                return zVar;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = (c7.x) this.f6800h;
            try {
                d6.a.e(obj);
            } catch (CancellationException e10) {
                e = e10;
                CancellationException cancellationException2 = e;
                eVar = x0Var.f6796y;
                if (eVar != null) {
                }
                if (!c7.a0.n(xVar)) {
                }
                return zVar;
            }
        }
        return zVar;
    }
}
