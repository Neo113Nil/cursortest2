package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0124e f2398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0121b f2399b;

    public C0120a(C0121b c0121b, C0124e c0124e) {
        this.f2399b = c0121b;
        this.f2398a = c0124e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0121b c0121b = this.f2399b;
        DialogInterface.OnClickListener onClickListener = c0121b.h;
        C0124e c0124e = this.f2398a;
        onClickListener.onClick(c0124e.f2409b, i);
        if (c0121b.i) {
            return;
        }
        c0124e.f2409b.dismiss();
    }
}
