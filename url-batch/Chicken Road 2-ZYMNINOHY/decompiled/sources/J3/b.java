package J3;

import K3.k;
import K3.l;
import N3.q;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import kotlin.jvm.internal.i;
import o3.InterfaceC1328a;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1201f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i4) {
        super(str, true);
        this.f1200e = i4;
        this.f1201f = obj;
    }

    @Override // J3.a
    public final long a() {
        switch (this.f1200e) {
            case 0:
                ((InterfaceC1328a) this.f1201f).invoke();
                return -1L;
            case 1:
                l lVar = (l) this.f1201f;
                long nanoTime = System.nanoTime();
                Iterator it = lVar.f1592d.iterator();
                int i4 = 0;
                long j4 = Long.MIN_VALUE;
                k kVar = null;
                int i5 = 0;
                while (it.hasNext()) {
                    k connection = (k) it.next();
                    i.d(connection, "connection");
                    synchronized (connection) {
                        if (lVar.b(connection, nanoTime) > 0) {
                            i5++;
                        } else {
                            i4++;
                            long j5 = nanoTime - connection.f1588q;
                            if (j5 > j4) {
                                kVar = connection;
                                j4 = j5;
                            }
                        }
                    }
                }
                long j6 = lVar.f1589a;
                if (j4 < j6 && i4 <= 5) {
                    if (i4 > 0) {
                        return j6 - j4;
                    }
                    if (i5 > 0) {
                        return j6;
                    }
                    return -1L;
                }
                i.b(kVar);
                synchronized (kVar) {
                    if (!kVar.f1587p.isEmpty()) {
                        return 0L;
                    }
                    if (kVar.f1588q + j4 != nanoTime) {
                        return 0L;
                    }
                    kVar.f1583j = true;
                    lVar.f1592d.remove(kVar);
                    Socket socket = kVar.f1577d;
                    i.b(socket);
                    H3.b.d(socket);
                    if (!lVar.f1592d.isEmpty()) {
                        return 0L;
                    }
                    lVar.f1590b.a();
                    return 0L;
                }
            default:
                q qVar = (q) this.f1201f;
                qVar.getClass();
                try {
                    qVar.f1899w.n(2, false, 0);
                    return -1L;
                } catch (IOException e4) {
                    qVar.b(e4);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, String str) {
        super(str, true);
        this.f1200e = 1;
        this.f1201f = lVar;
    }
}
