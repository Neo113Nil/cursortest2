package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class amw implements amn {
    public final Context a;
    public final String b;
    public final amk c;
    public final boolean d;
    public final boolean e;
    public boolean f;
    private final koi g = new kop(new nb(this, 11));

    public amw(Context context, String str, amk amkVar, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = amkVar;
        this.d = z;
        this.e = z2;
    }

    private final amv a() {
        return (amv) this.g.a();
    }

    @Override // defpackage.amn
    public final amj b() {
        return a().b();
    }

    @Override // defpackage.amn
    public final String c() {
        return this.b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.g.b()) {
            a().close();
        }
    }

    @Override // defpackage.amn
    public final void d(boolean z) {
        if (this.g.b()) {
            a().setWriteAheadLoggingEnabled(z);
        }
        this.f = z;
    }
}
