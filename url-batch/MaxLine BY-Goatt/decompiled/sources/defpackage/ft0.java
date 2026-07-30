package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ft0 implements br2 {
    public final Context m;
    public final String n;
    public final r5 o;
    public final y91 p;
    public boolean q;

    public ft0(Context context, String str, r5 r5Var) {
        context.getClass();
        r5Var.getClass();
        this.m = context;
        this.n = str;
        this.o = r5Var;
        this.p = ya1.b(new dj(4, this));
    }

    @Override // defpackage.br2
    public final zs0 I() {
        return ((et0) this.p.getValue()).b(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        y91 y91Var = this.p;
        if (y91Var.a()) {
            ((et0) y91Var.getValue()).close();
        }
    }

    @Override // defpackage.br2
    public final String getDatabaseName() {
        return this.n;
    }

    @Override // defpackage.br2
    public final void setWriteAheadLoggingEnabled(boolean z) {
        y91 y91Var = this.p;
        if (y91Var.a()) {
            ((et0) y91Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.q = z;
    }
}
