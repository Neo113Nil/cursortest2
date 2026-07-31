package R;

import D1.C0014b;
import I.B0;
import I.X;
import S.r;

/* loaded from: classes.dex */
public final class b implements B0 {

    /* renamed from: d, reason: collision with root package name */
    public n f3129d;

    /* renamed from: e, reason: collision with root package name */
    public k f3130e;

    /* renamed from: f, reason: collision with root package name */
    public String f3131f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3132g;

    /* renamed from: h, reason: collision with root package name */
    public Object[] f3133h;

    /* renamed from: i, reason: collision with root package name */
    public C0014b f3134i;

    /* renamed from: j, reason: collision with root package name */
    public final A2.l f3135j = new A2.l(14, this);

    public b(n nVar, k kVar, String str, Object obj, Object[] objArr) {
        this.f3129d = nVar;
        this.f3130e = kVar;
        this.f3131f = str;
        this.f3132g = obj;
        this.f3133h = objArr;
    }

    @Override // I.B0
    public final void a() {
        C0014b c0014b = this.f3134i;
        if (c0014b != null) {
            c0014b.z();
        }
    }

    @Override // I.B0
    public final void b() {
        d();
    }

    @Override // I.B0
    public final void c() {
        C0014b c0014b = this.f3134i;
        if (c0014b != null) {
            c0014b.z();
        }
    }

    public final void d() {
        String y3;
        k kVar = this.f3130e;
        if (this.f3134i != null) {
            throw new IllegalArgumentException(("entry(" + this.f3134i + ") is not null").toString());
        }
        if (kVar != null) {
            A2.l lVar = this.f3135j;
            Object b2 = lVar.b();
            if (b2 == null || kVar.c(b2)) {
                this.f3134i = kVar.a(this.f3131f, lVar);
                return;
            }
            if (b2 instanceof r) {
                r rVar = (r) b2;
                if (rVar.a() == X.f2225f || rVar.a() == X.f2228i || rVar.a() == X.f2226g) {
                    y3 = "MutableState containing " + rVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    y3 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                y3 = I2.d.y(b2);
            }
            throw new IllegalArgumentException(y3);
        }
    }
}
