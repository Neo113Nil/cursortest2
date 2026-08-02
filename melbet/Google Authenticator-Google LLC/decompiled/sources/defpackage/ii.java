package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ii implements DialogInterface.OnClickListener, in {
    dg a;
    final /* synthetic */ io b;
    private ListAdapter c;
    private CharSequence d;

    public ii(io ioVar) {
        this.b = ioVar;
    }

    @Override // defpackage.in
    public final int a() {
        return 0;
    }

    @Override // defpackage.in
    public final int b() {
        return 0;
    }

    @Override // defpackage.in
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.in
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.in
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.in
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.in
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.in
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.in
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.in
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.in
    public final void k(int i, int i2) {
        if (this.c == null) {
            return;
        }
        io ioVar = this.b;
        df dfVar = new df(ioVar.a);
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            dfVar.g(charSequence);
        }
        ListAdapter listAdapter = this.c;
        int selectedItemPosition = ioVar.getSelectedItemPosition();
        db dbVar = dfVar.a;
        dbVar.r = listAdapter;
        dbVar.s = this;
        dbVar.x = selectedItemPosition;
        dbVar.w = true;
        dg b = dfVar.b();
        this.a = b;
        ListView listView = b.a.f;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.in
    public final void m() {
        dg dgVar = this.a;
        if (dgVar != null) {
            dgVar.dismiss();
            this.a = null;
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        io ioVar = this.b;
        ioVar.setSelection(i);
        if (ioVar.getOnItemClickListener() != null) {
            ioVar.performItemClick(null, i, this.c.getItemId(i));
        }
        m();
    }

    @Override // defpackage.in
    public final boolean x() {
        dg dgVar = this.a;
        if (dgVar != null) {
            return dgVar.isShowing();
        }
        return false;
    }
}
