package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0124e f2637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0121b f2638b;

    public C0120a(C0121b c0121b, C0124e c0124e) {
        this.f2638b = c0121b;
        this.f2637a = c0124e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0121b c0121b = this.f2638b;
        DialogInterface.OnClickListener onClickListener = (DialogInterface.OnClickListener) c0121b.f2645j;
        C0124e c0124e = this.f2637a;
        onClickListener.onClick(c0124e.f2648b, i);
        if (c0121b.f2640b) {
            return;
        }
        c0124e.f2648b.dismiss();
    }
}
