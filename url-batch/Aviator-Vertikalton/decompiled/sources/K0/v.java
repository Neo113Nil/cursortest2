package K0;

import android.view.View;
import android.widget.AdapterView;
import l.C0245P;
import l.H0;
import l.T;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f629b;

    public /* synthetic */ v(int i, Object obj) {
        this.f628a = i;
        this.f629b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f628a) {
            case 0:
                x xVar = (x) this.f629b;
                if (i < 0) {
                    H0 h02 = xVar.f633e;
                    item = !h02.f3252z.isShowing() ? null : h02.f3231c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                H0 h03 = xVar.f633e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = h03.f3252z.isShowing() ? h03.f3231c.getSelectedView() : null;
                        i = !h03.f3252z.isShowing() ? -1 : h03.f3231c.getSelectedItemPosition();
                        j2 = !h03.f3252z.isShowing() ? Long.MIN_VALUE : h03.f3231c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(h03.f3231c, view, i, j2);
                }
                h03.dismiss();
                break;
            default:
                C0245P c0245p = (C0245P) this.f629b;
                c0245p.f3284G.setSelection(i);
                T t2 = c0245p.f3284G;
                if (t2.getOnItemClickListener() != null) {
                    t2.performItemClick(view, i, c0245p.f3282D.getItemId(i));
                }
                c0245p.dismiss();
                break;
        }
    }
}
