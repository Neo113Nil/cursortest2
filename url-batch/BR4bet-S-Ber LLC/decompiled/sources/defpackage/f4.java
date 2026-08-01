package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class f4 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((n4) obj).C();
                break;
            case 1:
                ((uu) obj).a();
                break;
            case 2:
                ((az) obj).a();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
