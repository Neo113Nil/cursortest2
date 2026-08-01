package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class w0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ w0(int i, Object obj) {
        this.f = i;
        this.g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        Message message2;
        Message message3;
        int i = this.f;
        Message message4 = null;
        message4 = null;
        Object obj = this.g;
        switch (i) {
            case 0:
                ((p1) obj).a();
                break;
            case 1:
                u2 u2Var = (u2) obj;
                if (view == u2Var.g && (message3 = u2Var.i) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == u2Var.j && (message2 = u2Var.l) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == u2Var.m && (message = u2Var.o) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                u2Var.C.obtainMessage(1, u2Var.b).sendToTarget();
                break;
            case 2:
                ct ctVar = (ct) obj;
                int i2 = ctVar.j;
                if (i2 == 2) {
                    ctVar.i(1);
                } else if (i2 == 1) {
                    ctVar.i(2);
                }
                ctVar.j(ctVar.getView());
                break;
            default:
                l60 l60Var = ((Toolbar) obj).Q;
                eu euVar = l60Var != null ? l60Var.g : null;
                if (euVar != null) {
                    euVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
