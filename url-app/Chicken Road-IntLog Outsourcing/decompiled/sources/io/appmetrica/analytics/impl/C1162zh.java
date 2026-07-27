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
public final class C1162zh implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final C0608e5 f9648a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f9649b;

    /* renamed from: c, reason: collision with root package name */
    public C0998t7 f9650c;

    /* renamed from: d, reason: collision with root package name */
    public C0923q9 f9651d;

    /* renamed from: e, reason: collision with root package name */
    public final S6 f9652e;

    /* renamed from: f, reason: collision with root package name */
    public List f9653f;

    /* renamed from: g, reason: collision with root package name */
    public int f9654g;

    /* renamed from: h, reason: collision with root package name */
    public int f9655h;

    /* renamed from: i, reason: collision with root package name */
    public int f9656i;

    /* renamed from: j, reason: collision with root package name */
    public C1137yh f9657j;

    /* renamed from: k, reason: collision with root package name */
    public final C0684h3 f9658k;

    /* renamed from: l, reason: collision with root package name */
    public final PublicLogger f9659l;

    /* renamed from: m, reason: collision with root package name */
    public final zo f9660m;

    /* renamed from: n, reason: collision with root package name */
    public final Ya f9661n;

    /* renamed from: o, reason: collision with root package name */
    public final C0620eh f9662o;

    /* renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f9663p;

    /* renamed from: q, reason: collision with root package name */
    public final Fb f9664q;

    /* renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f9665r;

    /* renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f9666s;

    /* renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f9667t;

    /* renamed from: u, reason: collision with root package name */
    public int f9668u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9669v;

    public C1162zh(C0608e5 c0608e5, C0620eh c0620eh, Fb fb, FullUrlFormer<C0905ph> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(c0608e5, c0620eh, fb, fullUrlFormer, requestDataHolder, responseDataHolder, c0608e5.i(), c0608e5.p(), c0608e5.u(), requestBodyEncrypter);
    }

    public final C0923q9 a(C1137yh c1137yh, List list, C0905ph c0905ph) {
        C0923q9 c0923q9 = new C0923q9();
        C0716i9 c0716i9 = new C0716i9();
        c0716i9.f8399a = WrapUtils.getOrDefaultIfEmpty(this.f9650c.f9282b, c0905ph.getUuid());
        c0716i9.f8400b = WrapUtils.getOrDefaultIfEmpty(this.f9650c.f9281a, c0905ph.getDeviceId());
        this.f9654g = CodedOutputByteBufferNano.computeMessageSize(4, c0716i9) + this.f9654g;
        c0923q9.f9077b = c0716i9;
        C0937qn C2 = C1027ua.f9366H.C();
        C1086wh c1086wh = new C1086wh(this, c0923q9);
        synchronized (C2) {
            C2.f9119a.a(c1086wh);
        }
        c0923q9.f9076a = (C0845n9[]) c1137yh.f9600a.toArray(new C0845n9[0]);
        c0923q9.f9078c = a(c1137yh.f9602c);
        c0923q9.f9080e = (String[]) list.toArray(new String[0]);
        Set set = c0905ph.f9027x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c0923q9.f9081f = new byte[strArr.length][];
        for (int i2 = 0; i2 < set.size(); i2++) {
            c0923q9.f9081f[i2] = StringUtils.getUTF8Bytes(strArr[i2]);
        }
        return c0923q9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f9648a.f8086b.f7698b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f9663p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f9665r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f9666s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0905ph) this.f9648a.f8095k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((El) C1027ua.f9366H.A()).getClass();
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
        S6 s6 = this.f9648a.f8089e;
        s6.getClass();
        ArrayList arrayList = new ArrayList();
        s6.f7420a.lock();
        try {
            SQLiteDatabase readableDatabase = s6.f7422c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(B5.f6586b, null);
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
                            AbstractC0860no.a(cursor);
                            s6.f7420a.unlock();
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
        this.f9649b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f9649b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C0998t7 c0998t7 = new C0998t7();
            this.f9650c = c0998t7;
            this.f9662o.f8151c = c0998t7;
        } else {
            try {
                C0998t7 c0998t72 = new C0998t7(new C0821mb(asString));
                this.f9650c = c0998t72;
                this.f9662o.f8151c = c0998t72;
            } catch (Throwable unused3) {
                C0998t7 c0998t73 = new C0998t7();
                this.f9650c = c0998t73;
                this.f9662o.f8151c = c0998t73;
            }
        }
        C0905ph config = this.f9664q.getConfig();
        List list = config.f9026w;
        if (AbstractC0860no.a((Collection) list)) {
            return false;
        }
        this.f9663p.setHosts(config.f9020q);
        if (!config.u() || AbstractC0860no.a((Collection) this.f9663p.getAllHosts())) {
            this.f9669v = true;
            return false;
        }
        this.f9653f = null;
        C1137yh a6 = a(config);
        this.f9657j = a6;
        if (a6.f9600a.isEmpty()) {
            return false;
        }
        zo zoVar = this.f9660m;
        synchronized (zoVar) {
            optInt = zoVar.f9678a.a().optInt("report_request_id", -1);
        }
        int i2 = optInt + 1;
        this.f9668u = i2;
        this.f9662o.f8153e = i2;
        C0923q9 a7 = a(this.f9657j, list, config);
        this.f9651d = a7;
        this.f9653f = this.f9657j.f9601b;
        this.f9667t.prepareAndSetPostData(MessageNano.toByteArray(a7));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f9667t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String a6;
        if (z) {
            a(false);
        } else if (this.f9666s.getResponseCode() == 400) {
            a(true);
        }
        if (z) {
            for (int i2 = 0; i2 < this.f9657j.f9600a.size(); i2++) {
                for (C0793l9 c0793l9 : ((C0845n9) this.f9657j.f9600a.get(i2)).f8862c) {
                    if (c0793l9 != null && (a6 = Vf.a(c0793l9)) != null) {
                        this.f9659l.info(a6, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f9667t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f9669v = true;
        this.f9648a.f8089e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f9669v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C0944r5) this.f9648a.f8100p).f9142d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        this.f9648a.f8089e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C0944r5) this.f9648a.f8100p).f9142d.set(true);
        if (this.f9669v) {
            ((C0944r5) this.f9648a.f8100p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C1162zh(C0608e5 c0608e5, C0620eh c0620eh, Fb fb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, S6 s6, PublicLogger publicLogger, zo zoVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(c0608e5, publicLogger, s6, c0620eh, zoVar, fb, new C0684h3(1024000, "event value in ReportTask", publicLogger), AbstractC1070w1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C1162zh(C0608e5 c0608e5, PublicLogger publicLogger, S6 s6, C0620eh c0620eh, zo zoVar, Fb fb, C0684h3 c0684h3, Vj vj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f9649b = new LinkedHashMap();
        this.f9654g = 0;
        this.f9655h = 0;
        this.f9656i = -1;
        this.f9669v = false;
        this.f9667t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f9662o = c0620eh;
        this.f9648a = c0608e5;
        this.f9652e = s6;
        this.f9659l = publicLogger;
        this.f9658k = c0684h3;
        this.f9660m = zoVar;
        this.f9664q = fb;
        this.f9661n = vj;
        this.f9665r = requestDataHolder;
        this.f9666s = responseDataHolder;
        this.f9663p = fullUrlFormer;
    }

    public static C0638f9[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C0638f9[] c0638f9Arr = new C0638f9[length];
        Iterator<String> keys = jSONObject.keys();
        int i2 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C0638f9 c0638f9 = new C0638f9();
                c0638f9.f8175a = next;
                c0638f9.f8176b = jSONObject.getString(next);
                c0638f9Arr[i2] = c0638f9;
            } catch (Throwable unused) {
            }
            i2++;
        }
        return c0638f9Arr;
    }

    public final void a(boolean z) {
        zo zoVar = this.f9660m;
        int i2 = this.f9668u;
        synchronized (zoVar) {
            Ao ao = zoVar.f9678a;
            ao.a(ao.a().put("report_request_id", i2));
        }
        C0845n9[] c0845n9Arr = this.f9651d.f9076a;
        for (int i3 = 0; i3 < c0845n9Arr.length; i3++) {
            try {
                C0845n9 c0845n9 = c0845n9Arr[i3];
                long longValue = ((Long) this.f9653f.get(i3)).longValue();
                EnumC0521al enumC0521al = (EnumC0521al) Uf.f7592b.get(c0845n9.f8861b.f8783c);
                if (enumC0521al == null) {
                    enumC0521al = EnumC0521al.FOREGROUND;
                }
                this.f9652e.a(longValue, enumC0521al.f7885a, c0845n9.f8862c.length, z);
                Uf.a(c0845n9);
            } catch (Throwable unused) {
            }
        }
        S6 s6 = this.f9652e;
        long a6 = this.f9648a.f8094j.a();
        s6.f7421b.lock();
        try {
            if (D5.f6667a.booleanValue()) {
                s6.d();
            }
            SQLiteDatabase writableDatabase = s6.f7422c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", B5.f6587c, new String[]{String.valueOf(a6)});
            }
        } catch (Throwable unused2) {
        }
        s6.f7421b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea A[LOOP:1: B:60:0x00e4->B:62:0x00ea, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1137yh a(C0905ph c0905ph) {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor a6 = a();
            if (a6 != null) {
                JSONObject jSONObject2 = jSONObject;
                C0707i0 c0707i0 = null;
                while (a6.moveToNext() && this.f9655h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(a6, contentValues);
                        A7 model = new B7(null, 1, null).toModel(contentValues);
                        Long l2 = model.f6504a;
                        if (l2 != null) {
                            C1152z7 c1152z7 = model.f6507d;
                            C0897p9 a7 = Uf.a(c1152z7.f9620a, c1152z7.f9621b, c1152z7.f9622c);
                            String locale = c0905ph.getLocale();
                            EnumC0521al enumC0521al = model.f6505b;
                            C0819m9 c0819m9 = new C0819m9();
                            c0819m9.f8781a = a7;
                            c0819m9.f8782b = locale;
                            if (enumC0521al != null) {
                                Integer num = (Integer) Uf.f7591a.get(enumC0521al);
                                c0819m9.f8783c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.f9654g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f9654g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c0819m9);
                            this.f9654g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            C1112xh a8 = a(l2.longValue(), c0819m9, c0905ph, arrayList3, arrayList.size());
                            if (a8 == null) {
                                continue;
                            } else {
                                if (c0707i0 == null) {
                                    c0707i0 = a8.f9576b;
                                } else if (!c0707i0.equals(a8.f9576b)) {
                                    break;
                                }
                                arrayList2.add(l2);
                                arrayList.add(a8.f9575a);
                                if (!TextUtils.isEmpty(a8.f9576b.f8373a)) {
                                    try {
                                        jSONObject2 = new JSONObject(a8.f9576b.f8373a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (a8.f9577c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = a6;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                            }
                            return new C1137yh(arrayList, arrayList2, jSONObject);
                        } finally {
                            AbstractC0860no.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            AbstractC0860no.a(a6);
        } catch (Throwable th2) {
            th = th2;
        }
        it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f9661n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C1137yh(arrayList, arrayList2, jSONObject);
    }

    public static C0707i0 a(ContentValues contentValues) {
        C0817m7 model = new C0843n7(null, 1, null).toModel(contentValues);
        return new C0707i0((String) WrapUtils.getOrDefault(model.f8773g.f8665g, ""), ((Long) WrapUtils.getOrDefault(model.f8773g.f8666h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x009b, TryCatch #4 {all -> 0x009b, blocks: (B:12:0x0026, B:13:0x002c, B:15:0x0033, B:17:0x0039, B:28:0x006c, B:30:0x0072, B:70:0x0093, B:33:0x00a7, B:35:0x00b6, B:40:0x00c2, B:41:0x00c1, B:42:0x00bc, B:43:0x00c8, B:46:0x00da, B:58:0x00e1, B:74:0x00a0, B:51:0x00f4, B:53:0x00fa, B:57:0x00ea, B:81:0x0066), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1112xh a(long j2, C0819m9 c0819m9, C0905ph c0905ph, ArrayList arrayList, int i2) {
        Cursor cursor;
        C1112xh c1112xh;
        C0793l9 c0793l9;
        int i3;
        C0638f9[] a6;
        S8 s8;
        C0535b9 c0535b9;
        boolean z = true;
        C0845n9 c0845n9 = new C0845n9();
        c0845n9.f8860a = j2;
        c0845n9.f8861b = c0819m9;
        EnumC0521al enumC0521al = (EnumC0521al) Uf.f7592b.get(c0819m9.f8783c);
        if (enumC0521al == null) {
            enumC0521al = EnumC0521al.FOREGROUND;
        }
        try {
            cursor = a(j2, enumC0521al);
            if (cursor != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C0707i0 c0707i0 = null;
                    while (cursor.moveToNext() && this.f9655h < 100) {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            s8 = new S8(contentValues);
                            EnumC0718ib enumC0718ib = s8.f7441h;
                            if (enumC0718ib != null) {
                                c0535b9 = (C0535b9) Uf.f7594d.get(enumC0718ib);
                            } else {
                                Map map = Uf.f7591a;
                                c0535b9 = null;
                            }
                            if (c0535b9 == null) {
                                c0535b9 = C0535b9.f7916i;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            c0793l9 = c0535b9.a(s8, c0905ph);
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList.add(th);
                            c0793l9 = null;
                            if (c0793l9 == null) {
                            }
                            arrayList2.add(c0793l9);
                            this.f9655h++;
                        }
                        if (c0793l9 == null) {
                            C0707i0 a7 = a(contentValues);
                            if (c0707i0 == null) {
                                if (this.f9656i < 0) {
                                    try {
                                        a6 = a(new JSONObject(a7.f8373a));
                                    } catch (Throwable unused) {
                                    }
                                    if (a6 != null) {
                                        i3 = 0;
                                        for (C0638f9 c0638f9 : a6) {
                                            i3 += CodedOutputByteBufferNano.computeMessageSize(7, c0638f9);
                                        }
                                        this.f9656i = i3;
                                        this.f9654g += i3;
                                    }
                                    i3 = 0;
                                    this.f9656i = i3;
                                    this.f9654g += i3;
                                }
                                c0707i0 = a7;
                            } else if (!c0707i0.equals(a7)) {
                                break;
                            }
                            C0684h3 c0684h3 = this.f9658k;
                            byte[] bArr = c0793l9.f8708e;
                            c0684h3.getClass();
                            byte[] a8 = c0684h3.a(bArr);
                            byte[] bArr2 = c0793l9.f8708e;
                            if (bArr2 != a8) {
                                c0793l9.f8712i = ((bArr2 == null ? 0 : bArr2.length) - (a8 == null ? 0 : a8.length)) + c0793l9.f8712i;
                                c0793l9.f8708e = a8;
                            }
                            this.f9654g += CodedOutputByteBufferNano.computeMessageSize(3, c0793l9);
                            if (arrayList2.isEmpty() && i2 == 0) {
                                if (this.f9654g >= 1048576) {
                                    break;
                                }
                            } else if (this.f9654g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c0793l9);
                        this.f9655h++;
                    }
                    z = false;
                    if (arrayList2.size() > 0) {
                        c0845n9.f8862c = (C0793l9[]) arrayList2.toArray(new C0793l9[arrayList2.size()]);
                        c1112xh = new C1112xh(c0845n9, c0707i0, z);
                        return c1112xh;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        AbstractC0860no.a(cursor);
                        return null;
                    } finally {
                        AbstractC0860no.a(cursor);
                    }
                }
            }
            c1112xh = null;
            return c1112xh;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final Cursor a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        S6 s6 = this.f9652e;
        LinkedHashMap linkedHashMap = this.f9649b;
        s6.f7420a.lock();
        try {
            readableDatabase = s6.f7422c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, S6.a(linkedHashMap), S6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            s6.f7420a.unlock();
            return cursor;
        }
        cursor = null;
        s6.f7420a.unlock();
        return cursor;
    }

    public final Cursor a(long j2, EnumC0521al enumC0521al) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        S6 s6 = this.f9652e;
        s6.f7420a.lock();
        try {
            readableDatabase = s6.f7422c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j2), Integer.toString(enumC0521al.f7885a)}, null, null, "number_in_session ASC", null);
            s6.f7420a.unlock();
            return cursor;
        }
        cursor = null;
        s6.f7420a.unlock();
        return cursor;
    }
}
