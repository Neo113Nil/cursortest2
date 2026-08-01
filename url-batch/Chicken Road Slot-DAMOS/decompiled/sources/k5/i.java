package k5;

import android.content.Context;
import hd.c0;
import hd.q;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements j5.d {

    /* renamed from: d, reason: collision with root package name */
    public final Context f5429d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5430e;

    /* renamed from: i, reason: collision with root package name */
    public final j5.a f5431i;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5432r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5433s;

    /* renamed from: t, reason: collision with root package name */
    public final q f5434t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5435u;

    public i(Context context, String str, j5.a aVar, boolean z10, boolean z11) {
        context.getClass();
        aVar.getClass();
        this.f5429d = context;
        this.f5430e = str;
        this.f5431i = aVar;
        this.f5432r = z10;
        this.f5433s = z11;
        this.f5434t = hd.h.b(new a1.b(14, this));
    }

    @Override // j5.d
    public final d G() {
        return ((h) this.f5434t.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5434t.f4518e != c0.f4498a) {
            ((h) this.f5434t.getValue()).close();
        }
    }

    @Override // j5.d
    public final String getDatabaseName() {
        return this.f5430e;
    }

    @Override // j5.d
    public final void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f5434t.f4518e != c0.f4498a) {
            ((h) this.f5434t.getValue()).setWriteAheadLoggingEnabled(z10);
        }
        this.f5435u = z10;
    }
}
