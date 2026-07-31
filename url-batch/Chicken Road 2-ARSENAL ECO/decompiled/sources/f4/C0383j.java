package f4;

import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* renamed from: f4.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383j implements InterfaceC0375b, AutoCloseable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f4236g = Logger.getLogger(C0383j.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public final C0381h f4237f;

    public C0383j() {
        EnumC0386m enumC0386m = EnumC0386m.f4244f;
        this.f4237f = new C0381h(new ConcurrentHashMap());
    }

    public static AssertionError d(C0380g c0380g) {
        AssertionError assertionError = new AssertionError("Thread [" + c0380g.f4228f + "] opened a scope of " + c0380g.f4230h + " here:");
        assertionError.setStackTrace(c0380g.getStackTrace());
        return assertionError;
    }

    @Override // f4.InterfaceC0375b
    public final InterfaceC0379f a(C0374a c0374a) {
        int i7;
        InterfaceC0379f a7 = EnumC0386m.f4244f.a(c0374a);
        C0380g c0380g = new C0380g(c0374a);
        StackTraceElement[] stackTrace = c0380g.getStackTrace();
        for (int i8 = 0; i8 < stackTrace.length; i8++) {
            StackTraceElement stackTraceElement = stackTrace[i8];
            if (stackTraceElement.getClassName().equals(C0374a.class.getName()) && stackTraceElement.getMethodName().equals("makeCurrent") && (i7 = i8 + 2) < stackTrace.length) {
                StackTraceElement stackTraceElement2 = stackTrace[i7];
                if (stackTraceElement2.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement2.getMethodName().equals("resumeWith")) {
                    throw new AssertionError("Attempting to call Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                }
            }
        }
        int i9 = 1;
        while (i9 < stackTrace.length) {
            String className = stackTrace[i9].getClassName();
            if (!className.startsWith("io.opentelemetry.api.") && !className.startsWith("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider") && !className.startsWith("io.opentelemetry.context.")) {
                break;
            }
            i9++;
        }
        c0380g.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i9, stackTrace.length));
        return new C0382i(this, a7, c0380g);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C0381h c0381h;
        while (true) {
            c0381h = this.f4237f;
            Reference poll = c0381h.poll();
            if (poll == null) {
                break;
            } else {
                c0381h.f4281f.remove(poll);
            }
        }
        ConcurrentHashMap concurrentHashMap = c0381h.f4232i;
        List list = (List) concurrentHashMap.values().stream().filter(new I4.g(1)).collect(Collectors.toList());
        concurrentHashMap.clear();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            Level level = Level.SEVERE;
            Logger logger = f4236g;
            logger.log(level, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                logger.log(Level.SEVERE, "Scope leaked", (Throwable) d((C0380g) it.next()));
            }
        }
        throw d((C0380g) list.get(0));
    }

    @Override // f4.InterfaceC0375b
    public final C0374a current() {
        return EnumC0386m.f4244f.current();
    }
}
