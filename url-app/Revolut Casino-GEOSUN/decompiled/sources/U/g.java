package U;

import F0.q;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import u0.C0245e;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f1011a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0245e f1012b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f1013c;

    static {
        q.a(h.class).b();
        f1012b = new C0245e(f.f1010f);
        f1013c = a.f992a;
    }

    public static b a(Context context) {
        F0.i.e(context, "context");
        V.a aVar = (V.a) f1012b.a();
        if (aVar == null) {
            X.k kVar = X.k.f1077c;
            if (X.k.f1077c == null) {
                ReentrantLock reentrantLock = X.k.f1078d;
                reentrantLock.lock();
                try {
                    if (X.k.f1077c == null) {
                        X.i iVar = null;
                        try {
                            R.i c2 = X.g.c();
                            if (c2 != null) {
                                R.i iVar2 = R.i.f885j;
                                F0.i.e(iVar2, "other");
                                Object a2 = c2.f890i.a();
                                F0.i.d(a2, "<get-bigInteger>(...)");
                                Object a3 = iVar2.f890i.a();
                                F0.i.d(a3, "<get-bigInteger>(...)");
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    X.i iVar3 = new X.i(context);
                                    if (iVar3.i()) {
                                        iVar = iVar3;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        X.k.f1077c = new X.k(iVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            aVar = X.k.f1077c;
            F0.i.b(aVar);
        }
        int i2 = n.f1025b;
        b bVar = new b(aVar);
        f1013c.getClass();
        return bVar;
    }
}
