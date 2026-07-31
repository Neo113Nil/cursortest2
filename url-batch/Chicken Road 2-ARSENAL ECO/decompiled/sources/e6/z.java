package e6;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class z implements n6.v {

    /* renamed from: f, reason: collision with root package name */
    public final int f4153f;

    /* renamed from: g, reason: collision with root package name */
    public final r f4154g;

    /* renamed from: h, reason: collision with root package name */
    public final f6.a f4155h;

    /* renamed from: i, reason: collision with root package name */
    public long f4156i;

    /* renamed from: j, reason: collision with root package name */
    public long f4157j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayDeque f4158k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4159l;

    /* renamed from: m, reason: collision with root package name */
    public final x f4160m;

    /* renamed from: n, reason: collision with root package name */
    public final w f4161n;

    /* renamed from: o, reason: collision with root package name */
    public final y f4162o;

    /* renamed from: p, reason: collision with root package name */
    public final y f4163p;

    /* renamed from: q, reason: collision with root package name */
    public EnumC0356b f4164q;

    /* renamed from: r, reason: collision with root package name */
    public IOException f4165r;

    public z(int i7, r connection, boolean z5, boolean z6, X5.n nVar) {
        kotlin.jvm.internal.i.e(connection, "connection");
        this.f4153f = i7;
        this.f4154g = connection;
        this.f4155h = new f6.a(i7);
        this.f4157j = connection.f4121w.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4158k = arrayDeque;
        this.f4160m = new x(this, connection.f4120v.a(), z6);
        this.f4161n = new w(this, z5);
        this.f4162o = new y(this);
        this.f4163p = new y(this);
        if (nVar == null) {
            if (!i()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (i()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(nVar);
        }
    }

    public final void a() {
        boolean z5;
        boolean j4;
        TimeZone timeZone = Y5.e.f3102a;
        synchronized (this) {
            try {
                x xVar = this.f4160m;
                if (!xVar.f4147g && xVar.f4150j) {
                    w wVar = this.f4161n;
                    if (!wVar.f4142f) {
                        if (wVar.f4144h) {
                        }
                    }
                    z5 = true;
                    j4 = j();
                }
                z5 = false;
                j4 = j();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z5) {
            e(EnumC0356b.f4043m, null);
        } else {
            if (j4) {
                return;
            }
            this.f4154g.e(this.f4153f);
        }
    }

    @Override // n6.v
    public final n6.u b() {
        return this.f4161n;
    }

    @Override // n6.v
    public final n6.w c() {
        return this.f4160m;
    }

    public final void d() {
        w wVar = this.f4161n;
        if (wVar.f4144h) {
            throw new IOException("stream closed");
        }
        if (wVar.f4142f) {
            throw new IOException("stream finished");
        }
        if (h() != null) {
            IOException iOException = this.f4165r;
            if (iOException != null) {
                throw iOException;
            }
            EnumC0356b h7 = h();
            kotlin.jvm.internal.i.b(h7);
            throw new E(h7);
        }
    }

    public final void e(EnumC0356b enumC0356b, IOException iOException) {
        if (f(enumC0356b, iOException)) {
            this.f4154g.f4101B.n(this.f4153f, enumC0356b);
        }
    }

    public final boolean f(EnumC0356b enumC0356b, IOException iOException) {
        TimeZone timeZone = Y5.e.f3102a;
        synchronized (this) {
            if (h() != null) {
                return false;
            }
            this.f4164q = enumC0356b;
            this.f4165r = iOException;
            notifyAll();
            if (this.f4160m.f4147g) {
                if (this.f4161n.f4142f) {
                    return false;
                }
            }
            this.f4154g.e(this.f4153f);
            return true;
        }
    }

    public final void g(EnumC0356b enumC0356b) {
        if (f(enumC0356b, null)) {
            this.f4154g.n(this.f4153f, enumC0356b);
        }
    }

    public final EnumC0356b h() {
        EnumC0356b enumC0356b;
        synchronized (this) {
            enumC0356b = this.f4164q;
        }
        return enumC0356b;
    }

    public final boolean i() {
        boolean z5 = (this.f4153f & 1) == 1;
        this.f4154g.getClass();
        return true == z5;
    }

    public final boolean j() {
        synchronized (this) {
            try {
                if (h() != null) {
                    return false;
                }
                x xVar = this.f4160m;
                if (!xVar.f4147g) {
                    if (xVar.f4150j) {
                    }
                    return true;
                }
                w wVar = this.f4161n;
                if (wVar.f4142f || wVar.f4144h) {
                    if (this.f4159l) {
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
    public final void k(X5.n headers, boolean z5) {
        boolean j4;
        kotlin.jvm.internal.i.e(headers, "headers");
        TimeZone timeZone = Y5.e.f3102a;
        synchronized (this) {
            try {
                if (this.f4159l && headers.a(":status") == null && headers.a(":method") == null) {
                    this.f4160m.getClass();
                    if (z5) {
                        this.f4160m.f4147g = true;
                    }
                    j4 = j();
                    notifyAll();
                }
                this.f4159l = true;
                this.f4158k.add(headers);
                if (z5) {
                }
                j4 = j();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j4) {
            return;
        }
        this.f4154g.e(this.f4153f);
    }
}
