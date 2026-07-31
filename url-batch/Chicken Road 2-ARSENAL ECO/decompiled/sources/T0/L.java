package T0;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import h1.AbstractC0403b;
import i1.AbstractBinderC0422c;
import i1.C0420a;
import java.util.Set;
import k.v0;

/* loaded from: classes.dex */
public final class L extends AbstractBinderC0422c implements S0.e, S0.f {

    /* renamed from: k, reason: collision with root package name */
    public static final W0.b f2248k = AbstractC0403b.f4334a;

    /* renamed from: d, reason: collision with root package name */
    public final Context f2249d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f2250e;

    /* renamed from: f, reason: collision with root package name */
    public final W0.b f2251f = f2248k;

    /* renamed from: g, reason: collision with root package name */
    public final Set f2252g;

    /* renamed from: h, reason: collision with root package name */
    public final v0 f2253h;

    /* renamed from: i, reason: collision with root package name */
    public C0420a f2254i;

    /* renamed from: j, reason: collision with root package name */
    public D f2255j;

    public L(Context context, c1.e eVar, v0 v0Var) {
        this.f2249d = context;
        this.f2250e = eVar;
        this.f2253h = v0Var;
        this.f2252g = (Set) v0Var.f5136f;
    }

    @Override // i1.InterfaceC0423d
    public final void a(i1.g gVar) {
        this.f2250e.post(new A.a(this, gVar, 8, false));
    }

    @Override // S0.e
    public final void onConnected(Bundle bundle) {
        this.f2254i.y(this);
    }

    @Override // S0.f
    public final void onConnectionFailed(R0.a aVar) {
        this.f2255j.b(aVar);
    }

    @Override // S0.e
    public final void onConnectionSuspended(int i7) {
        this.f2254i.l();
    }
}
