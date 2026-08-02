package defpackage;

import android.database.sqlite.SQLiteException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fdh extends SQLiteException {
    public fdh(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
