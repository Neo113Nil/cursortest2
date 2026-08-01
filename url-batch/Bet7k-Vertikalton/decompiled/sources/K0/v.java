package K0;

import android.view.View;
import android.widget.AdapterView;
import l.C0218O;
import l.C0221S;
import l.G0;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f574b;

    public /* synthetic */ v(int i, Object obj) {
        this.f573a = i;
        this.f574b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f573a) {
            case 0:
                x xVar = (x) this.f574b;
                if (i < 0) {
                    G0 g02 = xVar.f578e;
                    item = !g02.f2882z.isShowing() ? null : g02.f2862c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                G0 g03 = xVar.f578e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = g03.f2882z.isShowing() ? g03.f2862c.getSelectedView() : null;
                        i = !g03.f2882z.isShowing() ? -1 : g03.f2862c.getSelectedItemPosition();
                        j2 = !g03.f2882z.isShowing() ? Long.MIN_VALUE : g03.f2862c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(g03.f2862c, view, i, j2);
                }
                g03.dismiss();
                break;
            default:
                C0218O c0218o = (C0218O) this.f574b;
                c0218o.f2912G.setSelection(i);
                C0221S c0221s = c0218o.f2912G;
                if (c0221s.getOnItemClickListener() != null) {
                    c0221s.performItemClick(view, i, c0218o.f2910D.getItemId(i));
                }
                c0218o.dismiss();
                break;
        }
    }
}
