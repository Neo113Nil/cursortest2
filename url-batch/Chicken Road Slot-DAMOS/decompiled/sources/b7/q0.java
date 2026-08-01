package b7;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.z5;
import java.util.Set;
import m.g2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class q0 extends o7.g implements a7.k, a7.l {

    /* renamed from: l, reason: collision with root package name */
    public static final aa f1333l = t7.b.f9323a;

    /* renamed from: e, reason: collision with root package name */
    public final Context f1334e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f1335f;
    public final aa g;

    /* renamed from: h, reason: collision with root package name */
    public final Set f1336h;

    /* renamed from: i, reason: collision with root package name */
    public final g2 f1337i;
    public u7.a j;

    /* renamed from: k, reason: collision with root package name */
    public d0 f1338k;

    public q0(Context context, z5 z5Var, g2 g2Var) {
        super(1);
        this.f1334e = context;
        this.f1335f = z5Var;
        this.f1337i = g2Var;
        this.f1336h = (Set) g2Var.f6077d;
        this.g = f1333l;
    }

    @Override // o7.g
    public final void C(u7.e eVar) {
        this.f1335f.post(new f8.j0(4, this, eVar, false));
    }

    @Override // a7.k
    public final void onConnected(Bundle bundle) {
        this.j.v(this);
    }

    @Override // a7.l
    public final void onConnectionFailed(z6.b bVar) {
        this.f1338k.b(bVar);
    }

    @Override // a7.k
    public final void onConnectionSuspended(int i3) {
        d0 d0Var = this.f1338k;
        b0 b0Var = (b0) d0Var.f1280f.j.get(d0Var.f1276b);
        if (b0Var != null) {
            if (b0Var.f1247l) {
                b0Var.k(new z6.b(17, null, null));
            } else {
                b0Var.onConnectionSuspended(i3);
            }
        }
    }
}
