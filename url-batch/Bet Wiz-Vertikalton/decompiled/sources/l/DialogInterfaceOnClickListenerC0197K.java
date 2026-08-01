package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0125b;
import g.DialogInterfaceC0129f;

/* renamed from: l.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0197K implements InterfaceC0202P, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0129f f2878a;

    /* renamed from: b, reason: collision with root package name */
    public C0198L f2879b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2880c;
    public final /* synthetic */ C0203Q d;

    public DialogInterfaceOnClickListenerC0197K(C0203Q c0203q) {
        this.d = c0203q;
    }

    @Override // l.InterfaceC0202P
    public final boolean a() {
        DialogInterfaceC0129f dialogInterfaceC0129f = this.f2878a;
        if (dialogInterfaceC0129f != null) {
            return dialogInterfaceC0129f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0202P
    public final CharSequence b() {
        return this.f2880c;
    }

    @Override // l.InterfaceC0202P
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0202P
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0202P
    public final void dismiss() {
        DialogInterfaceC0129f dialogInterfaceC0129f = this.f2878a;
        if (dialogInterfaceC0129f != null) {
            dialogInterfaceC0129f.dismiss();
            this.f2878a = null;
        }
    }

    @Override // l.InterfaceC0202P
    public final void f(int i, int i2) {
        if (this.f2879b == null) {
            return;
        }
        C0203Q c0203q = this.d;
        H.j jVar = new H.j(c0203q.getPopupContext());
        CharSequence charSequence = this.f2880c;
        C0125b c0125b = (C0125b) jVar.f274b;
        if (charSequence != null) {
            c0125b.d = charSequence;
        }
        C0198L c0198l = this.f2879b;
        int selectedItemPosition = c0203q.getSelectedItemPosition();
        c0125b.f2426g = c0198l;
        c0125b.h = this;
        c0125b.f2427j = selectedItemPosition;
        c0125b.i = true;
        DialogInterfaceC0129f a2 = jVar.a();
        this.f2878a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2450f.f2432e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2878a.show();
    }

    @Override // l.InterfaceC0202P
    public final void h(CharSequence charSequence) {
        this.f2880c = charSequence;
    }

    @Override // l.InterfaceC0202P
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0202P
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0202P
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0202P
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0202P
    public final void n(ListAdapter listAdapter) {
        this.f2879b = (C0198L) listAdapter;
    }

    @Override // l.InterfaceC0202P
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0203Q c0203q = this.d;
        c0203q.setSelection(i);
        if (c0203q.getOnItemClickListener() != null) {
            c0203q.performItemClick(null, i, this.f2879b.getItemId(i));
        }
        dismiss();
    }
}
