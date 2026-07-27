package t3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f10863a;

    /* renamed from: b, reason: collision with root package name */
    public final p f10864b;

    /* renamed from: c, reason: collision with root package name */
    public long f10865c;

    /* renamed from: d, reason: collision with root package name */
    public long f10866d;

    /* renamed from: e, reason: collision with root package name */
    public long f10867e;

    /* renamed from: f, reason: collision with root package name */
    public long f10868f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f10869g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10870h;

    /* renamed from: i, reason: collision with root package name */
    public final v f10871i;

    /* renamed from: j, reason: collision with root package name */
    public final u f10872j;

    /* renamed from: k, reason: collision with root package name */
    public final w f10873k;

    /* renamed from: l, reason: collision with root package name */
    public final w f10874l;

    /* renamed from: m, reason: collision with root package name */
    public EnumC1211b f10875m;

    /* renamed from: n, reason: collision with root package name */
    public IOException f10876n;

    public x(int i2, p connection, boolean z4, boolean z5, m3.l lVar) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f10863a = i2;
        this.f10864b = connection;
        this.f10868f = connection.f10830w.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f10869g = arrayDeque;
        this.f10871i = new v(this, connection.f10829v.a(), z5);
        this.f10872j = new u(this, z4);
        this.f10873k = new w(this);
        this.f10874l = new w(this);
        if (lVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(lVar);
        }
    }

    public final void a() {
        boolean z4;
        boolean h4;
        byte[] bArr = n3.b.f8558a;
        synchronized (this) {
            try {
                v vVar = this.f10871i;
                if (!vVar.f10857e && vVar.f10860k) {
                    u uVar = this.f10872j;
                    if (uVar.f10852d || uVar.f10854i) {
                        z4 = true;
                        h4 = h();
                        Unit unit = Unit.f7487a;
                    }
                }
                z4 = false;
                h4 = h();
                Unit unit2 = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            c(EnumC1211b.CANCEL, null);
        } else {
            if (h4) {
                return;
            }
            this.f10864b.f(this.f10863a);
        }
    }

    public final void b() {
        u uVar = this.f10872j;
        if (uVar.f10854i) {
            throw new IOException("stream closed");
        }
        if (uVar.f10852d) {
            throw new IOException("stream finished");
        }
        if (this.f10875m != null) {
            IOException iOException = this.f10876n;
            if (iOException != null) {
                throw iOException;
            }
            EnumC1211b enumC1211b = this.f10875m;
            Intrinsics.c(enumC1211b);
            throw new C(enumC1211b);
        }
    }

    public final void c(EnumC1211b statusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(statusCode, "rstStatusCode");
        if (d(statusCode, iOException)) {
            p pVar = this.f10864b;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(statusCode, "statusCode");
            pVar.f10811C.i(this.f10863a, statusCode);
        }
    }

    public final boolean d(EnumC1211b enumC1211b, IOException iOException) {
        byte[] bArr = n3.b.f8558a;
        synchronized (this) {
            if (this.f10875m != null) {
                return false;
            }
            this.f10875m = enumC1211b;
            this.f10876n = iOException;
            notifyAll();
            if (this.f10871i.f10857e && this.f10872j.f10852d) {
                return false;
            }
            Unit unit = Unit.f7487a;
            this.f10864b.f(this.f10863a);
            return true;
        }
    }

    public final void e(EnumC1211b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (d(errorCode, null)) {
            this.f10864b.j(this.f10863a, errorCode);
        }
    }

    public final u f() {
        synchronized (this) {
            try {
                if (!this.f10870h && !g()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f10872j;
    }

    public final boolean g() {
        boolean z4 = (this.f10863a & 1) == 1;
        this.f10864b.getClass();
        return true == z4;
    }

    public final synchronized boolean h() {
        if (this.f10875m != null) {
            return false;
        }
        v vVar = this.f10871i;
        if (vVar.f10857e || vVar.f10860k) {
            u uVar = this.f10872j;
            if (uVar.f10852d || uVar.f10854i) {
                if (this.f10870h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(m3.l headers, boolean z4) {
        boolean h4;
        Intrinsics.checkNotNullParameter(headers, "headers");
        byte[] bArr = n3.b.f8558a;
        synchronized (this) {
            try {
                if (this.f10870h && z4) {
                    this.f10871i.getClass();
                    if (z4) {
                        this.f10871i.f10857e = true;
                    }
                    h4 = h();
                    notifyAll();
                    Unit unit = Unit.f7487a;
                }
                this.f10870h = true;
                this.f10869g.add(headers);
                if (z4) {
                }
                h4 = h();
                notifyAll();
                Unit unit2 = Unit.f7487a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (h4) {
            return;
        }
        this.f10864b.f(this.f10863a);
    }

    public final synchronized void j(EnumC1211b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f10875m == null) {
            this.f10875m = errorCode;
            notifyAll();
        }
    }

    public final void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
