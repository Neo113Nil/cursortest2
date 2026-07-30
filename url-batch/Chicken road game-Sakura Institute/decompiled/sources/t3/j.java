package t3;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements androidx.lifecycle.t {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8810g;

    public /* synthetic */ j(int i7, Object obj) {
        this.f8809f = i7;
        this.f8810g = obj;
    }

    @Override // androidx.lifecycle.t
    public final void c(androidx.lifecycle.v vVar, androidx.lifecycle.n nVar) {
        switch (this.f8809f) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                b0 b0Var = (b0) this.f8810g;
                b0Var.f8762r = nVar.a();
                if (b0Var.f8747c != null) {
                    Iterator<E> it = b0Var.f8751g.iterator();
                    while (it.hasNext()) {
                        h hVar = (h) it.next();
                        hVar.getClass();
                        hVar.f8794i = nVar.a();
                        hVar.i();
                    }
                    break;
                }
                break;
            default:
                x3.e eVar = (x3.e) this.f8810g;
                r6.k.f(eVar, "this$0");
                if (nVar != androidx.lifecycle.n.ON_START) {
                    if (nVar == androidx.lifecycle.n.ON_STOP) {
                        eVar.f9680f = false;
                        break;
                    }
                } else {
                    eVar.f9680f = true;
                    break;
                }
                break;
        }
    }
}
