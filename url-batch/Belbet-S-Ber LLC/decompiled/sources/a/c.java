package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements h3.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f4f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g.i f5g;

    public /* synthetic */ c(g.i iVar, int i) {
        this.f4f = i;
        this.f5g = iVar;
    }

    @Override // h3.a
    public final Object a() {
        switch (this.f4f) {
            case 0:
                this.f5g.reportFullyDrawn();
                return w2.d.f3820c;
            case 1:
                g.i iVar = this.f5g;
                return new z(iVar.f50k, new c(iVar, 0));
            case 2:
                d1.a aVar = new d1.a();
                this.f5g.i().a().b(aVar);
                return aVar;
            default:
                g.i iVar2 = this.f5g;
                j0 j0Var = new j0(new e(iVar2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (i3.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        iVar2.f871f.a(new d(j0Var, iVar2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new b(iVar2, j0Var, 0));
                    }
                }
                return j0Var;
        }
    }
}
