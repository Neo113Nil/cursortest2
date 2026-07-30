package com.anythink.core.common.j;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.api.ATGDPRAuthCallback;
import com.anythink.core.api.ATGDPRConsentDismissListener;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.NetTrafficeCallback;
import com.anythink.core.common.d.t;
import com.anythink.core.common.d.v;
import com.anythink.core.common.j.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class a {
    private static final String i = "anythink_ump";

    /* renamed from: j, reason: collision with root package name */
    private static volatile a f14384j;

    /* renamed from: k, reason: collision with root package name */
    private Map<Integer, c> f14393k;

    /* renamed from: l, reason: collision with root package name */
    private Map<Integer, c> f14394l;

    /* renamed from: q, reason: collision with root package name */
    private List<Integer> f14399q;

    /* renamed from: a, reason: collision with root package name */
    final int f14385a = -1;

    /* renamed from: b, reason: collision with root package name */
    final int f14386b = 100;

    /* renamed from: c, reason: collision with root package name */
    final int f14387c = 101;

    /* renamed from: d, reason: collision with root package name */
    final int f14388d = 102;

    /* renamed from: e, reason: collision with root package name */
    final int f14389e = 103;

    /* renamed from: f, reason: collision with root package name */
    final int f14390f = 104;

    /* renamed from: g, reason: collision with root package name */
    final int f14391g = 105;

    /* renamed from: h, reason: collision with root package name */
    final int f14392h = 106;

    /* renamed from: n, reason: collision with root package name */
    private String f14396n = "";

    /* renamed from: o, reason: collision with root package name */
    private String f14397o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f14398p = "";

    /* renamed from: m, reason: collision with root package name */
    private boolean f14395m = false;

    private a() {
        HashMap hashMap = new HashMap();
        this.f14393k = hashMap;
        hashMap.put(2, new c(2, 755, 1));
        this.f14393k.put(33, new c(33, 755, 1));
        this.f14393k.put(6, new c(6, 867, 1));
        this.f14393k.put(3, new c(3, 333, 1));
        this.f14393k.put(37, new c(37, 262, 1));
        this.f14393k.put(13, new c(13, 667, 1));
        this.f14393k.put(36, new c(36, 31, 1));
        this.f14393k.put(58, new c(58, 512, 1));
        this.f14393k.put(75, new c(75, 793, 1));
        this.f14393k.put(1, new c(1, 89, 2));
        this.f14393k.put(12, new c(12, 3234, 2));
        this.f14393k.put(5, new c(5, 1301, 2));
        this.f14393k.put(9, new c(9, 2898, 2));
        this.f14393k.put(11, new c(11, 2878, 2));
        this.f14393k.put(23, new c(23, 1782, 2));
        this.f14393k.put(59, new c(59, 16831, 2));
        this.f14393k.put(45, new c(45, 3183, 2));
        this.f14393k.put(14, new c(14, 2710, 2));
        this.f14393k.put(10, new c(10, 1985, 2));
        this.f14393k.put(25, new c(25, 2312, 2));
        this.f14394l = new HashMap();
        this.f14399q = new ArrayList();
    }

    public final String c() {
        return this.f14396n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        String a9 = b.a(context).a();
        if (TextUtils.isEmpty(a9) || a9.contains("1")) {
            v.a(context).a(0);
        } else {
            v.a(context).a(1);
        }
    }

    public final synchronized boolean b() {
        return this.f14395m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(String str) {
        if (ATSDK.isNetworkLogDebug()) {
            Log.d(i, str);
        }
    }

    public static a a() {
        if (f14384j == null) {
            synchronized (a.class) {
                try {
                    if (f14384j == null) {
                        f14384j = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14384j;
    }

    public final void a(final Activity activity, final ATGDPRConsentDismissListener aTGDPRConsentDismissListener) {
        boolean z8;
        t.b();
        if (activity == null) {
            if (t.b().F()) {
                b("showGDPRConsentDialog fail:activity is null!");
            }
            a(aTGDPRConsentDismissListener, "activity is null!", -1);
            return;
        }
        final Context applicationContext = activity.getApplicationContext();
        try {
            d.a(applicationContext);
            z8 = true;
        } catch (Throwable unused) {
            z8 = false;
        }
        final boolean z9 = z8;
        if (t.b().F()) {
            b("Has UMP SDK:".concat(String.valueOf(z9)));
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.j.a.1
            @Override // java.lang.Runnable
            public final void run() {
                if (!TextUtils.isEmpty(b.a(applicationContext).b())) {
                    if (z9) {
                        d.a(applicationContext).a(activity, new d.a() { // from class: com.anythink.core.common.j.a.1.1
                            @Override // com.anythink.core.common.j.d.a
                            public final void a(boolean z10) {
                                a.b("(UMP Update)UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z10)));
                            }

                            @Override // com.anythink.core.common.j.d.a
                            public final void a(String str) {
                                a.b("(UMP Update)UMP onConsentFail:".concat(String.valueOf(str)));
                            }
                        });
                    }
                    a.this.a(aTGDPRConsentDismissListener, "", 101);
                } else {
                    if (!z9) {
                        a.this.a(applicationContext, aTGDPRConsentDismissListener);
                        return;
                    }
                    d.a(applicationContext).a(activity, new d.a() { // from class: com.anythink.core.common.j.a.1.2
                        @Override // com.anythink.core.common.j.d.a
                        public final void a(boolean z10) {
                            if (t.b().F()) {
                                a.b("UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z10)));
                            }
                            if (z10) {
                                a.c(applicationContext);
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            a.this.a(aTGDPRConsentDismissListener, "", z10 ? 105 : 103);
                        }

                        @Override // com.anythink.core.common.j.d.a
                        public final void a(String str) {
                            if (t.b().F()) {
                                a.b("UMP onConsentFail:".concat(String.valueOf(str)));
                            }
                            if (d.a(applicationContext).a()) {
                                a.b("UMP canRequestAd:true after onConsentFail");
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                a.this.a(aTGDPRConsentDismissListener, "", 106);
                            } else {
                                AnonymousClass1 anonymousClass12 = AnonymousClass1.this;
                                a.this.a(applicationContext, aTGDPRConsentDismissListener);
                            }
                        }
                    });
                    if (d.a(applicationContext).a()) {
                        a.b("UMP canRequestAd:true");
                        a.this.a(aTGDPRConsentDismissListener, "", 104);
                    }
                }
            }
        }, 2);
    }

    public final void a(final Context context, final ATGDPRConsentDismissListener aTGDPRConsentDismissListener) {
        if (v.a(context).a() != 2) {
            a(aTGDPRConsentDismissListener, "", 101);
        } else {
            ATSDK.checkIsEuTraffic(context, new NetTrafficeCallback() { // from class: com.anythink.core.common.j.a.2
                @Override // com.anythink.core.api.NetTrafficeCallback
                public final void onErrorCallback(String str) {
                    a.this.a(aTGDPRConsentDismissListener, str, -1);
                }

                @Override // com.anythink.core.api.NetTrafficeCallback
                public final void onResultCallback(boolean z8) {
                    if (z8) {
                        v.a(context).a(context, new ATGDPRAuthCallback() { // from class: com.anythink.core.common.j.a.2.1
                            @Override // com.anythink.core.api.ATGDPRAuthCallback
                            public final void onAuthResult(int i4) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                a.this.a(aTGDPRConsentDismissListener, "", 100);
                            }

                            @Override // com.anythink.core.api.ATGDPRAuthCallback
                            public final void onPageLoadFail() {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                a.this.a(aTGDPRConsentDismissListener, "showUploadDataNotifyDialog onPageLoadFail", -1);
                            }
                        });
                    } else {
                        a.this.a(aTGDPRConsentDismissListener, "", 102);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final ATGDPRConsentDismissListener aTGDPRConsentDismissListener, final String str, final int i4) {
        t.b().b(new Runnable() { // from class: com.anythink.core.common.j.a.3
            @Override // java.lang.Runnable
            public final void run() {
                if (aTGDPRConsentDismissListener == null || a.this.f14399q.contains(Integer.valueOf(aTGDPRConsentDismissListener.hashCode()))) {
                    return;
                }
                a.this.f14399q.add(Integer.valueOf(aTGDPRConsentDismissListener.hashCode()));
                aTGDPRConsentDismissListener.onDismiss(new ATGDPRConsentDismissListener.ConsentDismissInfo(str, i4));
            }
        });
    }

    public final synchronized void a(Context context) {
        boolean a9;
        try {
            if (TextUtils.isEmpty(this.f14396n)) {
                this.f14396n = b.a(context).b();
                this.f14398p = b.a(context).d();
                this.f14397o = b.a(context).c();
            }
            b("IABTCF_TCString:" + this.f14396n);
            b("IABTCF_VendorConsents:" + this.f14398p);
            b("IABTCF_AddtlConsent:" + this.f14397o);
            if (TextUtils.isEmpty(this.f14396n)) {
                this.f14395m = true;
                return;
            }
            this.f14395m = false;
            this.f14394l.clear();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f14397o)) {
                try {
                    String[] split = this.f14397o.split("~");
                    if (split.length >= 2) {
                        for (String str : split[1].split("\\.")) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
            for (Map.Entry<Integer, c> entry : this.f14393k.entrySet()) {
                Integer key = entry.getKey();
                c value = entry.getValue();
                int c4 = value.c();
                if (c4 == 1) {
                    a9 = a(this.f14398p, value.b());
                } else if (c4 == 2) {
                    a9 = arrayList.size() == 0 ? false : arrayList.contains(Integer.valueOf(value.b()));
                } else {
                    this.f14394l.put(key, value);
                    b("initNetworkConsentMap " + value.a() + ":" + value.d());
                }
                value.a(a9);
                this.f14394l.put(key, value);
                b("initNetworkConsentMap " + value.a() + ":" + value.d());
            }
            c(context);
            StringBuilder sb = new StringBuilder("initNetworkConsentMap others:");
            sb.append(v.a(context).a() == 0);
            b(sb.toString());
            this.f14395m = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean a(Context context, int i4) {
        c cVar;
        if (this.f14394l.size() > 0 && (cVar = this.f14394l.get(Integer.valueOf(i4))) != null) {
            return cVar.d();
        }
        return v.a(context).c();
    }

    private static boolean a(String str, int i4) {
        if (!TextUtils.isEmpty(str) && i4 > 0) {
            try {
                if (str.length() >= i4) {
                    if (str.charAt(i4 - 1) == '1') {
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean a(List<Integer> list, int i4) {
        if (list.size() == 0) {
            return false;
        }
        return list.contains(Integer.valueOf(i4));
    }

    public final synchronized JSONObject a(JSONObject jSONObject) {
        if (!b() && TextUtils.isEmpty(this.f14396n)) {
            this.f14396n = b.a(t.b().g()).b();
            this.f14398p = b.a(t.b().g()).d();
            this.f14397o = b.a(t.b().g()).c();
        }
        try {
            if (!TextUtils.isEmpty(this.f14396n)) {
                jSONObject.put("tc_string", this.f14396n);
            }
            if (!TextUtils.isEmpty(this.f14397o)) {
                jSONObject.put("addtl_consent", this.f14397o);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
