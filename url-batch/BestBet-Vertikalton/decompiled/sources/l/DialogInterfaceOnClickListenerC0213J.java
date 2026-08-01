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
public final class DialogInterfaceOnClickListenerC0213J implements InterfaceC0218O, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0125f f3295a;

    /* renamed from: b, reason: collision with root package name */
    public C0214K f3296b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3297c;
    public final /* synthetic */ C0219P d;

    public DialogInterfaceOnClickListenerC0213J(C0219P c0219p) {
        this.d = c0219p;
    }

    @Override // l.InterfaceC0218O
    public final boolean a() {
        DialogInterfaceC0125f dialogInterfaceC0125f = this.f3295a;
        if (dialogInterfaceC0125f != null) {
            return dialogInterfaceC0125f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0218O
    public final CharSequence b() {
        return this.f3297c;
    }

    @Override // l.InterfaceC0218O
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0218O
    public final void dismiss() {
        DialogInterfaceC0125f dialogInterfaceC0125f = this.f3295a;
        if (dialogInterfaceC0125f != null) {
            dialogInterfaceC0125f.dismiss();
            this.f3295a = null;
        }
    }

    @Override // l.InterfaceC0218O
    public final int e() {
        return 0;
    }

    @Override // l.InterfaceC0218O
    public final void g(int i, int i2) {
        if (this.f3296b == null) {
            return;
        }
        C0219P c0219p = this.d;
        C0.f fVar = new C0.f(c0219p.getPopupContext());
        CharSequence charSequence = this.f3297c;
        C0121b c0121b = (C0121b) fVar.f96b;
        if (charSequence != null) {
            c0121b.f2643f = charSequence;
        }
        C0214K c0214k = this.f3296b;
        int selectedItemPosition = c0219p.getSelectedItemPosition();
        c0121b.i = c0214k;
        c0121b.f2645j = this;
        c0121b.f2639a = selectedItemPosition;
        c0121b.f2640b = true;
        DialogInterfaceC0125f a2 = fVar.a();
        this.f3295a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2668f.f2650e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f3295a.show();
    }

    @Override // l.InterfaceC0218O
    public final void h(CharSequence charSequence) {
        this.f3297c = charSequence;
    }

    @Override // l.InterfaceC0218O
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0218O
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0218O
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0218O
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0218O
    public final void o(ListAdapter listAdapter) {
        this.f3296b = (C0214K) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0219P c0219p = this.d;
        c0219p.setSelection(i);
        if (c0219p.getOnItemClickListener() != null) {
            c0219p.performItemClick(null, i, this.f3296b.getItemId(i));
        }
        dismiss();
    }

    @Override // l.InterfaceC0218O
    public final void p(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
