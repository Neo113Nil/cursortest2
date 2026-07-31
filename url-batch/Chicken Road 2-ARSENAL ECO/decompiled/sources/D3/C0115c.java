package D3;

import android.window.OnBackInvokedCallback;
import x5.InterfaceC0732a;

/* renamed from: D3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0115c implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f414b;

    public /* synthetic */ C0115c(int i7, Object obj) {
        this.f413a = i7;
        this.f414b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f413a) {
            case 0:
                ((AbstractActivityC0117e) this.f414b).onBackPressed();
                break;
            default:
                InterfaceC0732a onBackInvoked = (InterfaceC0732a) this.f414b;
                kotlin.jvm.internal.i.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
        }
    }
}
