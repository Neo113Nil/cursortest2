package b6;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.s;
import kotlin.random.Random;
import kotlin.text.g;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: b6.a$a, reason: collision with other inner class name */
    private static final class C0005a {
        public static final C0005a INSTANCE = new C0005a();
        public static final Method addSuppressed;
        public static final Method getSuppressed;

        static {
            Method method;
            Method method2;
            Object singleOrNull;
            Method[] throwableMethods = Throwable.class.getMethods();
            s.checkNotNullExpressionValue(throwableMethods, "throwableMethods");
            int length = throwableMethods.length;
            int i8 = 0;
            int i9 = 0;
            while (true) {
                method = null;
                if (i9 >= length) {
                    method2 = null;
                    break;
                }
                method2 = throwableMethods[i9];
                if (s.areEqual(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    s.checkNotNullExpressionValue(parameterTypes, "it.parameterTypes");
                    singleOrNull = ArraysKt___ArraysKt.singleOrNull(parameterTypes);
                    if (s.areEqual(singleOrNull, Throwable.class)) {
                        break;
                    }
                }
                i9++;
            }
            addSuppressed = method2;
            int length2 = throwableMethods.length;
            while (true) {
                if (i8 >= length2) {
                    break;
                }
                Method method3 = throwableMethods[i8];
                if (s.areEqual(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i8++;
            }
            getSuppressed = method;
        }

        private C0005a() {
        }
    }

    public void addSuppressed(Throwable cause, Throwable exception) {
        s.checkNotNullParameter(cause, "cause");
        s.checkNotNullParameter(exception, "exception");
        Method method = C0005a.addSuppressed;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public Random defaultPlatformRandom() {
        return new kotlin.random.b();
    }

    public g getMatchResultNamedGroup(MatchResult matchResult, String name) {
        s.checkNotNullParameter(matchResult, "matchResult");
        s.checkNotNullParameter(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public List<Throwable> getSuppressed(Throwable exception) {
        Object invoke;
        List<Throwable> asList;
        s.checkNotNullParameter(exception, "exception");
        Method method = C0005a.getSuppressed;
        return (method == null || (invoke = method.invoke(exception, new Object[0])) == null || (asList = k.asList((Throwable[]) invoke)) == null) ? CollectionsKt__CollectionsKt.emptyList() : asList;
    }
}
