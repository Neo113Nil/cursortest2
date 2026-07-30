package v0;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final I f8177a;

    static {
        I pVar;
        try {
            pVar = new J(6, (WebViewProviderFactoryBoundaryInterface) V6.b.a(WebViewProviderFactoryBoundaryInterface.class, O6.g.F()));
        } catch (ClassNotFoundException unused) {
            pVar = new p();
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
        f8177a = pVar;
    }
}
