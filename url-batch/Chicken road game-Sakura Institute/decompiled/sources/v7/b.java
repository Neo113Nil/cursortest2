package v7;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import r6.k;
import w7.i;
import w7.j;
import z7.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9163e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9164f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i7) {
        super(str, true);
        this.f9163e = i7;
        this.f9164f = obj;
    }

    @Override // v7.a
    public final long a() {
        switch (this.f9163e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((q6.a) this.f9164f).a();
                return -1L;
            case 1:
                j jVar = (j) this.f9164f;
                long nanoTime = System.nanoTime();
                Iterator it = jVar.f9586d.iterator();
                int i7 = 0;
                long j8 = Long.MIN_VALUE;
                i iVar = null;
                int i8 = 0;
                while (it.hasNext()) {
                    i iVar2 = (i) it.next();
                    k.e(iVar2, "connection");
                    synchronized (iVar2) {
                        if (jVar.b(iVar2, nanoTime) > 0) {
                            i8++;
                        } else {
                            i7++;
                            long j9 = nanoTime - iVar2.f9582q;
                            if (j9 > j8) {
                                iVar = iVar2;
                                j8 = j9;
                            }
                        }
                    }
                }
                long j10 = jVar.f9583a;
                if (j8 < j10 && i7 <= 5) {
                    if (i7 > 0) {
                        return j10 - j8;
                    }
                    if (i8 > 0) {
                        return j10;
                    }
                    return -1L;
                }
                k.c(iVar);
                synchronized (iVar) {
                    if (!iVar.f9581p.isEmpty()) {
                        return 0L;
                    }
                    if (iVar.f9582q + j8 != nanoTime) {
                        return 0L;
                    }
                    iVar.f9575j = true;
                    jVar.f9586d.remove(iVar);
                    Socket socket = iVar.f9569d;
                    k.c(socket);
                    t7.b.d(socket);
                    if (!jVar.f9586d.isEmpty()) {
                        return 0L;
                    }
                    jVar.f9584b.a();
                    return 0L;
                }
            default:
                n nVar = (n) this.f9164f;
                nVar.getClass();
                try {
                    nVar.B.u(2, 0, false);
                    return -1L;
                } catch (IOException e9) {
                    nVar.b(2, 2, e9);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, String str) {
        super(str, true);
        this.f9163e = 1;
        this.f9164f = jVar;
    }
}
