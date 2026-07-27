package P;

import B1.C0097d;
import G.A0;
import G.W;
import Q.s;

/* loaded from: classes.dex */
public final class b implements A0 {

    /* renamed from: d, reason: collision with root package name */
    public n f3640d;

    /* renamed from: e, reason: collision with root package name */
    public k f3641e;

    /* renamed from: i, reason: collision with root package name */
    public String f3642i;

    /* renamed from: j, reason: collision with root package name */
    public Object f3643j;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f3644k;

    /* renamed from: l, reason: collision with root package name */
    public C0097d f3645l;

    /* renamed from: m, reason: collision with root package name */
    public final A3.e f3646m = new A3.e(8, this);

    public b(n nVar, k kVar, String str, Object obj, Object[] objArr) {
        this.f3640d = nVar;
        this.f3641e = kVar;
        this.f3642i = str;
        this.f3643j = obj;
        this.f3644k = objArr;
    }

    @Override // G.A0
    public final void a() {
        C0097d c0097d = this.f3645l;
        if (c0097d != null) {
            c0097d.I();
        }
    }

    @Override // G.A0
    public final void b() {
        c();
    }

    public final void c() {
        String d02;
        k kVar = this.f3641e;
        if (this.f3645l != null) {
            throw new IllegalArgumentException(("entry(" + this.f3645l + ") is not null").toString());
        }
        if (kVar != null) {
            A3.e eVar = this.f3646m;
            Object invoke = eVar.invoke();
            if (invoke == null || kVar.b(invoke)) {
                this.f3645l = kVar.e(this.f3642i, eVar);
                return;
            }
            if (invoke instanceof s) {
                s sVar = (s) invoke;
                if (sVar.a() == W.f2776i || sVar.a() == W.f2779l || sVar.a() == W.f2777j) {
                    d02 = "MutableState containing " + sVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    d02 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                d02 = u3.l.d0(invoke);
            }
            throw new IllegalArgumentException(d02);
        }
    }

    @Override // G.A0
    public final void d() {
        C0097d c0097d = this.f3645l;
        if (c0097d != null) {
            c0097d.I();
        }
    }
}
