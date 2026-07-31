package io.appmetrica.analytics.impl;

import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2616f5 extends DatabaseScript {

    /* renamed from: a, reason: collision with root package name */
    public final C2589e5 f38953a = new C2589e5();

    /* renamed from: b, reason: collision with root package name */
    public final C2563d5 f38954b = new C2563d5();

    @Override // io.appmetrica.analytics.coreapi.internal.db.DatabaseScript
    public final void runScript(@NotNull SQLiteDatabase sQLiteDatabase) {
        this.f38953a.runScript(sQLiteDatabase);
        this.f38954b.runScript(sQLiteDatabase);
    }
}
