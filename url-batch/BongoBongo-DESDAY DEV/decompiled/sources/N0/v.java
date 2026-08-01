package N0;

import android.view.View;
import android.widget.AdapterView;
import m.C0196N;
import m.C0199Q;
import m.J0;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f733b;

    public /* synthetic */ v(int i, Object obj) {
        this.f732a = i;
        this.f733b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f732a) {
            case 0:
                x xVar = (x) this.f733b;
                if (i < 0) {
                    J0 j02 = xVar.f737e;
                    item = !j02.f2955z.isShowing() ? null : j02.f2934c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                J0 j03 = xVar.f737e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = j03.f2955z.isShowing() ? j03.f2934c.getSelectedView() : null;
                        i = !j03.f2955z.isShowing() ? -1 : j03.f2934c.getSelectedItemPosition();
                        j2 = !j03.f2955z.isShowing() ? Long.MIN_VALUE : j03.f2934c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(j03.f2934c, view, i, j2);
                }
                j03.dismiss();
                break;
            default:
                C0196N c0196n = (C0196N) this.f733b;
                c0196n.G.setSelection(i);
                C0199Q c0199q = c0196n.G;
                if (c0199q.getOnItemClickListener() != null) {
                    c0199q.performItemClick(view, i, c0196n.f2964D.getItemId(i));
                }
                c0196n.dismiss();
                break;
        }
    }
}
