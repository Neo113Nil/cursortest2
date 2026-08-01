package C1;

import D1.n;
import G1.m;
import G1.q;
import j1.h;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends a {
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f137f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f137f = obj;
    }

    @Override // C1.a
    public final long a() {
        switch (this.e) {
            case 0:
                ((m) this.f137f).c();
                return -1L;
            case 1:
                n nVar = (n) this.f137f;
                long nanoTime = System.nanoTime();
                Iterator it = nVar.f267d.iterator();
                int i = 0;
                long j = Long.MIN_VALUE;
                D1.m mVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    D1.m mVar2 = (D1.m) it.next();
                    h.d(mVar2, "connection");
                    synchronized (mVar2) {
                        if (nVar.b(mVar2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - mVar2.f263q;
                            if (j2 > j) {
                                mVar = mVar2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = nVar.f264a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                h.b(mVar);
                synchronized (mVar) {
                    if (!mVar.f262p.isEmpty()) {
                        return 0L;
                    }
                    if (mVar.f263q + j != nanoTime) {
                        return 0L;
                    }
                    mVar.j = true;
                    nVar.f267d.remove(mVar);
                    Socket socket = mVar.f253d;
                    h.b(socket);
                    A1.c.c(socket);
                    if (!nVar.f267d.isEmpty()) {
                        return 0L;
                    }
                    nVar.f265b.a();
                    return 0L;
                }
            default:
                q qVar = (q) this.f137f;
                qVar.getClass();
                try {
                    qVar.f414w.D(2, 0, false);
                    return -1L;
                } catch (IOException e) {
                    qVar.a(2, 2, e);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, String str) {
        super(str, true);
        this.e = 1;
        this.f137f = nVar;
    }
}
