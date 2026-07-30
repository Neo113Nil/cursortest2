package w;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f1216a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final t0.e f1217b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f1218c;

    static {
        d1.l.a(h.class).b();
        f1217b = new t0.e(f.f1215c);
        f1218c = a.f1197a;
    }

    public static b a(Context context) {
        context.getClass();
        x.a aVar = (x.a) f1217b.a();
        if (aVar == null) {
            z.l lVar = z.l.f1268c;
            if (z.l.f1268c == null) {
                ReentrantLock reentrantLock = z.l.f1269d;
                reentrantLock.lock();
                try {
                    if (z.l.f1268c == null) {
                        z.j jVar = null;
                        try {
                            t.h b2 = z.h.b();
                            if (b2 != null) {
                                t.h hVar = t.h.f1165g;
                                hVar.getClass();
                                Object a2 = b2.f1170f.a();
                                a2.getClass();
                                Object a3 = hVar.f1170f.a();
                                a3.getClass();
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    z.j jVar2 = new z.j(context);
                                    if (jVar2.e()) {
                                        jVar = jVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        z.l.f1268c = new z.l(jVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            aVar = z.l.f1268c;
            aVar.getClass();
        }
        int i2 = m.f1226b;
        b bVar = new b(aVar);
        f1218c.getClass();
        return bVar;
    }
}
