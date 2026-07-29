package b.a.b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: RouteException.java */
/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    private static final Method f1842a;

    /* renamed from: b, reason: collision with root package name */
    private IOException f1843b;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        f1842a = method;
    }

    public e(IOException iOException) {
        super(iOException);
        this.f1843b = iOException;
    }

    public IOException a() {
        return this.f1843b;
    }

    public void a(IOException iOException) {
        a(iOException, this.f1843b);
        this.f1843b = iOException;
    }

    private void a(IOException iOException, IOException iOException2) {
        if (f1842a != null) {
            try {
                f1842a.invoke(iOException, iOException2);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
