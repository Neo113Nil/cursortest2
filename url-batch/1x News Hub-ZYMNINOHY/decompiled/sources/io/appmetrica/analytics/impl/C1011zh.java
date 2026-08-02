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

/* renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1011zh implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final C0457e5 f8689a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f8690b;

    /* renamed from: c, reason: collision with root package name */
    public C0847t7 f8691c;

    /* renamed from: d, reason: collision with root package name */
    public C0772q9 f8692d;

    /* renamed from: e, reason: collision with root package name */
    public final S6 f8693e;
    public List f;

    /* renamed from: g, reason: collision with root package name */
    public int f8694g;

    /* renamed from: h, reason: collision with root package name */
    public int f8695h;

    /* renamed from: i, reason: collision with root package name */
    public int f8696i;

    /* renamed from: j, reason: collision with root package name */
    public C0986yh f8697j;

    /* renamed from: k, reason: collision with root package name */
    public final C0533h3 f8698k;

    /* renamed from: l, reason: collision with root package name */
    public final PublicLogger f8699l;

    /* renamed from: m, reason: collision with root package name */
    public final zo f8700m;

    /* renamed from: n, reason: collision with root package name */
    public final Ya f8701n;
    public final C0469eh o;

    /* renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f8702p;

    /* renamed from: q, reason: collision with root package name */
    public final Fb f8703q;

    /* renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f8704r;

    /* renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f8705s;

    /* renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f8706t;

    /* renamed from: u, reason: collision with root package name */
    public int f8707u;
    public boolean v;

    public C1011zh(C0457e5 c0457e5, C0469eh c0469eh, Fb fb, FullUrlFormer<C0754ph> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(c0457e5, c0469eh, fb, fullUrlFormer, requestDataHolder, responseDataHolder, c0457e5.i(), c0457e5.p(), c0457e5.u(), requestBodyEncrypter);
    }

    public final C0772q9 a(C0986yh c0986yh, List list, C0754ph c0754ph) {
        C0772q9 c0772q9 = new C0772q9();
        C0565i9 c0565i9 = new C0565i9();
        c0565i9.f7515a = WrapUtils.getOrDefaultIfEmpty(this.f8691c.f8341b, c0754ph.getUuid());
        c0565i9.f7516b = WrapUtils.getOrDefaultIfEmpty(this.f8691c.f8340a, c0754ph.getDeviceId());
        this.f8694g = CodedOutputByteBufferNano.computeMessageSize(4, c0565i9) + this.f8694g;
        c0772q9.f8146b = c0565i9;
        C0786qn C3 = C0876ua.f8420H.C();
        C0935wh c0935wh = new C0935wh(this, c0772q9);
        synchronized (C3) {
            C3.f8185a.a(c0935wh);
        }
        c0772q9.f8145a = (C0694n9[]) c0986yh.f8644a.toArray(new C0694n9[0]);
        c0772q9.f8147c = a(c0986yh.f8646c);
        c0772q9.f8149e = (String[]) list.toArray(new String[0]);
        Set set = c0754ph.f8099x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c0772q9.f = new byte[strArr.length][];
        for (int i3 = 0; i3 < set.size(); i3++) {
            c0772q9.f[i3] = StringUtils.getUTF8Bytes(strArr[i3]);
        }
        return c0772q9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f8689a.f7226b.f6861b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f8702p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f8704r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f8705s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0754ph) this.f8689a.f7234k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((El) C0876ua.f8420H.A()).getClass();
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
        S6 s6 = this.f8689a.f7229e;
        s6.getClass();
        ArrayList arrayList = new ArrayList();
        s6.f6598a.lock();
        try {
            SQLiteDatabase readableDatabase = s6.f6600c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(B5.f5806b, null);
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
                            AbstractC0709no.a(cursor);
                            s6.f6598a.unlock();
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
        this.f8690b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f8690b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C0847t7 c0847t7 = new C0847t7();
            this.f8691c = c0847t7;
            this.o.f7284c = c0847t7;
        } else {
            try {
                C0847t7 c0847t72 = new C0847t7(new C0670mb(asString));
                this.f8691c = c0847t72;
                this.o.f7284c = c0847t72;
            } catch (Throwable unused3) {
                C0847t7 c0847t73 = new C0847t7();
                this.f8691c = c0847t73;
                this.o.f7284c = c0847t73;
            }
        }
        C0754ph config = this.f8703q.getConfig();
        List list = config.f8098w;
        if (AbstractC0709no.a((Collection) list)) {
            return false;
        }
        this.f8702p.setHosts(config.f8093q);
        if (!config.u() || AbstractC0709no.a((Collection) this.f8702p.getAllHosts())) {
            this.v = true;
            return false;
        }
        this.f = null;
        C0986yh a3 = a(config);
        this.f8697j = a3;
        if (a3.f8644a.isEmpty()) {
            return false;
        }
        zo zoVar = this.f8700m;
        synchronized (zoVar) {
            optInt = zoVar.f8716a.a().optInt("report_request_id", -1);
        }
        int i3 = optInt + 1;
        this.f8707u = i3;
        this.o.f7286e = i3;
        C0772q9 a4 = a(this.f8697j, list, config);
        this.f8692d = a4;
        this.f = this.f8697j.f8645b;
        this.f8706t.prepareAndSetPostData(MessageNano.toByteArray(a4));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f8706t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String a3;
        if (z) {
            a(false);
        } else if (this.f8705s.getResponseCode() == 400) {
            a(true);
        }
        if (z) {
            for (int i3 = 0; i3 < this.f8697j.f8644a.size(); i3++) {
                for (C0642l9 c0642l9 : ((C0694n9) this.f8697j.f8644a.get(i3)).f7945c) {
                    if (c0642l9 != null && (a3 = Vf.a(c0642l9)) != null) {
                        this.f8699l.info(a3, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f8706t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.v = true;
        this.f8689a.f7229e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C0793r5) this.f8689a.f7238p).f8208d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        this.f8689a.f7229e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C0793r5) this.f8689a.f7238p).f8208d.set(true);
        if (this.v) {
            ((C0793r5) this.f8689a.f7238p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C1011zh(C0457e5 c0457e5, C0469eh c0469eh, Fb fb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, S6 s6, PublicLogger publicLogger, zo zoVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(c0457e5, publicLogger, s6, c0469eh, zoVar, fb, new C0533h3(1024000, "event value in ReportTask", publicLogger), AbstractC0919w1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C1011zh(C0457e5 c0457e5, PublicLogger publicLogger, S6 s6, C0469eh c0469eh, zo zoVar, Fb fb, C0533h3 c0533h3, Vj vj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f8690b = new LinkedHashMap();
        this.f8694g = 0;
        this.f8695h = 0;
        this.f8696i = -1;
        this.v = false;
        this.f8706t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.o = c0469eh;
        this.f8689a = c0457e5;
        this.f8693e = s6;
        this.f8699l = publicLogger;
        this.f8698k = c0533h3;
        this.f8700m = zoVar;
        this.f8703q = fb;
        this.f8701n = vj;
        this.f8704r = requestDataHolder;
        this.f8705s = responseDataHolder;
        this.f8702p = fullUrlFormer;
    }

    public static C0487f9[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C0487f9[] c0487f9Arr = new C0487f9[length];
        Iterator<String> keys = jSONObject.keys();
        int i3 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C0487f9 c0487f9 = new C0487f9();
                c0487f9.f7308a = next;
                c0487f9.f7309b = jSONObject.getString(next);
                c0487f9Arr[i3] = c0487f9;
            } catch (Throwable unused) {
            }
            i3++;
        }
        return c0487f9Arr;
    }

    public final void a(boolean z) {
        boolean z2;
        zo zoVar = this.f8700m;
        int i3 = this.f8707u;
        synchronized (zoVar) {
            Ao ao = zoVar.f8716a;
            ao.a(ao.a().put("report_request_id", i3));
        }
        C0694n9[] c0694n9Arr = this.f8692d.f8145a;
        int i4 = 0;
        while (i4 < c0694n9Arr.length) {
            try {
                C0694n9 c0694n9 = c0694n9Arr[i4];
                long longValue = ((Long) this.f.get(i4)).longValue();
                EnumC0370al enumC0370al = (EnumC0370al) Uf.f6760b.get(c0694n9.f7944b.f7872c);
                if (enumC0370al == null) {
                    enumC0370al = EnumC0370al.FOREGROUND;
                }
                z2 = z;
                try {
                    this.f8693e.a(longValue, enumC0370al.f7037a, c0694n9.f7945c.length, z2);
                    Uf.a(c0694n9);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z2 = z;
            }
            i4++;
            z = z2;
        }
        S6 s6 = this.f8693e;
        long a3 = this.f8689a.f7233j.a();
        s6.f6599b.lock();
        try {
            if (D5.f5883a.booleanValue()) {
                s6.d();
            }
            SQLiteDatabase writableDatabase = s6.f6600c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", B5.f5807c, new String[]{String.valueOf(a3)});
            }
        } catch (Throwable unused3) {
        }
        s6.f6599b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6 A[LOOP:1: B:60:0x00e0->B:62:0x00e6, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0986yh a(C0754ph c0754ph) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor a3 = a();
            if (a3 != null) {
                JSONObject jSONObject2 = jSONObject;
                C0556i0 c0556i0 = null;
                while (a3.moveToNext() && this.f8695h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(a3, contentValues);
                        A7 model = new B7(null, 1, null).toModel(contentValues);
                        Long l3 = model.f5729a;
                        if (l3 != null) {
                            C1001z7 c1001z7 = model.f5732d;
                            C0746p9 a4 = Uf.a(c1001z7.f8663a, c1001z7.f8664b, c1001z7.f8665c);
                            String locale = c0754ph.getLocale();
                            EnumC0370al enumC0370al = model.f5730b;
                            C0668m9 c0668m9 = new C0668m9();
                            c0668m9.f7870a = a4;
                            c0668m9.f7871b = locale;
                            if (enumC0370al != null) {
                                Integer num = (Integer) Uf.f6759a.get(enumC0370al);
                                c0668m9.f7872c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.f8694g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f8694g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c0668m9);
                            this.f8694g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            C0961xh a5 = a(l3.longValue(), c0668m9, c0754ph, arrayList3, arrayList.size());
                            if (a5 == null) {
                                continue;
                            } else {
                                if (c0556i0 == null) {
                                    c0556i0 = a5.f8620b;
                                } else if (!c0556i0.equals(a5.f8620b)) {
                                    break;
                                }
                                arrayList2.add(l3);
                                arrayList.add(a5.f8619a);
                                if (!TextUtils.isEmpty(a5.f8620b.f7491a)) {
                                    try {
                                        jSONObject2 = new JSONObject(a5.f8620b.f7491a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (a5.f8621c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = a3;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            return new C0986yh(arrayList, arrayList2, jSONObject);
                        } finally {
                            AbstractC0709no.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            AbstractC0709no.a(a3);
        } catch (Throwable th2) {
            th = th2;
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f8701n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C0986yh(arrayList, arrayList2, jSONObject);
    }

    public static C0556i0 a(ContentValues contentValues) {
        C0666m7 model = new C0692n7(null, 1, null).toModel(contentValues);
        return new C0556i0((String) WrapUtils.getOrDefault(model.f7863g.f7762g, ""), ((Long) WrapUtils.getOrDefault(model.f7863g.f7763h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:12:0x0026, B:13:0x002c, B:15:0x0033, B:17:0x0039, B:28:0x006c, B:30:0x0072, B:76:0x009b, B:34:0x00b5, B:36:0x00c4, B:41:0x00d0, B:42:0x00cf, B:43:0x00ca, B:44:0x00d6, B:47:0x00e8, B:58:0x00fa, B:59:0x00ef, B:82:0x00aa, B:52:0x0105, B:54:0x010b, B:90:0x0066), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0961xh a(long j3, C0668m9 c0668m9, C0754ph c0754ph, ArrayList arrayList, int i3) {
        Cursor cursor;
        boolean z;
        C0642l9 c0642l9;
        int i4;
        C0487f9[] a3;
        S8 s8;
        C0384b9 c0384b9;
        C0694n9 c0694n9 = new C0694n9();
        c0694n9.f7943a = j3;
        c0694n9.f7944b = c0668m9;
        EnumC0370al enumC0370al = (EnumC0370al) Uf.f6760b.get(c0668m9.f7872c);
        if (enumC0370al == null) {
            enumC0370al = EnumC0370al.FOREGROUND;
        }
        C0961xh c0961xh = null;
        try {
            cursor = a(j3, enumC0370al);
            if (cursor != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C0556i0 c0556i0 = null;
                    while (cursor.moveToNext() && this.f8695h < 100) {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            s8 = new S8(contentValues);
                            EnumC0567ib enumC0567ib = s8.f6617h;
                            if (enumC0567ib != null) {
                                c0384b9 = (C0384b9) Uf.f6762d.get(enumC0567ib);
                            } else {
                                Map map = Uf.f6759a;
                                c0384b9 = null;
                            }
                            if (c0384b9 == null) {
                                c0384b9 = C0384b9.f7066i;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            c0642l9 = c0384b9.a(s8, c0754ph);
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList.add(th);
                            c0642l9 = null;
                            if (c0642l9 == null) {
                            }
                            arrayList2.add(c0642l9);
                            this.f8695h++;
                        }
                        if (c0642l9 == null) {
                            C0556i0 a4 = a(contentValues);
                            if (c0556i0 == null) {
                                if (this.f8696i < 0) {
                                    try {
                                        a3 = a(new JSONObject(a4.f7491a));
                                    } catch (Throwable unused) {
                                    }
                                    if (a3 != null) {
                                        i4 = 0;
                                        for (C0487f9 c0487f9 : a3) {
                                            try {
                                                i4 += CodedOutputByteBufferNano.computeMessageSize(7, c0487f9);
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                        this.f8696i = i4;
                                        this.f8694g += i4;
                                    }
                                    i4 = 0;
                                    this.f8696i = i4;
                                    this.f8694g += i4;
                                }
                                c0556i0 = a4;
                            } else if (!c0556i0.equals(a4)) {
                                z = true;
                                break;
                            }
                            C0533h3 c0533h3 = this.f8698k;
                            byte[] bArr = c0642l9.f7803e;
                            c0533h3.getClass();
                            byte[] a5 = c0533h3.a(bArr);
                            byte[] bArr2 = c0642l9.f7803e;
                            if (bArr2 != a5) {
                                c0642l9.f7806i = ((bArr2 == null ? 0 : bArr2.length) - (a5 == null ? 0 : a5.length)) + c0642l9.f7806i;
                                c0642l9.f7803e = a5;
                            }
                            this.f8694g += CodedOutputByteBufferNano.computeMessageSize(3, c0642l9);
                            if (arrayList2.isEmpty() && i3 == 0) {
                                if (this.f8694g >= 1048576) {
                                    break;
                                }
                            } else if (this.f8694g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c0642l9);
                        this.f8695h++;
                    }
                    z = false;
                    if (arrayList2.size() > 0) {
                        c0694n9.f7945c = (C0642l9[]) arrayList2.toArray(new C0642l9[arrayList2.size()]);
                        c0961xh = new C0961xh(c0694n9, c0556i0, z);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        return c0961xh;
                    } finally {
                        AbstractC0709no.a(cursor);
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        return c0961xh;
    }

    public final Cursor a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        S6 s6 = this.f8693e;
        LinkedHashMap linkedHashMap = this.f8690b;
        s6.f6598a.lock();
        try {
            readableDatabase = s6.f6600c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, S6.a(linkedHashMap), S6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            s6.f6598a.unlock();
            return cursor;
        }
        cursor = null;
        s6.f6598a.unlock();
        return cursor;
    }

    public final Cursor a(long j3, EnumC0370al enumC0370al) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        S6 s6 = this.f8693e;
        s6.f6598a.lock();
        try {
            readableDatabase = s6.f6600c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j3), Integer.toString(enumC0370al.f7037a)}, null, null, "number_in_session ASC", null);
            s6.f6598a.unlock();
            return cursor;
        }
        cursor = null;
        s6.f6598a.unlock();
        return cursor;
    }
}
