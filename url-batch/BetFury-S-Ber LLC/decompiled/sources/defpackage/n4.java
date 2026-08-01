package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class n4 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((v4) obj).D();
                break;
            case 1:
                ((zz) obj).a();
                break;
            case 2:
                ((r40) obj).a();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
