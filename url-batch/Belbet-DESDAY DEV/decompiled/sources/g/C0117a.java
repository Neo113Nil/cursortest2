package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0121e f2287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0118b f2288b;

    public C0117a(C0118b c0118b, C0121e c0121e) {
        this.f2288b = c0118b;
        this.f2287a = c0121e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0118b c0118b = this.f2288b;
        DialogInterface.OnClickListener onClickListener = c0118b.h;
        C0121e c0121e = this.f2287a;
        onClickListener.onClick(c0121e.f2298b, i);
        if (c0118b.i) {
            return;
        }
        c0121e.f2298b.dismiss();
    }
}
