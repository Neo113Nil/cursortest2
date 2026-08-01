package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0118a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0122e f2289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0119b f2290b;

    public C0118a(C0119b c0119b, C0122e c0122e) {
        this.f2290b = c0119b;
        this.f2289a = c0122e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0119b c0119b = this.f2290b;
        DialogInterface.OnClickListener onClickListener = c0119b.h;
        C0122e c0122e = this.f2289a;
        onClickListener.onClick(c0122e.f2300b, i);
        if (c0119b.i) {
            return;
        }
        c0122e.f2300b.dismiss();
    }
}
