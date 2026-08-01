package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class hq extends h80 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq(int i, Object obj, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.h80
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                jq jqVar = (jq) this.f;
                jqVar.getClass();
                try {
                    jqVar.B.r(2, 0, false);
                } catch (IOException e) {
                    jqVar.f(2, 2, e);
                }
                return -1L;
            case 1:
                m10 m10Var = (m10) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = m10Var.d.iterator();
                long j = Long.MIN_VALUE;
                l10 l10Var = null;
                int i2 = 0;
                while (it.hasNext()) {
                    l10 l10Var2 = (l10) it.next();
                    l10Var2.getClass();
                    synchronized (l10Var2) {
                        if (m10Var.b(l10Var2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - l10Var2.q;
                            if (j2 > j) {
                                l10Var = l10Var2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = m10Var.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                l10Var.getClass();
                synchronized (l10Var) {
                    if (!l10Var.p.isEmpty()) {
                        return 0L;
                    }
                    if (l10Var.q + j != nanoTime) {
                        return 0L;
                    }
                    l10Var.j = true;
                    m10Var.d.remove(l10Var);
                    Socket socket = l10Var.d;
                    socket.getClass();
                    cb0.c(socket);
                    if (!m10Var.d.isEmpty()) {
                        return 0L;
                    }
                    m10Var.b.a();
                    return 0L;
                }
            default:
                ((rn) this.f).a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq(m10 m10Var, String str) {
        super(str, true);
        this.e = 1;
        this.f = m10Var;
    }
}
