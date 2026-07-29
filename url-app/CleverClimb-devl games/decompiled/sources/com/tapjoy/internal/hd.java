package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import com.tapjoy.TapjoyConnectFlag;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.internal.ev;
import com.tapjoy.internal.fb;
import com.tapjoy.internal.ff;
import com.tapjoy.internal.fi;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class hd {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8259a = UUID.randomUUID().toString();

    /* renamed from: d, reason: collision with root package name */
    private static hd f8260d;

    /* renamed from: b, reason: collision with root package name */
    public final fi.a f8261b;

    /* renamed from: c, reason: collision with root package name */
    public final hk f8262c;
    private final fb.a e;
    private final ev.a f;
    private final Context g;

    public static synchronized hd a(Context context) {
        hd hdVar;
        synchronized (hd.class) {
            if (f8260d == null) {
                f8260d = new hd(context, hk.a(context));
            }
            hdVar = f8260d;
        }
        return hdVar;
    }

    private hd(Context context, hk hkVar) {
        ho.a();
        this.e = new fb.a();
        this.f = new ev.a();
        this.f8261b = new fi.a();
        this.e.p = "12.3.1/Android";
        this.e.g = "Android";
        this.e.h = Build.VERSION.RELEASE;
        this.e.e = Build.MANUFACTURER;
        this.e.f = Build.MODEL;
        this.e.l = Locale.getDefault().toString();
        this.e.m = TimeZone.getDefault().getID();
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        fb.a aVar = this.e;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        File file = new File(ha.c(applicationContext), "deviceid");
        String string = sharedPreferences.getString(TapjoyConstants.PREF_ANALYTICS_ID, null);
        if (jr.c(string)) {
            String b2 = file.exists() ? jr.b(bg.a(file)) : null;
            string = b2 == null ? UUID.randomUUID().toString() : b2;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(TapjoyConstants.PREF_ANALYTICS_ID, string);
            edit.apply();
        }
        aVar.f8068d = string;
        if (!gb.b().b(TapjoyConnectFlag.DISABLE_ANDROID_ID_AS_ANALYTICS_ID)) {
            fb.a aVar2 = this.e;
            String string2 = Settings.Secure.getString(applicationContext.getContentResolver(), TapjoyConstants.TJC_ANDROID_ID);
            aVar2.t = !"9774d56d682e549c".equals(string2) ? jr.b(string2) : null;
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (!jr.c(simCountryIso)) {
                this.e.q = simCountryIso.toUpperCase(Locale.US);
            }
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!jr.c(networkCountryIso)) {
                this.e.r = networkCountryIso.toUpperCase(Locale.US);
            }
        }
        String packageName = applicationContext.getPackageName();
        this.e.n = packageName;
        fb.a aVar3 = this.e;
        Signature[] e = z.e(packageManager, packageName);
        aVar3.o = jr.a((e == null || e.length <= 0) ? null : Base64.encodeToString(ch.a(e[0].toByteArray()), 2));
        this.f.f8042c = z.a(packageManager, packageName);
        this.f.f8043d = Integer.valueOf(z.b(packageManager, packageName));
        String installerPackageName = packageManager.getInstallerPackageName(packageName);
        if (!jr.c(installerPackageName)) {
            this.f.f = installerPackageName;
        }
        String a2 = a(packageManager, packageName);
        if (!jr.c(a2)) {
            this.f.g = a2;
        }
        a();
        this.f8262c = hkVar;
        String a3 = this.f8262c.f8288c.a();
        if (a3 != null && a3.length() > 0) {
            this.e.p = a3 + " 12.3.1/Android";
        }
        String b3 = this.f8262c.b();
        if (b3 != null) {
            this.f8261b.f8094d = b3;
        }
        fi.a aVar4 = this.f8261b;
        hk hkVar2 = this.f8262c;
        long j = hkVar2.f8287b.getLong("it", 0L);
        if (j == 0) {
            Context context2 = hkVar2.f8286a;
            j = z.c(context2.getPackageManager(), context2.getPackageName());
            if (j == 0) {
                j = ha.d(hkVar2.f8286a).lastModified();
                if (j == 0) {
                    Context context3 = hkVar2.f8286a;
                    j = new File(z.d(context3.getPackageManager(), context3.getPackageName())).lastModified();
                    if (j == 0) {
                        j = System.currentTimeMillis();
                    }
                }
            }
            hkVar2.f8287b.edit().putLong("it", j).apply();
        }
        aVar4.f8093c = Long.valueOf(j);
        int b4 = this.f8262c.f.b();
        this.f8261b.e = Integer.valueOf(a(7, b4));
        this.f8261b.f = Integer.valueOf(a(30, b4));
        int b5 = this.f8262c.h.b();
        if (b5 > 0) {
            this.f8261b.h = Integer.valueOf(b5);
        }
        long a4 = this.f8262c.i.a();
        if (a4 > 0) {
            this.f8261b.i = Long.valueOf(a4);
        }
        long a5 = this.f8262c.j.a();
        if (a5 > 0) {
            this.f8261b.j = Long.valueOf(a5);
        }
        long a6 = this.f8262c.k.a();
        if (a6 > 0) {
            this.f8261b.k = Long.valueOf(a6);
        }
        String a7 = this.f8262c.l.a();
        if (a7 != null) {
            this.f8261b.l = a7;
        }
        int b6 = this.f8262c.m.b();
        if (b6 > 0) {
            this.f8261b.m = Integer.valueOf(b6);
        }
        double a8 = this.f8262c.n.a();
        if (a8 != 0.0d) {
            this.f8261b.n = Double.valueOf(a8);
        }
        long a9 = this.f8262c.o.a();
        if (a9 > 0) {
            this.f8261b.o = Long.valueOf(a9);
        }
        double a10 = this.f8262c.p.a();
        if (a10 != 0.0d) {
            this.f8261b.p = Double.valueOf(a10);
        }
        String a11 = this.f8262c.g.a();
        if (a11 != null) {
            try {
                fg fgVar = (fg) fg.f8085c.a(Base64.decode(a11, 2));
                this.f8261b.g.clear();
                this.f8261b.g.addAll(fgVar.f8086d);
            } catch (IOException unused) {
                this.f8262c.g.c();
            } catch (IllegalArgumentException unused2) {
                this.f8262c.g.c();
            }
        }
        this.f.e = this.f8262c.q.a();
        this.f8261b.s = this.f8262c.r.a();
        int intValue = this.f8262c.s.a().intValue();
        this.f8261b.t = intValue != -1 ? Integer.valueOf(intValue) : null;
        int intValue2 = this.f8262c.t.a().intValue();
        this.f8261b.u = intValue2 != -1 ? Integer.valueOf(intValue2) : null;
        this.f8261b.v = this.f8262c.u.a();
        this.f8261b.w = this.f8262c.v.a();
        this.f8261b.x = this.f8262c.w.a();
        this.f8261b.y = this.f8262c.x.a();
        this.f8261b.z = this.f8262c.y.a();
        String a12 = this.f8262c.z.a();
        if (a12 != null) {
            try {
                fh fhVar = (fh) fh.f8088c.a(Base64.decode(a12, 2));
                this.f8261b.A.clear();
                this.f8261b.A.addAll(fhVar.f8089d);
            } catch (IOException unused3) {
                this.f8262c.z.c();
            } catch (IllegalArgumentException unused4) {
                this.f8262c.z.c();
            }
        }
        String a13 = this.f8262c.A.a();
        boolean booleanValue = this.f8262c.B.a().booleanValue();
        if (a13 != null) {
            this.f8261b.q = a13;
            this.f8261b.r = Boolean.valueOf(booleanValue);
        } else {
            this.f8261b.q = null;
            this.f8261b.r = null;
        }
        this.f8261b.B = this.f8262c.C.a();
    }

    private static String a(PackageManager packageManager, String str) {
        Object obj;
        try {
            Bundle bundle = packageManager.getApplicationInfo(str, 128).metaData;
            if (bundle == null || (obj = bundle.get("com.tapjoy.appstore")) == null) {
                return null;
            }
            return obj.toString().trim();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    final void a() {
        Window window;
        synchronized (this) {
            try {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) this.g.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                Activity a2 = gs.a();
                if (a2 != null && (window = a2.getWindow()) != null) {
                    int i = displayMetrics.heightPixels;
                    Rect rect = new Rect();
                    window.getDecorView().getWindowVisibleDisplayFrame(rect);
                    displayMetrics.heightPixels = i - rect.top;
                }
                this.e.i = Integer.valueOf(displayMetrics.densityDpi);
                this.e.j = Integer.valueOf(displayMetrics.widthPixels);
                this.e.k = Integer.valueOf(displayMetrics.heightPixels);
            } catch (Exception unused) {
            }
        }
    }

    public final fc b() {
        fc fcVar;
        synchronized (this) {
            this.e.l = Locale.getDefault().toString();
            this.e.m = TimeZone.getDefault().getID();
            boolean z = false;
            long currentTimeMillis = System.currentTimeMillis() - 259200000;
            Iterator it = this.f8261b.g.iterator();
            while (it.hasNext()) {
                if (((ff) it.next()).g.longValue() <= currentTimeMillis) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                g();
            }
            fcVar = new fc(this.e.b(), this.f.b(), this.f8261b.b());
        }
        return fcVar;
    }

    final String c() {
        String a2;
        synchronized (this) {
            a2 = this.f8262c.f8289d.a();
        }
        return a2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00dc  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final fd d() {
        Calendar calendar;
        long timeInMillis;
        int i;
        fd fdVar;
        synchronized (this) {
            Calendar calendar2 = Calendar.getInstance();
            int i2 = 1;
            int i3 = (calendar2.get(1) * 10000) + (calendar2.get(2) * 100) + 100 + calendar2.get(5);
            int intValue = this.f8262c.e.a().intValue();
            if (intValue == i3) {
                return null;
            }
            if (intValue == 0) {
                this.f8261b.e = 1;
                this.f8261b.f = 1;
                fdVar = new fd("fq7_0_1", "fq30_0_1", null);
            } else {
                int intValue2 = this.f8262c.f.a().intValue();
                int a2 = a(7, intValue2);
                int a3 = a(30, intValue2);
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(intValue / 10000, ((intValue / 100) % 100) - 1, intValue % 100);
                int signum = Integer.signum(calendar2.get(1) - calendar3.get(1));
                if (signum == -1) {
                    calendar = (Calendar) calendar3.clone();
                    calendar.set(calendar2.get(1), calendar2.get(2), calendar2.get(5));
                    timeInMillis = calendar3.getTimeInMillis();
                } else if (signum != 1) {
                    i = calendar2.get(6) - calendar3.get(6);
                    i2 = 1 | (Math.abs(i) < 30 ? 0 : i >= 0 ? intValue2 << i : intValue2 >> (-i));
                    int a4 = a(7, i2);
                    int a5 = a(30, i2);
                    this.f8261b.e = Integer.valueOf(a4);
                    this.f8261b.f = Integer.valueOf(a5);
                    fdVar = new fd("fq7_" + a2 + "_" + a4, "fq30_" + a3 + "_" + a5, null);
                } else {
                    calendar = (Calendar) calendar2.clone();
                    calendar.set(calendar3.get(1), calendar3.get(2), calendar3.get(5));
                    timeInMillis = calendar2.getTimeInMillis();
                }
                i = 0;
                while (calendar.getTimeInMillis() < timeInMillis) {
                    calendar.add(5, 1);
                    i++;
                }
                if (signum <= 0) {
                    i = -i;
                }
                i2 = 1 | (Math.abs(i) < 30 ? 0 : i >= 0 ? intValue2 << i : intValue2 >> (-i));
                int a42 = a(7, i2);
                int a52 = a(30, i2);
                this.f8261b.e = Integer.valueOf(a42);
                this.f8261b.f = Integer.valueOf(a52);
                fdVar = new fd("fq7_" + a2 + "_" + a42, "fq30_" + a3 + "_" + a52, null);
            }
            this.f8262c.e.a(i3);
            this.f8262c.f.a(i2);
            return fdVar;
        }
    }

    private static int a(int i, int i2) {
        return Integer.bitCount(((1 << i) - 1) & i2);
    }

    final boolean a(String str, long j, boolean z) {
        synchronized (this) {
            int size = this.f8261b.g.size();
            for (int i = 0; i < size; i++) {
                ff ffVar = (ff) this.f8261b.g.get(i);
                if (ffVar.f.equals(str)) {
                    if (!z) {
                        return false;
                    }
                    ff.a b2 = ffVar.b();
                    b2.f8084d = Long.valueOf(j);
                    this.f8261b.g.set(i, b2.b());
                    return true;
                }
            }
            this.f8261b.g.add(new ff(str, Long.valueOf(j)));
            g();
            return true;
        }
    }

    private void g() {
        this.f8262c.g.a(Base64.encodeToString(fg.f8085c.b(new fg(this.f8261b.g)), 2));
    }

    public final boolean a(String str) {
        boolean z;
        synchronized (this) {
            this.f8262c.q.a(str);
            z = true;
            if (str != null) {
                z = true ^ jp.a(this.f.e, str);
                this.f.e = str;
            } else {
                if (this.f.e == null) {
                    z = false;
                }
                this.f.e = null;
            }
        }
        return z;
    }

    public final boolean b(String str) {
        boolean z;
        synchronized (this) {
            this.f8262c.r.a(str);
            z = !jp.a(this.f8261b.s, str);
            if (z) {
                this.f8261b.s = str;
            }
        }
        return z;
    }

    public final boolean a(Integer num) {
        boolean z;
        synchronized (this) {
            this.f8262c.s.a(num);
            z = !jp.a(this.f8261b.t, num);
            if (z) {
                this.f8261b.t = num;
            }
        }
        return z;
    }

    public final boolean b(Integer num) {
        boolean z;
        synchronized (this) {
            this.f8262c.t.a(num);
            z = !jp.a(this.f8261b.u, num);
            if (z) {
                this.f8261b.u = num;
            }
        }
        return z;
    }

    public final boolean a(int i, String str) {
        boolean z;
        synchronized (this) {
            z = false;
            switch (i) {
                case 1:
                    this.f8262c.u.a(str);
                    z = !jp.a(this.f8261b.v, str);
                    if (z) {
                        this.f8261b.v = str;
                        break;
                    }
                    break;
                case 2:
                    this.f8262c.v.a(str);
                    z = !jp.a(this.f8261b.w, str);
                    if (z) {
                        this.f8261b.w = str;
                        break;
                    }
                    break;
                case 3:
                    this.f8262c.w.a(str);
                    z = !jp.a(this.f8261b.x, str);
                    if (z) {
                        this.f8261b.x = str;
                        break;
                    }
                    break;
                case 4:
                    this.f8262c.x.a(str);
                    z = !jp.a(this.f8261b.y, str);
                    if (z) {
                        this.f8261b.y = str;
                        break;
                    }
                    break;
                case 5:
                    this.f8262c.y.a(str);
                    z = !jp.a(this.f8261b.z, str);
                    if (z) {
                        this.f8261b.z = str;
                        break;
                    }
                    break;
            }
        }
        return z;
    }

    public final Set e() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f8261b.A);
        }
        return hashSet;
    }

    public final boolean c(String str) {
        synchronized (this) {
            for (int size = this.f8261b.g.size() - 1; size >= 0; size--) {
                ff ffVar = (ff) this.f8261b.g.get(size);
                if (ffVar.f.equals(str)) {
                    ff.a b2 = ffVar.b();
                    b2.e = Long.valueOf(System.currentTimeMillis());
                    this.f8261b.g.set(size, b2.b());
                    g();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean f() {
        return ((Boolean) jp.b(this.f8261b.B, fi.r)).booleanValue();
    }

    public final boolean a(boolean z) {
        boolean z2;
        synchronized (this) {
            this.f8262c.C.a(z);
            z2 = z != ((Boolean) jp.b(this.f8261b.B, fi.r)).booleanValue();
            this.f8261b.B = Boolean.valueOf(z);
        }
        return z2;
    }
}
