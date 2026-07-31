package androidx.compose.ui.layout;

import o.x;
import u1.b1;
import u1.c1;
import u1.d1;
import u1.n;
import u1.o;
import u1.s0;
import w1.k0;
import y0.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final x f561a;

    /* renamed from: b, reason: collision with root package name */
    public static final c1[] f562b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f563c;

    static {
        x xVar = new x(8);
        c1.f7199a.getClass();
        d1 d1Var = b1.f7194g;
        xVar.g(1, d1Var);
        d1 d1Var2 = b1.f7193f;
        xVar.g(2, d1Var2);
        d1 d1Var3 = b1.f7189b;
        xVar.g(4, d1Var3);
        d1 d1Var4 = b1.f7191d;
        xVar.g(8, d1Var4);
        d1 d1Var5 = b1.f7195h;
        xVar.g(16, d1Var5);
        d1 d1Var6 = b1.f7192e;
        xVar.g(32, d1Var6);
        d1 d1Var7 = b1.i;
        xVar.g(64, d1Var7);
        f561a = xVar;
        f562b = new c1[]{d1Var, d1Var2, d1Var3, d1Var7, d1Var5, d1Var6, d1Var4, b1.f7196j, b1.f7190c};
        x xVar2 = new x(7);
        xVar2.g(1, d1Var);
        xVar2.g(2, d1Var2);
        xVar2.g(4, d1Var3);
        xVar2.g(16, d1Var5);
        xVar2.g(64, d1Var7);
        xVar2.g(32, d1Var6);
        xVar2.g(8, d1Var4);
        f563c = xVar2;
    }

    public static final void a(k0 k0Var, n nVar, long j7, int i, int i8) {
        if (s0.f(j7, -1L)) {
            return;
        }
        k0Var.d(nVar.b(), (int) ((j7 >>> 48) & 65535));
        k0Var.d(nVar.d(), (int) ((j7 >>> 32) & 65535));
        k0Var.d(nVar.c(), i - ((int) ((j7 >>> 16) & 65535)));
        k0Var.d(nVar.a(), i8 - ((int) (j7 & 65535)));
    }

    public static final m b(o oVar) {
        return new RulerProviderModifierElement(oVar);
    }
}
