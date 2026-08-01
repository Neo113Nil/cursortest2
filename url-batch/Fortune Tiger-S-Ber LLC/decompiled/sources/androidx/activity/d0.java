package androidx.activity;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f90b;

    public /* synthetic */ d0(int i4, Object obj) {
        this.f89a = i4;
        this.f90b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f89a) {
            case 0:
                ((c0) this.f90b).a();
                break;
            case 1:
                ((f.b0) this.f90b).C();
                break;
            default:
                ((Runnable) this.f90b).run();
                break;
        }
    }
}
