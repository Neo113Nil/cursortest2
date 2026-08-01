package t1;

import android.os.Build;
import b1.AbstractC0081a;
import b1.h;
import b1.j;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import s1.C0333p;

/* loaded from: classes.dex */
public final class b extends AbstractC0081a implements h {
    private volatile Object _preHandler;

    public b() {
        super(C0333p.f4060a);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void r(j jVar, Throwable th) {
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
