package s1;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.Set;
import n.w1;

/* renamed from: s1.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0864F extends I1.d implements r1.k, r1.l {

    /* renamed from: l, reason: collision with root package name */
    public static final D1.d f7611l = H1.b.f956a;

    /* renamed from: e, reason: collision with root package name */
    public final Context f7612e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f7613f;

    /* renamed from: g, reason: collision with root package name */
    public final D1.d f7614g = f7611l;

    /* renamed from: h, reason: collision with root package name */
    public final Set f7615h;

    /* renamed from: i, reason: collision with root package name */
    public final w1 f7616i;
    public I1.a j;

    /* renamed from: k, reason: collision with root package name */
    public x f7617k;

    public BinderC0864F(Context context, C1.e eVar, w1 w1Var) {
        this.f7612e = context;
        this.f7613f = eVar;
        this.f7616i = w1Var;
        this.f7615h = (Set) w1Var.f6941d;
    }

    @Override // I1.e
    public final void a(I1.h hVar) {
        this.f7613f.post(new F.a(26, this, hVar, false));
    }

    @Override // r1.k
    public final void onConnected(Bundle bundle) {
        this.j.q(this);
    }

    @Override // r1.l
    public final void onConnectionFailed(q1.b bVar) {
        this.f7617k.b(bVar);
    }

    @Override // r1.k
    public final void onConnectionSuspended(int i2) {
        x xVar = this.f7617k;
        v vVar = (v) xVar.f7754f.j.get(xVar.f7750b);
        if (vVar != null) {
            if (vVar.f7742m) {
                vVar.j(new q1.b(17, null, null));
            } else {
                vVar.onConnectionSuspended(i2);
            }
        }
    }
}
