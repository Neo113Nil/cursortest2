package t2;

import android.content.Context;
import android.content.SharedPreferences;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: t2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1209f {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f10743a;

    public C1209f(Context context, String str) {
        this.f10743a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j4 = this.f10743a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f10743a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f10743a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f10743a.edit().putStringSet(str, hashSet).putLong("fire-count", j4 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized String b(String str) {
        for (Map.Entry<String, ?> entry : this.f10743a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void c(String str) {
        try {
            String b4 = b(str);
            if (b4 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f10743a.getStringSet(b4, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f10743a.edit().remove(b4).commit();
            } else {
                this.f10743a.edit().putStringSet(b4, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(String str, long j4) {
        String format;
        synchronized (this) {
            format = new Date(j4).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        if (this.f10743a.getString("last-used-date", "").equals(format)) {
            String b4 = b(format);
            if (b4 == null) {
                return;
            }
            if (b4.equals(str)) {
                return;
            }
            e(str, format);
            return;
        }
        long j5 = this.f10743a.getLong("fire-count", 0L);
        if (j5 + 1 == 30) {
            a();
            j5 = this.f10743a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f10743a.getStringSet(str, new HashSet()));
        hashSet.add(format);
        this.f10743a.edit().putStringSet(str, hashSet).putLong("fire-count", j5 + 1).putString("last-used-date", format).commit();
    }

    public final synchronized void e(String str, String str2) {
        c(str2);
        HashSet hashSet = new HashSet(this.f10743a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f10743a.edit().putStringSet(str, hashSet).commit();
    }
}
