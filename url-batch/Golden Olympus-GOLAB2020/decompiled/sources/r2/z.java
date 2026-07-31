package r2;

import kotlin.coroutines.CoroutineContext;
import q2.EnumC3383a;
import s2.C3417h;

/* loaded from: classes3.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final t2.G f43641a = new t2.G("NO_VALUE");

    public static final t a(int i4, int i5, EnumC3383a enumC3383a) {
        if (i4 < 0) {
            throw new IllegalArgumentException(("replay cannot be negative, but was " + i4).toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i5).toString());
        }
        if (i4 > 0 || i5 > 0 || enumC3383a == EnumC3383a.f43420b) {
            int i6 = i5 + i4;
            if (i6 < 0) {
                i6 = Integer.MAX_VALUE;
            }
            return new y(i4, i6, enumC3383a);
        }
        throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC3383a).toString());
    }

    public static /* synthetic */ t b(int i4, int i5, EnumC3383a enumC3383a, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            enumC3383a = EnumC3383a.f43420b;
        }
        return a(i4, i5, enumC3383a);
    }

    public static final InterfaceC3396f e(x xVar, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a) {
        return ((i4 == 0 || i4 == -3) && enumC3383a == EnumC3383a.f43420b) ? xVar : new C3417h(xVar, coroutineContext, i4, enumC3383a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f(Object[] objArr, long j4) {
        return objArr[((int) j4) & (objArr.length - 1)];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Object[] objArr, long j4, Object obj) {
        objArr[((int) j4) & (objArr.length - 1)] = obj;
    }
}
