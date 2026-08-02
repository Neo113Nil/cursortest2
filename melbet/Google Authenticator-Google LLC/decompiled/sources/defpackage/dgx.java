package defpackage;

import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class dgx extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dgx(Thread thread, Throwable th) {
        super(r0);
        Object blocker = LockSupport.getBlocker(thread);
        Thread.State state = thread.getState();
        String valueOf = String.valueOf(thread);
        String concat = state == null ? "" : " in state ".concat(state.toString());
        String concat2 = blocker == null ? "" : " blocked on ".concat(blocker.toString());
        Thread b = b(blocker);
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf);
        sb.append(concat);
        sb.append(concat2);
        sb.append(b != null ? " (see cause for owner state)" : "");
        String sb2 = sb.toString();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        Thread b2 = b(LockSupport.getBlocker(thread));
        th = b2 != null ? a(b2, th) : th;
        if (th != null) {
            initCause(th);
        }
        setStackTrace(stackTrace);
    }

    public static dgx a(Thread thread, Throwable th) {
        String name = thread.getName();
        return name.startsWith("Lite") ? new dgw(thread, th) : name.startsWith("BG") ? new dgu(thread, th) : name.startsWith("Blocking") ? new dgv(thread, th) : new dgx(thread, th);
    }

    static Thread b(Object obj) {
        if (obj instanceof AbstractOwnableSynchronizer) {
            try {
                Method declaredMethod = AbstractOwnableSynchronizer.class.getDeclaredMethod("getExclusiveOwnerThread", null);
                declaredMethod.setAccessible(true);
                return (Thread) declaredMethod.invoke(obj, null);
            } catch (ClassCastException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        return null;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
