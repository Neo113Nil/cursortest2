package androidx.core.app;

import android.app.Dialog;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes9.dex */
public class DialogCompat {

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static <T> T requireViewById(Dialog dialog, int i) {
            return (T) dialog.requireViewById(i);
        }
    }
}
