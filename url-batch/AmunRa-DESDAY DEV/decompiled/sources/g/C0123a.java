package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0123a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0127e f2357a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0124b f2358b;

    public C0123a(C0124b c0124b, C0127e c0127e) {
        this.f2358b = c0124b;
        this.f2357a = c0127e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0124b c0124b = this.f2358b;
        DialogInterface.OnClickListener onClickListener = c0124b.h;
        C0127e c0127e = this.f2357a;
        onClickListener.onClick(c0127e.f2368b, i);
        if (c0124b.i) {
            return;
        }
        c0127e.f2368b.dismiss();
    }
}
