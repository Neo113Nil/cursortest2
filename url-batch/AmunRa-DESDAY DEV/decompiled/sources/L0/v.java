package L0;

import android.view.View;
import android.widget.AdapterView;
import l.C0199O;
import l.C0202S;
import l.G0;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f582b;

    public /* synthetic */ v(int i, Object obj) {
        this.f581a = i;
        this.f582b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f581a) {
            case 0:
                x xVar = (x) this.f582b;
                if (i < 0) {
                    G0 g02 = xVar.f586e;
                    item = !g02.f2961z.isShowing() ? null : g02.f2941c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                G0 g03 = xVar.f586e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = g03.f2961z.isShowing() ? g03.f2941c.getSelectedView() : null;
                        i = !g03.f2961z.isShowing() ? -1 : g03.f2941c.getSelectedItemPosition();
                        j2 = !g03.f2961z.isShowing() ? Long.MIN_VALUE : g03.f2941c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(g03.f2941c, view, i, j2);
                }
                g03.dismiss();
                break;
            default:
                C0199O c0199o = (C0199O) this.f582b;
                c0199o.f2991G.setSelection(i);
                C0202S c0202s = c0199o.f2991G;
                if (c0202s.getOnItemClickListener() != null) {
                    c0202s.performItemClick(view, i, c0199o.f2989D.getItemId(i));
                }
                c0199o.dismiss();
                break;
        }
    }
}
