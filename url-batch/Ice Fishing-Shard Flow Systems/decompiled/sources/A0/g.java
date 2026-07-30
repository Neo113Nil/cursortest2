package A0;

import R5.q;
import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ g f67a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static final q f68b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f69c;

    static {
        E.a(h.class).b();
        f68b = R5.i.b(f.f66d);
        f69c = a.f48a;
    }

    public static b a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        B0.a aVar = (B0.a) f68b.getValue();
        if (aVar == null) {
            D0.n nVar = D0.n.f344c;
            Intrinsics.checkNotNullParameter(context, "context");
            if (D0.n.f344c == null) {
                ReentrantLock reentrantLock = D0.n.f345d;
                reentrantLock.lock();
                try {
                    if (D0.n.f344c == null) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        D0.l lVar = null;
                        try {
                            x0.i b7 = D0.i.b();
                            if (b7 != null) {
                                x0.i other = x0.i.f8311n;
                                Intrinsics.checkNotNullParameter(other, "other");
                                Object value = b7.f8316m.getValue();
                                Intrinsics.checkNotNullExpressionValue(value, "<get-bigInteger>(...)");
                                Object value2 = other.f8316m.getValue();
                                Intrinsics.checkNotNullExpressionValue(value2, "<get-bigInteger>(...)");
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    D0.l lVar2 = new D0.l(context);
                                    if (lVar2.e()) {
                                        lVar = lVar2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        D0.n.f344c = new D0.n(lVar);
                    }
                    Unit unit = Unit.f6114a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            aVar = D0.n.f344c;
            Intrinsics.b(aVar);
        }
        p pVar = p.f84b;
        b tracker = new b(aVar);
        f69c.getClass();
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        return tracker;
    }
}
