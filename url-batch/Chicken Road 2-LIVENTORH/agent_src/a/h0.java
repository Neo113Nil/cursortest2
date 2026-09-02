package a;

import android.content.res.Resources;
import android.view.View;
import com.oriondriftchasers.arordrft.MainActivity;
import n0.q1;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements e3.l, j1.n, o2.z, n0.n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f29f;

    public /* synthetic */ h0(int i) {
        this.f29f = i;
    }

    @Override // j1.n
    public void a(j1.m mVar, j1.o oVar) {
        switch (this.f29f) {
            case 1:
                mVar.f(oVar);
                break;
            case 2:
                mVar.c(oVar);
                break;
            case 3:
                mVar.a(oVar);
                break;
            case 4:
                mVar.d();
                break;
            default:
                mVar.e();
                break;
        }
    }

    @Override // e3.l
    public Object b(Object obj) {
        Resources resources = (Resources) obj;
        f3.d.e(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }

    @Override // n0.n
    public q1 t(View view, q1 q1Var) {
        int i = MainActivity.E;
        f3.d.e(view, "v");
        f0.c f2 = q1Var.f2775a.f(519);
        f3.d.d(f2, "getInsets(...)");
        view.setPadding(f2.f1266a, f2.f1267b, f2.f1268c, f2.d);
        return q1Var;
    }
}
