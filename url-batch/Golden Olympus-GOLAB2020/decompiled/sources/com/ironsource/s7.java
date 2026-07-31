package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.b9;
import com.ironsource.da;
import com.ironsource.dc;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.events.ISErrorListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.s7;
import com.ironsource.tf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class s7 implements sf {

    /* renamed from: A, reason: collision with root package name */
    private int[] f18972A;

    /* renamed from: B, reason: collision with root package name */
    private int[] f18973B;

    /* renamed from: C, reason: collision with root package name */
    private int[] f18974C;

    /* renamed from: G, reason: collision with root package name */
    int f18978G;

    /* renamed from: H, reason: collision with root package name */
    String f18979H;

    /* renamed from: I, reason: collision with root package name */
    String f18980I;

    /* renamed from: J, reason: collision with root package name */
    Set<Integer> f18981J;

    /* renamed from: K, reason: collision with root package name */
    private bc f18982K;

    /* renamed from: L, reason: collision with root package name */
    private IronSourceSegment f18983L;

    /* renamed from: M, reason: collision with root package name */
    private ns f18984M;

    /* renamed from: N, reason: collision with root package name */
    private ISErrorListener f18985N;

    /* renamed from: l, reason: collision with root package name */
    private boolean f18998l;

    /* renamed from: p, reason: collision with root package name */
    private da f19002p;

    /* renamed from: q, reason: collision with root package name */
    private AbstractC1451e f19003q;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList<zb> f19004r;

    /* renamed from: t, reason: collision with root package name */
    private int f19006t;

    /* renamed from: u, reason: collision with root package name */
    private yh f19007u;

    /* renamed from: v, reason: collision with root package name */
    private Context f19008v;

    /* renamed from: z, reason: collision with root package name */
    private int[] f19012z;

    /* renamed from: a, reason: collision with root package name */
    final int f18987a = 1;

    /* renamed from: b, reason: collision with root package name */
    final int f18988b = 100;

    /* renamed from: c, reason: collision with root package name */
    final int f18989c = 5000;

    /* renamed from: d, reason: collision with root package name */
    final int f18990d = 90000;

    /* renamed from: e, reason: collision with root package name */
    final int f18991e = 1024;

    /* renamed from: f, reason: collision with root package name */
    final int f18992f = 5;

    /* renamed from: g, reason: collision with root package name */
    final String f18993g = "supersonic_sdk.db";

    /* renamed from: h, reason: collision with root package name */
    final String f18994h = IronSourceConstants.EVENTS_PROVIDER;

    /* renamed from: i, reason: collision with root package name */
    final String f18995i = "placement";

    /* renamed from: j, reason: collision with root package name */
    private final String f18996j = ge.f16412M0;

    /* renamed from: k, reason: collision with root package name */
    private final String f18997k = ge.f16434X0;

    /* renamed from: m, reason: collision with root package name */
    private boolean f18999m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19000n = false;

    /* renamed from: o, reason: collision with root package name */
    private int f19001o = -1;

    /* renamed from: s, reason: collision with root package name */
    private boolean f19005s = true;

    /* renamed from: w, reason: collision with root package name */
    private int f19009w = 100;

    /* renamed from: x, reason: collision with root package name */
    private int f19010x = 5000;

    /* renamed from: y, reason: collision with root package name */
    private int f19011y = 1;

    /* renamed from: D, reason: collision with root package name */
    private Map<String, String> f18975D = new HashMap();

    /* renamed from: E, reason: collision with root package name */
    private Map<String, String> f18976E = new HashMap();

    /* renamed from: F, reason: collision with root package name */
    private String f18977F = "";

    /* renamed from: O, reason: collision with root package name */
    private final Object f18986O = new Object();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s7.this.a();
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ zb f19014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ IronSource.AD_UNIT f19015b;

        b(zb zbVar, IronSource.AD_UNIT ad_unit) {
            this.f19014a = zbVar;
            this.f19015b = ad_unit;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f19014a.a("eventSessionId", s7.this.f19007u.b());
            this.f19014a.a("essn", Integer.valueOf(s7.this.f19007u.c()));
            String connectionType = IronSourceUtils.getConnectionType(s7.this.f19008v);
            if (s7.this.g(this.f19014a)) {
                this.f19014a.a(b9.i.f15581t, connectionType);
            }
            if (s7.this.a(connectionType, this.f19014a)) {
                zb zbVar = this.f19014a;
                zbVar.a(s7.this.b(zbVar));
            }
            String d4 = y8.d(s7.this.f19008v);
            if (d4 != null) {
                this.f19014a.a(b9.i.f15582u, d4);
            }
            int a4 = s7.this.a(this.f19014a.c(), this.f19015b);
            if (a4 != e.NOT_SUPPORTED.a()) {
                this.f19014a.a("adUnit", Integer.valueOf(a4));
            }
            s7.this.a(this.f19014a, "reason");
            s7.this.a(this.f19014a, IronSourceConstants.EVENTS_EXT1);
            if (!s7.this.f18976E.isEmpty()) {
                for (Map.Entry entry : s7.this.f18976E.entrySet()) {
                    if (!this.f19014a.b().has((String) entry.getKey()) && entry.getKey() != "eventId" && entry.getKey() != da.a.f15878d) {
                        this.f19014a.a((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            if (s7.this.i(this.f19014a)) {
                if (s7.this.h(this.f19014a) && !s7.this.e(this.f19014a)) {
                    this.f19014a.a("sessionDepth", Integer.valueOf(s7.this.c(this.f19014a)));
                }
                if (s7.this.j(this.f19014a)) {
                    s7.this.f(this.f19014a);
                }
                long a5 = s7.this.f19007u.a();
                if (a5 > 0) {
                    this.f19014a.a("firstSessionTimestamp", Long.valueOf(a5));
                }
                IronLog.EVENT.verbose(this.f19014a.toString());
                s7.this.f19004r.add(this.f19014a);
                s7.d(s7.this);
            }
            s7 s7Var = s7.this;
            boolean a6 = s7Var.a(s7Var.f18973B) ? s7.this.a(this.f19014a.c(), s7.this.f18973B) : s7.this.d(this.f19014a);
            if (!s7.this.f18999m && a6) {
                s7.this.f18999m = true;
            }
            if (s7.this.f19002p != null) {
                if (s7.this.g()) {
                    s7.this.f();
                    return;
                }
                s7 s7Var2 = s7.this;
                if (s7Var2.b((ArrayList<zb>) s7Var2.f19004r) || a6) {
                    s7.this.a();
                }
            }
        }
    }

    class c implements tf {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(tf.a aVar) {
            try {
                if (aVar.c()) {
                    ArrayList<zb> a4 = s7.this.f19002p.a(s7.this.f18980I);
                    s7.this.f19006t = a4.size() + s7.this.f19004r.size();
                } else {
                    IronLog.INTERNAL.error("Failed to send events. Saving them back to storage.");
                    s7.this.a(s7.this.a(aVar.b(), aVar.a()));
                }
            } catch (Exception e4) {
                o9.d().a(e4);
                if (s7.this.f18985N != null) {
                    s7.this.f18985N.onError(new IllegalStateException("Error on sending data ", e4));
                }
            }
            a(aVar.b());
        }

        @Override // com.ironsource.tf
        public synchronized void a(final tf.a aVar) {
            s7.this.f18982K.a(new Runnable() { // from class: com.ironsource.F3
                @Override // java.lang.Runnable
                public final void run() {
                    s7.c.this.b(aVar);
                }
            });
        }

        public void a(ArrayList<zb> arrayList) {
            if (arrayList != null) {
                try {
                    arrayList.clear();
                } catch (Exception e4) {
                    o9.d().a(e4);
                    IronLog.INTERNAL.error("clearData exception: " + e4.getMessage());
                }
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s7.this.f();
        }
    }

    public enum e {
        NOT_SUPPORTED(-1),
        INTERSTITIAL(2),
        REWARDED_VIDEO(3),
        NATIVE_AD(4),
        BANNER(8);


        /* renamed from: a, reason: collision with root package name */
        private int f19025a;

        e(int i4) {
            this.f19025a = i4;
        }

        public int a() {
            return this.f19025a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i4, @Nullable IronSource.AD_UNIT ad_unit) {
        e eVar;
        int a4 = e.NOT_SUPPORTED.a();
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO || ((i4 >= 1000 && i4 < 2000) || (i4 >= 91000 && i4 < 92000))) {
            eVar = e.REWARDED_VIDEO;
        } else if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL || ((i4 >= 2000 && i4 < 3000) || (i4 >= 92000 && i4 < 93000))) {
            eVar = e.INTERSTITIAL;
        } else if (ad_unit == IronSource.AD_UNIT.BANNER || ((i4 >= 3000 && i4 < 4000) || (i4 >= 93000 && i4 < 94000))) {
            eVar = e.BANNER;
        } else {
            if (ad_unit != IronSource.AD_UNIT.NATIVE_AD && ((i4 < 4000 || i4 >= 5000) && (i4 < 94000 || i4 >= 95000))) {
                return a4;
            }
            eVar = e.NATIVE_AD;
        }
        return eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized int b(zb zbVar) {
        return zbVar.c() + 90000;
    }

    static /* synthetic */ int d(s7 s7Var) {
        int i4 = s7Var.f19006t;
        s7Var.f19006t = i4 + 1;
        return i4;
    }

    protected abstract int c(zb zbVar);

    abstract void d();

    protected abstract boolean d(zb zbVar);

    protected abstract String e(int i4);

    void e() {
        this.f19004r = new ArrayList<>();
        this.f19006t = 0;
        this.f19003q = gc.a(this.f18979H, this.f18978G);
        bc bcVar = new bc(this.f18980I + "EventThread");
        this.f18982K = bcVar;
        bcVar.start();
        this.f18982K.a();
        this.f19007u = nm.S().h();
        this.f18981J = new HashSet();
        d();
    }

    protected int f(int i4) {
        return a(i4, (IronSource.AD_UNIT) null);
    }

    protected abstract void f(zb zbVar);

    public void h() {
        this.f18982K.a(new d());
    }

    protected abstract boolean j(zb zbVar);

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e(zb zbVar) {
        JSONObject b4 = zbVar.b();
        if (b4 == null) {
            return false;
        }
        return b4.has("sessionDepth");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        ArrayList<zb> a4;
        try {
            this.f18999m = false;
            ArrayList<zb> arrayList = new ArrayList<>();
            try {
                synchronized (this.f18986O) {
                    a4 = this.f19002p.a(this.f18980I);
                    this.f19002p.b(this.f18980I);
                }
                dc.c cVar = new dc.c(new dc.a(a4, this.f19004r), this.f19010x);
                this.f19002p.a(cVar.a(), this.f18980I);
                arrayList.addAll(cVar.b());
            } catch (Throwable th) {
                o9.d().a(th);
                IronLog.INTERNAL.error("CombinedEventList exception: " + th.getMessage());
                ISErrorListener iSErrorListener = this.f18985N;
                if (iSErrorListener != null) {
                    iSErrorListener.onError(new IllegalStateException("Combined event exception: ", th));
                }
                arrayList.clear();
                arrayList.addAll(this.f19004r);
            }
            if (arrayList.size() > 0) {
                this.f19004r.clear();
                this.f19006t = 0;
                JSONObject b4 = de.a().b();
                try {
                    a(b4);
                    String b5 = b();
                    if (!TextUtils.isEmpty(b5)) {
                        b4.put(ge.f16412M0, b5);
                    }
                    String q4 = com.ironsource.mediationsdk.p.m().q();
                    if (!TextUtils.isEmpty(q4)) {
                        b4.put(ge.f16434X0, q4);
                    }
                    Map<String, String> c4 = c();
                    if (!c4.isEmpty()) {
                        for (Map.Entry<String, String> entry : c4.entrySet()) {
                            if (!b4.has(entry.getKey())) {
                                b4.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                    JSONObject a5 = new ic().a();
                    Iterator<String> keys = a5.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        b4.put(next, a5.get(next));
                    }
                } catch (Throwable th2) {
                    o9.d().a(th2);
                    IronLog.INTERNAL.error("Exception while building the event general properties: " + th2.getMessage());
                }
                String a6 = this.f19003q.a(arrayList, b4);
                if (TextUtils.isEmpty(a6)) {
                    IronLog.INTERNAL.error("Failed to parse events.");
                    ISErrorListener iSErrorListener2 = this.f18985N;
                    if (iSErrorListener2 != null) {
                        iSErrorListener2.onError(new IllegalStateException("Event parse failed"));
                        return;
                    }
                    return;
                }
                if (this.f19000n) {
                    try {
                        a6 = Base64.encodeToString(yj.a(a6, this.f19001o), 0);
                    } catch (Exception e4) {
                        o9.d().a(e4);
                        ISErrorListener iSErrorListener3 = this.f18985N;
                        if (iSErrorListener3 != null) {
                            iSErrorListener3.onError(new IllegalStateException("Error on compression: ", e4));
                        }
                    }
                }
                xt.f20339a.a(new jc(new c(), a6, this.f19003q.b(), arrayList));
            }
        } catch (Throwable th3) {
            o9.d().a(th3);
            IronLog.INTERNAL.error("Send event exception: " + th3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g() {
        return (this.f19006t >= this.f19009w || this.f18999m) && this.f18998l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(zb zbVar) {
        if (zbVar == null) {
            return false;
        }
        if (a(this.f19012z)) {
            return !a(zbVar.c(), this.f19012z);
        }
        if (a(this.f18972A)) {
            return a(zbVar.c(), this.f18972A);
        }
        return true;
    }

    public Map<String, String> c() {
        return this.f18975D;
    }

    @Override // com.ironsource.sf
    public void d(int i4) {
        this.f19001o = i4;
    }

    public String b() {
        return this.f18977F;
    }

    @Override // com.ironsource.sf
    public void c(int i4) {
        if (i4 > 0) {
            this.f19011y = i4;
        }
    }

    @Override // com.ironsource.sf
    public void d(int[] iArr, Context context) {
        this.f18974C = iArr;
        IronSourceUtils.saveDefaultNonConnectivityEvents(context, this.f18980I, iArr);
    }

    protected boolean g(zb zbVar) {
        return (zbVar.c() == 40 || zbVar.c() == 41 || zbVar.c() == 50 || zbVar.c() == 51 || zbVar.c() == 52) ? false : true;
    }

    protected boolean h(zb zbVar) {
        return (zbVar.c() == 14 || zbVar.c() == 114 || zbVar.c() == 514 || zbVar.c() == 515 || zbVar.c() == 516 || zbVar.c() == 140 || zbVar.c() == 40 || zbVar.c() == 41 || zbVar.c() == 50 || zbVar.c() == 51 || zbVar.c() == 52) ? false : true;
    }

    @Override // com.ironsource.sf
    public void b(int i4) {
        if (i4 > 0) {
            this.f19009w = i4;
        }
    }

    public void c(boolean z4) {
        this.f18998l = z4;
    }

    private void b(String str) {
        AbstractC1451e abstractC1451e = this.f19003q;
        if (abstractC1451e == null || !abstractC1451e.c().equals(str)) {
            this.f19003q = gc.a(str, this.f18978G);
        }
    }

    String a(String str, int i4) {
        return (TextUtils.isEmpty(str) || str.length() <= i4) ? str : str.substring(0, i4);
    }

    @Override // com.ironsource.sf
    public void c(int[] iArr, Context context) {
        this.f19012z = iArr;
        IronSourceUtils.saveDefaultOptOutEvents(context, this.f18980I, iArr);
    }

    @Override // com.ironsource.sf
    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC1451e abstractC1451e = this.f19003q;
        if (abstractC1451e != null) {
            abstractC1451e.a(str);
        }
        IronSourceUtils.saveDefaultEventsURL(context, this.f18980I, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<zb> a(ArrayList<zb> arrayList, String str) {
        String a4 = a(str, 1024);
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            zb zbVar = arrayList.get(i4);
            i4++;
            zbVar.a(a4);
        }
        return arrayList;
    }

    public void b(Map<String, String> map) {
        this.f18976E.putAll(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        synchronized (this.f18986O) {
            this.f19002p.a(this.f19004r, this.f18980I);
            this.f19004r.clear();
        }
    }

    @Override // com.ironsource.sf
    public void b(boolean z4) {
        this.f19005s = z4;
    }

    @Override // com.ironsource.sf
    public void a(int i4) {
        if (i4 > 0) {
            this.f19010x = i4;
        }
    }

    @Override // com.ironsource.sf
    public void b(int[] iArr, Context context) {
        this.f18973B = iArr;
        IronSourceUtils.saveDefaultTriggerEvents(context, this.f18980I, iArr);
    }

    public synchronized void a(Context context, IronSourceSegment ironSourceSegment) {
        String defaultEventsFormatterType = IronSourceUtils.getDefaultEventsFormatterType(context, this.f18980I, this.f18979H);
        this.f18979H = defaultEventsFormatterType;
        b(defaultEventsFormatterType);
        this.f19003q.a(IronSourceUtils.getDefaultEventsURL(context, this.f18980I, null));
        this.f19002p = da.a(context, "supersonic_sdk.db", 5);
        this.f18982K.a(new a());
        this.f19012z = IronSourceUtils.getDefaultOptOutEvents(context, this.f18980I);
        this.f18972A = IronSourceUtils.getDefaultOptInEvents(context, this.f18980I);
        this.f18973B = IronSourceUtils.getDefaultTriggerEvents(context, this.f18980I);
        this.f18974C = IronSourceUtils.getDefaultNonConnectivityEvents(context, this.f18980I);
        this.f18983L = ironSourceSegment;
        this.f19008v = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ArrayList<zb> arrayList) {
        return arrayList != null && arrayList.size() >= this.f19011y;
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.f18983L = ironSourceSegment;
    }

    public void a(ISErrorListener iSErrorListener) {
        this.f18985N = iSErrorListener;
    }

    public synchronized void a(ns nsVar) {
        this.f18984M = nsVar;
    }

    @Override // com.ironsource.sf
    public synchronized void a(zb zbVar) {
        a(zbVar, (IronSource.AD_UNIT) null);
    }

    public synchronized void a(zb zbVar, @Nullable IronSource.AD_UNIT ad_unit) {
        if (zbVar != null) {
            if (this.f19005s) {
                this.f18982K.a(new b(zbVar, ad_unit));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(zb zbVar, String str) {
        a(zbVar, str, 1024);
    }

    private void a(zb zbVar, String str, int i4) {
        JSONObject b4 = zbVar.b();
        if (b4 == null || !b4.has(str)) {
            return;
        }
        try {
            zbVar.a(str, a(b4.optString(str, null), i4));
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    void a(Runnable runnable) {
        this.f18982K.a(runnable);
    }

    public void a(String str) {
        this.f18977F = str;
    }

    @Override // com.ironsource.sf
    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f18979H = str;
        IronSourceUtils.saveDefaultEventsFormatterType(context, this.f18980I, str);
        b(str);
    }

    protected void a(ArrayList<zb> arrayList) {
        if (arrayList != null) {
            synchronized (this.f18986O) {
                this.f19002p.a(arrayList, this.f18980I);
                this.f19006t = this.f19002p.a(this.f18980I).size() + this.f19004r.size();
            }
        }
    }

    public void a(Map<String, String> map) {
        this.f18975D.putAll(map);
    }

    public void a(Map<String, Object> map, int i4, String str) {
        map.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(i4));
        if (TextUtils.isEmpty(str)) {
            return;
        }
        map.put(IronSourceConstants.AUCTION_FALLBACK, str);
    }

    private void a(JSONObject jSONObject) {
        try {
            IronSourceSegment ironSourceSegment = this.f18983L;
            if (ironSourceSegment != null) {
                if (ironSourceSegment.getAge() > 0) {
                    jSONObject.put(IronSourceSegment.AGE, this.f18983L.getAge());
                }
                if (!TextUtils.isEmpty(this.f18983L.getGender())) {
                    jSONObject.put(IronSourceSegment.GENDER, this.f18983L.getGender());
                }
                if (this.f18983L.getLevel() > 0) {
                    jSONObject.put(IronSourceSegment.LEVEL, this.f18983L.getLevel());
                }
                if (this.f18983L.getIsPaying() != null) {
                    jSONObject.put(IronSourceSegment.PAYING, this.f18983L.getIsPaying().get());
                }
                if (this.f18983L.getIapt() > 0.0d) {
                    jSONObject.put(IronSourceSegment.IAPT, this.f18983L.getIapt());
                }
                if (this.f18983L.getUcd() > 0) {
                    jSONObject.put(IronSourceSegment.USER_CREATION_DATE, this.f18983L.getUcd());
                }
            }
            ns nsVar = this.f18984M;
            if (nsVar != null) {
                String b4 = nsVar.b();
                if (!TextUtils.isEmpty(b4)) {
                    jSONObject.put("segmentId", b4);
                }
                JSONObject a4 = this.f18984M.a();
                Iterator<String> keys = a4.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, a4.get(next));
                }
            }
        } catch (JSONException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error(e4.toString());
        }
    }

    @Override // com.ironsource.sf
    public void a(boolean z4) {
        this.f19000n = z4;
    }

    @Override // com.ironsource.sf
    public void a(int[] iArr, Context context) {
        this.f18972A = iArr;
        IronSourceUtils.saveDefaultOptInEvents(context, this.f18980I, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i4, int[] iArr) {
        if (a(iArr)) {
            for (int i5 : iArr) {
                if (i4 == i5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean a(String str, zb zbVar) {
        try {
            if (str.equalsIgnoreCase("none")) {
                return a(this.f18974C) ? a(zbVar.c(), this.f18974C) : this.f18981J.contains(Integer.valueOf(zbVar.c()));
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int[] iArr) {
        return iArr != null && iArr.length > 0;
    }
}
