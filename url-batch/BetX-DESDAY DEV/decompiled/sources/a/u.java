package a;

import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0142C;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f936b;

    public /* synthetic */ u(int i, Object obj) {
        this.f935a = i;
        this.f936b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f935a) {
            case 0:
                W0.a aVar = (W0.a) this.f936b;
                X0.f.e(aVar, "$onBackInvoked");
                aVar.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0142C) this.f936b).E();
                break;
            default:
                ((Runnable) this.f936b).run();
                break;
        }
    }
}
