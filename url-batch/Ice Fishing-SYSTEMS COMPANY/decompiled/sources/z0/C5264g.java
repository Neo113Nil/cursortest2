package z0;

import X.r;
import android.content.Context;
import q7.C4942k;
import q7.C4950s;

/* renamed from: z0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5264g implements y0.b {

    /* renamed from: n, reason: collision with root package name */
    public final Context f42123n;

    /* renamed from: u, reason: collision with root package name */
    public final String f42124u;

    /* renamed from: v, reason: collision with root package name */
    public final F.d f42125v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f42126w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f42127x;

    /* renamed from: y, reason: collision with root package name */
    public final C4942k f42128y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f42129z;

    public C5264g(Context context, String str, F.d callback, boolean z8, boolean z9) {
        kotlin.jvm.internal.h.e(callback, "callback");
        this.f42123n = context;
        this.f42124u = str;
        this.f42125v = callback;
        this.f42126w = z8;
        this.f42127x = z9;
        this.f42128y = com.bumptech.glide.e.q(new r(5, this));
    }

    @Override // y0.b
    public final C5260c R() {
        return ((C5263f) this.f42128y.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f42128y.f40169u != C4950s.f40180a) {
            ((C5263f) this.f42128y.getValue()).close();
        }
    }

    @Override // y0.b
    public final void setWriteAheadLoggingEnabled(boolean z8) {
        if (this.f42128y.f40169u != C4950s.f40180a) {
            C5263f sQLiteOpenHelper = (C5263f) this.f42128y.getValue();
            kotlin.jvm.internal.h.e(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z8);
        }
        this.f42129z = z8;
    }
}
