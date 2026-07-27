package a1;

import B0.f;
import I1.o;
import U.e;
import V0.h;
import V0.k;
import android.app.ActivityManager;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import c1.C0308a;
import c1.C0309b;
import c1.g;
import c1.i;
import com.google.firebase.messaging.FirebaseMessaging;
import f1.AbstractC0416a;
import f2.j;
import f2.u;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.screenshot.impl.C1182n;
import io.appmetrica.analytics.screenshot.impl.d0;
import io.appmetrica.analytics.screenshot.impl.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n2.AbstractC1341c;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0178b implements d1.b, g, I1.g, FunctionWithThrowable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3838a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3839b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3840c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f3841d;

    public /* synthetic */ C0178b(i iVar, Object obj, V0.i iVar2, int i2) {
        this.f3838a = i2;
        this.f3841d = iVar;
        this.f3839b = obj;
        this.f3840c = iVar2;
    }

    @Override // I1.g
    public o a(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f3841d;
        String str = (String) this.f3840c;
        u uVar = (u) this.f3839b;
        String str2 = (String) obj;
        e c2 = FirebaseMessaging.c(firebaseMessaging.f5323b);
        K1.g gVar = firebaseMessaging.f5322a;
        gVar.a();
        String d6 = "[DEFAULT]".equals(gVar.f1388b) ? "" : gVar.d();
        String a6 = firebaseMessaging.f5329h.a();
        synchronized (c2) {
            String a7 = u.a(str2, a6, System.currentTimeMillis());
            if (a7 != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c2.f3053a).edit();
                edit.putString(d6 + "|T|" + str + "|*", a7);
                edit.commit();
            }
        }
        if (uVar == null || !str2.equals(uVar.f5641a)) {
            K1.g gVar2 = firebaseMessaging.f5322a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f1388b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    gVar2.a();
                    sb.append(gVar2.f1388b);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new j(firebaseMessaging.f5323b).b(intent);
            }
        }
        return f.r(str2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089 A[SYNTHETIC] */
    @Override // c1.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        i iVar;
        Y0.c cVar;
        Y0.c cVar2;
        int i2 = 5;
        int i3 = 4;
        int i6 = 3;
        Y0.c cVar3 = Y0.c.CACHE_FULL;
        int i7 = 2;
        int i8 = 0;
        Object obj2 = this.f3840c;
        Object obj3 = this.f3841d;
        Object obj4 = this.f3839b;
        int i9 = 1;
        switch (this.f3838a) {
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                i iVar2 = (i) obj3;
                long simpleQueryForLong = iVar2.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar2.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C0308a c0308a = iVar2.f4911d;
                long j2 = c0308a.f4894a;
                h hVar = (h) obj4;
                String str = hVar.f3202a;
                if (simpleQueryForLong >= j2) {
                    iVar2.o(1L, cVar3, str);
                    return -1L;
                }
                V0.i iVar3 = (V0.i) obj2;
                Long b6 = i.b(sQLiteDatabase, iVar3);
                if (b6 != null) {
                    insert = b6.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar3.f3208a);
                    contentValues.put("priority", Integer.valueOf(AbstractC0416a.a(iVar3.f3210c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar3.f3209b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                k kVar = hVar.f3204c;
                byte[] bArr2 = kVar.f3214b;
                int length = bArr2.length;
                int i10 = c0308a.f4898e;
                boolean z = length <= i10;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.f3205d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.f3206e));
                contentValues2.put("payload_encoding", kVar.f3213a.f2740a);
                contentValues2.put("code", hVar.f3203b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long insert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int ceil = (int) Math.ceil(bArr2.length / i10);
                    for (int i11 = 1; i11 <= ceil; i11++) {
                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i11 - 1) * i10, Math.min(i11 * i10, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(insert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i11));
                        contentValues3.put("bytes", copyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar.f3207f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 2:
                Cursor cursor = (Cursor) obj;
                i iVar4 = (i) obj3;
                iVar4.getClass();
                while (cursor.moveToNext()) {
                    long j6 = cursor.getLong(0);
                    int i12 = cursor.getInt(7) != 0 ? i9 : 0;
                    M0.e eVar = new M0.e(i7);
                    eVar.f1788h = new HashMap();
                    String string = cursor.getString(i9);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    eVar.f1783c = string;
                    eVar.f1786f = Long.valueOf(cursor.getLong(i7));
                    eVar.f1787g = Long.valueOf(cursor.getLong(3));
                    if (i12 != 0) {
                        String string2 = cursor.getString(4);
                        eVar.f1785e = new k(string2 == null ? i.f4907f : new S0.c(string2), cursor.getBlob(5));
                        iVar = iVar4;
                    } else {
                        String string3 = cursor.getString(4);
                        S0.c cVar4 = string3 == null ? i.f4907f : new S0.c(string3);
                        Cursor query = iVar4.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j6)}, null, null, "sequence_num");
                        try {
                            Cursor cursor2 = query;
                            ArrayList arrayList = new ArrayList();
                            int i13 = 0;
                            while (cursor2.moveToNext()) {
                                byte[] blob = cursor2.getBlob(0);
                                arrayList.add(blob);
                                i13 += blob.length;
                            }
                            byte[] bArr3 = new byte[i13];
                            int i14 = 0;
                            int i15 = 0;
                            while (i14 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i14);
                                ArrayList arrayList2 = arrayList;
                                i iVar5 = iVar4;
                                System.arraycopy(bArr4, 0, bArr3, i15, bArr4.length);
                                i15 += bArr4.length;
                                i14++;
                                arrayList = arrayList2;
                                iVar4 = iVar5;
                            }
                            iVar = iVar4;
                            query.close();
                            eVar.f1785e = new k(cVar4, bArr3);
                        } catch (Throwable th) {
                            query.close();
                            throw th;
                        }
                    }
                    if (!cursor.isNull(6)) {
                        eVar.f1784d = Integer.valueOf(cursor.getInt(6));
                    }
                    ((ArrayList) obj4).add(new C0309b(j6, (V0.i) obj2, eVar.c()));
                    iVar4 = iVar;
                    i7 = 2;
                    i9 = 1;
                }
                return null;
            case 3:
                Cursor cursor3 = (Cursor) obj;
                i iVar6 = (i) obj3;
                iVar6.getClass();
                while (true) {
                    HashMap hashMap = (HashMap) obj2;
                    if (cursor3.moveToNext()) {
                        String string4 = cursor3.getString(i8);
                        int i16 = cursor3.getInt(1);
                        Y0.c cVar5 = Y0.c.REASON_UNKNOWN;
                        if (i16 != 0) {
                            if (i16 == 1) {
                                cVar5 = Y0.c.MESSAGE_TOO_OLD;
                            } else if (i16 == 2) {
                                cVar = cVar3;
                                cVar2 = cVar;
                                long j7 = cursor3.getLong(2);
                                if (hashMap.containsKey(string4)) {
                                    hashMap.put(string4, new ArrayList());
                                }
                                ((List) hashMap.get(string4)).add(new Y0.d(j7, cVar));
                                cVar3 = cVar2;
                                i2 = 5;
                                i3 = 4;
                                i6 = 3;
                                i8 = 0;
                            } else if (i16 == i6) {
                                cVar5 = Y0.c.PAYLOAD_TOO_BIG;
                            } else if (i16 == i3) {
                                cVar5 = Y0.c.MAX_RETRIES_REACHED;
                            } else if (i16 == i2) {
                                cVar5 = Y0.c.INVALID_PAYLOD;
                            } else if (i16 == 6) {
                                cVar5 = Y0.c.SERVER_ERROR;
                            } else {
                                AbstractC1341c.f("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i16));
                            }
                        }
                        cVar2 = cVar3;
                        cVar = cVar5;
                        long j72 = cursor3.getLong(2);
                        if (hashMap.containsKey(string4)) {
                        }
                        ((List) hashMap.get(string4)).add(new Y0.d(j72, cVar));
                        cVar3 = cVar2;
                        i2 = 5;
                        i3 = 4;
                        i6 = 3;
                        i8 = 0;
                    } else {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            B0.i iVar7 = (B0.i) obj4;
                            if (!it.hasNext()) {
                                long e3 = iVar6.f4909b.e();
                                SQLiteDatabase a6 = iVar6.a();
                                a6.beginTransaction();
                                try {
                                    Y0.g gVar = (Y0.g) i.y(a6.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new c1.f(e3));
                                    a6.setTransactionSuccessful();
                                    a6.endTransaction();
                                    iVar7.f153b = gVar;
                                    iVar7.f155d = new Y0.b(new Y0.f(iVar6.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * iVar6.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), C0308a.f4893f.f4894a));
                                    iVar7.f156e = (String) iVar6.f4912e.get();
                                    return new Y0.a((Y0.g) iVar7.f153b, Collections.unmodifiableList((ArrayList) iVar7.f154c), (Y0.b) iVar7.f155d, (String) iVar7.f156e);
                                } catch (Throwable th2) {
                                    a6.endTransaction();
                                    throw th2;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i17 = Y0.e.f3678c;
                            new ArrayList();
                            ((ArrayList) iVar7.f154c).add(new Y0.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
            default:
                return d0.a((g0) obj3, (d0) obj2, (C1182n) obj4, (ActivityManager) obj);
        }
    }

    @Override // d1.b
    public Object execute() {
        C0179c c0179c = (C0179c) this.f3841d;
        i iVar = (i) c0179c.f3846d;
        iVar.getClass();
        V0.i iVar2 = (V0.i) this.f3840c;
        h hVar = (h) this.f3839b;
        String s2 = AbstractC1341c.s("SQLiteEventStore");
        if (Log.isLoggable(s2, 3)) {
            Log.d(s2, "Storing event with priority=" + iVar2.f3210c + ", name=" + hVar.f3202a + " for destination " + iVar2.f3208a);
        }
        ((Long) iVar.c(new C0178b(iVar, (Object) hVar, iVar2, 1))).getClass();
        c0179c.f3843a.a(iVar2, 1, false);
        return null;
    }

    public /* synthetic */ C0178b(Object obj, Object obj2, Object obj3, int i2) {
        this.f3838a = i2;
        this.f3841d = obj;
        this.f3840c = obj2;
        this.f3839b = obj3;
    }
}
