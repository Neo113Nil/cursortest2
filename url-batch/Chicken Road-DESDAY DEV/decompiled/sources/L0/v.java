package L0;

import android.view.View;
import android.widget.AdapterView;
import l.C0201N;
import l.C0204Q;
import l.G0;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f594b;

    public /* synthetic */ v(int i, Object obj) {
        this.f593a = i;
        this.f594b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f593a) {
            case 0:
                x xVar = (x) this.f594b;
                if (i < 0) {
                    G0 g02 = xVar.f598e;
                    item = !g02.f2812z.isShowing() ? null : g02.f2792c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                G0 g03 = xVar.f598e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = g03.f2812z.isShowing() ? g03.f2792c.getSelectedView() : null;
                        i = !g03.f2812z.isShowing() ? -1 : g03.f2792c.getSelectedItemPosition();
                        j2 = !g03.f2812z.isShowing() ? Long.MIN_VALUE : g03.f2792c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(g03.f2792c, view, i, j2);
                }
                g03.dismiss();
                break;
            default:
                C0201N c0201n = (C0201N) this.f594b;
                c0201n.f2835G.setSelection(i);
                C0204Q c0204q = c0201n.f2835G;
                if (c0204q.getOnItemClickListener() != null) {
                    c0204q.performItemClick(view, i, c0201n.f2833D.getItemId(i));
                }
                c0201n.dismiss();
                break;
        }
    }
}
