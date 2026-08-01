package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class lo extends k50 {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lo(int i, Object obj, String str) {
        super(str, true);
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.k50
    public final long a() {
        int i = 0;
        switch (this.e) {
            case 0:
                no noVar = (no) this.f;
                noVar.getClass();
                try {
                    noVar.B.r(2, false, 0);
                } catch (IOException e) {
                    noVar.m(2, 2, e);
                }
                return -1L;
            case 1:
                zy zyVar = (zy) this.f;
                long nanoTime = System.nanoTime();
                Iterator it = zyVar.d.iterator();
                long j = Long.MIN_VALUE;
                yy yyVar = null;
                int i2 = 0;
                while (it.hasNext()) {
                    yy yyVar2 = (yy) it.next();
                    yyVar2.getClass();
                    synchronized (yyVar2) {
                        if (zyVar.b(yyVar2, nanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = nanoTime - yyVar2.q;
                            if (j2 > j) {
                                yyVar = yyVar2;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = zyVar.a;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                yyVar.getClass();
                synchronized (yyVar) {
                    if (!yyVar.p.isEmpty()) {
                        return 0L;
                    }
                    if (yyVar.q + j != nanoTime) {
                        return 0L;
                    }
                    yyVar.j = true;
                    zyVar.d.remove(yyVar);
                    Socket socket = yyVar.d;
                    socket.getClass();
                    y70.c(socket);
                    if (!zyVar.d.isEmpty()) {
                        return 0L;
                    }
                    zyVar.b.a();
                    return 0L;
                }
            default:
                ((vl) this.f).a();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo(zy zyVar, String str) {
        super(str, true);
        this.e = 1;
        this.f = zyVar;
    }
}
