package w1;

import L1.o;
import L1.w;
import android.content.Context;
import r1.r;
import v1.InterfaceC1018a;

/* loaded from: classes.dex */
public final class g implements v1.b {

    /* renamed from: d, reason: collision with root package name */
    public final Context f8594d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8595e;

    /* renamed from: f, reason: collision with root package name */
    public final F2.h f8596f;

    /* renamed from: g, reason: collision with root package name */
    public final o f8597g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8598h;

    public g(Context context, String str, F2.h hVar) {
        Z1.i.f(hVar, "callback");
        this.f8594d = context;
        this.f8595e = str;
        this.f8596f = hVar;
        this.f8597g = I2.d.F(new r(8, this));
    }

    public final InterfaceC1018a a() {
        return ((f) this.f8597g.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8597g.f2715e != w.f2726a) {
            ((f) this.f8597g.getValue()).close();
        }
    }
}
