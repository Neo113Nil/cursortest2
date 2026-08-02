package m0;

import E1.AbstractActivityC0029e;
import P1.l;
import P1.m;
import P1.n;
import P1.o;
import java.util.HashSet;
import kotlin.jvm.internal.j;

/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1111d implements L1.b, m, M1.a {

    /* renamed from: a, reason: collision with root package name */
    public o f9956a;

    /* renamed from: b, reason: collision with root package name */
    public C1110c f9957b;

    @Override // M1.a
    public final void onAttachedToActivity(M1.b binding) {
        j.e(binding, "binding");
        F1.c cVar = (F1.c) binding;
        AbstractActivityC0029e abstractActivityC0029e = (AbstractActivityC0029e) cVar.f486a;
        j.b(abstractActivityC0029e);
        C1110c c1110c = new C1110c(abstractActivityC0029e);
        this.f9957b = c1110c;
        ((HashSet) cVar.f487b).add(c1110c);
    }

    @Override // L1.b
    public final void onAttachedToEngine(L1.a binding) {
        j.e(binding, "binding");
        o oVar = new o(binding.f888b, "gallery_saver");
        this.f9956a = oVar;
        oVar.b(this);
    }

    @Override // M1.a
    public final void onDetachedFromActivity() {
        this.f9957b = null;
        System.out.println((Object) "onDetachedFromActivity");
    }

    @Override // M1.a
    public final void onDetachedFromActivityForConfigChanges() {
        System.out.println((Object) "onDetachedFromActivityForConfigChanges");
    }

    @Override // L1.b
    public final void onDetachedFromEngine(L1.a binding) {
        j.e(binding, "binding");
        o oVar = this.f9956a;
        if (oVar != null) {
            oVar.b(null);
        } else {
            j.g("channel");
            throw null;
        }
    }

    @Override // P1.m
    public final void onMethodCall(l call, n nVar) {
        j.e(call, "call");
        String str = call.f1266a;
        if (j.a(str, "saveImage")) {
            C1110c c1110c = this.f9957b;
            if (c1110c != null) {
                c1110c.a(call, (O1.j) nVar, EnumC1112e.f9958a);
                return;
            }
            return;
        }
        if (!j.a(str, "saveVideo")) {
            ((O1.j) nVar).a();
            return;
        }
        C1110c c1110c2 = this.f9957b;
        if (c1110c2 != null) {
            c1110c2.a(call, (O1.j) nVar, EnumC1112e.f9959b);
        }
    }

    @Override // M1.a
    public final void onReattachedToActivityForConfigChanges(M1.b binding) {
        j.e(binding, "binding");
        Object obj = ((F1.c) binding).f486a;
        System.out.println((Object) "onReattachedToActivityForConfigChanges");
    }
}
