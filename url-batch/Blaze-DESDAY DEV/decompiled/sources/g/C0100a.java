package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0104e f2220a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0101b f2221b;

    public C0100a(C0101b c0101b, C0104e c0104e) {
        this.f2221b = c0101b;
        this.f2220a = c0104e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0101b c0101b = this.f2221b;
        DialogInterface.OnClickListener onClickListener = c0101b.h;
        C0104e c0104e = this.f2220a;
        onClickListener.onClick(c0104e.f2231b, i);
        if (c0101b.i) {
            return;
        }
        c0104e.f2231b.dismiss();
    }
}
