package l0;

import android.content.Context;
import androidx.lifecycle.K;
import k0.InterfaceC0203a;

/* renamed from: l0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281h implements InterfaceC0203a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3524a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3525b;

    /* renamed from: c, reason: collision with root package name */
    public final B.d f3526c;
    public final X0.f d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3527e;

    public C0281h(Context context, String str, B.d dVar) {
        k1.e.e(dVar, "callback");
        this.f3524a = context;
        this.f3525b = str;
        this.f3526c = dVar;
        this.d = new X0.f(new K(2, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d.f1274b != X0.g.f1276b) {
            ((C0280g) this.d.a()).close();
        }
    }

    @Override // k0.InterfaceC0203a
    public final C0276c m() {
        return ((C0280g) this.d.a()).a(true);
    }

    @Override // k0.InterfaceC0203a
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        if (this.d.f1274b != X0.g.f1276b) {
            C0280g c0280g = (C0280g) this.d.a();
            k1.e.e(c0280g, "sQLiteOpenHelper");
            c0280g.setWriteAheadLoggingEnabled(z2);
        }
        this.f3527e = z2;
    }
}
