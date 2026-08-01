package a;

import android.window.OnBackInvokedCallback;
import g.LayoutInflaterFactory2C0115A;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1118b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1117a = i;
        this.f1118b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1117a) {
            case 0:
                Y0.a aVar = (Y0.a) this.f1118b;
                Z0.d.e(aVar, "$onBackInvoked");
                aVar.a();
                break;
            case 1:
                ((LayoutInflaterFactory2C0115A) this.f1118b).C();
                break;
            default:
                ((Runnable) this.f1118b).run();
                break;
        }
    }
}
