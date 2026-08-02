package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class del {
    public static final den a;

    static {
        Uri uri = dem.a;
        a = deo.a();
    }

    public static long a(ContentResolver contentResolver) {
        den denVar = a;
        der derVar = (der) denVar;
        derVar.e(contentResolver);
        derVar.c(contentResolver);
        derVar.d.lock();
        try {
            Object obj = ((der) denVar).i;
            long j = 0;
            Long l = (Long) ((der) denVar).b(((der) denVar).h, "android_id", 0L, der.b);
            if (l != null) {
                return l.longValue();
            }
            String a2 = derVar.a(contentResolver, "android_id");
            if (a2 != null) {
                try {
                    long parseLong = Long.parseLong(a2);
                    l = Long.valueOf(parseLong);
                    j = parseLong;
                } catch (NumberFormatException unused) {
                }
            }
            long j2 = j;
            derVar.d(obj, derVar.h, "android_id", l, der.b);
            return j2;
        } finally {
            derVar.d.unlock();
        }
    }
}
