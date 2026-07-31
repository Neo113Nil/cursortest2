package b6;

import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class w1 extends z1 {

    /* renamed from: d, reason: collision with root package name */
    public static final w1 f1496d;

    static {
        l1.e eVar = a.a.f8j;
        if (eVar == null) {
            l1.d dVar = new l1.d("Filled.PlayArrow");
            int i = l1.y.f4827a;
            f1.k0 k0Var = new f1.k0(f1.s.f2698b);
            ArrayList arrayList = new ArrayList(32);
            arrayList.add(new l1.l(8.0f, 5.0f));
            arrayList.add(new l1.r(14.0f));
            arrayList.add(new l1.p(11.0f, -7.0f));
            arrayList.add(l1.h.f4778b);
            l1.d.a(dVar, arrayList, k0Var);
            eVar = dVar.b();
            a.a.f8j = eVar;
        }
        f1496d = new w1("game", "Game", eVar);
    }
}
