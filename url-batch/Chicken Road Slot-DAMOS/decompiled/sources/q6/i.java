package q6;

import a1.n;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import c6.p;
import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.internal.measurement.ra;
import j6.j;
import j6.l;
import j6.t;
import j6.u;
import j6.w;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k6.k;
import k6.m;
import kotlin.collections.i0;
import m.g2;
import s7.c0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8051a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8052b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f8053c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f8054d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f8055e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f8056f;
    public Object g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f8057h;

    /* renamed from: i, reason: collision with root package name */
    public Object f8058i;

    public i(Context context, t5.b bVar, n nVar, u5.e eVar, WorkDatabase workDatabase, p pVar, ArrayList arrayList) {
        this.f8058i = new p.e(14);
        this.f8051a = context.getApplicationContext();
        this.f8053c = nVar;
        this.f8052b = eVar;
        this.f8054d = bVar;
        this.f8055e = workDatabase;
        this.f8056f = pVar;
        this.f8057h = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(k6.i iVar, int i3) {
        byte[] bArr;
        long j;
        l6.a aVar;
        String str;
        l6.a aVar2;
        int i10;
        i6.b c10;
        String str2;
        Integer num;
        g2 g2Var;
        int i11;
        final i iVar2 = this;
        final k6.i iVar3 = iVar;
        byte[] bArr2 = iVar3.f5465b;
        r6.g gVar = (r6.g) iVar2.f8054d;
        l6.e a9 = ((l6.d) iVar2.f8052b).a(iVar3.f5464a);
        long j3 = 0;
        while (true) {
            final int i12 = 0;
            if (!((Boolean) gVar.m(new s6.b(iVar2) { // from class: q6.g

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ i f8046e;

                {
                    this.f8046e = iVar2;
                }

                @Override // s6.b
                public final Object a() {
                    Boolean bool;
                    switch (i12) {
                        case 0:
                            k6.i iVar4 = iVar3;
                            r6.g gVar2 = (r6.g) this.f8046e.f8053c;
                            SQLiteDatabase a10 = gVar2.a();
                            a10.beginTransaction();
                            try {
                                Long d10 = r6.g.d(a10, iVar4);
                                if (d10 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = gVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{d10.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a10.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a10.endTransaction();
                            }
                        default:
                            r6.g gVar3 = (r6.g) this.f8046e.f8053c;
                            gVar3.getClass();
                            return (Iterable) gVar3.h(new com.google.firebase.messaging.f(8, gVar3, iVar3));
                    }
                }
            })).booleanValue()) {
                gVar.m(new h(j3, iVar2, iVar3));
                return;
            }
            final int i13 = 1;
            Iterable iterable = (Iterable) gVar.m(new s6.b(iVar2) { // from class: q6.g

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ i f8046e;

                {
                    this.f8046e = iVar2;
                }

                @Override // s6.b
                public final Object a() {
                    Boolean bool;
                    switch (i13) {
                        case 0:
                            k6.i iVar4 = iVar3;
                            r6.g gVar2 = (r6.g) this.f8046e.f8053c;
                            SQLiteDatabase a10 = gVar2.a();
                            a10.beginTransaction();
                            try {
                                Long d10 = r6.g.d(a10, iVar4);
                                if (d10 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = gVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{d10.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a10.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a10.endTransaction();
                            }
                        default:
                            r6.g gVar3 = (r6.g) this.f8046e.f8053c;
                            gVar3.getClass();
                            return (Iterable) gVar3.h(new com.google.firebase.messaging.f(8, gVar3, iVar3));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (a9 == null) {
                k7.e.l("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar3);
                aVar2 = new l6.a(3, -1L);
                bArr = bArr2;
                j = j3;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((r6.b) it.next()).f8189c);
                }
                if (bArr2 != null) {
                    r6.g gVar2 = (r6.g) iVar2.f8055e;
                    Objects.requireNonNull(gVar2);
                    n6.a aVar3 = (n6.a) gVar.m(new e(gVar2, i12));
                    ra raVar = new ra();
                    raVar.f2742f = new HashMap();
                    raVar.f2740d = Long.valueOf(((c0) iVar2.f8057h).g());
                    raVar.f2741e = Long.valueOf(((c0) iVar2.f8058i).g());
                    raVar.f2737a = "GDT_CLIENT_METRICS";
                    h6.c cVar = new h6.c("proto");
                    aVar3.getClass();
                    p.e eVar = m.f5476a;
                    eVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        eVar.e(aVar3, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    raVar.f2739c = new k(cVar, byteArrayOutputStream.toByteArray());
                    arrayList.add(((i6.c) a9).a(raVar.c()));
                }
                i6.c cVar2 = (i6.c) a9;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList.get(i14);
                    i14++;
                    k6.h hVar = (k6.h) obj;
                    String str3 = hVar.f5458a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(hVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    k6.h hVar2 = (k6.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f5102d;
                    long g = cVar2.f4661f.g();
                    long g2 = cVar2.f4660e.g();
                    j jVar = new j(new j6.h(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a("model"), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a("manufacturer"), hVar2.a("fingerprint"), hVar2.a("locale"), hVar2.a(AdRevenueScheme.COUNTRY), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (k6.h hVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        k kVar = hVar3.f5460c;
                        h6.c cVar3 = kVar.f5473a;
                        byte[] bArr4 = kVar.f5474b;
                        long j10 = j3;
                        if (cVar3.equals(new h6.c("proto"))) {
                            g2Var = new g2();
                            g2Var.f6080r = bArr4;
                        } else if (cVar3.equals(new h6.c("json"))) {
                            String str4 = new String(bArr4, Charset.forName("UTF-8"));
                            g2 g2Var2 = new g2();
                            g2Var2.f6081s = str4;
                            g2Var = g2Var2;
                        } else {
                            String v10 = k7.e.v("CctTransportBackend");
                            if (Log.isLoggable(v10, 5)) {
                                Log.w(v10, "Received event of unsupported encoding " + cVar3 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j3 = j10;
                        }
                        g2Var.f6077d = Long.valueOf(hVar3.f5461d);
                        g2Var.f6079i = Long.valueOf(hVar3.f5462e);
                        String str5 = (String) hVar3.f5463f.get("tz-offset");
                        g2Var.f6082t = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        g2Var.f6083u = new j6.n((u) u.f5100d.get(hVar3.b("net-type")), (t) t.f5098d.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.f5459b;
                        if (num2 != null) {
                            g2Var.f6078e = num2;
                        }
                        String str6 = ((Long) g2Var.f6077d) == null ? " eventTimeMs" : "";
                        if (((Long) g2Var.f6079i) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) g2Var.f6082t) == null) {
                            str6 = str6.concat(" timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            i0.l("Missing required properties:".concat(str6));
                            return;
                        } else {
                            arrayList4.add(new j6.k(((Long) g2Var.f6077d).longValue(), (Integer) g2Var.f6078e, ((Long) g2Var.f6079i).longValue(), (byte[]) g2Var.f6080r, (String) g2Var.f6081s, ((Long) g2Var.f6082t).longValue(), (j6.n) g2Var.f6083u));
                            bArr2 = bArr3;
                            j3 = j10;
                        }
                    }
                    arrayList3.add(new l(g, g2, jVar, num, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j = j3;
                j6.i iVar4 = new j6.i(arrayList3);
                URL url = cVar2.f4659d;
                if (bArr != null) {
                    try {
                        i6.a a10 = i6.a.a(bArr);
                        str = a10.f4652b;
                        if (str == null) {
                            str = null;
                        }
                        url = i6.c.b(a10.f4651a);
                    } catch (IllegalArgumentException unused3) {
                        aVar = new l6.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    n nVar = new n(url, iVar4, str);
                    b1.h hVar4 = new b1.h(7, cVar2);
                    int i15 = 5;
                    do {
                        c10 = hVar4.c(nVar);
                        URL url2 = (URL) c10.f4655c;
                        if (url2 != null) {
                            k7.e.l("CctTransportBackend", "Following redirect to: %s", url2);
                            nVar = new n(url2, (j6.i) nVar.f42r, (String) nVar.f40e);
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            break;
                        } else {
                            i15--;
                        }
                    } while (i15 >= 1);
                    int i16 = c10.f4654b;
                    if (i16 == 200) {
                        aVar2 = new l6.a(1, c10.f4653a);
                    } else {
                        if (i16 >= 500 || i16 == 404) {
                            aVar = new l6.a(2, -1L);
                        } else if (i16 == 400) {
                            try {
                                aVar = new l6.a(4, -1L);
                            } catch (IOException e2) {
                                e = e2;
                                k7.e.p("CctTransportBackend", "Could not make request to the backend", e);
                                i10 = 2;
                                aVar2 = new l6.a(2, -1L);
                                i11 = aVar2.f5880a;
                                if (i11 != i10) {
                                }
                            }
                        } else {
                            aVar = new l6.a(3, -1L);
                        }
                        aVar2 = aVar;
                    }
                } catch (IOException e9) {
                    e = e9;
                }
            }
            i10 = 2;
            i11 = aVar2.f5880a;
            if (i11 != i10) {
                gVar.m(new m8.b(this, iterable, iVar, j));
                ((p.e) this.f8056f).i(iVar, i3 + 1, true);
                return;
            }
            iVar2 = this;
            iVar3 = iVar;
            j3 = j;
            gVar.m(new com.google.firebase.messaging.f(6, iVar2, iterable));
            if (i11 == 1) {
                j3 = Math.max(j3, aVar2.f5881b);
                if (bArr != null) {
                    gVar.m(new b1.h(9, iVar2));
                }
            } else if (i11 == 4) {
                HashMap hashMap2 = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String str7 = ((r6.b) it2.next()).f8189c.f5458a;
                    if (hashMap2.containsKey(str7)) {
                        hashMap2.put(str7, Integer.valueOf(((Integer) hashMap2.get(str7)).intValue() + 1));
                    } else {
                        hashMap2.put(str7, 1);
                    }
                }
                gVar.m(new com.google.firebase.messaging.f(7, iVar2, hashMap2));
            }
            bArr2 = bArr;
        }
    }

    public i(Context context, l6.d dVar, r6.g gVar, p.e eVar, Executor executor, r6.g gVar2, c0 c0Var, c0 c0Var2, r6.g gVar3) {
        this.f8051a = context;
        this.f8052b = dVar;
        this.f8053c = gVar;
        this.f8056f = eVar;
        this.g = executor;
        this.f8054d = gVar2;
        this.f8057h = c0Var;
        this.f8058i = c0Var2;
        this.f8055e = gVar3;
    }
}
