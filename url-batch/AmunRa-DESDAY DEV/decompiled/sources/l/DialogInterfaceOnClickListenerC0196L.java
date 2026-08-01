package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0124b;
import g.DialogInterfaceC0128f;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0196L implements InterfaceC0201Q, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0128f f2973a;

    /* renamed from: b, reason: collision with root package name */
    public C0197M f2974b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2975c;
    public final /* synthetic */ C0202S d;

    public DialogInterfaceOnClickListenerC0196L(C0202S c0202s) {
        this.d = c0202s;
    }

    @Override // l.InterfaceC0201Q
    public final boolean a() {
        DialogInterfaceC0128f dialogInterfaceC0128f = this.f2973a;
        if (dialogInterfaceC0128f != null) {
            return dialogInterfaceC0128f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0201Q
    public final CharSequence b() {
        return this.f2975c;
    }

    @Override // l.InterfaceC0201Q
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0201Q
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0201Q
    public final void dismiss() {
        DialogInterfaceC0128f dialogInterfaceC0128f = this.f2973a;
        if (dialogInterfaceC0128f != null) {
            dialogInterfaceC0128f.dismiss();
            this.f2973a = null;
        }
    }

    @Override // l.InterfaceC0201Q
    public final void g(int i, int i2) {
        if (this.f2974b == null) {
            return;
        }
        C0202S c0202s = this.d;
        H.j jVar = new H.j(c0202s.getPopupContext());
        CharSequence charSequence = this.f2975c;
        C0124b c0124b = (C0124b) jVar.f214b;
        if (charSequence != null) {
            c0124b.d = charSequence;
        }
        C0197M c0197m = this.f2974b;
        int selectedItemPosition = c0202s.getSelectedItemPosition();
        c0124b.f2364g = c0197m;
        c0124b.h = this;
        c0124b.f2365j = selectedItemPosition;
        c0124b.i = true;
        DialogInterfaceC0128f a2 = jVar.a();
        this.f2973a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2388f.f2370e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2973a.show();
    }

    @Override // l.InterfaceC0201Q
    public final void h(CharSequence charSequence) {
        this.f2975c = charSequence;
    }

    @Override // l.InterfaceC0201Q
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0201Q
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0201Q
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0201Q
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0201Q
    public final void n(ListAdapter listAdapter) {
        this.f2974b = (C0197M) listAdapter;
    }

    @Override // l.InterfaceC0201Q
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0202S c0202s = this.d;
        c0202s.setSelection(i);
        if (c0202s.getOnItemClickListener() != null) {
            c0202s.performItemClick(null, i, this.f2974b.getItemId(i));
        }
        dismiss();
    }
}
