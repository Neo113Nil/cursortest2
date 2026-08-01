package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0121b;
import g.DialogInterfaceC0125f;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0190J implements InterfaceC0195O, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0125f f2857a;

    /* renamed from: b, reason: collision with root package name */
    public C0191K f2858b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2859c;
    public final /* synthetic */ C0196P d;

    public DialogInterfaceOnClickListenerC0190J(C0196P c0196p) {
        this.d = c0196p;
    }

    @Override // l.InterfaceC0195O
    public final boolean a() {
        DialogInterfaceC0125f dialogInterfaceC0125f = this.f2857a;
        if (dialogInterfaceC0125f != null) {
            return dialogInterfaceC0125f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0195O
    public final CharSequence b() {
        return this.f2859c;
    }

    @Override // l.InterfaceC0195O
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0195O
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0195O
    public final void dismiss() {
        DialogInterfaceC0125f dialogInterfaceC0125f = this.f2857a;
        if (dialogInterfaceC0125f != null) {
            dialogInterfaceC0125f.dismiss();
            this.f2857a = null;
        }
    }

    @Override // l.InterfaceC0195O
    public final void g(int i, int i2) {
        if (this.f2858b == null) {
            return;
        }
        C0196P c0196p = this.d;
        H.j jVar = new H.j(c0196p.getPopupContext());
        CharSequence charSequence = this.f2859c;
        C0121b c0121b = (C0121b) jVar.f290b;
        if (charSequence != null) {
            c0121b.d = charSequence;
        }
        C0191K c0191k = this.f2858b;
        int selectedItemPosition = c0196p.getSelectedItemPosition();
        c0121b.f2405g = c0191k;
        c0121b.h = this;
        c0121b.f2406j = selectedItemPosition;
        c0121b.i = true;
        DialogInterfaceC0125f a2 = jVar.a();
        this.f2857a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2429f.f2411e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2857a.show();
    }

    @Override // l.InterfaceC0195O
    public final void h(CharSequence charSequence) {
        this.f2859c = charSequence;
    }

    @Override // l.InterfaceC0195O
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0195O
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0195O
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0195O
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0195O
    public final void n(ListAdapter listAdapter) {
        this.f2858b = (C0191K) listAdapter;
    }

    @Override // l.InterfaceC0195O
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0196P c0196p = this.d;
        c0196p.setSelection(i);
        if (c0196p.getOnItemClickListener() != null) {
            c0196p.performItemClick(null, i, this.f2858b.getItemId(i));
        }
        dismiss();
    }
}
