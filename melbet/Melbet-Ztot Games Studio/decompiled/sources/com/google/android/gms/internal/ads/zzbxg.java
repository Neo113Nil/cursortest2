package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
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

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzbxg implements zzbxl {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhbz zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbxi zzi;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbxg(Context context, VersionInfoParcel versionInfoParcel, zzbxi zzbxiVar, String str, zzbxh zzbxhVar) {
        Preconditions.checkNotNull(zzbxiVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzi = zzbxiVar;
        Iterator it = zzbxiVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhbz zzc2 = zzhdy.zzc();
        zzc2.zzn(9);
        zzc2.zzj(str);
        zzc2.zzh(str);
        zzhca zzc3 = zzhcb.zzc();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zzc3.zza(str2);
        }
        zzc2.zzg((zzhcb) zzc3.zzbr());
        zzhdp zzc4 = zzhdq.zzc();
        zzc4.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = versionInfoParcel.afmaVersion;
        if (str3 != null) {
            zzc4.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zzc4.zzb(apkVersion);
        }
        zzc2.zzf((zzhdq) zzc4.zzbr());
        this.zzd = zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final zzbxi zza() {
        return this.zzi;
    }

    final /* synthetic */ ListenableFuture zzb(Map map) throws Exception {
        zzhdn zzhdnVar;
        ListenableFuture zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzhdnVar = (zzhdn) this.zze.get(str);
                            }
                            if (zzhdnVar == null) {
                                zzbxk.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzhdnVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbea.zza.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzgcj.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgcj.zzh(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzhdo) ((zzhdn) it.next()).zzbr());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbxk.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (zzhdo zzhdoVar : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzhdoVar.zzc());
                    sb.append("] ");
                    sb.append(zzhdoVar.zzf());
                }
                zzbxk.zza(sb.toString());
            }
            ListenableFuture zzb2 = new com.google.android.gms.ads.internal.util.zzbo(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhdy) this.zzd.zzbr()).zzaV());
            if (zzbxk.zzb()) {
                zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxd
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbxk.zza("Pinged SB successfully.");
                    }
                }, zzbzo.zza);
            }
            zzm = zzgcj.zzm(zzb2, new zzful() { // from class: com.google.android.gms.internal.ads.zzbxe
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    int i2 = zzbxg.zzb;
                    return null;
                }
            }, zzbzo.zzf);
        }
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzd(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzhdn) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzhdn zzd = zzhdo.zzd();
            int zza = zzhdm.zza(i);
            if (zza != 0) {
                zzd.zze(zza);
            }
            zzd.zzb(this.zze.size());
            zzd.zzd(str);
            zzhcm zzc2 = zzhcp.zzc();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhck zzc3 = zzhcl.zzc();
                        zzc3.zza(zzgwm.zzw(str2));
                        zzc3.zzb(zzgwm.zzw(str3));
                        zzc2.zza((zzhcl) zzc3.zzbr());
                    }
                }
            }
            zzd.zzc((zzhcp) zzc2.zzbr());
            this.zze.put(str, zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zzn = zzgcj.zzn(zzgcj.zzh(Collections.emptyMap()), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzbxb
                @Override // com.google.android.gms.internal.ads.zzgbq
                public final ListenableFuture zza(Object obj) {
                    return zzbxg.this.zzb((Map) obj);
                }
            }, zzbzo.zzf);
            ListenableFuture zzo = zzgcj.zzo(zzn, 10L, TimeUnit.SECONDS, zzbzo.zzd);
            zzgcj.zzr(zzn, new zzbxf(this, zzo), zzbzo.zzf);
            zzc.add(zzo);
        }
    }

    final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgwl zzt = zzgwm.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzhbz zzhbzVar = this.zzd;
            zzhdh zzc2 = zzhdj.zzc();
            zzc2.zza(zzt.zzb());
            zzc2.zzb("image/png");
            zzc2.zzc(2);
            zzhbzVar.zzi((zzhdj) zzc2.zzbr());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    @Override // com.google.android.gms.internal.ads.zzbxl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzu.zzp();
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
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to capture the web view", e);
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
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Width or height of view is zero");
                    } catch (RuntimeException e3) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzbxk.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbxc
                @Override // java.lang.Runnable
                public final void run() {
                    zzbxg.this.zzf(bitmap2);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzbzo.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxl
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
