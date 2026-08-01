package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class z4 implements f5, DialogInterface.OnClickListener {
    public f2 f;
    public a5 g;
    public CharSequence h;
    public final /* synthetic */ g5 i;

    public z4(g5 g5Var) {
        this.i = g5Var;
    }

    @Override // defpackage.f5
    public final boolean b() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            return f2Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.f5
    public final int c() {
        return 0;
    }

    @Override // defpackage.f5
    public final void dismiss() {
        f2 f2Var = this.f;
        if (f2Var != null) {
            f2Var.dismiss();
            this.f = null;
        }
    }

    @Override // defpackage.f5
    public final Drawable e() {
        return null;
    }

    @Override // defpackage.f5
    public final void f(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // defpackage.f5
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.f5
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.f5
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.f5
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.f5
    public final void n(int i, int i2) {
        if (this.g == null) {
            return;
        }
        g5 g5Var = this.i;
        or orVar = new or(g5Var.getPopupContext());
        b2 b2Var = (b2) orVar.g;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            b2Var.d = charSequence;
        }
        a5 a5Var = this.g;
        int selectedItemPosition = g5Var.getSelectedItemPosition();
        b2Var.g = a5Var;
        b2Var.h = this;
        b2Var.j = selectedItemPosition;
        b2Var.i = true;
        f2 e = orVar.e();
        this.f = e;
        AlertController$RecycleListView alertController$RecycleListView = e.l.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f.show();
    }

    @Override // defpackage.f5
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        g5 g5Var = this.i;
        g5Var.setSelection(i);
        if (g5Var.getOnItemClickListener() != null) {
            g5Var.performItemClick(null, i, this.g.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.f5
    public final CharSequence p() {
        return this.h;
    }

    @Override // defpackage.f5
    public final void q(ListAdapter listAdapter) {
        this.g = (a5) listAdapter;
    }
}
