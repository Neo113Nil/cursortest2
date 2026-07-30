package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ty0 extends it2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ty0(String str, Object obj, int i) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.it2
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                vy0 vy0Var = (vy0) this.f;
                vy0Var.getClass();
                try {
                    vy0Var.I.p(2, 0, false);
                } catch (IOException e) {
                    vy0Var.b(2, 2, e);
                }
                return -1L;
            case 1:
                w62 w62Var = (w62) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = ((ConcurrentLinkedQueue) w62Var.e).iterator();
                long j = Long.MIN_VALUE;
                v62 v62Var = null;
                int i2 = 0;
                while (it.hasNext()) {
                    v62 v62Var2 = (v62) it.next();
                    v62Var2.getClass();
                    synchronized (v62Var2) {
                        if (w62Var.b(v62Var2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - v62Var2.q;
                            if (j2 > j) {
                                v62Var = v62Var2;
                                j = j2;
                            }
                            Unit unit = Unit.a;
                        }
                    }
                }
                long j3 = w62Var.b;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                v62Var.getClass();
                synchronized (v62Var) {
                    if (!v62Var.p.isEmpty()) {
                        return 0L;
                    }
                    if (v62Var.q + j != nanoTime) {
                        return 0L;
                    }
                    v62Var.j = true;
                    ((ConcurrentLinkedQueue) w62Var.e).remove(v62Var);
                    Socket socket = v62Var.d;
                    socket.getClass();
                    n33.c(socket);
                    if (!((ConcurrentLinkedQueue) w62Var.e).isEmpty()) {
                        return 0L;
                    }
                    ((nt2) w62Var.c).a();
                    return 0L;
                }
            default:
                ((Function0) this.f).invoke();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(w62 w62Var, String str) {
        super(str, true);
        this.e = 1;
        this.f = w62Var;
    }
}
