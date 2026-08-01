package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class k0 implements q0, DialogInterface.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public g.g f2356f;

    /* renamed from: g, reason: collision with root package name */
    public l0 f2357g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f2358h;
    public final /* synthetic */ r0 i;

    public k0(r0 r0Var) {
        this.i = r0Var;
    }

    @Override // l.q0
    public final void a(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.q0
    public final boolean b() {
        g.g gVar = this.f2356f;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override // l.q0
    public final int d() {
        return 0;
    }

    @Override // l.q0
    public final void dismiss() {
        g.g gVar = this.f2356f;
        if (gVar != null) {
            gVar.dismiss();
            this.f2356f = null;
        }
    }

    @Override // l.q0
    public final void e(int i, int i4) {
        if (this.f2357g == null) {
            return;
        }
        r0 r0Var = this.i;
        g.f fVar = new g.f(r0Var.getPopupContext());
        g.b bVar = (g.b) fVar.f1632g;
        CharSequence charSequence = this.f2358h;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        l0 l0Var = this.f2357g;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        bVar.f1563g = l0Var;
        bVar.f1564h = this;
        bVar.f1565j = selectedItemPosition;
        bVar.i = true;
        g.g a2 = fVar.a();
        this.f2356f = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f1642l.f1610e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i4);
        this.f2356f.show();
    }

    @Override // l.q0
    public final int g() {
        return 0;
    }

    @Override // l.q0
    public final Drawable h() {
        return null;
    }

    @Override // l.q0
    public final CharSequence i() {
        return this.f2358h;
    }

    @Override // l.q0
    public final void l(CharSequence charSequence) {
        this.f2358h = charSequence;
    }

    @Override // l.q0
    public final void m(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.q0
    public final void n(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.q0
    public final void o(ListAdapter listAdapter) {
        this.f2357g = (l0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        r0 r0Var = this.i;
        r0Var.setSelection(i);
        if (r0Var.getOnItemClickListener() != null) {
            r0Var.performItemClick(null, i, this.f2357g.getItemId(i));
        }
        dismiss();
    }

    @Override // l.q0
    public final void p(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
