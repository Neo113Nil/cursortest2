package h;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0128e f2768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0125b f2769b;

    public C0124a(C0125b c0125b, C0128e c0128e) {
        this.f2769b = c0125b;
        this.f2768a = c0128e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0125b c0125b = this.f2769b;
        DialogInterface.OnClickListener onClickListener = c0125b.f2776h;
        C0128e c0128e = this.f2768a;
        onClickListener.onClick(c0128e.f2779b, i);
        if (c0125b.i) {
            return;
        }
        c0128e.f2779b.dismiss();
    }
}
