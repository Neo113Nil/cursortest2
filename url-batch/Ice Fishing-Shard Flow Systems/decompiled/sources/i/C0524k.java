package i;

import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import e.InterfaceC0369b;

/* renamed from: i.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0524k implements InterfaceC0369b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppBrowserActivity f5469a;

    public C0524k(InAppBrowserActivity inAppBrowserActivity) {
        this.f5469a = inAppBrowserActivity;
    }

    @Override // e.InterfaceC0369b
    public final void a(d.o oVar) {
        InAppBrowserActivity inAppBrowserActivity = this.f5469a;
        AbstractC0529p delegate = inAppBrowserActivity.getDelegate();
        delegate.a();
        inAppBrowserActivity.getSavedStateRegistry().a("androidx:appcompat");
        delegate.e();
    }
}
