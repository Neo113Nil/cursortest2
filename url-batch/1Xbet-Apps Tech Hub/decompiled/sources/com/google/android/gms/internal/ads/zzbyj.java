package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Looper;
import android.view.View;
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

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbyj implements zzbyo {
    public static final /* synthetic */ int zzb = 0;
    private static final List zzc = Collections.synchronizedList(new ArrayList());
    boolean zza;
    private final zzhaq zzd;
    private final LinkedHashMap zze;
    private final Context zzh;
    private final zzbyl zzi;
    private final zzbyk zzn;
    private final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private final Object zzj = new Object();
    private HashSet zzk = new HashSet();
    private boolean zzl = false;
    private boolean zzm = false;

    public zzbyj(Context context, zzcbt zzcbtVar, zzbyl zzbylVar, String str, zzbyk zzbykVar) {
        Preconditions.checkNotNull(zzbylVar, "SafeBrowsing config is not present.");
        this.zzh = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.zze = new LinkedHashMap();
        this.zzn = zzbykVar;
        this.zzi = zzbylVar;
        Iterator it = zzbylVar.zze.iterator();
        while (it.hasNext()) {
            this.zzk.add(((String) it.next()).toLowerCase(Locale.ENGLISH));
        }
        this.zzk.remove("cookie".toLowerCase(Locale.ENGLISH));
        zzhaq zza = zzhcl.zza();
        zza.zzn(9);
        zza.zzj(str);
        zza.zzh(str);
        zzhar zza2 = zzhas.zza();
        String str2 = this.zzi.zza;
        if (str2 != null) {
            zza2.zza(str2);
        }
        zza.zzg((zzhas) zza2.zzal());
        zzhcf zza3 = zzhcg.zza();
        zza3.zzc(Wrappers.packageManager(this.zzh).isCallerInstantApp());
        String str3 = zzcbtVar.zza;
        if (str3 != null) {
            zza3.zza(str3);
        }
        long apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zzh);
        if (apkVersion > 0) {
            zza3.zzb(apkVersion);
        }
        zza.zzf((zzhcg) zza3.zzal());
        this.zzd = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final zzbyl zza() {
        return this.zzi;
    }

    final /* synthetic */ ListenableFuture zzb(Map map) throws Exception {
        zzhcd zzhcdVar;
        ListenableFuture zzm;
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.zzj) {
                            int length = optJSONArray.length();
                            synchronized (this.zzj) {
                                zzhcdVar = (zzhcd) this.zze.get(str);
                            }
                            if (zzhcdVar == null) {
                                zzbyn.zza("Cannot find the corresponding resource object for " + str);
                            } else {
                                for (int i = 0; i < length; i++) {
                                    zzhcdVar.zza(optJSONArray.getJSONObject(i).getString("threat_type"));
                                }
                                this.zza = (length > 0) | this.zza;
                            }
                        }
                    }
                }
            } catch (JSONException e) {
                if (((Boolean) zzbfd.zzb.zze()).booleanValue()) {
                    zzcbn.zzf("Failed to get SafeBrowsing metadata", e);
                }
                return zzgbb.zzg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.zza) {
            synchronized (this.zzj) {
                this.zzd.zzn(10);
            }
        }
        boolean z = this.zza;
        if (!(z && this.zzi.zzg) && (!(this.zzm && this.zzi.zzf) && (z || !this.zzi.zzd))) {
            return zzgbb.zzh(null);
        }
        synchronized (this.zzj) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                this.zzd.zzc((zzhce) ((zzhcd) it.next()).zzal());
            }
            this.zzd.zza(this.zzf);
            this.zzd.zzb(this.zzg);
            if (zzbyn.zzb()) {
                StringBuilder sb = new StringBuilder("Sending SB report\n  url: " + this.zzd.zzl() + "\n  clickUrl: " + this.zzd.zzk() + "\n  resources: \n");
                for (zzhce zzhceVar : this.zzd.zzm()) {
                    sb.append("    [");
                    sb.append(zzhceVar.zza());
                    sb.append("] ");
                    sb.append(zzhceVar.zze());
                }
                zzbyn.zza(sb.toString());
            }
            ListenableFuture zzb2 = new com.google.android.gms.ads.internal.util.zzbq(this.zzh).zzb(1, this.zzi.zzb, null, ((zzhcl) this.zzd.zzal()).zzax());
            if (zzbyn.zzb()) {
                zzb2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbyg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbyn.zza("Pinged SB successfully.");
                    }
                }, zzcca.zza);
            }
            zzm = zzgbb.zzm(zzb2, new zzftn() { // from class: com.google.android.gms.internal.ads.zzbyh
                @Override // com.google.android.gms.internal.ads.zzftn
                public final Object apply(Object obj) {
                    int i2 = zzbyj.zzb;
                    return null;
                }
            }, zzcca.zzf);
        }
        return zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzd(String str, Map map, int i) {
        synchronized (this.zzj) {
            if (i == 3) {
                this.zzm = true;
            }
            if (this.zze.containsKey(str)) {
                if (i == 3) {
                    ((zzhcd) this.zze.get(str)).zze(4);
                }
                return;
            }
            zzhcd zzc2 = zzhce.zzc();
            int zza = zzhcc.zza(i);
            if (zza != 0) {
                zzc2.zze(zza);
            }
            zzc2.zzb(this.zze.size());
            zzc2.zzd(str);
            zzhbd zza2 = zzhbg.zza();
            if (!this.zzk.isEmpty() && map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = entry.getKey() != null ? (String) entry.getKey() : "";
                    String str3 = entry.getValue() != null ? (String) entry.getValue() : "";
                    if (this.zzk.contains(str2.toLowerCase(Locale.ENGLISH))) {
                        zzhbb zza3 = zzhbc.zza();
                        zza3.zza(zzgve.zzw(str2));
                        zza3.zzb(zzgve.zzw(str3));
                        zza2.zza((zzhbc) zza3.zzal());
                    }
                }
            }
            zzc2.zzc((zzhbg) zza2.zzal());
            this.zze.put(str, zzc2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zze() {
        synchronized (this.zzj) {
            this.zze.keySet();
            ListenableFuture zzn = zzgbb.zzn(zzgbb.zzh(Collections.emptyMap()), new zzgai() { // from class: com.google.android.gms.internal.ads.zzbye
                @Override // com.google.android.gms.internal.ads.zzgai
                public final ListenableFuture zza(Object obj) {
                    return zzbyj.this.zzb((Map) obj);
                }
            }, zzcca.zzf);
            ListenableFuture zzo = zzgbb.zzo(zzn, 10L, TimeUnit.SECONDS, zzcca.zzd);
            zzgbb.zzr(zzn, new zzbyi(this, zzo), zzcca.zzf);
            zzc.add(zzo);
        }
    }

    final /* synthetic */ void zzf(Bitmap bitmap) {
        zzgvb zzt = zzgve.zzt();
        bitmap.compress(Bitmap.CompressFormat.PNG, 0, zzt);
        synchronized (this.zzj) {
            zzhaq zzhaqVar = this.zzd;
            zzhbw zza = zzhby.zza();
            zza.zza(zzt.zzb());
            zza.zzb("image/png");
            zza.zzc(2);
            zzhaqVar.zzi((zzhby) zza.zzal());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006f  */
    @Override // com.google.android.gms.internal.ads.zzbyo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(View view) {
        Bitmap bitmap;
        boolean isDrawingCacheEnabled;
        if (this.zzi.zzc && !this.zzl) {
            com.google.android.gms.ads.internal.zzt.zzp();
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
                    zzcbn.zzh("Fail to capture the web view", e);
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
                        zzcbn.zzj("Width or height of view is zero");
                    } catch (RuntimeException e3) {
                        zzcbn.zzh("Fail to capture the webview", e3);
                    }
                } else {
                    bitmap2 = bitmap;
                }
            }
            if (bitmap2 != null) {
                zzbyn.zza("Failed to capture the webview bitmap.");
                return;
            }
            this.zzl = true;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzbyf
                @Override // java.lang.Runnable
                public final void run() {
                    zzbyj.this.zzf(bitmap2);
                }
            };
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                runnable.run();
            } else {
                zzcca.zza.execute(runnable);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final void zzh(String str) {
        synchronized (this.zzj) {
            if (str == null) {
                this.zzd.zzd();
            } else {
                this.zzd.zze(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbyo
    public final boolean zzi() {
        return PlatformVersion.isAtLeastKitKat() && this.zzi.zzc && !this.zzl;
    }
}
