package s2;

import kotlin.coroutines.CoroutineContext;
import q2.EnumC3383a;
import r2.InterfaceC3396f;

/* loaded from: classes3.dex */
public interface p extends InterfaceC3396f {

    public static final class a {
        public static /* synthetic */ InterfaceC3396f a(p pVar, CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
            }
            if ((i5 & 1) != 0) {
                coroutineContext = kotlin.coroutines.g.f41113b;
            }
            if ((i5 & 2) != 0) {
                i4 = -3;
            }
            if ((i5 & 4) != 0) {
                enumC3383a = EnumC3383a.f43420b;
            }
            return pVar.f(coroutineContext, i4, enumC3383a);
        }
    }

    InterfaceC3396f f(CoroutineContext coroutineContext, int i4, EnumC3383a enumC3383a);
}
