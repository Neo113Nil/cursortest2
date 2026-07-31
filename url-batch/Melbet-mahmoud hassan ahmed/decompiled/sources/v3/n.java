package v3;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class n {
    @Deprecated
    public static void a(@RecentlyNonNull Context context, @RecentlyNonNull SharedPreferences.Editor editor, @RecentlyNonNull String str) {
        throw new IllegalStateException("world-readable shared preferences should only be used by apk");
    }
}
