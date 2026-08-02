package g0;

import android.content.Context;
import b2.C0193g;
import h0.InterfaceC0338a;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.r;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f5025a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0193g f5026b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0329a f5027c;

    static {
        r.a(h.class).b();
        f5026b = new C0193g(f.f5024e);
        f5027c = C0329a.f5008a;
    }

    public static C0330b a(Context context) {
        kotlin.jvm.internal.j.e(context, "context");
        InterfaceC0338a interfaceC0338a = (InterfaceC0338a) f5026b.a();
        if (interfaceC0338a == null) {
            j0.k kVar = j0.k.f9511c;
            if (j0.k.f9511c == null) {
                ReentrantLock reentrantLock = j0.k.f9512d;
                reentrantLock.lock();
                try {
                    if (j0.k.f9511c == null) {
                        j0.i iVar = null;
                        try {
                            d0.h b3 = j0.h.b();
                            if (b3 != null) {
                                d0.h other = d0.h.f;
                                kotlin.jvm.internal.j.e(other, "other");
                                Object a3 = b3.f4929e.a();
                                kotlin.jvm.internal.j.d(a3, "<get-bigInteger>(...)");
                                Object a4 = other.f4929e.a();
                                kotlin.jvm.internal.j.d(a4, "<get-bigInteger>(...)");
                                if (((BigInteger) a3).compareTo((BigInteger) a4) >= 0) {
                                    j0.i iVar2 = new j0.i(context);
                                    if (iVar2.e()) {
                                        iVar = iVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        j0.k.f9511c = new j0.k(iVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0338a = j0.k.f9511c;
            kotlin.jvm.internal.j.b(interfaceC0338a);
        }
        int i3 = m.f5036b;
        C0330b c0330b = new C0330b(interfaceC0338a);
        f5027c.getClass();
        return c0330b;
    }
}
