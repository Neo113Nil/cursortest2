package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0099b;
import g.DialogInterfaceC0103f;

/* renamed from: m.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0193K implements InterfaceC0198P, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0103f f2956a;

    /* renamed from: b, reason: collision with root package name */
    public C0194L f2957b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2958c;
    public final /* synthetic */ C0199Q d;

    public DialogInterfaceOnClickListenerC0193K(C0199Q c0199q) {
        this.d = c0199q;
    }

    @Override // m.InterfaceC0198P
    public final boolean a() {
        DialogInterfaceC0103f dialogInterfaceC0103f = this.f2956a;
        if (dialogInterfaceC0103f != null) {
            return dialogInterfaceC0103f.isShowing();
        }
        return false;
    }

    @Override // m.InterfaceC0198P
    public final CharSequence b() {
        return this.f2958c;
    }

    @Override // m.InterfaceC0198P
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.InterfaceC0198P
    public final void dismiss() {
        DialogInterfaceC0103f dialogInterfaceC0103f = this.f2956a;
        if (dialogInterfaceC0103f != null) {
            dialogInterfaceC0103f.dismiss();
            this.f2956a = null;
        }
    }

    @Override // m.InterfaceC0198P
    public final int e() {
        return 0;
    }

    @Override // m.InterfaceC0198P
    public final void g(int i, int i2) {
        if (this.f2957b == null) {
            return;
        }
        C0199Q c0199q = this.d;
        I.i iVar = new I.i(c0199q.getPopupContext());
        CharSequence charSequence = this.f2958c;
        C0099b c0099b = (C0099b) iVar.f336b;
        if (charSequence != null) {
            c0099b.d = charSequence;
        }
        C0194L c0194l = this.f2957b;
        int selectedItemPosition = c0199q.getSelectedItemPosition();
        c0099b.f2305g = c0194l;
        c0099b.f2306h = this;
        c0099b.f2307j = selectedItemPosition;
        c0099b.i = true;
        DialogInterfaceC0103f a2 = iVar.a();
        this.f2956a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2331f.f2312e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2956a.show();
    }

    @Override // m.InterfaceC0198P
    public final void i(CharSequence charSequence) {
        this.f2958c = charSequence;
    }

    @Override // m.InterfaceC0198P
    public final int k() {
        return 0;
    }

    @Override // m.InterfaceC0198P
    public final void l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.InterfaceC0198P
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.InterfaceC0198P
    public final Drawable n() {
        return null;
    }

    @Override // m.InterfaceC0198P
    public final void o(ListAdapter listAdapter) {
        this.f2957b = (C0194L) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0199Q c0199q = this.d;
        c0199q.setSelection(i);
        if (c0199q.getOnItemClickListener() != null) {
            c0199q.performItemClick(null, i, this.f2957b.getItemId(i));
        }
        dismiss();
    }

    @Override // m.InterfaceC0198P
    public final void p(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
