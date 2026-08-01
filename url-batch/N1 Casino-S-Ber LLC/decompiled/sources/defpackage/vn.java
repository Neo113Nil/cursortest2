package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class vn extends d50 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn(int i, Object obj, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.d50
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                xn xnVar = (xn) this.f;
                xnVar.getClass();
                try {
                    xnVar.B.r(2, 0, false);
                } catch (IOException e) {
                    xnVar.m(2, 2, e);
                }
                return -1L;
            case 1:
                ky kyVar = (ky) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = kyVar.d.iterator();
                long j = Long.MIN_VALUE;
                jy jyVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    jy jyVar2 = (jy) it.next();
                    jyVar2.getClass();
                    synchronized (jyVar2) {
                        if (kyVar.b(jyVar2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - jyVar2.q;
                            if (j2 > j) {
                                jyVar = jyVar2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = kyVar.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                jyVar.getClass();
                synchronized (jyVar) {
                    if (!jyVar.p.isEmpty()) {
                        return 0L;
                    }
                    if (jyVar.q + j != nanoTime) {
                        return 0L;
                    }
                    jyVar.j = true;
                    kyVar.d.remove(jyVar);
                    Socket socket = jyVar.d;
                    socket.getClass();
                    r70.c(socket);
                    if (!kyVar.d.isEmpty()) {
                        return 0L;
                    }
                    kyVar.b.a();
                    return 0L;
                }
            default:
                ((ml) this.f).a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(ky kyVar, String str) {
        super(str, true);
        this.e = 1;
        this.f = kyVar;
    }
}
