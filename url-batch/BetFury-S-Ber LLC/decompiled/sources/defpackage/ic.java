package defpackage;

import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class ic implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ en b;

    public /* synthetic */ ic(en enVar, int i) {
        this.a = i;
        this.b = enVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        en enVar = this.b;
        switch (i) {
            case 0:
                lc lcVar = (lc) enVar;
                lcVar.s(lcVar.t());
                break;
            default:
                dl dlVar = (dl) enVar;
                dlVar.l = z;
                dlVar.p();
                if (!z) {
                    dlVar.s(false);
                    dlVar.m = false;
                    break;
                }
                break;
        }
    }
}
