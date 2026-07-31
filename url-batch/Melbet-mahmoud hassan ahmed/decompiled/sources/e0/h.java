package e0;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f15788a = d0.j.f("WrkDbPathHelper");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f15789b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        return Build.VERSION.SDK_INT < 23 ? b(context) : c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        File b7 = b(context);
        if (Build.VERSION.SDK_INT < 23 || !b7.exists()) {
            return;
        }
        d0.j.c().a(f15788a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> f7 = f(context);
        for (File file : f7.keySet()) {
            File file2 = f7.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    d0.j.c().h(f15788a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                d0.j.c().a(f15788a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
            }
        }
    }

    public static Map<File, File> f(Context context) {
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            File b7 = b(context);
            File a7 = a(context);
            hashMap.put(b7, a7);
            for (String str : f15789b) {
                hashMap.put(new File(b7.getPath() + str), new File(a7.getPath() + str));
            }
        }
        return hashMap;
    }
}
