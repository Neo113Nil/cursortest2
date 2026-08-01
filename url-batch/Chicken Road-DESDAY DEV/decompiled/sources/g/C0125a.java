package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0125a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0129e f2358a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0126b f2359b;

    public C0125a(C0126b c0126b, C0129e c0129e) {
        this.f2359b = c0126b;
        this.f2358a = c0129e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0126b c0126b = this.f2359b;
        DialogInterface.OnClickListener onClickListener = c0126b.h;
        C0129e c0129e = this.f2358a;
        onClickListener.onClick(c0129e.f2369b, i);
        if (c0126b.i) {
            return;
        }
        c0129e.f2369b.dismiss();
    }
}
