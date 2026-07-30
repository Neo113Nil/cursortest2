package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzcbz implements zzcce {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzifv zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzccb zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzcbz(Context context, VersionInfoParcel versionInfoParcel, zzccb zzccbVar, String str, zzcca zzccaVar) {
        Preconditions.checkNotNull(zzccbVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzccbVar;
        Iterator it = zzccbVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzifv zzg = zzihz.zzg();
        zzg.zzn(9);
        if (str != null) {
            zzg.zzb(str);
            zzg.zzc(str);
        }
        zzifw zzc2 = zzifx.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc2.zza(str2);
        }
        zzg.zzd((zzifx) zzc2.zzbu());
        zzihl zzc3 = zzihm.zzc();
        zzc3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc3.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc3.zzb(apkVersion);
        }
        zzg.zzk((zzihm) zzc3.zzbu());
        this.zzd = zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final zzccb zza() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final void zzb(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzi();
            } else {
                this.zzd.zzh(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final boolean zzc() {
        return this.zzi.zzc && !this.zzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
    @Override // com.google.android.gms.internal.ads.zzcce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Bitmap bitmap2 = null;
            if (view != null) {
                try {
                    isDrawingCacheEnabled = view.isDrawingCacheEnabled();
                    view.setDrawingCacheEnabled(true);
                    Bitmap drawingCache = view.getDrawingCache();
                    bitmap = drawingCache != null ? Bitmap.createBitmap(drawingCache) : null;
                } catch (RuntimeException e) {
                    e = e;
                    bitmap = null;
                }
                try {
                    view.setDrawingCacheEnabled(isDrawingCacheEnabled);
                } catch (RuntimeException e2) {
                    e = e2;
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the web view", e);
                    if (bitmap != null) {
                    }
                    if (bitmap2 != null) {
                    }
                }
                if (bitmap != null) {
                    try {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        if (width != 0 && height != 0) {
                            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                            Canvas canvas = new Canvas(createBitmap);
                            view.layout(0, 0, width, height);
                            view.draw(canvas);
                            bitmap2 = createBitmap;
                        }
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Width or height of view is zero");
                    } catch (RuntimeException e3) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzccd.zza("Failed to capture the webview bitmap.");
            } else {
                this.zzl = true;
                com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcbz.this.zzg(bitmap2);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final void zze(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            LinkedHashMap linkedHashMap = this.zze;
            if (linkedHashMap.containsKey(str)) {
                if (i == 3) {
                    ((zzihj) linkedHashMap.get(str)).zze(4);
                }
                return;
            }
            zzihj zze = zzihk.zze();
            int zza = zzihi.zza(i);
            if (zza != 0) {
                zze.zze(zza);
            }
            zze.zza(linkedHashMap.size());
            zze.zzb(str);
            zzigi zzc2 = zzigl.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzigg zzc3 = zzigh.zzc();
                        zzc3.zza(zzian.zzv(str2));
                        zzc3.zzb(zzian.zzv(str3));
                        zzc2.zza((zzigh) zzc3.zzbu());
                    }
                }
            }
            zze.zzc((zzigl) zzc2.zzbu());
            linkedHashMap.put(str, zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcce
    public final void zzf() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zza = zzgzo.zza(Collections.emptyMap());
            zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzcbv
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ ListenableFuture zza(Object obj) {
                    return zzcbz.this.zzh((Map) obj);
                }
            };
            zzgzy zzgzyVar = zzcei.zzg;
            ListenableFuture zzj = zzgzo.zzj(zza, zzgywVar, zzgzyVar);
            ListenableFuture zzi = zzgzo.zzi(zzj, 10L, TimeUnit.SECONDS, zzcei.zzd);
            zzgzo.zzr(zzj, new zzcbu(this, zzi), zzgzyVar);
            zzc.add(zzi);
        }
    }

    final /* synthetic */ void zzg(Bitmap bitmap) {
        zziam zzA = zzian.zzA();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzA);
        synchronized (this.zzj) {
            zzifv zzifvVar = this.zzd;
            zzihd zzc2 = zzihf.zzc();
            zzc2.zzb(zzA.zza());
            zzc2.zza("image/png");
            zzc2.zzc(2);
            zzifvVar.zzj((zzihf) zzc2.zzbu());
        }
    }

    final /* synthetic */ ListenableFuture zzh(Map map) {
        int length;
        zzihj zzihjVar;
        ListenableFuture zzk;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        Object obj = this.zzj;
                        synchronized (obj) {
                            length = optJSONArray.length();
                            synchronized (obj) {
                                zzihjVar = (zzihj) this.zze.get(str);
                            }
                        }
                        if (zzihjVar == null) {
                            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
                            sb.append("Cannot find the corresponding resource object for ");
                            sb.append(str);
                            zzccd.zza(sb.toString());
                        } else {
                            for (int i = 0; i < length; i++) {
                                zzihjVar.zzd(optJSONArray.getJSONObject(i).getString("threat_type"));
                            }
                            this.zza = (length > 0) | this.zza;
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbjm.zza.zze()).booleanValue()) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get SafeBrowsing metadata", e);
                }
                return zzgzo.zzc(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgzo.zza(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzf((zzihk) ((zzihj) it.next()).zzbu());
            }
            zzifv zzifvVar = this.zzd;
            zzifvVar.zzl(this.zzf);
            zzifvVar.zzm(this.zzg);
            if (zzccd.zzb()) {
                String zza = zzifvVar.zza();
                String zzg = zzifvVar.zzg();
                StringBuilder sb2 = new StringBuilder(String.valueOf(zza).length() + 38 + String.valueOf(zzg).length() + 15);
                sb2.append("Sending SB report\n  url: ");
                sb2.append(zza);
                sb2.append("\n  clickUrl: ");
                sb2.append(zzg);
                sb2.append("\n  resources: \n");
                StringBuilder sb3 = new StringBuilder(sb2.toString());
                for (zzihk zzihkVar : zzifvVar.zze()) {
                    sb3.append("    [");
                    sb3.append(zzihkVar.zzd());
                    sb3.append("] ");
                    sb3.append(zzihkVar.zzc());
                }
                zzccd.zza(sb3.toString());
            }
            ListenableFuture zzb2 = new com.google.android.gms.ads.internal.util.zzbl(this.zzh).zzb(1, this.zzi.zzb, null, ((zzihz) zzifvVar.zzbu()).zzaN());
            if (zzccd.zzb()) {
                zzb2.addListener(zzcbx.zza, zzcei.zza);
            }
            zzk = zzgzo.zzk(zzb2, zzcbw.zza, zzcei.zzg);
        }
        return zzk;
    }
}
