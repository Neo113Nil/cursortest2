package defpackage;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.g;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class d60 {
    public static final hy0 b = new hy0("fire-global");
    public static final hy0 c = new hy0("fire-count");
    public static final hy0 d = new hy0("last-used-date");
    public final fb0 a;

    public d60(Context context, String str) {
        this.a = new fb0(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String b2 = b(System.currentTimeMillis());
            fb0 fb0Var = this.a;
            fb0Var.getClass();
            for (Map.Entry entry : ((Map) uq1.R(g.d, new rp(fb0Var, (dn) null, 4))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(b2);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new mb(((hy0) entry.getKey()).a, new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.a.a(new ne(1, currentTimeMillis));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized hy0 c(qn0 qn0Var, String str) {
        for (Map.Entry entry : qn0Var.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((hy0) entry.getKey()).a;
                        str2.getClass();
                        return new hy0(str2);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(qn0 qn0Var, String str) {
        hy0 c2 = c(qn0Var, str);
        if (c2 == null) {
            return;
        }
        HashSet hashSet = new HashSet((Collection) gb0.w(qn0Var, c2, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            qn0Var.b();
            qn0Var.a.remove(c2);
        } else {
            qn0Var.e(c2, hashSet);
        }
    }

    public final synchronized boolean e(hy0 hy0Var, long j) {
        dn dnVar;
        g gVar;
        long longValue;
        fb0 fb0Var = this.a;
        fb0Var.getClass();
        hy0Var.getClass();
        dnVar = null;
        d dVar = new d(fb0Var, hy0Var, dnVar, 13);
        gVar = g.d;
        longValue = ((Long) uq1.R(gVar, dVar)).longValue();
        synchronized (this) {
        }
        if (b(longValue).equals(b(j))) {
            return false;
        }
        fb0 fb0Var2 = this.a;
        Long valueOf = Long.valueOf(j);
        fb0Var2.getClass();
        return true;
    }
}
