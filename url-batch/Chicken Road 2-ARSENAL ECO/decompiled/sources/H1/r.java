package H1;

import a.AbstractC0219a;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m1.AbstractC0521b;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements k1.g, L0.b, K0.f {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f986h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f987i;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, int i7) {
        this.f984f = i7;
        this.f985g = obj;
        this.f986h = obj2;
        this.f987i = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[SYNTHETIC] */
    @Override // K0.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        Cursor cursor;
        String str;
        long insert;
        G0.c cVar;
        int i7 = this.f984f;
        String str2 = "bytes";
        int i8 = 6;
        int i9 = 5;
        int i10 = 4;
        int i11 = 3;
        G0.c cVar2 = G0.c.CACHE_FULL;
        int i12 = 2;
        Object obj2 = this.f987i;
        Object obj3 = this.f986h;
        int i13 = 0;
        K0.h hVar = (K0.h) this.f985g;
        switch (i7) {
            case com.onesignal.core.internal.permissions.h.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                ArrayList arrayList = (ArrayList) obj3;
                D0.j jVar = (D0.j) obj2;
                Cursor cursor2 = (Cursor) obj;
                while (cursor2.moveToNext()) {
                    long j4 = cursor2.getLong(0);
                    boolean z5 = cursor2.getInt(7) != 0;
                    D0.h hVar2 = new D0.h(0);
                    hVar2.f335g = new HashMap();
                    String string = cursor2.getString(1);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    hVar2.f330b = string;
                    hVar2.f333e = Long.valueOf(cursor2.getLong(i12));
                    hVar2.f334f = Long.valueOf(cursor2.getLong(i11));
                    if (z5) {
                        String string2 = cursor2.getString(4);
                        hVar2.f332d = new D0.m(string2 == null ? K0.h.f1356k : new A0.c(string2), cursor2.getBlob(5));
                        str = str2;
                    } else {
                        String string3 = cursor2.getString(4);
                        A0.c cVar3 = string3 == null ? K0.h.f1356k : new A0.c(string3);
                        Cursor query = hVar.a().query("event_payloads", new String[]{str2}, "event_id = ?", new String[]{String.valueOf(j4)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList2 = new ArrayList();
                            int i14 = 0;
                            while (query.moveToNext()) {
                                byte[] blob = query.getBlob(0);
                                arrayList2.add(blob);
                                i14 += blob.length;
                            }
                            byte[] bArr = new byte[i14];
                            int i15 = 0;
                            int i16 = 0;
                            while (i15 < arrayList2.size()) {
                                byte[] bArr2 = (byte[]) arrayList2.get(i15);
                                String str3 = str2;
                                cursor = query;
                                try {
                                    System.arraycopy(bArr2, 0, bArr, i16, bArr2.length);
                                    i16 += bArr2.length;
                                    i15++;
                                    query = cursor;
                                    str2 = str3;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            str = str2;
                            query.close();
                            hVar2.f332d = new D0.m(cVar3, bArr);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        hVar2.f331c = Integer.valueOf(cursor2.getInt(6));
                    }
                    arrayList.add(new K0.b(j4, jVar, hVar2.c()));
                    str2 = str;
                    i11 = 3;
                    i12 = 2;
                }
                return null;
            case 3:
                D0.i iVar = (D0.i) obj3;
                D0.m mVar = iVar.f338c;
                String str4 = iVar.f336a;
                D0.j jVar2 = (D0.j) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                long simpleQueryForLong = hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                K0.a aVar = hVar.f1360i;
                if (simpleQueryForLong >= aVar.f1344a) {
                    hVar.h(1L, cVar2, str4);
                    return -1L;
                }
                Long d7 = K0.h.d(sQLiteDatabase, jVar2);
                if (d7 != null) {
                    insert = d7.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", jVar2.f342a);
                    contentValues.put("priority", Integer.valueOf(N0.a.a(jVar2.f344c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr3 = jVar2.f343b;
                    if (bArr3 != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr3, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                int i17 = aVar.f1348e;
                byte[] bArr4 = mVar.f347b;
                boolean z6 = bArr4.length <= i17;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str4);
                contentValues2.put("timestamp_ms", Long.valueOf(iVar.f339d));
                contentValues2.put("uptime_ms", Long.valueOf(iVar.f340e));
                contentValues2.put("payload_encoding", mVar.f346a.f42a);
                contentValues2.put("code", iVar.f337b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z6));
                contentValues2.put("payload", z6 ? bArr4 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z6) {
                    int ceil = (int) Math.ceil(bArr4.length / i17);
                    for (int i18 = 1; i18 <= ceil; i18++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr4, (i18 - 1) * i17, Math.min(i18 * i17, bArr4.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i18));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(iVar.f341f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            default:
                HashMap hashMap = (HashMap) obj3;
                A a7 = (A) obj2;
                Cursor cursor3 = (Cursor) obj;
                hVar.getClass();
                while (cursor3.moveToNext()) {
                    String string4 = cursor3.getString(i13);
                    int i19 = cursor3.getInt(1);
                    G0.c cVar4 = G0.c.REASON_UNKNOWN;
                    if (i19 != 0) {
                        if (i19 == 1) {
                            cVar4 = G0.c.MESSAGE_TOO_OLD;
                        } else if (i19 == 2) {
                            cVar = cVar2;
                            long j7 = cursor3.getLong(2);
                            if (hashMap.containsKey(string4)) {
                                hashMap.put(string4, new ArrayList());
                            }
                            ((List) hashMap.get(string4)).add(new G0.d(j7, cVar));
                            i13 = 0;
                            i8 = 6;
                            i9 = 5;
                            i10 = 4;
                        } else if (i19 == 3) {
                            cVar4 = G0.c.PAYLOAD_TOO_BIG;
                        } else if (i19 == i10) {
                            cVar4 = G0.c.MAX_RETRIES_REACHED;
                        } else if (i19 == i9) {
                            cVar4 = G0.c.INVALID_PAYLOD;
                        } else if (i19 == i8) {
                            cVar4 = G0.c.SERVER_ERROR;
                        } else {
                            AbstractC0521b.i("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i19));
                        }
                    }
                    cVar = cVar4;
                    long j72 = cursor3.getLong(2);
                    if (hashMap.containsKey(string4)) {
                    }
                    ((List) hashMap.get(string4)).add(new G0.d(j72, cVar));
                    i13 = 0;
                    i8 = 6;
                    i9 = 5;
                    i10 = 4;
                }
                for (Map.Entry entry2 : hashMap.entrySet()) {
                    int i20 = G0.e.f826c;
                    new ArrayList();
                    ((ArrayList) a7.f878c).add(new G0.e(Collections.unmodifiableList((List) entry2.getValue()), (String) entry2.getKey()));
                }
                long c7 = hVar.f1358g.c();
                SQLiteDatabase a8 = hVar.a();
                a8.beginTransaction();
                try {
                    Cursor rawQuery = a8.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                    try {
                        rawQuery.moveToNext();
                        G0.g gVar = new G0.g(rawQuery.getLong(0), c7);
                        rawQuery.close();
                        a8.setTransactionSuccessful();
                        a8.endTransaction();
                        a7.f877b = gVar;
                        a7.f879d = new G0.b(new G0.f(hVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * hVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), K0.a.f1343f.f1344a));
                        a7.f876a = (String) hVar.f1361j.get();
                        return new G0.a((G0.g) a7.f877b, Collections.unmodifiableList((ArrayList) a7.f878c), (G0.b) a7.f879d, (String) a7.f876a);
                    } catch (Throwable th3) {
                        rawQuery.close();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    a8.endTransaction();
                    throw th4;
                }
        }
    }

    @Override // k1.g
    public k1.n b(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f985g;
        String str = (String) this.f986h;
        B b7 = (B) this.f987i;
        String str2 = (String) obj;
        D3.M c7 = FirebaseMessaging.c(firebaseMessaging.f3902b);
        m1.g gVar = firebaseMessaging.f3901a;
        gVar.a();
        String d7 = "[DEFAULT]".equals(gVar.f5426b) ? "" : gVar.d();
        String a7 = firebaseMessaging.f3908h.a();
        synchronized (c7) {
            String a8 = B.a(str2, a7, System.currentTimeMillis());
            if (a8 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c7.f401g).edit();
                edit.putString(d7 + "|T|" + str + "|*", a8);
                edit.commit();
            }
        }
        if (b7 == null || !str2.equals(b7.f881a)) {
            m1.g gVar2 = firebaseMessaging.f3901a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f5426b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(gVar2.f5426b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new C0138l(firebaseMessaging.f3902b).b(intent);
            }
        }
        return AbstractC0219a.p(str2);
    }

    @Override // L0.b
    public Object c() {
        I0.a aVar = (I0.a) this.f985g;
        D0.j jVar = (D0.j) this.f986h;
        D0.i iVar = (D0.i) this.f987i;
        K0.h hVar = (K0.h) aVar.f1164d;
        hVar.getClass();
        A0.d dVar = jVar.f344c;
        String str = iVar.f336a;
        String str2 = jVar.f342a;
        String o7 = AbstractC0521b.o("SQLiteEventStore");
        if (Log.isLoggable(o7, 3)) {
            Log.d(o7, "Storing event with priority=" + dVar + ", name=" + str + " for destination " + str2);
        }
        ((Long) hVar.e(new r(hVar, iVar, jVar, 3))).getClass();
        aVar.f1161a.a(jVar, 1, false);
        return null;
    }
}
