package l0;

import android.content.Context;
import androidx.lifecycle.K;
import k0.InterfaceC0199a;
import k0.InterfaceC0200b;

/* loaded from: classes.dex */
public final class h implements InterfaceC0200b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3262a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3263b;

    /* renamed from: c, reason: collision with root package name */
    public final D.d f3264c;

    /* renamed from: d, reason: collision with root package name */
    public final W0.g f3265d;
    public boolean e;

    public h(Context context, String str, D.d dVar) {
        j1.h.e(dVar, "callback");
        this.f3262a = context;
        this.f3263b = str;
        this.f3264c = dVar;
        this.f3265d = new W0.g(new K(2, this));
    }

    public final g a() {
        return (g) this.f3265d.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3265d.f1342b != W0.h.f1344a) {
            a().close();
        }
    }

    public final InterfaceC0199a d() {
        return a().a(true);
    }
}
