package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
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
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class Hh implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final C2953s5 f37638a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f37639b;

    /* renamed from: c, reason: collision with root package name */
    public H7 f37640c;

    /* renamed from: d, reason: collision with root package name */
    public E9 f37641d;

    /* renamed from: e, reason: collision with root package name */
    public final C2645g7 f37642e;

    /* renamed from: f, reason: collision with root package name */
    public List f37643f;

    /* renamed from: g, reason: collision with root package name */
    public int f37644g;

    /* renamed from: h, reason: collision with root package name */
    public int f37645h;

    /* renamed from: i, reason: collision with root package name */
    public int f37646i;

    /* renamed from: j, reason: collision with root package name */
    public Gh f37647j;

    /* renamed from: k, reason: collision with root package name */
    public final C3029v3 f37648k;

    /* renamed from: l, reason: collision with root package name */
    public final PublicLogger f37649l;

    /* renamed from: m, reason: collision with root package name */
    public final C3024uo f37650m;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC2804mb f37651n;

    /* renamed from: o, reason: collision with root package name */
    public final C2810mh f37652o;

    /* renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f37653p;

    /* renamed from: q, reason: collision with root package name */
    public final Tb f37654q;

    /* renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f37655r;

    /* renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f37656s;

    /* renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f37657t;

    /* renamed from: u, reason: collision with root package name */
    public int f37658u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f37659v;

    public Hh(@NonNull C2953s5 c2953s5, @NonNull C2810mh c2810mh, @NonNull Tb tb, @NonNull FullUrlFormer<C3095xh> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(c2953s5, c2810mh, tb, fullUrlFormer, requestDataHolder, responseDataHolder, c2953s5.h(), c2953s5.o(), c2953s5.t(), requestBodyEncrypter);
    }

    public final E9 a(Gh gh, List list, C3095xh c3095xh) {
        E9 e9 = new E9();
        C3061w9 c3061w9 = new C3061w9();
        c3061w9.f40022a = WrapUtils.getOrDefaultIfEmpty(this.f37640c.f37609b, c3095xh.getUuid());
        c3061w9.f40023b = WrapUtils.getOrDefaultIfEmpty(this.f37640c.f37608a, c3095xh.getDeviceId());
        this.f37644g = CodedOutputByteBufferNano.computeMessageSize(4, c3061w9) + this.f37644g;
        e9.f37425b = c3061w9;
        C2790ln A4 = Ia.f37730F.A();
        Eh eh = new Eh(this, e9);
        synchronized (A4) {
            A4.f39411a.a(eh);
        }
        List list2 = gh.f37578a;
        e9.f37424a = (B9[]) list2.toArray(new B9[list2.size()]);
        e9.f37426c = a(gh.f37580c);
        e9.f37428e = (String[]) list.toArray(new String[list.size()]);
        this.f37644g = CodedOutputByteBufferNano.computeTagSize(8) + this.f37644g;
        return e9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f37638a.f39766b.f39375b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f37653p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f37655r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f37656s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C3095xh) this.f37638a.f39775k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Al) Ia.f37730F.y()).getClass();
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
        C2645g7 c2645g7 = this.f37638a.f39769e;
        c2645g7.getClass();
        ArrayList arrayList = new ArrayList();
        c2645g7.f39042a.lock();
        try {
            SQLiteDatabase readableDatabase = c2645g7.f39044c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(Q5.f38156b, null);
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
                            AbstractC2713io.a(cursor);
                            c2645g7.f39042a.unlock();
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
        this.f37639b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f37639b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            H7 h7 = new H7();
            this.f37640c = h7;
            this.f37652o.f39451c = h7;
        } else {
            try {
                H7 h72 = new H7(new Ab(asString));
                this.f37640c = h72;
                this.f37652o.f39451c = h72;
            } catch (Throwable unused3) {
                H7 h73 = new H7();
                this.f37640c = h73;
                this.f37652o.f39451c = h73;
            }
        }
        C3095xh config = this.f37654q.getConfig();
        List list = config.f40196w;
        if (AbstractC2713io.a((Collection) list)) {
            return false;
        }
        this.f37653p.setHosts(config.f40190q);
        if (!config.t() || AbstractC2713io.a((Collection) this.f37653p.getAllHosts())) {
            this.f37659v = true;
            return false;
        }
        this.f37643f = null;
        Gh a4 = a(config);
        this.f37647j = a4;
        if (a4.f37578a.isEmpty()) {
            return false;
        }
        C3024uo c3024uo = this.f37650m;
        synchronized (c3024uo) {
            optInt = c3024uo.f39951a.a().optInt("report_request_id", -1);
        }
        int i4 = optInt + 1;
        this.f37658u = i4;
        this.f37652o.f39453e = i4;
        E9 a5 = a(this.f37647j, list, config);
        this.f37641d = a5;
        this.f37643f = this.f37647j.f37579b;
        this.f37657t.prepareAndSetPostData(MessageNano.toByteArray(a5));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f37657t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z4) {
        String a4;
        if (z4) {
            a(false);
        } else if (this.f37656s.getResponseCode() == 400) {
            a(true);
        }
        if (z4) {
            for (int i4 = 0; i4 < this.f37647j.f37578a.size(); i4++) {
                for (C3139z9 c3139z9 : ((B9) this.f37647j.f37578a.get(i4)).f37233c) {
                    if (c3139z9 != null && (a4 = AbstractC2574dg.a(c3139z9)) != null) {
                        this.f37649l.info(a4, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f37657t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(Throwable th) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f37659v = true;
        this.f37638a.f39769e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f37659v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((F5) this.f37638a.f39780p).f37509d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        this.f37638a.f39769e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((F5) this.f37638a.f39780p).f37509d.set(true);
        if (this.f37659v) {
            ((F5) this.f37638a.f39780p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public Hh(C2953s5 c2953s5, C2810mh c2810mh, Tb tb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, C2645g7 c2645g7, PublicLogger publicLogger, C3024uo c3024uo, RequestBodyEncrypter requestBodyEncrypter) {
        this(c2953s5, publicLogger, c2645g7, c2810mh, c3024uo, tb, new C3029v3(1024000, "event value in ReportTask", publicLogger), AbstractC2975t1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public Hh(C2953s5 c2953s5, PublicLogger publicLogger, C2645g7 c2645g7, C2810mh c2810mh, C3024uo c3024uo, Tb tb, C3029v3 c3029v3, C2551ck c2551ck, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f37639b = new LinkedHashMap();
        this.f37644g = 0;
        this.f37645h = 0;
        this.f37646i = -1;
        this.f37659v = false;
        this.f37657t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f37652o = c2810mh;
        this.f37638a = c2953s5;
        this.f37642e = c2645g7;
        this.f37649l = publicLogger;
        this.f37648k = c3029v3;
        this.f37650m = c3024uo;
        this.f37654q = tb;
        this.f37651n = c2551ck;
        this.f37655r = requestDataHolder;
        this.f37656s = responseDataHolder;
        this.f37653p = fullUrlFormer;
    }

    public static C2983t9[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C2983t9[] c2983t9Arr = new C2983t9[length];
        Iterator<String> keys = jSONObject.keys();
        int i4 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                C2983t9 c2983t9 = new C2983t9();
                c2983t9.f39847a = next;
                c2983t9.f39848b = jSONObject.getString(next);
                c2983t9Arr[i4] = c2983t9;
            } catch (Throwable unused) {
            }
            i4++;
        }
        return c2983t9Arr;
    }

    public final void a(boolean z4) {
        boolean z5;
        C3024uo c3024uo = this.f37650m;
        int i4 = this.f37658u;
        synchronized (c3024uo) {
            C3050vo c3050vo = c3024uo.f39951a;
            c3050vo.a(c3050vo.a().put("report_request_id", i4));
        }
        B9[] b9Arr = this.f37641d.f37424a;
        int i5 = 0;
        while (i5 < b9Arr.length) {
            try {
                B9 b9 = b9Arr[i5];
                long longValue = ((Long) this.f37643f.get(i5)).longValue();
                Wk wk = (Wk) AbstractC2547cg.f38779b.get(b9.f37232b.f37173c);
                if (wk == null) {
                    wk = Wk.FOREGROUND;
                }
                z5 = z4;
                try {
                    this.f37642e.a(longValue, wk.f38487a, b9.f37233c.length, z5);
                    AbstractC2547cg.a(b9);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z5 = z4;
            }
            i5++;
            z4 = z5;
        }
        C2645g7 c2645g7 = this.f37642e;
        long a4 = this.f37638a.f39774j.a();
        c2645g7.f39043b.lock();
        try {
            if (S5.f38239a.booleanValue()) {
                c2645g7.d();
            }
            SQLiteDatabase writableDatabase = c2645g7.f39044c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", Q5.f38157c, new String[]{String.valueOf(a4)});
            }
        } catch (Throwable unused3) {
        }
        c2645g7.f39043b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6 A[LOOP:1: B:56:0x00e4->B:57:0x00e6, LOOP_END] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v3, types: [io.appmetrica.analytics.impl.M7, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r12v5 */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Gh a(@NonNull C3095xh c3095xh) {
        Cursor cursor;
        int size;
        int i4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        ?? r12 = 0;
        try {
            Cursor a4 = a();
            if (a4 != null) {
                C2638g0 c2638g0 = null;
                while (a4.moveToNext() && this.f37645h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(a4, contentValues);
                        O7 model = new P7(r12, 1, r12).toModel(contentValues);
                        Long l4 = model.f38053a;
                        if (l4 != null) {
                            N7 n7 = model.f38056d;
                            D9 a5 = AbstractC2547cg.a(n7.f37994a, n7.f37995b, n7.f37996c);
                            String locale = c3095xh.getLocale();
                            Wk wk = model.f38054b;
                            A9 a9 = new A9();
                            a9.f37171a = a5;
                            a9.f37172b = locale;
                            if (wk != null) {
                                Integer num = (Integer) AbstractC2547cg.f38778a.get(wk);
                                a9.f37173c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.f37644g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f37644g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, a9);
                            this.f37644g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            Fh a6 = a(l4.longValue(), a9, c3095xh, arrayList3, arrayList.size());
                            if (a6 == null) {
                                continue;
                            } else {
                                if (c2638g0 == null) {
                                    c2638g0 = a6.f37539b;
                                } else if (!c2638g0.equals(a6.f37539b)) {
                                    break;
                                }
                                arrayList2.add(l4);
                                arrayList.add(a6.f37538a);
                                if (!TextUtils.isEmpty(a6.f37539b.f39022a)) {
                                    try {
                                        jSONObject = new JSONObject(a6.f37539b.f39022a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (a6.f37540c) {
                                    break;
                                }
                            }
                        }
                        r12 = 0;
                    } catch (Throwable th) {
                        th = th;
                        cursor = a4;
                        try {
                            arrayList3.add(th);
                            size = arrayList3.size();
                            i4 = 0;
                            while (i4 < size) {
                            }
                            return new Gh(arrayList, arrayList2, jSONObject);
                        } finally {
                            AbstractC2713io.a(cursor);
                        }
                    }
                }
            }
            AbstractC2713io.a(a4);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        size = arrayList3.size();
        i4 = 0;
        while (i4 < size) {
            Object obj = arrayList3.get(i4);
            i4++;
            this.f37651n.reportError("protobuf_serialization_error", (Throwable) obj);
        }
        return new Gh(arrayList, arrayList2, jSONObject);
    }

    public static C2638g0 a(ContentValues contentValues) {
        A7 model = new B7(null, 1, null).toModel(contentValues);
        return new C2638g0((String) WrapUtils.getOrDefault(model.f37163g.f40310g, ""), ((Long) WrapUtils.getOrDefault(model.f37163g.f40311h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:12:0x0026, B:13:0x002c, B:15:0x0033, B:17:0x0039, B:28:0x006c, B:30:0x0072, B:76:0x009b, B:34:0x00b5, B:36:0x00c4, B:41:0x00d0, B:42:0x00cf, B:43:0x00ca, B:44:0x00d6, B:47:0x00e8, B:58:0x00fa, B:59:0x00ef, B:82:0x00aa, B:52:0x0105, B:54:0x010b, B:90:0x0066), top: B:11:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Fh a(long j4, A9 a9, C3095xh c3095xh, ArrayList arrayList, int i4) {
        Cursor cursor;
        boolean z4;
        C3139z9 c3139z9;
        int i5;
        C2983t9[] a4;
        C2647g9 c2647g9;
        C2880p9 c2880p9;
        B9 b9 = new B9();
        b9.f37231a = j4;
        b9.f37232b = a9;
        Wk wk = (Wk) AbstractC2547cg.f38779b.get(a9.f37173c);
        if (wk == null) {
            wk = Wk.FOREGROUND;
        }
        Fh fh = null;
        try {
            cursor = a(j4, wk);
            if (cursor != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C2638g0 c2638g0 = null;
                    while (cursor.moveToNext() && this.f37645h < 100) {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            c2647g9 = new C2647g9(contentValues);
                            EnumC3063wb enumC3063wb = c2647g9.f39063h;
                            if (enumC3063wb != null) {
                                c2880p9 = (C2880p9) AbstractC2547cg.f38781d.get(enumC3063wb);
                            } else {
                                Map map = AbstractC2547cg.f38778a;
                                c2880p9 = null;
                            }
                            if (c2880p9 == null) {
                                c2880p9 = C2880p9.f39608i;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            c3139z9 = c2880p9.a(c2647g9, c3095xh);
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList.add(th);
                            c3139z9 = null;
                            if (c3139z9 == null) {
                            }
                            arrayList2.add(c3139z9);
                            this.f37645h++;
                        }
                        if (c3139z9 == null) {
                            C2638g0 a5 = a(contentValues);
                            if (c2638g0 == null) {
                                if (this.f37646i < 0) {
                                    try {
                                        a4 = a(new JSONObject(a5.f39022a));
                                    } catch (Throwable unused) {
                                    }
                                    if (a4 != null) {
                                        i5 = 0;
                                        for (C2983t9 c2983t9 : a4) {
                                            try {
                                                i5 += CodedOutputByteBufferNano.computeMessageSize(7, c2983t9);
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                        this.f37646i = i5;
                                        this.f37644g += i5;
                                    }
                                    i5 = 0;
                                    this.f37646i = i5;
                                    this.f37644g += i5;
                                }
                                c2638g0 = a5;
                            } else if (!c2638g0.equals(a5)) {
                                z4 = true;
                                break;
                            }
                            C3029v3 c3029v3 = this.f37648k;
                            byte[] bArr = c3139z9.f40355e;
                            c3029v3.getClass();
                            byte[] a6 = c3029v3.a(bArr);
                            byte[] bArr2 = c3139z9.f40355e;
                            if (bArr2 != a6) {
                                c3139z9.f40359i = ((bArr2 == null ? 0 : bArr2.length) - (a6 == null ? 0 : a6.length)) + c3139z9.f40359i;
                                c3139z9.f40355e = a6;
                            }
                            this.f37644g += CodedOutputByteBufferNano.computeMessageSize(3, c3139z9);
                            if (arrayList2.isEmpty() && i4 == 0) {
                                if (this.f37644g >= 1048576) {
                                    break;
                                }
                            } else if (this.f37644g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c3139z9);
                        this.f37645h++;
                    }
                    z4 = false;
                    if (arrayList2.size() > 0) {
                        b9.f37233c = (C3139z9[]) arrayList2.toArray(new C3139z9[arrayList2.size()]);
                        fh = new Fh(b9, c2638g0, z4);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        return fh;
                    } finally {
                        AbstractC2713io.a(cursor);
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
        return fh;
    }

    public final Cursor a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        C2645g7 c2645g7 = this.f37642e;
        LinkedHashMap linkedHashMap = this.f37639b;
        c2645g7.f39042a.lock();
        try {
            readableDatabase = c2645g7.f39044c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, C2645g7.a(linkedHashMap), C2645g7.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            c2645g7.f39042a.unlock();
            return cursor;
        }
        cursor = null;
        c2645g7.f39042a.unlock();
        return cursor;
    }

    public final Cursor a(long j4, Wk wk) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        C2645g7 c2645g7 = this.f37642e;
        c2645g7.f39042a.lock();
        try {
            readableDatabase = c2645g7.f39044c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j4), Integer.toString(wk.f38487a)}, null, null, "number_in_session ASC", null);
            c2645g7.f39042a.unlock();
            return cursor;
        }
        cursor = null;
        c2645g7.f39042a.unlock();
        return cursor;
    }
}
