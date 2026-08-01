package j0;

import android.content.Context;
import androidx.lifecycle.K;
import i0.InterfaceC0142a;
import i0.InterfaceC0143b;

/* loaded from: classes.dex */
public final class h implements InterfaceC0143b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2663a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2664b;

    /* renamed from: c, reason: collision with root package name */
    public final B.d f2665c;
    public final U0.g d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2666e;

    public h(Context context, String str, B.d dVar) {
        g1.f.e(dVar, "callback");
        this.f2663a = context;
        this.f2664b = str;
        this.f2665c = dVar;
        this.d = new U0.g(new K(2, this));
    }

    public final InterfaceC0142a a() {
        return ((g) this.d.a()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.d.f861b != U0.h.f863a) {
            ((g) this.d.a()).close();
        }
    }
}
