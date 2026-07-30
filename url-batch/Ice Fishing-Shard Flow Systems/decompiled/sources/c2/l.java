package c2;

import a.AbstractC0169a;
import android.content.Context;
import android.os.Build;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n6.AbstractC0792z;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final T.d f4196b = AbstractC0169a.q("fire-global");

    /* renamed from: c, reason: collision with root package name */
    public static final T.d f4197c = AbstractC0169a.q("fire-count");

    /* renamed from: d, reason: collision with root package name */
    public static final T.d f4198d = AbstractC0169a.E("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    public final U1.h f4199a;

    public l(Context context, String str) {
        this.f4199a = new U1.h(context, r4.f.i("FirebaseHeartBeat", str));
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

    public static T.d c(T.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return AbstractC0169a.F(((T.d) entry.getKey()).f2555a);
                    }
                }
            }
        }
        return null;
    }

    public static void d(T.b bVar, String str) {
        T.d key = c(bVar, str);
        if (key == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) d4.c.q(bVar, key, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            bVar.d(key);
        } else {
            Intrinsics.checkNotNullParameter(key, "key");
            bVar.f(key, hashSet);
        }
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String b7 = b(System.currentTimeMillis());
            U1.h hVar = this.f4199a;
            hVar.getClass();
            for (Map.Entry entry : ((Map) AbstractC0792z.o(kotlin.coroutines.g.f6146d, new U1.d(hVar, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(b7);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C0291a(((T.d) entry.getKey()).f2555a, new ArrayList(hashSet)));
                    }
                }
            }
            final long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f4199a.a(new Function1() { // from class: c2.k
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ((T.b) obj).e(l.f4196b, Long.valueOf(currentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized boolean e(T.d key, long j) {
        U1.h hVar = this.f4199a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        U1.e eVar = new U1.e(hVar, key, null);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f6146d;
        if (b(((Long) AbstractC0792z.o(gVar, eVar)).longValue()).equals(b(j))) {
            return false;
        }
        U1.h hVar2 = this.f4199a;
        Long valueOf = Long.valueOf(j);
        hVar2.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        return true;
    }
}
