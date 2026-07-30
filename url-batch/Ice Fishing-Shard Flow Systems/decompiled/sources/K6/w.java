package K6;

import java.io.InterruptedIOException;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w implements T6.u {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1598d;

    /* renamed from: e, reason: collision with root package name */
    public final T6.f f1599e = new T6.f();

    /* renamed from: i, reason: collision with root package name */
    public boolean f1600i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f1601l;

    public w(z zVar, boolean z7) {
        this.f1601l = zVar;
        this.f1598d = z7;
    }

    /* JADX WARN: Finally extract failed */
    public final void a(boolean z7) {
        long min;
        boolean z8;
        z zVar = this.f1601l;
        synchronized (zVar) {
            try {
                zVar.f1619s.h();
                while (zVar.f1612l >= zVar.f1613m && !this.f1598d && !this.f1600i && zVar.g() == null) {
                    try {
                        try {
                            zVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        zVar.f1619s.l();
                        throw th;
                    }
                }
                zVar.f1619s.l();
                zVar.c();
                min = Math.min(zVar.f1613m - zVar.f1612l, this.f1599e.f2617e);
                zVar.f1612l += min;
                z8 = z7 && min == this.f1599e.f2617e;
                Unit unit = Unit.f6114a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f1601l.f1619s.h();
        try {
            z zVar2 = this.f1601l;
            zVar2.f1610e.s(zVar2.f1609d, z8, this.f1599e, min);
        } finally {
            this.f1601l.f1619s.l();
        }
    }

    @Override // T6.u
    public final T6.y b() {
        return this.f1601l.f1619s;
    }

    @Override // T6.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z zVar = this.f1601l;
        TimeZone timeZone = E6.e.f712a;
        synchronized (zVar) {
            if (this.f1600i) {
                return;
            }
            boolean z7 = zVar.g() == null;
            Unit unit = Unit.f6114a;
            z zVar2 = this.f1601l;
            if (!zVar2.f1617q.f1598d) {
                if (this.f1599e.f2617e > 0) {
                    while (this.f1599e.f2617e > 0) {
                        a(true);
                    }
                } else if (z7) {
                    zVar2.f1610e.s(zVar2.f1609d, true, null, 0L);
                }
            }
            z zVar3 = this.f1601l;
            synchronized (zVar3) {
                this.f1600i = true;
                zVar3.notifyAll();
                Unit unit2 = Unit.f6114a;
            }
            this.f1601l.f1610e.flush();
            this.f1601l.b();
        }
    }

    @Override // T6.u, java.io.Flushable
    public final void flush() {
        z zVar = this.f1601l;
        TimeZone timeZone = E6.e.f712a;
        synchronized (zVar) {
            zVar.c();
            Unit unit = Unit.f6114a;
        }
        while (this.f1599e.f2617e > 0) {
            a(false);
            this.f1601l.f1610e.flush();
        }
    }

    @Override // T6.u
    public final void x(long j, T6.f source) {
        Intrinsics.checkNotNullParameter(source, "source");
        TimeZone timeZone = E6.e.f712a;
        T6.f fVar = this.f1599e;
        fVar.x(j, source);
        while (fVar.f2617e >= 16384) {
            a(false);
        }
    }
}
