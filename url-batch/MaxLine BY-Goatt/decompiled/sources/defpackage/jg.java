package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jg implements pg, DialogInterface.OnClickListener {
    public s5 m;
    public kg n;
    public CharSequence o;
    public final /* synthetic */ qg p;

    public jg(qg qgVar) {
        this.p = qgVar;
    }

    @Override // defpackage.pg
    public final boolean a() {
        s5 s5Var = this.m;
        if (s5Var != null) {
            return s5Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.pg
    public final int b() {
        return 0;
    }

    @Override // defpackage.pg
    public final Drawable d() {
        return null;
    }

    @Override // defpackage.pg
    public final void dismiss() {
        s5 s5Var = this.m;
        if (s5Var != null) {
            s5Var.dismiss();
            this.m = null;
        }
    }

    @Override // defpackage.pg
    public final void e(CharSequence charSequence) {
        this.o = charSequence;
    }

    @Override // defpackage.pg
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.pg
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.pg
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.pg
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.pg
    public final void m(int i, int i2) {
        if (this.n == null) {
            return;
        }
        qg qgVar = this.p;
        r5 r5Var = new r5(qgVar.getPopupContext());
        n5 n5Var = (n5) r5Var.b;
        CharSequence charSequence = this.o;
        if (charSequence != null) {
            n5Var.d = charSequence;
        }
        kg kgVar = this.n;
        int selectedItemPosition = qgVar.getSelectedItemPosition();
        n5Var.g = kgVar;
        n5Var.h = this;
        n5Var.j = selectedItemPosition;
        n5Var.i = true;
        s5 d = r5Var.d();
        this.m = d;
        AlertController$RecycleListView alertController$RecycleListView = d.s.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.m.show();
    }

    @Override // defpackage.pg
    public final int n() {
        return 0;
    }

    @Override // defpackage.pg
    public final CharSequence o() {
        return this.o;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        qg qgVar = this.p;
        qgVar.setSelection(i);
        if (qgVar.getOnItemClickListener() != null) {
            qgVar.performItemClick(null, i, this.n.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.pg
    public final void p(ListAdapter listAdapter) {
        this.n = (kg) listAdapter;
    }
}
