package k;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class i0 implements n0, DialogInterface.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public f.g f2555f;
    public j0 g;
    public CharSequence h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0 f2556i;

    public i0(o0 o0Var) {
        this.f2556i = o0Var;
    }

    @Override // k.n0
    public final int a() {
        return 0;
    }

    @Override // k.n0
    public final boolean b() {
        f.g gVar = this.f2555f;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override // k.n0
    public final Drawable d() {
        return null;
    }

    @Override // k.n0
    public final void dismiss() {
        f.g gVar = this.f2555f;
        if (gVar != null) {
            gVar.dismiss();
            this.f2555f = null;
        }
    }

    @Override // k.n0
    public final void g(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // k.n0
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // k.n0
    public final void i(int i4) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // k.n0
    public final void j(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // k.n0
    public final void l(int i4) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // k.n0
    public final void m(int i4, int i5) {
        if (this.g == null) {
            return;
        }
        o0 o0Var = this.f2556i;
        f.f fVar = new f.f(o0Var.getPopupContext());
        f.b bVar = (f.b) fVar.g;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            bVar.f1536d = charSequence;
        }
        j0 j0Var = this.g;
        int selectedItemPosition = o0Var.getSelectedItemPosition();
        bVar.g = j0Var;
        bVar.h = this;
        bVar.f1540j = selectedItemPosition;
        bVar.f1539i = true;
        f.g a4 = fVar.a();
        this.f2555f = a4;
        AlertController$RecycleListView alertController$RecycleListView = a4.f1599k.f1574e;
        alertController$RecycleListView.setTextDirection(i4);
        alertController$RecycleListView.setTextAlignment(i5);
        this.f2555f.show();
    }

    @Override // k.n0
    public final int n() {
        return 0;
    }

    @Override // k.n0
    public final CharSequence o() {
        return this.h;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i4) {
        o0 o0Var = this.f2556i;
        o0Var.setSelection(i4);
        if (o0Var.getOnItemClickListener() != null) {
            o0Var.performItemClick(null, i4, this.g.getItemId(i4));
        }
        dismiss();
    }

    @Override // k.n0
    public final void p(ListAdapter listAdapter) {
        this.g = (j0) listAdapter;
    }
}
