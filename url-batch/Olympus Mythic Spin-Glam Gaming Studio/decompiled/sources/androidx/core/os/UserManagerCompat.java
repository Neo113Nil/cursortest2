package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public class UserManagerCompat {
    public static boolean isUserUnlocked(Context context) {
        return Api24Impl.isUserUnlocked(context);
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static boolean isUserUnlocked(Context context) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
    }
}
