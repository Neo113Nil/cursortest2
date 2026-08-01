package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0151d;
import g.DialogInterfaceC0155h;

/* renamed from: l.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0242M implements InterfaceC0247S, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0155h f3264a;

    /* renamed from: b, reason: collision with root package name */
    public C0243N f3265b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f3266c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ T f3267d;

    public DialogInterfaceOnClickListenerC0242M(T t2) {
        this.f3267d = t2;
    }

    @Override // l.InterfaceC0247S
    public final boolean a() {
        DialogInterfaceC0155h dialogInterfaceC0155h = this.f3264a;
        if (dialogInterfaceC0155h != null) {
            return dialogInterfaceC0155h.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0247S
    public final CharSequence b() {
        return this.f3266c;
    }

    @Override // l.InterfaceC0247S
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0247S
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0247S
    public final void dismiss() {
        DialogInterfaceC0155h dialogInterfaceC0155h = this.f3264a;
        if (dialogInterfaceC0155h != null) {
            dialogInterfaceC0155h.dismiss();
            this.f3264a = null;
        }
    }

    @Override // l.InterfaceC0247S
    public final void g(int i, int i2) {
        if (this.f3265b == null) {
            return;
        }
        T t2 = this.f3267d;
        H.j jVar = new H.j(t2.getPopupContext());
        CharSequence charSequence = this.f3266c;
        C0151d c0151d = (C0151d) jVar.f242b;
        if (charSequence != null) {
            c0151d.f2546d = charSequence;
        }
        C0243N c0243n = this.f3265b;
        int selectedItemPosition = t2.getSelectedItemPosition();
        c0151d.f2549g = c0243n;
        c0151d.h = this;
        c0151d.f2550j = selectedItemPosition;
        c0151d.i = true;
        DialogInterfaceC0155h a2 = jVar.a();
        this.f3264a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2575f.f2556e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f3264a.show();
    }

    @Override // l.InterfaceC0247S
    public final void h(CharSequence charSequence) {
        this.f3266c = charSequence;
    }

    @Override // l.InterfaceC0247S
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0247S
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0247S
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0247S
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0247S
    public final void n(ListAdapter listAdapter) {
        this.f3265b = (C0243N) listAdapter;
    }

    @Override // l.InterfaceC0247S
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        T t2 = this.f3267d;
        t2.setSelection(i);
        if (t2.getOnItemClickListener() != null) {
            t2.performItemClick(null, i, this.f3265b.getItemId(i));
        }
        dismiss();
    }
}
