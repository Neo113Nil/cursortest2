package H6;

import D6.F;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q f1011a;

    /* renamed from: b, reason: collision with root package name */
    public final I6.i f1012b;

    public a(q call, I6.i chain) {
        Intrinsics.checkNotNullParameter(call, "call");
        e poolConnectionListener = e.f1035a;
        Intrinsics.checkNotNullParameter(poolConnectionListener, "poolConnectionListener");
        Intrinsics.checkNotNullParameter(chain, "chain");
        this.f1011a = call;
        this.f1012b = chain;
    }

    public final void a(r connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(connection, "connection");
        TimeZone timeZone = E6.e.f712a;
        q qVar = this.f1011a;
        if (qVar.f1077p != null) {
            throw new IllegalStateException("Check failed.");
        }
        qVar.f1077p = connection;
        connection.f1100q.add(new o(qVar, qVar.f1075n));
    }

    public final void b(d connectPlan) {
        Intrinsics.checkNotNullParameter(connectPlan, "connectPlan");
        this.f1011a.f1085x.add(connectPlan);
    }

    public final void c(F route) {
        Intrinsics.checkNotNullParameter(route, "route");
        InetSocketAddress inetSocketAddress = route.f446c;
        Proxy proxy = route.f445b;
        q call = this.f1011a;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
    }

    public final r d() {
        return this.f1011a.f1077p;
    }

    public final void e(F route, IOException failure) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(failure, "e");
        InetSocketAddress inetSocketAddress = route.f446c;
        Proxy proxy = route.f445b;
        q call = this.f1011a;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(failure, "ioe");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(failure, "failure");
    }

    public final void f(F route) {
        Intrinsics.checkNotNullParameter(route, "route");
        InetSocketAddress inetSocketAddress = route.f446c;
        Proxy proxy = route.f445b;
        q call = this.f1011a;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "inetSocketAddress");
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public final void g(r connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        q call = this.f1011a;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(connection, "connection");
    }

    public final void h(r connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        connection.getClass();
        Intrinsics.checkNotNullParameter(connection, "connection");
        q call = this.f1011a;
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public final boolean i() {
        return !Intrinsics.a((String) this.f1012b.f1300e.f639b, "GET");
    }

    public final boolean j() {
        return this.f1011a.f1083v;
    }

    public final Socket k() {
        return this.f1011a.h();
    }

    public final void l(d connectPlan) {
        Intrinsics.checkNotNullParameter(connectPlan, "connectPlan");
        this.f1011a.f1085x.remove(connectPlan);
    }
}
