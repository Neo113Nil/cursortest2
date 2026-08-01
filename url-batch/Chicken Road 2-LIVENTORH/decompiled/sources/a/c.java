package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements e3.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g.j f6g;

    public /* synthetic */ c(g.j jVar, int i) {
        this.f5f = i;
        this.f6g = jVar;
    }

    @Override // e3.a
    public final Object a() {
        switch (this.f5f) {
            case 0:
                this.f6g.reportFullyDrawn();
                return z2.d.f3888c;
            case 1:
                g.j jVar = this.f6g;
                return new z(jVar.f48k, new c(jVar, 0));
            case 2:
                c1.a aVar = new c1.a();
                this.f6g.i().f25b.b(aVar);
                return aVar;
            default:
                g.j jVar2 = this.f6g;
                g0 g0Var = new g0(new e(jVar2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (f3.d.a(Looper.myLooper(), Looper.getMainLooper())) {
                        jVar2.f754f.a(new d(g0Var, jVar2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new b(jVar2, g0Var, 0));
                    }
                }
                return g0Var;
        }
    }
}
