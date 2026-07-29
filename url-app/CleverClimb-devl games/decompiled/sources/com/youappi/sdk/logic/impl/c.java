package com.youappi.sdk.logic.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationProvider;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.mopub.common.GpsHelper;
import com.mopub.mobileads.GooglePlayServicesInterstitial;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.YouAPPi;
import com.youappi.sdk.logic.Logger;
import com.youappi.sdk.net.model.ProductRequestItem;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public class c implements LocationListener {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9441a = "c";

    /* renamed from: b, reason: collision with root package name */
    private static final String f9442b = c.class.getSimpleName() + ".device";

    /* renamed from: c, reason: collision with root package name */
    private static final String f9443c = f9442b + ".uuid";

    /* renamed from: d, reason: collision with root package name */
    private final Context f9444d;
    private final Logger e;
    private String f;
    private Throwable g;
    private String h;
    private String i;
    private Location j;
    private String k;
    private boolean l;
    private boolean m;
    private List<BaseAd.a> n = new LinkedList();

    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private Context f9446b;

        a(Context context) {
            this.f9446b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c.this.f = WebSettings.getDefaultUserAgent(this.f9446b);
            } catch (Throwable th) {
                c.this.a(th);
            }
            this.f9446b = null;
            c.this.t();
        }
    }

    public c(Context context, Logger logger) {
        this.f9444d = context;
        this.e = logger;
        a(this.f9444d);
        this.i = r();
        n();
    }

    private void a(Context context) {
        s();
        if (this.f != null) {
            t();
        } else if (Build.VERSION.SDK_INT >= 17) {
            c(context);
        } else {
            b(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Throwable th) {
        this.f = null;
        this.g = th;
        this.e.logException(6, f9441a, th);
        Log.w(f9441a, "Failed obtaining user agent from device", th);
    }

    private void b(Context context) {
        try {
            this.f = new WebView(context).getSettings().getUserAgentString();
        } catch (Throwable th) {
            a(th);
        }
        t();
    }

    private void c(Context context) {
        new Thread(new a(context)).start();
    }

    private String o() {
        if (this.k == null) {
            SharedPreferences sharedPreferences = this.f9444d.getSharedPreferences(f9442b, 0);
            this.k = sharedPreferences.getString(f9443c, null);
            if (this.k == null) {
                this.k = UUID.randomUUID().toString();
                sharedPreferences.edit().putString(f9443c, this.k).apply();
            }
        }
        return this.k;
    }

    private void p() {
        if (f()) {
            Iterator<BaseAd.a> it = this.n.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            this.n.clear();
        }
    }

    private String q() {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            Object invoke = cls.getMethod("getAdvertisingIdInfo", Context.class).invoke(cls, this.f9444d);
            Method method = invoke.getClass().getMethod("getId", new Class[0]);
            Method method2 = invoke.getClass().getMethod(GpsHelper.IS_LIMIT_AD_TRACKING_ENABLED_KEY, new Class[0]);
            String obj = method.invoke(invoke, new Object[0]).toString();
            ((Boolean) method2.invoke(invoke, new Object[0])).booleanValue();
            return obj;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006d A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0070 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String r() {
        if (Build.VERSION.SDK_INT >= 13) {
            return (this.f9444d.getResources().getConfiguration().uiMode & 15) == 4 ? ProductRequestItem.Device.TYPE_TV : this.f9444d.getResources().getConfiguration().smallestScreenWidthDp >= 600 ? ProductRequestItem.Device.TYPE_TABLET : ProductRequestItem.Device.TYPE_PHONE;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) this.f9444d.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        double d2 = i;
        double d3 = displayMetrics.densityDpi;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = i2;
        Double.isNaN(d4);
        Double.isNaN(d3);
        if (Math.sqrt(Math.pow(d2 / d3, 2.0d) + Math.pow(d4 / d3, 2.0d)) > 6.0d) {
        }
    }

    private void s() {
        try {
            this.f = System.getProperty("http.agent");
        } catch (Exception e) {
            a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        synchronized (this) {
            this.m = true;
            p();
        }
    }

    public String a() {
        String str = this.h;
        return (str == null || YouAPPi.getInstance().isRestrictedUser()) ? o() : str;
    }

    public void a(BaseAd.a aVar) {
        synchronized (this) {
            this.n.add(aVar);
            p();
        }
    }

    public int b() {
        return this.f9444d.getResources().getConfiguration().orientation;
    }

    public String c() {
        return Locale.getDefault().getLanguage();
    }

    public String d() {
        if (this.h != null && !YouAPPi.getInstance().isRestrictedUser()) {
            return "gaid";
        }
        if (this.k == null) {
            this.k = o();
        }
        return "generated";
    }

    public void e() {
        Exception exc;
        String str;
        Exception e = null;
        try {
            str = q();
            exc = null;
        } catch (Exception e2) {
            exc = e2;
            str = null;
        }
        if (str == null) {
            try {
                str = com.youappi.sdk.utils.a.a(this.f9444d).a();
            } catch (Exception e3) {
                e = e3;
            }
        }
        if (exc != null && e != null) {
            this.e.log(5, YouAPPi.class.getSimpleName(), "Failed to fetch advertising id. It is recommended to add \"Google Play Services: Google Mobile Ads\" to your project.\n First Exception : " + exc.getMessage() + "\nSecond Exception : " + e.getMessage());
        }
        this.h = str;
        synchronized (this) {
            this.l = true;
            p();
        }
    }

    public boolean f() {
        boolean z;
        synchronized (this) {
            z = this.l && this.m;
        }
        return z;
    }

    public String g() {
        return Build.DEVICE;
    }

    public int h() {
        return Build.VERSION.SDK_INT;
    }

    public String i() {
        return Build.MODEL;
    }

    public String j() {
        return this.f;
    }

    public Throwable k() {
        return this.g;
    }

    public String l() {
        return this.i;
    }

    public Location m() {
        return this.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[Catch: Throwable -> 0x007a, TryCatch #0 {Throwable -> 0x007a, blocks: (B:2:0x0000, B:4:0x0011, B:7:0x001c, B:10:0x0028, B:12:0x003c, B:13:0x003e, B:14:0x0048, B:16:0x004e, B:34:0x0066, B:38:0x0076, B:44:0x002f, B:18:0x0054, B:25:0x005d), top: B:1:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: Throwable -> 0x007a, TRY_LEAVE, TryCatch #0 {Throwable -> 0x007a, blocks: (B:2:0x0000, B:4:0x0011, B:7:0x001c, B:10:0x0028, B:12:0x003c, B:13:0x003e, B:14:0x0048, B:16:0x004e, B:34:0x0066, B:38:0x0076, B:44:0x002f, B:18:0x0054, B:25:0x005d), top: B:1:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[Catch: Throwable -> 0x007a, TRY_LEAVE, TryCatch #0 {Throwable -> 0x007a, blocks: (B:2:0x0000, B:4:0x0011, B:7:0x001c, B:10:0x0028, B:12:0x003c, B:13:0x003e, B:14:0x0048, B:16:0x004e, B:34:0x0066, B:38:0x0076, B:44:0x002f, B:18:0x0054, B:25:0x005d), top: B:1:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void n() {
        Location lastKnownLocation;
        String str;
        String str2;
        try {
            LocationManager locationManager = (LocationManager) this.f9444d.getSystemService(GooglePlayServicesInterstitial.LOCATION_KEY);
            if (Build.VERSION.SDK_INT >= 23 && this.f9444d.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) {
                if (this.f9444d.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                    str = "network";
                    lastKnownLocation = locationManager.getLastKnownLocation(str);
                    if (lastKnownLocation != null) {
                        this.j = lastKnownLocation;
                    }
                    str2 = null;
                    for (String str3 : locationManager.getProviders(true)) {
                        try {
                            LocationProvider provider = locationManager.getProvider(str3);
                            if (provider != null) {
                                if (str2 == null) {
                                    str2 = str3;
                                }
                                if (provider.getAccuracy() == 1) {
                                    str2 = str3;
                                }
                            }
                        } catch (Throwable th) {
                            Log.i(YouAPPi.class.getSimpleName(), Log.getStackTraceString(th));
                        }
                    }
                    if (str2 != null) {
                        locationManager.requestSingleUpdate(str2, this, (Looper) null);
                        return;
                    }
                    return;
                }
                lastKnownLocation = null;
                if (lastKnownLocation != null) {
                }
                str2 = null;
                while (r2.hasNext()) {
                }
                if (str2 != null) {
                }
            }
            lastKnownLocation = locationManager.getLastKnownLocation("gps");
            if (lastKnownLocation == null) {
                str = "network";
                lastKnownLocation = locationManager.getLastKnownLocation(str);
            }
            if (lastKnownLocation != null) {
            }
            str2 = null;
            while (r2.hasNext()) {
            }
            if (str2 != null) {
            }
        } catch (Throwable th2) {
            Log.i(YouAPPi.class.getSimpleName(), Log.getStackTraceString(th2));
        }
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (location != null) {
            this.j = location;
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
