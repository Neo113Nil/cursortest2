package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class v0 implements View.OnClickListener {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v0(int i, Object obj) {
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
                ((m1) obj).a();
                break;
            case 1:
                k2 k2Var = (k2) obj;
                if (view == k2Var.g && (message3 = k2Var.i) != null) {
                    message4 = Message.obtain(message3);
                } else if (view == k2Var.j && (message2 = k2Var.l) != null) {
                    message4 = Message.obtain(message2);
                } else if (view == k2Var.m && (message = k2Var.o) != null) {
                    message4 = Message.obtain(message);
                }
                if (message4 != null) {
                    message4.sendToTarget();
                }
                k2Var.C.obtainMessage(1, k2Var.b).sendToTarget();
                break;
            case 2:
                z8 z8Var = (z8) obj;
                if (z8Var.p && z8Var.isShowing()) {
                    if (!z8Var.r) {
                        TypedArray obtainStyledAttributes = z8Var.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                        z8Var.q = obtainStyledAttributes.getBoolean(0, true);
                        obtainStyledAttributes.recycle();
                        z8Var.r = true;
                    }
                    if (z8Var.q) {
                        z8Var.cancel();
                        break;
                    }
                }
                break;
            case 3:
                pv pvVar = (pv) obj;
                int i2 = pvVar.c0;
                if (i2 == 2) {
                    pvVar.L(1);
                } else if (i2 == 1) {
                    pvVar.L(2);
                }
                pvVar.M(pvVar.J);
                break;
            default:
                n90 n90Var = ((Toolbar) obj).Q;
                qw qwVar = n90Var != null ? n90Var.g : null;
                if (qwVar != null) {
                    qwVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
