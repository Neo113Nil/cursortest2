package f4;

import N0.h;
import android.content.Context;
import android.net.ConnectivityManager;
import o4.c;
import s4.f;
import s4.i;
import s4.q;

/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: d, reason: collision with root package name */
    public q f4803d;

    /* renamed from: e, reason: collision with root package name */
    public i f4804e;

    /* renamed from: i, reason: collision with root package name */
    public a f4805i;

    @Override // o4.c
    public final void onAttachedToEngine(o4.b bVar) {
        f fVar = bVar.f7122c;
        Context context = bVar.f7120a;
        this.f4803d = new q(fVar, "dev.fluttercommunity.plus/connectivity");
        this.f4804e = new i(fVar, "dev.fluttercommunity.plus/connectivity_status");
        l2.c cVar = new l2.c((ConnectivityManager) context.getSystemService("connectivity"));
        B.f fVar2 = new B.f(22, cVar);
        this.f4805i = new a(context, cVar);
        this.f4803d.b(fVar2);
        this.f4804e.a(this.f4805i);
    }

    @Override // o4.c
    public final void onDetachedFromEngine(o4.b bVar) {
        this.f4803d.b(null);
        this.f4804e.a(null);
        a aVar = this.f4805i;
        h hVar = aVar.f4802d;
        if (hVar != null) {
            ((ConnectivityManager) aVar.f4799a.f6269d).unregisterNetworkCallback(hVar);
            aVar.f4802d = null;
        }
        this.f4803d = null;
        this.f4804e = null;
        this.f4805i = null;
    }
}
