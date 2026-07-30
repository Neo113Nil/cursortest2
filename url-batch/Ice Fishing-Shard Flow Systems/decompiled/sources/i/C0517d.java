package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: i.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0517d implements AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0521h f5415d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0518e f5416e;

    public C0517d(C0518e c0518e, C0521h c0521h) {
        this.f5416e = c0518e;
        this.f5415d = c0521h;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
        C0518e c0518e = this.f5416e;
        DialogInterface.OnClickListener onClickListener = c0518e.f5429n;
        C0521h c0521h = this.f5415d;
        onClickListener.onClick(c0521h.f5440b, i2);
        if (c0518e.f5430o) {
            return;
        }
        c0521h.f5440b.dismiss();
    }
}
