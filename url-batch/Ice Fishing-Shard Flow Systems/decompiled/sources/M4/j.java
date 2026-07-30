package M4;

/* loaded from: classes.dex */
public final class j implements f {

    /* renamed from: d, reason: collision with root package name */
    public final f f1754d;

    /* renamed from: e, reason: collision with root package name */
    public final g f1755e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ k f1756i;

    public j(k kVar, f fVar, g gVar) {
        this.f1756i = kVar;
        this.f1754d = fVar;
        this.f1755e = gVar;
        kVar.f1758d.c(this, gVar);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f1755e.f1751l = true;
        i iVar = this.f1756i.f1758d;
        iVar.getClass();
        N4.e b7 = iVar.b(this);
        try {
            iVar.f1836d.remove(b7);
            iVar.d(b7);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (int i2 = 0; i2 < stackTrace.length; i2++) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (stackTraceElement.getClassName().equals(j.class.getName()) && stackTraceElement.getMethodName().equals("close")) {
                    int i5 = i2 + 2;
                    int i7 = i2 + 1;
                    if (i7 < stackTrace.length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i7];
                        if (stackTraceElement2.getClassName().equals("kotlin.jdk7.AutoCloseableKt") && stackTraceElement2.getMethodName().equals("closeFinally") && i5 < stackTrace.length) {
                            i5 = i2 + 3;
                        }
                    }
                    if (stackTrace[i5].getMethodName().equals("invokeSuspend")) {
                        i5++;
                    }
                    if (i5 < stackTrace.length) {
                        StackTraceElement stackTraceElement3 = stackTrace[i5];
                        if (stackTraceElement3.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement3.getMethodName().equals("resumeWith")) {
                            throw new AssertionError("Attempting to close a Scope created by Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (Thread.currentThread().getId() == this.f1755e.f1749e) {
                this.f1754d.close();
                return;
            }
            throw new IllegalStateException("Thread [" + this.f1755e.f1748d + "] opened scope, but thread [" + Thread.currentThread().getName() + "] closed it", this.f1755e);
        } catch (Throwable th) {
            iVar.d(b7);
            throw th;
        }
    }

    public final String toString() {
        String message = this.f1755e.getMessage();
        return message != null ? message : super.toString();
    }
}
