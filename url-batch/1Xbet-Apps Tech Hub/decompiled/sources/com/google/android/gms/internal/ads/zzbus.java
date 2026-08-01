package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.core.os.EnvironmentCompat;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbus implements zzbuu {
    static zzbuu zza;
    static zzbuu zzb;
    private static final Object zzc = new Object();
    private final Context zze;
    private final ExecutorService zzg;
    private final zzcbt zzh;
    private final Object zzd = new Object();
    private final WeakHashMap zzf = new WeakHashMap();

    protected zzbus(Context context, zzcbt zzcbtVar) {
        zzfqu.zza();
        this.zzg = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.zze = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zzh = zzcbtVar;
    }

    public static zzbuu zza(Context context) {
        synchronized (zzc) {
            if (zza == null) {
                if (((Boolean) zzbfe.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhF)).booleanValue()) {
                        zza = new zzbus(context, zzcbt.zza());
                    }
                }
                zza = new zzbut();
            }
        }
        return zza;
    }

    public static zzbuu zzb(Context context, zzcbt zzcbtVar) {
        synchronized (zzc) {
            if (zzb == null) {
                if (((Boolean) zzbfe.zze.zze()).booleanValue()) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzhF)).booleanValue()) {
                        zzbus zzbusVar = new zzbus(context, zzcbtVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (zzbusVar.zzd) {
                                zzbusVar.zzf.put(thread, true);
                            }
                            thread.setUncaughtExceptionHandler(new zzbur(zzbusVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new zzbuq(zzbusVar, Thread.getDefaultUncaughtExceptionHandler()));
                        zzb = zzbusVar;
                    }
                }
                zzb = new zzbut();
            }
        }
        return zzb;
    }

    public static String zzc(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String zzd(Throwable th) {
        return zzfun.zzc(zzcbg.zzf(zzc(th)));
    }

    protected final void zze(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= zzcbg.zzo(stackTraceElement.getClassName());
                    z2 |= getClass().getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            zzg(th, "", 1.0f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuu
    public final void zzf(Throwable th, String str) {
        zzg(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.zzbuu
    public final void zzg(Throwable th, String str, float f) {
        Throwable th2;
        String str2;
        Handler handler = zzcbg.zza;
        boolean z = false;
        if (((Boolean) zzbfe.zzf.zze()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzcbg.zzo(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z2) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String zzc2 = zzc(th);
        String zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziE)).booleanValue() ? zzd(th) : "";
        double d = f;
        double random = Math.random();
        int i = f > 0.0f ? (int) (1.0f / f) : 1;
        if (random < d) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                z = Wrappers.packageManager(this.zze).isCallerInstantApp();
            } catch (Throwable th5) {
                zzcbn.zzh("Error fetching instant app info", th5);
            }
            try {
                str2 = this.zze.getPackageName();
            } catch (Throwable unused) {
                zzcbn.zzj("Cannot obtain package name, proceeding.");
                str2 = EnvironmentCompat.MEDIA_UNKNOWN;
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter(FacebookMediationAdapter.KEY_ID, "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = str3 + " " + str4;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.zzh.zza).appendQueryParameter("appid", str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", zzc2).appendQueryParameter("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "579009612").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(zzbfe.zzc.zze())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze))).appendQueryParameter("lite", true != this.zzh.zze ? "0" : "1");
            if (!TextUtils.isEmpty(zzd)) {
                appendQueryParameter2.appendQueryParameter("hash", zzd);
            }
            arrayList2.add(appendQueryParameter2.toString());
            for (final String str5 : arrayList2) {
                final zzcbs zzcbsVar = new zzcbs(null);
                this.zzg.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbup
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbs.this.zza(str5);
                    }
                });
            }
        }
    }
}
