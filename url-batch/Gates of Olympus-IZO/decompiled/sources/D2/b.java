package D2;

import E2.k;
import E2.l;
import H1.q;
import H2.p;
import Z1.i;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f591f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i3) {
        super(str, true);
        this.f590e = i3;
        this.f591f = obj;
    }

    @Override // D2.a
    public final long a() {
        switch (this.f590e) {
            case 0:
                ((q) this.f591f).b();
                return -1L;
            case 1:
                l lVar = (l) this.f591f;
                long nanoTime = System.nanoTime();
                Iterator it = lVar.f839d.iterator();
                int i3 = 0;
                long j3 = Long.MIN_VALUE;
                k kVar = null;
                int i4 = 0;
                while (it.hasNext()) {
                    k kVar2 = (k) it.next();
                    i.e(kVar2, "connection");
                    synchronized (kVar2) {
                        if (lVar.b(kVar2, nanoTime) > 0) {
                            i4++;
                        } else {
                            i3++;
                            long j4 = nanoTime - kVar2.f835q;
                            if (j4 > j3) {
                                kVar = kVar2;
                                j3 = j4;
                            }
                        }
                    }
                }
                long j5 = lVar.f836a;
                if (j3 < j5 && i3 <= 5) {
                    if (i3 > 0) {
                        return j5 - j3;
                    }
                    if (i4 > 0) {
                        return j5;
                    }
                    return -1L;
                }
                i.c(kVar);
                synchronized (kVar) {
                    if (!kVar.p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f835q + j3 != nanoTime) {
                        return 0L;
                    }
                    kVar.f829j = true;
                    lVar.f839d.remove(kVar);
                    Socket socket = kVar.f823d;
                    i.c(socket);
                    B2.c.d(socket);
                    if (!lVar.f839d.isEmpty()) {
                        return 0L;
                    }
                    lVar.f837b.a();
                    return 0L;
                }
            default:
                p pVar = (p) this.f591f;
                pVar.getClass();
                try {
                    pVar.f2005z.j(2, 0, false);
                    return -1L;
                } catch (IOException e3) {
                    pVar.a(2, 2, e3);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, true);
        this.f590e = 1;
        this.f591f = lVar;
    }
}
