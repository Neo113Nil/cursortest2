package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class au extends gh0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(int i, Object obj, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.gh0
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                du duVar = (du) this.f;
                duVar.getClass();
                try {
                    duVar.B.O(2, 0, false);
                } catch (IOException e) {
                    duVar.n(e);
                }
                return -1L;
            case 1:
                r70 r70Var = (r70) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = r70Var.d.iterator();
                long j = Long.MIN_VALUE;
                q70 q70Var = null;
                int i2 = 0;
                while (it.hasNext()) {
                    q70 q70Var2 = (q70) it.next();
                    q70Var2.getClass();
                    synchronized (q70Var2) {
                        if (r70Var.b(q70Var2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - q70Var2.q;
                            if (j2 > j) {
                                q70Var = q70Var2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = r70Var.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                q70Var.getClass();
                synchronized (q70Var) {
                    if (!q70Var.p.isEmpty()) {
                        return 0L;
                    }
                    if (q70Var.q + j != nanoTime) {
                        return 0L;
                    }
                    q70Var.j = true;
                    r70Var.d.remove(q70Var);
                    Socket socket = q70Var.d;
                    socket.getClass();
                    zk0.c(socket);
                    if (!r70Var.d.isEmpty()) {
                        return 0L;
                    }
                    r70Var.b.a();
                    return 0L;
                }
            default:
                ((ir) this.f).a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(r70 r70Var, String str) {
        super(str, true);
        this.e = 1;
        this.f = r70Var;
    }
}
