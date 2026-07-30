package i8;

import e8.z;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.TimeZone;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q f38332a;

    /* renamed from: b, reason: collision with root package name */
    public final f f38333b;

    /* renamed from: c, reason: collision with root package name */
    public final j8.h f38334c;

    public a(q call, f fVar, j8.h hVar) {
        kotlin.jvm.internal.h.e(call, "call");
        this.f38332a = call;
        this.f38333b = fVar;
        this.f38334c = hVar;
    }

    public final void a(r connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        q qVar = this.f38332a;
        qVar.getClass();
        TimeZone timeZone = f8.d.f37815a;
        if (qVar.f38390A != null) {
            throw new IllegalStateException("Check failed.");
        }
        qVar.f38390A = connection;
        connection.f38421r.add(new o(qVar, qVar.f38404y));
    }

    public final void b(e connectPlan) {
        kotlin.jvm.internal.h.e(connectPlan, "connectPlan");
        this.f38332a.f38398I.add(connectPlan);
    }

    public final void c(z route) {
        kotlin.jvm.internal.h.e(route, "route");
        this.f38332a.getClass();
        InetSocketAddress inetSocketAddress = route.f37542c;
        kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
    }

    public final r d() {
        return this.f38332a.f38390A;
    }

    public final void e(z route, IOException iOException) {
        kotlin.jvm.internal.h.e(route, "route");
        this.f38332a.getClass();
        InetSocketAddress inetSocketAddress = route.f37542c;
        kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
    }

    public final void f(z route) {
        kotlin.jvm.internal.h.e(route, "route");
        this.f38332a.getClass();
        InetSocketAddress inetSocketAddress = route.f37542c;
        kotlin.jvm.internal.h.e(inetSocketAddress, "inetSocketAddress");
    }

    public final void g(r connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        this.f38332a.getClass();
    }

    public final void h(r connection) {
        kotlin.jvm.internal.h.e(connection, "connection");
        connection.f38413j.getClass();
        q call = this.f38332a;
        kotlin.jvm.internal.h.e(call, "call");
    }

    public final boolean j() {
        return !kotlin.jvm.internal.h.a((String) this.f38334c.f38598e.f40102v, "GET");
    }

    public final boolean k() {
        return this.f38332a.f38396G;
    }

    public final Socket m() {
        return this.f38332a.m();
    }

    public final void n(e connectPlan) {
        kotlin.jvm.internal.h.e(connectPlan, "connectPlan");
        this.f38332a.f38398I.remove(connectPlan);
    }

    public final void i(r rVar) {
    }

    public final void l(r rVar) {
    }
}
