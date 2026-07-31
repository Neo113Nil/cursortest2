package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.uc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3012uc implements T6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f39935a;

    /* renamed from: b, reason: collision with root package name */
    public final String f39936b;

    /* renamed from: c, reason: collision with root package name */
    public final C2687hn f39937c;

    /* renamed from: d, reason: collision with root package name */
    public final C2984ta f39938d;

    /* renamed from: e, reason: collision with root package name */
    public C2981t7 f39939e;

    public C3012uc(Context context, String str, @NonNull C2687hn c2687hn) {
        this(context, str, new C2984ta(str), c2687hn);
    }

    @Override // io.appmetrica.analytics.impl.T6
    public final synchronized SQLiteDatabase a() {
        C2981t7 c2981t7;
        try {
            this.f39938d.a();
            c2981t7 = new C2981t7(this.f39935a, this.f39936b, this.f39937c, PublicLogger.getAnonymousInstance());
            this.f39939e = c2981t7;
        } catch (Throwable unused) {
            return null;
        }
        return c2981t7.getWritableDatabase();
    }

    public C3012uc(@NonNull Context context, @NonNull String str, @NonNull C2984ta c2984ta, @NonNull C2687hn c2687hn) {
        this.f39935a = context;
        this.f39936b = str;
        this.f39938d = c2984ta;
        this.f39937c = c2687hn;
    }

    @Override // io.appmetrica.analytics.impl.T6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC2713io.a((Closeable) this.f39939e);
        this.f39938d.b();
        this.f39939e = null;
    }
}
