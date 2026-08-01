package f3;

import g3.l;
import g3.m;
import j3.p;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i4) {
        super(str, true);
        this.f1740e = i4;
        this.f1741f = obj;
    }

    @Override // f3.a
    public final long a() {
        switch (this.f1740e) {
            case 0:
                ((t2.a) this.f1741f).a();
                return -1L;
            case 1:
                m mVar = (m) this.f1741f;
                long nanoTime = System.nanoTime();
                Iterator it = mVar.f1973d.iterator();
                int i4 = 0;
                long j4 = Long.MIN_VALUE;
                l lVar = null;
                int i5 = 0;
                while (it.hasNext()) {
                    l lVar2 = (l) it.next();
                    u2.c.d(lVar2, "connection");
                    synchronized (lVar2) {
                        if (mVar.b(lVar2, nanoTime) > 0) {
                            i5++;
                        } else {
                            i4++;
                            long j5 = nanoTime - lVar2.f1970q;
                            if (j5 > j4) {
                                lVar = lVar2;
                                j4 = j5;
                            }
                        }
                    }
                }
                long j6 = mVar.f1971a;
                if (j4 < j6 && i4 <= 5) {
                    if (i4 > 0) {
                        return j6 - j4;
                    }
                    if (i5 > 0) {
                        return j6;
                    }
                    return -1L;
                }
                u2.c.b(lVar);
                synchronized (lVar) {
                    if (!lVar.f1969p.isEmpty()) {
                        return 0L;
                    }
                    if (lVar.f1970q + j4 != nanoTime) {
                        return 0L;
                    }
                    lVar.f1963j = true;
                    mVar.f1973d.remove(lVar);
                    Socket socket = lVar.f1959d;
                    u2.c.b(socket);
                    d3.c.c(socket);
                    if (!mVar.f1973d.isEmpty()) {
                        return 0L;
                    }
                    mVar.f1972b.a();
                    return 0L;
                }
            default:
                p pVar = (p) this.f1741f;
                pVar.getClass();
                try {
                    pVar.B.r(2, 0, false);
                    return -1L;
                } catch (IOException e4) {
                    pVar.m(2, 2, e4);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, String str) {
        super(str, true);
        this.f1740e = 1;
        this.f1741f = mVar;
    }
}
