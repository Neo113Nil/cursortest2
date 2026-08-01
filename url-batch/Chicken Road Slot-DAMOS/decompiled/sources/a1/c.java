package a1;

import n0.a2;
import te.a1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c implements a2 {

    /* renamed from: d, reason: collision with root package name */
    public r f8d;

    /* renamed from: e, reason: collision with root package name */
    public m f9e;

    /* renamed from: i, reason: collision with root package name */
    public String f10i;

    /* renamed from: r, reason: collision with root package name */
    public Object f11r;

    /* renamed from: s, reason: collision with root package name */
    public Object[] f12s;

    /* renamed from: t, reason: collision with root package name */
    public l f13t;

    /* renamed from: u, reason: collision with root package name */
    public final b f14u = new b(0, this);

    public c(r rVar, m mVar, String str, Object obj, Object[] objArr) {
        this.f8d = rVar;
        this.f9e = mVar;
        this.f10i = str;
        this.f11r = obj;
        this.f12s = objArr;
    }

    public final void a() {
        String a9;
        m mVar = this.f9e;
        if (this.f13t != null) {
            a1.c(this.f13t, ") is not null", "entry(");
            return;
        }
        if (mVar != null) {
            b bVar = this.f14u;
            Object invoke = bVar.invoke();
            if (invoke == null || mVar.c(invoke)) {
                this.f13t = mVar.f(this.f10i, bVar);
                return;
            }
            if (invoke instanceof b1.s) {
                b1.s sVar = (b1.s) invoke;
                if (sVar.d() == n0.e.f6660r || sVar.d() == n0.e.f6663u || sVar.d() == n0.e.f6661s) {
                    a9 = "MutableState containing " + sVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    a9 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                a9 = s.a(invoke);
            }
            throw new IllegalArgumentException(a9);
        }
    }

    @Override // n0.a2
    public final void b() {
        a();
    }

    @Override // n0.a2
    public final void c() {
        l lVar = this.f13t;
        if (lVar != null) {
            ((n) lVar).L();
        }
    }

    @Override // n0.a2
    public final void e() {
        l lVar = this.f13t;
        if (lVar != null) {
            ((n) lVar).L();
        }
    }
}
