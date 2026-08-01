package R0;

import android.view.View;
import android.widget.AdapterView;
import l.C0194M;
import l.C0197P;
import l.E0;

/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f743b;

    public /* synthetic */ u(int i, Object obj) {
        this.f742a = i;
        this.f743b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f742a) {
            case 0:
                w wVar = (w) this.f743b;
                if (i < 0) {
                    E0 e02 = wVar.f747e;
                    item = !e02.f2860z.isShowing() ? null : e02.f2840c.getSelectedItem();
                } else {
                    item = wVar.getAdapter().getItem(i);
                }
                w.a(wVar, item);
                AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
                E0 e03 = wVar.f747e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = e03.f2860z.isShowing() ? e03.f2840c.getSelectedView() : null;
                        i = !e03.f2860z.isShowing() ? -1 : e03.f2840c.getSelectedItemPosition();
                        j2 = !e03.f2860z.isShowing() ? Long.MIN_VALUE : e03.f2840c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(e03.f2840c, view, i, j2);
                }
                e03.dismiss();
                break;
            default:
                C0194M c0194m = (C0194M) this.f743b;
                c0194m.f2890G.setSelection(i);
                C0197P c0197p = c0194m.f2890G;
                if (c0197p.getOnItemClickListener() != null) {
                    c0197p.performItemClick(view, i, c0194m.f2888D.getItemId(i));
                }
                c0194m.dismiss();
                break;
        }
    }
}
