package p3;

import A1.L0;
import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import q3.i;
import q3.j;
import t3.p;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f9121f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, Object obj, int i2) {
        super(str, true);
        this.f9120e = i2;
        this.f9121f = obj;
    }

    @Override // p3.a
    public final long a() {
        int i2 = 0;
        switch (this.f9120e) {
            case 0:
                ((L0) this.f9121f).invoke();
                return -1L;
            case 1:
                j jVar = (j) this.f9121f;
                long nanoTime = System.nanoTime();
                Iterator it = jVar.f9423d.iterator();
                long j4 = Long.MIN_VALUE;
                i iVar = null;
                int i4 = 0;
                while (it.hasNext()) {
                    i connection = (i) it.next();
                    Intrinsics.checkNotNullExpressionValue(connection, "connection");
                    synchronized (connection) {
                        if (jVar.b(connection, nanoTime) > 0) {
                            i4++;
                        } else {
                            i2++;
                            long j5 = nanoTime - connection.f9419q;
                            if (j5 > j4) {
                                iVar = connection;
                                j4 = j5;
                            }
                            Unit unit = Unit.f7487a;
                        }
                    }
                }
                long j6 = jVar.f9420a;
                if (j4 < j6 && i2 <= 5) {
                    if (i2 > 0) {
                        return j6 - j4;
                    }
                    if (i4 > 0) {
                        return j6;
                    }
                    return -1L;
                }
                Intrinsics.c(iVar);
                synchronized (iVar) {
                    if (!iVar.f9418p.isEmpty()) {
                        return 0L;
                    }
                    if (iVar.f9419q + j4 != nanoTime) {
                        return 0L;
                    }
                    iVar.f9412j = true;
                    jVar.f9423d.remove(iVar);
                    Socket socket = iVar.f9406d;
                    Intrinsics.c(socket);
                    n3.b.d(socket);
                    if (!jVar.f9423d.isEmpty()) {
                        return 0L;
                    }
                    jVar.f9421b.a();
                    return 0L;
                }
            default:
                p pVar = (p) this.f9121f;
                pVar.getClass();
                try {
                    pVar.f10811C.h(2, 0, false);
                } catch (IOException e4) {
                    pVar.b(e4);
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j jVar, String str) {
        super(str, true);
        this.f9120e = 1;
        this.f9121f = jVar;
    }
}
