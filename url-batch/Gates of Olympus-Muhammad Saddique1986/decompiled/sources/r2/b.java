package r2;

import V1.i;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import q2.C0832t;
import q2.InterfaceC0833u;

/* loaded from: classes.dex */
public final class b extends V1.a implements InterfaceC0833u {
    private volatile Object _preHandler;

    public b() {
        super(C0832t.f7928d);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L15;
     */
    @Override // q2.InterfaceC0833u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void y(i iVar, Throwable th) {
        Method method;
        int i3 = Build.VERSION.SDK_INT;
        if (26 > i3 || i3 >= 28) {
            return;
        }
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
