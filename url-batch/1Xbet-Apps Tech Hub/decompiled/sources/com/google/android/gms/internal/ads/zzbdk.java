package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbdk {
    String zzd;
    Context zze;
    String zzf;
    private AtomicBoolean zzh;
    private File zzi;
    final BlockingQueue zza = new ArrayBlockingQueue(100);
    final LinkedHashMap zzb = new LinkedHashMap();
    final Map zzc = new HashMap();
    private final HashSet zzg = new HashSet(Arrays.asList("noop", "activeViewPingSent", "viewabilityChanged", "visibilityChanged"));

    public static /* synthetic */ void zzc(zzbdk zzbdkVar) {
        while (true) {
            try {
                zzbdu zzbduVar = (zzbdu) zzbdkVar.zza.take();
                zzbdt zza = zzbduVar.zza();
                if (!TextUtils.isEmpty(zza.zzb())) {
                    zzbdkVar.zzg(zzbdkVar.zzb(zzbdkVar.zzb, zzbduVar.zzb()), zza);
                }
            } catch (InterruptedException e) {
                zzcbn.zzk("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    private final void zzg(Map map, zzbdt zzbdtVar) {
        FileOutputStream fileOutputStream;
        Uri.Builder buildUpon = Uri.parse(this.zzd).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String uri = buildUpon.build().toString();
        if (zzbdtVar != null) {
            StringBuilder sb = new StringBuilder(uri);
            if (!TextUtils.isEmpty(zzbdtVar.zzb())) {
                sb.append("&it=");
                sb.append(zzbdtVar.zzb());
            }
            if (!TextUtils.isEmpty(zzbdtVar.zza())) {
                sb.append("&blat=");
                sb.append(zzbdtVar.zza());
            }
            uri = sb.toString();
        }
        if (!this.zzh.get()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzK(this.zze, this.zzf, uri);
            return;
        }
        File file = this.zzi;
        if (file == null) {
            zzcbn.zzj("CsiReporter: File doesn't exist. Cannot write CSI data to file.");
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, true);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(uri.getBytes());
            fileOutputStream.write(10);
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                zzcbn.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            zzcbn.zzk("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e4) {
                    zzcbn.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                    zzcbn.zzk("CsiReporter: Cannot close file: sdk_csi_data.txt.", e5);
                }
            }
            throw th;
        }
    }

    public final zzbdq zza(String str) {
        zzbdq zzbdqVar = (zzbdq) this.zzc.get(str);
        return zzbdqVar != null ? zzbdqVar : zzbdq.zza;
    }

    final Map zzb(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            linkedHashMap.put(str, zza(str).zza((String) linkedHashMap.get(str), str2));
        }
        return linkedHashMap;
    }

    public final void zzd(Context context, String str, String str2, Map map) {
        File externalStorageDirectory;
        this.zze = context;
        this.zzf = str;
        this.zzd = str2;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.zzh = atomicBoolean;
        atomicBoolean.set(((Boolean) zzbeq.zzc.zze()).booleanValue());
        if (this.zzh.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.zzi = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry entry : map.entrySet()) {
            this.zzb.put((String) entry.getKey(), (String) entry.getValue());
        }
        zzcca.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdj
            @Override // java.lang.Runnable
            public final void run() {
                zzbdk.zzc(zzbdk.this);
            }
        });
        this.zzc.put("action", zzbdq.zzb);
        this.zzc.put(FirebaseAnalytics.Param.AD_FORMAT, zzbdq.zzb);
        this.zzc.put("e", zzbdq.zzc);
    }

    public final void zze(String str) {
        if (this.zzg.contains(str)) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, this.zzf);
        linkedHashMap.put("ue", str);
        zzg(zzb(this.zzb, linkedHashMap), null);
    }

    public final boolean zzf(zzbdu zzbduVar) {
        return this.zza.offer(zzbduVar);
    }
}
