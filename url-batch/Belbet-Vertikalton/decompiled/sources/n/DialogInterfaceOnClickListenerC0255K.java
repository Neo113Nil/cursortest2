package n;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import h.C0125b;
import h.DialogInterfaceC0129f;

/* renamed from: n.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0255K implements InterfaceC0260P, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0129f f3483a;

    /* renamed from: b, reason: collision with root package name */
    public C0256L f3484b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3485c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0261Q f3486d;

    public DialogInterfaceOnClickListenerC0255K(C0261Q c0261q) {
        this.f3486d = c0261q;
    }

    @Override // n.InterfaceC0260P
    public final boolean a() {
        DialogInterfaceC0129f dialogInterfaceC0129f = this.f3483a;
        if (dialogInterfaceC0129f != null) {
            return dialogInterfaceC0129f.isShowing();
        }
        return false;
    }

    @Override // n.InterfaceC0260P
    public final CharSequence b() {
        return this.f3485c;
    }

    @Override // n.InterfaceC0260P
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // n.InterfaceC0260P
    public final int d() {
        return 0;
    }

    @Override // n.InterfaceC0260P
    public final void dismiss() {
        DialogInterfaceC0129f dialogInterfaceC0129f = this.f3483a;
        if (dialogInterfaceC0129f != null) {
            dialogInterfaceC0129f.dismiss();
            this.f3483a = null;
        }
    }

    @Override // n.InterfaceC0260P
    public final void f(int i, int i2) {
        if (this.f3484b == null) {
            return;
        }
        C0261Q c0261q = this.f3486d;
        D1.p pVar = new D1.p(c0261q.getPopupContext());
        CharSequence charSequence = this.f3485c;
        C0125b c0125b = (C0125b) pVar.f271b;
        if (charSequence != null) {
            c0125b.f2773d = charSequence;
        }
        C0256L c0256l = this.f3484b;
        int selectedItemPosition = c0261q.getSelectedItemPosition();
        c0125b.f2775g = c0256l;
        c0125b.f2776h = this;
        c0125b.j = selectedItemPosition;
        c0125b.i = true;
        DialogInterfaceC0129f a2 = pVar.a();
        this.f3483a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2798f.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f3483a.show();
    }

    @Override // n.InterfaceC0260P
    public final void g(CharSequence charSequence) {
        this.f3485c = charSequence;
    }

    @Override // n.InterfaceC0260P
    public final int i() {
        return 0;
    }

    @Override // n.InterfaceC0260P
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // n.InterfaceC0260P
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // n.InterfaceC0260P
    public final Drawable m() {
        return null;
    }

    @Override // n.InterfaceC0260P
    public final void o(ListAdapter listAdapter) {
        this.f3484b = (C0256L) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0261Q c0261q = this.f3486d;
        c0261q.setSelection(i);
        if (c0261q.getOnItemClickListener() != null) {
            c0261q.performItemClick(null, i, this.f3484b.getItemId(i));
        }
        dismiss();
    }

    @Override // n.InterfaceC0260P
    public final void p(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
