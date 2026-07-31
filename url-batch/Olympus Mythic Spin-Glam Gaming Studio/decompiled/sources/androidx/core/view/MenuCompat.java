package androidx.core.view;

import android.view.Menu;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes8.dex */
public final class MenuCompat {

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static void setGroupDividerEnabled(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }
}
