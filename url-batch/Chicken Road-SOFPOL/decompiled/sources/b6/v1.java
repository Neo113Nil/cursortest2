package b6;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class v1 extends z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final v1 f1482d;

    static {
        l1.e eVar = a.a.f7h;
        if (eVar == null) {
            l1.d dVar = new l1.d("Filled.Info");
            int i = l1.y.f4827a;
            f1.k0 k0Var = new f1.k0(f1.s.f2698b);
            h4.k kVar = new h4.k(1);
            kVar.h(12.0f, 2.0f);
            kVar.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            kVar.i(4.48f, 10.0f, 10.0f, 10.0f);
            kVar.i(10.0f, -4.48f, 10.0f, -10.0f);
            l1.m mVar = new l1.m(17.52f, 2.0f, 12.0f, 2.0f);
            ArrayList arrayList = kVar.f3194a;
            arrayList.add(mVar);
            kVar.a();
            kVar.h(13.0f, 17.0f);
            kVar.e(-2.0f);
            kVar.j(-6.0f);
            kVar.e(2.0f);
            kVar.j(6.0f);
            kVar.a();
            kVar.h(13.0f, 9.0f);
            kVar.e(-2.0f);
            kVar.f(11.0f, 7.0f);
            kVar.e(2.0f);
            kVar.j(2.0f);
            kVar.a();
            l1.d.a(dVar, arrayList, k0Var);
            eVar = dVar.b();
            a.a.f7h = eVar;
        }
        f1482d = new v1("encyclopedia", "Encyclopedia", eVar);
    }
}
