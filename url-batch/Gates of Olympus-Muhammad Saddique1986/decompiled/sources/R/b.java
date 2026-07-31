package R;

import I.A0;
import I.W;
import S.q;

/* loaded from: classes.dex */
public final class b implements A0 {

    /* renamed from: d, reason: collision with root package name */
    public n f4002d;

    /* renamed from: e, reason: collision with root package name */
    public k f4003e;

    /* renamed from: f, reason: collision with root package name */
    public String f4004f;

    /* renamed from: g, reason: collision with root package name */
    public Object f4005g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f4006h;

    /* renamed from: i, reason: collision with root package name */
    public G1.m f4007i;

    /* renamed from: j, reason: collision with root package name */
    public final A.h f4008j = new A.h(13, this);

    public b(n nVar, k kVar, String str, Object obj, Object[] objArr) {
        this.f4002d = nVar;
        this.f4003e = kVar;
        this.f4004f = str;
        this.f4005g = obj;
        this.f4006h = objArr;
    }

    @Override // I.A0
    public final void a() {
        G1.m mVar = this.f4007i;
        if (mVar != null) {
            mVar.A();
        }
    }

    @Override // I.A0
    public final void b() {
        d();
    }

    @Override // I.A0
    public final void c() {
        G1.m mVar = this.f4007i;
        if (mVar != null) {
            mVar.A();
        }
    }

    public final void d() {
        String M3;
        k kVar = this.f4003e;
        if (this.f4007i != null) {
            throw new IllegalArgumentException(("entry(" + this.f4007i + ") is not null").toString());
        }
        if (kVar != null) {
            A.h hVar = this.f4008j;
            Object b3 = hVar.b();
            if (b3 == null || kVar.b(b3)) {
                this.f4007i = kVar.d(this.f4004f, hVar);
                return;
            }
            if (b3 instanceof q) {
                q qVar = (q) b3;
                if (qVar.a() == W.f2780f || qVar.a() == W.f2783i || qVar.a() == W.f2781g) {
                    M3 = "MutableState containing " + qVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    M3 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                M3 = O2.d.M(b3);
            }
            throw new IllegalArgumentException(M3);
        }
    }
}
