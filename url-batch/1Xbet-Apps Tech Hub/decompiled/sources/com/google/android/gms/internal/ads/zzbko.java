package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbko implements zzbkd {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdtp zzb;
    private final zzfje zzc;
    private final zzbsm zze;
    private final zzeep zzf;
    private final zzcpo zzg;
    private com.google.android.gms.ads.internal.overlay.zzx zzh = null;
    private final zzgbl zzi = zzcca.zzf;
    private final zzcbs zzd = new zzcbs(null);

    public zzbko(com.google.android.gms.ads.internal.zzb zzbVar, zzbsm zzbsmVar, zzeep zzeepVar, zzdtp zzdtpVar, zzfje zzfjeVar, zzcpo zzcpoVar) {
        this.zza = zzbVar;
        this.zze = zzbsmVar;
        this.zzf = zzeepVar;
        this.zzb = zzdtpVar;
        this.zzc = zzfjeVar;
        this.zzg = zzcpoVar;
    }

    public static int zzb(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzc(Context context, zzasi zzasiVar, Uri uri, View view, Activity activity) {
        if (zzasiVar == null) {
            return uri;
        }
        try {
            return zzasiVar.zze(uri) ? zzasiVar.zza(uri, context, view, activity) : uri;
        } catch (zzasj unused) {
            return uri;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().zzw(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    static Uri zzd(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e) {
            zzcbn.zzh("Error adding click uptime parameter to url: ".concat(String.valueOf(uri.toString())), e);
        }
        return uri;
    }

    public static boolean zzf(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzh(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z;
        HashMap hashMap;
        Object obj;
        zzcgv zzcgvVar = (zzcgv) zzaVar;
        zzfdu zzD = zzcgvVar.zzD();
        zzfdy zzP = zzcgvVar.zzP();
        boolean z2 = false;
        if (zzD == null || zzP == null) {
            str3 = "";
            z = false;
        } else {
            String str4 = zzP.zzb;
            z = zzD.zzaj;
            str3 = str4;
        }
        boolean z3 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjZ)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("0")) ? false : true;
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcgvVar.zzaA()) {
                zzcbn.zzj("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzk(false);
                ((zzcia) zzaVar).zzaF(zzf(map), zzb(map), z3);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzk(false);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzkY)).booleanValue() && ((obj = map.get("is_allowed_for_lock_screen")) == "1" || (obj != null && obj.equals("1")))) {
                z2 = true;
            }
            if (str != null) {
                ((zzcia) zzaVar).zzaH(zzf(map), zzb(map), str, z3, z2);
                return;
            } else {
                ((zzcia) zzaVar).zzaG(zzf(map), zzb(map), (String) map.get("html"), (String) map.get("baseurl"), z3);
                return;
            }
        }
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcgvVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzet)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzez)).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzex)).booleanValue()) {
                        String str5 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzey);
                        if (!str5.isEmpty() && context != null) {
                            String packageName = context.getPackageName();
                            Iterator it = zzful.zzc(zzftk.zzc(';')).zzd(str5).iterator();
                            while (it.hasNext()) {
                                if (((String) it.next()).equals(packageName)) {
                                }
                            }
                        }
                    }
                    z2 = true;
                    break;
                }
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
            }
            boolean zzg = zzbed.zzg(zzcgvVar.getContext());
            if (z2) {
                if (zzg) {
                    zzk(true);
                    if (TextUtils.isEmpty(str)) {
                        zzcbn.zzj("Cannot open browser with null or empty url");
                        zzm(7);
                        return;
                    }
                    Uri zzd = zzd(zzc(zzcgvVar.getContext(), zzcgvVar.zzI(), Uri.parse(str), zzcgvVar.zzF(), zzcgvVar.zzi()));
                    if (z && this.zzf != null && zzl(zzaVar, zzcgvVar.getContext(), zzd.toString(), str3)) {
                        return;
                    }
                    this.zzh = new zzbkl(this);
                    ((zzcia) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(null, zzd.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzh).asBinder(), true), z3);
                    return;
                }
                zzm(4);
            }
            map.put("use_first_package", "true");
            map.put("use_running_process", "true");
            zzj(zzaVar, map, z, str3, z3);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map.get("system_browser"))) {
            zzj(zzaVar, map, z, str3, z3);
            return;
        }
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzic)).booleanValue()) {
                zzk(true);
                String str6 = (String) map.get("p");
                if (str6 == null) {
                    zzcbn.zzj("Package name missing from open app action.");
                    return;
                }
                if (z && this.zzf != null && zzl(zzaVar, zzcgvVar.getContext(), str6, str3)) {
                    return;
                }
                PackageManager packageManager = zzcgvVar.getContext().getPackageManager();
                if (packageManager == null) {
                    zzcbn.zzj("Cannot get package manager from open app action.");
                    return;
                }
                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str6);
                if (launchIntentForPackage != null) {
                    ((zzcia) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z3);
                    return;
                }
                return;
            }
            return;
        }
        zzk(true);
        String str7 = (String) map.get("intent_url");
        Intent intent = null;
        if (!TextUtils.isEmpty(str7)) {
            try {
                intent = Intent.parseUri(str7, 0);
            } catch (URISyntaxException e) {
                zzcbn.zzh("Error parsing the url: ".concat(String.valueOf(str7)), e);
            }
        }
        Intent intent2 = intent;
        if (intent2 != null && intent2.getData() != null) {
            Uri data = intent2.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zzd2 = zzd(zzc(zzcgvVar.getContext(), zzcgvVar.zzI(), data, zzcgvVar.zzF(), zzcgvVar.zzi()));
                if (!TextUtils.isEmpty(intent2.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzid)).booleanValue()) {
                        intent2.setDataAndType(zzd2, intent2.getType());
                    }
                }
                intent2.setData(zzd2);
            }
        }
        boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzir)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map.containsKey("event_id");
        HashMap hashMap2 = new HashMap();
        if (z4) {
            hashMap = hashMap2;
            this.zzh = new zzbkm(this, z3, zzaVar, hashMap2, map);
            z3 = false;
        } else {
            hashMap = hashMap2;
        }
        if (intent2 != null) {
            if (!z || this.zzf == null || !zzl(zzaVar, zzcgvVar.getContext(), intent2.getData().toString(), str3)) {
                ((zzcia) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.zzh), z3);
                return;
            } else {
                if (z4) {
                    HashMap hashMap3 = hashMap;
                    hashMap3.put((String) map.get("event_id"), true);
                    ((zzbmx) zzaVar).zzd("openIntentAsync", hashMap3);
                    return;
                }
                return;
            }
        }
        HashMap hashMap4 = hashMap;
        String uri = !TextUtils.isEmpty(str) ? zzd(zzc(zzcgvVar.getContext(), zzcgvVar.zzI(), Uri.parse(str), zzcgvVar.zzF(), zzcgvVar.zzi())).toString() : str;
        if (!z || this.zzf == null || !zzl(zzaVar, zzcgvVar.getContext(), uri, str3)) {
            ((zzcia) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc((String) map.get("i"), uri, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.zzh), z3);
        } else if (z4) {
            hashMap4.put((String) map.get("event_id"), true);
            ((zzbmx) zzaVar).zzd("openIntentAsync", hashMap4);
        }
    }

    private final void zzi(Context context, String str, String str2) {
        this.zzf.zzc(str);
        zzdtp zzdtpVar = this.zzb;
        if (zzdtpVar != null) {
            zzefa.zzc(context, zzdtpVar, this.zzc, this.zzf, str, "dialog_not_shown", zzfwx.zze("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00df, code lost:
    
        if (com.google.android.gms.internal.ads.zzbkn.zzc(r11, r5, r6, r7) == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0122, code lost:
    
        r11 = r16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzj(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzc;
        boolean z3 = true;
        zzk(true);
        zzcgv zzcgvVar = (zzcgv) zzaVar;
        Context context = zzcgvVar.getContext();
        zzasi zzI = zzcgvVar.zzI();
        View zzF = zzcgvVar.zzF();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        Intent intent = null;
        Uri build = null;
        if (!TextUtils.isEmpty(str2)) {
            Uri zzd = zzd(zzc(context, zzI, Uri.parse(str2), zzF, null));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzer)).booleanValue()) {
                    z3 = false;
                }
            }
            if ("http".equalsIgnoreCase(zzd.getScheme())) {
                build = zzd.buildUpon().scheme("https").build();
            } else if ("https".equalsIgnoreCase(zzd.getScheme())) {
                build = zzd.buildUpon().scheme("http").build();
            }
            ArrayList arrayList = new ArrayList();
            Intent zza = zzbkn.zza(zzd, context, zzI, zzF);
            Intent zza2 = zzbkn.zza(build, context, zzI, zzF);
            if (z3) {
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzo(context, zza);
                com.google.android.gms.ads.internal.zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzo(context, zza2);
            }
            ResolveInfo zzd2 = zzbkn.zzd(zza, arrayList, context, zzI, zzF);
            if (zzd2 != null) {
                intent = zzbkn.zzb(zza, zzd2, context, zzI, zzF);
            } else {
                if (zza2 != null && (zzc = zzbkn.zzc(zza2, context, zzI, zzF)) != null) {
                    intent = zzbkn.zzb(zza, zzc, context, zzI, zzF);
                }
                if (!arrayList.isEmpty()) {
                    if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        int size = arrayList.size();
                        int i = 0;
                        loop0: while (i < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            do {
                                int i2 = i + 1;
                                if (it.hasNext()) {
                                }
                            } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                            intent = zzbkn.zzb(zza, resolveInfo, context, zzI, zzF);
                            break loop0;
                        }
                    }
                    if (parseBoolean) {
                        intent = zzbkn.zzb(zza, (ResolveInfo) arrayList.get(0), context, zzI, zzF);
                    }
                }
                intent = zza;
            }
        }
        if (!z || this.zzf == null || intent == null || !zzl(zzaVar, zzcgvVar.getContext(), intent.getData().toString(), str)) {
            try {
                ((zzcia) zzaVar).zzaD(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzh), z2);
            } catch (ActivityNotFoundException e) {
                zzcbn.zzj(e.getMessage());
            }
        }
    }

    private final void zzk(boolean z) {
        zzbsm zzbsmVar = this.zze;
        if (zzbsmVar != null) {
            zzbsmVar.zza(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzin)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbdc.zzim)).booleanValue()) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzl(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        zzdtp zzdtpVar = this.zzb;
        if (zzdtpVar != null) {
            zzefa.zzc(context, zzdtpVar, this.zzc, this.zzf, str2, "offline_open", new HashMap());
        }
        if (com.google.android.gms.ads.internal.zzt.zzo().zzz(context)) {
            this.zzf.zzh(this.zzd, str2);
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        com.google.android.gms.ads.internal.util.zzbt zzy = com.google.android.gms.ads.internal.util.zzt.zzy(context);
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean areNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
        boolean zzi = com.google.android.gms.ads.internal.zzt.zzq().zzi(context, "offline_notification_channel");
        zzcgv zzcgvVar = (zzcgv) zzaVar;
        boolean z = zzcgvVar.zzL() != null && zzcgvVar.zzi() == null;
        if (!areNotificationsEnabled) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
            }
            zzi(context, str2, "notifications_disabled");
            return false;
        }
        if (zzi) {
            zzi(context, str2, "notification_channel_disabled");
            return false;
        }
        if (zzy == null) {
            zzi(context, str2, "work_manager_unavailable");
            return false;
        }
        if (z) {
            zzi(context, str2, "ad_no_activity");
            return false;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzik)).booleanValue()) {
            zzi(context, str2, "notification_flow_disabled");
            return false;
        }
        if (zzcgvVar.zzL() != null) {
            zzefb zze = zzefc.zze();
            zze.zza(zzcgvVar.zzi());
            zze.zzb(null);
            zze.zzc(str2);
            zze.zzd(str);
            try {
                zzcgvVar.zzL().zzf(zze.zze());
            } catch (Exception e) {
                zzi(context, str2, e.getMessage());
                return false;
            }
        } else {
            ((zzcia) zzaVar).zzaE(str2, str, 14);
        }
        zzaVar.onAdClicked();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzm(int i) {
        if (this.zzb == null) {
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziv)).booleanValue()) {
            zzdto zza = this.zzb.zza();
            zza.zzb("action", "cct_action");
            zza.zzb("cct_open_status", zzbec.zza(i));
            zza.zzg();
            return;
        }
        zzfje zzfjeVar = this.zzc;
        String zza2 = zzbec.zza(i);
        zzfjd zzb = zzfjd.zzb("cct_action");
        zzb.zza("cct_open_status", zza2);
        zzfjeVar.zzb(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbkd
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcpo zzcpoVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String zzc = zzbzu.zzc((String) map.get("u"), ((zzcgv) zzaVar).getContext(), true);
        String str = (String) map.get("a");
        if (str == null) {
            zzcbn.zzj("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzc()) {
            zzgbb.zzr((!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzjB)).booleanValue() || (zzcpoVar = this.zzg) == null) ? zzgbb.zzh(zzc) : zzcpoVar.zzc(zzc, com.google.android.gms.ads.internal.client.zzay.zze()), new zzbkk(this, zzaVar, map, str), this.zzi);
        } else {
            zzbVar.zzb(zzc);
        }
    }
}
