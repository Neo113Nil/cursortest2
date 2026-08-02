package b0;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: b0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0184o {

    /* renamed from: a, reason: collision with root package name */
    public static final q f2541a;

    static {
        q c0174e;
        try {
            c0174e = new r((WebViewProviderFactoryBoundaryInterface) C2.b.e(WebViewProviderFactoryBoundaryInterface.class, S0.a.i()));
        } catch (ClassNotFoundException unused) {
            c0174e = new C0174e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
        f2541a = c0174e;
    }
}
