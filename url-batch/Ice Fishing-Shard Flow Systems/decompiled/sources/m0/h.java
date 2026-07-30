package m0;

import B6.o;
import P.V;
import R5.C;
import R5.q;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC0656c;

/* loaded from: classes.dex */
public final class h implements InterfaceC0656c {

    /* renamed from: d, reason: collision with root package name */
    public final Context f6510d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6511e;

    /* renamed from: i, reason: collision with root package name */
    public final o f6512i;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f6513l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f6514m;

    /* renamed from: n, reason: collision with root package name */
    public final q f6515n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6516o;

    public h(Context context, String str, o callback, boolean z7, boolean z8) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f6510d = context;
        this.f6511e = str;
        this.f6512i = callback;
        this.f6513l = z7;
        this.f6514m = z8;
        this.f6515n = R5.i.b(new V(4, this));
    }

    @Override // l0.InterfaceC0656c
    public final C0684c C() {
        return ((g) this.f6515n.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6515n.f2427e != C.f2403a) {
            ((g) this.f6515n.getValue()).close();
        }
    }

    @Override // l0.InterfaceC0656c
    public final void setWriteAheadLoggingEnabled(boolean z7) {
        if (this.f6515n.f2427e != C.f2403a) {
            g sQLiteOpenHelper = (g) this.f6515n.getValue();
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z7);
        }
        this.f6516o = z7;
    }
}
