package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0129b;
import g.DialogInterfaceC0133f;

/* renamed from: l.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0191J implements InterfaceC0196O, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0133f f2872a;

    /* renamed from: b, reason: collision with root package name */
    public C0192K f2873b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2874c;
    public final /* synthetic */ C0197P d;

    public DialogInterfaceOnClickListenerC0191J(C0197P c0197p) {
        this.d = c0197p;
    }

    @Override // l.InterfaceC0196O
    public final boolean a() {
        DialogInterfaceC0133f dialogInterfaceC0133f = this.f2872a;
        if (dialogInterfaceC0133f != null) {
            return dialogInterfaceC0133f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0196O
    public final CharSequence b() {
        return this.f2874c;
    }

    @Override // l.InterfaceC0196O
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0196O
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0196O
    public final void dismiss() {
        DialogInterfaceC0133f dialogInterfaceC0133f = this.f2872a;
        if (dialogInterfaceC0133f != null) {
            dialogInterfaceC0133f.dismiss();
            this.f2872a = null;
        }
    }

    @Override // l.InterfaceC0196O
    public final void g(int i, int i2) {
        if (this.f2873b == null) {
            return;
        }
        C0197P c0197p = this.d;
        H.j jVar = new H.j(c0197p.getPopupContext());
        CharSequence charSequence = this.f2874c;
        C0129b c0129b = (C0129b) jVar.f236b;
        if (charSequence != null) {
            c0129b.d = charSequence;
        }
        C0192K c0192k = this.f2873b;
        int selectedItemPosition = c0197p.getSelectedItemPosition();
        c0129b.f2422g = c0192k;
        c0129b.h = this;
        c0129b.f2423j = selectedItemPosition;
        c0129b.i = true;
        DialogInterfaceC0133f b2 = jVar.b();
        this.f2872a = b2;
        AlertController$RecycleListView alertController$RecycleListView = b2.f2446f.f2428e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2872a.show();
    }

    @Override // l.InterfaceC0196O
    public final void h(CharSequence charSequence) {
        this.f2874c = charSequence;
    }

    @Override // l.InterfaceC0196O
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0196O
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0196O
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0196O
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0196O
    public final void n(ListAdapter listAdapter) {
        this.f2873b = (C0192K) listAdapter;
    }

    @Override // l.InterfaceC0196O
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0197P c0197p = this.d;
        c0197p.setSelection(i);
        if (c0197p.getOnItemClickListener() != null) {
            c0197p.performItemClick(null, i, this.f2873b.getItemId(i));
        }
        dismiss();
    }
}
