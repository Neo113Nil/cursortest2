package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.internal.l;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final /* synthetic */ class mq implements bg1, if1, z41 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ mq(b51 b51Var, Object obj, cc ccVar, int i) {
        this.d = i;
        this.e = b51Var;
        this.h = obj;
        this.g = ccVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d A[SYNTHETIC] */
    @Override // defpackage.z41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        b51 b51Var;
        ui0 ui0Var;
        int i = this.d;
        int i2 = 6;
        int i3 = 5;
        int i4 = 4;
        int i5 = 3;
        ui0 ui0Var2 = ui0.CACHE_FULL;
        int i6 = 2;
        int i7 = 1;
        Object obj2 = this.h;
        Object obj3 = this.g;
        Object obj4 = this.e;
        int i8 = 0;
        switch (i) {
            case 2:
                b51 b51Var2 = (b51) obj4;
                kb kbVar = (kb) obj2;
                sv svVar = kbVar.c;
                String str = kbVar.a;
                cc ccVar = (cc) obj3;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = b51Var2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * b51Var2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                lb lbVar = b51Var2.h;
                if (simpleQueryForLong >= lbVar.a) {
                    b51Var2.e(1L, ui0Var2, str);
                    return -1L;
                }
                Long b = b51.b(sQLiteDatabase, ccVar);
                if (b != null) {
                    insert = b.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", ccVar.a);
                    contentValues.put("priority", Integer.valueOf(ez0.a(ccVar.c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = ccVar.b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i9 = lbVar.e;
                byte[] bArr2 = svVar.b;
                boolean z = bArr2.length <= i9;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(kbVar.d));
                contentValues2.put("uptime_ms", Long.valueOf(kbVar.e));
                contentValues2.put("payload_encoding", svVar.a.a);
                contentValues2.put("code", kbVar.b);
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
                for (Map.Entry entry : Collections.unmodifiableMap(kbVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 3:
                b51 b51Var3 = (b51) obj4;
                ArrayList arrayList = (ArrayList) obj2;
                cc ccVar2 = (cc) obj3;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(0);
                    int i11 = cursor2.getInt(7) != 0 ? i7 : 0;
                    jb jbVar = new jb();
                    jbVar.f = new HashMap();
                    String string = cursor2.getString(i7);
                    if (string == null) {
                        l.b("Null transportName");
                        return null;
                    }
                    jbVar.a = string;
                    jbVar.d = Long.valueOf(cursor2.getLong(i6));
                    jbVar.e = Long.valueOf(cursor2.getLong(3));
                    if (i11 != 0) {
                        String string2 = cursor2.getString(4);
                        jbVar.c = new sv(string2 == null ? b51.j : new vv(string2), cursor2.getBlob(5));
                        b51Var = b51Var3;
                    } else {
                        String string3 = cursor2.getString(4);
                        vv vvVar = string3 == null ? b51.j : new vv(string3);
                        Cursor query = b51Var3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
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
                                b51 b51Var4 = b51Var3;
                                cursor = query;
                                try {
                                    System.arraycopy(bArr4, 0, bArr3, i14, bArr4.length);
                                    i14 += bArr4.length;
                                    i13++;
                                    query = cursor;
                                    b51Var3 = b51Var4;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            b51Var = b51Var3;
                            query.close();
                            jbVar.c = new sv(vvVar, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        jbVar.b = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new ub(j, ccVar2, jbVar.g()));
                    b51Var3 = b51Var;
                    i6 = 2;
                    i7 = 1;
                }
                return null;
            default:
                b51 b51Var5 = (b51) obj4;
                HashMap hashMap = (HashMap) obj3;
                o91 o91Var = (o91) obj2;
                ArrayList arrayList3 = (ArrayList) o91Var.g;
                Cursor cursor3 = (Cursor) obj;
                b51Var5.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i8);
                    int i15 = cursor3.getInt(1);
                    ui0 ui0Var3 = ui0.REASON_UNKNOWN;
                    if (i15 != 0) {
                        if (i15 == 1) {
                            ui0Var3 = ui0.MESSAGE_TOO_OLD;
                        } else if (i15 == 2) {
                            ui0Var = ui0Var2;
                            long j2 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new vi0(j2, ui0Var));
                            i2 = 6;
                            i3 = 5;
                            i4 = 4;
                            i5 = 3;
                            i8 = 0;
                        } else if (i15 == i5) {
                            ui0Var3 = ui0.PAYLOAD_TOO_BIG;
                        } else if (i15 == i4) {
                            ui0Var3 = ui0.MAX_RETRIES_REACHED;
                        } else if (i15 == i3) {
                            ui0Var3 = ui0.INVALID_PAYLOD;
                        } else if (i15 == i2) {
                            ui0Var3 = ui0.SERVER_ERROR;
                        } else {
                            xa0.k("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i15));
                        }
                    }
                    ui0Var = ui0Var3;
                    long j22 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new vi0(j22, ui0Var));
                    i2 = 6;
                    i3 = 5;
                    i4 = 4;
                    i5 = 3;
                    i8 = 0;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i16 = xi0.c;
                    new ArrayList();
                    arrayList3.add(new xi0((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                }
                long d = b51Var5.e.d();
                SQLiteDatabase a = b51Var5.a();
                a.beginTransaction();
                try {
                    Cursor rawQuery = a.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        li1 li1Var = new li1(rawQuery.getLong(0), d);
                        rawQuery.close();
                        a.setTransactionSuccessful();
                        a.endTransaction();
                        o91Var.e = li1Var;
                        o91Var.h = new t40(new pe1(b51Var5.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * b51Var5.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), lb.f.a));
                        o91Var.d = (String) b51Var5.i.get();
                        return new ih((li1) o91Var.e, Collections.unmodifiableList(arrayList3), (t40) o91Var.h, (String) o91Var.d);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    a.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // defpackage.bg1
    public Object b() {
        oq oqVar = (oq) this.e;
        cc ccVar = (cc) this.g;
        kb kbVar = (kb) this.h;
        b51 b51Var = oqVar.d;
        b51Var.getClass();
        dz0 dz0Var = ccVar.c;
        String str = kbVar.a;
        String str2 = ccVar.a;
        String concat = "TRuntime.".concat("SQLiteEventStore");
        if (Log.isLoggable(concat, 3)) {
            Log.d(concat, "Storing event with priority=" + dz0Var + ", name=" + str + " for destination " + str2);
        }
        ((Long) b51Var.c(new mq(b51Var, (Object) kbVar, ccVar, 2))).getClass();
        oqVar.a.o(ccVar, 1, false);
        return null;
    }

    @Override // defpackage.if1
    public zu1 n(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.e;
        String str = (String) this.g;
        tq tqVar = (tq) this.h;
        String str2 = (String) obj;
        nq0 c = FirebaseMessaging.c(firebaseMessaging.b);
        ez ezVar = firebaseMessaging.a;
        ezVar.a();
        String c2 = "[DEFAULT]".equals(ezVar.b) ? "" : ezVar.c();
        String b = firebaseMessaging.h.b();
        synchronized (c) {
            String b2 = tq.b(str2, b, System.currentTimeMillis());
            if (b2 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c.e).edit();
                edit.putString(c2 + "|T|" + str + "|*", b2);
                edit.commit();
            }
        }
        if (tqVar == null || !str2.equals((String) tqVar.b)) {
            ez ezVar2 = firebaseMessaging.a;
            ezVar2.a();
            if ("[DEFAULT]".equals(ezVar2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    ezVar2.a();
                    sb.append(ezVar2.b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new yw(firebaseMessaging.b, 0).p(intent);
            }
        }
        return t80.p(str2);
    }

    public /* synthetic */ mq(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }
}
