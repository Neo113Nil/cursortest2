package q2;

import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public interface u {

    public static final class a {
        public static /* synthetic */ boolean a(u uVar, Throwable th, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i4 & 1) != 0) {
                th = null;
            }
            return uVar.j(th);
        }
    }

    boolean j(Throwable th);

    void q(Function1 function1);

    Object r(Object obj);

    Object s(Object obj, kotlin.coroutines.d dVar);

    boolean t();
}
