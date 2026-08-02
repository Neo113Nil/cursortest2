package A0;

import B0.p;
import C0.i;
import C0.k;
import a.AbstractC0129a;
import android.app.ActivityManager;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import android.util.Log;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerRequest;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.screenshot.impl.C1031n;
import io.appmetrica.analytics.screenshot.impl.d0;
import io.appmetrica.analytics.screenshot.impl.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s0.C1185b;
import v0.h;
import y0.C1251a;
import y0.C1252b;
import y0.g;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements D0.b, i, FunctionWithThrowable, BannerRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10d;

    public /* synthetic */ b(k kVar, Object obj, v0.i iVar, int i3) {
        this.f7a = i3;
        this.f10d = kVar;
        this.f8b = obj;
        this.f9c = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008b A[SYNTHETIC] */
    @Override // C0.i, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object apply(Object obj) {
        long insert;
        Cursor cursor;
        int i3;
        y0.c cVar;
        y0.c cVar2;
        int i4 = 5;
        int i5 = 4;
        int i6 = 3;
        y0.c cVar3 = y0.c.CACHE_FULL;
        int i7 = 2;
        int i8 = 0;
        Object obj2 = this.f9c;
        Object obj3 = this.f10d;
        Object obj4 = this.f8b;
        int i9 = 1;
        switch (this.f7a) {
            case 1:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                k kVar = (k) obj3;
                long simpleQueryForLong = kVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * kVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                C0.a aVar = kVar.f211d;
                long j3 = aVar.f192a;
                h hVar = (h) obj4;
                String str = hVar.f10549a;
                if (simpleQueryForLong >= j3) {
                    kVar.e(1L, cVar3, str);
                    return -1L;
                }
                v0.i iVar = (v0.i) obj2;
                Long b3 = k.b(sQLiteDatabase, iVar);
                if (b3 != null) {
                    insert = b3.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.f10554a);
                    contentValues.put("priority", Integer.valueOf(F0.a.a(iVar.f10556c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f10555b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    insert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                v0.k kVar2 = hVar.f10551c;
                byte[] bArr2 = kVar2.f10563b;
                int length = bArr2.length;
                int i10 = aVar.f196e;
                boolean z = length <= i10;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(insert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.f10552d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.f10553e));
                contentValues2.put("payload_encoding", kVar2.f10562a.f10289a);
                contentValues2.put("code", hVar.f10550b);
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
                for (Map.Entry entry : Collections.unmodifiableMap(hVar.f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(insert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(insert2);
            case 2:
                Cursor cursor2 = (Cursor) obj;
                k kVar3 = (k) obj3;
                kVar3.getClass();
                while (cursor2.moveToNext()) {
                    long j4 = cursor2.getLong(0);
                    int i12 = cursor2.getInt(7) != 0 ? i9 : 0;
                    F1.c cVar4 = new F1.c();
                    cVar4.f = new HashMap();
                    String string = cursor2.getString(i9);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    cVar4.f486a = string;
                    cVar4.f489d = Long.valueOf(cursor2.getLong(i7));
                    cVar4.f490e = Long.valueOf(cursor2.getLong(3));
                    if (i12 != 0) {
                        String string2 = cursor2.getString(4);
                        cVar4.f488c = new v0.k(string2 == null ? k.f : new C1185b(string2), cursor2.getBlob(5));
                        i3 = i9;
                    } else {
                        String string3 = cursor2.getString(4);
                        C1185b c1185b = string3 == null ? k.f : new C1185b(string3);
                        Cursor query = kVar3.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j4)}, null, null, "sequence_num");
                        try {
                            Cursor cursor3 = query;
                            ArrayList arrayList = new ArrayList();
                            int i13 = 0;
                            while (cursor3.moveToNext()) {
                                byte[] blob = cursor3.getBlob(0);
                                arrayList.add(blob);
                                i13 += blob.length;
                                i9 = i9;
                            }
                            i3 = i9;
                            byte[] bArr3 = new byte[i13];
                            int i14 = 0;
                            int i15 = 0;
                            while (i14 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i14);
                                cursor = query;
                                try {
                                    int i16 = i14;
                                    System.arraycopy(bArr4, 0, bArr3, i15, bArr4.length);
                                    i15 += bArr4.length;
                                    i14 = i16 + 1;
                                    query = cursor;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            query.close();
                            cVar4.f488c = new v0.k(c1185b, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = query;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        cVar4.f487b = Integer.valueOf(cursor2.getInt(6));
                    }
                    ((ArrayList) obj4).add(new C0.b(j4, (v0.i) obj2, cVar4.c()));
                    i9 = i3;
                    i7 = 2;
                }
                return null;
            case 3:
                Cursor cursor4 = (Cursor) obj;
                k kVar4 = (k) obj3;
                kVar4.getClass();
                while (true) {
                    HashMap hashMap = (HashMap) obj2;
                    if (cursor4.moveToNext()) {
                        String string4 = cursor4.getString(i8);
                        int i17 = cursor4.getInt(1);
                        y0.c cVar5 = y0.c.REASON_UNKNOWN;
                        if (i17 != 0) {
                            if (i17 == 1) {
                                cVar5 = y0.c.MESSAGE_TOO_OLD;
                            } else if (i17 == 2) {
                                cVar = cVar3;
                                cVar2 = cVar;
                                long j5 = cursor4.getLong(2);
                                if (hashMap.containsKey(string4)) {
                                    hashMap.put(string4, new ArrayList());
                                }
                                ((List) hashMap.get(string4)).add(new y0.d(j5, cVar));
                                cVar3 = cVar2;
                                i4 = 5;
                                i5 = 4;
                                i6 = 3;
                                i8 = 0;
                            } else if (i17 == i6) {
                                cVar5 = y0.c.PAYLOAD_TOO_BIG;
                            } else if (i17 == i5) {
                                cVar5 = y0.c.MAX_RETRIES_REACHED;
                            } else if (i17 == i4) {
                                cVar5 = y0.c.INVALID_PAYLOD;
                            } else if (i17 == 6) {
                                cVar5 = y0.c.SERVER_ERROR;
                            } else {
                                AbstractC0129a.j("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i17));
                            }
                        }
                        cVar2 = cVar3;
                        cVar = cVar5;
                        long j52 = cursor4.getLong(2);
                        if (hashMap.containsKey(string4)) {
                        }
                        ((List) hashMap.get(string4)).add(new y0.d(j52, cVar));
                        cVar3 = cVar2;
                        i4 = 5;
                        i5 = 4;
                        i6 = 3;
                        i8 = 0;
                    } else {
                        Iterator it = hashMap.entrySet().iterator();
                        while (true) {
                            p pVar = (p) obj4;
                            if (!it.hasNext()) {
                                pVar.f162a = (g) kVar4.c(new C0.h(kVar4.f209b.d()));
                                pVar.f164c = new C1252b(new y0.f(kVar4.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * kVar4.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), C0.a.f.f192a));
                                pVar.f165d = (String) kVar4.f212e.get();
                                return new C1251a((g) pVar.f162a, Collections.unmodifiableList((ArrayList) pVar.f163b), (C1252b) pVar.f164c, (String) pVar.f165d);
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i18 = y0.e.f10818c;
                            new ArrayList();
                            ((ArrayList) pVar.f163b).add(new y0.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
            default:
                return d0.a((g0) obj3, (d0) obj2, (C1031n) obj4, (ActivityManager) obj);
        }
    }

    @Override // D0.b
    public Object execute() {
        c cVar = (c) this.f10d;
        k kVar = (k) cVar.f14d;
        kVar.getClass();
        v0.i iVar = (v0.i) this.f9c;
        h hVar = (h) this.f8b;
        String p3 = AbstractC0129a.p("SQLiteEventStore");
        if (Log.isLoggable(p3, 3)) {
            Log.d(p3, "Storing event with priority=" + iVar.f10556c + ", name=" + hVar.f10549a + " for destination " + iVar.f10554a);
        }
        ((Long) kVar.c(new b(kVar, (Object) hVar, iVar, 1))).getClass();
        cVar.f11a.a(iVar, 1, false);
        return null;
    }

    @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
    public void onFinished(BannerCreator bannerCreator, String str) {
        ((BannerRequest) this.f10d).lambda$loadImpl$1((BannerRequest.Callback) this.f9c, (String) this.f8b, bannerCreator, str);
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i3) {
        this.f7a = i3;
        this.f10d = obj;
        this.f9c = obj2;
        this.f8b = obj3;
    }
}
