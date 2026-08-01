package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0128a implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0132e f2415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0129b f2416b;

    public C0128a(C0129b c0129b, C0132e c0132e) {
        this.f2416b = c0129b;
        this.f2415a = c0132e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0129b c0129b = this.f2416b;
        DialogInterface.OnClickListener onClickListener = c0129b.h;
        C0132e c0132e = this.f2415a;
        onClickListener.onClick(c0132e.f2426b, i);
        if (c0129b.i) {
            return;
        }
        c0132e.f2426b.dismiss();
    }
}
