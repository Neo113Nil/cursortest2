package c0;

import M.U;
import a.AbstractC0169a;
import android.content.Context;
import b0.InterfaceC0261b;
import f4.C0434k;
import f4.C0442s;

/* renamed from: c0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0305g implements InterfaceC0261b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4884a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4885b;

    /* renamed from: c, reason: collision with root package name */
    public final B3.d f4886c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4887d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4888e;

    /* renamed from: f, reason: collision with root package name */
    public final C0434k f4889f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4890g;

    public C0305g(Context context, String str, B3.d callback, boolean z, boolean z5) {
        kotlin.jvm.internal.i.e(callback, "callback");
        this.f4884a = context;
        this.f4885b = str;
        this.f4886c = callback;
        this.f4887d = z;
        this.f4888e = z5;
        this.f4889f = AbstractC0169a.A(new U(6, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4889f.f5675b != C0442s.f5686a) {
            ((C0304f) this.f4889f.getValue()).close();
        }
    }

    @Override // b0.InterfaceC0261b
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f4889f.f5675b != C0442s.f5686a) {
            C0304f sQLiteOpenHelper = (C0304f) this.f4889f.getValue();
            kotlin.jvm.internal.i.e(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
        this.f4890g = z;
    }

    @Override // b0.InterfaceC0261b
    public final C0301c z() {
        return ((C0304f) this.f4889f.getValue()).a(true);
    }
}
