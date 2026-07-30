package W3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3460a;

    public h(Context context, String str) {
        this.f3460a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j9 = this.f3460a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f3460a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f3460a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f3460a.edit().putStringSet(str, hashSet).putLong("fire-count", j9 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f3460a.edit();
            int i = 0;
            for (Map.Entry<String, ?> entry : this.f3460a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d2 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d2)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d2);
                        i++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f3460a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f3460a.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j9) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j9));
        }
        instant = new Date(j9).toInstant();
        unused = ZoneOffset.UTC;
        atOffset = instant.atOffset(ZoneOffset.UTC);
        localDateTime = atOffset.toLocalDateTime();
        unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        return format;
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f3460a.getAll().entrySet()) {
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

    public final synchronized void f(String str) {
        try {
            String e6 = e(str);
            if (e6 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f3460a.getStringSet(e6, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f3460a.edit().remove(e6).commit();
            } else {
                this.f3460a.edit().putStringSet(e6, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(long j9) {
        if (!this.f3460a.contains("fire-global")) {
            this.f3460a.edit().putLong("fire-global", j9).commit();
            return true;
        }
        long j10 = this.f3460a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j10).equals(d(j9))) {
                return false;
            }
            this.f3460a.edit().putLong("fire-global", j9).commit();
            return true;
        }
    }

    public final synchronized void h(String str, long j9) {
        String d2 = d(j9);
        if (this.f3460a.getString("last-used-date", "").equals(d2)) {
            String e6 = e(d2);
            if (e6 == null) {
                return;
            }
            if (e6.equals(str)) {
                return;
            }
            i(str, d2);
            return;
        }
        long j10 = this.f3460a.getLong("fire-count", 0L);
        if (j10 + 1 == 30) {
            a();
            j10 = this.f3460a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f3460a.getStringSet(str, new HashSet()));
        hashSet.add(d2);
        this.f3460a.edit().putStringSet(str, hashSet).putLong("fire-count", j10 + 1).putString("last-used-date", d2).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f3460a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f3460a.edit().putStringSet(str, hashSet).commit();
    }
}
