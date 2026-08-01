package defpackage;

import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final /* synthetic */ class lb implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qk b;

    public /* synthetic */ lb(qk qkVar, int i) {
        this.a = i;
        this.b = qkVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.a;
        qk qkVar = this.b;
        switch (i) {
            case 0:
                ob obVar = (ob) qkVar;
                obVar.s(obVar.t());
                break;
            default:
                si siVar = (si) qkVar;
                siVar.l = z;
                siVar.p();
                if (!z) {
                    siVar.s(false);
                    siVar.m = false;
                    break;
                }
                break;
        }
    }
}
