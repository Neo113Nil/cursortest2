package T0;

import K.InterfaceC0020p;
import K.w0;
import android.view.View;

/* loaded from: classes.dex */
public final class e implements InterfaceC0020p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f1032a;

    public /* synthetic */ e(i iVar) {
        this.f1032a = iVar;
    }

    public void a(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        this.f1032a.a(0);
    }

    @Override // K.InterfaceC0020p
    public w0 d(View view, w0 w0Var) {
        int a2 = w0Var.a();
        i iVar = this.f1032a;
        iVar.f1058m = a2;
        iVar.f1059n = w0Var.b();
        iVar.f1060o = w0Var.c();
        iVar.e();
        return w0Var;
    }
}
