package r2;

import kotlin.coroutines.CoroutineContext;
import q2.EnumC3383a;

/* loaded from: classes3.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    private static final t2.G f43529a = new t2.G("NONE");

    /* renamed from: b, reason: collision with root package name */
    private static final t2.G f43530b = new t2.G("PENDING");

    public static final u a(Object obj) {
        if (obj == null) {
            obj = s2.s.f46019a;
        }
        return new H(obj);
    }

    public static final InterfaceC3396f d(G g4, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        return (((i4 < 0 || i4 >= 2) && i4 != -2) || enumC3383a != EnumC3383a.f43421c) ? z.e(g4, coroutineContext, i4, enumC3383a) : g4;
    }
}
