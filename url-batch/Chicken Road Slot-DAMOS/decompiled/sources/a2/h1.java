package a2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s.w f99a;

    /* renamed from: b, reason: collision with root package name */
    public static final f1[] f100b;

    static {
        s.w wVar = new s.w(8);
        f1.f90a.getClass();
        g1 g1Var = e1.g;
        wVar.h(1, g1Var);
        g1 g1Var2 = e1.f86f;
        wVar.h(2, g1Var2);
        g1 g1Var3 = e1.f82b;
        wVar.h(4, g1Var3);
        g1 g1Var4 = e1.f84d;
        wVar.h(8, g1Var4);
        g1 g1Var5 = e1.f87h;
        wVar.h(16, g1Var5);
        g1 g1Var6 = e1.f85e;
        wVar.h(32, g1Var6);
        g1 g1Var7 = e1.f88i;
        wVar.h(64, g1Var7);
        g1 g1Var8 = e1.f83c;
        wVar.h(128, g1Var8);
        f99a = wVar;
        f100b = new f1[]{g1Var, g1Var2, g1Var3, g1Var7, g1Var5, g1Var6, g1Var4, e1.j, g1Var8};
    }

    public static final void a(c2.l0 l0Var, l lVar, long j, int i3, int i10) {
        if (q.g(j, -1L)) {
            return;
        }
        l0Var.a(lVar.b(), (int) ((j >>> 48) & 65535));
        l0Var.a(lVar.d(), (int) ((j >>> 32) & 65535));
        l0Var.a(lVar.c(), i3 - ((int) ((j >>> 16) & 65535)));
        l0Var.a(lVar.a(), i10 - ((int) (j & 65535)));
    }
}
