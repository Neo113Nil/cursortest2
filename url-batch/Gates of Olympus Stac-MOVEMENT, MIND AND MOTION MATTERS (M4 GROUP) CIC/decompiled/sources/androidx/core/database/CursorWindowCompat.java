package androidx.core.database;

import android.database.CursorWindow;

/* loaded from: classes.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    public static CursorWindow create(String str, long j) {
        return new CursorWindow(str, j);
    }
}
