package io.opentelemetry.sdk.internal;

import io.opentelemetry.sdk.internal.ExceptionAttributeResolver;
import java.io.PrintWriter;
import java.io.StringWriter;

/* loaded from: classes3.dex */
final class DefaultExceptionAttributeResolver implements ExceptionAttributeResolver {
    static final String ENABLE_JVM_STACKTRACE_PROPERTY = "otel.experimental.sdk.jvm_stacktrace";
    private final boolean jvmStacktraceEnabled;

    DefaultExceptionAttributeResolver(boolean z) {
        this.jvmStacktraceEnabled = z;
    }

    @Override // io.opentelemetry.sdk.internal.ExceptionAttributeResolver
    public void setExceptionAttributes(ExceptionAttributeResolver.AttributeSetter attributeSetter, Throwable th, int i) {
        String limitsAwareStacktrace;
        String canonicalName = th.getClass().getCanonicalName();
        if (canonicalName != null) {
            attributeSetter.setAttribute(ExceptionAttributeResolver.EXCEPTION_TYPE, canonicalName);
        }
        String message = th.getMessage();
        if (message != null) {
            attributeSetter.setAttribute(ExceptionAttributeResolver.EXCEPTION_MESSAGE, message);
        }
        if (this.jvmStacktraceEnabled) {
            limitsAwareStacktrace = jvmStacktrace(th);
        } else {
            limitsAwareStacktrace = limitsAwareStacktrace(th, i);
        }
        attributeSetter.setAttribute(ExceptionAttributeResolver.EXCEPTION_STACKTRACE, limitsAwareStacktrace);
    }

    private static String jvmStacktrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            th.printStackTrace(printWriter);
            printWriter.close();
            return stringWriter.toString();
        } catch (Throwable th2) {
            try {
                printWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static String limitsAwareStacktrace(Throwable th, int i) {
        return new StackTraceRenderer(th, i).render();
    }
}
