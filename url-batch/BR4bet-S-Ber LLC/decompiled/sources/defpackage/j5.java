package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class j5 implements p5, DialogInterface.OnClickListener {
    public m2 f;
    public k5 g;
    public CharSequence h;
    public final /* synthetic */ q5 i;

    public j5(q5 q5Var) {
        this.i = q5Var;
    }

    @Override // defpackage.p5
    public final boolean b() {
        m2 m2Var = this.f;
        if (m2Var != null) {
            return m2Var.isShowing();
        }
        return false;
    }

    @Override // defpackage.p5
    public final int c() {
        return 0;
    }

    @Override // defpackage.p5
    public final void dismiss() {
        m2 m2Var = this.f;
        if (m2Var != null) {
            m2Var.dismiss();
            this.f = null;
        }
    }

    @Override // defpackage.p5
    public final Drawable e() {
        return null;
    }

    @Override // defpackage.p5
    public final void f(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // defpackage.p5
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.p5
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.p5
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.p5
    public final void m(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.p5
    public final void n(int i, int i2) {
        if (this.g == null) {
            return;
        }
        q5 q5Var = this.i;
        l2 l2Var = new l2(q5Var.getPopupContext());
        h2 h2Var = (h2) l2Var.g;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            h2Var.d = charSequence;
        }
        k5 k5Var = this.g;
        int selectedItemPosition = q5Var.getSelectedItemPosition();
        h2Var.l = k5Var;
        h2Var.m = this;
        h2Var.o = selectedItemPosition;
        h2Var.n = true;
        m2 b = l2Var.b();
        this.f = b;
        AlertController$RecycleListView alertController$RecycleListView = b.l.f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f.show();
    }

    @Override // defpackage.p5
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        q5 q5Var = this.i;
        q5Var.setSelection(i);
        if (q5Var.getOnItemClickListener() != null) {
            q5Var.performItemClick(null, i, this.g.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.p5
    public final CharSequence p() {
        return this.h;
    }

    @Override // defpackage.p5
    public final void q(ListAdapter listAdapter) {
        this.g = (k5) listAdapter;
    }
}
