package defpackage;

import android.os.SystemClock;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dka extends jxb {
    public final Object a = new Object();
    public final eqa b;
    public boolean c;
    public int d;
    public int e;

    public dka(eqa eqaVar) {
        this.b = eqaVar;
    }

    @Override // defpackage.jxb
    public final void a() {
        synchronized (this.a) {
            if (!this.c) {
                eqa eqaVar = this.b;
                eqaVar.b = SystemClock.elapsedRealtime() - eqaVar.a;
            }
        }
    }

    @Override // defpackage.ixj
    public final void b(long j) {
        synchronized (this.a) {
            this.d += (int) j;
        }
    }

    @Override // defpackage.ixj
    public final void c(long j) {
        synchronized (this.a) {
            this.e += (int) j;
        }
    }

    @Override // defpackage.jxb
    public final void d(jwt jwtVar) {
        synchronized (this.a) {
            eqa eqaVar = this.b;
            SocketAddress socketAddress = (SocketAddress) jwtVar.a(jye.a);
            if (!(socketAddress instanceof InetSocketAddress)) {
                if (socketAddress instanceof kei) {
                    eqaVar.t = 2;
                } else if (socketAddress instanceof kca) {
                    eqaVar.t = 3;
                }
            }
        }
    }
}
