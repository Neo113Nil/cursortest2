package androidx.core.database;

import android.database.CursorWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes15.dex */
public final class CursorWindowCompat {

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static CursorWindow createCursorWindow(String str, long j) {
            return new CursorWindow(str, j);
        }
    }
}
