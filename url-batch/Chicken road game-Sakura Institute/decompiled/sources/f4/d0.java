package f4;

import a0.b1;
import android.content.Context;
import androidx.lifecycle.r0;
import c7.g0;
import c7.n1;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ x6.e[] f3311a;

    /* renamed from: b, reason: collision with root package name */
    public static final j3.b f3312b;

    static {
        r6.p pVar = new r6.p(d0.class, "plateStore", "getPlateStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        r6.w.f7969a.getClass();
        f3311a = new x6.e[]{pVar};
        j7.e eVar = g0.f1696a;
        j7.d dVar = j7.d.f5151h;
        n1 b9 = c7.a0.b();
        dVar.getClass();
        f3312b = new j3.b(j3.a.f4993g, c7.a0.a(t6.a.I(dVar, b9)));
    }

    public static final b6.c a(Context context) {
        b6.c cVar;
        j3.b bVar = f3312b;
        x6.e eVar = f3311a[0];
        bVar.getClass();
        r6.k.f(eVar, "property");
        b6.c cVar2 = bVar.f4997d;
        if (cVar2 != null) {
            return cVar2;
        }
        synchronized (bVar.f4996c) {
            try {
                if (bVar.f4997d == null) {
                    Context applicationContext = context.getApplicationContext();
                    q6.c cVar3 = bVar.f4994a;
                    r6.k.e(applicationContext, "applicationContext");
                    List list = (List) cVar3.f(applicationContext);
                    c7.x xVar = bVar.f4995b;
                    b1 b1Var = new b1(applicationContext, 2, bVar);
                    r6.k.f(list, "migrations");
                    g3.a0 a0Var = new g3.a0(new i3.f(f8.m.f3625a, new r0(16, b1Var)), t6.a.F(new a0.e0(list, (h6.d) null, 8)), new j4.i(11), xVar);
                    bVar.f4997d = new b6.c(25, new b6.c(25, a0Var));
                }
                cVar = bVar.f4997d;
                r6.k.c(cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}
