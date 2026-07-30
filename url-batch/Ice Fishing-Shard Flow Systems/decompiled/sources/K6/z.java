package K6;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z implements T6.v {

    /* renamed from: d, reason: collision with root package name */
    public final int f1609d;

    /* renamed from: e, reason: collision with root package name */
    public final r f1610e;

    /* renamed from: i, reason: collision with root package name */
    public final L6.a f1611i;

    /* renamed from: l, reason: collision with root package name */
    public long f1612l;

    /* renamed from: m, reason: collision with root package name */
    public long f1613m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f1614n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1615o;

    /* renamed from: p, reason: collision with root package name */
    public final x f1616p;

    /* renamed from: q, reason: collision with root package name */
    public final w f1617q;

    /* renamed from: r, reason: collision with root package name */
    public final y f1618r;

    /* renamed from: s, reason: collision with root package name */
    public final y f1619s;

    /* renamed from: t, reason: collision with root package name */
    public EnumC0131b f1620t;

    /* renamed from: u, reason: collision with root package name */
    public IOException f1621u;

    public z(int i2, r connection, boolean z7, boolean z8, D6.q qVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f1609d = i2;
        this.f1610e = connection;
        this.f1611i = new L6.a(i2);
        this.f1613m = connection.f1579z.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1614n = arrayDeque;
        this.f1616p = new x(this, connection.f1578y.a(), z8);
        this.f1617q = new w(this, z7);
        this.f1618r = new y(this);
        this.f1619s = new y(this);
        if (qVar == null) {
            if (!h()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(qVar);
        }
    }

    @Override // T6.v
    public final T6.w a() {
        return this.f1616p;
    }

    public final void b() {
        boolean z7;
        boolean i2;
        TimeZone timeZone = E6.e.f712a;
        synchronized (this) {
            try {
                x xVar = this.f1616p;
                if (!xVar.f1603e && xVar.f1606m) {
                    w wVar = this.f1617q;
                    if (!wVar.f1598d) {
                        if (wVar.f1600i) {
                        }
                    }
                    z7 = true;
                    i2 = i();
                    Unit unit = Unit.f6114a;
                }
                z7 = false;
                i2 = i();
                Unit unit2 = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            d(EnumC0131b.f1496p, null);
        } else {
            if (i2) {
                return;
            }
            this.f1610e.g(this.f1609d);
        }
    }

    public final void c() {
        w wVar = this.f1617q;
        if (wVar.f1600i) {
            throw new IOException("stream closed");
        }
        if (wVar.f1598d) {
            throw new IOException("stream finished");
        }
        if (g() != null) {
            IOException iOException = this.f1621u;
            if (iOException != null) {
                throw iOException;
            }
            EnumC0131b g7 = g();
            Intrinsics.b(g7);
            throw new F(g7);
        }
    }

    public final void d(EnumC0131b statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (e(statusCode, iOException)) {
            r rVar = this.f1610e;
            rVar.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            rVar.f1559E.t(this.f1609d, statusCode);
        }
    }

    public final boolean e(EnumC0131b enumC0131b, IOException iOException) {
        TimeZone timeZone = E6.e.f712a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.f1620t = enumC0131b;
            this.f1621u = iOException;
            notifyAll();
            if (this.f1616p.f1603e && this.f1617q.f1598d) {
                return false;
            }
            Unit unit = Unit.f6114a;
            this.f1610e.g(this.f1609d);
            return true;
        }
    }

    public final void f(EnumC0131b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f1610e.t(this.f1609d, errorCode);
        }
    }

    public final EnumC0131b g() {
        EnumC0131b enumC0131b;
        synchronized (this) {
            enumC0131b = this.f1620t;
        }
        return enumC0131b;
    }

    public final boolean h() {
        boolean z7 = (this.f1609d & 1) == 1;
        this.f1610e.getClass();
        return true == z7;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                x xVar = this.f1616p;
                if (!xVar.f1603e) {
                    if (xVar.f1606m) {
                    }
                    return true;
                }
                w wVar = this.f1617q;
                if (wVar.f1598d || wVar.f1600i) {
                    if (this.f1615o) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:4:0x0008, B:6:0x000d, B:8:0x0015, B:11:0x001e, B:13:0x002f, B:14:0x0033, B:22:0x0026), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(D6.q headers, boolean z7) {
        boolean i2;
        Intrinsics.checkNotNullParameter(headers, "headers");
        TimeZone timeZone = E6.e.f712a;
        synchronized (this) {
            try {
                if (this.f1615o && headers.a(":status") == null && headers.a(":method") == null) {
                    this.f1616p.getClass();
                    if (z7) {
                        this.f1616p.f1603e = true;
                    }
                    i2 = i();
                    notifyAll();
                    Unit unit = Unit.f6114a;
                }
                this.f1615o = true;
                this.f1614n.add(headers);
                if (z7) {
                }
                i2 = i();
                notifyAll();
                Unit unit2 = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2) {
            return;
        }
        this.f1610e.g(this.f1609d);
    }

    public final void k(EnumC0131b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        synchronized (this) {
            try {
                if (g() == null) {
                    this.f1620t = errorCode;
                    notifyAll();
                }
                Unit unit = Unit.f6114a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // T6.v
    public final T6.u u() {
        return this.f1617q;
    }
}
