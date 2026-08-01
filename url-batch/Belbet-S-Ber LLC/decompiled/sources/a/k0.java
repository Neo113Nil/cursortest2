package a;

import android.content.res.Resources;
import android.view.View;
import com.gdmhkmf.belbet.MainActivity;
import com.gdmhkmf.belbet.MainActivity2;
import n0.v1;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements h3.l, k1.m, n0.p, s2.z {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f37f;

    public /* synthetic */ k0(int i) {
        this.f37f = i;
    }

    @Override // k1.m
    public void a(k1.l lVar, k1.n nVar) {
        switch (this.f37f) {
            case 1:
                lVar.b(nVar);
                break;
            case 2:
                lVar.d(nVar);
                break;
            case 3:
                lVar.a(nVar);
                break;
            case 4:
                lVar.c();
                break;
            default:
                lVar.e();
                break;
        }
    }

    @Override // h3.l
    public Object b(Object obj) {
        Resources resources = (Resources) obj;
        i3.d.e(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }

    @Override // n0.p
    public v1 l(View view, v1 v1Var) {
        switch (this.f37f) {
            case 8:
                int i = MainActivity.L;
                f0.c h = v1Var.f2842a.h(519);
                view.setPadding(h.f1415a, h.f1416b, h.f1417c, h.d);
                break;
            default:
                int i4 = MainActivity2.M;
                f0.c h5 = v1Var.f2842a.h(519);
                view.setPadding(h5.f1415a, h5.f1416b, h5.f1417c, h5.d);
                break;
        }
        return v1Var;
    }
}
