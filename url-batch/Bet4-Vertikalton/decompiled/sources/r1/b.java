package r1;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import s1.m;
import s1.n;
import v1.k;
import v1.o;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i) {
        super(str, true);
        this.f3512e = i;
        this.f3513f = obj;
    }

    @Override // r1.a
    public final long a() {
        switch (this.f3512e) {
            case 0:
                ((k) this.f3513f).b();
                return -1L;
            case 1:
                n nVar = (n) this.f3513f;
                long nanoTime = System.nanoTime();
                Iterator it = nVar.d.iterator();
                int i = 0;
                long j2 = Long.MIN_VALUE;
                m mVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    d1.d.d(mVar2, "connection");
                    synchronized (mVar2) {
                        if (nVar.b(mVar2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j3 = nanoTime - mVar2.f3747q;
                            if (j3 > j2) {
                                mVar = mVar2;
                                j2 = j3;
                            }
                        }
                    }
                }
                long j4 = nVar.f3748a;
                if (j2 < j4 && i <= 5) {
                    if (i > 0) {
                        return j4 - j2;
                    }
                    if (i2 > 0) {
                        return j4;
                    }
                    return -1L;
                }
                d1.d.b(mVar);
                synchronized (mVar) {
                    if (!mVar.f3746p.isEmpty()) {
                        return 0L;
                    }
                    if (mVar.f3747q + j2 != nanoTime) {
                        return 0L;
                    }
                    mVar.f3740j = true;
                    nVar.d.remove(mVar);
                    Socket socket = mVar.d;
                    d1.d.b(socket);
                    p1.b.c(socket);
                    if (!nVar.d.isEmpty()) {
                        return 0L;
                    }
                    nVar.f3749b.a();
                    return 0L;
                }
            default:
                o oVar = (o) this.f3513f;
                oVar.getClass();
                try {
                    oVar.f4114w.l(2, 0, false);
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
        this.f3512e = 1;
        this.f3513f = nVar;
    }
}
