package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0150c implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0154g f2541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0151d f2542b;

    public C0150c(C0151d c0151d, C0154g c0154g) {
        this.f2542b = c0151d;
        this.f2541a = c0154g;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0151d c0151d = this.f2542b;
        DialogInterface.OnClickListener onClickListener = c0151d.h;
        C0154g c0154g = this.f2541a;
        onClickListener.onClick(c0154g.f2553b, i);
        if (c0151d.i) {
            return;
        }
        c0154g.f2553b.dismiss();
    }
}
