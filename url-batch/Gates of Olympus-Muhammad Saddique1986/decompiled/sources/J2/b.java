package J2;

import K2.j;
import K2.k;
import N2.l;
import N2.p;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3189e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3190f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i3) {
        super(str, true);
        this.f3189e = i3;
        this.f3190f = obj;
    }

    @Override // J2.a
    public final long a() {
        switch (this.f3189e) {
            case 0:
                ((l) this.f3190f).b();
                return -1L;
            case 1:
                k kVar = (k) this.f3190f;
                long nanoTime = System.nanoTime();
                Iterator it = kVar.f3326d.iterator();
                int i3 = 0;
                long j3 = Long.MIN_VALUE;
                j jVar = null;
                int i4 = 0;
                while (it.hasNext()) {
                    j jVar2 = (j) it.next();
                    f2.j.e(jVar2, "connection");
                    synchronized (jVar2) {
                        if (kVar.b(jVar2, nanoTime) > 0) {
                            i4++;
                        } else {
                            i3++;
                            long j4 = nanoTime - jVar2.f3322q;
                            if (j4 > j3) {
                                jVar = jVar2;
                                j3 = j4;
                            }
                        }
                    }
                }
                long j5 = kVar.f3323a;
                if (j3 < j5 && i3 <= 5) {
                    if (i3 > 0) {
                        return j5 - j3;
                    }
                    if (i4 > 0) {
                        return j5;
                    }
                    return -1L;
                }
                f2.j.c(jVar);
                synchronized (jVar) {
                    if (!jVar.f3321p.isEmpty()) {
                        return 0L;
                    }
                    if (jVar.f3322q + j3 != nanoTime) {
                        return 0L;
                    }
                    jVar.f3315j = true;
                    kVar.f3326d.remove(jVar);
                    Socket socket = jVar.f3309d;
                    f2.j.c(socket);
                    H2.b.d(socket);
                    if (!kVar.f3326d.isEmpty()) {
                        return 0L;
                    }
                    kVar.f3324b.a();
                    return 0L;
                }
            default:
                p pVar = (p) this.f3190f;
                pVar.getClass();
                try {
                    pVar.f3662z.h(2, 0, false);
                    return -1L;
                } catch (IOException e3) {
                    pVar.a(2, 2, e3);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, String str) {
        super(str, true);
        this.f3189e = 1;
        this.f3190f = kVar;
    }
}
