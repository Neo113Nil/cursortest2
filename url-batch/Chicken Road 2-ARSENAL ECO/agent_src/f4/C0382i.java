package f4;

import g4.C0397e;

/* renamed from: f4.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0382i implements InterfaceC0379f {

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0379f f4233f;

    /* renamed from: g, reason: collision with root package name */
    public final C0380g f4234g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C0383j f4235h;

    public C0382i(C0383j c0383j, InterfaceC0379f interfaceC0379f, C0380g c0380g) {
        this.f4235h = c0383j;
        this.f4233f = interfaceC0379f;
        this.f4234g = c0380g;
        c0383j.f4237f.c(this, c0380g);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f4234g.f4231i = true;
        C0381h c0381h = this.f4235h.f4237f;
        c0381h.getClass();
        C0397e b7 = c0381h.b(this);
        try {
            c0381h.f4281f.remove(b7);
            c0381h.d(b7);
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            for (int i7 = 0; i7 < stackTrace.length; i7++) {
                StackTraceElement stackTraceElement = stackTrace[i7];
                if (stackTraceElement.getClassName().equals(C0382i.class.getName()) && stackTraceElement.getMethodName().equals("close")) {
                    int i8 = i7 + 2;
                    int i9 = i7 + 1;
                    if (i9 < stackTrace.length) {
                        StackTraceElement stackTraceElement2 = stackTrace[i9];
                        if (stackTraceElement2.getClassName().equals("kotlin.jdk7.AutoCloseableKt") && stackTraceElement2.getMethodName().equals("closeFinally") && i8 < stackTrace.length) {
                            i8 = i7 + 3;
                        }
                    }
                    if (stackTrace[i8].getMethodName().equals("invokeSuspend")) {
                        i8++;
                    }
                    if (i8 < stackTrace.length) {
                        StackTraceElement stackTraceElement3 = stackTrace[i8];
                        if (stackTraceElement3.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement3.getMethodName().equals("resumeWith")) {
                            throw new AssertionError("Attempting to close a Scope created by Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (Thread.currentThread().getId() == this.f4234g.f4229g) {
                this.f4233f.close();
                return;
            }
            throw new IllegalStateException("Thread [" + this.f4234g.f4228f + "] opened scope, but thread [" + Thread.currentThread().getName() + "] closed it", this.f4234g);
        } catch (Throwable th) {
            c0381h.d(b7);
            throw th;
        }
    }

    public final String toString() {
        String message = this.f4234g.getMessage();
        return message != null ? message : super.toString();
    }
}
