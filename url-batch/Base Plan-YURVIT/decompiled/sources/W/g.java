package W;

import P0.p;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f889a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final D0.f f890b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f891c;

    static {
        p.a(h.class).b();
        f890b = new D0.f(f.f888f);
        f891c = a.f870a;
    }

    public static b a(Context context) {
        P0.h.e(context, "context");
        X.a aVar = (X.a) f890b.a();
        if (aVar == null) {
            Z.l lVar = Z.l.f1067c;
            if (Z.l.f1067c == null) {
                ReentrantLock reentrantLock = Z.l.f1068d;
                reentrantLock.lock();
                try {
                    if (Z.l.f1067c == null) {
                        Z.j jVar = null;
                        try {
                            T.h b2 = Z.h.b();
                            if (b2 != null) {
                                T.h hVar = T.h.f847j;
                                P0.h.e(hVar, "other");
                                Object a2 = b2.f852i.a();
                                P0.h.d(a2, "<get-bigInteger>(...)");
                                Object a3 = hVar.f852i.a();
                                P0.h.d(a3, "<get-bigInteger>(...)");
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    Z.j jVar2 = new Z.j(context);
                                    if (jVar2.e()) {
                                        jVar = jVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        Z.l.f1067c = new Z.l(jVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            aVar = Z.l.f1067c;
            P0.h.b(aVar);
        }
        int i2 = n.f903b;
        b bVar = new b(aVar);
        f891c.getClass();
        return bVar;
    }
}
