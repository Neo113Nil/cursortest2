package b3;

import d2.f1;
import n0.a0;
import v.h0;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class a implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1050b;

    public /* synthetic */ a(int i3, Object obj) {
        this.f1049a = i3;
        this.f1050b = obj;
    }

    @Override // n0.a0
    public final void a() {
        switch (this.f1049a) {
            case 0:
                q qVar = (q) this.f1050b;
                qVar.dismiss();
                qVar.f1088v.f();
                break;
            case 1:
                ((f1) this.f1050b).f3410e.invoke();
                break;
            case 2:
                ((h0) this.f1050b).D(null);
                break;
            default:
                z0 z0Var = (z0) this.f1050b;
                z0Var.i();
                z0Var.f9917a.r();
                break;
        }
    }
}
