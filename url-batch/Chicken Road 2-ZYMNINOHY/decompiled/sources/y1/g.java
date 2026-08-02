package y1;

import android.content.Context;
import c3.C0295g;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.q;
import z1.InterfaceC1581a;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f16246a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0295g f16247b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f16248c;

    static {
        q.a(h.class).b();
        f16247b = new C0295g(f.f16245e);
        f16248c = a.f16227a;
    }

    public static b a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        InterfaceC1581a interfaceC1581a = (InterfaceC1581a) f16247b.a();
        if (interfaceC1581a == null) {
            B1.n nVar = B1.n.f214c;
            if (B1.n.f214c == null) {
                ReentrantLock reentrantLock = B1.n.f215d;
                reentrantLock.lock();
                try {
                    if (B1.n.f214c == null) {
                        B1.l lVar = null;
                        try {
                            v1.h b4 = B1.i.b();
                            if (b4 != null) {
                                v1.h other = v1.h.f15551f;
                                kotlin.jvm.internal.i.e(other, "other");
                                Object a3 = b4.f15556e.a();
                                kotlin.jvm.internal.i.d(a3, "<get-bigInteger>(...)");
                                Object a4 = other.f15556e.a();
                                kotlin.jvm.internal.i.d(a4, "<get-bigInteger>(...)");
                                if (((BigInteger) a3).compareTo((BigInteger) a4) >= 0) {
                                    B1.l lVar2 = new B1.l(context);
                                    if (lVar2.e()) {
                                        lVar = lVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        B1.n.f214c = new B1.n(lVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC1581a = B1.n.f214c;
            kotlin.jvm.internal.i.b(interfaceC1581a);
        }
        int i4 = n.f16259b;
        b bVar = new b(interfaceC1581a);
        f16248c.getClass();
        return bVar;
    }
}
