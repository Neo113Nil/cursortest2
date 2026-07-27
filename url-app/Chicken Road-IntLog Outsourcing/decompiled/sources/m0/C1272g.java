package m0;

import a.AbstractC0169a;
import android.content.Context;
import f4.C0434k;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.t;
import n0.InterfaceC1296a;

/* renamed from: m0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1272g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C1272g f11107a = new C1272g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0434k f11108b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1266a f11109c;

    static {
        t.a(InterfaceC1273h.class).b();
        f11108b = AbstractC0169a.A(C1271f.f11106e);
        f11109c = C1266a.f11088a;
    }

    public static C1267b a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        InterfaceC1296a interfaceC1296a = (InterfaceC1296a) f11108b.getValue();
        if (interfaceC1296a == null) {
            p0.l lVar = p0.l.f11634c;
            if (p0.l.f11634c == null) {
                ReentrantLock reentrantLock = p0.l.f11635d;
                reentrantLock.lock();
                try {
                    if (p0.l.f11634c == null) {
                        p0.j jVar = null;
                        try {
                            j0.i c2 = p0.h.c();
                            if (c2 != null) {
                                j0.i other = j0.i.f10457f;
                                kotlin.jvm.internal.i.e(other, "other");
                                Object value = c2.f10462e.getValue();
                                kotlin.jvm.internal.i.d(value, "<get-bigInteger>(...)");
                                Object value2 = other.f10462e.getValue();
                                kotlin.jvm.internal.i.d(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    p0.j jVar2 = new p0.j(context);
                                    if (jVar2.i()) {
                                        jVar = jVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        p0.l.f11634c = new p0.l(jVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC1296a = p0.l.f11634c;
            kotlin.jvm.internal.i.b(interfaceC1296a);
        }
        int i2 = n.f11121b;
        C1267b c1267b = new C1267b(interfaceC1296a);
        f11109c.getClass();
        return c1267b;
    }
}
