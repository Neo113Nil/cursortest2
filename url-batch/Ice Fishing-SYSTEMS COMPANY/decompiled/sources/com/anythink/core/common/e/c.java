package com.anythink.core.common.e;

import android.database.sqlite.SQLiteDatabase;

/* loaded from: classes.dex */
public class c<T> {

    /* renamed from: e, reason: collision with root package name */
    protected d f13090e;

    public c(d dVar) {
        this.f13090e = dVar;
    }

    public final synchronized SQLiteDatabase c() {
        return this.f13090e.a();
    }

    public final synchronized SQLiteDatabase d() {
        return this.f13090e.b();
    }
}
