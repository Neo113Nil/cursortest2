package androidx.activity;

import android.window.OnBackInvokedCallback;
import h.LayoutInflaterFactory2C4535B;

/* loaded from: classes.dex */
public final /* synthetic */ class C implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4528a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4529b;

    public /* synthetic */ C(int i, Object obj) {
        this.f4528a = i;
        this.f4529b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f4528a) {
            case 0:
                ((B) this.f4529b).invoke();
                break;
            case 1:
                ((LayoutInflaterFactory2C4535B) this.f4529b).F();
                break;
            default:
                ((Runnable) this.f4529b).run();
                break;
        }
    }
}
