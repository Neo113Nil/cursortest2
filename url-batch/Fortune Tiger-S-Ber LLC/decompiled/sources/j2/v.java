package j2;

import android.view.View;
import android.widget.AdapterView;
import k.c2;
import k.l0;
import k.o0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2385f;
    public final /* synthetic */ Object g;

    public /* synthetic */ v(int i4, Object obj) {
        this.f2385f = i4;
        this.g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j4) {
        CharSequence convertSelectionToString;
        switch (this.f2385f) {
            case 0:
                x xVar = (x) this.g;
                c2 c2Var = xVar.f2388j;
                convertSelectionToString = xVar.convertSelectionToString(i4 < 0 ? !c2Var.E.isShowing() ? null : c2Var.h.getSelectedItem() : xVar.getAdapter().getItem(i4));
                xVar.setText(convertSelectionToString, false);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                if (onItemClickListener != null) {
                    if (view == null || i4 < 0) {
                        view = !c2Var.E.isShowing() ? null : c2Var.h.getSelectedView();
                        i4 = !c2Var.E.isShowing() ? -1 : c2Var.h.getSelectedItemPosition();
                        j4 = !c2Var.E.isShowing() ? Long.MIN_VALUE : c2Var.h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c2Var.h, view, i4, j4);
                }
                c2Var.dismiss();
                break;
            default:
                l0 l0Var = (l0) this.g;
                o0 o0Var = l0Var.L;
                o0Var.setSelection(i4);
                if (o0Var.getOnItemClickListener() != null) {
                    o0Var.performItemClick(view, i4, l0Var.I.getItemId(i4));
                }
                l0Var.dismiss();
                break;
        }
    }
}
