package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
final class m32 implements nb3<SQLiteDatabase> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pv2 f8393a;

    m32(n32 n32Var, pv2 pv2Var) {
        this.f8393a = pv2Var;
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final /* bridge */ /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f8393a.c(sQLiteDatabase);
        } catch (Exception e7) {
            String valueOf = String.valueOf(e7.getMessage());
            io0.d(valueOf.length() != 0 ? "Error executing function on offline signal database: ".concat(valueOf) : new String("Error executing function on offline signal database: "));
        }
    }

    @Override // com.google.android.gms.internal.ads.nb3
    public final void b(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        io0.d(valueOf.length() != 0 ? "Failed to get offline signal database: ".concat(valueOf) : new String("Failed to get offline signal database: "));
    }
}
