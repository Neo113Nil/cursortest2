package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* renamed from: com.ironsource.m5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1513m5 {

    /* renamed from: A, reason: collision with root package name */
    public static final String f17167A = "nurl";

    /* renamed from: o, reason: collision with root package name */
    public static final String f17168o = "adMarkup";

    /* renamed from: p, reason: collision with root package name */
    public static final String f17169p = "instance";

    /* renamed from: q, reason: collision with root package name */
    public static final String f17170q = "adData";

    /* renamed from: r, reason: collision with root package name */
    public static final String f17171r = "price";

    /* renamed from: s, reason: collision with root package name */
    public static final String f17172s = "serverData";

    /* renamed from: t, reason: collision with root package name */
    public static final String f17173t = "loadTimeout";

    /* renamed from: u, reason: collision with root package name */
    public static final String f17174u = "order";

    /* renamed from: v, reason: collision with root package name */
    public static final String f17175v = "show";

    /* renamed from: w, reason: collision with root package name */
    public static final String f17176w = "price";

    /* renamed from: x, reason: collision with root package name */
    public static final String f17177x = "notifications";

    /* renamed from: y, reason: collision with root package name */
    public static final String f17178y = "burl";

    /* renamed from: z, reason: collision with root package name */
    public static final String f17179z = "lurl";

    /* renamed from: a, reason: collision with root package name */
    private String f17180a;

    /* renamed from: b, reason: collision with root package name */
    private String f17181b;

    /* renamed from: c, reason: collision with root package name */
    private JSONObject f17182c;

    /* renamed from: d, reason: collision with root package name */
    private String f17183d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private Integer f17184e;

    /* renamed from: f, reason: collision with root package name */
    private int f17185f;

    /* renamed from: g, reason: collision with root package name */
    private int f17186g;

    /* renamed from: h, reason: collision with root package name */
    private int f17187h;

    /* renamed from: i, reason: collision with root package name */
    private final List<String> f17188i;

    /* renamed from: j, reason: collision with root package name */
    private final List<String> f17189j;

    /* renamed from: k, reason: collision with root package name */
    private final List<String> f17190k;

    /* renamed from: l, reason: collision with root package name */
    private ImpressionData f17191l;

    /* renamed from: m, reason: collision with root package name */
    private bm f17192m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f17193n;

    public C1513m5(String str) {
        this.f17180a = null;
        this.f17181b = "";
        this.f17182c = null;
        this.f17183d = "";
        this.f17184e = null;
        this.f17185f = -1;
        this.f17186g = -1;
        this.f17187h = -1;
        this.f17188i = new ArrayList();
        this.f17189j = new ArrayList();
        this.f17190k = new ArrayList();
        this.f17191l = null;
        this.f17192m = null;
        this.f17193n = true;
        this.f17180a = str;
    }

    public ImpressionData a(String str) {
        ImpressionData impressionData = this.f17191l;
        if (impressionData == null) {
            return null;
        }
        ImpressionData impressionData2 = new ImpressionData(impressionData);
        impressionData2.replaceMacroForPlacementWithValue(com.ironsource.mediationsdk.d.f17329r, str);
        return impressionData2;
    }

    public List<String> b() {
        return this.f17188i;
    }

    public String c() {
        return this.f17180a;
    }

    public bm d() {
        return this.f17192m;
    }

    public int e() {
        return this.f17185f;
    }

    @Nullable
    public Integer f() {
        return this.f17184e;
    }

    public List<String> g() {
        return this.f17189j;
    }

    public List<String> h() {
        return this.f17190k;
    }

    public String i() {
        return this.f17183d;
    }

    public int j() {
        return this.f17187h;
    }

    public String k() {
        return this.f17181b;
    }

    public int l() {
        return this.f17186g;
    }

    public boolean m() {
        return this.f17193n;
    }

    public C1513m5(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    @Nullable
    public JSONObject a() {
        return this.f17182c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:3:0x003f, B:5:0x0045, B:6:0x004f, B:8:0x0055, B:9:0x0068, B:10:0x006a, B:12:0x0082, B:13:0x0095, B:15:0x00b0, B:16:0x00ba, B:18:0x00c2, B:19:0x00d1, B:24:0x005a, B:26:0x0060), top: B:2:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b0 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:3:0x003f, B:5:0x0045, B:6:0x004f, B:8:0x0055, B:9:0x0068, B:10:0x006a, B:12:0x0082, B:13:0x0095, B:15:0x00b0, B:16:0x00ba, B:18:0x00c2, B:19:0x00d1, B:24:0x005a, B:26:0x0060), top: B:2:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c2 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:3:0x003f, B:5:0x0045, B:6:0x004f, B:8:0x0055, B:9:0x0068, B:10:0x006a, B:12:0x0082, B:13:0x0095, B:15:0x00b0, B:16:0x00ba, B:18:0x00c2, B:19:0x00d1, B:24:0x005a, B:26:0x0060), top: B:2:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1513m5(JSONObject jSONObject, int i4, JSONObject jSONObject2) {
        String jSONObject3;
        this.f17180a = null;
        this.f17181b = "";
        this.f17182c = null;
        this.f17183d = "";
        this.f17184e = null;
        this.f17185f = -1;
        this.f17186g = -1;
        this.f17187h = -1;
        ArrayList arrayList = new ArrayList();
        this.f17188i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f17189j = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f17190k = arrayList3;
        this.f17191l = null;
        this.f17192m = null;
        this.f17193n = true;
        try {
            if (jSONObject.has(f17169p)) {
                this.f17180a = jSONObject.getString(f17169p);
            }
            if (!jSONObject.has(f17168o)) {
                jSONObject3 = jSONObject.has(f17172s) ? jSONObject.getJSONObject(f17172s).toString() : jSONObject3;
                this.f17182c = jSONObject.optJSONObject(f17170q);
                this.f17183d = jSONObject.optString("price", "0");
                if (jSONObject.has(f17177x)) {
                    JSONObject jSONObject4 = jSONObject.getJSONObject(f17177x);
                    a(jSONObject4, f17178y, arrayList);
                    a(jSONObject4, f17179z, arrayList2);
                    a(jSONObject4, f17167A, arrayList3);
                }
                this.f17191l = new ImpressionData(nk.a(jSONObject2, jSONObject.optJSONObject(com.ironsource.mediationsdk.d.f17315d)));
                this.f17192m = !jSONObject.has(com.ironsource.mediationsdk.d.f17316e) ? bm.a(jSONObject.getJSONObject(com.ironsource.mediationsdk.d.f17316e)) : null;
                this.f17184e = jSONObject.has(f17173t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(f17173t))) : null;
                a(jSONObject.optJSONObject(f17174u), i4);
            }
            jSONObject3 = jSONObject.getString(f17168o);
            this.f17181b = jSONObject3;
            this.f17182c = jSONObject.optJSONObject(f17170q);
            this.f17183d = jSONObject.optString("price", "0");
            if (jSONObject.has(f17177x)) {
            }
            this.f17191l = new ImpressionData(nk.a(jSONObject2, jSONObject.optJSONObject(com.ironsource.mediationsdk.d.f17315d)));
            this.f17192m = !jSONObject.has(com.ironsource.mediationsdk.d.f17316e) ? bm.a(jSONObject.getJSONObject(com.ironsource.mediationsdk.d.f17316e)) : null;
            this.f17184e = jSONObject.has(f17173t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(f17173t))) : null;
            a(jSONObject.optJSONObject(f17174u), i4);
        } catch (Exception e4) {
            o9.d().a(e4);
            this.f17193n = false;
            IronLog.INTERNAL.error("exception " + e4.getMessage());
        }
    }

    private void a(@Nullable JSONObject jSONObject, int i4) {
        this.f17185f = i4;
        this.f17186g = i4;
        this.f17187h = i4;
        if (jSONObject != null) {
            int optInt = jSONObject.optInt(f17175v, i4);
            this.f17186g = optInt;
            this.f17187h = jSONObject.optInt("price", optInt);
        }
    }

    private void a(JSONObject jSONObject, String str, List<String> list) {
        if (jSONObject.has(str)) {
            list.addAll(nk.b(jSONObject.getJSONArray(str)));
        }
    }
}
