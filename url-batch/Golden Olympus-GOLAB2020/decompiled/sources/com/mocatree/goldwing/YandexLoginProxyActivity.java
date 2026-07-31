package com.mocatree.goldwing;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.activity.j;
import androidx.activity.result.ActivityResultLauncher;
import androidx.browser.customtabs.b;
import c.InterfaceC1375a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.b9;
import com.ironsource.mediationsdk.metadata.a;
import com.mocatree.goldwing.YandexLoginProxyActivity;
import com.unity3d.player.UnityPlayer;
import com.yandex.authsdk.YandexAuthLoginOptions;
import com.yandex.authsdk.YandexAuthOptions;
import j1.C3184a;
import j1.b;
import j1.c;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class YandexLoginProxyActivity extends j {

    /* renamed from: d, reason: collision with root package name */
    private ActivityResultLauncher f20673d;

    /* renamed from: c, reason: collision with root package name */
    private boolean f20672c = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f20674e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f20675f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f20676g = false;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f20677h = new Handler(Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f20678i = new AtomicBoolean(false);

    private boolean A() {
        boolean z4 = false;
        long j4 = getSharedPreferences("yandex_auth", 0).getLong("direct_success_ts", 0L);
        long currentTimeMillis = System.currentTimeMillis() - j4;
        if (j4 > 0 && currentTimeMillis >= 0 && currentTimeMillis < 300000) {
            z4 = true;
        }
        Log.d("YandexLoginProxy", "direct success check ts=" + j4 + ", age=" + currentTimeMillis + ", recent=" + z4);
        return z4;
    }

    private boolean B() {
        try {
            getPackageManager().getPackageInfo("com.android.chrome", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("YandexLoginProxy", "Chrome not installed, falling back to SDK login");
            return false;
        }
    }

    private boolean C() {
        String[] strArr = {"ru.yandex.auth.client", "com.yandex.searchapp"};
        for (int i4 = 0; i4 < 2; i4++) {
            String str = strArr[i4];
            try {
                getPackageManager().getPackageInfo(str, 0);
                Log.d("YandexLoginProxy", "Yandex app found: " + str + " → using SDK login");
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(String str) {
        if (!this.f20678i.compareAndSet(false, true)) {
            Log.d("YandexLoginProxy", "[UI] duplicate deliver -> skip");
            return;
        }
        this.f20675f = true;
        v(str);
        H(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(b bVar) {
        if (this.f20675f) {
            return;
        }
        this.f20677h.removeCallbacksAndMessages(null);
        z(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F() {
        if (this.f20675f || isFinishing() || isDestroyed()) {
            return;
        }
        Log.w("YandexLoginProxy", "Timeout reached");
        this.f20675f = true;
        v("{\"ok\":false,\"error\":\"Timeout\"}");
        H(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        if (this.f20675f || isFinishing() || isDestroyed()) {
            return;
        }
        Log.w("YandexLoginProxy", "Direct login timeout reached");
        this.f20675f = true;
        v("{\"ok\":false,\"error\":\"Timeout\"}");
        H(0);
    }

    private void H(int i4) {
        Intent launchIntentForPackage;
        try {
            Activity activity = UnityPlayer.currentActivity;
            if (activity != null) {
                launchIntentForPackage = new Intent(getApplicationContext(), activity.getClass());
                launchIntentForPackage.addFlags(537001984);
            } else {
                launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(872546304);
                }
            }
            if (launchIntentForPackage != null) {
                startActivity(launchIntentForPackage);
            }
        } catch (Throwable th) {
            Log.e("YandexLoginProxy", "Failed to return to Unity activity", th);
        }
        setResult(i4);
        finish();
        overridePendingTransition(0, 0);
    }

    private void I() {
        this.f20677h.postDelayed(new Runnable() { // from class: b1.c
            @Override // java.lang.Runnable
            public final void run() {
                YandexLoginProxyActivity.this.G();
            }
        }, 300000L);
        try {
            String x4 = x();
            String y4 = y(x4);
            String uuid = UUID.randomUUID().toString();
            Uri build = Uri.parse("https://oauth.yandex.com/authorize").buildUpon().appendQueryParameter("response_type", "token").appendQueryParameter("client_id", x4).appendQueryParameter("redirect_uri", y4).appendQueryParameter(b9.h.f15456P, uuid).appendQueryParameter("force_confirm", a.f17681g).appendQueryParameter("origin", "goldwing_direct_android").build();
            Log.d("YandexLoginProxy", "Launching direct Yandex auth state=" + uuid + ", redirect=" + y4);
            StringBuilder sb = new StringBuilder();
            sb.append("Direct Yandex auth url=");
            sb.append(build);
            Log.d("YandexLoginProxy", sb.toString());
            androidx.browser.customtabs.b a4 = new b.d().a();
            a4.f11000a.setPackage("com.android.chrome");
            a4.f11000a.addFlags(1073741824);
            a4.a(this, build);
        } catch (Throwable th) {
            Log.e("YandexLoginProxy", "Direct Yandex launch failed", th);
            this.f20675f = true;
            this.f20677h.removeCallbacksAndMessages(null);
            v("{\"ok\":false,\"error\":\"Direct launch failed: " + w(th.getMessage()) + "\"}");
            H(0);
        }
    }

    private void u() {
        getSharedPreferences("yandex_auth", 0).edit().remove("direct_success_ts").apply();
        Log.d("YandexLoginProxy", "direct success marker cleared");
    }

    private void v(String str) {
        getSharedPreferences("yandex_auth", 0).edit().putString("result_json", str).putLong("result_ts", System.currentTimeMillis()).apply();
        UnityPlayer.UnitySendMessage("YandexLoginHelper", "OnRedirect", str);
    }

    private static String w(String str) {
        return str == null ? "" : str.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t");
    }

    private String x() {
        try {
            Bundle bundle = getPackageManager().getApplicationInfo(getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
            String string = bundle != null ? bundle.getString("com.yandex.auth.CLIENT_ID") : null;
            if (string != null) {
                if (!string.isEmpty()) {
                    return string;
                }
            }
            return "c80233770c754eb6932a88170667c570";
        } catch (Throwable th) {
            Log.w("YandexLoginProxy", "Failed to read YANDEX_CLIENT_ID from manifest, using fallback", th);
            return "c80233770c754eb6932a88170667c570";
        }
    }

    private String y(String str) {
        return "yx" + str + ":/auth/finish?platform=android";
    }

    private void z(j1.b bVar) {
        if (bVar instanceof b.c) {
            String c4 = ((b.c) bVar).a().c();
            StringBuilder sb = new StringBuilder();
            sb.append("[Success] tokenLen=");
            sb.append(c4 != null ? c4.length() : -1);
            Log.d("YandexLoginProxy", sb.toString());
            final String str = "{\"ok\":true,\"token\":\"" + w(c4) + "\"}";
            runOnUiThread(new Runnable() { // from class: b1.d
                @Override // java.lang.Runnable
                public final void run() {
                    YandexLoginProxyActivity.this.D(str);
                }
            });
            return;
        }
        if (!(bVar instanceof b.C0221b)) {
            Log.i("YandexLoginProxy", "[Cancel] user cancelled");
            Log.d("YandexLoginProxy", "[Cancel] deliverToUnity ...");
            if (!this.f20678i.compareAndSet(false, true)) {
                Log.d("YandexLoginProxy", "[UI] duplicate deliver -> skip");
                return;
            }
            this.f20675f = true;
            v("{\"ok\":false,\"error\":\"User cancelled\"}");
            Log.d("YandexLoginProxy", "[Cancel] returnToUnityAndFinish rc=0");
            H(0);
            return;
        }
        C3184a a4 = ((b.C0221b) bVar).a();
        String obj = a4 != null ? a4.toString() : "Unknown error";
        Log.w("YandexLoginProxy", "[Failure] " + obj);
        String str2 = "{\"ok\":false,\"error\":\"" + w(obj) + "\"}";
        Log.d("YandexLoginProxy", "[Failure] deliverToUnity ...");
        if (!this.f20678i.compareAndSet(false, true)) {
            Log.d("YandexLoginProxy", "[UI] duplicate deliver -> skip");
            return;
        }
        this.f20675f = true;
        v(str2);
        Log.d("YandexLoginProxy", "[Failure] returnToUnityAndFinish rc=0");
        H(0);
    }

    @Override // androidx.activity.j, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f20674e = bundle.getBoolean("launcher_executed", false);
        }
        boolean C4 = C();
        this.f20672c = !C4 && B();
        Log.d("YandexLoginProxy", "hasYandexApp=" + C4 + " usingDirectMode=" + this.f20672c);
        if (this.f20672c) {
            if (this.f20674e) {
                return;
            }
            this.f20674e = true;
            u();
            I();
            return;
        }
        this.f20673d = registerForActivityResult(c.b(new YandexAuthOptions(this)).a(), new InterfaceC1375a() { // from class: b1.a
            @Override // c.InterfaceC1375a
            public final void onActivityResult(Object obj) {
                YandexLoginProxyActivity.this.E((j1.b) obj);
            }
        });
        if (this.f20674e) {
            return;
        }
        this.f20674e = true;
        this.f20677h.postDelayed(new Runnable() { // from class: b1.b
            @Override // java.lang.Runnable
            public final void run() {
                YandexLoginProxyActivity.this.F();
            }
        }, 300000L);
        try {
            this.f20673d.a(new YandexAuthLoginOptions());
        } catch (Exception e4) {
            Log.e("YandexLoginProxy", "Launch failed", e4);
            this.f20675f = true;
            this.f20677h.removeCallbacksAndMessages(null);
            v("{\"ok\":false,\"error\":\"Launch failed: " + w(e4.getMessage()) + "\"}");
            H(0);
        }
    }

    @Override // androidx.activity.j, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (this.f20672c && !this.f20675f && A()) {
            Log.i("YandexLoginProxy", "Direct login already succeeded; closing proxy");
            this.f20675f = true;
            this.f20677h.removeCallbacksAndMessages(null);
            H(-1);
        }
    }

    @Override // androidx.activity.j, androidx.core.app.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("launcher_executed", this.f20674e);
        super.onSaveInstanceState(bundle);
    }
}
