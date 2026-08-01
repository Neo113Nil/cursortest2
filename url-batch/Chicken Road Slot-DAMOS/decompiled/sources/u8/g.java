package u8;

import a3.t;
import android.content.Context;
import android.os.Build;
import b5.d0;
import ge.a0;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final b4.c f9696b = new b4.c("fire-global");

    /* renamed from: c, reason: collision with root package name */
    public static final b4.c f9697c = new b4.c("fire-count");

    /* renamed from: d, reason: collision with root package name */
    public static final b4.c f9698d = new b4.c("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    public final n8.c f9699a;

    public g(Context context, String str) {
        this.f9699a = new n8.c(context, "FirebaseHeartBeat".concat(str));
    }

    public static String b(long j) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
        }
        instant = new Date(j).toInstant();
        unused = ZoneOffset.UTC;
        atOffset = instant.atOffset(ZoneOffset.UTC);
        localDateTime = atOffset.toLocalDateTime();
        unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        return format;
    }

    public static b4.c c(b4.a aVar, String str) {
        for (Map.Entry entry : aVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((b4.c) entry.getKey()).f1098a;
                        str2.getClass();
                        return new b4.c(str2);
                    }
                }
            }
        }
        return null;
    }

    public static void d(b4.a aVar, String str) {
        b4.c c10 = c(aVar, str);
        if (c10 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) g8.b.D(aVar, c10, new HashSet()));
        hashSet.remove(str);
        if (!hashSet.isEmpty()) {
            aVar.d(c10, hashSet);
        } else {
            aVar.b();
            aVar.f1092a.remove(c10);
        }
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String b10 = b(System.currentTimeMillis());
            n8.c cVar = this.f9699a;
            cVar.getClass();
            for (Map.Entry entry : ((Map) a0.w(kotlin.coroutines.g.f5592d, new d0(cVar, null, 2))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(b10);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((b4.c) entry.getKey()).f1098a, new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f9699a.a(new n0.b(1, currentTimeMillis));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean e(b4.c cVar, long j) {
        n8.c cVar2 = this.f9699a;
        cVar2.getClass();
        cVar.getClass();
        ld.a aVar = null;
        t tVar = new t(cVar2, cVar, aVar, 16);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f5592d;
        if (b(((Long) a0.w(gVar, tVar)).longValue()).equals(b(j))) {
            return false;
        }
        n8.c cVar3 = this.f9699a;
        Long valueOf = Long.valueOf(j);
        cVar3.getClass();
        return true;
    }
}
