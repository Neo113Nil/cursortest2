package B0;

import E1.AbstractC0033i;
import Y1.E;
import a.AbstractC0129a;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
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
import l.t0;
import s0.C1185b;
import t0.C1189a;
import u0.t;
import u0.u;
import u0.w;
import w0.C1232a;
import y0.C1251a;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f148a;

    /* renamed from: b, reason: collision with root package name */
    public final w0.f f149b;

    /* renamed from: c, reason: collision with root package name */
    public final C0.d f150c;

    /* renamed from: d, reason: collision with root package name */
    public final d f151d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f152e;
    public final D0.c f;

    /* renamed from: g, reason: collision with root package name */
    public final K0.j f153g;

    /* renamed from: h, reason: collision with root package name */
    public final K0.j f154h;

    /* renamed from: i, reason: collision with root package name */
    public final C0.c f155i;

    public m(Context context, w0.f fVar, C0.d dVar, d dVar2, Executor executor, D0.c cVar, K0.j jVar, K0.j jVar2, C0.c cVar2) {
        this.f148a = context;
        this.f149b = fVar;
        this.f150c = dVar;
        this.f151d = dVar2;
        this.f152e = executor;
        this.f = cVar;
        this.f153g = jVar;
        this.f154h = jVar2;
        this.f155i = cVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(final v0.i iVar, int i3) {
        w0.g gVar;
        byte[] bArr;
        C1232a c1232a;
        String str;
        int i4;
        t0.b c3;
        C1232a c1232a2;
        String str2;
        Integer num;
        w0.g gVar2;
        byte[] bArr2;
        t0 t0Var;
        int i5;
        final m mVar = this;
        final v0.i iVar2 = iVar;
        final int i6 = 1;
        final int i7 = 0;
        w0.g a3 = mVar.f149b.a(iVar2.f10554a);
        long j3 = 0;
        while (true) {
            D0.b bVar = new D0.b(mVar) { // from class: B0.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f136b;

                {
                    this.f136b = mVar;
                }

                @Override // D0.b
                public final Object execute() {
                    Boolean bool;
                    switch (i7) {
                        case 0:
                            v0.i iVar3 = iVar2;
                            C0.k kVar = (C0.k) this.f136b.f150c;
                            SQLiteDatabase a4 = kVar.a();
                            a4.beginTransaction();
                            try {
                                Long b3 = C0.k.b(a4, iVar3);
                                if (b3 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = kVar.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()});
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
                            C0.k kVar2 = (C0.k) this.f136b.f150c;
                            kVar2.getClass();
                            return (Iterable) kVar2.c(new k(kVar2, 2, iVar2));
                    }
                }
            };
            C0.k kVar = (C0.k) mVar.f;
            if (!((Boolean) kVar.f(bVar)).booleanValue()) {
                kVar.f(new l(j3, mVar, iVar2));
                return;
            }
            final Iterable iterable = (Iterable) kVar.f(new D0.b(mVar) { // from class: B0.i

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f136b;

                {
                    this.f136b = mVar;
                }

                @Override // D0.b
                public final Object execute() {
                    Boolean bool;
                    switch (i6) {
                        case 0:
                            v0.i iVar3 = iVar2;
                            C0.k kVar2 = (C0.k) this.f136b.f150c;
                            SQLiteDatabase a4 = kVar2.a();
                            a4.beginTransaction();
                            try {
                                Long b3 = C0.k.b(a4, iVar3);
                                if (b3 == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor rawQuery = kVar2.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{b3.toString()});
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
                            C0.k kVar22 = (C0.k) this.f136b.f150c;
                            kVar22.getClass();
                            return (Iterable) kVar22.c(new k(kVar22, 2, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr3 = iVar2.f10555b;
            if (a3 == null) {
                AbstractC0129a.j("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar2);
                c1232a = new C1232a(3, -1L);
                gVar = a3;
                bArr = bArr3;
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0.b) it.next()).f199c);
                }
                if ((bArr3 != null ? 1 : i7) != 0) {
                    C0.c cVar = mVar.f155i;
                    Objects.requireNonNull(cVar);
                    C1251a c1251a = (C1251a) kVar.f(new g(i7, cVar));
                    F1.c cVar2 = new F1.c();
                    cVar2.f = new HashMap();
                    cVar2.f489d = Long.valueOf(mVar.f153g.d());
                    cVar2.f490e = Long.valueOf(mVar.f154h.d());
                    cVar2.f486a = "GDT_CLIENT_METRICS";
                    C1185b c1185b = new C1185b("proto");
                    c1251a.getClass();
                    A0.f fVar = v0.m.f10565a;
                    fVar.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        fVar.y(c1251a, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    cVar2.f488c = new v0.k(c1185b, byteArrayOutputStream.toByteArray());
                    arrayList.add(((t0.c) a3).a(cVar2.c()));
                }
                t0.c cVar3 = (t0.c) a3;
                HashMap hashMap = new HashMap();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    v0.h hVar = (v0.h) it2.next();
                    String str3 = hVar.f10549a;
                    if (hashMap.containsKey(str3)) {
                        ((List) hashMap.get(str3)).add(hVar);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar);
                        hashMap.put(str3, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = hashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    Map.Entry entry = (Map.Entry) it3.next();
                    v0.h hVar2 = (v0.h) ((List) entry.getValue()).get(0);
                    w wVar = w.f10524a;
                    long d3 = cVar3.f.d();
                    long d4 = cVar3.f10368e.d();
                    u0.j jVar = new u0.j(new u0.h(Integer.valueOf(hVar2.b("sdk-version")), hVar2.a(CommonUrlParts.MODEL), hVar2.a("hardware"), hVar2.a("device"), hVar2.a("product"), hVar2.a("os-uild"), hVar2.a(CommonUrlParts.MANUFACTURER), hVar2.a("fingerprint"), hVar2.a(CommonUrlParts.LOCALE), hVar2.a("country"), hVar2.a("mcc_mnc"), hVar2.a("application_build")));
                    try {
                        num = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        num = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it4 = ((List) entry.getValue()).iterator();
                    while (it4.hasNext()) {
                        v0.h hVar3 = (v0.h) it4.next();
                        Iterator it5 = it3;
                        v0.k kVar2 = hVar3.f10551c;
                        C1185b c1185b2 = kVar2.f10562a;
                        Iterator it6 = it4;
                        boolean equals = c1185b2.equals(new C1185b("proto"));
                        byte[] bArr4 = kVar2.f10563b;
                        if (equals) {
                            t0Var = new t0();
                            t0Var.f9912d = bArr4;
                            gVar2 = a3;
                        } else {
                            gVar2 = a3;
                            if (c1185b2.equals(new C1185b("json"))) {
                                String str4 = new String(bArr4, Charset.forName(CharEncoding.UTF_8));
                                t0 t0Var2 = new t0();
                                t0Var2.f9913e = str4;
                                t0Var = t0Var2;
                            } else {
                                bArr2 = bArr3;
                                String p3 = AbstractC0129a.p("CctTransportBackend");
                                if (Log.isLoggable(p3, 5)) {
                                    Log.w(p3, "Received event of unsupported encoding " + c1185b2 + ". Skipping...");
                                }
                                bArr3 = bArr2;
                                it4 = it6;
                                it3 = it5;
                                a3 = gVar2;
                            }
                        }
                        bArr2 = bArr3;
                        t0Var.f9909a = Long.valueOf(hVar3.f10552d);
                        t0Var.f9911c = Long.valueOf(hVar3.f10553e);
                        String str5 = (String) hVar3.f.get("tz-offset");
                        t0Var.f = Long.valueOf(str5 == null ? 0L : Long.valueOf(str5).longValue());
                        t0Var.f9914g = new u0.n((u) u.f10522a.get(hVar3.b("net-type")), (t) t.f10520a.get(hVar3.b("mobile-subtype")));
                        Integer num2 = hVar3.f10550b;
                        if (num2 != null) {
                            t0Var.f9910b = num2;
                        }
                        String str6 = ((Long) t0Var.f9909a) == null ? " eventTimeMs" : "";
                        if (((Long) t0Var.f9911c) == null) {
                            str6 = str6.concat(" eventUptimeMs");
                        }
                        if (((Long) t0Var.f) == null) {
                            str6 = AbstractC0033i.s(str6, " timezoneOffsetSeconds");
                        }
                        if (!str6.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(str6));
                        }
                        arrayList4.add(new u0.k(((Long) t0Var.f9909a).longValue(), (Integer) t0Var.f9910b, ((Long) t0Var.f9911c).longValue(), (byte[]) t0Var.f9912d, (String) t0Var.f9913e, ((Long) t0Var.f).longValue(), (u0.n) t0Var.f9914g));
                        bArr3 = bArr2;
                        it4 = it6;
                        it3 = it5;
                        a3 = gVar2;
                    }
                    arrayList3.add(new u0.l(d3, d4, jVar, num, str2, arrayList4));
                    bArr3 = bArr3;
                    it3 = it3;
                    a3 = a3;
                }
                gVar = a3;
                bArr = bArr3;
                u0.i iVar3 = new u0.i(arrayList3);
                URL url = cVar3.f10367d;
                if (bArr != null) {
                    try {
                        C1189a a4 = C1189a.a(bArr);
                        str = a4.f10360b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = a4.f10359a;
                        if (str7 != null) {
                            url = t0.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        c1232a = new C1232a(3, -1L);
                    }
                } else {
                    str = null;
                }
                try {
                    try {
                        A0.f fVar2 = new A0.f(url, iVar3, str, 21);
                        E e3 = new E(29, cVar3);
                        int i8 = 5;
                        do {
                            c3 = e3.c(fVar2);
                            URL url2 = c3.f10362b;
                            if (url2 != null) {
                                AbstractC0129a.j("CctTransportBackend", "Following redirect to: %s", url2);
                                fVar2 = new A0.f(url2, (u0.i) fVar2.f24c, (String) fVar2.f25d, 21);
                            } else {
                                fVar2 = null;
                            }
                            if (fVar2 == null) {
                                break;
                            } else {
                                i8--;
                            }
                        } while (i8 >= 1);
                        int i9 = c3.f10361a;
                        if (i9 == 200) {
                            c1232a = new C1232a(1, c3.f10363c);
                        } else {
                            if (i9 >= 500 || i9 == 404) {
                                c1232a2 = new C1232a(2, -1L);
                            } else if (i9 == 400) {
                                try {
                                    c1232a2 = new C1232a(4, -1L);
                                } catch (IOException e4) {
                                    e = e4;
                                    AbstractC0129a.l("CctTransportBackend", "Could not make request to the backend", e);
                                    i4 = 2;
                                    c1232a = new C1232a(2, -1L);
                                    i5 = c1232a.f10627a;
                                    if (i5 == i4) {
                                    }
                                }
                            } else {
                                c1232a2 = new C1232a(3, -1L);
                            }
                            c1232a = c1232a2;
                        }
                        i4 = 2;
                    } catch (IOException e5) {
                        e = e5;
                    }
                } catch (IOException e6) {
                    e = e6;
                }
                i5 = c1232a.f10627a;
                if (i5 == i4) {
                    final long j4 = j3;
                    kVar.f(new D0.b() { // from class: B0.j
                        @Override // D0.b
                        public final Object execute() {
                            m mVar2 = m.this;
                            C0.k kVar3 = (C0.k) mVar2.f150c;
                            kVar3.getClass();
                            Iterable iterable2 = iterable;
                            if (iterable2.iterator().hasNext()) {
                                String str8 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + C0.k.g(iterable2);
                                SQLiteDatabase a5 = kVar3.a();
                                a5.beginTransaction();
                                try {
                                    a5.compileStatement(str8).execute();
                                    Cursor rawQuery = a5.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                                    try {
                                        Cursor cursor = rawQuery;
                                        while (cursor.moveToNext()) {
                                            kVar3.e(cursor.getInt(0), y0.c.MAX_RETRIES_REACHED, cursor.getString(1));
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
                            kVar3.c(new C0.g(mVar2.f153g.d() + j4, iVar));
                            return null;
                        }
                    });
                    this.f151d.a(iVar, i3 + 1, true);
                    return;
                }
                mVar = this;
                iVar2 = iVar;
                kVar.f(new k(mVar, 0, iterable));
                if (i5 == 1) {
                    j3 = Math.max(j3, c1232a.f10628b);
                    if (bArr != null) {
                        kVar.f(new g(2, mVar));
                    }
                } else if (i5 == 4) {
                    HashMap hashMap2 = new HashMap();
                    Iterator it7 = iterable.iterator();
                    while (it7.hasNext()) {
                        String str8 = ((C0.b) it7.next()).f199c.f10549a;
                        if (hashMap2.containsKey(str8)) {
                            hashMap2.put(str8, Integer.valueOf(((Integer) hashMap2.get(str8)).intValue() + 1));
                        } else {
                            hashMap2.put(str8, 1);
                        }
                    }
                    i6 = 1;
                    kVar.f(new k(mVar, i6, hashMap2));
                    i7 = 0;
                    a3 = gVar;
                }
                i6 = 1;
                i7 = 0;
                a3 = gVar;
            }
            i4 = 2;
            i5 = c1232a.f10627a;
            if (i5 == i4) {
            }
        }
    }
}
