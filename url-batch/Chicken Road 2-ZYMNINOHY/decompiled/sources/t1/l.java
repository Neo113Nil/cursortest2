package t1;

import e0.t;
import i2.AbstractC0457a;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final n f15405a;

    static {
        n eVar;
        try {
            eVar = new t((WebViewProviderFactoryBoundaryInterface) V3.b.j(WebViewProviderFactoryBoundaryInterface.class, AbstractC0457a.q()));
        } catch (ClassNotFoundException unused) {
            eVar = new e();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
        f15405a = eVar;
    }
}
