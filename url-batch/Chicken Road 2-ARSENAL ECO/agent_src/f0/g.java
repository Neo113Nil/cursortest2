package f0;

import android.content.Context;
import c0.C0275h;
import g0.InterfaceC0390a;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import k5.C0481k;
import kotlin.jvm.internal.t;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f4185a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final C0481k f4186b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0361a f4187c;

    static {
        t.a(h.class).b();
        f4186b = AbstractC0521b.x(f.f4184f);
        f4187c = C0361a.f4166a;
    }

    public static C0362b a(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        InterfaceC0390a interfaceC0390a = (InterfaceC0390a) f4186b.getValue();
        if (interfaceC0390a == null) {
            i0.m mVar = i0.m.f4413c;
            if (i0.m.f4413c == null) {
                ReentrantLock reentrantLock = i0.m.f4414d;
                reentrantLock.lock();
                try {
                    if (i0.m.f4413c == null) {
                        i0.k kVar = null;
                        try {
                            C0275h b7 = i0.i.b();
                            if (b7 != null) {
                                C0275h other = C0275h.f3767k;
                                kotlin.jvm.internal.i.e(other, "other");
                                Object value = b7.f3772j.getValue();
                                kotlin.jvm.internal.i.d(value, "<get-bigInteger>(...)");
                                Object value2 = other.f3772j.getValue();
                                kotlin.jvm.internal.i.d(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    i0.k kVar2 = new i0.k(context);
                                    if (kVar2.e()) {
                                        kVar = kVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        i0.m.f4413c = new i0.m(kVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            interfaceC0390a = i0.m.f4413c;
            kotlin.jvm.internal.i.b(interfaceC0390a);
        }
        int i7 = m.f4197b;
        C0362b c0362b = new C0362b(interfaceC0390a);
        f4187c.getClass();
        return c0362b;
    }
}
