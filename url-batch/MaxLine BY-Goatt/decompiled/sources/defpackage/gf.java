package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gf extends mi2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y53
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qf qfVar = ((ef) obj).n;
                qfVar.G.setAlpha(1.0f);
                qfVar.J.d(null);
                qfVar.J = null;
                break;
            case 1:
                qf qfVar2 = (qf) obj;
                qfVar2.G.setAlpha(1.0f);
                qfVar2.J.d(null);
                qfVar2.J = null;
                break;
            default:
                qf qfVar3 = (qf) ((t21) obj).o;
                qfVar3.G.setVisibility(8);
                PopupWindow popupWindow = qfVar3.H;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (qfVar3.G.getParent() instanceof View) {
                    View view = (View) qfVar3.G.getParent();
                    WeakHashMap weakHashMap = e53.a;
                    view.requestApplyInsets();
                }
                qfVar3.G.e();
                qfVar3.J.d(null);
                qfVar3.J = null;
                ViewGroup viewGroup = qfVar3.M;
                WeakHashMap weakHashMap2 = e53.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.mi2, defpackage.y53
    public void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ef) obj).n.G.setVisibility(0);
                break;
            case 1:
                qf qfVar = (qf) obj;
                qfVar.G.setVisibility(0);
                if (qfVar.G.getParent() instanceof View) {
                    View view = (View) qfVar.G.getParent();
                    WeakHashMap weakHashMap = e53.a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }
}
