package l1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.util.TypedValue;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.android.installreferrer.R;
import com.chicken.road.whale.RootActivity;
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class x implements o5.d, r5.c, v3.c {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f5846f;

    /* renamed from: g, reason: collision with root package name */
    public Object f5847g;

    public /* synthetic */ x(int i7, Object obj) {
        this.f5846f = i7;
        this.f5847g = obj;
    }

    @Override // o5.d
    public Object a(l5.f fVar, Object obj, Object obj2) {
        switch (this.f5846f) {
            case 3:
                return ((l5.b) obj2).a(((l5.f) this.f5847g).g(fVar), (t5.s) obj);
            default:
                l5.m mVar = (l5.m) obj;
                l.v vVar = (l.v) this.f5847g;
                l5.h hVar = (l5.h) vVar.f5685f;
                if (!fVar.isEmpty() && mVar.f()) {
                    q5.i iVar = mVar.d().f7537a;
                    q5.i n8 = l.v.n(iVar);
                    vVar.p(iVar);
                    hVar.b(n8);
                    return null;
                }
                ArrayList e9 = mVar.e();
                int size = e9.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj3 = e9.get(i7);
                    i7++;
                    q5.i iVar2 = ((q5.j) obj3).f7537a;
                    q5.i n9 = l.v.n(iVar2);
                    vVar.p(iVar2);
                    hVar.b(n9);
                }
                return null;
        }
    }

    public synchronized void b() {
        try {
            long j8 = ((SharedPreferences) this.f5847g).getLong("fire-count", 0L);
            String str = "";
            String str2 = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f5847g).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f5847g).getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            ((SharedPreferences) this.f5847g).edit().putStringSet(str, hashSet).putLong("fire-count", j8 - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void c(byte b9) {
        ((Parcel) this.f5847g).writeByte(b9);
    }

    @Override // r5.c
    public t5.m d(t5.m mVar, t5.c cVar, t5.s sVar, l5.f fVar, r5.b bVar, l5.a aVar) {
        o5.j.b("The index must match the filter", mVar.f8912h == ((t5.l) this.f5847g));
        t5.s sVar2 = mVar.f8910f;
        t5.s d8 = sVar2.d(cVar);
        if (!d8.b(fVar).equals(sVar.b(fVar)) || d8.isEmpty() != sVar.isEmpty()) {
            if (aVar != null) {
                boolean isEmpty = sVar.isEmpty();
                t5.t tVar = t5.t.f8922a;
                if (isEmpty) {
                    if (sVar2.s(cVar)) {
                        aVar.b(new q5.c(1, new t5.m(d8, tVar), cVar, null));
                    } else {
                        o5.j.b("A child remove without an old child only makes sense on a leaf node", sVar2.i());
                    }
                } else if (d8.isEmpty()) {
                    aVar.b(new q5.c(2, new t5.m(sVar, tVar), cVar, null));
                } else {
                    aVar.b(new q5.c(4, new t5.m(sVar, tVar), cVar, new t5.m(d8, tVar)));
                }
            }
            if (!sVar2.i() || !sVar.isEmpty()) {
                return mVar.g(cVar, sVar);
            }
        }
        return mVar;
    }

    @Override // v3.c
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // v3.c
    public void f(int i7, Object obj) {
        String str;
        switch (i7) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case q.c.f7259c /* 9 */:
            default:
                str = "";
                break;
            case q.c.f7261e /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i7 == 6 || i7 == 7 || i7 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f5847g).setResultCode(i7);
    }

    @Override // r5.c
    public t5.l getIndex() {
        return (t5.l) this.f5847g;
    }

    @Override // r5.c
    public boolean h() {
        return false;
    }

    @Override // r5.c
    public t5.m i(t5.m mVar, t5.m mVar2, l5.a aVar) {
        t5.t tVar;
        boolean z8 = mVar2.f8912h == ((t5.l) this.f5847g);
        t5.s<t5.q> sVar = mVar2.f8910f;
        o5.j.b("Can't use IndexedNode that doesn't have filter's index", z8);
        if (aVar != null) {
            t5.s sVar2 = mVar.f8910f;
            Iterator it = sVar2.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                tVar = t5.t.f8922a;
                if (!hasNext) {
                    break;
                }
                t5.q qVar = (t5.q) it.next();
                if (!sVar.s(qVar.f8919a)) {
                    aVar.b(new q5.c(1, new t5.m(qVar.f8920b, tVar), qVar.f8919a, null));
                }
            }
            if (!sVar.i()) {
                for (t5.q qVar2 : sVar) {
                    t5.c cVar = qVar2.f8919a;
                    t5.s sVar3 = qVar2.f8920b;
                    if (sVar2.s(cVar)) {
                        t5.s d8 = sVar2.d(cVar);
                        if (!d8.equals(sVar3)) {
                            aVar.b(new q5.c(4, new t5.m(sVar3, tVar), cVar, new t5.m(d8, tVar)));
                        }
                    } else {
                        aVar.b(new q5.c(2, new t5.m(sVar3, tVar), cVar, null));
                    }
                }
            }
        }
        return mVar2;
    }

    public void j(float f9) {
        ((Parcel) this.f5847g).writeFloat(f9);
    }

    public void k(long j8) {
        long b9 = m2.m.b(j8);
        byte b10 = 0;
        if (!m2.n.a(b9, 0L)) {
            if (m2.n.a(b9, 4294967296L)) {
                b10 = 1;
            } else if (m2.n.a(b9, 8589934592L)) {
                b10 = 2;
            }
        }
        c(b10);
        if (m2.n.a(m2.m.b(j8), 0L)) {
            return;
        }
        j(m2.m.c(j8));
    }

    @Override // r5.c
    public t5.m l(t5.m mVar, t5.s sVar) {
        return mVar.f8910f.isEmpty() ? mVar : new t5.m(mVar.f8910f.n(sVar), mVar.f8912h, mVar.f8911g);
    }

    public synchronized String m(long j8) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT < 26) {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j8));
        }
        instant = new Date(j8).toInstant();
        unused = ZoneOffset.UTC;
        atOffset = instant.atOffset(ZoneOffset.UTC);
        localDateTime = atOffset.toLocalDateTime();
        unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
        format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
        return format;
    }

    public synchronized String n(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f5847g).getAll().entrySet()) {
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

    public void o() {
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = ((RootActivity) this.f5847g).getTheme();
        theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
        if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
            theme.getDrawable(typedValue.resourceId);
        }
        theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
        r(theme, typedValue);
    }

    public androidx.room.c p(androidx.room.c cVar, s1.r rVar) {
        Object obj;
        int i7;
        long D;
        long j8;
        boolean z8;
        Object obj2 = i.m.f4759a;
        i.l lVar = (i.l) this.f5847g;
        List list = (List) cVar.f1069g;
        i.l lVar2 = new i.l(list.size());
        int size = list.size();
        int i8 = 0;
        while (i8 < size) {
            y yVar = (y) list.get(i8);
            long j9 = yVar.f5848a;
            int b9 = j.a.b(lVar.f4756g, lVar.f4758i, j9);
            if (b9 < 0 || (obj = lVar.f4757h[b9]) == obj2) {
                obj = null;
            }
            w wVar = (w) obj;
            if (wVar == null) {
                i7 = i8;
                j8 = yVar.f5849b;
                D = yVar.f5851d;
                z8 = false;
            } else {
                long j10 = wVar.f5843a;
                boolean z9 = wVar.f5845c;
                i7 = i8;
                D = rVar.D(wVar.f5844b);
                j8 = j10;
                z8 = z9;
            }
            long j11 = yVar.f5848a;
            List list2 = list;
            int i9 = size;
            lVar2.b(j11, new v(j11, yVar.f5849b, yVar.f5851d, yVar.f5852e, yVar.f5853f, j8, D, z8, yVar.f5854g, yVar.f5856i, yVar.f5857j, yVar.f5858k));
            boolean z10 = yVar.f5852e;
            if (z10) {
                lVar.b(j9, new w(yVar.f5849b, yVar.f5850c, z10));
            } else {
                int b10 = j.a.b(lVar.f4756g, lVar.f4758i, j9);
                if (b10 >= 0) {
                    Object[] objArr = lVar.f4757h;
                    if (objArr[b10] != obj2) {
                        objArr[b10] = obj2;
                        lVar.f4755f = true;
                    }
                }
            }
            i8 = i7 + 1;
            list = list2;
            size = i9;
        }
        return new androidx.room.c(lVar2, 12, cVar);
    }

    public synchronized void q(String str) {
        try {
            String n8 = n(str);
            if (n8 == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f5847g).getStringSet(n8, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                ((SharedPreferences) this.f5847g).edit().remove(n8).commit();
            } else {
                ((SharedPreferences) this.f5847g).edit().putStringSet(n8, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void r(Resources.Theme theme, TypedValue typedValue) {
        int i7;
        if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i7 = typedValue.resourceId) == 0) {
            return;
        }
        ((RootActivity) this.f5847g).setTheme(i7);
    }

    public synchronized void s(long j8, String str) {
        String m8 = m(j8);
        if (((SharedPreferences) this.f5847g).getString("last-used-date", "").equals(m8)) {
            String n8 = n(m8);
            if (n8 == null) {
                return;
            }
            if (n8.equals(str)) {
                return;
            }
            t(str, m8);
            return;
        }
        long j9 = ((SharedPreferences) this.f5847g).getLong("fire-count", 0L);
        if (j9 + 1 == 30) {
            b();
            j9 = ((SharedPreferences) this.f5847g).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.f5847g).getStringSet(str, new HashSet()));
        hashSet.add(m8);
        ((SharedPreferences) this.f5847g).edit().putStringSet(str, hashSet).putLong("fire-count", j9 + 1).putString("last-used-date", m8).commit();
    }

    public synchronized void t(String str, String str2) {
        q(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.f5847g).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.f5847g).edit().putStringSet(str, hashSet).commit();
    }

    public /* synthetic */ x(int i7, boolean z8) {
        this.f5846f = i7;
    }

    public x(Context context, String str) {
        this.f5846f = 21;
        this.f5847g = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public x(int i7) {
        this.f5846f = i7;
        switch (i7) {
            case q.c.f7259c /* 9 */:
                this.f5847g = new ConcurrentHashMap(16);
                break;
            case 13:
                r6.k.f(TimeUnit.MINUTES, "timeUnit");
                this.f5847g = new w7.j(v7.d.f9171h);
                break;
            case 19:
                this.f5847g = new LinkedHashSet();
                break;
            default:
                this.f5847g = new i.l(10);
                break;
        }
    }

    public x(t7.a aVar) {
        this.f5846f = 16;
        this.f5847g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
    }

    @Override // r5.c
    public x g() {
        return this;
    }
}
