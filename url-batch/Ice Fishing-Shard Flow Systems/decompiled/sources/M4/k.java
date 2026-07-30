package M4;

import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class k implements b, AutoCloseable {

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f1757e = Logger.getLogger(k.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final i f1758d;

    public k() {
        n nVar = n.f1765d;
        this.f1758d = new i(new ConcurrentHashMap());
    }

    public static AssertionError d(g gVar) {
        AssertionError assertionError = new AssertionError("Thread [" + gVar.f1748d + "] opened a scope of " + gVar.f1750i + " here:");
        assertionError.setStackTrace(gVar.getStackTrace());
        return assertionError;
    }

    @Override // M4.b
    public final f a(a aVar) {
        int i2;
        f a7 = n.f1765d.a(aVar);
        g gVar = new g(aVar);
        StackTraceElement[] stackTrace = gVar.getStackTrace();
        for (int i5 = 0; i5 < stackTrace.length; i5++) {
            StackTraceElement stackTraceElement = stackTrace[i5];
            if (stackTraceElement.getClassName().equals(a.class.getName()) && stackTraceElement.getMethodName().equals("makeCurrent") && (i2 = i5 + 2) < stackTrace.length) {
                StackTraceElement stackTraceElement2 = stackTrace[i2];
                if (stackTraceElement2.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement2.getMethodName().equals("resumeWith")) {
                    throw new AssertionError("Attempting to call Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                }
            }
        }
        int i7 = 1;
        while (i7 < stackTrace.length) {
            String className = stackTrace[i7].getClassName();
            if (!className.startsWith("io.opentelemetry.api.") && !className.startsWith("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider") && !className.startsWith("io.opentelemetry.context.")) {
                break;
            }
            i7++;
        }
        gVar.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7, stackTrace.length));
        return new j(this, a7, gVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        i iVar;
        while (true) {
            iVar = this.f1758d;
            Reference poll = iVar.poll();
            if (poll == null) {
                break;
            } else {
                iVar.f1836d.remove(poll);
            }
        }
        ConcurrentHashMap concurrentHashMap = iVar.f1753l;
        List list = (List) concurrentHashMap.values().stream().filter(new h(0)).collect(Collectors.toList());
        concurrentHashMap.clear();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            Level level = Level.SEVERE;
            Logger logger = f1757e;
            logger.log(level, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                logger.log(Level.SEVERE, "Scope leaked", (Throwable) d((g) it.next()));
            }
        }
        throw d((g) list.get(0));
    }

    @Override // M4.b
    public final a current() {
        return n.f1765d.current();
    }
}
