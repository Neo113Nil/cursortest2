package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final /* synthetic */ class v3 implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((d4) obj).D();
                break;
            case 1:
                ((tr) obj).a();
                break;
            case 2:
                ((xv) obj).a();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
