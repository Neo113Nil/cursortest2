package L1;

import G3.u;
import T.C0097o;
import T.F;
import W.AbstractC0108a;
import W.J;
import a0.AbstractC0135a;
import a0.C0144j;
import android.content.Context;
import android.os.Build;
import b3.InterfaceC0264a;
import k.q0;

/* loaded from: classes.dex */
public final class k implements j0.k {

    /* renamed from: a, reason: collision with root package name */
    public Context f1648a;

    public /* synthetic */ k(Context context, boolean z) {
        this.f1648a = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 34) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int b(C0097o c0097o) {
        String str = c0097o.n;
        if (str == null || !F.k(str)) {
            return AbstractC0135a.f(0, 0, 0, 0);
        }
        String str2 = c0097o.n;
        String str3 = J.f3263a;
        str2.getClass();
        switch (str2) {
            case "image/jpeg":
            case "image/webp":
            case "image/bmp":
            case "image/png":
                return AbstractC0135a.f(4, 0, 0, 0);
        }
        return AbstractC0135a.f(1, 0, 0, 0);
    }

    public l a() {
        Context context = this.f1648a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        l lVar = new l();
        lVar.f1649a = N1.a.a(o.f1657a);
        N1.c cVar = new N1.c(context);
        lVar.f1650b = cVar;
        lVar.f1651c = N1.a.a(new l2.e(cVar, 12, new t1.h(14, cVar)));
        N1.c cVar2 = lVar.f1650b;
        lVar.f1652d = new S1.e(cVar2, 1);
        InterfaceC0264a a3 = N1.a.a(new l2.e(lVar.f1652d, 14, N1.a.a(new S1.e(cVar2, 0))));
        lVar.f1653e = a3;
        a2.i iVar = new a2.i(20);
        N1.c cVar3 = lVar.f1650b;
        B1.j jVar = new B1.j(cVar3, a3, iVar, 8);
        InterfaceC0264a interfaceC0264a = lVar.f1649a;
        InterfaceC0264a interfaceC0264a2 = lVar.f1651c;
        u uVar = new u();
        uVar.f1007a = interfaceC0264a;
        uVar.f1008b = interfaceC0264a2;
        uVar.f1009c = jVar;
        uVar.f1010d = a3;
        uVar.f1011e = a3;
        q0 q0Var = new q0();
        q0Var.f14082a = cVar3;
        q0Var.f14083b = interfaceC0264a2;
        q0Var.f14084c = a3;
        q0Var.f14085d = jVar;
        q0Var.f14086e = interfaceC0264a;
        q0Var.f14087f = a3;
        q0Var.f14088g = a3;
        lVar.f1654f = N1.a.a(new B1.j(uVar, q0Var, new G1.c(interfaceC0264a, a3, jVar, a3), 6));
        return lVar;
    }

    @Override // j0.k
    public j0.l f(h hVar) {
        Context context;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 31 && ((context = this.f1648a) == null || i4 < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new C0144j(10, false).f(hVar);
        }
        int h2 = F.h(((C0097o) hVar.f1635c).n);
        AbstractC0108a.j("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + J.E(h2));
        j0.b bVar = new j0.b(h2, 0);
        j0.b bVar2 = new j0.b(h2, 1);
        g0.f fVar = new g0.f();
        fVar.f8836b = bVar;
        fVar.f8837c = bVar2;
        fVar.f8835a = true;
        fVar.f8835a = true;
        return fVar.f(hVar);
    }
}
