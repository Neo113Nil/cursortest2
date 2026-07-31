package b6;

import android.content.Context;
import com.snovikpovik.vuevnxsj.MainActivity;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ w6.d[] f1497a;

    /* renamed from: b, reason: collision with root package name */
    public static final a4.b f1498b;

    static {
        q6.m mVar = new q6.m(q6.b.f6187d, x.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 1);
        q6.t.f6206a.getClass();
        f1497a = new w6.d[]{mVar};
        a4.a aVar = new a4.a(0);
        h7.e eVar = a7.d0.f249a;
        h7.d dVar = h7.d.f3236f;
        a7.j1 j1Var = new a7.j1(null);
        dVar.getClass();
        f1498b = new a4.b(aVar, a7.x.a(a.a.v(dVar, j1Var)));
    }

    public static final b1.b a(MainActivity mainActivity) {
        b1.b bVar;
        a4.b bVar2 = f1498b;
        w6.d dVar = f1497a[0];
        bVar2.getClass();
        q6.i.e(dVar, "property");
        b1.b bVar3 = bVar2.f230d;
        if (bVar3 != null) {
            return bVar3;
        }
        synchronized (bVar2.f229c) {
            try {
                if (bVar2.f230d == null) {
                    Context applicationContext = mainActivity.getApplicationContext();
                    p6.c cVar = bVar2.f227a;
                    q6.i.b(applicationContext);
                    List list = (List) cVar.i(applicationContext);
                    a7.u uVar = bVar2.f228b;
                    a0.z0 z0Var = new a0.z0(1, applicationContext, bVar2);
                    q6.i.e(list, "migrations");
                    bVar2.f230d = new b1.b(2, new b1.b(2, new y3.b0(new y3.e0(new androidx.lifecycle.m0(1, z0Var)), s6.a.x(new b0.d(list, (g6.c) null, 16)), new p.b(21), uVar)));
                }
                bVar = bVar2.f230d;
                q6.i.b(bVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }
}
