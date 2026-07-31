package c0;

import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public class m implements l {

    /* renamed from: a, reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f1741a;

    public m(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f1741a = webViewProviderFactoryBoundaryInterface;
    }

    @Override // c0.l
    public String[] a() {
        return this.f1741a.getSupportedFeatures();
    }

    @Override // c0.l
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) s6.a.a(WebkitToCompatConverterBoundaryInterface.class, this.f1741a.getWebkitToCompatConverter());
    }
}
