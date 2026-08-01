package l9;

import te.b0;
import te.d1;
import te.j0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f5944a;
    private static final re.e descriptor;

    static {
        g gVar = new g();
        f5944a = gVar;
        d1 d1Var = new d1("com.manholeroboramprush.cardestroy.ui.navigation.Portal.GameOver", gVar, 1);
        d1Var.j("score");
        descriptor = d1Var;
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        i iVar = (i) obj;
        iVar.getClass();
        re.e eVar = descriptor;
        eVar.getClass();
        int i3 = iVar.f5945a;
        oVar.e(eVar, 0);
        oVar.i(i3);
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        re.e eVar = descriptor;
        eVar.getClass();
        boolean z10 = true;
        int i3 = 0;
        int i10 = 0;
        while (z10) {
            int a9 = lVar.a(eVar);
            if (a9 == -1) {
                z10 = false;
            } else {
                if (a9 != 0) {
                    throw new pe.b(v4.a.j(a9, "An unknown field for index "));
                }
                i10 = lVar.c();
                i3 = 1;
            }
        }
        return new i(i3, i10);
    }

    @Override // te.b0
    public final pe.a[] c() {
        return new pe.a[]{j0.f9391a};
    }

    @Override // pe.a
    public final re.e d() {
        return descriptor;
    }
}
