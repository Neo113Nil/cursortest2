package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import g.C0101b;
import g.DialogInterfaceC0105f;

/* renamed from: l.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC0191K implements InterfaceC0196P, DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public DialogInterfaceC0105f f2842a;

    /* renamed from: b, reason: collision with root package name */
    public C0192L f2843b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f2844c;
    public final /* synthetic */ C0197Q d;

    public DialogInterfaceOnClickListenerC0191K(C0197Q c0197q) {
        this.d = c0197q;
    }

    @Override // l.InterfaceC0196P
    public final boolean a() {
        DialogInterfaceC0105f dialogInterfaceC0105f = this.f2842a;
        if (dialogInterfaceC0105f != null) {
            return dialogInterfaceC0105f.isShowing();
        }
        return false;
    }

    @Override // l.InterfaceC0196P
    public final CharSequence b() {
        return this.f2844c;
    }

    @Override // l.InterfaceC0196P
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0196P
    public final int d() {
        return 0;
    }

    @Override // l.InterfaceC0196P
    public final void dismiss() {
        DialogInterfaceC0105f dialogInterfaceC0105f = this.f2842a;
        if (dialogInterfaceC0105f != null) {
            dialogInterfaceC0105f.dismiss();
            this.f2842a = null;
        }
    }

    @Override // l.InterfaceC0196P
    public final void g(int i, int i2) {
        if (this.f2843b == null) {
            return;
        }
        C0197Q c0197q = this.d;
        H.j jVar = new H.j(c0197q.getPopupContext());
        CharSequence charSequence = this.f2844c;
        C0101b c0101b = (C0101b) jVar.f293b;
        if (charSequence != null) {
            c0101b.d = charSequence;
        }
        C0192L c0192l = this.f2843b;
        int selectedItemPosition = c0197q.getSelectedItemPosition();
        c0101b.f2227g = c0192l;
        c0101b.h = this;
        c0101b.f2228j = selectedItemPosition;
        c0101b.i = true;
        DialogInterfaceC0105f a2 = jVar.a();
        this.f2842a = a2;
        AlertController$RecycleListView alertController$RecycleListView = a2.f2251f.f2233e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f2842a.show();
    }

    @Override // l.InterfaceC0196P
    public final void h(CharSequence charSequence) {
        this.f2844c = charSequence;
    }

    @Override // l.InterfaceC0196P
    public final int j() {
        return 0;
    }

    @Override // l.InterfaceC0196P
    public final void k(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0196P
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // l.InterfaceC0196P
    public final Drawable m() {
        return null;
    }

    @Override // l.InterfaceC0196P
    public final void n(ListAdapter listAdapter) {
        this.f2843b = (C0192L) listAdapter;
    }

    @Override // l.InterfaceC0196P
    public final void o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0197Q c0197q = this.d;
        c0197q.setSelection(i);
        if (c0197q.getOnItemClickListener() != null) {
            c0197q.performItemClick(null, i, this.f2843b.getItemId(i));
        }
        dismiss();
    }
}
