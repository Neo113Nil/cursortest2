package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class l4 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((t4) obj).C();
                break;
            case 1:
                ((gs) obj).handleBackInvoked();
                break;
            case 2:
                ((ew) obj).a();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
