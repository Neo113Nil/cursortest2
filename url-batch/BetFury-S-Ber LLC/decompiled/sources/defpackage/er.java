package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class er implements jg0 {
    public final Context f;
    public final String g;
    public final u2 h;
    public final wg0 i;
    public boolean j;

    public er(Context context, String str, u2 u2Var) {
        context.getClass();
        u2Var.getClass();
        this.f = context;
        this.g = str;
        this.h = u2Var;
        this.i = new wg0(new h2(2, this));
    }

    @Override // defpackage.jg0
    public final ig0 J() {
        return i().i(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.i.g != sl.o) {
            i().close();
        }
    }

    @Override // defpackage.jg0
    public final String getDatabaseName() {
        return this.g;
    }

    public final dr i() {
        return (dr) this.i.getValue();
    }

    @Override // defpackage.jg0
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.i.g != sl.o) {
            i().setWriteAheadLoggingEnabled(z);
        }
        this.j = z;
    }
}
