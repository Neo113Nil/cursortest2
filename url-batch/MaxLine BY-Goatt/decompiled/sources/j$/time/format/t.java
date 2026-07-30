package j$.time.format;

import com.google.firebase.encoders.json.BuildConfig;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.ZonedDateTime;
import j$.time.temporal.TemporalAccessor;
import java.lang.ref.SoftReference;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final class t extends s {
    public static final Map i = new ConcurrentHashMap();
    public final g0 e;
    public final boolean f;
    public final Map g;
    public final Map h;

    public t(g0 g0Var, boolean z) {
        super(j$.time.temporal.r.e, "ZoneText(" + g0Var + ")");
        this.g = new HashMap();
        this.h = new HashMap();
        Objects.requireNonNull(g0Var, "textStyle");
        this.e = g0Var;
        this.f = z;
    }

    @Override // j$.time.format.s
    public final m a(v vVar) {
        m mVar;
        if (this.e == g0.NARROW) {
            return super.a(vVar);
        }
        Locale locale = vVar.a.b;
        boolean z = vVar.b;
        Set set = j$.time.zone.i.d;
        int size = set.size();
        Map map = z ? this.g : this.h;
        Map.Entry entry = (Map.Entry) map.get(locale);
        if (entry != null && ((Integer) entry.getKey()).intValue() == size && (mVar = (m) ((SoftReference) entry.getValue()).get()) != null) {
            return mVar;
        }
        m mVar2 = vVar.b ? new m(BuildConfig.FLAVOR, null, null) : new l(BuildConfig.FLAVOR, null, null);
        for (String[] strArr : DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            String str = strArr[0];
            if (set.contains(str)) {
                mVar2.a(str, str);
                HashMap hashMap = (HashMap) h0.d;
                String str2 = (String) hashMap.get(str);
                if (str2 == null) {
                    HashMap hashMap2 = (HashMap) h0.g;
                    if (hashMap2.containsKey(str)) {
                        str = (String) hashMap2.get(str);
                        str2 = (String) hashMap.get(str);
                    }
                }
                if (str2 != null) {
                    Map map2 = (Map) ((HashMap) h0.f).get(str2);
                    str = (map2 == null || !map2.containsKey(locale.getCountry())) ? (String) ((HashMap) h0.e).get(str2) : (String) map2.get(locale.getCountry());
                }
                HashMap hashMap3 = (HashMap) h0.g;
                if (hashMap3.containsKey(str)) {
                    str = (String) hashMap3.get(str);
                }
                for (int i2 = this.e == g0.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    mVar2.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), new SoftReference(mVar2)));
        return mVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0103  */
    @Override // j$.time.format.s, j$.time.format.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(y yVar, StringBuilder sb) {
        boolean z;
        g0 g0Var;
        g0 g0Var2;
        String[] strArr;
        j$.time.y yVar2 = (j$.time.y) yVar.b(j$.time.temporal.r.a);
        if (yVar2 == null) {
            return false;
        }
        String q = yVar2.q();
        if (!(yVar2 instanceof ZoneOffset)) {
            TemporalAccessor temporalAccessor = yVar.a;
            String str = null;
            Map map = null;
            if (!this.f) {
                if (temporalAccessor.f(j$.time.temporal.a.INSTANT_SECONDS)) {
                    z = yVar2.B().g(Instant.from(temporalAccessor));
                } else {
                    j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                    if (temporalAccessor.f(aVar)) {
                        j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                        if (temporalAccessor.f(aVar2)) {
                            LocalDate ofEpochDay = LocalDate.ofEpochDay(temporalAccessor.g(aVar));
                            j$.time.l W = j$.time.l.W(temporalAccessor.g(aVar2));
                            ofEpochDay.getClass();
                            LocalDateTime J = LocalDateTime.J(ofEpochDay, W);
                            Object e = yVar2.B().e(J);
                            if ((e instanceof j$.time.zone.b ? (j$.time.zone.b) e : null) == null) {
                                z = yVar2.B().g(Instant.ofEpochSecond(ZonedDateTime.B(J, yVar2, null).Y(), r0.a.b.d));
                            }
                        }
                    }
                }
                Locale locale = yVar.b.b;
                g0Var = g0.NARROW;
                g0Var2 = this.e;
                if (g0Var2 != g0Var) {
                    ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i;
                    SoftReference softReference = (SoftReference) concurrentHashMap.get(q);
                    if (softReference == null || (map = (Map) softReference.get()) == null || (strArr = (String[]) map.get(locale)) == null) {
                        TimeZone timeZone = TimeZone.getTimeZone(q);
                        String[] strArr2 = {q, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), q, q};
                        if (map == null) {
                            map = new ConcurrentHashMap();
                        }
                        map.put(locale, strArr2);
                        concurrentHashMap.put(q, new SoftReference(map));
                        strArr = strArr2;
                    }
                    str = z ? !z ? strArr[g0Var2.a + 5] : strArr[g0Var2.a + 3] : strArr[g0Var2.a + 1];
                }
                if (str != null) {
                    q = str;
                }
            }
            z = 2;
            Locale locale2 = yVar.b.b;
            g0Var = g0.NARROW;
            g0Var2 = this.e;
            if (g0Var2 != g0Var) {
            }
            if (str != null) {
            }
        }
        sb.append(q);
        return true;
    }
}
