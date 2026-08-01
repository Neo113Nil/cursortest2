package d1;

import android.window.OnBackInvokedCallback;
import g.a0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1303a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1304b;

    public /* synthetic */ k(int i, Object obj) {
        this.f1303a = i;
        this.f1304b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1303a) {
            case 0:
                ((j) this.f1304b).a();
                break;
            case 1:
                ((a0) this.f1304b).C();
                break;
            default:
                ((Runnable) this.f1304b).run();
                break;
        }
    }
}
