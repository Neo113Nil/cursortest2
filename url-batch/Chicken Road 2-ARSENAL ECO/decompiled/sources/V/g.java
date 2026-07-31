package V;

import Q.m;
import android.content.Context;
import k5.C0481k;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final class g implements U.c {

    /* renamed from: f, reason: collision with root package name */
    public final Context f2696f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2697g;

    /* renamed from: h, reason: collision with root package name */
    public final D1.b f2698h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2699i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2700j;

    /* renamed from: k, reason: collision with root package name */
    public final C0481k f2701k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2702l;

    public g(Context context, String str, D1.b callback, boolean z5, boolean z6) {
        kotlin.jvm.internal.i.e(callback, "callback");
        this.f2696f = context;
        this.f2697g = str;
        this.f2698h = callback;
        this.f2699i = z5;
        this.f2700j = z6;
        this.f2701k = AbstractC0521b.x(new m(3, this));
    }

    @Override // U.c
    public final c E() {
        return ((f) this.f2701k.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0481k c0481k = this.f2701k;
        if (c0481k.isInitialized()) {
            ((f) c0481k.getValue()).close();
        }
    }

    @Override // U.c
    public final void setWriteAheadLoggingEnabled(boolean z5) {
        C0481k c0481k = this.f2701k;
        if (c0481k.isInitialized()) {
            f sQLiteOpenHelper = (f) c0481k.getValue();
            kotlin.jvm.internal.i.e(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z5);
        }
        this.f2702l = z5;
    }
}
