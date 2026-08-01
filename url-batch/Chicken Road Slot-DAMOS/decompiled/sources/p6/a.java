package p6;

import a2.r;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.measurement.ra;
import com.google.firebase.messaging.v;
import h6.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k6.h;
import k6.i;
import k6.k;
import n6.c;
import n6.f;
import r6.e;
import r6.g;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements s6.b, e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7679e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f7680i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7681r;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i3) {
        this.f7678d = i3;
        this.f7681r = obj;
        this.f7680i = obj2;
        this.f7679e = obj3;
    }

    @Override // s6.b
    public Object a() {
        b bVar = (b) this.f7681r;
        i iVar = (i) this.f7680i;
        h hVar = (h) this.f7679e;
        g gVar = bVar.f7686d;
        gVar.getClass();
        d dVar = iVar.f5466c;
        String str = hVar.f5458a;
        String str2 = iVar.f5464a;
        String v10 = k7.e.v("SQLiteEventStore");
        if (Log.isLoggable(v10, 3)) {
            Log.d(v10, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) gVar.h(new a(gVar, (Object) hVar, iVar, 1))).getClass();
        bVar.f7683a.i(iVar, 1, false);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[SYNTHETIC] */
    @Override // r6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        c cVar;
        c cVar2;
        int i3 = this.f7678d;
        int i10 = 5;
        int i11 = 4;
        int i12 = 3;
        c cVar3 = c.CACHE_FULL;
        int i13 = 2;
        int i14 = 1;
        Object obj2 = this.f7679e;
        Object obj3 = this.f7680i;
        Object obj4 = this.f7681r;
        int i15 = 0;
        switch (i3) {
            case 1:
                g gVar = (g) obj4;
                h hVar = (h) obj2;
                k kVar = hVar.f5460c;
                String str = hVar.f5458a;
                i iVar = (i) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                r6.a aVar = gVar.f8200r;
                if (simpleQueryForLong >= aVar.f8182a) {
                    gVar.j(1L, cVar3, str);
                    return -1L;
                }
                Long d10 = g.d(sQLiteDatabase, iVar);
                if (d10 != null) {
                    insert = d10.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f5464a);
                    contentValues.put("priority", Integer.valueOf(u6.a.a(iVar.f5466c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f5465b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i16 = aVar.f8186e;
                byte[] bArr2 = kVar.f5474b;
                boolean z10 = bArr2.length <= i16;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.f5461d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.f5462e));
                contentValues2.put("payload_encoding", kVar.f5473a.f4478a);
                contentValues2.put("code", hVar.f5459b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z10));
                contentValues2.put("payload", z10 ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z10) {
                    int ceil = (int) Math.ceil(bArr2.length / i16);
                    for (int i17 = 1; i17 <= ceil; i17++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i17 - 1) * i16, Math.min(i17 * i16, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i17));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar.f5463f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 2:
                g gVar2 = (g) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                i iVar2 = (i) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (true) {
                    if (cursor2.moveToNext()) {
                        long j = cursor2.getLong(0);
                        int i18 = cursor2.getInt(7) != 0 ? i14 : 0;
                        ra raVar = new ra();
                        raVar.f2742f = new HashMap();
                        String string = cursor2.getString(i14);
                        if (string != null) {
                            raVar.f2737a = string;
                            raVar.f2740d = Long.valueOf(cursor2.getLong(i13));
                            raVar.f2741e = Long.valueOf(cursor2.getLong(3));
                            if (i18 != 0) {
                                String string2 = cursor2.getString(4);
                                raVar.f2739c = new k(string2 == null ? g.f8196t : new h6.c(string2), cursor2.getBlob(5));
                            } else {
                                String string3 = cursor2.getString(4);
                                h6.c cVar4 = string3 == null ? g.f8196t : new h6.c(string3);
                                Cursor query = gVar2.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                                try {
                                    ArrayList arrayList2 = new ArrayList();
                                    int i19 = 0;
                                    while (query.moveToNext()) {
                                        byte[] blob = query.getBlob(0);
                                        arrayList2.add(blob);
                                        i19 += blob.length;
                                    }
                                    byte[] bArr3 = new byte[i19];
                                    int i20 = 0;
                                    int i21 = 0;
                                    while (i20 < arrayList2.size()) {
                                        byte[] bArr4 = (byte[]) arrayList2.get(i20);
                                        cursor = query;
                                        try {
                                            ArrayList arrayList3 = arrayList2;
                                            System.arraycopy(bArr4, 0, bArr3, i21, bArr4.length);
                                            i21 += bArr4.length;
                                            i20++;
                                            query = cursor;
                                            arrayList2 = arrayList3;
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor.close();
                                            throw th;
                                        }
                                    }
                                    query.close();
                                    raVar.f2739c = new k(cVar4, bArr3);
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = query;
                                }
                            }
                            if (!cursor2.isNull(6)) {
                                raVar.f2738b = Integer.valueOf(cursor2.getInt(6));
                            }
                            arrayList.add(new r6.b(j, iVar2, raVar.c()));
                            i13 = 2;
                            i14 = 1;
                        } else {
                            r.j("Null transportName");
                        }
                    }
                }
                return null;
            default:
                g gVar3 = (g) obj4;
                HashMap hashMap = (HashMap) obj3;
                v vVar = (v) obj2;
                ArrayList arrayList4 = (ArrayList) vVar.f3177i;
                Cursor cursor3 = (Cursor) obj;
                gVar3.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i15);
                    int i22 = cursor3.getInt(1);
                    c cVar5 = c.REASON_UNKNOWN;
                    if (i22 != 0) {
                        if (i22 == 1) {
                            cVar5 = c.MESSAGE_TOO_OLD;
                        } else if (i22 == 2) {
                            cVar = cVar3;
                            cVar2 = cVar;
                            long j3 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new n6.d(j3, cVar));
                            cVar3 = cVar2;
                            i10 = 5;
                            i11 = 4;
                            i12 = 3;
                            i15 = 0;
                        } else if (i22 == i12) {
                            cVar5 = c.PAYLOAD_TOO_BIG;
                        } else if (i22 == i11) {
                            cVar5 = c.MAX_RETRIES_REACHED;
                        } else if (i22 == i10) {
                            cVar5 = c.INVALID_PAYLOD;
                        } else if (i22 == 6) {
                            cVar5 = c.SERVER_ERROR;
                        } else {
                            k7.e.l("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i22));
                        }
                    }
                    cVar2 = cVar3;
                    cVar = cVar5;
                    long j32 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new n6.d(j32, cVar));
                    cVar3 = cVar2;
                    i10 = 5;
                    i11 = 4;
                    i12 = 3;
                    i15 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i23 = n6.e.f7164c;
                    new ArrayList();
                    arrayList4.add(new n6.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long g = gVar3.f8198e.g();
                SQLiteDatabase a9 = gVar3.a();
                a9.beginTransaction();
                try {
                    Cursor rawQuery = a9.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        n6.g gVar4 = new n6.g(rawQuery.getLong(0), g);
                        rawQuery.close();
                        a9.setTransactionSuccessful();
                        a9.endTransaction();
                        vVar.f3176e = gVar4;
                        vVar.f3178r = new n6.b(new f(gVar3.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar3.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), r6.a.f8181f.f8182a));
                        vVar.f3175d = (String) gVar3.f8201s.get();
                        return new n6.a((n6.g) vVar.f3176e, Collections.unmodifiableList(arrayList4), (n6.b) vVar.f3178r, (String) vVar.f3175d);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    a9.endTransaction();
                    throw th4;
                }
        }
    }

    public /* synthetic */ a(g gVar, Object obj, i iVar, int i3) {
        this.f7678d = i3;
        this.f7681r = gVar;
        this.f7679e = obj;
        this.f7680i = iVar;
    }
}
