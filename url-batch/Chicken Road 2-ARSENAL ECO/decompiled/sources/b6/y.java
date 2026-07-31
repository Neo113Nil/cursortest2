package b6;

import X5.C0217a;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import l5.C0512p;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C0217a f3739a;

    /* renamed from: b, reason: collision with root package name */
    public final a6.d f3740b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3741c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3742d;

    /* renamed from: e, reason: collision with root package name */
    public final List f3743e;

    /* renamed from: f, reason: collision with root package name */
    public int f3744f;

    /* renamed from: g, reason: collision with root package name */
    public Object f3745g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f3746h;

    public y(C0217a address, a6.d routeDatabase, a connectionUser, boolean z5) {
        List j4;
        kotlin.jvm.internal.i.e(address, "address");
        kotlin.jvm.internal.i.e(routeDatabase, "routeDatabase");
        kotlin.jvm.internal.i.e(connectionUser, "connectionUser");
        this.f3739a = address;
        this.f3740b = routeDatabase;
        this.f3741c = connectionUser;
        this.f3742d = z5;
        C0512p c0512p = C0512p.f5303f;
        this.f3743e = c0512p;
        this.f3745g = c0512p;
        this.f3746h = new ArrayList();
        X5.o url = address.f2885h;
        connectionUser.getClass();
        kotlin.jvm.internal.i.e(url, "url");
        URI g7 = url.g();
        if (g7.getHost() == null) {
            j4 = Y5.e.j(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = address.f2884g.select(g7);
            j4 = (select == null || select.isEmpty()) ? Y5.e.j(new Proxy[]{Proxy.NO_PROXY}) : Y5.e.i(select);
        }
        this.f3743e = j4;
        this.f3744f = 0;
        kotlin.jvm.internal.i.e(url, "url");
    }

    public final boolean a() {
        return this.f3744f < this.f3743e.size() || !this.f3746h.isEmpty();
    }
}
