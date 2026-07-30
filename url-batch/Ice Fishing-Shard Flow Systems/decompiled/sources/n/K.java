package n;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import i.C0518e;
import i.DialogInterfaceC0522i;

/* loaded from: classes.dex */
public final class K implements Q, DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public DialogInterfaceC0522i f6668d;

    /* renamed from: e, reason: collision with root package name */
    public L f6669e;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f6670i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f6671l;

    public K(S s7) {
        this.f6671l = s7;
    }

    @Override // n.Q
    public final int a() {
        return 0;
    }

    @Override // n.Q
    public final boolean b() {
        DialogInterfaceC0522i dialogInterfaceC0522i = this.f6668d;
        if (dialogInterfaceC0522i != null) {
            return dialogInterfaceC0522i.isShowing();
        }
        return false;
    }

    @Override // n.Q
    public final Drawable d() {
        return null;
    }

    @Override // n.Q
    public final void dismiss() {
        DialogInterfaceC0522i dialogInterfaceC0522i = this.f6668d;
        if (dialogInterfaceC0522i != null) {
            dialogInterfaceC0522i.dismiss();
            this.f6668d = null;
        }
    }

    @Override // n.Q
    public final void g(CharSequence charSequence) {
        this.f6670i = charSequence;
    }

    @Override // n.Q
    public final void h(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // n.Q
    public final void i(int i2) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // n.Q
    public final void j(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // n.Q
    public final void k(int i2) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // n.Q
    public final void l(int i2, int i5) {
        if (this.f6669e == null) {
            return;
        }
        S s7 = this.f6671l;
        B6.p pVar = new B6.p(s7.getPopupContext());
        C0518e c0518e = (C0518e) pVar.f234c;
        CharSequence charSequence = this.f6670i;
        if (charSequence != null) {
            c0518e.f5420d = charSequence;
        }
        L l7 = this.f6669e;
        int selectedItemPosition = s7.getSelectedItemPosition();
        c0518e.f5428m = l7;
        c0518e.f5429n = this;
        c0518e.f5431p = selectedItemPosition;
        c0518e.f5430o = true;
        DialogInterfaceC0522i b7 = pVar.b();
        this.f6668d = b7;
        AlertController$RecycleListView alertController$RecycleListView = b7.f5466n.f5444f;
        I.d(alertController$RecycleListView, i2);
        I.c(alertController$RecycleListView, i5);
        this.f6668d.show();
    }

    @Override // n.Q
    public final int m() {
        return 0;
    }

    @Override // n.Q
    public final CharSequence o() {
        return this.f6670i;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        S s7 = this.f6671l;
        s7.setSelection(i2);
        if (s7.getOnItemClickListener() != null) {
            s7.performItemClick(null, i2, this.f6669e.getItemId(i2));
        }
        dismiss();
    }

    @Override // n.Q
    public final void p(ListAdapter listAdapter) {
        this.f6669e = (L) listAdapter;
    }
}
