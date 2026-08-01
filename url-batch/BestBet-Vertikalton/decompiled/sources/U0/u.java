package U0;

import android.view.View;
import android.widget.AdapterView;
import l.C0216M;
import l.C0219P;
import l.E0;

/* loaded from: classes.dex */
public final class u implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1223b;

    public /* synthetic */ u(int i, Object obj) {
        this.f1222a = i;
        this.f1223b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f1222a) {
            case 0:
                w wVar = (w) this.f1223b;
                if (i < 0) {
                    E0 e02 = wVar.f1227e;
                    item = !e02.f3283z.isShowing() ? null : e02.f3263c.getSelectedItem();
                } else {
                    item = wVar.getAdapter().getItem(i);
                }
                w.a(wVar, item);
                AdapterView.OnItemClickListener onItemClickListener = wVar.getOnItemClickListener();
                E0 e03 = wVar.f1227e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = e03.f3283z.isShowing() ? e03.f3263c.getSelectedView() : null;
                        i = !e03.f3283z.isShowing() ? -1 : e03.f3263c.getSelectedItemPosition();
                        j2 = !e03.f3283z.isShowing() ? Long.MIN_VALUE : e03.f3263c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(e03.f3263c, view, i, j2);
                }
                e03.dismiss();
                break;
            default:
                C0216M c0216m = (C0216M) this.f1223b;
                c0216m.f3313G.setSelection(i);
                C0219P c0219p = c0216m.f3313G;
                if (c0219p.getOnItemClickListener() != null) {
                    c0219p.performItemClick(view, i, c0216m.f3311D.getItemId(i));
                }
                c0216m.dismiss();
                break;
        }
    }
}
