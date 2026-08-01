package d3;

import android.view.View;
import com.gglhk.bofio.fortunetiger.MainActivity;
import com.gglhk.bofio.fortunetiger.MainActivity2;
import f1.n;
import f1.o;
import j2.d0;
import k0.m;
import k0.m1;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements n, m, d0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1487f;

    public /* synthetic */ a(int i4) {
        this.f1487f = i4;
    }

    @Override // f1.n
    public void a(f1.m mVar, o oVar) {
        switch (this.f1487f) {
            case 1:
                mVar.f(oVar);
                break;
            case 2:
                mVar.e(oVar);
                break;
            case 3:
                mVar.a(oVar);
                break;
            case 4:
                mVar.b();
                break;
            default:
                mVar.c();
                break;
        }
    }

    @Override // k0.m
    public m1 d(View view, m1 m1Var) {
        switch (this.f1487f) {
            case 6:
                int i4 = MainActivity.I;
                c0.c f4 = m1Var.f2760a.f(519);
                view.setPadding(f4.f978a, f4.f979b, f4.c, f4.f980d);
                break;
            default:
                int i5 = MainActivity2.F;
                c0.c f5 = m1Var.f2760a.f(519);
                view.setPadding(view.getPaddingLeft() + f5.f978a, view.getPaddingTop() + f5.f979b, view.getPaddingRight() + f5.c, view.getPaddingBottom() + f5.f980d);
                break;
        }
        return m1Var;
    }
}
