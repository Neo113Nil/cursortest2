package a6;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;
import w5.e;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a6.a$a, reason: collision with other inner class name */
    private static final class C0004a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0004a f258a = new C0004a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f259b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f260c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[LOOP:0: B:2:0x0015->B:10:0x003f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[EDGE_INSN: B:11:0x0043->B:12:0x0043 BREAK  A[LOOP:0: B:2:0x0015->B:10:0x003f], SYNTHETIC] */
        static {
            Method method;
            Method method2;
            boolean z6;
            Object h7;
            Method[] methods = Throwable.class.getMethods();
            i.c(methods, "throwableMethods");
            int length = methods.length;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                method = null;
                if (i8 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i8];
                if (i.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    i.c(parameterTypes, "it.parameterTypes");
                    h7 = e.h(parameterTypes);
                    if (i.a(h7, Throwable.class)) {
                        z6 = true;
                        if (!z6) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
                z6 = false;
                if (!z6) {
                }
            }
            f259b = method2;
            int length2 = methods.length;
            while (true) {
                if (i7 >= length2) {
                    break;
                }
                Method method3 = methods[i7];
                if (i.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i7++;
            }
            f260c = method;
        }

        private C0004a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        i.d(th, "cause");
        i.d(th2, "exception");
        Method method = C0004a.f259b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public g6.c b() {
        return new g6.b();
    }
}
