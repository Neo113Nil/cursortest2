package i;

import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import k0.C0593d;
import k0.InterfaceC0592c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0523j implements InterfaceC0592c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5467a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5468b;

    public C0523j(C0593d registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f5468b = new LinkedHashSet();
        registry.c("androidx.savedstate.Restarter", this);
    }

    @Override // k0.InterfaceC0592c
    public final Bundle a() {
        switch (this.f5467a) {
            case 0:
                Bundle bundle = new Bundle();
                ((InAppBrowserActivity) this.f5468b).getDelegate().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f5468b));
                return bundle2;
        }
    }

    public C0523j(InAppBrowserActivity inAppBrowserActivity) {
        this.f5468b = inAppBrowserActivity;
    }
}
