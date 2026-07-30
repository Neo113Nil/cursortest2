package defpackage;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class m3 extends S9EYkSpbGuxq implements ku {
    private volatile Object _preHandler;

    public m3() {
        super(jx1.x50lh2ztY7Y5);
        this._preHandler = this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x002c, code lost:
    
        if (java.lang.reflect.Modifier.isStatic(r3.getModifiers()) != false) goto L15;
     */
    @Override // defpackage.ku
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ZbWwgt3aGe7A(hu huVar, Throwable th) {
        Method method;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
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
