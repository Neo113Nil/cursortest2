package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0102a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0106e f2282a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0103b f2283b;

    public C0102a(C0103b c0103b, C0106e c0106e) {
        this.f2283b = c0103b;
        this.f2282a = c0106e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0103b c0103b = this.f2283b;
        DialogInterface.OnClickListener onClickListener = c0103b.h;
        C0106e c0106e = this.f2282a;
        onClickListener.onClick(c0106e.f2293b, i);
        if (c0103b.i) {
            return;
        }
        c0106e.f2293b.dismiss();
    }
}
