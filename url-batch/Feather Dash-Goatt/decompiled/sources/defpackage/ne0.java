package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.AdRevenueScheme;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ne0 {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public ne0() {
        long[] jArr = q61.a;
        this.a = new vn0();
        wn0 wn0Var = r61.a;
        this.c = new wn0();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ke0(this);
    }

    public static int f(int[] iArr, sf0 sf0Var) {
        sf0Var.getClass();
        int i = iArr[0] + sf0Var.l;
        iArr[0] = i;
        return Math.max(0, i);
    }

    public long a() {
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        qy0.u(arrayList.get(0));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03e3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(cc ccVar, int i) {
        byte[] bArr;
        long j;
        eb ebVar;
        String str;
        int i2;
        bg a;
        String str2;
        Integer num;
        ek ekVar;
        ArrayList arrayList;
        int i3;
        final ne0 ne0Var = this;
        final cc ccVar2 = ccVar;
        byte[] bArr2 = ccVar2.b;
        b51 b51Var = (b51) ne0Var.f;
        fj1 a2 = ((ql0) ne0Var.b).a(ccVar2.a);
        long j2 = 0;
        while (true) {
            final int i4 = 0;
            if (!((Boolean) b51Var.f(new bg1(ne0Var) { // from class: xl1
                public final /* synthetic */ ne0 e;

                {
                    this.e = ne0Var;
                }

                @Override // defpackage.bg1
                public final Object b() {
                    Boolean bool;
                    int i5 = i4;
                    cc ccVar3 = ccVar2;
                    ne0 ne0Var2 = this.e;
                    switch (i5) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            b51 b51Var2 = (b51) ne0Var2.c;
                            SQLiteDatabase a3 = b51Var2.a();
                            a3.beginTransaction();
                            try {
                                Long b = b51.b(a3, ccVar3);
                                if (b == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = b51Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a3.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a3.endTransaction();
                            }
                        default:
                            b51 b51Var3 = (b51) ne0Var2.c;
                            b51Var3.getClass();
                            return (Iterable) b51Var3.c(new bk(b51Var3, 5, ccVar3));
                    }
                }
            })).booleanValue()) {
                b51Var.f(new y41(j2, ne0Var, ccVar2));
                return;
            }
            final int i5 = 1;
            Iterable iterable = (Iterable) b51Var.f(new bg1(ne0Var) { // from class: xl1
                public final /* synthetic */ ne0 e;

                {
                    this.e = ne0Var;
                }

                @Override // defpackage.bg1
                public final Object b() {
                    Boolean bool;
                    int i52 = i5;
                    cc ccVar3 = ccVar2;
                    ne0 ne0Var2 = this.e;
                    switch (i52) {
                        case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                            b51 b51Var2 = (b51) ne0Var2.c;
                            SQLiteDatabase a3 = b51Var2.a();
                            a3.beginTransaction();
                            try {
                                Long b = b51.b(a3, ccVar3);
                                if (b == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = b51Var2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a3.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a3.endTransaction();
                            }
                        default:
                            b51 b51Var3 = (b51) ne0Var2.c;
                            b51Var3.getClass();
                            return (Iterable) b51Var3.c(new bk(b51Var3, 5, ccVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a2 == null) {
                xa0.k("Uploader", "Unknown backend for %s, deleting event batch for it...", ccVar2);
                ebVar = new eb(3, -1L);
                bArr = bArr2;
                j = j2;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ub) it.next()).c);
                }
                if (bArr2 != null) {
                    b51 b51Var2 = (b51) ne0Var.i;
                    Objects.requireNonNull(b51Var2);
                    ih ihVar = (ih) b51Var.f(new vl1(b51Var2, i4));
                    jb jbVar = new jb();
                    jbVar.f = new HashMap();
                    jbVar.d = Long.valueOf(((me1) ne0Var.g).d());
                    jbVar.e = Long.valueOf(((me1) ne0Var.h).d());
                    jbVar.a = "GDT_CLIENT_METRICS";
                    vv vvVar = new vv("proto");
                    ihVar.getClass();
                    i8 i8Var = e01.a;
                    i8Var.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        i8Var.f(ihVar, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    jbVar.c = new sv(vvVar, byteArrayOutputStream.toByteArray());
                    arrayList2.add(((cg) a2).a(jbVar.g()));
                }
                cg cgVar = (cg) a2;
                HashMap hashMap = new HashMap();
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList2.get(i6);
                    i6++;
                    kb kbVar = (kb) obj;
                    String str3 = kbVar.a;
                    if (hashMap.containsKey(str3)) {
                        arrayList = arrayList2;
                        ((List) hashMap.get(str3)).add(kbVar);
                    } else {
                        arrayList = arrayList2;
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(kbVar);
                        hashMap.put(str3, arrayList3);
                    }
                    arrayList2 = arrayList;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    kb kbVar2 = (kb) ((List) entry.getValue()).get(0);
                    t01 t01Var = t01.d;
                    long d = cgVar.f.d();
                    long d2 = cgVar.e.d();
                    gb gbVar = new gb(new db(Integer.valueOf(kbVar2.b("sdk-version")), kbVar2.a("model"), kbVar2.a("hardware"), kbVar2.a("device"), kbVar2.a("product"), kbVar2.a("os-uild"), kbVar2.a("manufacturer"), kbVar2.a("fingerprint"), kbVar2.a("locale"), kbVar2.a(AdRevenueScheme.COUNTRY), kbVar2.a("mcc_mnc"), kbVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList5 = new ArrayList();
                    for (kb kbVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        sv svVar = kbVar3.c;
                        vv vvVar2 = svVar.a;
                        byte[] bArr4 = svVar.b;
                        long j3 = j2;
                        if (vvVar2.equals(new vv("proto"))) {
                            ekVar = new ek();
                            ekVar.h = bArr4;
                        } else if (vvVar2.equals(new vv("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            ek ekVar2 = new ek();
                            ekVar2.i = str4;
                            ekVar = ekVar2;
                        } else {
                            String concat = "TRuntime.".concat("CctTransportBackend");
                            if (Log.isLoggable(concat, 5)) {
                                Log.w(concat, "Received event of unsupported encoding " + vvVar2 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                        ekVar.d = Long.valueOf(kbVar3.d);
                        ekVar.g = Long.valueOf(kbVar3.e);
                        String str5 = (String) kbVar3.f.get("tz-offset");
                        ekVar.j = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        ekVar.k = new tb((cp0) cp0.d.get(kbVar3.b("net-type")), (bp0) bp0.d.get(kbVar3.b("mobile-subtype")));
                        Integer num2 = kbVar3.b;
                        if (num2 != null) {
                            ekVar.e = num2;
                        }
                        String str6 = ((Long) ekVar.d) == null ? " eventTimeMs" : "";
                        if (((Long) ekVar.g) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) ekVar.j) == null) {
                            str6 = str6.concat(" timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            dd0.j("Missing required properties:".concat(str6));
                            return;
                        } else {
                            arrayList5.add(new qb(((Long) ekVar.d).longValue(), (Integer) ekVar.e, ((Long) ekVar.g).longValue(), (byte[]) ekVar.h, (String) ekVar.i, ((Long) ekVar.j).longValue(), (tb) ekVar.k));
                            bArr2 = bArr3;
                            j2 = j3;
                        }
                    }
                    arrayList4.add(new rb(d, d2, gbVar, num, str2, arrayList5));
                }
                bArr = bArr2;
                j = j2;
                fb fbVar = new fb(arrayList4);
                URL url = cgVar.d;
                if (bArr != null) {
                    try {
                        gf a3 = gf.a(bArr);
                        str = a3.b;
                        if (str == null) {
                            str = null;
                        }
                        url = cg.b(a3.a);
                    } catch (IllegalArgumentException unused3) {
                        ebVar = new eb(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    i8 i8Var2 = new i8(url, fbVar, str, 5);
                    m2 m2Var = new m2(1, cgVar);
                    int i7 = 5;
                    do {
                        a = m2Var.a(i8Var2);
                        URL url2 = (URL) a.c;
                        if (url2 != null) {
                            xa0.k("CctTransportBackend", "Following redirect to: %s", url2);
                            i8Var2 = new i8(url2, (fb) i8Var2.g, (String) i8Var2.h, 5);
                        } else {
                            i8Var2 = null;
                        }
                        if (i8Var2 == null) {
                            break;
                        } else {
                            i7--;
                        }
                    } while (i7 >= 1);
                    int i8 = a.b;
                    if (i8 == 200) {
                        ebVar = new eb(1, a.a);
                    } else if (i8 >= 500 || i8 == 404) {
                        ebVar = new eb(2, -1L);
                    } else if (i8 == 400) {
                        try {
                            ebVar = new eb(4, -1L);
                        } catch (IOException e) {
                            e = e;
                            xa0.l("CctTransportBackend", "Could not make request to the backend", e);
                            i2 = 2;
                            ebVar = new eb(2, -1L);
                            i3 = ebVar.a;
                            if (i3 != i2) {
                            }
                        }
                    } else {
                        ebVar = new eb(3, -1L);
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            }
            i2 = 2;
            i3 = ebVar.a;
            if (i3 != i2) {
                b51Var.f(new ar(this, iterable, ccVar, j));
                ((i8) this.d).o(ccVar, i + 1, true);
                return;
            }
            ne0Var = this;
            ccVar2 = ccVar;
            long j4 = j;
            b51Var.f(new bk(ne0Var, 6, iterable));
            if (i3 == 1) {
                j2 = Math.max(j4, ebVar.b);
                if (bArr != null) {
                    b51Var.f(new m2(3, ne0Var));
                }
            } else {
                if (i3 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str7 = ((ub) it2.next()).c.a;
                        if (hashMap2.containsKey(str7)) {
                            hashMap2.put(str7, Integer.valueOf(((Integer) hashMap2.get(str7)).intValue() + 1));
                        } else {
                            hashMap2.put(str7, 1);
                        }
                    }
                    b51Var.f(new bk(ne0Var, 7, hashMap2));
                }
                j2 = j4;
            }
            bArr2 = bArr;
        }
    }

    public void c(int i, int i2, ArrayList arrayList, u5 u5Var, pf0 pf0Var, boolean z, boolean z2, int i3, int i4) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        Throwable th;
        vn0 vn0Var;
        int i5;
        ne0 ne0Var;
        int i6;
        Object[] objArr;
        Object[] objArr2;
        int i7;
        int i8;
        ArrayList arrayList4 = (ArrayList) this.e;
        ArrayList arrayList5 = (ArrayList) this.d;
        wn0 wn0Var = (wn0) this.c;
        Object obj = this.a;
        vn0 vn0Var2 = (vn0) obj;
        ArrayList arrayList6 = (ArrayList) this.g;
        ArrayList arrayList7 = (ArrayList) this.f;
        u5 u5Var2 = (u5) this.b;
        this.b = u5Var;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            sf0 sf0Var = (sf0) arrayList.get(i9);
            Object obj2 = obj;
            int i10 = size;
            int i11 = 0;
            for (int size2 = sf0Var.b.size(); i11 < size2; size2 = size2) {
                ((zw0) sf0Var.b.get(i11)).h();
                i11++;
            }
            i9++;
            size = i10;
            obj = obj2;
        }
        Object obj3 = obj;
        if (vn0Var2.i()) {
            d();
            return;
        }
        boolean z3 = z || !z2;
        Object[] objArr3 = vn0Var2.b;
        long[] jArr = vn0Var2.a;
        int i12 = 2;
        int length = jArr.length - 2;
        boolean z4 = z3;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j = jArr[i13];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j & 255) < 128) {
                            i8 = i15;
                            wn0Var.a(objArr3[(i13 << 3) + i15]);
                        } else {
                            i8 = i15;
                        }
                        j >>= 8;
                        i15 = i8 + 1;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        int size3 = arrayList.size();
        for (int i16 = 0; i16 < size3; i16++) {
            sf0 sf0Var2 = (sf0) arrayList.get(i16);
            Object obj4 = sf0Var2.g;
            List list = sf0Var2.b;
            wn0Var.l(obj4);
            int size4 = list.size();
            for (int i17 = 0; i17 < size4; i17++) {
                ((zw0) list.get(i17)).h();
            }
            qy0.u(((vn0) obj3).k(sf0Var2.g));
        }
        int[] iArr = new int[1];
        if (z4 && u5Var2 != null) {
            if (arrayList5.isEmpty()) {
                i7 = 0;
            } else {
                if (arrayList5.size() > 1) {
                    di.i(arrayList5, new me0(u5Var2, i12));
                }
                if (arrayList5.size() > 0) {
                    sf0 sf0Var3 = (sf0) arrayList5.get(0);
                    f(iArr, sf0Var3);
                    Object g = vn0Var2.g(sf0Var3.g);
                    g.getClass();
                    qy0.u(g);
                    sf0Var3.a(0);
                    throw null;
                }
                i7 = 0;
                Arrays.fill(iArr, 0, 1, 0);
            }
            if (!arrayList4.isEmpty()) {
                if (arrayList4.size() > 1) {
                    di.i(arrayList4, new me0(u5Var2, i7));
                }
                if (arrayList4.size() > 0) {
                    sf0 sf0Var4 = (sf0) arrayList4.get(i7);
                    f(iArr, sf0Var4);
                    Object g2 = vn0Var2.g(sf0Var4.g);
                    g2.getClass();
                    qy0.u(g2);
                    sf0Var4.a(i7);
                    throw null;
                }
                Arrays.fill(iArr, i7, 1, i7);
            }
        }
        Object[] objArr4 = wn0Var.b;
        long[] jArr2 = wn0Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            th = null;
            vn0Var = vn0Var2;
            int i18 = 0;
            while (true) {
                long j2 = jArr2[i18];
                arrayList2 = arrayList4;
                arrayList3 = arrayList5;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j2 & 255) < 128) {
                            objArr2 = objArr4;
                            qy0.u(vn0Var.g(objArr2[(i18 << 3) + i20]));
                        } else {
                            objArr2 = objArr4;
                        }
                        j2 >>= 8;
                        i20++;
                        objArr4 = objArr2;
                    }
                    objArr = objArr4;
                    if (i19 != 8) {
                        break;
                    }
                } else {
                    objArr = objArr4;
                }
                if (i18 == length2) {
                    break;
                }
                i18++;
                arrayList4 = arrayList2;
                arrayList5 = arrayList3;
                objArr4 = objArr;
            }
        } else {
            arrayList2 = arrayList4;
            arrayList3 = arrayList5;
            th = null;
            vn0Var = vn0Var2;
        }
        if (arrayList7.isEmpty()) {
            i5 = 1;
            ne0Var = this;
            i6 = i;
        } else {
            if (arrayList7.size() > 1) {
                di.i(arrayList7, new me0(u5Var, 3));
            }
            int size5 = arrayList7.size();
            for (int i21 = 0; i21 < size5; i21++) {
                sf0 sf0Var5 = (sf0) arrayList7.get(i21);
                Object g3 = vn0Var.g(sf0Var5.g);
                g3.getClass();
                qy0.u(g3);
                sf0Var5.c((z ? (int) (((sf0) CollectionsKt.p(arrayList)).a(0) & 4294967295L) : 0) - f(iArr, sf0Var5), i, i2);
                if (z4) {
                    e(sf0Var5, true);
                    throw th;
                }
            }
            ne0Var = this;
            i6 = i;
            i5 = 1;
            Arrays.fill(iArr, 0, 1, 0);
        }
        if (!arrayList6.isEmpty()) {
            if (arrayList6.size() > i5) {
                di.i(arrayList6, new me0(u5Var, i5));
            }
            int size6 = arrayList6.size();
            for (int i22 = 0; i22 < size6; i22++) {
                sf0 sf0Var6 = (sf0) arrayList6.get(i22);
                Object g4 = vn0Var.g(sf0Var6.g);
                g4.getClass();
                qy0.u(g4);
                sf0Var6.c((0 - sf0Var6.l) + f(iArr, sf0Var6), i6, i2);
                if (z4) {
                    ne0Var.e(sf0Var6, true);
                    throw th;
                }
            }
        }
        Collections.reverse(arrayList7);
        arrayList.addAll(0, arrayList7);
        arrayList.addAll(arrayList6);
        arrayList3.clear();
        arrayList2.clear();
        arrayList7.clear();
        arrayList6.clear();
        wn0Var.b();
    }

    public void d() {
        vn0 vn0Var = (vn0) this.a;
        if (vn0Var.j()) {
            Object[] objArr = vn0Var.c;
            long[] jArr = vn0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                qy0.u(objArr[(i << 3) + i3]);
                                throw null;
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            vn0Var.a();
        }
    }

    public void e(sf0 sf0Var, boolean z) {
        Object g = ((vn0) this.a).g(sf0Var.g);
        g.getClass();
        qy0.u(g);
        throw null;
    }

    public ne0(Context context, ql0 ql0Var, b51 b51Var, i8 i8Var, Executor executor, b51 b51Var2, me1 me1Var, me1 me1Var2, b51 b51Var3) {
        this.a = context;
        this.b = ql0Var;
        this.c = b51Var;
        this.d = i8Var;
        this.e = executor;
        this.f = b51Var2;
        this.g = me1Var;
        this.h = me1Var2;
        this.i = b51Var3;
    }
}
