package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes11.dex */
public final class PermissionInfoCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Protection {
    }

    @SuppressLint({"UniqueConstants"})
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ProtectionFlags {
    }

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static int getProtection(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @DoNotInline
        static int getProtectionFlags(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }
}
