package com.facebook.ads.internal.e;

import com.google.android.gms.games.GamesStatusCodes;

/* loaded from: classes.dex */
abstract class f<T> {

    /* renamed from: a, reason: collision with root package name */
    private a f5100a;

    public enum a {
        UNKNOWN(GamesStatusCodes.STATUS_VIDEO_NOT_ACTIVE, "An unknown error has occurred."),
        DATABASE_SELECT(3001, "Failed to read from database."),
        DATABASE_INSERT(GamesStatusCodes.STATUS_ACHIEVEMENT_NOT_INCREMENTAL, "Failed to insert row into database."),
        DATABASE_UPDATE(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCKED, "Failed to update row in database."),
        DATABASE_DELETE(3004, "Failed to delete row from database.");

        private final int f;
        private final String g;

        a(int i, String str) {
            this.f = i;
            this.g = str;
        }

        public int a() {
            return this.f;
        }

        public String b() {
            return this.g;
        }
    }

    f() {
    }

    protected void a(a aVar) {
        this.f5100a = aVar;
    }

    abstract T b();

    public a c() {
        return this.f5100a;
    }
}
