package Q0;

import android.view.View;
import android.widget.AdapterView;
import n.C0258N;
import n.C0261Q;
import n.I0;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1097b;

    public /* synthetic */ v(int i, Object obj) {
        this.f1096a = i;
        this.f1097b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        switch (this.f1096a) {
            case 0:
                x xVar = (x) this.f1097b;
                if (i < 0) {
                    I0 i02 = xVar.e;
                    item = !i02.f3482z.isShowing() ? null : i02.f3462c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                I0 i03 = xVar.e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = i03.f3482z.isShowing() ? i03.f3462c.getSelectedView() : null;
                        i = !i03.f3482z.isShowing() ? -1 : i03.f3462c.getSelectedItemPosition();
                        j = !i03.f3482z.isShowing() ? Long.MIN_VALUE : i03.f3462c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(i03.f3462c, view, i, j);
                }
                i03.dismiss();
                break;
            default:
                C0258N c0258n = (C0258N) this.f1097b;
                c0258n.f3499G.setSelection(i);
                C0261Q c0261q = c0258n.f3499G;
                if (c0261q.getOnItemClickListener() != null) {
                    c0261q.performItemClick(view, i, c0258n.f3496D.getItemId(i));
                }
                c0258n.dismiss();
                break;
        }
    }
}
