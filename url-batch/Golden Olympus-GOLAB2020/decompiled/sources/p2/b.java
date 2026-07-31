package p2;

import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.coroutines.CoroutineContext;
import o2.InterfaceC3314H;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b extends kotlin.coroutines.a implements InterfaceC3314H {

    @Nullable
    private volatile Object _preHandler;

    public b() {
        super(InterfaceC3314H.f42006M2);
        this._preHandler = this;
    }

    private final Method p() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // o2.InterfaceC3314H
    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        int i4 = Build.VERSION.SDK_INT;
        if (26 > i4 || i4 >= 28) {
            return;
        }
        Method p4 = p();
        Object invoke = p4 != null ? p4.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = invoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) invoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
