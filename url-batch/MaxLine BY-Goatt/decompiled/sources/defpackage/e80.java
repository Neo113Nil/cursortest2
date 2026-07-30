package defpackage;

import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e80 implements hx0 {
    public final /* synthetic */ int a;
    public final View b;

    public /* synthetic */ e80(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.hx0
    public final void a() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                view.performHapticFeedback(9);
                break;
            default:
                ((t7) view).performHapticFeedback(9);
                break;
        }
    }
}
