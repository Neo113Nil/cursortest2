package X2;

import W2.C0299v;
import W2.InterfaceC0300w;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class b extends kotlin.coroutines.a implements InterfaceC0300w {
    private volatile Object _preHandler;

    public b() {
        super(C0299v.f4295d);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r4.getModifiers()) != false) goto L13;
     */
    @Override // W2.InterfaceC0300w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(Throwable th, CoroutineContext coroutineContext) {
        Method method;
        if (Build.VERSION.SDK_INT < 28) {
            Object obj = this._preHandler;
            if (obj != this) {
                method = (Method) obj;
            } else {
                try {
                    method = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                    if (Modifier.isPublic(method.getModifiers())) {
                    }
                } catch (Throwable unused) {
                }
                method = null;
                this._preHandler = method;
            }
            Object invoke = method != null ? method.invoke(null, null) : null;
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
        }
    }
}
