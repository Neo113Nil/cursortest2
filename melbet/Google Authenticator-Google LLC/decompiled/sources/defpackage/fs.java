package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class fs implements gp {
    protected final Context a;
    public Context b;
    public gd c;
    public final LayoutInflater d;
    public go e;
    public gr f;
    public int g;

    public fs(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    @Override // defpackage.gp
    public final int a() {
        return this.g;
    }

    public View b(gf gfVar, View view, ViewGroup viewGroup) {
        throw null;
    }

    @Override // defpackage.gp
    public void c(Context context, gd gdVar) {
        throw null;
    }

    @Override // defpackage.gp
    public void d(gd gdVar, boolean z) {
        throw null;
    }

    @Override // defpackage.gp
    public final void e(go goVar) {
        throw null;
    }

    @Override // defpackage.gp
    public boolean f() {
        throw null;
    }

    @Override // defpackage.gp
    public boolean g(gw gwVar) {
        throw null;
    }

    @Override // defpackage.gp
    public final boolean h(gf gfVar) {
        return false;
    }

    @Override // defpackage.gp
    public final boolean i(gf gfVar) {
        return false;
    }

    @Override // defpackage.gp
    public void j() {
        throw null;
    }
}
