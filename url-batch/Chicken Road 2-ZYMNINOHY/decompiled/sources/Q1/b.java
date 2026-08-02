package Q1;

import L1.i;
import O1.f;
import S1.h;
import S1.j;
import T.U;
import W.InterfaceC0113f;
import android.app.ActivityManager;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerRequest;
import f0.e;
import i2.AbstractC0457a;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.screenshot.impl.C1156n;
import io.appmetrica.analytics.screenshot.impl.d0;
import io.appmetrica.analytics.screenshot.impl.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n0.g;
import q0.C1353B;
import q0.H;
import t0.l;
import t0.n;
import t0.o;
import v2.F;
import v2.I;
import v2.a0;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements T1.b, h, FunctionWithThrowable, BannerRequest.Callback, InterfaceC0113f, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2260a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2261b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2262c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2263d;

    public /* synthetic */ b(j jVar, Object obj, L1.j jVar2, int i4) {
        this.f2260a = i4;
        this.f2263d = jVar;
        this.f2261b = obj;
        this.f2262c = jVar2;
    }

    @Override // t0.o
    public a0 a(int i4, U u4, int[] iArr) {
        l lVar = (l) this.f2263d;
        String str = (String) this.f2262c;
        String str2 = (String) this.f2261b;
        F j4 = I.j();
        for (int i5 = 0; i5 < u4.f2705a; i5++) {
            j4.b(new n(i4, u4, i5, lVar, iArr[i5], str, str2));
        }
        return j4.f();
    }

    @Override // W.InterfaceC0113f
    public void accept(Object obj) {
        e eVar = (e) this.f2263d;
        ((H) obj).a(eVar.f8491a, (C1353B) this.f2262c, (g) this.f2261b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008a A[SYNTHETIC] */
    @Override // S1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        j jVar;
        O1.c cVar;
        int i4 = this.f2260a;
        int i5 = 6;
        int i6 = 5;
        int i7 = 4;
        int i8 = 3;
        O1.c cVar2 = O1.c.CACHE_FULL;
        int i9 = 2;
        int i10 = 0;
        int i11 = 1;
        Object obj2 = this.f2261b;
        Object obj3 = this.f2262c;
        Object obj4 = this.f2263d;
        switch (i4) {
            case 1:
                j jVar2 = (j) obj4;
                i iVar = (i) obj2;
                L1.n nVar = iVar.f1641c;
                String str = iVar.f1639a;
                L1.j jVar3 = (L1.j) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = jVar2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                S1.a aVar = jVar2.f2589d;
                if (simpleQueryForLong >= aVar.f2570a) {
                    jVar2.k(1L, cVar2, str);
                    return -1L;
                }
                Long b4 = j.b(sQLiteDatabase, jVar3);
                if (b4 != null) {
                    insert = b4.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar3.f1645a);
                    contentValues.put("priority", Integer.valueOf(V1.a.a(jVar3.f1647c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = jVar3.f1646b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i12 = aVar.f2574e;
                byte[] bArr2 = nVar.f1656b;
                boolean z = bArr2.length <= i12;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.f1642d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.f1643e));
                contentValues2.put("payload_encoding", nVar.f1655a.f1125a);
                contentValues2.put("code", iVar.f1640b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / i12);
                    for (int i13 = 1; i13 <= ceil; i13++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i13 - 1) * i12, Math.min(i13 * i12, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i13));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar.f1644f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 2:
                j jVar4 = (j) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                L1.j jVar5 = (L1.j) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j4 = cursor2.getLong(0);
                    int i14 = cursor2.getInt(7) != 0 ? i11 : 0;
                    L1.h hVar = new L1.h();
                    hVar.f1638f = new HashMap();
                    String string = cursor2.getString(i11);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    hVar.f1633a = string;
                    hVar.f1636d = Long.valueOf(cursor2.getLong(i9));
                    hVar.f1637e = Long.valueOf(cursor2.getLong(3));
                    if (i14 != 0) {
                        String string2 = cursor2.getString(4);
                        hVar.f1635c = new L1.n(string2 == null ? j.f2585f : new I1.b(string2), cursor2.getBlob(5));
                        jVar = jVar4;
                    } else {
                        String string3 = cursor2.getString(4);
                        I1.b bVar = string3 == null ? j.f2585f : new I1.b(string3);
                        Cursor query = jVar4.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j4)}, null, null, "sequence_num");
                        try {
                            Cursor cursor3 = query;
                            ArrayList arrayList2 = new ArrayList();
                            int i15 = 0;
                            while (cursor3.moveToNext()) {
                                byte[] blob = cursor3.getBlob(0);
                                arrayList2.add(blob);
                                i15 += blob.length;
                            }
                            byte[] bArr3 = new byte[i15];
                            int i16 = 0;
                            int i17 = 0;
                            while (i16 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i16);
                                j jVar6 = jVar4;
                                cursor = query;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, i17, bArr4.length);
                                    i17 += bArr4.length;
                                    i16++;
                                    query = cursor;
                                    jVar4 = jVar6;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            jVar = jVar4;
                            query.close();
                            hVar.f1635c = new L1.n(bVar, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        hVar.f1634b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new S1.b(j4, jVar5, hVar.d()));
                    jVar4 = jVar;
                    i9 = 2;
                    i11 = 1;
                }
                return null;
            case 3:
                j jVar7 = (j) obj4;
                HashMap hashMap = (HashMap) obj3;
                G1.c cVar3 = (G1.c) obj2;
                Cursor cursor4 = (Cursor) obj;
                jVar7.getClass();
                while (cursor4.moveToNext()) {
                    String string4 = cursor4.getString(i10);
                    int i18 = cursor4.getInt(1);
                    O1.c cVar4 = O1.c.REASON_UNKNOWN;
                    if (i18 != 0) {
                        if (i18 == 1) {
                            cVar4 = O1.c.MESSAGE_TOO_OLD;
                        } else if (i18 == 2) {
                            cVar = cVar2;
                            long j5 = cursor4.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new O1.d(j5, cVar));
                            i5 = 6;
                            i6 = 5;
                            i7 = 4;
                            i8 = 3;
                            i10 = 0;
                        } else if (i18 == i8) {
                            cVar4 = O1.c.PAYLOAD_TOO_BIG;
                        } else if (i18 == i7) {
                            cVar4 = O1.c.MAX_RETRIES_REACHED;
                        } else if (i18 == i6) {
                            cVar4 = O1.c.INVALID_PAYLOD;
                        } else if (i18 == i5) {
                            cVar4 = O1.c.SERVER_ERROR;
                        } else {
                            AbstractC0457a.k("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i18));
                        }
                    }
                    cVar = cVar4;
                    long j52 = cursor4.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new O1.d(j52, cVar));
                    i5 = 6;
                    i6 = 5;
                    i7 = 4;
                    i8 = 3;
                    i10 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i19 = O1.e.f2025c;
                    new ArrayList();
                    ((ArrayList) cVar3.f836c).add(new O1.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                cVar3.f835b = (O1.g) jVar7.e(new S1.g(jVar7.f2587b.q()));
                cVar3.f837d = new O1.b(new f(jVar7.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * jVar7.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), S1.a.f2569f.f2570a));
                cVar3.f838e = (String) jVar7.f2590e.get();
                return new O1.a((O1.g) cVar3.f835b, Collections.unmodifiableList((ArrayList) cVar3.f836c), (O1.b) cVar3.f837d, (String) cVar3.f838e);
            default:
                return d0.a((g0) obj4, (d0) obj3, (C1156n) obj2, (ActivityManager) obj);
        }
    }

    @Override // T1.b
    public Object c() {
        c cVar = (c) this.f2263d;
        L1.j jVar = (L1.j) this.f2262c;
        i iVar = (i) this.f2261b;
        j jVar2 = (j) cVar.f2268d;
        jVar2.getClass();
        I1.c cVar2 = jVar.f1647c;
        String str = iVar.f1639a;
        String str2 = jVar.f1645a;
        String r4 = AbstractC0457a.r("SQLiteEventStore");
        if (Log.isLoggable(r4, 3)) {
            Log.d(r4, "Storing event with priority=" + cVar2 + ", name=" + str + " for destination " + str2);
        }
        ((Long) jVar2.e(new b(jVar2, (Object) iVar, jVar, 1))).getClass();
        cVar.f2265a.a(jVar, 1, false);
        return null;
    }

    @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
    public void onFinished(BannerCreator bannerCreator, String str) {
        ((BannerRequest) this.f2263d).lambda$loadImpl$1((BannerRequest.Callback) this.f2262c, (String) this.f2261b, bannerCreator, str);
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i4) {
        this.f2260a = i4;
        this.f2263d = obj;
        this.f2262c = obj2;
        this.f2261b = obj3;
    }
}
