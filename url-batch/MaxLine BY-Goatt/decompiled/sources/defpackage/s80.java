package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class s80 implements cs2, rc2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ s80(tc2 tc2Var, Object obj, gm gmVar, int i) {
        this.m = i;
        this.p = tc2Var;
        this.n = obj;
        this.o = gmVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[SYNTHETIC] */
    @Override // defpackage.rc2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        tc2 tc2Var;
        cg1 cg1Var;
        int i = this.m;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        cg1 cg1Var2 = cg1.CACHE_FULL;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.n;
        Object obj3 = this.o;
        Object obj4 = this.p;
        int i8 = 0;
        switch (i) {
            case 1:
                tc2 tc2Var2 = (tc2) obj4;
                wl wlVar = (wl) obj2;
                hh0 hh0Var = wlVar.c;
                String str = wlVar.a;
                gm gmVar = (gm) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = tc2Var2.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * tc2Var2.b().compileStatement("PRAGMA page_count").simpleQueryForLong();
                xl xlVar = tc2Var2.p;
                if (simpleQueryForLong >= xlVar.a) {
                    tc2Var2.o(1L, cg1Var2, str);
                    return -1L;
                }
                Long f = tc2.f(sQLiteDatabase, gmVar);
                if (f != null) {
                    insert = f.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", gmVar.a);
                    contentValues.put("priority", Integer.valueOf(z42.a(gmVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = gmVar.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = xlVar.e;
                byte[] bArr2 = hh0Var.b;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(SDKConstants.PARAM_CONTEXT_CONTEXT_ID, Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(wlVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(wlVar.e));
                contentValues2.put("payload_encoding", hh0Var.a.a);
                contentValues2.put("code", wlVar.b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / i9);
                    for (int i10 = 1; i10 <= ceil; i10++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i10));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(wlVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 2:
                tc2 tc2Var3 = (tc2) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                gm gmVar2 = (gm) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i7 : 0;
                    sf sfVar = new sf();
                    sfVar.f = new HashMap();
                    String string = cursor2.getString(i7);
                    if (string == null) {
                        ch2.l("Null transportName");
                        return null;
                    }
                    sfVar.a = string;
                    sfVar.d = Long.valueOf(cursor2.getLong(i6));
                    sfVar.e = Long.valueOf(cursor2.getLong(3));
                    if (i11 != 0) {
                        String string2 = cursor2.getString(4);
                        sfVar.c = new hh0(string2 == null ? tc2.r : new kh0(string2), cursor2.getBlob(5));
                        tc2Var = tc2Var3;
                    } else {
                        String string3 = cursor2.getString(4);
                        kh0 kh0Var = string3 == null ? tc2.r : new kh0(string3);
                        Cursor query = tc2Var3.b().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i12 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i12 += blob.length;
                            }
                            byte[] bArr3 = new byte[i12];
                            int i13 = 0;
                            int i14 = 0;
                            while (i13 < arrayList2.size()) {
                                byte[] bArr4 = (byte[]) arrayList2.get(i13);
                                tc2 tc2Var4 = tc2Var3;
                                cursor = query;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, i14, bArr4.length);
                                    i14 += bArr4.length;
                                    i13++;
                                    query = cursor;
                                    tc2Var3 = tc2Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            tc2Var = tc2Var3;
                            query.close();
                            sfVar.c = new hh0(kh0Var, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        sfVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new cm(j, gmVar2, sfVar.e()));
                    tc2Var3 = tc2Var;
                    i6 = 2;
                    i7 = 1;
                }
                return null;
            default:
                tc2 tc2Var5 = (tc2) obj4;
                HashMap hashMap = (HashMap) obj3;
                js0 js0Var = (js0) obj2;
                ArrayList arrayList3 = (ArrayList) js0Var.m;
                Cursor cursor3 = (Cursor) obj;
                tc2Var5.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i8);
                    int i15 = cursor3.getInt(1);
                    cg1 cg1Var3 = cg1.REASON_UNKNOWN;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            cg1Var3 = cg1.MESSAGE_TOO_OLD;
                        } else if (i15 == 2) {
                            cg1Var = cg1Var2;
                            long j2 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new dg1(j2, cg1Var));
                            i2 = 6;
                            i3 = 5;
                            i4 = 4;
                            i5 = 3;
                            i8 = 0;
                        } else if (i15 == i5) {
                            cg1Var3 = cg1.PAYLOAD_TOO_BIG;
                        } else if (i15 == i4) {
                            cg1Var3 = cg1.MAX_RETRIES_REACHED;
                        } else if (i15 == i3) {
                            cg1Var3 = cg1.INVALID_PAYLOD;
                        } else if (i15 == i2) {
                            cg1Var3 = cg1.SERVER_ERROR;
                        } else {
                            s93.C("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i15));
                        }
                    }
                    cg1Var = cg1Var3;
                    long j22 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new dg1(j22, cg1Var));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i8 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i16 = fg1.c;
                    new ArrayList();
                    arrayList3.add(new fg1((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long h = tc2Var5.n.h();
                SQLiteDatabase b = tc2Var5.b();
                b.beginTransaction();
                try {
                    Cursor rawQuery = b.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        px2 px2Var = new px2(rawQuery.getLong(0), h);
                        rawQuery.close();
                        b.setTransactionSuccessful();
                        b.endTransaction();
                        js0Var.n = px2Var;
                        js0Var.o = new hv0(new hp2(tc2Var5.b().compileStatement("PRAGMA page_size").simpleQueryForLong() * tc2Var5.b().compileStatement("PRAGMA page_count").simpleQueryForLong(), xl.f.a));
                        js0Var.p = (String) tc2Var5.q.get();
                        return new ru((px2) js0Var.n, Collections.unmodifiableList(arrayList3), (hv0) js0Var.o, (String) js0Var.p);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    b.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // defpackage.cs2
    public Object b() {
        u80 u80Var = (u80) this.p;
        gm gmVar = (gm) this.o;
        wl wlVar = (wl) this.n;
        tc2 tc2Var = u80Var.d;
        tc2Var.getClass();
        y42 y42Var = gmVar.c;
        String str = wlVar.a;
        String str2 = gmVar.a;
        String G = s93.G("SQLiteEventStore");
        if (Log.isLoggable(G, 3)) {
            Log.d(G, "Storing event with priority=" + y42Var + ", name=" + str + " for destination " + str2);
        }
        ((Long) tc2Var.m(new s80(tc2Var, (Object) wlVar, gmVar, 1))).getClass();
        u80Var.a.C(gmVar, 1, false);
        return null;
    }

    public /* synthetic */ s80(Object obj, Object obj2, Object obj3, int i) {
        this.m = i;
        this.p = obj;
        this.o = obj2;
        this.n = obj3;
    }
}
