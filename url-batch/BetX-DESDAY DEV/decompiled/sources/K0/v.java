package K0;

import android.view.View;
import android.widget.AdapterView;
import l.C0246O;
import l.C0249S;
import l.G0;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f630b;

    public /* synthetic */ v(int i, Object obj) {
        this.f629a = i;
        this.f630b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f629a) {
            case 0:
                x xVar = (x) this.f630b;
                if (i < 0) {
                    G0 g02 = xVar.f634e;
                    item = !g02.f3252z.isShowing() ? null : g02.f3231c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                G0 g03 = xVar.f634e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = g03.f3252z.isShowing() ? g03.f3231c.getSelectedView() : null;
                        i = !g03.f3252z.isShowing() ? -1 : g03.f3231c.getSelectedItemPosition();
                        j2 = !g03.f3252z.isShowing() ? Long.MIN_VALUE : g03.f3231c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(g03.f3231c, view, i, j2);
                }
                g03.dismiss();
                break;
            default:
                C0246O c0246o = (C0246O) this.f630b;
                c0246o.f3284G.setSelection(i);
                C0249S c0249s = c0246o.f3284G;
                if (c0249s.getOnItemClickListener() != null) {
                    c0249s.performItemClick(view, i, c0246o.f3282D.getItemId(i));
                }
                c0246o.dismiss();
                break;
        }
    }
}
