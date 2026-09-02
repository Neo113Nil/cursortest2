package c1;

import android.window.OnBackInvokedCallback;
import g.c0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f783b;

    public /* synthetic */ k(int i, Object obj) {
        this.f782a = i;
        this.f783b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f782a) {
            case 0:
                ((j) this.f783b).a();
                break;
            case 1:
                ((c0) this.f783b).C();
                break;
            default:
                ((Runnable) this.f783b).run();
                break;
        }
    }
}
