package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class r5 implements x5, DialogInterface.OnClickListener {
    public v2 f;
    public s5 g;
    public CharSequence h;
    public final /* synthetic */ y5 i;

    public r5(y5 y5Var) {
        this.i = y5Var;
    }

    @Override // defpackage.x5
    public final boolean b() {
        v2 v2Var = this.f;
        if (v2Var != null) {
            return v2Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.x5
    public final int c() {
        return 0;
    }

    @Override // defpackage.x5
    public final void dismiss() {
        v2 v2Var = this.f;
        if (v2Var != null) {
            v2Var.dismiss();
            this.f = null;
        }
    }

    @Override // defpackage.x5
    public final Drawable e() {
        return null;
    }

    @Override // defpackage.x5
    public final void f(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // defpackage.x5
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.x5
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.x5
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.x5
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.x5
    public final void n(int i, int i2) {
        if (this.g == null) {
            return;
        }
        y5 y5Var = this.i;
        u2 u2Var = new u2(y5Var.getPopupContext());
        q2 q2Var = (q2) u2Var.g;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            q2Var.d = charSequence;
        }
        s5 s5Var = this.g;
        int selectedItemPosition = y5Var.getSelectedItemPosition();
        q2Var.g = s5Var;
        q2Var.h = this;
        q2Var.j = selectedItemPosition;
        q2Var.i = true;
        v2 a = u2Var.a();
        this.f = a;
        AlertController$RecycleListView alertController$RecycleListView = a.l.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f.show();
    }

    @Override // defpackage.x5
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        y5 y5Var = this.i;
        y5Var.setSelection(i);
        if (y5Var.getOnItemClickListener() != null) {
            y5Var.performItemClick(null, i, this.g.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.x5
    public final CharSequence p() {
        return this.h;
    }

    @Override // defpackage.x5
    public final void q(ListAdapter listAdapter) {
        this.g = (s5) listAdapter;
    }
}
