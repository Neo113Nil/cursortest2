package u;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import v.InterfaceC0094a;

/* renamed from: u.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C0093g f1277a = new C0093g();

    /* renamed from: b, reason: collision with root package name */
    public static final U.e f1278b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0087a f1279c;

    static {
        e0.l.a(h.class).b();
        f1278b = new U.e(C0092f.f1276c);
        f1279c = C0087a.f1258a;
    }

    public static C0088b a(Context context) {
        e0.h.e(context, "context");
        InterfaceC0094a interfaceC0094a = (InterfaceC0094a) f1278b.a();
        if (interfaceC0094a == null) {
            x.k kVar = x.k.f1321c;
            if (x.k.f1321c == null) {
                ReentrantLock reentrantLock = x.k.f1322d;
                reentrantLock.lock();
                try {
                    if (x.k.f1321c == null) {
                        x.i iVar = null;
                        try {
                            r.i c2 = x.g.c();
                            if (c2 != null) {
                                r.i iVar2 = r.i.f1249g;
                                e0.h.e(iVar2, "other");
                                Object a2 = c2.f1254f.a();
                                e0.h.d(a2, "<get-bigInteger>(...)");
                                Object a3 = iVar2.f1254f.a();
                                e0.h.d(a3, "<get-bigInteger>(...)");
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    x.i iVar3 = new x.i(context);
                                    if (iVar3.i()) {
                                        iVar = iVar3;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        x.k.f1321c = new x.k(iVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0094a = x.k.f1321c;
            e0.h.b(interfaceC0094a);
        }
        int i2 = n.f1291b;
        C0088b c0088b = new C0088b(interfaceC0094a);
        f1279c.getClass();
        return c0088b;
    }
}
