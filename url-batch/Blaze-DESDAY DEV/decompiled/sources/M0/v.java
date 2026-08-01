package M0;

import android.view.View;
import android.widget.AdapterView;
import l.C0194N;
import l.C0197Q;
import l.F0;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f673a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f674b;

    public /* synthetic */ v(int i, Object obj) {
        this.f673a = i;
        this.f674b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f673a) {
            case 0:
                x xVar = (x) this.f674b;
                if (i < 0) {
                    F0 f02 = xVar.f678e;
                    item = !f02.f2830z.isShowing() ? null : f02.f2810c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                F0 f03 = xVar.f678e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = f03.f2830z.isShowing() ? f03.f2810c.getSelectedView() : null;
                        i = !f03.f2830z.isShowing() ? -1 : f03.f2810c.getSelectedItemPosition();
                        j2 = !f03.f2830z.isShowing() ? Long.MIN_VALUE : f03.f2810c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(f03.f2810c, view, i, j2);
                }
                f03.dismiss();
                break;
            default:
                C0194N c0194n = (C0194N) this.f674b;
                c0194n.f2860G.setSelection(i);
                C0197Q c0197q = c0194n.f2860G;
                if (c0197q.getOnItemClickListener() != null) {
                    c0197q.performItemClick(view, i, c0194n.f2858D.getItemId(i));
                }
                c0194n.dismiss();
                break;
        }
    }
}
