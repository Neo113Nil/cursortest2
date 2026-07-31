package b6;

import X5.z;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final q f3621a;

    /* renamed from: b, reason: collision with root package name */
    public final f f3622b;

    /* renamed from: c, reason: collision with root package name */
    public final c6.h f3623c;

    public a(q qVar, f fVar, c6.h hVar) {
        this.f3621a = qVar;
        this.f3622b = fVar;
        this.f3623c = hVar;
    }

    public final void a(r connection) {
        kotlin.jvm.internal.i.e(connection, "connection");
        TimeZone timeZone = Y5.e.f3102a;
        q qVar = this.f3621a;
        if (qVar.f3687m != null) {
            throw new IllegalStateException("Check failed.");
        }
        qVar.f3687m = connection;
        connection.f3712r.add(new o(qVar, qVar.f3685k));
    }

    public final void b(e eVar) {
        this.f3621a.f3695u.add(eVar);
    }

    public final r c() {
        return this.f3621a.f3687m;
    }

    public final void d(z route, IOException iOException) {
        kotlin.jvm.internal.i.e(route, "route");
        InetSocketAddress inetSocketAddress = route.f3081c;
        kotlin.jvm.internal.i.e(inetSocketAddress, "inetSocketAddress");
    }

    public final void e(r connection) {
        kotlin.jvm.internal.i.e(connection, "connection");
    }

    public final void f(r connection) {
        kotlin.jvm.internal.i.e(connection, "connection");
        connection.f3704j.getClass();
        q call = this.f3621a;
        kotlin.jvm.internal.i.e(call, "call");
    }

    public final boolean l() {
        return !kotlin.jvm.internal.i.a((String) this.f3623c.f3830e.f330b, "GET");
    }

    public final boolean m() {
        return this.f3621a.f3693s;
    }

    public final Socket o() {
        return this.f3621a.h();
    }

    public final void p(e eVar) {
        this.f3621a.f3695u.remove(eVar);
    }

    public final void q() {
    }

    public final void r() {
    }

    public final void g(r rVar) {
    }

    public final void h(r rVar) {
    }

    public final void i(r rVar) {
    }

    public final void k(String str) {
    }

    public final void n(r rVar) {
    }

    public final void j(List list, String str) {
    }
}
