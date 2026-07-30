package com.majelw.libystne;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.appsflyer.AppsFlyerLib;
import com.facebook.FacebookSdk;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.login.LoginLogger;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.FirebaseMessaging;
import com.majelw.libystne.MainActivity;
import defpackage.aa2;
import defpackage.ar0;
import defpackage.ba2;
import defpackage.dh1;
import defpackage.em0;
import defpackage.fh1;
import defpackage.hf0;
import defpackage.ih1;
import defpackage.ij2;
import defpackage.ja0;
import defpackage.q40;
import defpackage.re;
import defpackage.t21;
import defpackage.up2;
import defpackage.w50;
import defpackage.wp2;
import defpackage.yx;
import defpackage.z71;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class MainActivity extends re {
    public static final /* synthetic */ int w = 0;
    public boolean p;
    public volatile boolean q;
    public SharedPreferences s;
    public FirebaseAnalytics t;
    public String n = BuildConfig.FLAVOR;
    public String o = BuildConfig.FLAVOR;
    public final AtomicBoolean r = new AtomicBoolean(false);
    public final fh1 u = new fh1(this);
    public final fh1 v = new fh1(this);

    public static final void j(MainActivity mainActivity, String str) {
        if (mainActivity.o() && mainActivity.r.compareAndSet(false, true)) {
            Log.d("MADebug", "AF fail (" + str + ") — going native");
            mainActivity.t(false);
        }
    }

    public static void k(Intent intent) {
        Bundle extras;
        String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("log_url");
        if (string == null || string.length() == 0) {
            return;
        }
        Log.d("PUSH_CLICK", "Push click log_url=".concat(string));
        new Thread(new ih1(0, string, "clicked")).start();
    }

    public static boolean m(Intent intent) {
        Set<String> categories;
        return Intrinsics.b(intent != null ? intent.getAction() : null, "android.intent.action.MAIN") && (categories = intent.getCategories()) != null && categories.contains("android.intent.category.LAUNCHER");
    }

    public static /* synthetic */ void q(MainActivity mainActivity, String str, String str2, String str3, String str4, String str5, int i) {
        if ((i & 8) != 0) {
            str4 = BuildConfig.FLAVOR;
        }
        if ((i & 16) != 0) {
            str5 = BuildConfig.FLAVOR;
        }
        mainActivity.p(str, str2, str3, str4, str5);
    }

    public static final int r(MainActivity mainActivity, int i) {
        return (int) (i * mainActivity.getResources().getDisplayMetrics().density);
    }

    public final boolean l() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(ConnectivityManager.class);
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) ? false : true;
    }

    public final void n(final String str, final String str2, final String str3, final String str4) {
        if (o() && !this.q) {
            this.q = true;
            if (up2.K("aippslotys.shop").toString().length() != 0) {
                final String m = q40.m("https://", up2.K("aippslotys.shop").toString(), "/api/android/com.majelw.libystne");
                new Thread(new Runnable() { // from class: eh1
                    /* JADX WARN: Code restructure failed: missing block: B:126:0x0236, code lost:
                    
                        r3 = r18;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:128:0x023c, code lost:
                    
                        r0 = r19.s;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:129:0x023e, code lost:
                    
                        if (r0 == null) goto L112;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:130:0x0240, code lost:
                    
                        r0 = r0.edit();
                        r0.putString("policy", r1);
                        r0.apply();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:133:0x0252, code lost:
                    
                        r1 = r19;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:134:0x025b, code lost:
                    
                        com.majelw.libystne.MainActivity.q(r1, "server_response", r3, "success", r1, null, 16);
                        r1.runOnUiThread(new defpackage.k3(19, r1));
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:135:0x0268, code lost:
                    
                        r7.disconnect();
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:136:0x026b, code lost:
                    
                        r2 = false;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:139:0x0289, code lost:
                    
                        kotlin.jvm.internal.Intrinsics.f("prefs");
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:140:0x028e, code lost:
                    
                        throw null;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:141:0x0281, code lost:
                    
                        r0 = th;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:143:0x0283, code lost:
                    
                        r18 = r7;
                     */
                    /* JADX WARN: Finally extract failed */
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:101:0x02fa  */
                    /* JADX WARN: Removed duplicated region for block: B:104:0x0304 A[Catch: all -> 0x0167, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0167, blocks: (B:4:0x001c, B:7:0x0027, B:31:0x0160, B:92:0x031e, B:93:0x0321, B:104:0x0304, B:106:0x0307, B:135:0x0268), top: B:3:0x001c }] */
                    /* JADX WARN: Removed duplicated region for block: B:109:0x0313  */
                    /* JADX WARN: Removed duplicated region for block: B:112:0x0314 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:92:0x031e A[Catch: all -> 0x0167, TRY_ENTER, TryCatch #3 {all -> 0x0167, blocks: (B:4:0x001c, B:7:0x0027, B:31:0x0160, B:92:0x031e, B:93:0x0321, B:104:0x0304, B:106:0x0307, B:135:0x0268), top: B:3:0x001c }] */
                    /* JADX WARN: Type inference failed for: r17v10 */
                    /* JADX WARN: Type inference failed for: r17v12 */
                    /* JADX WARN: Type inference failed for: r17v16 */
                    /* JADX WARN: Type inference failed for: r17v17 */
                    /* JADX WARN: Type inference failed for: r17v8 */
                    /* JADX WARN: Type inference failed for: r17v9 */
                    /* JADX WARN: Type inference failed for: r2v26, types: [boolean] */
                    /* JADX WARN: Type inference failed for: r2v27 */
                    /* JADX WARN: Type inference failed for: r2v33 */
                    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        HttpURLConnection httpURLConnection;
                        String str5;
                        HttpURLConnection httpURLConnection2;
                        String message;
                        boolean z;
                        MainActivity mainActivity;
                        int i;
                        String str6;
                        MainActivity mainActivity2;
                        String str7;
                        MainActivity mainActivity3 = MainActivity.this;
                        String str8 = str;
                        String str9 = m;
                        String str10 = str2;
                        String str11 = str3;
                        String str12 = str4;
                        int i2 = MainActivity.w;
                        boolean z2 = false;
                        long j = 3000;
                        int i3 = 0;
                        while (true) {
                            int i4 = i3 + 1;
                            try {
                                if (!mainActivity3.o()) {
                                    mainActivity3.q = z2;
                                    return;
                                }
                                MainActivity.q(mainActivity3, "server_request", str8, "sent_attempt_" + i4, str9, null, 16);
                                try {
                                    URLConnection openConnection = new URL(str9).openConnection();
                                    openConnection.getClass();
                                    HttpURLConnection httpURLConnection3 = (HttpURLConnection) openConnection;
                                    httpURLConnection3.setRequestMethod("POST");
                                    httpURLConnection3.setDoInput(true);
                                    httpURLConnection3.setDoOutput(true);
                                    httpURLConnection3.setConnectTimeout(10000);
                                    httpURLConnection3.setReadTimeout(10000);
                                    try {
                                        try {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("campaign=");
                                            sb.append(URLEncoder.encode(str8, "UTF-8"));
                                            sb.append("&push_id=");
                                            String str13 = mainActivity3.o;
                                            if (str13.length() == 0) {
                                                try {
                                                    str13 = mainActivity3.n;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    httpURLConnection = httpURLConnection3;
                                                    if (httpURLConnection != null) {
                                                    }
                                                    throw th;
                                                }
                                            }
                                            try {
                                                sb.append(URLEncoder.encode(str13, "UTF-8"));
                                                sb.append("&user_id=");
                                                sb.append(URLEncoder.encode(mainActivity3.n, "UTF-8"));
                                                sb.append("&language=");
                                                sb.append(URLEncoder.encode(Locale.getDefault().getLanguage(), "UTF-8"));
                                                sb.append("&media_source=");
                                                sb.append(URLEncoder.encode(str10, "UTF-8"));
                                                sb.append("&adset=");
                                                sb.append(URLEncoder.encode(str11, "UTF-8"));
                                                sb.append("&ad=");
                                                sb.append(URLEncoder.encode(str12, "UTF-8"));
                                                String sb2 = sb.toString();
                                                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection3.getOutputStream());
                                                try {
                                                    outputStreamWriter.write(sb2);
                                                    outputStreamWriter.flush();
                                                    Unit unit = Unit.a;
                                                    outputStreamWriter.close();
                                                    int responseCode = httpURLConnection3.getResponseCode();
                                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((200 > responseCode || responseCode >= 300) ? httpURLConnection3.getErrorStream() : httpURLConnection3.getInputStream()));
                                                    try {
                                                        String obj = up2.K(yh2.r(bufferedReader)).toString();
                                                        bufferedReader.close();
                                                        Log.d("MADebug", "policy response attempt=" + i4 + " code=" + responseCode + " body=" + obj);
                                                        if (obj.length() == 0) {
                                                            mainActivity3.p("server_response", str8, "empty_response", str9, "EMPTY_RESPONSE");
                                                            z = false;
                                                            mainActivity3.t(false);
                                                            httpURLConnection3.disconnect();
                                                            break;
                                                        }
                                                        try {
                                                            char[] cArr = {'\"'};
                                                            int length = obj.length() - 1;
                                                            int i5 = 0;
                                                            ?? r17 = 0;
                                                            while (true) {
                                                                mainActivity = mainActivity3;
                                                                if (i5 > length) {
                                                                    i = length;
                                                                    str6 = str8;
                                                                    break;
                                                                }
                                                                try {
                                                                    try {
                                                                        char charAt = obj.charAt(r17 == 0 ? i5 : length);
                                                                        i = length;
                                                                        str6 = str8;
                                                                        int i6 = 0;
                                                                        while (true) {
                                                                            if (i6 >= 1) {
                                                                                i6 = -1;
                                                                                break;
                                                                            }
                                                                            try {
                                                                                if (charAt == cArr[i6]) {
                                                                                    break;
                                                                                } else {
                                                                                    i6++;
                                                                                }
                                                                            } catch (Exception e) {
                                                                                e = e;
                                                                                str7 = str9;
                                                                                str8 = str6;
                                                                                mainActivity3 = mainActivity;
                                                                                str5 = str7;
                                                                                httpURLConnection2 = httpURLConnection3;
                                                                                try {
                                                                                    Log.e("MADebug", "policy error attempt=" + i4 + ": " + e.getMessage());
                                                                                    StringBuilder sb3 = new StringBuilder();
                                                                                    sb3.append("exception_attempt_");
                                                                                    sb3.append(i4);
                                                                                    String sb4 = sb3.toString();
                                                                                    message = e.getMessage();
                                                                                    if (message == null) {
                                                                                    }
                                                                                    str9 = str5;
                                                                                    mainActivity3.p("server_response", str8, sb4, str9, message);
                                                                                    if (httpURLConnection2 != null) {
                                                                                    }
                                                                                    try {
                                                                                        Thread.sleep(j);
                                                                                        j *= 2;
                                                                                        if (j <= 30000) {
                                                                                        }
                                                                                        i3 = i4;
                                                                                        z2 = false;
                                                                                    } catch (InterruptedException unused) {
                                                                                        z = false;
                                                                                        mainActivity3.q = z;
                                                                                        return;
                                                                                    }
                                                                                } catch (Throwable th2) {
                                                                                    th = th2;
                                                                                    httpURLConnection = httpURLConnection2;
                                                                                    if (httpURLConnection != null) {
                                                                                        httpURLConnection.disconnect();
                                                                                    }
                                                                                    throw th;
                                                                                }
                                                                            }
                                                                        }
                                                                        boolean z3 = i6 >= 0;
                                                                        if (r17 == 0) {
                                                                            if (z3) {
                                                                                i5++;
                                                                                str8 = str6;
                                                                                mainActivity3 = mainActivity;
                                                                                length = i;
                                                                            } else {
                                                                                str8 = str6;
                                                                                mainActivity3 = mainActivity;
                                                                                length = i;
                                                                                r17 = 1;
                                                                            }
                                                                        } else {
                                                                            if (!z3) {
                                                                                break;
                                                                            }
                                                                            length = i - 1;
                                                                            str8 = str6;
                                                                            mainActivity3 = mainActivity;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        httpURLConnection2 = httpURLConnection3;
                                                                        httpURLConnection = httpURLConnection2;
                                                                        if (httpURLConnection != null) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Exception e2) {
                                                                    e = e2;
                                                                    str7 = str9;
                                                                }
                                                            }
                                                            String m2 = tp2.m(obj.subSequence(i5, i + 1).toString(), "\\/", "/");
                                                            str8 = null;
                                                            ?? o = tp2.o(m2, "http", false);
                                                            try {
                                                                if (o != 0) {
                                                                    break;
                                                                }
                                                                try {
                                                                    str8 = str6;
                                                                    mainActivity3 = mainActivity;
                                                                    try {
                                                                        mainActivity3.p("server_response", str8, "invalid_url", str9, "INVALID_URL: " + wp2.M(50, obj));
                                                                        mainActivity2 = mainActivity3;
                                                                        try {
                                                                            mainActivity2.t(false);
                                                                            try {
                                                                                httpURLConnection3.disconnect();
                                                                                mainActivity2.q = false;
                                                                                return;
                                                                            } catch (Throwable th4) {
                                                                                th = th4;
                                                                                mainActivity3 = mainActivity2;
                                                                                mainActivity3.q = false;
                                                                                throw th;
                                                                            }
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            httpURLConnection = httpURLConnection3;
                                                                            if (httpURLConnection != null) {
                                                                            }
                                                                            throw th;
                                                                        }
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        str5 = str9;
                                                                        httpURLConnection2 = httpURLConnection3;
                                                                        Log.e("MADebug", "policy error attempt=" + i4 + ": " + e.getMessage());
                                                                        StringBuilder sb32 = new StringBuilder();
                                                                        sb32.append("exception_attempt_");
                                                                        sb32.append(i4);
                                                                        String sb42 = sb32.toString();
                                                                        message = e.getMessage();
                                                                        if (message == null) {
                                                                        }
                                                                        str9 = str5;
                                                                        mainActivity3.p("server_response", str8, sb42, str9, message);
                                                                        if (httpURLConnection2 != null) {
                                                                        }
                                                                        Thread.sleep(j);
                                                                        j *= 2;
                                                                        if (j <= 30000) {
                                                                        }
                                                                        i3 = i4;
                                                                        z2 = false;
                                                                    } catch (Throwable th6) {
                                                                        th = th6;
                                                                        httpURLConnection = httpURLConnection3;
                                                                        if (httpURLConnection != null) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    r17 = str9;
                                                                    str8 = str6;
                                                                    o = mainActivity;
                                                                    mainActivity3 = o;
                                                                    str5 = r17;
                                                                    httpURLConnection2 = httpURLConnection3;
                                                                    Log.e("MADebug", "policy error attempt=" + i4 + ": " + e.getMessage());
                                                                    StringBuilder sb322 = new StringBuilder();
                                                                    sb322.append("exception_attempt_");
                                                                    sb322.append(i4);
                                                                    String sb422 = sb322.toString();
                                                                    message = e.getMessage();
                                                                    if (message == null) {
                                                                    }
                                                                    str9 = str5;
                                                                    mainActivity3.p("server_response", str8, sb422, str9, message);
                                                                    if (httpURLConnection2 != null) {
                                                                    }
                                                                    Thread.sleep(j);
                                                                    j *= 2;
                                                                    if (j <= 30000) {
                                                                    }
                                                                    i3 = i4;
                                                                    z2 = false;
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    mainActivity2 = mainActivity;
                                                                }
                                                            } catch (Exception e5) {
                                                                e = e5;
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                        }
                                                    } catch (Throwable th9) {
                                                        try {
                                                            throw th9;
                                                        } catch (Throwable th10) {
                                                            ll3.y(bufferedReader, th9);
                                                            throw th10;
                                                        }
                                                    }
                                                } catch (Throwable th11) {
                                                    try {
                                                        throw th11;
                                                    } catch (Throwable th12) {
                                                        ll3.y(outputStreamWriter, th11);
                                                        throw th12;
                                                    }
                                                }
                                            } catch (Exception e6) {
                                                e = e6;
                                                Log.e("MADebug", "policy error attempt=" + i4 + ": " + e.getMessage());
                                                StringBuilder sb3222 = new StringBuilder();
                                                sb3222.append("exception_attempt_");
                                                sb3222.append(i4);
                                                String sb4222 = sb3222.toString();
                                                message = e.getMessage();
                                                if (message == null) {
                                                    message = "unknown";
                                                }
                                                str9 = str5;
                                                mainActivity3.p("server_response", str8, sb4222, str9, message);
                                                if (httpURLConnection2 != null) {
                                                    httpURLConnection2.disconnect();
                                                }
                                                Thread.sleep(j);
                                                j *= 2;
                                                if (j <= 30000) {
                                                    j = 30000;
                                                }
                                                i3 = i4;
                                                z2 = false;
                                            }
                                        } catch (Exception e7) {
                                            e = e7;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    str5 = str9;
                                    httpURLConnection2 = null;
                                } catch (Throwable th14) {
                                    th = th14;
                                    httpURLConnection = null;
                                }
                                i3 = i4;
                                z2 = false;
                            } catch (Throwable th15) {
                                th = th15;
                            }
                        }
                    }
                }).start();
            } else {
                Log.d("MADebug", "ANALYTICS_HOST empty — going native");
                this.q = false;
                t(false);
            }
        }
    }

    public final boolean o() {
        SharedPreferences sharedPreferences = this.s;
        if (sharedPreferences == null) {
            Intrinsics.f("prefs");
            throw null;
        }
        String str = BuildConfig.FLAVOR;
        String string = sharedPreferences.getString("policy", BuildConfig.FLAVOR);
        if (string != null) {
            str = string;
        }
        return str.length() == 0;
    }

    @Override // defpackage.kr0, defpackage.xx, defpackage.wx, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object ba2Var;
        Object ba2Var2;
        Object ba2Var3;
        super.onCreate(bundle);
        try {
            aa2.a aVar = aa2.m;
            ba2Var = FirebaseAnalytics.getInstance(this);
        } catch (Throwable th) {
            aa2.a aVar2 = aa2.m;
            ba2Var = new ba2(th);
        }
        Throwable a = aa2.a(ba2Var);
        if (a != null) {
            Log.w("MADebug", "Firebase Analytics not configured: " + a.getMessage());
        }
        if (ba2Var instanceof ba2) {
            ba2Var = null;
        }
        this.t = (FirebaseAnalytics) ba2Var;
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("prefs", 0);
        sharedPreferences.getClass();
        this.s = sharedPreferences;
        Log.d("MADebug", "onCreate appId=com.majelw.libystne launcher=" + m(getIntent()));
        if (getSharedPreferences("template_session", 0).getBoolean("main_entered", false) && getSharedPreferences("template_session", 0).getBoolean("photo_pick_in_progress", false)) {
            Log.d("MADebug", "Photo-pick return — skip gate, open main");
            t(true);
            return;
        }
        if (m(getIntent())) {
            ij2.m(this, false);
            SharedPreferences sharedPreferences2 = getSharedPreferences("template_session", 0);
            sharedPreferences2.getClass();
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.putBoolean("photo_pick_in_progress", false);
            edit.commit();
        }
        try {
            FacebookSdk.setAutoLogAppEventsEnabled(true);
            ba2Var2 = Unit.a;
        } catch (Throwable th2) {
            aa2.a aVar3 = aa2.m;
            ba2Var2 = new ba2(th2);
        }
        Throwable a2 = aa2.a(ba2Var2);
        if (a2 != null) {
            Log.e("MADebug", "FacebookSdk", a2);
        }
        if (l()) {
            hf0.a(this);
            yx.a(this, z71.s);
            try {
                ba2Var3 = FirebaseMessaging.getInstance().getToken().b(new dh1(this));
            } catch (Throwable th3) {
                aa2.a aVar4 = aa2.m;
                ba2Var3 = new ba2(th3);
            }
            Throwable a3 = aa2.a(ba2Var3);
            if (a3 != null) {
                Log.w("MADebug", "FCM not configured: " + a3.getMessage());
            }
            if (Build.VERSION.SDK_INT >= 33 && checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1001);
            }
            k(getIntent());
            SharedPreferences sharedPreferences3 = this.s;
            if (sharedPreferences3 == null) {
                Intrinsics.f("prefs");
                throw null;
            }
            String str = BuildConfig.FLAVOR;
            String string = sharedPreferences3.getString("policy", BuildConfig.FLAVOR);
            if (string == null) {
                string = BuildConfig.FLAVOR;
            }
            if (string.length() > 0) {
                Log.d("MADebug", "Existing policy — opening welcome tab");
                s(this);
            }
            if (up2.K("2Asu9Dz7EzoefrpNVFQSDm").toString().length() <= 0) {
                if (string.length() == 0) {
                    Log.d("MADebug", "No AppsFlyer key — going native");
                    t(false);
                    return;
                }
                return;
            }
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            appsFlyerLib.init(up2.K("2Asu9Dz7EzoefrpNVFQSDm").toString(), this.v, this);
            appsFlyerLib.subscribeForDeepLink(new dh1(this));
            String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(this);
            if (appsFlyerUID != null) {
                str = appsFlyerUID;
            }
            this.n = str;
            q(this, "appsflyer_start", BuildConfig.FLAVOR, "started", null, null, 24);
            appsFlyerLib.start(this, up2.K("2Asu9Dz7EzoefrpNVFQSDm").toString(), this.u);
            return;
        }
        Log.d("MADebug", "No internet — showing Retry panel, init skipped");
        hf0.a(this);
        int color = getColor(R.color.brand_primary);
        int color2 = getColor(R.color.brand_on_primary);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setPadding(r(this, 32), r(this, 32), r(this, 32), r(this, 32));
        linearLayout.setBackgroundColor(getColor(R.color.white));
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.mipmap.ic_launcher);
        TextView textView = new TextView(this);
        textView.setText(getString(R.string.no_internet_title));
        textView.setTextSize(22.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        textView.setTextColor(-12968958);
        textView.setGravity(17);
        TextView textView2 = new TextView(this);
        textView2.setText(getString(R.string.no_internet_message));
        textView2.setTextSize(15.0f);
        textView2.setTextColor(-7706038);
        textView2.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(r(this, 28));
        gradientDrawable.setColor(color);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(r(this, 28));
        gradientDrawable2.setColor(-1);
        Button button = new Button(this);
        button.setText(getString(R.string.retry));
        button.setAllCaps(false);
        button.setTextSize(16.0f);
        button.setTextColor(color2);
        button.setStateListAnimator(null);
        button.setBackground(new RippleDrawable(ColorStateList.valueOf(872415231), gradientDrawable, gradientDrawable2));
        button.setPadding(r(this, 56), r(this, 14), r(this, 56), r(this, 14));
        button.setMinWidth(r(this, 200));
        button.setOnClickListener(new ja0(2, this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.width = r(this, 88);
        layoutParams.height = r(this, 88);
        layoutParams.bottomMargin = r(this, 24);
        Unit unit = Unit.a;
        linearLayout.addView(imageView, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = r(this, 8);
        linearLayout.addView(textView, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.bottomMargin = r(this, 28);
        linearLayout.addView(textView2, layoutParams3);
        linearLayout.addView(button, new LinearLayout.LayoutParams(-2, -2));
        setContentView(linearLayout);
    }

    @Override // defpackage.xx, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        k(intent);
    }

    @Override // defpackage.kr0, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.p) {
            this.p = false;
            s(this);
        }
    }

    public final void p(String str, String str2, String str3, String str4, String str5) {
        FirebaseAnalytics firebaseAnalytics = this.t;
        if (firebaseAnalytics == null) {
            return;
        }
        Bundle bundle = new Bundle();
        String str6 = this.n;
        if (str6.length() == 0) {
            str6 = "empty";
        }
        bundle.putString("user_id_aps", str6);
        if (str2.length() == 0) {
            str2 = "organic";
        }
        bundle.putString("campaign", str2);
        bundle.putString(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, str3);
        String M = wp2.M(60, str4);
        String M2 = wp2.M(60, wp2.L(60, str4));
        String M3 = wp2.M(60, wp2.L(120, str4));
        if (M.length() == 0) {
            M = "empty";
        }
        bundle.putString("request_url_1", M);
        if (M2.length() == 0) {
            M2 = "empty";
        }
        bundle.putString("request_url_2", M2);
        bundle.putString("request_url_3", M3.length() != 0 ? M3 : "empty");
        if (str5.length() > 0) {
            bundle.putString("error_message", wp2.M(100, str5));
        }
        firebaseAnalytics.logEvent(str, bundle);
    }

    public final void s(Activity activity) {
        SharedPreferences sharedPreferences = this.s;
        if (sharedPreferences == null) {
            Intrinsics.f("prefs");
            throw null;
        }
        String string = sharedPreferences.getString("policy", BuildConfig.FLAVOR);
        String str = string == null ? BuildConfig.FLAVOR : string;
        if (str.length() == 0) {
            t(false);
            return;
        }
        q(this, "welcome_screen_opened", BuildConfig.FLAVOR, "opened", str, null, 16);
        w50 w50Var = new w50(0, false);
        ((ar0) w50Var.c).n = -16777216;
        t21 a = w50Var.a();
        this.p = true;
        Uri parse = Uri.parse(str);
        Intent intent = (Intent) a.n;
        intent.setData(parse);
        activity.startActivity(intent, (Bundle) a.o);
    }

    public final void t(boolean z) {
        q(this, "welcome_screen_skipped", BuildConfig.FLAVOR, LoginLogger.EVENT_PARAM_METHOD_RESULT_SKIPPED, null, z ? "open_main" : "no_policy", 8);
        runOnUiThread(new em0(2, this, z));
    }
}
