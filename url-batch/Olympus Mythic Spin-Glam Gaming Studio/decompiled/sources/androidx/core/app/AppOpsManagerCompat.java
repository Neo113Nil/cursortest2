package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes14.dex */
public final class AppOpsManagerCompat {
    public static String permissionToOp(String str) {
        return Api23Impl.permissionToOp(str);
    }

    public static int noteProxyOpNoThrow(Context context, String str, String str2) {
        return Api23Impl.noteProxyOpNoThrow((AppOpsManager) Api23Impl.getSystemService(context, AppOpsManager.class), str, str2);
    }

    public static int checkOrNoteProxyOp(Context context, int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager systemService = Api29Impl.getSystemService(context);
            int checkOpNoThrow = Api29Impl.checkOpNoThrow(systemService, str, Binder.getCallingUid(), str2);
            return checkOpNoThrow != 0 ? checkOpNoThrow : Api29Impl.checkOpNoThrow(systemService, str, i, Api29Impl.getOpPackageName(context));
        }
        return noteProxyOpNoThrow(context, str, str2);
    }

    @RequiresApi
    static class Api29Impl {
        @Nullable
        @DoNotInline
        static AppOpsManager getSystemService(@NonNull Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }

        @DoNotInline
        static int checkOpNoThrow(@Nullable AppOpsManager appOpsManager, @NonNull String str, int i, @NonNull String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @NonNull
        @DoNotInline
        static String getOpPackageName(@NonNull Context context) {
            return context.getOpPackageName();
        }
    }

    @RequiresApi
    static class Api23Impl {
        @DoNotInline
        static String permissionToOp(String str) {
            return AppOpsManager.permissionToOp(str);
        }

        @DoNotInline
        static <T> T getSystemService(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @DoNotInline
        static int noteProxyOp(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @DoNotInline
        static int noteProxyOpNoThrow(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }
    }
}
