package R0;

import W0.p;
import android.content.Context;
import android.content.SharedPreferences;
import h.AbstractC0112a;
import h1.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o1.k;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f798a;

    public c(Context context) {
        d.e(context, "context");
        this.f798a = context.getSharedPreferences("win_random_prefs", 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        int i;
        Long valueOf;
        a aVar;
        String string = this.f798a.getString("history", "");
        p pVar = p.f959a;
        if (string == null || o1.d.G(string)) {
            return pVar;
        }
        List N2 = o1.d.N(string, new String[]{"||"});
        ArrayList arrayList = new ArrayList();
        Iterator it = N2.iterator();
        while (it.hasNext()) {
            List N3 = o1.d.N((String) it.next(), new String[]{"|"});
            if (N3.size() == 5) {
                int i2 = 0;
                String str = (String) N3.get(0);
                d.e(str, "<this>");
                AbstractC0112a.c(10);
                int length = str.length();
                if (length != 0) {
                    char charAt = str.charAt(0);
                    long j2 = -9223372036854775807L;
                    if (d.f(charAt, 48) < 0) {
                        if (length != 1) {
                            if (charAt == '+') {
                                i = 0;
                                i2 = 1;
                                long j3 = -256204778801521550L;
                                int i3 = i;
                                long j4 = -256204778801521550L;
                                long j5 = 0;
                                while (i2 < length) {
                                    int digit = Character.digit((int) str.charAt(i2), 10);
                                    if (digit >= 0) {
                                        if (j5 < j4) {
                                            if (j4 == j3) {
                                                j4 = j2 / 10;
                                                if (j5 < j4) {
                                                }
                                            }
                                        }
                                        long j6 = j5 * 10;
                                        long j7 = digit;
                                        if (j6 >= j2 + j7) {
                                            j5 = j6 - j7;
                                            i2++;
                                            j3 = -256204778801521550L;
                                        }
                                    }
                                }
                                valueOf = i3 == 0 ? Long.valueOf(j5) : Long.valueOf(-j5);
                                if (valueOf != null) {
                                    long longValue = valueOf.longValue();
                                    String str2 = (String) N3.get(1);
                                    Integer t2 = k.t((String) N3.get(2));
                                    if (t2 != null) {
                                        aVar = new a(longValue, str2, t2.intValue(), d.a(N3.get(3), "1"), (String) N3.get(4));
                                        if (aVar == null) {
                                            arrayList.add(aVar);
                                        }
                                    }
                                }
                            } else if (charAt == '-') {
                                j2 = Long.MIN_VALUE;
                                i2 = 1;
                            }
                        }
                    }
                    i = i2;
                    long j32 = -256204778801521550L;
                    int i32 = i;
                    long j42 = -256204778801521550L;
                    long j52 = 0;
                    while (i2 < length) {
                    }
                    if (i32 == 0) {
                    }
                    if (valueOf != null) {
                    }
                }
                valueOf = null;
                if (valueOf != null) {
                }
            }
            aVar = null;
            if (aVar == null) {
            }
        }
        return arrayList;
    }
}
