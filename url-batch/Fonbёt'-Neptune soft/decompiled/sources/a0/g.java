package a0;

import Q0.p;
import android.content.Context;
import b0.InterfaceC0164a;
import d0.AbstractC0179g;
import d0.C0181i;
import d0.C0183k;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f1272a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final F0.f f1273b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0133a f1274c;

    static {
        p.a(h.class).b();
        f1273b = new F0.f(f.f1271f);
        f1274c = C0133a.f1253a;
    }

    public static C0134b a(Context context) {
        Q0.h.e(context, "context");
        InterfaceC0164a interfaceC0164a = (InterfaceC0164a) f1273b.a();
        if (interfaceC0164a == null) {
            C0183k c0183k = C0183k.f2056c;
            if (C0183k.f2056c == null) {
                ReentrantLock reentrantLock = C0183k.f2057d;
                reentrantLock.lock();
                try {
                    if (C0183k.f2056c == null) {
                        C0181i c0181i = null;
                        try {
                            X.i c2 = AbstractC0179g.c();
                            if (c2 != null) {
                                X.i iVar = X.i.f1137j;
                                Q0.h.e(iVar, "other");
                                Object a2 = c2.f1142i.a();
                                Q0.h.d(a2, "<get-bigInteger>(...)");
                                Object a3 = iVar.f1142i.a();
                                Q0.h.d(a3, "<get-bigInteger>(...)");
                                if (((BigInteger) a2).compareTo((BigInteger) a3) >= 0) {
                                    C0181i c0181i2 = new C0181i(context);
                                    if (c0181i2.i()) {
                                        c0181i = c0181i2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        C0183k.f2056c = new C0183k(c0181i);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0164a = C0183k.f2056c;
            Q0.h.b(interfaceC0164a);
        }
        int i2 = o.f1287b;
        C0134b c0134b = new C0134b(interfaceC0164a);
        f1274c.getClass();
        return c0134b;
    }
}
