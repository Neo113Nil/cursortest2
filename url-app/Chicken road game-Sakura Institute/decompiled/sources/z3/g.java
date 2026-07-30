package z3;

import a0.l;
import android.content.Context;
import d6.o;
import d6.w;
import r1.z0;
import r6.k;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class g implements y3.b {

    /* renamed from: f, reason: collision with root package name */
    public final Context f10085f;

    /* renamed from: g, reason: collision with root package name */
    public final String f10086g;

    /* renamed from: h, reason: collision with root package name */
    public final l f10087h;

    /* renamed from: i, reason: collision with root package name */
    public final o f10088i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10089j;

    public g(Context context, String str, l lVar) {
        k.f(lVar, "callback");
        this.f10085f = context;
        this.f10086g = str;
        this.f10087h = lVar;
        this.f10088i = d6.a.d(new z0(16, this));
    }

    public final y3.a b() {
        return ((f) this.f10088i.getValue()).b(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10088i.f2625g != w.f2636a) {
            ((f) this.f10088i.getValue()).close();
        }
    }
}
