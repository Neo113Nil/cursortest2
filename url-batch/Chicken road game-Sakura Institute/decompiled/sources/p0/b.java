package p0;

import androidx.lifecycle.r0;
import g0.t0;
import g0.u1;
import q0.o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b implements u1 {

    /* renamed from: f, reason: collision with root package name */
    public l f6986f;

    /* renamed from: g, reason: collision with root package name */
    public i f6987g;

    /* renamed from: h, reason: collision with root package name */
    public String f6988h;

    /* renamed from: i, reason: collision with root package name */
    public Object f6989i;

    /* renamed from: j, reason: collision with root package name */
    public Object[] f6990j;

    /* renamed from: k, reason: collision with root package name */
    public b1.b f6991k;

    /* renamed from: l, reason: collision with root package name */
    public final r0 f6992l = new r0(21, this);

    public b(l lVar, i iVar, String str, Object obj, Object[] objArr) {
        this.f6986f = lVar;
        this.f6987g = iVar;
        this.f6988h = str;
        this.f6989i = obj;
        this.f6990j = objArr;
    }

    @Override // g0.u1
    public final void a() {
        d();
    }

    @Override // g0.u1
    public final void b() {
        b1.b bVar = this.f6991k;
        if (bVar != null) {
            bVar.E();
        }
    }

    @Override // g0.u1
    public final void c() {
        b1.b bVar = this.f6991k;
        if (bVar != null) {
            bVar.E();
        }
    }

    public final void d() {
        String t2;
        i iVar = this.f6987g;
        if (this.f6991k != null) {
            throw new IllegalArgumentException(("entry(" + this.f6991k + ") is not null").toString());
        }
        if (iVar != null) {
            r0 r0Var = this.f6992l;
            Object a3 = r0Var.a();
            if (a3 == null || iVar.a(a3)) {
                this.f6991k = iVar.d(this.f6988h, r0Var);
                return;
            }
            if (a3 instanceof o) {
                o oVar = (o) a3;
                if (oVar.b() == t0.f3900h || oVar.b() == t0.f3903k || oVar.b() == t0.f3901i) {
                    t2 = "MutableState containing " + oVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    t2 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                t2 = a.a.t(a3);
            }
            throw new IllegalArgumentException(t2);
        }
    }
}
