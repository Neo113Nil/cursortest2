package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ss1;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t50 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wn1 f32160a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C2202ra f32161b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final tn1 f32162c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final m50 f32163d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private ss1.b f32164e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    private ss1 f32165f;

    /* renamed from: g, reason: collision with root package name */
    private int f32166g;

    /* renamed from: h, reason: collision with root package name */
    private int f32167h;

    /* renamed from: i, reason: collision with root package name */
    private int f32168i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private ps1 f32169j;

    public t50(@NotNull wn1 connectionPool, @NotNull C2202ra address, @NotNull tn1 call, @NotNull m50 eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f32160a = connectionPool;
        this.f32161b = address;
        this.f32162c = call;
        this.f32163d = eventListener;
    }

    @NotNull
    public final s50 a(@NotNull td1 client, @NotNull xn1 chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        try {
            int c4 = chain.c();
            int e4 = chain.e();
            int g4 = chain.g();
            client.getClass();
            try {
                return a(c4, e4, g4, client.v(), !Intrinsics.areEqual(chain.f().f(), com.ironsource.jn.f16864a)).a(client, chain);
            } catch (rs1 e5) {
                e = e5;
                rs1 rs1Var = e;
                a(rs1Var.b());
                throw rs1Var;
            } catch (IOException e6) {
                e = e6;
                IOException iOException = e;
                a(iOException);
                throw new rs1(iOException);
            }
        } catch (rs1 e7) {
            e = e7;
        } catch (IOException e8) {
            e = e8;
        }
    }

    public final boolean b() {
        ss1 ss1Var;
        un1 d4;
        int i4 = this.f32166g;
        if (i4 == 0 && this.f32167h == 0 && this.f32168i == 0) {
            return false;
        }
        if (this.f32169j != null) {
            return true;
        }
        ps1 ps1Var = null;
        if (i4 <= 1 && this.f32167h <= 1 && this.f32168i <= 0 && (d4 = this.f32162c.d()) != null) {
            synchronized (d4) {
                if (d4.e() == 0) {
                    mh0 k4 = d4.k().a().k();
                    mh0 other = this.f32161b.k();
                    byte[] bArr = v82.f33550a;
                    Intrinsics.checkNotNullParameter(k4, "<this>");
                    Intrinsics.checkNotNullParameter(other, "other");
                    if (Intrinsics.areEqual(k4.g(), other.g()) && k4.i() == other.i() && Intrinsics.areEqual(k4.k(), other.k())) {
                        ps1Var = d4.k();
                    }
                }
            }
        }
        if (ps1Var != null) {
            this.f32169j = ps1Var;
            return true;
        }
        ss1.b bVar = this.f32164e;
        if ((bVar == null || !bVar.b()) && (ss1Var = this.f32165f) != null) {
            return ss1Var.a();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final un1 a(int i4, int i5, int i6, boolean z4, boolean z5) {
        List<ps1> a4;
        boolean z6;
        ss1.b bVar;
        ss1 ss1Var;
        Socket l4;
        while (!this.f32162c.j()) {
            un1 connection = this.f32162c.d();
            if (connection != null) {
                synchronized (connection) {
                    try {
                        if (!connection.d() && a(connection.k().a().k())) {
                            l4 = null;
                            Unit unit = Unit.f41027a;
                        }
                        l4 = this.f32162c.l();
                        Unit unit2 = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (this.f32162c.d() == null) {
                    if (l4 != null) {
                        v82.a(l4);
                    }
                    m50 m50Var = this.f32163d;
                    tn1 call = this.f32162c;
                    m50Var.getClass();
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(connection, "connection");
                } else {
                    if (l4 != null) {
                        throw new IllegalStateException("Check failed.");
                    }
                    z6 = z5;
                    if (connection.a(z6)) {
                        return connection;
                    }
                    connection.j();
                    if (this.f32169j == null && (bVar = this.f32164e) != null && !bVar.b() && (ss1Var = this.f32165f) != null && !ss1Var.a()) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            this.f32166g = 0;
            this.f32167h = 0;
            this.f32168i = 0;
            if (this.f32160a.a(this.f32161b, this.f32162c, null, false)) {
                connection = this.f32162c.d();
                Intrinsics.checkNotNull(connection);
                m50 m50Var2 = this.f32163d;
                tn1 call2 = this.f32162c;
                m50Var2.getClass();
                Intrinsics.checkNotNullParameter(call2, "call");
                Intrinsics.checkNotNullParameter(connection, "connection");
            } else {
                ps1 ps1Var = this.f32169j;
                try {
                    if (ps1Var != null) {
                        Intrinsics.checkNotNull(ps1Var);
                        this.f32169j = null;
                    } else {
                        ss1.b bVar2 = this.f32164e;
                        if (bVar2 != null) {
                            Intrinsics.checkNotNull(bVar2);
                            if (bVar2.b()) {
                                ss1.b bVar3 = this.f32164e;
                                Intrinsics.checkNotNull(bVar3);
                                ps1Var = bVar3.c();
                            }
                        }
                        ss1 ss1Var2 = this.f32165f;
                        if (ss1Var2 == null) {
                            ss1Var2 = new ss1(this.f32161b, this.f32162c.c().n(), this.f32162c, this.f32163d);
                            this.f32165f = ss1Var2;
                        }
                        ss1.b b4 = ss1Var2.b();
                        this.f32164e = b4;
                        a4 = b4.a();
                        if (!this.f32162c.j()) {
                            if (this.f32160a.a(this.f32161b, this.f32162c, a4, false)) {
                                connection = this.f32162c.d();
                                Intrinsics.checkNotNull(connection);
                                m50 m50Var3 = this.f32163d;
                                tn1 call3 = this.f32162c;
                                m50Var3.getClass();
                                Intrinsics.checkNotNullParameter(call3, "call");
                                Intrinsics.checkNotNullParameter(connection, "connection");
                            } else {
                                ps1Var = b4.c();
                                un1 connection2 = new un1(this.f32160a, ps1Var);
                                this.f32162c.b(connection2);
                                connection2.a(i4, i5, i6, z4, this.f32162c, this.f32163d);
                                this.f32162c.b((un1) null);
                                this.f32162c.c().n().a(connection2.k());
                                if (!this.f32160a.a(this.f32161b, this.f32162c, a4, true)) {
                                    un1 connection3 = this.f32162c.d();
                                    Intrinsics.checkNotNull(connection3);
                                    this.f32169j = ps1Var;
                                    v82.a(connection2.m());
                                    m50 m50Var4 = this.f32163d;
                                    tn1 call4 = this.f32162c;
                                    m50Var4.getClass();
                                    Intrinsics.checkNotNullParameter(call4, "call");
                                    Intrinsics.checkNotNullParameter(connection3, "connection");
                                    connection = connection3;
                                } else {
                                    synchronized (connection2) {
                                        this.f32160a.b(connection2);
                                        this.f32162c.a(connection2);
                                        Unit unit3 = Unit.f41027a;
                                    }
                                    m50 m50Var5 = this.f32163d;
                                    tn1 call5 = this.f32162c;
                                    m50Var5.getClass();
                                    Intrinsics.checkNotNullParameter(call5, "call");
                                    Intrinsics.checkNotNullParameter(connection2, "connection");
                                    z6 = z5;
                                    connection = connection2;
                                    if (connection.a(z6)) {
                                    }
                                }
                            }
                        } else {
                            throw new IOException("Canceled");
                        }
                    }
                    connection2.a(i4, i5, i6, z4, this.f32162c, this.f32163d);
                    this.f32162c.b((un1) null);
                    this.f32162c.c().n().a(connection2.k());
                    if (!this.f32160a.a(this.f32161b, this.f32162c, a4, true)) {
                    }
                } catch (Throwable th2) {
                    this.f32162c.b((un1) null);
                    throw th2;
                }
                a4 = null;
                un1 connection22 = new un1(this.f32160a, ps1Var);
                this.f32162c.b(connection22);
            }
            z6 = z5;
            if (connection.a(z6)) {
            }
        }
        throw new IOException("Canceled");
    }

    @NotNull
    public final C2202ra a() {
        return this.f32161b;
    }

    public final boolean a(@NotNull mh0 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        mh0 k4 = this.f32161b.k();
        return url.i() == k4.i() && Intrinsics.areEqual(url.g(), k4.g());
    }

    public final void a(@NotNull IOException e4) {
        Intrinsics.checkNotNullParameter(e4, "e");
        this.f32169j = null;
        if ((e4 instanceof o22) && ((o22) e4).f29876b == i50.f27094h) {
            this.f32166g++;
        } else if (e4 instanceof dr) {
            this.f32167h++;
        } else {
            this.f32168i++;
        }
    }
}
