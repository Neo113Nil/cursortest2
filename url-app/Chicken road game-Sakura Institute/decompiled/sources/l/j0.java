package l;

import android.content.Context;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import g0.m2;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j0 implements g0.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5550a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5551b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5552c;

    public /* synthetic */ j0(Object obj, int i7, Object obj2) {
        this.f5550a = i7;
        this.f5551b = obj;
        this.f5552c = obj2;
    }

    @Override // g0.g0
    public final void a() {
        int i7 = this.f5550a;
        Object obj = this.f5552c;
        Object obj2 = this.f5551b;
        switch (i7) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((h0) obj2).f5500a.n((f0) obj);
                break;
            case 1:
                ((p1) obj2).f5619j.remove((p1) obj);
                break;
            case 2:
                p1 p1Var = (p1) obj2;
                p1Var.getClass();
                j1 j1Var = (j1) ((k1) obj).f5560b.getValue();
                if (j1Var != null) {
                    p1Var.f5618i.remove(j1Var.f5553f);
                    break;
                }
                break;
            case 3:
                ((p1) obj2).f5618i.remove((n1) obj);
                break;
            case 4:
                q.u0 u0Var = (q.u0) obj2;
                View view = (View) obj;
                int i8 = u0Var.f7366s - 1;
                u0Var.f7366s = i8;
                if (i8 == 0) {
                    int i9 = b3.s.f1365a;
                    b3.l.u(view, null);
                    b3.s.a(view, null);
                    view.removeOnAttachStateChangeListener(u0Var.f7367t);
                    break;
                }
                break;
            case 5:
                ((s.g0) obj2).f8009c.add(obj);
                break;
            case 6:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((s1.m0) obj);
                break;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((s1.n0) obj);
                break;
            case 8:
                ((t3.h) obj2).f8798m.f((u3.m) obj);
                break;
            case q.c.f7259c /* 9 */:
                Iterator it = ((List) ((m2) obj2).getValue()).iterator();
                while (it.hasNext()) {
                    ((u3.i) obj).b().b((t3.h) it.next());
                }
                break;
            default:
                g0.z0 z0Var = (g0.z0) obj2;
                p.l lVar = (p.l) z0Var.getValue();
                if (lVar != null) {
                    p.k kVar = new p.k(lVar);
                    p.j jVar = (p.j) obj;
                    if (jVar != null) {
                        jVar.c(kVar);
                    }
                    z0Var.setValue(null);
                    break;
                }
                break;
        }
    }
}
