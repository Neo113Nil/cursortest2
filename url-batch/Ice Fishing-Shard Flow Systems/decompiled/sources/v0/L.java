package v0;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes.dex */
public final class L extends u0.z {

    /* renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f8182c = new WeakHashMap();

    /* renamed from: a, reason: collision with root package name */
    public WebViewRendererBoundaryInterface f8183a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f8184b;

    @Override // u0.z
    public final boolean a() {
        C0958b c0958b = F.f8174y;
        if (c0958b.a()) {
            WebViewRenderProcess e7 = io.flutter.plugin.platform.r.e(this.f8184b.get());
            return e7 != null && AbstractC0968l.g(e7);
        }
        if (c0958b.b()) {
            return this.f8183a.terminate();
        }
        throw F.a();
    }
}
