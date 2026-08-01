package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0118b;
import g.DialogInterfaceC0122f;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0215L implements InterfaceC0220Q, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0122f f2872a;

    /* renamed from: b, reason: collision with root package name */
    public C0216M f2873b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2874c;
    public final /* synthetic */ C0221S d;

    public DialogInterfaceOnClickListenerC0215L(C0221S c0221s) {
        this.d = c0221s;
    }

    @Override // l.InterfaceC0220Q
    public final boolean a() {
        DialogInterfaceC0122f dialogInterfaceC0122f = this.f2872a;
        if (dialogInterfaceC0122f != null) {
            return dialogInterfaceC0122f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0220Q
    public final CharSequence b() {
        return this.f2874c;
    }

    @Override // l.InterfaceC0220Q
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0220Q
    public final void dismiss() {
        DialogInterfaceC0122f dialogInterfaceC0122f = this.f2872a;
        if (dialogInterfaceC0122f != null) {
            dialogInterfaceC0122f.dismiss();
            this.f2872a = null;
        }
    }

    @Override // l.InterfaceC0220Q
    public final int e() {
        return 0;
    }

    @Override // l.InterfaceC0220Q
    public final void g(int i, int i2) {
        if (this.f2873b == null) {
            return;
        }
        C0221S c0221s = this.d;
        H.j jVar = new H.j(c0221s.getPopupContext());
        CharSequence charSequence = this.f2874c;
        C0118b c0118b = (C0118b) jVar.f228b;
        if (charSequence != null) {
            c0118b.d = charSequence;
        }
        C0216M c0216m = this.f2873b;
        int selectedItemPosition = c0221s.getSelectedItemPosition();
        c0118b.f2290g = c0216m;
        c0118b.h = this;
        c0118b.f2291j = selectedItemPosition;
        c0118b.i = true;
        DialogInterfaceC0122f a2 = jVar.a();
        this.f2872a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2314f.f2296e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2872a.show();
    }

    @Override // l.InterfaceC0220Q
    public final void h(CharSequence charSequence) {
        this.f2874c = charSequence;
    }

    @Override // l.InterfaceC0220Q
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0220Q
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0220Q
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0220Q
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0220Q
    public final void n(ListAdapter listAdapter) {
        this.f2873b = (C0216M) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0221S c0221s = this.d;
        c0221s.setSelection(i);
        if (c0221s.getOnItemClickListener() != null) {
            c0221s.performItemClick(null, i, this.f2873b.getItemId(i));
        }
        dismiss();
    }

    @Override // l.InterfaceC0220Q
    public final void p(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
