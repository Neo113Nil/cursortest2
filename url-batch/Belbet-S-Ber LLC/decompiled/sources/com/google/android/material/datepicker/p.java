package com.google.android.material.datepicker;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import l.v2;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class p implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1084f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1085g;

    public /* synthetic */ p(int i, Object obj) {
        this.f1084f = i;
        this.f1085g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f1084f) {
            case 0:
                q qVar = (q) this.f1085g;
                int i = qVar.d0;
                if (i == 2) {
                    qVar.J(1);
                } else if (i == 1) {
                    qVar.J(2);
                }
                qVar.K(qVar.J);
                break;
            case 1:
                g.e eVar = (g.e) this.f1085g;
                Message obtain = (view != eVar.i || (message3 = eVar.f1499k) == null) ? (view != eVar.f1500l || (message2 = eVar.f1502n) == null) ? (view != eVar.f1503o || (message = eVar.f1505q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                eVar.E.obtainMessage(1, eVar.f1493b).sendToTarget();
                break;
            case 2:
                ((j.a) this.f1085g).a();
                break;
            default:
                v2 v2Var = ((Toolbar) this.f1085g).Q;
                k.o oVar = v2Var == null ? null : v2Var.f2599g;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
