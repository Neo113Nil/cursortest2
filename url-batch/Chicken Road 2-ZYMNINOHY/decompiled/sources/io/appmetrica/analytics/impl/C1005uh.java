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

/* renamed from: io.appmetrica.analytics.impl.uh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1005uh implements UnderlyingNetworkTask {

    /* renamed from: a, reason: collision with root package name */
    public final X4 f12830a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12831b;

    /* renamed from: c, reason: collision with root package name */
    public C0762l7 f12832c;

    /* renamed from: d, reason: collision with root package name */
    public C0712j9 f12833d;

    /* renamed from: e, reason: collision with root package name */
    public final L6 f12834e;

    /* renamed from: f, reason: collision with root package name */
    public List f12835f;

    /* renamed from: g, reason: collision with root package name */
    public int f12836g;

    /* renamed from: h, reason: collision with root package name */
    public int f12837h;

    /* renamed from: i, reason: collision with root package name */
    public int f12838i;

    /* renamed from: j, reason: collision with root package name */
    public C0979th f12839j;

    /* renamed from: k, reason: collision with root package name */
    public final Z2 f12840k;

    /* renamed from: l, reason: collision with root package name */
    public final PublicLogger f12841l;

    /* renamed from: m, reason: collision with root package name */
    public final C1090xo f12842m;
    public final Ra n;
    public final Zg o;

    /* renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f12843p;

    /* renamed from: q, reason: collision with root package name */
    public final C1103yb f12844q;

    /* renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f12845r;

    /* renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f12846s;

    /* renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f12847t;

    /* renamed from: u, reason: collision with root package name */
    public int f12848u;
    public boolean v;

    public C1005uh(X4 x4, Zg zg, C1103yb c1103yb, FullUrlFormer<C0746kh> fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this(x4, zg, c1103yb, fullUrlFormer, requestDataHolder, responseDataHolder, x4.i(), x4.p(), x4.u(), requestBodyEncrypter);
    }

    public final C0712j9 a(C0979th c0979th, List list, C0746kh c0746kh) {
        C0712j9 c0712j9 = new C0712j9();
        C0506b9 c0506b9 = new C0506b9();
        c0506b9.f11485a = WrapUtils.getOrDefaultIfEmpty(this.f12832c.f12270b, c0746kh.getUuid());
        c0506b9.f11486b = WrapUtils.getOrDefaultIfEmpty(this.f12832c.f12269a, c0746kh.getDeviceId());
        this.f12836g = CodedOutputByteBufferNano.computeMessageSize(4, c0506b9) + this.f12836g;
        c0712j9.f12112b = c0506b9;
        C0856on C4 = C0817na.f12417I.C();
        C0927rh c0927rh = new C0927rh(this, c0712j9);
        synchronized (C4) {
            C4.f12534a.a(c0927rh);
        }
        c0712j9.f12111a = (C0635g9[]) c0979th.f12784a.toArray(new C0635g9[0]);
        c0712j9.f12113c = a(c0979th.f12786c);
        c0712j9.f12115e = (String[]) list.toArray(new String[0]);
        Set set = c0746kh.f12239x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c0712j9.f12116f = new byte[strArr.length][];
        for (int i4 = 0; i4 < set.size(); i4++) {
            c0712j9.f12116f[i4] = StringUtils.getUTF8Bytes(strArr[i4]);
        }
        return c0712j9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f12830a.f11223b.f10837b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f12843p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RequestDataHolder getRequestDataHolder() {
        return this.f12845r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f12846s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C0746kh) this.f12830a.f11232k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final SSLSocketFactory getSslSocketFactory() {
        ((Al) C0817na.f12417I.z()).getClass();
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
        L6 l6 = this.f12830a.f11226e;
        l6.getClass();
        ArrayList arrayList = new ArrayList();
        l6.f10566a.lock();
        try {
            SQLiteDatabase readableDatabase = l6.f10568c.getReadableDatabase();
            if (readableDatabase != null) {
                cursor = readableDatabase.rawQuery(AbstractC0993u5.f12804b, null);
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
                            AbstractC0779lo.a(cursor);
                            l6.f10566a.unlock();
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
        this.f12831b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f12831b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C0762l7 c0762l7 = new C0762l7();
            this.f12832c = c0762l7;
            this.o.f11391c = c0762l7;
        } else {
            try {
                C0762l7 c0762l72 = new C0762l7(new C0611fb(asString));
                this.f12832c = c0762l72;
                this.o.f11391c = c0762l72;
            } catch (Throwable unused3) {
                C0762l7 c0762l73 = new C0762l7();
                this.f12832c = c0762l73;
                this.o.f11391c = c0762l73;
            }
        }
        C0746kh config = this.f12844q.getConfig();
        List list = config.f12238w;
        if (AbstractC0779lo.a((Collection) list)) {
            return false;
        }
        this.f12843p.setHosts(config.f12233q);
        if (!config.u() || AbstractC0779lo.a((Collection) this.f12843p.getAllHosts())) {
            this.v = true;
            return false;
        }
        this.f12835f = null;
        C0979th a3 = a(config);
        this.f12839j = a3;
        if (a3.f12784a.isEmpty()) {
            return false;
        }
        C1090xo c1090xo = this.f12842m;
        synchronized (c1090xo) {
            optInt = c1090xo.f13040a.a().optInt("report_request_id", -1);
        }
        int i4 = optInt + 1;
        this.f12848u = i4;
        this.o.f11393e = i4;
        C0712j9 a4 = a(this.f12839j, list, config);
        this.f12833d = a4;
        this.f12835f = this.f12839j.f12785b;
        this.f12847t.prepareAndSetPostData(MessageNano.toByteArray(a4));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f12847t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z) {
        String a3;
        if (z) {
            a(false);
        } else if (this.f12846s.getResponseCode() == 400) {
            a(true);
        }
        if (z) {
            for (int i4 = 0; i4 < this.f12839j.f12784a.size(); i4++) {
                for (C0583e9 c0583e9 : ((C0635g9) this.f12839j.f12784a.get(i4)).f11927c) {
                    if (c0583e9 != null && (a3 = Qf.a(c0583e9)) != null) {
                        this.f12841l.info(a3, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f12847t.isResponseValid();
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
        ((C0734k5) this.f12830a.f11235p).f12196d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C0734k5) this.f12830a.f11235p).f12196d.set(true);
        if (this.v) {
            ((C0734k5) this.f12830a.f11235p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C1005uh(X4 x4, Zg zg, C1103yb c1103yb, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, L6 l6, PublicLogger publicLogger, C1090xo c1090xo, RequestBodyEncrypter requestBodyEncrypter) {
        this(x4, publicLogger, l6, zg, c1090xo, c1103yb, new Z2(1024000, "event value in ReportTask", publicLogger), AbstractC1067x1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C1005uh(X4 x4, PublicLogger publicLogger, L6 l6, Zg zg, C1090xo c1090xo, C1103yb c1103yb, Z2 z22, Qj qj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f12831b = new LinkedHashMap();
        this.f12836g = 0;
        this.f12837h = 0;
        this.f12838i = -1;
        this.v = false;
        this.f12847t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.o = zg;
        this.f12830a = x4;
        this.f12834e = l6;
        this.f12841l = publicLogger;
        this.f12840k = z22;
        this.f12842m = c1090xo;
        this.f12844q = c1103yb;
        this.n = qj;
        this.f12845r = requestDataHolder;
        this.f12846s = responseDataHolder;
        this.f12843p = fullUrlFormer;
    }

    public static Y8[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        Y8[] y8Arr = new Y8[length];
        Iterator<String> keys = jSONObject.keys();
        int i4 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                Y8 y8 = new Y8();
                y8.f11294a = next;
                y8.f11295b = jSONObject.getString(next);
                y8Arr[i4] = y8;
            } catch (Throwable unused) {
            }
            i4++;
        }
        return y8Arr;
    }

    public final void a(boolean z) {
        boolean z4;
        C1090xo c1090xo = this.f12842m;
        int i4 = this.f12848u;
        synchronized (c1090xo) {
            C1116yo c1116yo = c1090xo.f13040a;
            c1116yo.a(c1116yo.a().put("report_request_id", i4));
        }
        C0635g9[] c0635g9Arr = this.f12833d.f12111a;
        int i5 = 0;
        while (i5 < c0635g9Arr.length) {
            try {
                C0635g9 c0635g9 = c0635g9Arr[i5];
                long longValue = ((Long) this.f12835f.get(i5)).longValue();
                Vk vk = (Vk) Pf.f10818b.get(c0635g9.f11926b.f11832c);
                if (vk == null) {
                    vk = Vk.FOREGROUND;
                }
                z4 = z;
                try {
                    this.f12834e.a(longValue, vk.f11151a, c0635g9.f11927c.length, z4);
                    Pf.a(c0635g9);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z4 = z;
            }
            i5++;
            z = z4;
        }
        L6 l6 = this.f12834e;
        long a3 = this.f12830a.f11231j.a();
        l6.f10567b.lock();
        try {
            if (AbstractC1045w5.f12919a.booleanValue()) {
                l6.c();
            }
            SQLiteDatabase writableDatabase = l6.f10568c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", AbstractC0993u5.f12805c, new String[]{String.valueOf(a3)});
            }
        } catch (Throwable unused3) {
        }
        l6.f10567b.unlock();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e6 A[LOOP:1: B:56:0x00e4->B:57:0x00e6, LOOP_END] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v3, types: [io.appmetrica.analytics.impl.q7, kotlin.jvm.internal.e] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0979th a(C0746kh c0746kh) {
        Cursor cursor;
        int size;
        int i4;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        ?? r12 = 0;
        try {
            Cursor a3 = a();
            if (a3 != null) {
                C0678i0 c0678i0 = null;
                while (a3.moveToNext() && this.f12837h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(a3, contentValues);
                        C0943s7 model = new C0969t7(r12, 1, r12).toModel(contentValues);
                        Long l4 = model.f12718a;
                        if (l4 != null) {
                            C0917r7 c0917r7 = model.f12721d;
                            C0687i9 a4 = Pf.a(c0917r7.f12650a, c0917r7.f12651b, c0917r7.f12652c);
                            String locale = c0746kh.getLocale();
                            Vk vk = model.f12719b;
                            C0609f9 c0609f9 = new C0609f9();
                            c0609f9.f11830a = a4;
                            c0609f9.f11831b = locale;
                            if (vk != null) {
                                Integer num = (Integer) Pf.f10817a.get(vk);
                                c0609f9.f11832c = num != null ? num.intValue() : 0;
                            }
                            int computeUInt64Size = this.f12836g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f12836g = computeUInt64Size;
                            int computeMessageSize = computeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c0609f9);
                            this.f12836g = computeMessageSize;
                            if (computeMessageSize >= 250880) {
                                break;
                            }
                            C0953sh a5 = a(l4.longValue(), c0609f9, c0746kh, arrayList3, arrayList.size());
                            if (a5 == null) {
                                continue;
                            } else {
                                if (c0678i0 == null) {
                                    c0678i0 = a5.f12746b;
                                } else if (!c0678i0.equals(a5.f12746b)) {
                                    break;
                                }
                                arrayList2.add(l4);
                                arrayList.add(a5.f12745a);
                                if (!TextUtils.isEmpty(a5.f12746b.f12011a)) {
                                    try {
                                        jSONObject = new JSONObject(a5.f12746b.f12011a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (a5.f12747c) {
                                    break;
                                }
                            }
                        }
                        r12 = 0;
                    } catch (Throwable th) {
                        th = th;
                        cursor = a3;
                        try {
                            arrayList3.add(th);
                            size = arrayList3.size();
                            i4 = 0;
                            while (i4 < size) {
                            }
                            return new C0979th(arrayList, arrayList2, jSONObject);
                        } finally {
                            AbstractC0779lo.a(cursor);
                        }
                    }
                }
            }
            AbstractC0779lo.a(a3);
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
        size = arrayList3.size();
        i4 = 0;
        while (i4 < size) {
            Object obj = arrayList3.get(i4);
            i4++;
            this.n.reportError("protobuf_serialization_error", (Throwable) obj);
        }
        return new C0979th(arrayList, arrayList2, jSONObject);
    }

    public static C0678i0 a(ContentValues contentValues) {
        C0581e7 model = new C0607f7(null, 1, null).toModel(contentValues);
        return new C0678i0((String) WrapUtils.getOrDefault(model.f11735g.f11659g, ""), ((Long) WrapUtils.getOrDefault(model.f11735g.f11660h, 0L)).longValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006c A[Catch: all -> 0x009c, TryCatch #4 {all -> 0x009c, blocks: (B:12:0x0025, B:13:0x002b, B:15:0x0032, B:17:0x0038, B:29:0x006c, B:31:0x0072, B:71:0x0094, B:34:0x00a9, B:36:0x00b8, B:41:0x00c4, B:42:0x00c3, B:43:0x00be, B:44:0x00ca, B:47:0x00dc, B:58:0x00e3, B:75:0x00a1, B:57:0x00eb, B:82:0x0065, B:51:0x00f5, B:53:0x00fb), top: B:11:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0953sh a(long j4, C0609f9 c0609f9, C0746kh c0746kh, ArrayList arrayList, int i4) {
        Cursor cursor;
        boolean z;
        C0953sh c0953sh;
        C0583e9 c0583e9;
        int i5;
        Y8[] a3;
        N8 n8;
        U8 u8;
        C0635g9 c0635g9 = new C0635g9();
        c0635g9.f11925a = j4;
        c0635g9.f11926b = c0609f9;
        Vk vk = (Vk) Pf.f10818b.get(c0609f9.f11832c);
        if (vk == null) {
            vk = Vk.FOREGROUND;
        }
        try {
            cursor = a(j4, vk);
            if (cursor != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C0678i0 c0678i0 = null;
                    while (true) {
                        z = false;
                        if (!cursor.moveToNext() || this.f12837h >= 100) {
                            break;
                        }
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursor, contentValues);
                        try {
                            n8 = new N8(contentValues);
                            EnumC0508bb enumC0508bb = n8.f10700h;
                            if (enumC0508bb != null) {
                                u8 = (U8) Pf.f10820d.get(enumC0508bb);
                            } else {
                                Map map = Pf.f10817a;
                                u8 = null;
                            }
                            if (u8 == null) {
                                u8 = U8.f11037i;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                        try {
                            c0583e9 = u8.a(n8, c0746kh);
                        } catch (Throwable th2) {
                            th = th2;
                            arrayList.add(th);
                            c0583e9 = null;
                            if (c0583e9 == null) {
                            }
                            arrayList2.add(c0583e9);
                            this.f12837h++;
                        }
                        if (c0583e9 == null) {
                            C0678i0 a4 = a(contentValues);
                            if (c0678i0 == null) {
                                if (this.f12838i < 0) {
                                    try {
                                        a3 = a(new JSONObject(a4.f12011a));
                                    } catch (Throwable unused) {
                                    }
                                    if (a3 != null) {
                                        i5 = 0;
                                        for (Y8 y8 : a3) {
                                            i5 += CodedOutputByteBufferNano.computeMessageSize(7, y8);
                                        }
                                        this.f12838i = i5;
                                        this.f12836g += i5;
                                    }
                                    i5 = 0;
                                    this.f12838i = i5;
                                    this.f12836g += i5;
                                }
                                c0678i0 = a4;
                            } else if (!c0678i0.equals(a4)) {
                                z = true;
                                break;
                            }
                            Z2 z22 = this.f12840k;
                            byte[] bArr = c0583e9.f11769e;
                            z22.getClass();
                            byte[] a5 = z22.a(bArr);
                            byte[] bArr2 = c0583e9.f11769e;
                            if (bArr2 != a5) {
                                c0583e9.f11773i = ((bArr2 == null ? 0 : bArr2.length) - (a5 == null ? 0 : a5.length)) + c0583e9.f11773i;
                                c0583e9.f11769e = a5;
                            }
                            this.f12836g += CodedOutputByteBufferNano.computeMessageSize(3, c0583e9);
                            if (arrayList2.isEmpty() && i4 == 0) {
                                if (this.f12836g >= 1048576) {
                                    break;
                                }
                            } else if (this.f12836g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c0583e9);
                        this.f12837h++;
                    }
                    if (arrayList2.size() > 0) {
                        c0635g9.f11927c = (C0583e9[]) arrayList2.toArray(new C0583e9[arrayList2.size()]);
                        c0953sh = new C0953sh(c0635g9, c0678i0, z);
                        return c0953sh;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        arrayList.add(th);
                        AbstractC0779lo.a(cursor);
                        return null;
                    } finally {
                        AbstractC0779lo.a(cursor);
                    }
                }
            }
            c0953sh = null;
            return c0953sh;
        } catch (Throwable th4) {
            th = th4;
            cursor = null;
        }
    }

    public final Cursor a() {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        L6 l6 = this.f12834e;
        LinkedHashMap linkedHashMap = this.f12831b;
        l6.f10566a.lock();
        try {
            readableDatabase = l6.f10568c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("sessions", null, L6.a(linkedHashMap), L6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null);
            l6.f10566a.unlock();
            return cursor;
        }
        cursor = null;
        l6.f10566a.unlock();
        return cursor;
    }

    public final Cursor a(long j4, Vk vk) {
        Cursor cursor;
        SQLiteDatabase readableDatabase;
        L6 l6 = this.f12834e;
        l6.f10566a.lock();
        try {
            readableDatabase = l6.f10568c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        if (readableDatabase != null) {
            cursor = readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j4), Integer.toString(vk.f11151a)}, null, null, "number_in_session ASC", null);
            l6.f10566a.unlock();
            return cursor;
        }
        cursor = null;
        l6.f10566a.unlock();
        return cursor;
    }
}
