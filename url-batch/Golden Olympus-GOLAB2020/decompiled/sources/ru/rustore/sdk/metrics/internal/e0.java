package ru.rustore.sdk.metrics.internal;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function0<SQLiteDatabase> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f43703a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(i0 i0Var) {
        super(0);
        this.f43703a = i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SQLiteDatabase writableDatabase = this.f43703a.f43711a.getWritableDatabase();
        writableDatabase.enableWriteAheadLogging();
        return writableDatabase;
    }
}
