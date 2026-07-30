package l6;

import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* renamed from: l6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4703j implements InterfaceC4695b, AutoCloseable {

    /* renamed from: u, reason: collision with root package name */
    public static final Logger f39068u = Logger.getLogger(C4703j.class.getName());

    /* renamed from: n, reason: collision with root package name */
    public final C4701h f39069n;

    public C4703j() {
        EnumC4706m enumC4706m = EnumC4706m.f39076n;
        this.f39069n = new C4701h(new ConcurrentHashMap());
    }

    public static AssertionError a(C4700g c4700g) {
        AssertionError assertionError = new AssertionError("Thread [" + c4700g.f39060n + "] opened a scope of " + c4700g.f39062v + " here:");
        assertionError.setStackTrace(c4700g.getStackTrace());
        return assertionError;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C4701h c4701h;
        while (true) {
            c4701h = this.f39069n;
            Reference poll = c4701h.poll();
            if (poll == null) {
                break;
            } else {
                c4701h.f39576n.remove(poll);
            }
        }
        ConcurrentHashMap concurrentHashMap = c4701h.f39064w;
        List list = (List) concurrentHashMap.values().stream().filter(new O6.g(1)).collect(Collectors.toList());
        concurrentHashMap.clear();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            Level level = Level.SEVERE;
            Logger logger = f39068u;
            logger.log(level, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                logger.log(Level.SEVERE, "Scope leaked", (Throwable) a((C4700g) it.next()));
            }
        }
        throw a((C4700g) list.get(0));
    }

    @Override // l6.InterfaceC4695b
    public final C4694a j() {
        return EnumC4706m.f39076n.j();
    }

    @Override // l6.InterfaceC4695b
    public final InterfaceC4699f k(C4694a c4694a) {
        int i;
        InterfaceC4699f k6 = EnumC4706m.f39076n.k(c4694a);
        C4700g c4700g = new C4700g(c4694a);
        StackTraceElement[] stackTrace = c4700g.getStackTrace();
        for (int i4 = 0; i4 < stackTrace.length; i4++) {
            StackTraceElement stackTraceElement = stackTrace[i4];
            if (stackTraceElement.getClassName().equals(C4694a.class.getName()) && stackTraceElement.getMethodName().equals("makeCurrent") && (i = i4 + 2) < stackTrace.length) {
                StackTraceElement stackTraceElement2 = stackTrace[i];
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
        c4700g.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i9, stackTrace.length));
        return new C4702i(this, k6, c4700g);
    }
}
