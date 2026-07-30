package i;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import l.AbstractC0646b;
import n.n1;

/* renamed from: i.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0516c implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5414e;

    public /* synthetic */ ViewOnClickListenerC0516c(int i2, Object obj) {
        this.f5413d = i2;
        this.f5414e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        switch (this.f5413d) {
            case 0:
                C0521h c0521h = (C0521h) this.f5414e;
                Message obtain = (view != c0521h.f5447i || (message3 = c0521h.f5448k) == null) ? (view != c0521h.f5449l || (message2 = c0521h.f5451n) == null) ? (view != c0521h.f5452o || (message = c0521h.f5454q) == null) ? null : Message.obtain(message) : Message.obtain(message2) : Message.obtain(message3);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                c0521h.f5437E.obtainMessage(1, c0521h.f5440b).sendToTarget();
                break;
            case 1:
                ((AbstractC0646b) this.f5414e).a();
                break;
            default:
                n1 n1Var = ((Toolbar) this.f5414e).f3326U;
                m.o oVar = n1Var == null ? null : n1Var.f6845e;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
