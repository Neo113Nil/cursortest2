package m0;

import T.C0104w;
import T.C0107z;
import T.T;
import W.J;
import android.net.Uri;
import java.util.ArrayList;
import javax.net.SocketFactory;
import q0.AbstractC1359a;
import q0.C1353B;
import q0.InterfaceC1383z;
import q0.f0;

/* loaded from: classes.dex */
public final class u extends AbstractC1359a {

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1290c f14454h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14455i = "AndroidXMedia3/1.9.2";

    /* renamed from: j, reason: collision with root package name */
    public final Uri f14456j;

    /* renamed from: k, reason: collision with root package name */
    public final SocketFactory f14457k;

    /* renamed from: l, reason: collision with root package name */
    public long f14458l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f14459m;
    public boolean n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public C0107z f14460p;

    static {
        T.A.a("media3.exoplayer.rtsp");
    }

    public u(C0107z c0107z, InterfaceC1290c interfaceC1290c, SocketFactory socketFactory) {
        this.f14460p = c0107z;
        this.f14454h = interfaceC1290c;
        C0104w c0104w = c0107z.f2900b;
        c0104w.getClass();
        Uri uri = c0104w.f2893a;
        String scheme = uri.getScheme();
        if (scheme != null && U.i.h("rtspt", scheme)) {
            uri = Uri.parse("rtsp" + uri.toString().substring(5));
        }
        this.f14456j = uri;
        this.f14457k = socketFactory;
        this.f14458l = -9223372036854775807L;
        this.o = true;
    }

    @Override // q0.AbstractC1359a
    public final InterfaceC1383z b(C1353B c1353b, B1.j jVar, long j4) {
        return new r(jVar, this.f14454h, this.f14456j, new e0.t(this), this.f14455i, this.f14457k);
    }

    @Override // q0.AbstractC1359a
    public final synchronized C0107z i() {
        return this.f14460p;
    }

    @Override // q0.AbstractC1359a
    public final void n(Y.A a3) {
        x();
    }

    @Override // q0.AbstractC1359a
    public final void r(InterfaceC1383z interfaceC1383z) {
        r rVar = (r) interfaceC1383z;
        ArrayList arrayList = rVar.f14438e;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            q qVar = (q) arrayList.get(i4);
            if (!qVar.f14432e) {
                qVar.f14429b.e(null);
                qVar.f14430c.D();
                qVar.f14432e = true;
            }
        }
        J.h(rVar.f14437d);
        rVar.f14449r = true;
    }

    @Override // q0.AbstractC1359a
    public final synchronized void w(C0107z c0107z) {
        this.f14460p = c0107z;
    }

    public final void x() {
        T f0Var = new f0(this.f14458l, this.f14459m, this.n, i());
        if (this.o) {
            f0Var = new s(f0Var, 0);
        }
        q(f0Var);
    }

    @Override // q0.AbstractC1359a
    public final void k() {
    }

    @Override // q0.AbstractC1359a
    public final void t() {
    }
}
