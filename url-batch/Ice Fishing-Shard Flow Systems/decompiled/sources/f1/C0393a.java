package f1;

import D6.z;
import P0.n;
import X0.d;
import a1.i;
import a1.l;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import d1.C0354a;
import d1.C0355b;
import d1.C0357d;
import d1.C0358e;
import d1.C0359f;
import d1.C0360g;
import d1.EnumC0356c;
import h1.C0468a;
import h1.C0469b;
import h1.f;
import h1.h;
import i1.InterfaceC0542b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k1.AbstractC0594a;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0393a implements InterfaceC0542b, f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4764e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f4765i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f4766l;

    public /* synthetic */ C0393a(h hVar, Object obj, i iVar, int i2) {
        this.f4763d = i2;
        this.f4766l = hVar;
        this.f4764e = obj;
        this.f4765i = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b A[SYNTHETIC] */
    @Override // h1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        EnumC0356c enumC0356c;
        int i2 = this.f4763d;
        int i5 = 6;
        int i7 = 5;
        int i8 = 4;
        EnumC0356c enumC0356c2 = EnumC0356c.CACHE_FULL;
        int i9 = 2;
        int i10 = 3;
        int i11 = 1;
        Object obj2 = this.f4764e;
        Object obj3 = this.f4765i;
        int i12 = 0;
        h hVar = (h) this.f4766l;
        switch (i2) {
            case 1:
                a1.h hVar2 = (a1.h) obj2;
                l lVar = hVar2.f3063c;
                String str = hVar2.f3061a;
                i iVar = (i) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C0468a c0468a = hVar.f5139l;
                if (simpleQueryForLong >= c0468a.f5123a) {
                    hVar.j(1L, enumC0356c2, str);
                    return -1L;
                }
                Long d7 = h.d(sQLiteDatabase, iVar);
                if (d7 != null) {
                    insert = d7.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f3067a);
                    contentValues.put("priority", Integer.valueOf(AbstractC0594a.a(iVar.f3069c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f3068b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i13 = c0468a.f5127e;
                byte[] bArr2 = lVar.f3072b;
                boolean z7 = bArr2.length <= i13;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar2.f3064d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar2.f3065e));
                contentValues2.put("payload_encoding", lVar.f3071a.f2850a);
                contentValues2.put("code", hVar2.f3062b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z7));
                contentValues2.put("payload", z7 ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z7) {
                    int ceil = (int) Math.ceil(bArr2.length / i13);
                    for (int i14 = 1; i14 <= ceil; i14++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i14 - 1) * i13, Math.min(i14 * i13, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i14));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar2.f3066f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                i iVar2 = (i) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i15 = cursor2.getInt(7) != 0 ? i11 : 0;
                    z zVar = new z(i10);
                    zVar.f644g = new HashMap();
                    String string = cursor2.getString(i11);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    zVar.f639b = string;
                    zVar.f642e = Long.valueOf(cursor2.getLong(i9));
                    zVar.f643f = Long.valueOf(cursor2.getLong(i10));
                    if (i15 != 0) {
                        String string2 = cursor2.getString(4);
                        zVar.f641d = new l(string2 == null ? h.f5135n : new X0.c(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        X0.c cVar = string3 == null ? h.f5135n : new X0.c(string3);
                        Cursor query = hVar.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i16 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i16 += blob.length;
                            }
                            byte[] bArr3 = new byte[i16];
                            int i17 = 0;
                            int i18 = 0;
                            while (i17 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i17);
                                cursor = query;
                                try {
                                    ArrayList arrayList3 = arrayList2;
                                    System.arraycopy(bArr4, 0, bArr3, i18, bArr4.length);
                                    i18 += bArr4.length;
                                    i17++;
                                    query = cursor;
                                    arrayList2 = arrayList3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            zVar.f641d = new l(cVar, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        zVar.f640c = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new C0469b(j, iVar2, zVar.i()));
                    i9 = 2;
                    i10 = 3;
                    i11 = 1;
                }
                return null;
            default:
                HashMap hashMap = (HashMap) obj3;
                n nVar = (n) obj2;
                Cursor cursor3 = (Cursor) obj;
                hVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i12);
                    int i19 = cursor3.getInt(1);
                    EnumC0356c enumC0356c3 = EnumC0356c.REASON_UNKNOWN;
                    if (i19 != 0) {
                        if (i19 == 1) {
                            enumC0356c3 = EnumC0356c.MESSAGE_TOO_OLD;
                        } else if (i19 == 2) {
                            enumC0356c = enumC0356c2;
                            long j7 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new C0357d(j7, enumC0356c));
                            i12 = 0;
                            i5 = 6;
                            i7 = 5;
                            i8 = 4;
                        } else if (i19 == 3) {
                            enumC0356c3 = EnumC0356c.PAYLOAD_TOO_BIG;
                        } else if (i19 == i8) {
                            enumC0356c3 = EnumC0356c.MAX_RETRIES_REACHED;
                        } else if (i19 == i7) {
                            enumC0356c3 = EnumC0356c.INVALID_PAYLOD;
                        } else if (i19 == i5) {
                            enumC0356c3 = EnumC0356c.SERVER_ERROR;
                        } else {
                            d4.c.k("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i19));
                        }
                    }
                    enumC0356c = enumC0356c3;
                    long j72 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new C0357d(j72, enumC0356c));
                    i12 = 0;
                    i5 = 6;
                    i7 = 5;
                    i8 = 4;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i20 = C0358e.f4643c;
                    new ArrayList();
                    ((ArrayList) nVar.f2215i).add(new C0358e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long d8 = hVar.f5137e.d();
                SQLiteDatabase a7 = hVar.a();
                a7.beginTransaction();
                try {
                    Cursor rawQuery = a7.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        C0360g c0360g = new C0360g(rawQuery.getLong(0), d8);
                        rawQuery.close();
                        a7.setTransactionSuccessful();
                        a7.endTransaction();
                        nVar.f2214e = c0360g;
                        nVar.f2216l = new C0355b(new C0359f(hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), C0468a.f5122f.f5123a));
                        nVar.f2217m = (String) hVar.f5140m.get();
                        return new C0354a((C0360g) nVar.f2214e, Collections.unmodifiableList((ArrayList) nVar.f2215i), (C0355b) nVar.f2216l, (String) nVar.f2217m);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    a7.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // i1.InterfaceC0542b
    public Object b() {
        b bVar = (b) this.f4766l;
        i iVar = (i) this.f4765i;
        a1.h hVar = (a1.h) this.f4764e;
        h hVar2 = (h) bVar.f4771d;
        hVar2.getClass();
        d dVar = iVar.f3069c;
        String str = hVar.f3061a;
        String str2 = iVar.f3067a;
        String u7 = d4.c.u("SQLiteEventStore");
        if (Log.isLoggable(u7, 3)) {
            Log.d(u7, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar2.g(new C0393a(hVar2, (Object) hVar, iVar, 1))).getClass();
        bVar.f4768a.a(iVar, 1, false);
        return null;
    }

    public /* synthetic */ C0393a(Object obj, Object obj2, Object obj3, int i2) {
        this.f4763d = i2;
        this.f4766l = obj;
        this.f4765i = obj2;
        this.f4764e = obj3;
    }
}
