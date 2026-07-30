package com.baidu.location.a;

import android.content.Context;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.lbsapi.auth.LBSAuthManagerListener;
import com.crrepa.band.my.model.storage.BaseParamNames;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a implements LBSAuthManagerListener {

    /* renamed from: a, reason: collision with root package name */
    private static Object f4426a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static a f4427b;

    /* renamed from: c, reason: collision with root package name */
    private int f4428c = 0;

    /* renamed from: d, reason: collision with root package name */
    private Context f4429d = null;

    /* renamed from: e, reason: collision with root package name */
    private long f4430e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f4431f = null;

    /* renamed from: g, reason: collision with root package name */
    public int f4432g = 0;

    public static a a() {
        a aVar;
        synchronized (f4426a) {
            try {
                if (f4427b == null) {
                    f4427b = new a();
                }
                aVar = f4427b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public static String c(Context context) {
        try {
            return LBSAuthManager.getInstance(context).getMCode();
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public String b() {
        return this.f4431f;
    }

    @Override // com.baidu.lbsapi.auth.LBSAuthManagerListener
    public void onAuthResult(int i8, String str) {
        this.f4428c = i8;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(BaseParamNames.TOKEN) && jSONObject.getString(BaseParamNames.TOKEN) != null) {
                    this.f4431f = jSONObject.getString(BaseParamNames.TOKEN);
                }
                if (!jSONObject.has("ak_permission") || jSONObject.getInt("ak_permission") == 0) {
                    return;
                }
                this.f4432g = jSONObject.getInt("ak_permission");
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public static String b(Context context) {
        try {
            return LBSAuthManager.getInstance(context).getPublicKey(context);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public void a(Context context) {
        this.f4429d = context;
        LBSAuthManager.getInstance(context).authenticate(true, "lbs_locsdk", null, this);
        this.f4430e = System.currentTimeMillis();
    }

    public boolean c() {
        int i8 = this.f4428c;
        boolean z7 = i8 == 0 || i8 == 602 || i8 == 601 || i8 == -10 || i8 == -11;
        if (this.f4429d != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.f4430e;
            if (!z7 ? currentTimeMillis < 0 || currentTimeMillis > 10000 : currentTimeMillis > 86400000) {
                LBSAuthManager.getInstance(this.f4429d).authenticate(false, "lbs_locsdk", null, this);
                this.f4430e = System.currentTimeMillis();
            }
        }
        return z7;
    }

    public void a(Context context, String str) {
        LBSAuthManager.getInstance(context).setKey(str);
    }
}
