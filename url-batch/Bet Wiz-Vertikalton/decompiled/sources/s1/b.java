package s1;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import t1.m;
import t1.n;
import w1.k;
import w1.o;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i) {
        super(str, true);
        this.f3669e = i;
        this.f3670f = obj;
    }

    @Override // s1.a
    public final long a() {
        switch (this.f3669e) {
            case 0:
                ((k) this.f3670f).a();
                return -1L;
            case 1:
                n nVar = (n) this.f3670f;
                long nanoTime = System.nanoTime();
                Iterator it = nVar.d.iterator();
                int i = 0;
                long j2 = Long.MIN_VALUE;
                m mVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    e1.d.d(mVar2, "connection");
                    synchronized (mVar2) {
                        if (nVar.b(mVar2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j3 = nanoTime - mVar2.f3786q;
                            if (j3 > j2) {
                                mVar = mVar2;
                                j2 = j3;
                            }
                        }
                    }
                }
                long j4 = nVar.f3787a;
                if (j2 < j4 && i <= 5) {
                    if (i > 0) {
                        return j4 - j2;
                    }
                    if (i2 > 0) {
                        return j4;
                    }
                    return -1L;
                }
                e1.d.b(mVar);
                synchronized (mVar) {
                    if (!mVar.f3785p.isEmpty()) {
                        return 0L;
                    }
                    if (mVar.f3786q + j2 != nanoTime) {
                        return 0L;
                    }
                    mVar.f3779j = true;
                    nVar.d.remove(mVar);
                    Socket socket = mVar.d;
                    e1.d.b(socket);
                    q1.b.c(socket);
                    if (!nVar.d.isEmpty()) {
                        return 0L;
                    }
                    nVar.f3788b.a();
                    return 0L;
                }
            default:
                o oVar = (o) this.f3670f;
                oVar.getClass();
                try {
                    oVar.f4142w.l(2, 0, false);
                    return -1L;
                } catch (IOException e2) {
                    oVar.g(2, 2, e2);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, String str) {
        super(str, true);
        this.f3669e = 1;
        this.f3670f = nVar;
    }
}
