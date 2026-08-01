package L0;

import android.view.View;
import android.widget.AdapterView;
import l.C0200N;
import l.C0203Q;
import l.F0;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f646b;

    public /* synthetic */ v(int i, Object obj) {
        this.f645a = i;
        this.f646b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f645a) {
            case 0:
                x xVar = (x) this.f646b;
                if (i < 0) {
                    F0 f02 = xVar.f650e;
                    item = !f02.f2866z.isShowing() ? null : f02.f2846c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                F0 f03 = xVar.f650e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = f03.f2866z.isShowing() ? f03.f2846c.getSelectedView() : null;
                        i = !f03.f2866z.isShowing() ? -1 : f03.f2846c.getSelectedItemPosition();
                        j2 = !f03.f2866z.isShowing() ? Long.MIN_VALUE : f03.f2846c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(f03.f2846c, view, i, j2);
                }
                f03.dismiss();
                break;
            default:
                C0200N c0200n = (C0200N) this.f646b;
                c0200n.f2896G.setSelection(i);
                C0203Q c0203q = c0200n.f2896G;
                if (c0203q.getOnItemClickListener() != null) {
                    c0203q.performItemClick(view, i, c0200n.f2894D.getItemId(i));
                }
                c0200n.dismiss();
                break;
        }
    }
}
