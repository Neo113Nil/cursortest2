package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class Zb implements InterfaceC1098y6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11366a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11367b;

    /* renamed from: c, reason: collision with root package name */
    public final C0700in f11368c;

    /* renamed from: d, reason: collision with root package name */
    public final Y9 f11369d;

    /* renamed from: e, reason: collision with root package name */
    public Y6 f11370e;

    public Zb(Context context, String str, C0700in c0700in) {
        this(context, str, new Y9(str), c0700in);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1098y6
    public final synchronized SQLiteDatabase a() {
        Y6 y6;
        try {
            this.f11369d.a();
            y6 = new Y6(this.f11366a, this.f11367b, this.f11368c, PublicLogger.getAnonymousInstance());
            this.f11370e = y6;
        } catch (Throwable unused) {
            return null;
        }
        return y6.getWritableDatabase();
    }

    public Zb(Context context, String str, Y9 y9, C0700in c0700in) {
        this.f11366a = context;
        this.f11367b = str;
        this.f11369d = y9;
        this.f11368c = c0700in;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC1098y6
    public final synchronized void a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Throwable unused) {
            }
        }
        AbstractC0779lo.a((Closeable) this.f11370e);
        this.f11369d.b();
        this.f11370e = null;
    }
}
