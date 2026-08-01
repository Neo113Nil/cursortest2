package a;

import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0141C;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f934a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f935b;

    public /* synthetic */ u(int i, Object obj) {
        this.f934a = i;
        this.f935b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f934a) {
            case 0:
                W0.a aVar = (W0.a) this.f935b;
                X0.f.e(aVar, "$onBackInvoked");
                aVar.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0141C) this.f935b).E();
                break;
            default:
                ((Runnable) this.f935b).run();
                break;
        }
    }
}
