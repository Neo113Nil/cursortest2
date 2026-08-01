package P0;

import android.view.View;
import android.widget.AdapterView;
import l.C0193M;
import l.C0196P;
import l.E0;

/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f680a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f681b;

    public /* synthetic */ u(int i, Object obj) {
        this.f680a = i;
        this.f681b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f680a) {
            case 0:
                w wVar = (w) this.f681b;
                if (i < 0) {
                    E0 e02 = wVar.f685e;
                    item = !e02.f2845z.isShowing() ? null : e02.f2825c.getSelectedItem();
                } else {
                    item = wVar.getAdapter().getItem(i);
                }
                w.a(wVar, item);
                AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
                E0 e03 = wVar.f685e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = e03.f2845z.isShowing() ? e03.f2825c.getSelectedView() : null;
                        i = !e03.f2845z.isShowing() ? -1 : e03.f2825c.getSelectedItemPosition();
                        j2 = !e03.f2845z.isShowing() ? Long.MIN_VALUE : e03.f2825c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(e03.f2825c, view, i, j2);
                }
                e03.dismiss();
                break;
            default:
                C0193M c0193m = (C0193M) this.f681b;
                c0193m.f2875G.setSelection(i);
                C0196P c0196p = c0193m.f2875G;
                if (c0196p.getOnItemClickListener() != null) {
                    c0196p.performItemClick(view, i, c0193m.f2873D.getItemId(i));
                }
                c0193m.dismiss();
                break;
        }
    }
}
