package n8;

import a3.t;
import android.content.Context;
import ge.a0;
import ge.k0;
import ge.s1;
import java.util.List;
import kotlin.jvm.functions.Function1;
import ne.d;
import ne.e;
import v.c1;
import wd.c0;
import wd.x;
import wd.y;
import x3.e0;
import x3.z;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ y[] f7182d;

    /* renamed from: a, reason: collision with root package name */
    public final String f7183a;

    /* renamed from: b, reason: collision with root package name */
    public final ThreadLocal f7184b;

    /* renamed from: c, reason: collision with root package name */
    public final d9.c f7185c;

    static {
        x xVar = new x(0, c.class, wd.c.f10142d, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        c0.f10143a.getClass();
        f7182d = new y[]{xVar};
    }

    public c(Context context, String str) {
        d9.c cVar;
        context.getClass();
        this.f7183a = str;
        this.f7184b = new ThreadLocal();
        int i3 = 0;
        c1 c1Var = new c1(6, new a(this, i3));
        a aVar = new a(this, 1);
        e eVar = k0.f4372a;
        d dVar = d.f7275i;
        s1 d10 = a0.d();
        dVar.getClass();
        le.d b10 = a0.b(kotlin.coroutines.e.c(dVar, d10));
        a4.b bVar = new a4.b(str, c1Var, aVar, b10);
        f7182d[0].getClass();
        d9.c cVar2 = bVar.f280d;
        if (cVar2 == null) {
            synchronized (bVar.f279c) {
                try {
                    if (bVar.f280d == null) {
                        Context applicationContext = context.getApplicationContext();
                        applicationContext.getClass();
                        List list = (List) aVar.invoke(applicationContext);
                        a4.a aVar2 = new a4.a(i3, applicationContext, bVar);
                        list.getClass();
                        bVar.f280d = new d9.c(4, new d9.c(4, new z(new e0(new a1.b(4, aVar2)), kotlin.collections.x.c(new t(list, (ld.a) null, 22)), c1Var, b10)));
                    }
                    cVar = bVar.f280d;
                    cVar.getClass();
                } catch (Throwable th) {
                    throw th;
                }
            }
            cVar2 = cVar;
        }
        this.f7185c = cVar2;
    }

    public final void a(Function1 function1) {
    }
}
