package C1;

import D1.n;
import G1.m;
import G1.q;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import k1.e;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f111e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f112f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i) {
        super(str, true);
        this.f111e = i;
        this.f112f = obj;
    }

    @Override // C1.a
    public final long a() {
        switch (this.f111e) {
            case 0:
                ((m) this.f112f).c();
                return -1L;
            case 1:
                n nVar = (n) this.f112f;
                long nanoTime = System.nanoTime();
                Iterator it = nVar.d.iterator();
                int i = 0;
                long j2 = Long.MIN_VALUE;
                D1.m mVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    D1.m mVar2 = (D1.m) it.next();
                    e.d(mVar2, "connection");
                    synchronized (mVar2) {
                        if (nVar.b(mVar2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j3 = nanoTime - mVar2.f205q;
                            if (j3 > j2) {
                                mVar = mVar2;
                                j2 = j3;
                            }
                        }
                    }
                }
                long j4 = nVar.f206a;
                if (j2 < j4 && i <= 5) {
                    if (i > 0) {
                        return j4 - j2;
                    }
                    if (i2 > 0) {
                        return j4;
                    }
                    return -1L;
                }
                e.b(mVar);
                synchronized (mVar) {
                    if (!mVar.f204p.isEmpty()) {
                        return 0L;
                    }
                    if (mVar.f205q + j2 != nanoTime) {
                        return 0L;
                    }
                    mVar.f198j = true;
                    nVar.d.remove(mVar);
                    Socket socket = mVar.d;
                    e.b(socket);
                    A1.c.c(socket);
                    if (!nVar.d.isEmpty()) {
                        return 0L;
                    }
                    nVar.f207b.a();
                    return 0L;
                }
            default:
                q qVar = (q) this.f112f;
                qVar.getClass();
                try {
                    qVar.f432w.r(2, 0, false);
                    return -1L;
                } catch (IOException e2) {
                    qVar.a(2, 2, e2);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, String str) {
        super(str, true);
        this.f111e = 1;
        this.f112f = nVar;
    }
}
