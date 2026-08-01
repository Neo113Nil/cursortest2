package a4;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class p extends w3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f196f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, Object obj, int i) {
        super(str, true);
        this.f195e = i;
        this.f196f = obj;
    }

    @Override // w3.a
    public final long a() {
        switch (this.f195e) {
            case 0:
                r rVar = (r) this.f196f;
                rVar.getClass();
                try {
                    rVar.B.r(2, 0, false);
                    return -1L;
                } catch (IOException e4) {
                    rVar.m(2, 2, e4);
                    return -1L;
                }
            case 1:
                ((h3.a) this.f196f).a();
                return -1L;
            default:
                x3.m mVar = (x3.m) this.f196f;
                long nanoTime = System.nanoTime();
                Iterator it = mVar.d.iterator();
                int i = 0;
                long j2 = Long.MIN_VALUE;
                x3.l lVar = null;
                int i4 = 0;
                while (it.hasNext()) {
                    x3.l lVar2 = (x3.l) it.next();
                    i3.d.d(lVar2, "connection");
                    synchronized (lVar2) {
                        if (mVar.b(lVar2, nanoTime) > 0) {
                            i4++;
                        } else {
                            i++;
                            long j4 = nanoTime - lVar2.f3941q;
                            if (j4 > j2) {
                                lVar = lVar2;
                                j2 = j4;
                            }
                        }
                    }
                }
                long j5 = mVar.f3942a;
                if (j2 < j5 && i <= 5) {
                    if (i > 0) {
                        return j5 - j2;
                    }
                    if (i4 > 0) {
                        return j5;
                    }
                    return -1L;
                }
                i3.d.b(lVar);
                synchronized (lVar) {
                    if (!lVar.f3940p.isEmpty()) {
                        return 0L;
                    }
                    if (lVar.f3941q + j2 != nanoTime) {
                        return 0L;
                    }
                    lVar.f3934j = true;
                    mVar.d.remove(lVar);
                    Socket socket = lVar.d;
                    i3.d.b(socket);
                    u3.b.c(socket);
                    if (!mVar.d.isEmpty()) {
                        return 0L;
                    }
                    mVar.f3943b.a();
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(x3.m mVar, String str) {
        super(str, true);
        this.f195e = 2;
        this.f196f = mVar;
    }
}
