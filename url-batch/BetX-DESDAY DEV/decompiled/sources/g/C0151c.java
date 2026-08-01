package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0151c implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0155g f2545a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0152d f2546b;

    public C0151c(C0152d c0152d, C0155g c0155g) {
        this.f2546b = c0152d;
        this.f2545a = c0155g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0152d c0152d = this.f2546b;
        DialogInterface.OnClickListener onClickListener = c0152d.h;
        C0155g c0155g = this.f2545a;
        onClickListener.onClick(c0155g.f2557b, i);
        if (c0152d.i) {
            return;
        }
        c0155g.f2557b.dismiss();
    }
}
