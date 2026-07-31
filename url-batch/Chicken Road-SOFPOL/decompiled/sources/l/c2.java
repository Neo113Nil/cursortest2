package l;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final /* synthetic */ class c2 implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4225a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4226b;

    public /* synthetic */ c2(int i, Object obj) {
        this.f4225a = i;
        this.f4226b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f4225a) {
            case 0:
                ((Runnable) this.f4226b).run();
                break;
            default:
                ((s4.j) this.f4226b).a();
                break;
        }
    }
}
