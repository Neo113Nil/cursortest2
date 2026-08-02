package R1;

import E.AbstractC0005f;
import K1.t;
import K1.u;
import K1.w;
import L1.p;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import i2.AbstractC0457a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
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
import k.q0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2362a;

    /* renamed from: b, reason: collision with root package name */
    public final M1.e f2363b;

    /* renamed from: c, reason: collision with root package name */
    public final S1.d f2364c;

    /* renamed from: d, reason: collision with root package name */
    public final d f2365d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f2366e;

    /* renamed from: f, reason: collision with root package name */
    public final T1.c f2367f;

    /* renamed from: g, reason: collision with root package name */
    public final a2.i f2368g;

    /* renamed from: h, reason: collision with root package name */
    public final a2.i f2369h;

    /* renamed from: i, reason: collision with root package name */
    public final S1.c f2370i;

    public m(Context context, M1.e eVar, S1.d dVar, d dVar2, Executor executor, T1.c cVar, a2.i iVar, a2.i iVar2, S1.c cVar2) {
        this.f2362a = context;
        this.f2363b = eVar;
        this.f2364c = dVar;
        this.f2365d = dVar2;
        this.f2366e = executor;
        this.f2367f = cVar;
        this.f2368g = iVar;
        this.f2369h = iVar2;
        this.f2370i = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final L1.j jVar, int i4) {
        byte[] bArr;
        long j4;
        M1.a aVar;
        String str;
        int i5;
        J1.b d4;
        String str2;
        Integer num;
        q0 q0Var;
        int i6;
        final m mVar = this;
        final L1.j jVar2 = jVar;
        byte[] bArr2 = jVar2.f1646b;
        M1.f a3 = mVar.f2363b.a(jVar2.f1645a);
        long j5 = 0;
        while (true) {
            final int i7 = 0;
            T1.b bVar = new T1.b(mVar) { // from class: R1.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f2350b;

                {
                    this.f2350b = mVar;
                }

                @Override // T1.b
                public final Object c() {
                    Boolean bool;
                    switch (i7) {
                        case 0:
                            L1.j jVar3 = jVar2;
                            S1.j jVar4 = (S1.j) this.f2350b.f2364c;
                            SQLiteDatabase a4 = jVar4.a();
                            a4.beginTransaction();
                            try {
                                Long b4 = S1.j.b(a4, jVar3);
                                if (b4 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = jVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b4.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a4.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a4.endTransaction();
                            }
                        default:
                            S1.j jVar5 = (S1.j) this.f2350b.f2364c;
                            jVar5.getClass();
                            return (Iterable) jVar5.e(new k(jVar5, 2, jVar2));
                    }
                }
            };
            S1.j jVar3 = (S1.j) mVar.f2367f;
            if (!((Boolean) jVar3.n(bVar)).booleanValue()) {
                jVar3.n(new l(j5, mVar, jVar2));
                return;
            }
            final int i8 = 1;
            final Iterable iterable = (Iterable) jVar3.n(new T1.b(mVar) { // from class: R1.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f2350b;

                {
                    this.f2350b = mVar;
                }

                @Override // T1.b
                public final Object c() {
                    Boolean bool;
                    switch (i8) {
                        case 0:
                            L1.j jVar32 = jVar2;
                            S1.j jVar4 = (S1.j) this.f2350b.f2364c;
                            SQLiteDatabase a4 = jVar4.a();
                            a4.beginTransaction();
                            try {
                                Long b4 = S1.j.b(a4, jVar32);
                                if (b4 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = jVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b4.toString()});
                                    try {
                                        Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                                        rawQuery.close();
                                        bool = valueOf;
                                    } catch (Throwable th) {
                                        rawQuery.close();
                                        throw th;
                                    }
                                }
                                a4.setTransactionSuccessful();
                                return bool;
                            } finally {
                                a4.endTransaction();
                            }
                        default:
                            S1.j jVar5 = (S1.j) this.f2350b.f2364c;
                            jVar5.getClass();
                            return (Iterable) jVar5.e(new k(jVar5, 2, jVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            int i9 = 2;
            if (a3 == null) {
                AbstractC0457a.k("Uploader", "Unknown backend for %s, deleting event batch for it...", jVar2);
                bArr = bArr2;
                j4 = j5;
                aVar = new M1.a(3, -1L);
                i5 = 2;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((S1.b) it.next()).f2577c);
                }
                if (bArr2 != null) {
                    S1.c cVar = mVar.f2370i;
                    Objects.requireNonNull(cVar);
                    O1.a aVar2 = (O1.a) jVar3.n(new D0.a(i9, cVar));
                    L1.h hVar = new L1.h();
                    hVar.f1638f = new HashMap();
                    hVar.f1636d = Long.valueOf(mVar.f2368g.q());
                    hVar.f1637e = Long.valueOf(mVar.f2369h.q());
                    hVar.f1633a = "GDT_CLIENT_METRICS";
                    I1.b bVar2 = new I1.b("proto");
                    aVar2.getClass();
                    B1.j jVar4 = p.f1658a;
                    jVar4.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        jVar4.j(aVar2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    hVar.f1635c = new L1.n(bVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((J1.c) a3).a(hVar.d()));
                }
                J1.c cVar2 = (J1.c) a3;
                HashMap hashMap = new HashMap();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    L1.i iVar = (L1.i) obj;
                    String str3 = iVar.f1639a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(iVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(iVar);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Map.Entry entry : hashMap.entrySet()) {
                    L1.i iVar2 = (L1.i) ((List) entry.getValue()).get(0);
                    w wVar = w.f1525a;
                    long q4 = cVar2.f1164f.q();
                    long q5 = cVar2.f1163e.q();
                    K1.j jVar5 = new K1.j(new K1.h(Integer.valueOf(iVar2.b("sdk-version")), iVar2.a(CommonUrlParts.MODEL), iVar2.a("hardware"), iVar2.a("device"), iVar2.a("product"), iVar2.a("os-uild"), iVar2.a(CommonUrlParts.MANUFACTURER), iVar2.a("fingerprint"), iVar2.a(CommonUrlParts.LOCALE), iVar2.a("country"), iVar2.a("mcc_mnc"), iVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (L1.i iVar3 : (List) entry.getValue()) {
                        byte[] bArr3 = bArr2;
                        L1.n nVar = iVar3.f1641c;
                        I1.b bVar3 = nVar.f1655a;
                        byte[] bArr4 = nVar.f1656b;
                        long j6 = j5;
                        if (bVar3.equals(new I1.b("proto"))) {
                            q0Var = new q0();
                            q0Var.f14085d = bArr4;
                        } else if (bVar3.equals(new I1.b("json"))) {
                            String str4 = new String(bArr4, Charset.forName(CharEncoding.UTF_8));
                            q0 q0Var2 = new q0();
                            q0Var2.f14086e = str4;
                            q0Var = q0Var2;
                        } else {
                            String r4 = AbstractC0457a.r("CctTransportBackend");
                            if (Log.isLoggable(r4, 5)) {
                                Log.w(r4, "Received event of unsupported encoding " + bVar3 + ". Skipping...");
                            }
                            bArr2 = bArr3;
                            j5 = j6;
                        }
                        q0Var.f14082a = Long.valueOf(iVar3.f1642d);
                        q0Var.f14084c = Long.valueOf(iVar3.f1643e);
                        String str5 = (String) iVar3.f1644f.get("tz-offset");
                        q0Var.f14087f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        q0Var.f14088g = new K1.n((u) u.f1523a.get(iVar3.b("net-type")), (t) t.f1521a.get(iVar3.b("mobile-subtype")));
                        Integer num2 = iVar3.f1640b;
                        if (num2 != null) {
                            q0Var.f14083b = num2;
                        }
                        String str6 = ((Long) q0Var.f14082a) == null ? " eventTimeMs" : "";
                        if (((Long) q0Var.f14084c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) q0Var.f14087f) == null) {
                            str6 = AbstractC0005f.z(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new K1.k(((Long) q0Var.f14082a).longValue(), (Integer) q0Var.f14083b, ((Long) q0Var.f14084c).longValue(), (byte[]) q0Var.f14085d, (String) q0Var.f14086e, ((Long) q0Var.f14087f).longValue(), (K1.n) q0Var.f14088g));
                        bArr2 = bArr3;
                        j5 = j6;
                    }
                    arrayList3.add(new K1.l(q4, q5, jVar5, num, str2, arrayList4));
                    bArr2 = bArr2;
                }
                bArr = bArr2;
                j4 = j5;
                K1.i iVar4 = new K1.i(arrayList3);
                URL url = cVar2.f1162d;
                if (bArr != null) {
                    try {
                        J1.a a4 = J1.a.a(bArr);
                        str = a4.f1155b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a4.f1154a;
                        if (str7 != null) {
                            url = J1.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new M1.a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    B1.j jVar6 = new B1.j(url, iVar4, str, 2);
                    D0.a aVar3 = new D0.a(1, cVar2);
                    int i11 = 5;
                    do {
                        d4 = aVar3.d(jVar6);
                        URL url2 = (URL) d4.f1158c;
                        if (url2 != null) {
                            AbstractC0457a.k("CctTransportBackend", "Following redirect to: %s", url2);
                            jVar6 = new B1.j(url2, (K1.i) jVar6.f202c, (String) jVar6.f203d, 2);
                        } else {
                            jVar6 = null;
                        }
                        if (jVar6 == null) {
                            break;
                        } else {
                            i11--;
                        }
                    } while (i11 >= 1);
                    int i12 = d4.f1156a;
                    if (i12 == 200) {
                        aVar = new M1.a(1, d4.f1157b);
                    } else if (i12 >= 500 || i12 == 404) {
                        aVar = new M1.a(2, -1L);
                    } else if (i12 == 400) {
                        try {
                            aVar = new M1.a(4, -1L);
                        } catch (IOException e4) {
                            e = e4;
                            AbstractC0457a.o("CctTransportBackend", "Could not make request to the backend", e);
                            i5 = 2;
                            aVar = new M1.a(2, -1L);
                            i6 = aVar.f1737a;
                            if (i6 != i5) {
                            }
                        }
                    } else {
                        aVar = new M1.a(3, -1L);
                    }
                    i5 = 2;
                } catch (IOException e5) {
                    e = e5;
                }
            }
            i6 = aVar.f1737a;
            if (i6 != i5) {
                final long j7 = j4;
                jVar3.n(new T1.b() { // from class: R1.j
                    @Override // T1.b
                    public final Object c() {
                        m mVar2 = m.this;
                        S1.j jVar7 = (S1.j) mVar2.f2364c;
                        jVar7.getClass();
                        Iterable iterable2 = iterable;
                        if (iterable2.iterator().hasNext()) {
                            String str8 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + S1.j.s(iterable2);
                            SQLiteDatabase a5 = jVar7.a();
                            a5.beginTransaction();
                            try {
                                a5.compileStatement(str8).execute();
                                Cursor rawQuery = a5.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                try {
                                    Cursor cursor = rawQuery;
                                    while (cursor.moveToNext()) {
                                        jVar7.k(cursor.getInt(0), O1.c.MAX_RETRIES_REACHED, cursor.getString(1));
                                    }
                                    rawQuery.close();
                                    a5.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                                    a5.setTransactionSuccessful();
                                } catch (Throwable th) {
                                    rawQuery.close();
                                    throw th;
                                }
                            } finally {
                                a5.endTransaction();
                            }
                        }
                        jVar7.e(new S1.f(mVar2.f2368g.q() + j7, jVar));
                        return null;
                    }
                });
                this.f2365d.a(jVar, i4 + 1, true);
                return;
            }
            jVar2 = jVar;
            long j8 = j4;
            jVar3.n(new k(this, 0, iterable));
            if (i6 == 1) {
                j5 = Math.max(j8, aVar.f1738b);
                if (bArr != null) {
                    jVar3.n(new D0.a(4, this));
                }
            } else {
                if (i6 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String str8 = ((S1.b) it2.next()).f2577c.f1639a;
                        if (hashMap2.containsKey(str8)) {
                            hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                        } else {
                            hashMap2.put(str8, 1);
                        }
                    }
                    jVar3.n(new k(this, 1, hashMap2));
                }
                j5 = j8;
            }
            mVar = this;
            bArr2 = bArr;
        }
    }
}
