package D3;

import b4.C0286a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import y3.l;
import y3.p;
import y3.q;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Supplier {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f449a;

    public /* synthetic */ h(int i2) {
        this.f449a = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f449a) {
            case 0:
                return Double.valueOf(ThreadLocalRandom.current().nextDouble(0.8d, 1.2d));
            case 1:
                return ThreadLocalRandom.current();
            case 2:
                return M3.g.f1960a;
            case 3:
                return C0286a.f4829a;
            case 4:
                return Collections.emptyMap();
            case 5:
                P2.b bVar = P2.c.f2288c;
                if (bVar == null) {
                    synchronized (P2.c.f2287b) {
                        try {
                            P2.b bVar2 = P2.c.f2288c;
                            if (bVar2 == null) {
                                P2.b a6 = P2.c.a();
                                if (a6 == null) {
                                    P2.a aVar = P2.a.f2284a;
                                    P2.c.b(aVar);
                                    bVar = aVar;
                                }
                            } else {
                                bVar = bVar2;
                            }
                        } finally {
                        }
                    }
                }
                return bVar.a();
            case 6:
                return new IdentityHashMap();
            case 7:
                return new ArrayList();
            case 8:
                return new l();
            case 9:
                return new l();
            case 10:
                return new q();
            case 11:
                return new q();
            default:
                return new p();
        }
    }
}
