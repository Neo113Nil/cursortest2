package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0124a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0128e f2419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0125b f2420b;

    public C0124a(C0125b c0125b, C0128e c0128e) {
        this.f2420b = c0125b;
        this.f2419a = c0128e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0125b c0125b = this.f2420b;
        DialogInterface.OnClickListener onClickListener = c0125b.h;
        C0128e c0128e = this.f2419a;
        onClickListener.onClick(c0128e.f2430b, i);
        if (c0125b.i) {
            return;
        }
        c0128e.f2430b.dismiss();
    }
}
