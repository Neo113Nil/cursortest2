package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class q5 implements w5, DialogInterface.OnClickListener {
    public w2 f;
    public r5 g;
    public CharSequence h;
    public final /* synthetic */ x5 i;

    public q5(x5 x5Var) {
        this.i = x5Var;
    }

    @Override // defpackage.w5
    public final boolean b() {
        w2 w2Var = this.f;
        if (w2Var != null) {
            return w2Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.w5
    public final int c() {
        return 0;
    }

    @Override // defpackage.w5
    public final void dismiss() {
        w2 w2Var = this.f;
        if (w2Var != null) {
            w2Var.dismiss();
            this.f = null;
        }
    }

    @Override // defpackage.w5
    public final Drawable e() {
        return null;
    }

    @Override // defpackage.w5
    public final void f(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // defpackage.w5
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.w5
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.w5
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.w5
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.w5
    public final void n(int i, int i2) {
        if (this.g == null) {
            return;
        }
        x5 x5Var = this.i;
        v2 v2Var = new v2(x5Var.getPopupContext());
        r2 r2Var = (r2) v2Var.b;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            r2Var.d = charSequence;
        }
        r5 r5Var = this.g;
        int selectedItemPosition = x5Var.getSelectedItemPosition();
        r2Var.k = r5Var;
        r2Var.l = this;
        r2Var.n = selectedItemPosition;
        r2Var.m = true;
        w2 a = v2Var.a();
        this.f = a;
        AlertController$RecycleListView alertController$RecycleListView = a.f.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f.show();
    }

    @Override // defpackage.w5
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        x5 x5Var = this.i;
        x5Var.setSelection(i);
        if (x5Var.getOnItemClickListener() != null) {
            x5Var.performItemClick(null, i, this.g.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.w5
    public final CharSequence p() {
        return this.h;
    }

    @Override // defpackage.w5
    public final void q(ListAdapter listAdapter) {
        this.g = (r5) listAdapter;
    }
}
