package E1;

import android.window.OnBackInvokedCallback;

/* renamed from: E1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0027c implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f335b;

    public /* synthetic */ C0027c(int i3, Object obj) {
        this.f334a = i3;
        this.f335b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f334a) {
            case 0:
                ((AbstractActivityC0029e) this.f335b).onBackPressed();
                break;
            default:
                l2.a onBackInvoked = (l2.a) this.f335b;
                kotlin.jvm.internal.j.e(onBackInvoked, "$onBackInvoked");
                onBackInvoked.invoke();
                break;
        }
    }
}
