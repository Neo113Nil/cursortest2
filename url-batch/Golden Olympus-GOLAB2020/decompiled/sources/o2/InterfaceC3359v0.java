package o2;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;
import w2.InterfaceC3507a;

/* renamed from: o2.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3359v0 extends CoroutineContext.Element {

    /* renamed from: N2, reason: collision with root package name */
    public static final b f42105N2 = b.f42106b;

    /* renamed from: o2.v0$b */
    public static final class b implements CoroutineContext.b {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ b f42106b = new b();

        private b() {
        }
    }

    InterfaceC3354t attachChild(InterfaceC3358v interfaceC3358v);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    Sequence getChildren();

    InterfaceC3507a getOnJoin();

    InterfaceC3359v0 getParent();

    InterfaceC3320b0 invokeOnCompletion(Function1 function1);

    InterfaceC3320b0 invokeOnCompletion(boolean z4, boolean z5, Function1 function1);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(kotlin.coroutines.d dVar);

    InterfaceC3359v0 plus(InterfaceC3359v0 interfaceC3359v0);

    boolean start();

    /* renamed from: o2.v0$a */
    public static final class a {
        public static /* synthetic */ void b(InterfaceC3359v0 interfaceC3359v0, CancellationException cancellationException, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i4 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC3359v0.cancel(cancellationException);
        }

        public static Object c(InterfaceC3359v0 interfaceC3359v0, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(interfaceC3359v0, obj, function2);
        }

        public static CoroutineContext.Element d(InterfaceC3359v0 interfaceC3359v0, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.b(interfaceC3359v0, bVar);
        }

        public static CoroutineContext e(InterfaceC3359v0 interfaceC3359v0, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.c(interfaceC3359v0, bVar);
        }

        public static CoroutineContext f(InterfaceC3359v0 interfaceC3359v0, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(interfaceC3359v0, coroutineContext);
        }

        public static InterfaceC3359v0 g(InterfaceC3359v0 interfaceC3359v0, InterfaceC3359v0 interfaceC3359v02) {
            return interfaceC3359v02;
        }
    }
}
