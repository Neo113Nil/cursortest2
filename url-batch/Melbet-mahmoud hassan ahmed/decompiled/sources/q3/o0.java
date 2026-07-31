package q3;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p3.a;
import p3.f;

/* loaded from: classes.dex */
public final class o0 extends i4.d implements f.a, f.b {

    /* renamed from: m, reason: collision with root package name */
    private static final a.AbstractC0120a<? extends h4.f, h4.a> f20301m = h4.e.f16833c;

    /* renamed from: f, reason: collision with root package name */
    private final Context f20302f;

    /* renamed from: g, reason: collision with root package name */
    private final Handler f20303g;

    /* renamed from: h, reason: collision with root package name */
    private final a.AbstractC0120a<? extends h4.f, h4.a> f20304h;

    /* renamed from: i, reason: collision with root package name */
    private final Set<Scope> f20305i;

    /* renamed from: j, reason: collision with root package name */
    private final r3.d f20306j;

    /* renamed from: k, reason: collision with root package name */
    private h4.f f20307k;

    /* renamed from: l, reason: collision with root package name */
    private n0 f20308l;

    public o0(Context context, Handler handler, r3.d dVar) {
        a.AbstractC0120a<? extends h4.f, h4.a> abstractC0120a = f20301m;
        this.f20302f = context;
        this.f20303g = handler;
        this.f20306j = (r3.d) r3.o.j(dVar, "ClientSettings must not be null");
        this.f20305i = dVar.e();
        this.f20304h = abstractC0120a;
    }

    static /* synthetic */ void k6(o0 o0Var, i4.l lVar) {
        o3.b c7 = lVar.c();
        if (c7.j()) {
            r3.h0 h0Var = (r3.h0) r3.o.i(lVar.g());
            c7 = h0Var.g();
            if (c7.j()) {
                o0Var.f20308l.b(h0Var.c(), o0Var.f20305i);
                o0Var.f20307k.d();
            } else {
                String valueOf = String.valueOf(c7);
                StringBuilder sb = new StringBuilder(valueOf.length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            }
        }
        o0Var.f20308l.a(c7);
        o0Var.f20307k.d();
    }

    public final void C3(n0 n0Var) {
        h4.f fVar = this.f20307k;
        if (fVar != null) {
            fVar.d();
        }
        this.f20306j.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0120a<? extends h4.f, h4.a> abstractC0120a = this.f20304h;
        Context context = this.f20302f;
        Looper looper = this.f20303g.getLooper();
        r3.d dVar = this.f20306j;
        this.f20307k = abstractC0120a.a(context, looper, dVar, dVar.g(), this, this);
        this.f20308l = n0Var;
        Set<Scope> set = this.f20305i;
        if (set == null || set.isEmpty()) {
            this.f20303g.post(new l0(this));
        } else {
            this.f20307k.i();
        }
    }

    @Override // q3.j
    public final void E(o3.b bVar) {
        this.f20308l.a(bVar);
    }

    @Override // q3.d
    public final void O0(Bundle bundle) {
        this.f20307k.p(this);
    }

    @Override // i4.f
    public final void b2(i4.l lVar) {
        this.f20303g.post(new m0(this, lVar));
    }

    public final void o4() {
        h4.f fVar = this.f20307k;
        if (fVar != null) {
            fVar.d();
        }
    }

    @Override // q3.d
    public final void q0(int i7) {
        this.f20307k.d();
    }
}
