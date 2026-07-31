package o2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* renamed from: o2.H, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3314H extends CoroutineContext.Element {

    /* renamed from: M2, reason: collision with root package name */
    public static final b f42006M2 = b.f42007b;

    /* renamed from: o2.H$a */
    public static final class a {
        public static Object a(InterfaceC3314H interfaceC3314H, Object obj, Function2 function2) {
            return CoroutineContext.Element.a.a(interfaceC3314H, obj, function2);
        }

        public static CoroutineContext.Element b(InterfaceC3314H interfaceC3314H, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.b(interfaceC3314H, bVar);
        }

        public static CoroutineContext c(InterfaceC3314H interfaceC3314H, CoroutineContext.b bVar) {
            return CoroutineContext.Element.a.c(interfaceC3314H, bVar);
        }

        public static CoroutineContext d(InterfaceC3314H interfaceC3314H, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.a.d(interfaceC3314H, coroutineContext);
        }
    }

    /* renamed from: o2.H$b */
    public static final class b implements CoroutineContext.b {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ b f42007b = new b();

        private b() {
        }
    }

    void handleException(CoroutineContext coroutineContext, Throwable th);
}
