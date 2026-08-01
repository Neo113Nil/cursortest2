package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0152d;
import g.DialogInterfaceC0156h;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0243L implements InterfaceC0248Q, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0156h f3264a;

    /* renamed from: b, reason: collision with root package name */
    public C0244M f3265b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3266c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0249S f3267d;

    public DialogInterfaceOnClickListenerC0243L(C0249S c0249s) {
        this.f3267d = c0249s;
    }

    @Override // l.InterfaceC0248Q
    public final boolean a() {
        DialogInterfaceC0156h dialogInterfaceC0156h = this.f3264a;
        if (dialogInterfaceC0156h != null) {
            return dialogInterfaceC0156h.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0248Q
    public final CharSequence b() {
        return this.f3266c;
    }

    @Override // l.InterfaceC0248Q
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0248Q
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0248Q
    public final void dismiss() {
        DialogInterfaceC0156h dialogInterfaceC0156h = this.f3264a;
        if (dialogInterfaceC0156h != null) {
            dialogInterfaceC0156h.dismiss();
            this.f3264a = null;
        }
    }

    @Override // l.InterfaceC0248Q
    public final void g(int i, int i2) {
        if (this.f3265b == null) {
            return;
        }
        C0249S c0249s = this.f3267d;
        H.j jVar = new H.j(c0249s.getPopupContext());
        CharSequence charSequence = this.f3266c;
        C0152d c0152d = (C0152d) jVar.f241b;
        if (charSequence != null) {
            c0152d.f2550d = charSequence;
        }
        C0244M c0244m = this.f3265b;
        int selectedItemPosition = c0249s.getSelectedItemPosition();
        c0152d.f2553g = c0244m;
        c0152d.h = this;
        c0152d.f2554j = selectedItemPosition;
        c0152d.i = true;
        DialogInterfaceC0156h b2 = jVar.b();
        this.f3264a = b2;
        AlertController$RecycleListView alertController$RecycleListView = b2.f2579f.f2560e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f3264a.show();
    }

    @Override // l.InterfaceC0248Q
    public final void h(CharSequence charSequence) {
        this.f3266c = charSequence;
    }

    @Override // l.InterfaceC0248Q
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0248Q
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0248Q
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0248Q
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0248Q
    public final void n(ListAdapter listAdapter) {
        this.f3265b = (C0244M) listAdapter;
    }

    @Override // l.InterfaceC0248Q
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0249S c0249s = this.f3267d;
        c0249s.setSelection(i);
        if (c0249s.getOnItemClickListener() != null) {
            c0249s.performItemClick(null, i, this.f3265b.getItemId(i));
        }
        dismiss();
    }
}
