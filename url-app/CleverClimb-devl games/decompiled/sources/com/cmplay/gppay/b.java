package com.cmplay.gppay;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.provider.Settings;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.text.TextUtils;
import android.util.Log;
import com.cmplay.gppay.a.b;
import com.cmplay.gppay.a.e;
import com.cmplay.gppay.a.f;
import com.cmplay.gppay.a.g;
import com.cmplay.gppay.a.i;
import com.cmplay.gppay.a.j;
import com.cmplay.gppay.b.k;
import com.cmplay.gppay.c;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.player.UnityPlayer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class b implements b.a, b.c, b.d, b.e {
    private static b X = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f4106b = null;

    /* renamed from: d, reason: collision with root package name */
    public static String f4107d = null;
    public static String e = "1";
    public static String g = "";
    public static String h = "";
    public static String i = "";
    public static String j = "";
    public static boolean k = false;
    public static String l = "";
    private static final byte[] y = {-46, 65, 30, Byte.MIN_VALUE, -103, -57, 74, -64, 51, 88, -95, -45, 77, -117, -36, -113, -11, 32, -64, 89};
    private static WeakReference<Activity> z;
    private ArrayList<ArrayList<String>> H;
    private ArrayList<String> O;
    private ArrayList<String> P;
    private i Q;
    private com.cmplay.gppay.a.b R;
    private com.android.vending.a.a S;
    private c V;
    private d W;

    /* renamed from: c, reason: collision with root package name */
    public Activity f4109c;
    private HandlerThread t;
    private Handler u;
    private com.cmplay.gppay.a v;
    private SharedPreferences w;
    private Context x;

    /* renamed from: a, reason: collision with root package name */
    public final String f4108a = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq91vSrfeKV2AlslJGe3UhFWQv4keiKy9zPsIBeYeHScBHp0B+LdPzyeJ6UQ10chTEPfkkPGEhhzptX+7je25zToUrEwT4ylKzfSDxvXlfajjBkzL+1QYqzaVXsKnfh1W9OIMkKQJNjCiKFMdyJe16JgHL3QDoP7Ww+4tIDsv6hknIQdx0LjklBwWGo5FWE7X0sfFWrCofvtaUFUjonr/pJtqr0UpLtZUaj6wPoDuALjzNJ7PnnxTrRDbcyXc8hMxbrQdVxqNKGL91oyZOzjYQEI2SONLYOp2bnKuNXko1rVHJU1D9FHpzodV2R614SIZcwjkans2ezlG9Te7+lhU+wIDAQAB";
    public String f = "";
    public String m = "";
    public String n = "0";
    public String o = "0";
    public int p = 0;
    public String q = "";
    public String r = "";
    public String s = "";
    private boolean A = false;
    private boolean B = true;
    private boolean C = false;
    private boolean D = true;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private Boolean I = true;
    private String J = "0";
    private boolean K = false;
    private ArrayList<g> L = new ArrayList<>();
    private ArrayList<g> M = new ArrayList<>();
    private ArrayList<String> N = new ArrayList<>();
    private com.cmplay.gppay.b.d T = null;
    private com.cmplay.gppay.b.c U = null;
    private a Y = null;
    private CopyOnWriteArrayList<g> Z = new CopyOnWriteArrayList<>();
    private boolean aa = false;
    private int ab = 0;

    /* renamed from: com.cmplay.gppay.b$1, reason: invalid class name */
    static class AnonymousClass1 implements com.cmplay.gppay.a {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0130 A[Catch: Exception -> 0x013c, TRY_LEAVE, TryCatch #0 {Exception -> 0x013c, blocks: (B:3:0x0016, B:5:0x0026, B:7:0x0097, B:8:0x00aa, B:10:0x00b2, B:11:0x010e, B:13:0x0130, B:19:0x00c0, B:20:0x00a3, B:21:0x00c4), top: B:2:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        @Override // com.cmplay.gppay.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(int i, String str) {
            String str2;
            f.a("gp_pay", "onPayCallback=" + i);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("status", i);
                if (i / 100 == 1) {
                    JSONObject jSONObject2 = new JSONObject(str);
                    int optInt = jSONObject2.optInt("count");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("orderJson");
                    String optString = optJSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    String optString2 = optJSONObject.optString("orderId");
                    jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, optString);
                    jSONObject.put("count", optInt);
                    jSONObject.put("orderId", optString2);
                    jSONObject.put("originalTransactionId", optString2);
                    jSONObject.put("userId", b.a().f);
                    jSONObject.put("isSandBox", b.a().p);
                    jSONObject.put(TJAdUnitConstants.String.MESSAGE, "payment successful");
                    jSONObject.put("inlntroOfferPeriod", false);
                    f.a("gp_pay", "回调onPayCallback msg=" + str);
                    if (jSONObject2.has("expiryTimeMillis")) {
                        jSONObject.put("expires", jSONObject2.getString("expiryTimeMillis"));
                    } else {
                        jSONObject.put("expires", "0");
                    }
                    if (jSONObject2.has("trialPeriod")) {
                        jSONObject.put("trialPeriod", optJSONObject.optBoolean("trialPeriod"));
                        f.a("gp_pay", "回调onPayCallback json=" + jSONObject.toString());
                        if (TextUtils.isEmpty(b.l)) {
                            UnityPlayer.UnitySendMessage(b.l, "onPayCallBack", jSONObject.toString());
                            return;
                        }
                        return;
                    }
                    str2 = "trialPeriod";
                } else {
                    jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, b.a().q);
                    jSONObject.put("count", "");
                    jSONObject.put("orderId", "");
                    jSONObject.put("originalTransactionId", "");
                    jSONObject.put("userId", b.a().f);
                    jSONObject.put("isSandBox", b.a().p);
                    jSONObject.put(TJAdUnitConstants.String.MESSAGE, str);
                    jSONObject.put("expires", "0");
                    jSONObject.put("trialPeriod", false);
                    str2 = "inlntroOfferPeriod";
                }
                jSONObject.put(str2, false);
                f.a("gp_pay", "回调onPayCallback json=" + jSONObject.toString());
                if (TextUtils.isEmpty(b.l)) {
                }
            } catch (Exception e) {
                if (!TextUtils.isEmpty(b.l)) {
                    UnityPlayer.UnitySendMessage(b.l, "onPayCallBack", "");
                }
                e.printStackTrace();
            }
        }

        @Override // com.cmplay.gppay.a
        public void a(int i, String str, String str2) {
            f.a("gp_pay", "回调onQuerySubsTimeInfos status=" + i);
            f.a("gp_pay", "回调onQuerySubsTimeInfos data=" + str2);
            try {
                JSONObject jSONObject = new JSONObject();
                if (str2.isEmpty()) {
                    jSONObject.put("result", str2);
                } else {
                    jSONObject.put("result", new JSONArray(str2));
                }
                jSONObject.put("status", String.valueOf(i));
                jSONObject.put(TJAdUnitConstants.String.MESSAGE, str);
                jSONObject.put("isSandBox", b.a().p);
                jSONObject.put("userId", b.a().f);
                f.a("gp_pay", "回调onQuerySubsTimeInfos jsonData=" + jSONObject.toString());
                if (TextUtils.isEmpty(b.l)) {
                    return;
                }
                UnityPlayer.UnitySendMessage(b.l, "onRequestNonConsumableProductStatusWithResult", jSONObject.toString());
            } catch (Exception e) {
                if (!TextUtils.isEmpty(b.l)) {
                    UnityPlayer.UnitySendMessage(b.l, "onRequestNonConsumableProductStatusWithResult", "");
                }
                e.printStackTrace();
            }
        }

        @Override // com.cmplay.gppay.a
        public void a(String str) {
            f.a("gp_pay", "回调onPayProductInfos == " + str);
            if (TextUtils.isEmpty(b.l)) {
                return;
            }
            UnityPlayer.UnitySendMessage(b.l, "onGetProductInfos", str);
        }

        @Override // com.cmplay.gppay.a
        public void a(String str, String str2, String str3) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, str);
                jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, str2);
                jSONObject.put("data", str3);
                f.a("gp_pay", "回调reportPurchase jsonData=" + jSONObject.toString());
                if (TextUtils.isEmpty(b.l)) {
                    return;
                }
                UnityPlayer.UnitySendMessage(b.l, "reportPurchase", jSONObject.toString());
            } catch (Exception e) {
                if (!TextUtils.isEmpty(b.l)) {
                    UnityPlayer.UnitySendMessage(b.l, "reportPurchase", "");
                }
                e.printStackTrace();
            }
        }

        @Override // com.cmplay.gppay.a
        public void a(String str, boolean z) {
            try {
                Class.forName("com.cmplay.internalpush.b").getMethod("reportData", String.class, String.class).invoke(null, "cmplaysdk_purchases", str);
            } catch (Exception e) {
                e.printStackTrace();
                f.a("gp_pay reportInfoc  reportData失败", "埋点： " + str);
            }
        }
    }

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                f.a("gp_pay", "网络监听广播!");
                if (((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo() != null && !b.this.B) {
                    f.a("gp_pay", "网络监听 连接了，进行补单流程!");
                    b.this.h();
                }
                b.this.B = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: com.cmplay.gppay.b$b, reason: collision with other inner class name */
    private class HandlerC0327b extends Handler {
        private HandlerC0327b() {
        }

        /* synthetic */ HandlerC0327b(b bVar, AnonymousClass1 anonymousClass1) {
            this();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what / 100 == 4) {
                b.this.c(message.what, message.obj.toString());
            } else {
                b.this.a(message.what, message.obj.toString());
            }
        }
    }

    private b() {
        f.a("gp_pay", "into new PaySdk");
        try {
            this.t = new HandlerThread("gppay_thread");
            this.t.start();
            this.u = new Handler(this.t.getLooper());
        } catch (Exception e2) {
            f.a("gp_pay", "new PaySdk-----Exception:" + e2.getMessage());
            System.out.println(e2.getMessage());
        }
    }

    public static b a() {
        if (X == null) {
            X = new b();
        }
        return X;
    }

    public static String a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[Catch: Exception -> 0x00e0, TryCatch #0 {Exception -> 0x00e0, blocks: (B:17:0x004e, B:22:0x0076, B:25:0x007e, B:27:0x00af, B:29:0x00b3, B:32:0x00d2, B:39:0x0082, B:41:0x0088, B:44:0x0090, B:46:0x0096, B:48:0x009a, B:51:0x00a5), top: B:16:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(int i2, String str) {
        String optString;
        String optString2;
        String optString3;
        int i3;
        int i4;
        String str2;
        int i5 = i2;
        f.a("gp_pay", "验单结果：" + i5 + ", " + str);
        if (this.f4109c != null) {
            this.f4109c.finish();
        }
        if (i5 != 303 && i5 / 100 != 1) {
            this.K = false;
            if (this.v == null) {
                return;
            }
        } else {
            if (!b(i2, str).booleanValue()) {
                return;
            }
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject("orderJson");
                optString = optJSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                optString2 = optJSONObject.optString("orderId");
                optString3 = optJSONObject.optString("purchaseToken");
            } catch (Exception e2) {
                e2.printStackTrace();
                i5 = 203;
            }
            if (i5 != 303 && i5 != 101) {
                if (i5 == 100) {
                    if (!TextUtils.isEmpty(optString2)) {
                        optString3 = optString2;
                    }
                    b(optString3);
                }
                if (i5 / 100 == 1) {
                    a(3, 2, optString2, optString, "3,status=" + i5);
                    if (i5 == 101) {
                        i3 = 1;
                        i4 = 2;
                        str2 = "2";
                    } else if (i5 == 100) {
                        i3 = 1;
                        i4 = 2;
                        str2 = "1";
                    }
                    a(i3, i4, optString2, optString, str2);
                }
                this.K = false;
                if (this.v == null) {
                    return;
                }
            }
            if (a(optString2, optString3)) {
                if (!TextUtils.isEmpty(optString2)) {
                    optString3 = optString2;
                }
                b(optString3);
                i5 = 101;
            } else if (this.O == null || !this.O.contains(optString)) {
                a(3, 2, optString2, optString, "4重复单");
            } else {
                i5 = 102;
            }
            if (i5 / 100 == 1) {
            }
            this.K = false;
            if (this.v == null) {
            }
        }
        this.v.a(i5, str);
    }

    public static void a(String str) {
        f.a("gp_pay", "CMPSetNoConsumeProduct ---productIdJsonArray=" + str);
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                arrayList.add(jSONArray.get(i2).toString());
            }
            f.a("gp_pay", "CMPSetNoConsumeProduct ---ArrayList=" + arrayList.toString());
            a().a(arrayList);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static void a(String str, String str2, String str3) {
        f.a("gp_pay", "CMPBuyProduct ---userId=" + str + "---platformType=" + str2 + "---productId=" + str3);
        a().q = str3;
        a().r = str2;
        a().s = str;
        if (a().R == null) {
            a().a(903, "pay not init!");
            a().C = false;
            return;
        }
        if (!a().C) {
            a().a(903, "pay not init!");
            return;
        }
        if (a().R.d() == null) {
            a().i();
            return;
        }
        a().j();
        f.a("gp_pay", "-----goto start pay-activity-----");
        Intent intent = new Intent(z.get(), (Class<?>) UnityPayActivity.class);
        intent.putExtra("userId", str);
        intent.putExtra("platformType", str2);
        intent.putExtra(InAppPurchaseMetaData.KEY_PRODUCT_ID, str3);
        z.get().startActivity(intent);
    }

    private boolean a(String str, String str2) {
        for (int i2 = 0; i2 < this.L.size(); i2++) {
            g gVar = this.L.get(i2);
            if (gVar != null && (TextUtils.equals(gVar.b(), str) || TextUtils.equals(gVar.e(), str2))) {
                return true;
            }
        }
        return false;
    }

    private Boolean b(int i2, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("orderJson");
            String optString = optJSONObject.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
            String optString2 = optJSONObject.optString("purchaseToken");
            String optString3 = optJSONObject.optString("packageName");
            Iterator<String> it = this.P.iterator();
            while (it.hasNext()) {
                if (it.next().equals(optString)) {
                    Log.v("gp_pay", "boolean json.has(expiryTimeMillis) = " + jSONObject.has("expiryTimeMillis"));
                    if (jSONObject.has("expiryTimeMillis")) {
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, optString);
                        jSONObject2.put("expiryTimeMillis", jSONObject.optString("expiryTimeMillis"));
                        jSONObject2.put("isBuySubs", "1");
                        jSONArray.put(jSONObject2);
                        b(optString2, jSONArray.toString());
                        return true;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("pkgName", optString3);
                    jSONObject4.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, optString);
                    jSONObject4.put("token", optString2);
                    arrayList2.add(jSONObject4);
                    arrayList.add(arrayList2);
                    jSONObject3.put("checklist", arrayList);
                    this.W.a(jSONObject3, (Boolean) true, i2, str);
                    return false;
                }
            }
            return true;
        } catch (Exception e2) {
            Log.v("gp_pay", "checkSubsTime Exception = " + e2.getMessage());
            return false;
        }
    }

    public static void b() {
        f.a("gp_pay", "CMPRequestProducts");
        a().d();
    }

    private void b(com.cmplay.gppay.a.c cVar) {
        this.A = false;
        if (!cVar.c()) {
            f.a("gp_pay", "google pay初始化异常：" + cVar.b());
            a(901, cVar.b());
            return;
        }
        this.C = true;
        f.a("gp_pay", "初始化成功! ");
        try {
            this.R.a((b.e) this);
        } catch (Exception e2) {
            a(902, "");
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b(com.cmplay.gppay.a.c cVar, com.cmplay.gppay.a.d dVar) {
        ArrayList<g> arrayList;
        if (dVar == null) {
            return;
        }
        try {
            this.M.clear();
            Iterator<String> it = this.N.iterator();
            while (it.hasNext()) {
                g b2 = dVar.b(it.next());
                if (b2 != null && TextUtils.equals("inapp", b2.a())) {
                    f.a("gp_pay", "查询: " + b2.d() + ", type=" + b2.a());
                    if (this.O == null || !this.O.contains(b2.d()) || this.M.contains(b2.d())) {
                        if (!this.L.contains(b2)) {
                            f.a("gp_pay", "查询存入: " + b2.d());
                            arrayList = this.L;
                        }
                        synchronized (this) {
                            String b3 = b2.b();
                            a(3, 2, b3, b2.d(), "5");
                            f.a("gp_pay", "---------premiumPurchase.getToken() = " + b2.e());
                            this.V.a(b2.g(), b2.f(), b3, b2.e(), true);
                        }
                    } else {
                        arrayList = this.M;
                    }
                    arrayList.add(b2);
                    synchronized (this) {
                    }
                }
            }
            f.a("gp_pay", "查询完成 ");
            if (this.D) {
                this.D = false;
                g();
            }
            if (this.F) {
                f.a("gp_pay", "----into isInited2GetSubsTime");
                this.F = false;
                if (k) {
                    f.a("gp_pay", "into CMPQuerySubsTime: 新版订阅查询");
                    a().c(this.H);
                } else {
                    f.a("gp_pay", "into CMPQuerySubsTime: 旧版订阅查询");
                    a().b(this.H);
                }
            }
            if (this.G) {
                f.a("gp_pay", "into isInited2BuyProduct: 初始化后尝试购买");
                this.G = false;
                a(this.s, this.r, this.q);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private void b(com.cmplay.gppay.a.c cVar, g gVar) {
        int i2;
        String b2 = cVar.b();
        f.a("gp_pay", "payFinished --" + b2);
        if (!cVar.d()) {
            if (!this.L.contains(gVar)) {
                f.a("gp_pay", "支付成功存入: " + gVar.d());
                this.L.add(gVar);
            }
            String b3 = gVar.b();
            synchronized (this) {
                a(3, 2, b3, gVar.d(), "1");
                this.V.a(gVar.g(), gVar.f(), b3, gVar.e(), false);
            }
            if (this.v != null) {
                this.v.a(gVar.d(), gVar.g(), gVar.f());
                return;
            }
            return;
        }
        if (gVar == null || cVar.a() != 7 || this.O == null || !this.O.contains(gVar.d())) {
            if (cVar.a() == -1005) {
                f.a("gp_pay", "payFinished -- 取消");
                a(2, 2, gVar == null ? "" : gVar.b(), gVar == null ? "" : gVar.d(), "2");
                i2 = 204;
            } else {
                f.a("gp_pay", "payFinished -- 其它失败");
                a(2, 2, gVar == null ? "" : gVar.b(), gVar == null ? "" : gVar.d(), "1");
                i2 = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
            }
            a(i2, b2);
            a(3, 2, gVar == null ? "" : gVar.b(), gVar == null ? "" : gVar.d(), "2,result=" + cVar.a());
        } else {
            a(102, gVar.f());
            a(3, 2, gVar == null ? "" : gVar.b(), gVar == null ? "" : gVar.d(), "6,result=7");
        }
        this.K = false;
    }

    private void b(g gVar, com.cmplay.gppay.a.c cVar) {
        this.aa = true;
        this.ab--;
        if (cVar.c() && gVar != null) {
            this.L.remove(gVar);
            f.a("gp_pay", "消费完成：" + cVar.b() + ", mExistPurchases=" + this.L.size());
            this.Z.remove(gVar);
            if (this.Z.size() > 0 && this.ab >= 0) {
                this.R.a(this.Z.get(0), this);
            }
        }
        this.aa = false;
        this.K = false;
    }

    private synchronized void b(String str) {
        Iterator it;
        try {
            f.a("gp_pay", "mExistPurchases =" + this.L.size());
            it = new ArrayList(this.L).iterator();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar != null && (TextUtils.equals(gVar.b(), str) || TextUtils.equals(gVar.e(), str))) {
                if (this.O == null || !this.O.contains(gVar.d())) {
                    if (!this.Z.contains(gVar)) {
                        this.Z.add(gVar);
                    }
                    if (!this.aa) {
                        this.ab = this.N.size();
                        this.R.a(gVar, this);
                    }
                } else if (!this.M.contains(gVar)) {
                    this.M.add(gVar);
                }
            }
        }
    }

    private void b(String str, String str2) {
        f.a("gp_pay", "into saveSubsTime  newtime = " + str2);
        this.Q.a(str, str2);
        e("1");
    }

    private static boolean b(Context context) {
        if (context != null) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 1024);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i2, String str) {
        Log.e("gp_pay", "sendSubsTimeCallback---status = " + i2);
        Log.e("gp_pay", "sendSubsTimeCallback---infos = " + str);
        if (this.v != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("code");
                String optString = jSONObject.optString(TJAdUnitConstants.String.MESSAGE);
                if (optInt != 0) {
                    this.v.a(i2, optString, "");
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = jSONObject.getJSONArray("data");
                for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                    JSONArray jSONArray3 = new JSONArray();
                    String valueOf = String.valueOf(jSONObject3.optLong("expiryTimeMillis"));
                    String optString2 = jSONObject3.optString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    String optString3 = jSONObject3.optString("orderId");
                    if (jSONObject3.has("subscriptionsUserIds")) {
                        jSONArray3 = jSONObject3.optJSONArray("subscriptionsUserIds");
                    }
                    if (jSONObject3.has("paymentState")) {
                        if (jSONObject3.optInt("paymentState") == 2) {
                            jSONObject2.put("trialPeriod", true);
                        } else {
                            jSONObject2.put("trialPeriod", false);
                        }
                    }
                    jSONObject2.put("inlntroOfferPeriod", false);
                    jSONObject2.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, optString2);
                    jSONObject2.put("expires", valueOf);
                    jSONObject2.put("orderId", optString3);
                    jSONObject2.put("originalTransactionId", optString3);
                    jSONObject2.put("subscriptionsUserIds", jSONArray3);
                    jSONArray.put(jSONObject2);
                }
                this.v.a(i2, optString, jSONArray.toString());
            } catch (Exception e2) {
                Log.e("gp_pay", "Exception---error = " + e2.getMessage());
                this.v.a(404, e2.getMessage(), "");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        f.a("gp_pay", "getNewProductsInfo---infos = " + str);
        String d2 = d(str);
        f.a("gp_pay", "getNewProductsInfo---new infos = " + d2);
        i = d2;
        if (this.v == null || !this.E) {
            return;
        }
        this.v.a(d2);
    }

    private String d(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                if (jSONObject.has("price_amount_micros")) {
                    double d2 = jSONObject.getLong("price_amount_micros");
                    if (0.0d != d2) {
                        Double.isNaN(d2);
                        jSONArray.getJSONObject(i2).put("price_amount", d2 / 1000000.0d);
                    }
                }
            }
            return jSONArray.toString();
        } catch (JSONException e2) {
            f.a("gp_pay", "getNewProductsInfo---JSONException = " + e2.getMessage());
            e2.printStackTrace();
            return "";
        }
    }

    private JSONObject d(ArrayList<ArrayList<String>> arrayList) {
        JSONObject jSONObject;
        Exception e2;
        JSONObject jSONObject2;
        com.cmplay.gppay.a.d a2;
        JSONArray jSONArray;
        f.a("gp_pay", "into getCheckListNew:" + arrayList);
        try {
            a2 = this.R.a(true, (List<String>) this.N);
            jSONObject = new JSONObject();
        } catch (Exception e3) {
            jSONObject = null;
            e2 = e3;
        }
        try {
            jSONArray = new JSONArray();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i3 = 0; i3 < arrayList.get(i2).size(); i3++) {
                    JSONObject jSONObject3 = new JSONObject();
                    String str = arrayList.get(i2).get(i3);
                    g b2 = a2.b(str);
                    if (b2 != null && b2.e() != null && b2.c() != null) {
                        jSONObject3.put("pkgName", b2.c());
                        jSONObject3.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, str);
                        jSONObject3.put("token", b2.e());
                        jSONArray2.put(jSONObject3);
                    }
                }
                if (jSONArray2.length() != 0) {
                    jSONArray.put(jSONArray2);
                }
            }
        } catch (Exception e4) {
            e2 = e4;
            f.a("gp_pay", "ArrayList:productid--id = " + arrayList.toString());
            f.a("gp_pay", "productid--IabException = " + e2.getMessage());
            jSONObject2 = jSONObject;
            return jSONObject2;
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        jSONObject.put("checklist", jSONArray);
        jSONObject2 = jSONObject;
        return jSONObject2;
    }

    private void e(String str) {
        f.a("gp_pay", "into saveIsBuySubs  subs_buy_status = " + str);
        this.Q.a("subs_buy_status", str);
    }

    private void f() {
        try {
            this.R = new com.cmplay.gppay.a.b(this.x, f4106b);
            this.R.a((b.d) this);
            if (this.Y == null) {
                f.a("gp_pay", "注册网络监听!");
                this.Y = new a();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                this.x.registerReceiver(this.Y, intentFilter);
            }
            this.A = true;
        } catch (Exception e2) {
            a(901, "");
            e2.printStackTrace();
        }
    }

    private void g() {
        f.a("gp_pay", "into getProductInfos");
        this.P = new ArrayList<>();
        this.u.post(new Runnable() { // from class: com.cmplay.gppay.b.2
            @Override // java.lang.Runnable
            public void run() {
                String str;
                ArrayList<String> arrayList = b.this.N;
                b.this.S = b.this.R.d();
                try {
                    new Bundle().putStringArrayList("ITEM_ID_LIST", arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    com.cmplay.gppay.a.d a2 = b.this.R.a(true, (List<String>) arrayList);
                    if (a2 != null) {
                        Iterator<String> it = arrayList.iterator();
                        while (it.hasNext()) {
                            j a3 = a2.a(it.next());
                            if (a3 != null) {
                                String replace = a3.toString().replace("SkuDetails:", "");
                                f.a("gp_pay", "sku detail json = " + replace);
                                arrayList2.add(replace);
                                if (a3.b().equals("subs")) {
                                    b.this.P.add(a3.a());
                                }
                            }
                        }
                    }
                    Collections.sort(arrayList2, new c.a());
                    str = arrayList2.toString();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    str = "";
                }
                f.a("gp_pay", "getProductInfos =" + str);
                f.a("gp_pay", "mSubsList =" + b.this.P.toString());
                if (TextUtils.isEmpty(str)) {
                    b.this.a(2, 1, "", "", "");
                } else {
                    b.this.a(1, 1, "", "", "itemsStr-len-" + str.length());
                }
                b.this.c(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        try {
            if (this.R != null) {
                this.R.a((b.e) this);
            }
        } catch (Exception unused) {
        }
    }

    private void i() {
        f.a("gp_pay", "into restartIabHelper");
        a().c();
        this.G = true;
        try {
            this.R = new com.cmplay.gppay.a.b(this.x, f4106b);
            this.R.a((b.d) this);
        } catch (Exception e2) {
            f.a("gp_pay", "into restartIabHelper---Exception:" + e2.getMessage());
        }
    }

    private void j() {
        f.a("gp_pay", "into initLicensing");
        if (this.T == null) {
            this.T = new com.cmplay.gppay.b.d() { // from class: com.cmplay.gppay.b.3
                @Override // com.cmplay.gppay.b.d
                public void a(int i2) {
                    f.a("gp_pay", "-----Licensing allow");
                    b.this.p = 1;
                }

                @Override // com.cmplay.gppay.b.d
                public void b(int i2) {
                    f.a("gp_pay", "-----Licensing dontAllow");
                    b.this.p = 0;
                }

                @Override // com.cmplay.gppay.b.d
                public void c(int i2) {
                    f.a("gp_pay", "-----Licensing applicationError:" + i2);
                }
            };
        }
        if (this.U == null) {
            this.U = new com.cmplay.gppay.b.c(this.x, new k(this.x, new com.cmplay.gppay.b.a(y, this.x.getPackageName(), this.o)), f4106b);
        }
        this.U.a(this.T);
    }

    public void a(int i2, int i3, String str, String str2, String str3) {
        if (this.v != null) {
            long currentTimeMillis = System.currentTimeMillis();
            this.v.a("uptime=" + String.valueOf(currentTimeMillis / 1000) + "&action=" + ((int) ((byte) i2)) + "&source=" + ((int) ((byte) i3)) + "&orderid=" + str + "&productid=" + str2 + "&remark=" + str3 + "&network=" + String.valueOf(e.a(a().x)), true);
        }
    }

    public void a(Activity activity, String str, String str2, String str3) {
        if (this.P == null) {
            a(903, "pay not init!");
            f.a("gp_pay", "buyProduct error : mSubsList = null");
            return;
        }
        Iterator<String> it = this.P.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (it.next().equals(str3)) {
                z2 = true;
            }
        }
        f.a("gp_pay", "buyProduct isSubs =" + z2);
        if (z2) {
            a().c(activity, str, str2, str3);
        } else {
            a().b(activity, str, str2, str3);
        }
    }

    public void a(Activity activity, String str, String str2, String str3, String str4, String str5, ArrayList<String> arrayList, String str6, com.cmplay.gppay.a aVar) {
        if (activity == null || arrayList == null || arrayList.size() == 0) {
            f.a("gp_pay", "初始化失败activity");
            return;
        }
        this.f = str4;
        g = str6;
        if (this.A) {
            f.a("gp_pay", "有一个在初始化了");
            return;
        }
        if (this.C) {
            f.a("gp_pay", "已经初始化过了，本次只更换userId和token");
            return;
        }
        this.E = false;
        f4106b = str;
        f4107d = str2;
        this.x = activity.getApplicationContext();
        this.v = aVar;
        this.o = a(this.x);
        j();
        HandlerC0327b handlerC0327b = new HandlerC0327b(this, null);
        this.V = new c(this.u, this.v, handlerC0327b);
        this.W = new d(this.u, handlerC0327b);
        this.Q = new i(this.x, "subs");
        if (!b(this.x)) {
            a(900, "");
            return;
        }
        j = this.x.getPackageName();
        z = new WeakReference<>(activity);
        this.w = this.x.getSharedPreferences("save_gp", 0);
        this.m = str3;
        this.n = str5;
        this.N = arrayList;
        this.A = true;
        f();
    }

    @Override // com.cmplay.gppay.a.b.d
    public void a(com.cmplay.gppay.a.c cVar) {
        b(cVar);
    }

    @Override // com.cmplay.gppay.a.b.e
    public void a(com.cmplay.gppay.a.c cVar, com.cmplay.gppay.a.d dVar) {
        b(cVar, dVar);
    }

    @Override // com.cmplay.gppay.a.b.c
    public void a(com.cmplay.gppay.a.c cVar, g gVar) {
        b(cVar, gVar);
    }

    @Override // com.cmplay.gppay.a.b.a
    public void a(g gVar, com.cmplay.gppay.a.c cVar) {
        b(gVar, cVar);
    }

    public void a(ArrayList<String> arrayList) {
        f.a("gp_pay", "setNoConsumeProduct ---noConsumeList" + arrayList.toString());
        this.O = arrayList;
    }

    public boolean a(int i2, int i3, Intent intent) {
        if (this.R != null) {
            return this.R.a(i2, i3, intent);
        }
        return false;
    }

    public void b(Activity activity, String str, String str2, String str3) {
        f.a("gp_pay", "asyncPay --" + str3);
        this.R.b();
        this.f = str2;
        this.n = str;
        Iterator<g> it = this.M.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next != null && TextUtils.equals(next.d(), str3)) {
                String b2 = next.b();
                synchronized (this) {
                    a(3, 2, b2, next.d(), "6");
                    this.V.a(next.g(), next.f(), b2, next.e(), false);
                }
                return;
            }
        }
        if (!this.K) {
            for (int i2 = 0; i2 < this.L.size(); i2++) {
                g gVar = this.L.get(i2);
                if (gVar == null || !TextUtils.equals(gVar.d(), str3)) {
                }
            }
            if (!this.C || TextUtils.isEmpty(str3)) {
                return;
            }
            boolean z2 = true;
            this.K = true;
            String str4 = "paying error";
            if (activity != null) {
                try {
                    this.R.a(activity, str3, 1001, this);
                    z2 = false;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    str4 = e2.getMessage();
                }
            }
            if (z2) {
                this.K = false;
                a(290, str4);
                return;
            }
            return;
        }
        a(205, "existed paying");
    }

    public void b(ArrayList<ArrayList<String>> arrayList) {
        f.a("gp_pay", "asyncGetSubsTimeOld isInited = " + this.C);
        f.a("gp_pay", "asyncGetSubsTimeOld product_list = " + arrayList.toString());
        this.H = arrayList;
        if (!this.C) {
            this.F = true;
            return;
        }
        if (this.W == null) {
            this.v.a(401, "mQuerySubsInfos = null", "");
            return;
        }
        JSONObject d2 = d(arrayList);
        if (d2 == null) {
            this.v.a(405, "No token can be inquired", "");
            return;
        }
        f.a("gp_pay", "getCheckListOld mCheckList = " + d2.toString());
        this.W.a(d2);
    }

    public void c() {
        if (this.R != null) {
            this.R.a();
        }
        this.R = null;
    }

    public void c(Activity activity, String str, String str2, String str3) {
        f.a("gp_pay", "asyncPay --" + str3);
        this.R.b();
        this.f = str2;
        this.n = str;
        Iterator<g> it = this.M.iterator();
        while (it.hasNext()) {
            g next = it.next();
            if (next != null && TextUtils.equals(next.d(), str3)) {
                String b2 = next.b();
                synchronized (this) {
                    a(3, 2, b2, next.d(), "6");
                    this.V.a(next.g(), next.f(), b2, next.e(), false);
                }
                return;
            }
        }
        if (!this.K) {
            for (int i2 = 0; i2 < this.L.size(); i2++) {
                g gVar = this.L.get(i2);
                if (gVar == null || !TextUtils.equals(gVar.d(), str3)) {
                }
            }
            if (!this.C || TextUtils.isEmpty(str3)) {
                return;
            }
            boolean z2 = true;
            this.K = true;
            String str4 = "paying error";
            if (activity != null) {
                try {
                    this.R.b(activity, str3, 1001, this);
                    z2 = false;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    str4 = e2.getMessage();
                }
            }
            if (z2) {
                this.K = false;
                a(290, str4);
                return;
            }
            return;
        }
        a(205, "existed paying");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void c(ArrayList<ArrayList<String>> arrayList) {
        JSONObject jSONObject;
        Exception e2;
        JSONObject jSONObject2;
        f.a("gp_pay", "asyncGetSubsTimeNew isInited = " + this.C);
        f.a("gp_pay", "asyncGetSubsTimeNew product_list = " + arrayList.toString());
        try {
            jSONObject = new JSONObject();
        } catch (Exception e3) {
            jSONObject = null;
            e2 = e3;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i3 = 0; i3 < arrayList.get(i2).size(); i3++) {
                    JSONObject jSONObject3 = new JSONObject();
                    String str = arrayList.get(i2).get(i3);
                    jSONObject3.put("pkgName", j);
                    jSONObject3.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, str);
                    jSONObject3.put("token", "");
                    jSONArray2.put(jSONObject3);
                }
                if (jSONArray2.length() != 0) {
                    jSONArray.put(jSONArray2);
                }
            }
            jSONObject.put("checklist", jSONArray);
            jSONObject2 = jSONObject;
        } catch (Exception e4) {
            e2 = e4;
            f.a("gp_pay", "ArrayList:product_list = " + arrayList.toString());
            f.a("gp_pay", "productid--IabException = " + e2.getMessage());
            jSONObject2 = jSONObject;
            if (jSONObject2 != null) {
            }
        }
        if (jSONObject2 != null) {
            this.v.a(405, "No token can be inquired", "");
            return;
        }
        f.a("gp_pay", "getCheckListNew mCheckList = " + jSONObject2.toString());
        this.W.a(jSONObject2);
    }

    public void d() {
        f.a("gp_pay", "asyncGetProduceInfos isInited = " + this.C);
        this.E = true;
        if (this.C) {
            g();
        } else {
            this.D = true;
        }
    }

    public void e() {
        f.a("gp_pay", "into restoreNoConsumeProducts");
        if (!this.C) {
            f.a("gp_pay", "restoreNoConsumeProducts google pay 未初始化");
            a(901, "restoreNoConsumeProducts: SDK Not initialized");
            return;
        }
        try {
            this.R.a((b.e) this);
        } catch (Exception e2) {
            a(902, "restoreNoConsumeProducts Exception e=" + e2.getMessage());
            e2.printStackTrace();
        }
    }
}
