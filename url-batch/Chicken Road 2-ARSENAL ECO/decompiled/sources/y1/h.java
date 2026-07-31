package y1;

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

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6235a;

    public h(Context context, String str) {
        this.f6235a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        try {
            long j4 = this.f6235a.getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : this.f6235a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(this.f6235a.getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            this.f6235a.edit().putStringSet(str, hashSet).putLong("fire-count", j4 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b() {
        try {
            SharedPreferences.Editor edit = this.f6235a.edit();
            int i7 = 0;
            for (Map.Entry<String, ?> entry : this.f6235a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String d7 = d(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(d7)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(d7);
                        i7++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i7 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i7);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized ArrayList c() {
        try {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : this.f6235a.getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(d(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C0757a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f6235a.edit().putLong("fire-global", currentTimeMillis).commit();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String d(long j4) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j4));
        }
        instant = new Date(j4).toInstant();
        unused = ZoneOffset.UTC;
        atOffset = instant.atOffset(ZoneOffset.UTC);
        localDateTime = atOffset.toLocalDateTime();
        unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        return format;
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f6235a.getAll().entrySet()) {
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
            String e4 = e(str);
            if (e4 == null) {
                return;
            }
            HashSet hashSet = new HashSet(this.f6235a.getStringSet(e4, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                this.f6235a.edit().remove(e4).commit();
            } else {
                this.f6235a.edit().putStringSet(e4, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(long j4) {
        if (!this.f6235a.contains("fire-global")) {
            this.f6235a.edit().putLong("fire-global", j4).commit();
            return true;
        }
        long j7 = this.f6235a.getLong("fire-global", -1L);
        synchronized (this) {
            if (d(j7).equals(d(j4))) {
                return false;
            }
            this.f6235a.edit().putLong("fire-global", j4).commit();
            return true;
        }
    }

    public final synchronized void h(long j4, String str) {
        String d7 = d(j4);
        if (this.f6235a.getString("last-used-date", "").equals(d7)) {
            String e4 = e(d7);
            if (e4 == null) {
                return;
            }
            if (e4.equals(str)) {
                return;
            }
            i(str, d7);
            return;
        }
        long j7 = this.f6235a.getLong("fire-count", 0L);
        if (j7 + 1 == 30) {
            a();
            j7 = this.f6235a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f6235a.getStringSet(str, new HashSet()));
        hashSet.add(d7);
        this.f6235a.edit().putStringSet(str, hashSet).putLong("fire-count", j7 + 1).putString("last-used-date", d7).commit();
    }

    public final synchronized void i(String str, String str2) {
        f(str2);
        HashSet hashSet = new HashSet(this.f6235a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f6235a.edit().putStringSet(str, hashSet).commit();
    }
}
