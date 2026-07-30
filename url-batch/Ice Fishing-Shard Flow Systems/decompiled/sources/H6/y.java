package H6;

import D6.C0093a;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.collections.A;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final C0093a f1125a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.c f1126b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1127c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1128d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1129e;

    /* renamed from: f, reason: collision with root package name */
    public int f1130f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1131g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1132h;

    public y(C0093a address, l2.c routeDatabase, a connectionUser, boolean z7) {
        List proxies;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(connectionUser, "connectionUser");
        this.f1125a = address;
        this.f1126b = routeDatabase;
        this.f1127c = connectionUser;
        this.f1128d = z7;
        A a7 = A.f6115d;
        this.f1129e = a7;
        this.f1131g = a7;
        this.f1132h = new ArrayList();
        D6.s url = address.f463h;
        connectionUser.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        q call = connectionUser.f1011a;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        URI g7 = url.g();
        if (g7.getHost() == null) {
            Proxy[] elements = {Proxy.NO_PROXY};
            TimeZone timeZone = E6.e.f712a;
            Intrinsics.checkNotNullParameter(elements, "elements");
            proxies = E6.e.j(elements);
        } else {
            List<Proxy> select = address.f462g.select(g7);
            if (select == null || select.isEmpty()) {
                Proxy[] elements2 = {Proxy.NO_PROXY};
                TimeZone timeZone2 = E6.e.f712a;
                Intrinsics.checkNotNullParameter(elements2, "elements");
                proxies = E6.e.j(elements2);
            } else {
                proxies = E6.e.i(select);
            }
        }
        this.f1129e = proxies;
        this.f1130f = 0;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
        q call2 = connectionUser.f1011a;
        Intrinsics.checkNotNullParameter(call2, "call");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(proxies, "proxies");
    }

    public final boolean a() {
        return this.f1130f < this.f1129e.size() || !this.f1132h.isEmpty();
    }
}
