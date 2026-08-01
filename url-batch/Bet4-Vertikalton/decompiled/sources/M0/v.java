package M0;

import android.view.View;
import android.widget.AdapterView;
import l.C0190M;
import l.C0193P;
import l.F0;

/* loaded from: classes.dex */
public final class v implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f657b;

    public /* synthetic */ v(int i, Object obj) {
        this.f656a = i;
        this.f657b = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f656a) {
            case 0:
                x xVar = (x) this.f657b;
                if (i < 0) {
                    F0 f02 = xVar.f661e;
                    item = !f02.f2804z.isShowing() ? null : f02.f2784c.getSelectedItem();
                } else {
                    item = xVar.getAdapter().getItem(i);
                }
                x.a(xVar, item);
                AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
                F0 f03 = xVar.f661e;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = f03.f2804z.isShowing() ? f03.f2784c.getSelectedView() : null;
                        i = !f03.f2804z.isShowing() ? -1 : f03.f2784c.getSelectedItemPosition();
                        j2 = !f03.f2804z.isShowing() ? Long.MIN_VALUE : f03.f2784c.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(f03.f2784c, view, i, j2);
                }
                f03.dismiss();
                break;
            default:
                C0190M c0190m = (C0190M) this.f657b;
                c0190m.f2827G.setSelection(i);
                C0193P c0193p = c0190m.f2827G;
                if (c0193p.getOnItemClickListener() != null) {
                    c0193p.performItemClick(view, i, c0190m.f2825D.getItemId(i));
                }
                c0190m.dismiss();
                break;
        }
    }
}
