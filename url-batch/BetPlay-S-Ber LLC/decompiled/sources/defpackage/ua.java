package defpackage;

import android.view.View;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ di b;

    public /* synthetic */ ua(di diVar, int i) {
        this.a = i;
        this.b = diVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        di diVar = this.b;
        switch (i) {
            case 0:
                xa xaVar = (xa) diVar;
                xaVar.s(xaVar.t());
                break;
            default:
                jg jgVar = (jg) diVar;
                jgVar.l = z;
                jgVar.p();
                if (!z) {
                    jgVar.s(false);
                    jgVar.m = false;
                    break;
                }
                break;
        }
    }
}
