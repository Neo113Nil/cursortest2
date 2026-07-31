package c0;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* loaded from: classes.dex */
public class h extends b0.d {

    /* renamed from: a, reason: collision with root package name */
    private WebMessagePort f1709a;

    /* renamed from: b, reason: collision with root package name */
    private WebMessagePortBoundaryInterface f1710b;

    public h(WebMessagePort webMessagePort) {
        this.f1709a = webMessagePort;
    }

    public static WebMessagePort[] b(b0.d[] dVarArr) {
        if (dVarArr == null) {
            return null;
        }
        int length = dVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i7 = 0; i7 < length; i7++) {
            webMessagePortArr[i7] = dVarArr[i7].a();
        }
        return webMessagePortArr;
    }

    public static b0.c c(WebMessage webMessage) {
        return b.d(webMessage);
    }

    private WebMessagePort d() {
        if (this.f1709a == null) {
            this.f1709a = k.c().c(Proxy.getInvocationHandler(this.f1710b));
        }
        return this.f1709a;
    }

    public static b0.d[] e(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        b0.d[] dVarArr = new b0.d[webMessagePortArr.length];
        for (int i7 = 0; i7 < webMessagePortArr.length; i7++) {
            dVarArr[i7] = new h(webMessagePortArr[i7]);
        }
        return dVarArr;
    }

    @Override // b0.d
    public WebMessagePort a() {
        return d();
    }
}
