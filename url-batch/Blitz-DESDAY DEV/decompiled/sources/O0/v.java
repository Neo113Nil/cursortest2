package O0;

import android.view.View;
import android.widget.AdapterView;
import l.G0;
import l.N;
import l.Q;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f743a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f744b;

    public /* synthetic */ v(int i, Object obj) {
        this.f743a = i;
        this.f744b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f743a) {
            case 0:
                x xVar = (x) this.f744b;
                if (i < 0) {
                    G0 g02 = xVar.f748e;
                    item = !g02.f2884z.isShowing() ? null : g02.f2864c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                G0 g03 = xVar.f748e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = g03.f2884z.isShowing() ? g03.f2864c.getSelectedView() : null;
                        i = !g03.f2884z.isShowing() ? -1 : g03.f2864c.getSelectedItemPosition();
                        j2 = !g03.f2884z.isShowing() ? Long.MIN_VALUE : g03.f2864c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(g03.f2864c, view, i, j2);
                }
                g03.dismiss();
                break;
            default:
                N n2 = (N) this.f744b;
                n2.f2908G.setSelection(i);
                Q q2 = n2.f2908G;
                if (q2.getOnItemClickListener() != null) {
                    q2.performItemClick(view, i, n2.f2905D.getItemId(i));
                }
                n2.dismiss();
                break;
        }
    }
}
