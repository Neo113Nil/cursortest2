package V;

import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final o f1112a;

    static {
        o fVar;
        try {
            fVar = new B.m(14, (WebViewProviderFactoryBoundaryInterface) i1.a.a(WebViewProviderFactoryBoundaryInterface.class, i1.a.k()));
        } catch (ClassNotFoundException unused) {
            fVar = new f();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
        f1112a = fVar;
    }
}
