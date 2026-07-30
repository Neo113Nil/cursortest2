package a1;

import D6.y;
import android.content.Context;
import c1.C0288a;
import c1.C0290c;
import com.google.firebase.messaging.z;
import n.w1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public Context f3070a;

    public X4.d a() {
        Context context = this.f3070a;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        X4.d dVar = new X4.d();
        dVar.f2874e = C0288a.a(m.f3073a);
        C0290c c0290c = new C0290c(context);
        dVar.f2875i = c0290c;
        dVar.f2876l = C0288a.a(new P0.l(c0290c, 5, new B.f(17, c0290c)));
        C0290c c0290c2 = (C0290c) dVar.f2875i;
        dVar.f2877m = new l2.c(c0290c2);
        Q5.a a7 = C0288a.a(new P0.l((l2.c) dVar.f2877m, 6, C0288a.a(new B.f(25, c0290c2))));
        dVar.f2878n = a7;
        q1.h hVar = new q1.h(16);
        C0290c c0290c3 = (C0290c) dVar.f2875i;
        D0.j jVar = new D0.j(c0290c3, a7, hVar, 16);
        Q5.a aVar = (Q5.a) dVar.f2874e;
        Q5.a aVar2 = (Q5.a) dVar.f2876l;
        y yVar = new y();
        yVar.f634e = aVar;
        yVar.f633d = aVar2;
        yVar.f635i = jVar;
        yVar.f636l = a7;
        yVar.f637m = a7;
        w1 w1Var = new w1();
        w1Var.f6941d = c0290c3;
        w1Var.f6942e = aVar2;
        w1Var.f6943i = a7;
        w1Var.f6944l = jVar;
        w1Var.f6945m = aVar;
        w1Var.f6946n = a7;
        w1Var.f6947o = a7;
        z zVar = new z();
        zVar.f4535d = aVar;
        zVar.f4536e = a7;
        zVar.f4537i = jVar;
        zVar.f4538l = a7;
        dVar.f2879o = C0288a.a(new D0.j(yVar, w1Var, zVar, 10));
        return dVar;
    }
}
