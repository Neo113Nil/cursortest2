package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0103b;
import g.DialogInterfaceC0107f;

/* loaded from: classes.dex */
public final class K implements P, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0107f f2891a;

    /* renamed from: b, reason: collision with root package name */
    public L f2892b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2893c;
    public final /* synthetic */ Q d;

    public K(Q q2) {
        this.d = q2;
    }

    @Override // l.P
    public final boolean a() {
        DialogInterfaceC0107f dialogInterfaceC0107f = this.f2891a;
        if (dialogInterfaceC0107f != null) {
            return dialogInterfaceC0107f.isShowing();
        }
        return false;
    }

    @Override // l.P
    public final CharSequence b() {
        return this.f2893c;
    }

    @Override // l.P
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.P
    public final int d() {
        return 0;
    }

    @Override // l.P
    public final void dismiss() {
        DialogInterfaceC0107f dialogInterfaceC0107f = this.f2891a;
        if (dialogInterfaceC0107f != null) {
            dialogInterfaceC0107f.dismiss();
            this.f2891a = null;
        }
    }

    @Override // l.P
    public final void g(int i, int i2) {
        if (this.f2892b == null) {
            return;
        }
        Q q2 = this.d;
        J.i iVar = new J.i(q2.getPopupContext());
        CharSequence charSequence = this.f2893c;
        C0103b c0103b = (C0103b) iVar.f374b;
        if (charSequence != null) {
            c0103b.d = charSequence;
        }
        L l2 = this.f2892b;
        int selectedItemPosition = q2.getSelectedItemPosition();
        c0103b.f2289g = l2;
        c0103b.h = this;
        c0103b.f2290j = selectedItemPosition;
        c0103b.i = true;
        DialogInterfaceC0107f d = iVar.d();
        this.f2891a = d;
        AlertController$RecycleListView alertController$RecycleListView = d.f2313f.f2295e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2891a.show();
    }

    @Override // l.P
    public final void h(CharSequence charSequence) {
        this.f2893c = charSequence;
    }

    @Override // l.P
    public final int j() {
        return 0;
    }

    @Override // l.P
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.P
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.P
    public final Drawable m() {
        return null;
    }

    @Override // l.P
    public final void n(ListAdapter listAdapter) {
        this.f2892b = (L) listAdapter;
    }

    @Override // l.P
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Q q2 = this.d;
        q2.setSelection(i);
        if (q2.getOnItemClickListener() != null) {
            q2.performItemClick(null, i, this.f2892b.getItemId(i));
        }
        dismiss();
    }
}
