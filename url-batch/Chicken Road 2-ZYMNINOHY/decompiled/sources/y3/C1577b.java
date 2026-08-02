package y3;

import android.os.Build;
import f3.AbstractC0423a;
import f3.InterfaceC0428f;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import x3.C1559t;

/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1577b extends AbstractC0423a implements InterfaceC0428f {
    private volatile Object _preHandler;

    public C1577b() {
        super(C1559t.f16058a);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r0.getModifiers()) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(Throwable th) {
        Method method;
        int i4 = Build.VERSION.SDK_INT;
        if (26 > i4 || i4 >= 28) {
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
