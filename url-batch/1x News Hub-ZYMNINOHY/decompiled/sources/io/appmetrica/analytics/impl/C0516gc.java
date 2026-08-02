package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* renamed from: io.appmetrica.analytics.impl.gc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0516gc implements F6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7395b;

    /* renamed from: c, reason: collision with root package name */
    public final C0656ln f7396c;

    /* renamed from: d, reason: collision with root package name */
    public final C0488fa f7397d;

    /* renamed from: e, reason: collision with root package name */
    public C0485f7 f7398e;

    public C0516gc(Context context, String str, C0656ln c0656ln) {
        this(context, str, new C0488fa(str), c0656ln);
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final synchronized SQLiteDatabase a() {
        C0485f7 c0485f7;
        try {
            this.f7397d.a();
            c0485f7 = new C0485f7(this.f7394a, this.f7395b, this.f7396c, PublicLogger.getAnonymousInstance());
            this.f7398e = c0485f7;
        } catch (Throwable unused) {
            return null;
        }
        return c0485f7.getWritableDatabase();
    }

    public C0516gc(Context context, String str, C0488fa c0488fa, C0656ln c0656ln) {
        this.f7394a = context;
        this.f7395b = str;
        this.f7397d = c0488fa;
        this.f7396c = c0656ln;
    }

    @Override // io.appmetrica.analytics.impl.F6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC0709no.a((Closeable) this.f7398e);
        this.f7397d.b();
        this.f7398e = null;
    }
}
