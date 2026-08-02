package defpackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fzy {
    private static final hkh a = hkh.l("com/google/apps/tiktok/cache/CacheNames");

    static boolean a(String str, String str2, Set set, gzp gzpVar) {
        if (str.endsWith("-wal") || str.endsWith("-shm")) {
            str = str.substring(0, str.length() - 4);
        } else if (str.endsWith("-journal")) {
            str = str.substring(0, str.length() - 8);
        }
        if (str.startsWith("SqliteKeyValueCache:") && str.endsWith(str2)) {
            String substring = str.substring(20, str.length() - str2.length());
            if (gzpVar.f()) {
                if (((Set) gzpVar.b()).contains(substring)) {
                    return false;
                }
                if (!set.contains(str)) {
                    return true;
                }
                ((hkf) ((hkf) a.f()).i("com/google/apps/tiktok/cache/CacheNames", "isOrphaned", 45, "CacheNames.java")).u("A KeyValueCache %s was found that is present only in this process's registry. This cache is at risk of being deleted by another process.", str);
                return false;
            }
            if (!set.contains(str)) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ gpv b(gzp gzpVar, gzp gzpVar2, koe koeVar) {
        if (((Boolean) gzpVar.d(false)).booleanValue()) {
            return gpv.a;
        }
        gpo gpoVar = new gpo();
        gpoVar.c(14L, TimeUnit.DAYS);
        gpq gpqVar = new gpq();
        gpqVar.a = gps.ON_CHARGER;
        gpqVar.b(7L, TimeUnit.DAYS);
        gpoVar.b(gpqVar.a());
        gpoVar.a = ((Boolean) gzpVar2.d(false)).booleanValue();
        return hoq.aS(gpoVar.a(), koeVar);
    }
}
