package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class me implements OnBackInvokedCallback {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ me(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [fke, java.lang.Object] */
    public final void onBackInvoked() {
        int i = this.b;
        if (i == 0) {
            this.a.run();
            return;
        }
        if (i == 1) {
            ((dy) this.a).I();
            return;
        }
        if (i == 2) {
            this.a.run();
            return;
        }
        ?? r2 = this.a;
        if (i != 3) {
            r2.O();
        } else {
            ((ahh) r2).b();
        }
    }
}
