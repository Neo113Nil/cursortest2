package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.vh, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0582vh implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final Y4 f1536a;
    public final LinkedHashMap b;
    public C0348m7 c;
    public C0299k9 d;
    public final M6 e;
    public List f;
    public int g;
    public int h;
    public int i;
    public C0557uh j;
    public final C0035a3 k;
    public final PublicLogger l;
    public final yo m;
    public final Sa n;
    public final C0049ah o;
    public final FullUrlFormer p;
    public final C0676zb q;
    public final RequestDataHolder r;
    public final ResponseDataHolder s;
    public final SendingDataTaskHelper t;
    public int u;
    public boolean v;

    public C0582vh(Y4 y4, C0049ah c0049ah, C0676zb c0676zb, FullUrlFormer<C0333lh> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(y4, c0049ah, c0676zb, fullUrlFormer, requestDataHolder, responseDataHolder, y4.i(), y4.p(), y4.u(), requestBodyEncrypter);
    }

    public final C0299k9 a(C0557uh c0557uh, List list, C0333lh c0333lh) {
        C0299k9 c0299k9 = new C0299k9();
        C0093c9 c0093c9 = new C0093c9();
        c0093c9.f1193a = WrapUtils.getOrDefaultIfEmpty(this.c.b, c0333lh.getUuid());
        c0093c9.b = WrapUtils.getOrDefaultIfEmpty(this.c.f1372a, c0333lh.getDeviceId());
        this.g = CodedOutputByteBufferNano.computeMessageSize(4, c0093c9) + this.g;
        c0299k9.b = c0093c9;
        C0439pn C = C0401oa.I.C();
        C0507sh c0507sh = new C0507sh(this, c0299k9);
        synchronized (C) {
            C.f1441a.a(c0507sh);
        }
        c0299k9.f1339a = (C0222h9[]) c0557uh.f1518a.toArray(new C0222h9[0]);
        c0299k9.c = a(c0557uh.c);
        c0299k9.e = (String[]) list.toArray(new String[0]);
        Set set = c0333lh.x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c0299k9.f = new byte[strArr.length][];
        for (int i = 0; i < set.size(); i++) {
            c0299k9.f[i] = StringUtils.getUTF8Bytes(strArr[i]);
        }
        return c0299k9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f1536a.b.b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0333lh) this.f1536a.k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Bl) C0401oa.I.z()).getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onCreateTask() {
        Cursor cursor;
        int optInt;
        M6 m6 = this.f1536a.e;
        m6.getClass();
        ArrayList arrayList = new ArrayList();
        m6.f950a.lock();
        try {
            SQLiteDatabase readableDatabase = m6.c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(AbstractC0570v5.b, null);
                while (cursor.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursor, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                            if (!arrayList.isEmpty()) {
                            }
                        } finally {
                            mo.a(cursor);
                            m6.f950a.unlock();
                        }
                    }
                }
            } else {
                cursor = null;
            }
        } catch (Throwable unused2) {
            cursor = null;
        }
        if (!arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C0348m7 c0348m7 = new C0348m7();
            this.c = c0348m7;
            this.o.c = c0348m7;
        } else {
            try {
                C0348m7 c0348m72 = new C0348m7(new C0198gb(asString));
                this.c = c0348m72;
                this.o.c = c0348m72;
            } catch (Throwable unused3) {
                C0348m7 c0348m73 = new C0348m7();
                this.c = c0348m73;
                this.o.c = c0348m73;
            }
        }
        C0333lh config = this.q.getConfig();
        List list = config.w;
        if (mo.a((Collection) list)) {
            return false;
        }
        this.p.setHosts(config.q);
        if (!config.u() || mo.a((Collection) this.p.getAllHosts())) {
            this.v = true;
            return false;
        }
        this.f = null;
        C0557uh a2 = a(config);
        this.j = a2;
        if (a2.f1518a.isEmpty()) {
            return false;
        }
        yo yoVar = this.m;
        synchronized (yoVar) {
            optInt = yoVar.f1591a.a().optInt("report_request_id", -1);
        }
        int i = optInt + 1;
        this.u = i;
        this.o.e = i;
        C0299k9 a3 = a(this.j, list, config);
        this.d = a3;
        this.f = this.j.b;
        this.t.prepareAndSetPostData(MessageNano.toByteArray(a3));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String a2;
        if (z) {
            a(false);
        } else if (this.s.getResponseCode() == 400) {
            a(true);
        }
        if (z) {
            for (int i = 0; i < this.j.f1518a.size(); i++) {
                for (C0170f9 c0170f9 : ((C0222h9) this.j.f1518a.get(i)).c) {
                    if (c0170f9 != null && (a2 = Rf.a(c0170f9)) != null) {
                        this.l.info(a2, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C0321l5) this.f1536a.p).d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C0321l5) this.f1536a.p).d.set(true);
        if (this.v) {
            ((C0321l5) this.f1536a.p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C0582vh(Y4 y4, C0049ah c0049ah, C0676zb c0676zb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, M6 m6, PublicLogger publicLogger, yo yoVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(y4, publicLogger, m6, c0049ah, yoVar, c0676zb, new C0035a3(1024000, "event value in ReportTask", publicLogger), AbstractC0641y1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C0582vh(Y4 y4, PublicLogger publicLogger, M6 m6, C0049ah c0049ah, yo yoVar, C0676zb c0676zb, C0035a3 c0035a3, Rj rj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.b = new LinkedHashMap();
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.v = false;
        this.t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.o = c0049ah;
        this.f1536a = y4;
        this.e = m6;
        this.l = publicLogger;
        this.k = c0035a3;
        this.m = yoVar;
        this.q = c0676zb;
        this.n = rj;
        this.r = requestDataHolder;
        this.s = responseDataHolder;
        this.p = fullUrlFormer;
    }

    public static Z8[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        Z8[] z8Arr = new Z8[length];
        Iterator<String> keys = jSONObject.keys();
        int i = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Z8 z8 = new Z8();
                z8.f1141a = next;
                z8.b = jSONObject.getString(next);
                z8Arr[i] = z8;
            } catch (Throwable unused) {
            }
            i++;
        }
        return z8Arr;
    }

    public final void a(boolean z) {
        boolean z2;
        yo yoVar = this.m;
        int i = this.u;
        synchronized (yoVar) {
            zo zoVar = yoVar.f1591a;
            zoVar.a(zoVar.a().put("report_request_id", i));
        }
        C0222h9[] c0222h9Arr = this.d.f1339a;
        int i2 = 0;
        while (i2 < c0222h9Arr.length) {
            try {
                C0222h9 c0222h9 = c0222h9Arr[i2];
                long longValue = ((Long) this.f.get(i2)).longValue();
                Wk wk = (Wk) Qf.b.get(c0222h9.b.c);
                if (wk == null) {
                    wk = Wk.FOREGROUND;
                }
                z2 = z;
                try {
                    this.e.a(longValue, wk.f1108a, c0222h9.c.length, z2);
                    Qf.a(c0222h9);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z2 = z;
            }
            i2++;
            z = z2;
        }
        M6 m6 = this.e;
        long a2 = this.f1536a.j.a();
        m6.b.lock();
        try {
            if (AbstractC0620x5.f1561a.booleanValue()) {
                m6.c();
            }
            SQLiteDatabase writableDatabase = m6.c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC0570v5.c, new String[]{String.valueOf(a2)});
            }
        } catch (Throwable unused3) {
        }
        m6.b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e7 A[LOOP:1: B:60:0x00e1->B:62:0x00e7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0557uh a(C0333lh c0333lh) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor a2 = a();
            if (a2 != null) {
                JSONObject jSONObject2 = jSONObject;
                C0239i0 c0239i0 = null;
                while (a2.moveToNext() && this.h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(a2, contentValues);
                        C0522t7 model = new C0547u7(null, 1, null).toModel(contentValues);
                        Long l = model.f1496a;
                        if (l != null) {
                            C0497s7 c0497s7 = model.d;
                            C0273j9 a3 = Qf.a(c0497s7.f1481a, c0497s7.b, c0497s7.c);
                            String locale = c0333lh.getLocale();
                            Wk wk = model.b;
                            C0196g9 c0196g9 = new C0196g9();
                            c0196g9.f1269a = a3;
                            c0196g9.b = locale;
                            if (wk != null) {
                                Integer num = (Integer) Qf.f1016a.get(wk);
                                c0196g9.c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c0196g9);
                            this.g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            C0532th a4 = a(l.longValue(), c0196g9, c0333lh, arrayList3, arrayList.size());
                            if (a4 == null) {
                                continue;
                            } else {
                                if (c0239i0 == null) {
                                    c0239i0 = a4.b;
                                } else if (!c0239i0.equals(a4.b)) {
                                    break;
                                }
                                arrayList2.add(l);
                                arrayList.add(a4.f1501a);
                                if (!TextUtils.isEmpty(a4.b.f1297a)) {
                                    try {
                                        jSONObject2 = new JSONObject(a4.b.f1297a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (a4.c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = a2;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            return new C0557uh(arrayList, arrayList2, jSONObject);
                        } finally {
                            mo.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            mo.a(a2);
        } catch (Throwable th2) {
            th = th2;
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
            this.n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C0557uh(arrayList, arrayList2, jSONObject);
    }

    public static C0239i0 a(ContentValues contentValues) {
        C0168f7 model = new C0194g7(null, 1, null).toModel(contentValues);
        return new C0239i0((String) WrapUtils.getOrDefault(model.g.g, ""), ((Long) WrapUtils.getOrDefault(model.g.h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[Catch: all -> 0x010c, TryCatch #4 {all -> 0x010c, blocks: (B:12:0x0025, B:13:0x002b, B:15:0x0032, B:17:0x0038, B:29:0x006c, B:31:0x0072, B:71:0x0094, B:34:0x00a5, B:36:0x00b4, B:41:0x00c0, B:42:0x00bf, B:43:0x00ba, B:44:0x00c6, B:47:0x00d8, B:58:0x00df, B:75:0x009d, B:57:0x00e7, B:82:0x0065, B:51:0x00f1, B:53:0x00f7), top: B:11:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0532th a(long j, C0196g9 c0196g9, C0333lh c0333lh, ArrayList arrayList, int i) {
        Cursor cursor;
        boolean z;
        C0532th c0532th;
        C0170f9 c0170f9;
        int i2;
        Z8[] a2;
        V8 v8;
        C0222h9 c0222h9 = new C0222h9();
        c0222h9.f1287a = j;
        c0222h9.b = c0196g9;
        Wk wk = (Wk) Qf.b.get(c0196g9.c);
        if (wk == null) {
            wk = Wk.FOREGROUND;
        }
        try {
            cursor = a(j, wk);
            if (cursor != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C0239i0 c0239i0 = null;
                    while (true) {
                        z = false;
                        if (!cursor.moveToNext() || this.h >= 100) {
                            break;
                        }
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            O8 o8 = new O8(contentValues);
                            EnumC0095cb enumC0095cb = o8.h;
                            if (enumC0095cb != null) {
                                v8 = (V8) Qf.d.get(enumC0095cb);
                            } else {
                                Map map = Qf.f1016a;
                                v8 = null;
                            }
                            if (v8 == null) {
                                v8 = V8.i;
                            }
                            try {
                                c0170f9 = v8.a(o8, c0333lh);
                            } catch (Throwable th) {
                                th = th;
                                arrayList.add(th);
                                c0170f9 = null;
                                if (c0170f9 == null) {
                                }
                                arrayList2.add(c0170f9);
                                this.h++;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        if (c0170f9 == null) {
                            C0239i0 a3 = a(contentValues);
                            if (c0239i0 == null) {
                                if (this.i < 0) {
                                    try {
                                        a2 = a(new JSONObject(a3.f1297a));
                                    } catch (Throwable unused) {
                                    }
                                    if (a2 != null) {
                                        i2 = 0;
                                        for (Z8 z8 : a2) {
                                            i2 += CodedOutputByteBufferNano.computeMessageSize(7, z8);
                                        }
                                        this.i = i2;
                                        this.g += i2;
                                    }
                                    i2 = 0;
                                    this.i = i2;
                                    this.g += i2;
                                }
                                c0239i0 = a3;
                            } else if (!c0239i0.equals(a3)) {
                                z = true;
                                break;
                            }
                            C0035a3 c0035a3 = this.k;
                            byte[] bArr = c0170f9.e;
                            c0035a3.getClass();
                            byte[] a4 = c0035a3.a(bArr);
                            byte[] bArr2 = c0170f9.e;
                            if (bArr2 != a4) {
                                c0170f9.i = ((bArr2 == null ? 0 : bArr2.length) - (a4 == null ? 0 : a4.length)) + c0170f9.i;
                                c0170f9.e = a4;
                            }
                            this.g += CodedOutputByteBufferNano.computeMessageSize(3, c0170f9);
                            if (arrayList2.isEmpty() && i == 0) {
                                if (this.g >= 1048576) {
                                    break;
                                }
                            } else if (this.g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c0170f9);
                        this.h++;
                    }
                    if (arrayList2.size() > 0) {
                        c0222h9.c = (C0170f9[]) arrayList2.toArray(new C0170f9[arrayList2.size()]);
                        c0532th = new C0532th(c0222h9, c0239i0, z);
                        return c0532th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        mo.a(cursor);
                        return null;
                    } finally {
                        mo.a(cursor);
                    }
                }
            }
            c0532th = null;
            return c0532th;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final Cursor a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        M6 m6 = this.e;
        LinkedHashMap linkedHashMap = this.b;
        m6.f950a.lock();
        try {
            readableDatabase = m6.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, M6.a(linkedHashMap), M6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            m6.f950a.unlock();
            return cursor;
        }
        cursor = null;
        m6.f950a.unlock();
        return cursor;
    }

    public final Cursor a(long j, Wk wk) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        M6 m6 = this.e;
        m6.f950a.lock();
        try {
            readableDatabase = m6.c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j), Integer.toString(wk.f1108a)}, null, null, "number_in_session ASC", null);
            m6.f950a.unlock();
            return cursor;
        }
        cursor = null;
        m6.f950a.unlock();
        return cursor;
    }
}
