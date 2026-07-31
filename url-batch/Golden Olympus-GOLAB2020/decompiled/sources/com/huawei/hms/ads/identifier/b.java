package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import com.huawei.hms.ads.identifier.e;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f13881a = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.huawei.hwid.pps.apiprovider").path("/oaid_scp/get").build();

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f13882b = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.huawei.hwid.pps.apiprovider").path("/oaid/query").build();

    static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e.b f13883b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13884c;

        a(e.b bVar, Context context) {
            this.f13883b = bVar;
            this.f13884c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f13883b.g()) {
                Log.d("InfoProviderUtil", "within key update interval.");
                return;
            }
            this.f13883b.d();
            this.f13883b.c(b.f(this.f13884c));
        }
    }

    /* renamed from: com.huawei.hms.ads.identifier.b$b, reason: collision with other inner class name */
    static class RunnableC0135b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f13885b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e.b f13886c;

        RunnableC0135b(Context context, e.b bVar) {
            this.f13885b = context;
            this.f13886c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f13886c.c(b.f(this.f13885b));
        }
    }

    public static AdvertisingIdClient.Info a(Context context) {
        if (context == null || !b(context, f13881a)) {
            return null;
        }
        String string = Settings.Global.getString(context.getContentResolver(), "pps_oaid_c");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        e.b a4 = e.b.a(context);
        String b4 = a4.b();
        if (TextUtils.isEmpty(b4)) {
            Log.d("InfoProviderUtil", "scp is empty");
            f.f13902a.execute(new a(a4, context));
            if (a4.j()) {
                return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
            }
            a4.h();
            return null;
        }
        String b5 = e.b(string, b4);
        if (!TextUtils.isEmpty(b5)) {
            return new AdvertisingIdClient.Info(b5, "00000000-0000-0000-0000-000000000000".equalsIgnoreCase(b5));
        }
        Log.d("InfoProviderUtil", "decrypt oaid failed.");
        f.f13902a.execute(new RunnableC0135b(context, a4));
        return null;
    }

    private static boolean b(Context context, Uri uri) {
        Integer e4;
        if (context == null || uri == null || (e4 = f.e(context)) == null || 30462100 > e4.intValue()) {
            return false;
        }
        return f.d(context, uri);
    }

    public static AdvertisingIdClient.Info c(Context context) {
        if (context == null || !d(context)) {
            return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
        }
        try {
            Cursor query = context.getContentResolver().query(f13882b, null, null, null, null);
            if (query != null && query.moveToFirst()) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow(CommonUrlParts.HUAWEI_OAID);
                int columnIndexOrThrow2 = query.getColumnIndexOrThrow("limit_track");
                String string = query.getString(columnIndexOrThrow);
                AdvertisingIdClient.Info info = new AdvertisingIdClient.Info(string, "00000000-0000-0000-0000-000000000000".equalsIgnoreCase(string) ? true : Boolean.valueOf(query.getString(columnIndexOrThrow2)).booleanValue());
                f.b(query);
                return info;
            }
            AdvertisingIdClient.Info info2 = new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
            f.b(query);
            return info2;
        } catch (Throwable th) {
            try {
                Log.w("InfoProviderUtil", "query oaid via provider ex: " + th.getClass().getSimpleName());
                f.b(null);
                return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
            } catch (Throwable th2) {
                f.b(null);
                throw th2;
            }
        }
    }

    public static boolean d(Context context) {
        return b(context, f13882b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String f(Context context) {
        if (context == null) {
            return "";
        }
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(f13881a, null, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                return cursor.getString(cursor.getColumnIndexOrThrow("op_wk"));
            }
            return "";
        } catch (Throwable th) {
            try {
                Log.w("InfoProviderUtil", "get remote key ex: " + th.getClass().getSimpleName());
                return "";
            } finally {
                f.b(cursor);
            }
        }
    }
}
