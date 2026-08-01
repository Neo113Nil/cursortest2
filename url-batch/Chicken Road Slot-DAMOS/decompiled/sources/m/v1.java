package m;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6201a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6202b;

    public /* synthetic */ v1(int i3, Object obj) {
        this.f6201a = i3;
        this.f6202b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f6201a) {
            case 0:
                ((Runnable) this.f6202b).run();
                break;
            default:
                ((s4.j) this.f6202b).a();
                break;
        }
    }
}
