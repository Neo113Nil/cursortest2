package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0099b;
import g.DialogInterfaceC0103f;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0187J implements InterfaceC0192O, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0103f f2811a;

    /* renamed from: b, reason: collision with root package name */
    public C0188K f2812b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2813c;
    public final /* synthetic */ C0193P d;

    public DialogInterfaceOnClickListenerC0187J(C0193P c0193p) {
        this.d = c0193p;
    }

    @Override // l.InterfaceC0192O
    public final boolean a() {
        DialogInterfaceC0103f dialogInterfaceC0103f = this.f2811a;
        if (dialogInterfaceC0103f != null) {
            return dialogInterfaceC0103f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0192O
    public final CharSequence b() {
        return this.f2813c;
    }

    @Override // l.InterfaceC0192O
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0192O
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0192O
    public final void dismiss() {
        DialogInterfaceC0103f dialogInterfaceC0103f = this.f2811a;
        if (dialogInterfaceC0103f != null) {
            dialogInterfaceC0103f.dismiss();
            this.f2811a = null;
        }
    }

    @Override // l.InterfaceC0192O
    public final void g(int i, int i2) {
        if (this.f2812b == null) {
            return;
        }
        C0193P c0193p = this.d;
        H.j jVar = new H.j(c0193p.getPopupContext());
        CharSequence charSequence = this.f2813c;
        C0099b c0099b = (C0099b) jVar.f276b;
        if (charSequence != null) {
            c0099b.d = charSequence;
        }
        C0188K c0188k = this.f2812b;
        int selectedItemPosition = c0193p.getSelectedItemPosition();
        c0099b.f2187g = c0188k;
        c0099b.h = this;
        c0099b.f2188j = selectedItemPosition;
        c0099b.i = true;
        DialogInterfaceC0103f a2 = jVar.a();
        this.f2811a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2211f.f2193e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2811a.show();
    }

    @Override // l.InterfaceC0192O
    public final void h(CharSequence charSequence) {
        this.f2813c = charSequence;
    }

    @Override // l.InterfaceC0192O
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0192O
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0192O
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0192O
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0192O
    public final void n(ListAdapter listAdapter) {
        this.f2812b = (C0188K) listAdapter;
    }

    @Override // l.InterfaceC0192O
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0193P c0193p = this.d;
        c0193p.setSelection(i);
        if (c0193p.getOnItemClickListener() != null) {
            c0193p.performItemClick(null, i, this.f2812b.getItemId(i));
        }
        dismiss();
    }
}
