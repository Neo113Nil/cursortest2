package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0126b;
import g.DialogInterfaceC0130f;

/* renamed from: l.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0198K implements InterfaceC0203P, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0130f f2819a;

    /* renamed from: b, reason: collision with root package name */
    public C0199L f2820b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2821c;
    public final /* synthetic */ C0204Q d;

    public DialogInterfaceOnClickListenerC0198K(C0204Q c0204q) {
        this.d = c0204q;
    }

    @Override // l.InterfaceC0203P
    public final boolean a() {
        DialogInterfaceC0130f dialogInterfaceC0130f = this.f2819a;
        if (dialogInterfaceC0130f != null) {
            return dialogInterfaceC0130f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0203P
    public final CharSequence b() {
        return this.f2821c;
    }

    @Override // l.InterfaceC0203P
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0203P
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0203P
    public final void dismiss() {
        DialogInterfaceC0130f dialogInterfaceC0130f = this.f2819a;
        if (dialogInterfaceC0130f != null) {
            dialogInterfaceC0130f.dismiss();
            this.f2819a = null;
        }
    }

    @Override // l.InterfaceC0203P
    public final void g(int i, int i2) {
        if (this.f2820b == null) {
            return;
        }
        C0204Q c0204q = this.d;
        H.j jVar = new H.j(c0204q.getPopupContext());
        CharSequence charSequence = this.f2821c;
        C0126b c0126b = (C0126b) jVar.f221b;
        if (charSequence != null) {
            c0126b.d = charSequence;
        }
        C0199L c0199l = this.f2820b;
        int selectedItemPosition = c0204q.getSelectedItemPosition();
        c0126b.f2365g = c0199l;
        c0126b.h = this;
        c0126b.f2366j = selectedItemPosition;
        c0126b.i = true;
        DialogInterfaceC0130f a2 = jVar.a();
        this.f2819a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2389f.f2371e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2819a.show();
    }

    @Override // l.InterfaceC0203P
    public final void h(CharSequence charSequence) {
        this.f2821c = charSequence;
    }

    @Override // l.InterfaceC0203P
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0203P
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0203P
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0203P
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0203P
    public final void n(ListAdapter listAdapter) {
        this.f2820b = (C0199L) listAdapter;
    }

    @Override // l.InterfaceC0203P
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0204Q c0204q = this.d;
        c0204q.setSelection(i);
        if (c0204q.getOnItemClickListener() != null) {
            c0204q.performItemClick(null, i, this.f2820b.getItemId(i));
        }
        dismiss();
    }
}
