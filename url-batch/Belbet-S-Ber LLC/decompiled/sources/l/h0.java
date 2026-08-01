package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class h0 implements n0, DialogInterface.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public g.f f2458f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f2459g;
    public CharSequence h;
    public final /* synthetic */ o0 i;

    public h0(o0 o0Var) {
        this.i = o0Var;
    }

    @Override // l.n0
    public final int a() {
        return 0;
    }

    @Override // l.n0
    public final boolean b() {
        g.f fVar = this.f2458f;
        if (fVar != null) {
            return fVar.isShowing();
        }
        return false;
    }

    @Override // l.n0
    public final Drawable d() {
        return null;
    }

    @Override // l.n0
    public final void dismiss() {
        g.f fVar = this.f2458f;
        if (fVar != null) {
            fVar.dismiss();
            this.f2458f = null;
        }
    }

    @Override // l.n0
    public final void g(CharSequence charSequence) {
        this.h = charSequence;
    }

    @Override // l.n0
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.n0
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.n0
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // l.n0
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.n0
    public final void m(int i, int i4) {
        if (this.f2459g == null) {
            return;
        }
        o0 o0Var = this.i;
        a4.e0 e0Var = new a4.e0(o0Var.getPopupContext());
        g.b bVar = (g.b) e0Var.f168b;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        i0 i0Var = this.f2459g;
        int selectedItemPosition = o0Var.getSelectedItemPosition();
        bVar.f1477k = i0Var;
        bVar.f1478l = this;
        bVar.f1481o = selectedItemPosition;
        bVar.f1480n = true;
        g.f b2 = e0Var.b();
        this.f2458f = b2;
        AlertController$RecycleListView alertController$RecycleListView = b2.f1517l.f1496f;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i4);
        this.f2458f.show();
    }

    @Override // l.n0
    public final int n() {
        return 0;
    }

    @Override // l.n0
    public final CharSequence o() {
        return this.h;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        o0 o0Var = this.i;
        o0Var.setSelection(i);
        if (o0Var.getOnItemClickListener() != null) {
            o0Var.performItemClick(null, i, this.f2459g.getItemId(i));
        }
        dismiss();
    }

    @Override // l.n0
    public final void p(ListAdapter listAdapter) {
        this.f2459g = (i0) listAdapter;
    }
}
