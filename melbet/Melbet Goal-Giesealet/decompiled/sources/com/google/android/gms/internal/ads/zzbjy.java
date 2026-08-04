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
import androidx.browser.customtabs.CustomTabsClient;
import androidx.core.app.NotificationManagerCompat;
import com.facebook.common.callercontext.ContextChain;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzbjy implements zzbjl {
    private final com.google.android.gms.ads.internal.zzb zza;
    private final zzdsm zzb;
    private final zzbrv zzd;
    private final zzecn zze;
    private final zzcmi zzf;
    private final zzcur zzg;
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzz zzh = null;
    private final zzgpd zzi = zzbzh.zzg;

    public zzbjy(com.google.android.gms.ads.internal.zzb zzbVar, zzbrv zzbrvVar, zzecn zzecnVar, zzdsm zzdsmVar, zzcmi zzcmiVar, zzcur zzcurVar) {
        this.zza = zzbVar;
        this.zzd = zzbrvVar;
        this.zze = zzecnVar;
        this.zzb = zzdsmVar;
        this.zzf = zzcmiVar;
        this.zzg = zzcurVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if (ContextChain.TAG_PRODUCT.equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    static Uri zzd(Context context, zzauu zzauuVar, Uri uri, View view, Activity activity, zzfdg zzfdgVar) {
        if (zzauuVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmN)).booleanValue() || zzfdgVar == null) {
                    if (zzauuVar.zze(uri)) {
                        return zzauuVar.zzd(uri, context, view, activity);
                    }
                } else if (zzauuVar.zze(uri)) {
                    return zzfdgVar.zza(uri, context, view, activity);
                }
            } catch (zzauv unused) {
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e) {
            String uri2 = uri.toString();
            String.valueOf(uri2);
            String valueOf = String.valueOf(uri2);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(valueOf), e);
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zzf(String str, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, String str2) {
        String str3;
        boolean z;
        Object obj;
        zzcur zzcurVar;
        Map map2 = map;
        zzcek zzcekVar = (zzcek) zzaVar;
        zzfcj zzC = zzcekVar.zzC();
        zzfcm zzaC = zzcekVar.zzaC();
        boolean z2 = false;
        if (zzC == null || zzaC == null) {
            str3 = "";
            z = false;
        } else {
            str3 = zzaC.zzb;
            z = zzC.zzb();
        }
        boolean z3 = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlz)).booleanValue() && map2.containsKey("sc") && ((String) map2.get("sc")).equals("0")) ? false : true;
        boolean z4 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznB)).booleanValue() && map2.containsKey("ig_cl") && ((String) map2.get("ig_cl")).equals("true");
        if ("expand".equalsIgnoreCase(str2)) {
            if (zzcekVar.zzW()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot expand WebView that is already expanded.");
                return;
            } else {
                zzl(false);
                ((zzcga) zzaVar).zzaI(zzb(map2), zzc(map2), z3);
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(str2)) {
            zzl(false);
            boolean z5 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmJ)).booleanValue() && Objects.equals(map2.get("is_allowed_for_lock_screen"), "1");
            if (str != null) {
                ((zzcga) zzaVar).zzaJ(zzb(map2), zzc(map2), str, z3, z5);
                return;
            } else {
                ((zzcga) zzaVar).zzaK(zzb(map2), zzc(map2), (String) map2.get("html"), (String) map2.get("baseurl"), z3);
                return;
            }
        }
        Intent intent = null;
        if ("chrome_custom_tab".equalsIgnoreCase(str2)) {
            Context context = zzcekVar.getContext();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfi)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("User opt out chrome custom tab.");
                zzg(10);
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfd)).booleanValue()) {
                    int i2 = zzbdh.zza;
                    String packageName = CustomTabsClient.getPackageName(context, null);
                    if (packageName != null && !context.getPackageName().equals(packageName)) {
                        z2 = true;
                    }
                } else {
                    z2 = zzbdj.zza(context);
                }
                if (z2) {
                    zzl(true);
                    if (TextUtils.isEmpty(str)) {
                        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot open browser with null or empty url");
                        zzg(7);
                        return;
                    }
                    Uri zze = zze(zzd(zzcekVar.getContext(), zzcekVar.zzS(), Uri.parse(str), zzcekVar.zzE(), zzcekVar.zzj(), zzcekVar.zzT()));
                    if (z && this.zze != null && zzi(zzaVar, zzcekVar.getContext(), zze.toString(), str3)) {
                        return;
                    }
                    this.zzh = new zzbjv(this);
                    ((zzcga) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(null, zze.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.zzh).asBinder(), true), z3, z4, str3);
                    return;
                }
                zzg(4);
            }
            map2.put("use_first_package", "true");
            map2.put("use_running_process", "true");
            zzk(zzaVar, map2, z, str3, z3, z4);
            return;
        }
        if ("app".equalsIgnoreCase(str2) && "true".equalsIgnoreCase((String) map2.get("system_browser"))) {
            zzk(zzaVar, map2, z, str3, z3, z4);
            return;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar2 = zzaVar;
        String str4 = str3;
        boolean z6 = z4;
        boolean z7 = z;
        if ("open_app".equalsIgnoreCase(str2)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziX)).booleanValue()) {
                zzl(true);
                String str5 = (String) map2.get(ContextChain.TAG_PRODUCT);
                if (str5 == null) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Package name missing from open app action.");
                    return;
                }
                if (z7 && this.zze != null && zzi(zzaVar2, zzcekVar.getContext(), str5, str4)) {
                    return;
                }
                PackageManager packageManager = zzcekVar.getContext().getPackageManager();
                if (packageManager == null) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot get package manager from open app action.");
                    return;
                } else {
                    Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                    if (launchIntentForPackage != null) {
                        ((zzcga) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(launchIntentForPackage, this.zzh), z3, z6, str4);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        zzl(true);
        String str6 = (String) map2.get("intent_url");
        if (!TextUtils.isEmpty(str6)) {
            try {
                intent = Intent.parseUri(str6, 0);
            } catch (URISyntaxException e) {
                String.valueOf(str6);
                String valueOf = String.valueOf(str6);
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error parsing the url: ".concat(valueOf), e);
            }
        }
        if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            if (!Uri.EMPTY.equals(data)) {
                Uri zze2 = zze(zzd(zzcekVar.getContext(), zzcekVar.zzS(), data, zzcekVar.zzE(), zzcekVar.zzj(), zzcekVar.zzT()));
                if (!TextUtils.isEmpty(intent.getType())) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zziY)).booleanValue()) {
                        intent.setDataAndType(zze2, intent.getType());
                    }
                }
                intent.setData(zze2);
            }
        }
        boolean z8 = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjt)).booleanValue() && "intent_async".equalsIgnoreCase(str2) && map2.containsKey("event_id");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zznG)).booleanValue() && (zzcurVar = this.zzg) != null) {
            zzcurVar.zzl();
        }
        HashMap hashMap = new HashMap();
        if (z8) {
            boolean z9 = z3;
            obj = "event_id";
            zzbjw zzbjwVar = new zzbjw(this, z9, zzaVar2, hashMap, map2);
            zzaVar2 = zzaVar2;
            map2 = map2;
            this.zzh = zzbjwVar;
        } else {
            boolean z10 = z3;
            obj = "event_id";
            z2 = z10;
        }
        if (intent != null) {
            if (!z7 || this.zze == null || !zzi(zzaVar2, zzcekVar.getContext(), intent.getData().toString(), str4)) {
                ((zzcga) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(intent, this.zzh), z2, z6, str4);
                return;
            } else {
                if (z8) {
                    hashMap.put((String) map2.get(obj), true);
                    ((zzbmh) zzaVar2).zze("openIntentAsync", hashMap);
                    return;
                }
                return;
            }
        }
        String uri = !TextUtils.isEmpty(str) ? zze(zzd(zzcekVar.getContext(), zzcekVar.zzS(), Uri.parse(str), zzcekVar.zzE(), zzcekVar.zzj(), zzcekVar.zzT())).toString() : str;
        if (!z7 || this.zze == null || !zzi(zzaVar2, zzcekVar.getContext(), uri, str4)) {
            ((zzcga) zzaVar2).zzaH(new com.google.android.gms.ads.internal.overlay.zzc((String) map2.get(ContextChain.TAG_INFRA), uri, (String) map2.get("m"), (String) map2.get(ContextChain.TAG_PRODUCT), (String) map2.get("c"), (String) map2.get("f"), (String) map2.get("e"), this.zzh), z2, z6, str4);
        } else if (z8) {
            hashMap.put((String) map2.get(obj), true);
            ((zzbmh) zzaVar2).zze("openIntentAsync", hashMap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzjn)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzji)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzjh)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        zzbtc zzbtcVar;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar;
        zzdsm zzdsmVar = this.zzb;
        if (zzdsmVar != null) {
            zzecy.zzd(context, zzdsmVar, this.zze, str2, "offline_open");
        }
        if (com.google.android.gms.ads.internal.zzt.zzh().zzs(context)) {
            if (this.zzc == null) {
                this.zzc = new com.google.android.gms.ads.internal.util.client.zzu(context.getApplicationContext(), null);
            }
            this.zze.zzc(this.zzc, str2);
            return false;
        }
        zzcek zzcekVar = (zzcek) zzaVar;
        zzfcj zzC = zzcekVar.zzC();
        boolean z = (zzC == null || (zzwVar = zzC.zzay) == null || zzwVar.zzc()) ? false : true;
        boolean z2 = (zzC == null || (zzbtcVar = zzC.zzad) == null || !zzbtcVar.zza || zzbtcVar.zzb == null || !zzbtcVar.zzc) ? false : true;
        if (!z) {
            if (z2) {
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzbo zzD = com.google.android.gms.ads.internal.util.zzs.zzD(context);
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean areNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
            boolean zzh = com.google.android.gms.ads.internal.zzt.zzf().zzh(context, "offline_notification_channel");
            boolean z3 = zzcekVar.zzN().zzg() && zzcekVar.zzj() == null;
            if (!areNotificationsEnabled) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (!NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                }
                zzj(context, str2, "notifications_disabled");
                return false;
            }
            if (zzh) {
                zzj(context, str2, "notification_channel_disabled");
                return false;
            }
            if (zzD == null) {
                zzj(context, str2, "work_manager_unavailable");
                return false;
            }
            if (z3) {
                zzj(context, str2, "ad_no_activity");
                return false;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjf)).booleanValue()) {
                zzj(context, str2, "notification_flow_disabled");
                return false;
            }
            if (zzcekVar.zzL() == null || zzcekVar.zzj() == null) {
                ((zzcga) zzaVar).zzaL(str2, str, 14);
            } else {
                zzecz zze = zzeda.zze();
                zze.zza(zzcekVar.zzj());
                zze.zzb(null);
                zze.zzc(str2);
                zze.zzd(str);
                try {
                    zzcekVar.zzL().zzG(zze.zze());
                } catch (Exception e) {
                    zzj(context, str2, e.getMessage());
                    return false;
                }
            }
            zzaVar.onAdClicked();
            return true;
        }
        zzdsm zzdsmVar2 = this.zzb;
        if (zzdsmVar2 != null) {
            zzecy.zzd(context, zzdsmVar2, this.zze, str2, "onfs");
        }
        return false;
    }

    private final void zzj(Context context, String str, String str2) {
        zzecn zzecnVar = this.zze;
        zzecnVar.zzd(str);
        zzdsm zzdsmVar = this.zzb;
        if (zzdsmVar != null) {
            zzecy.zzk(context, zzdsmVar, zzecnVar, str, "dialog_not_shown", zzgkc.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ff, code lost:
    
        if (com.google.android.gms.internal.ads.zzbjx.zzb(r13, r8, r9, r10, r11) == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014c, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzk(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2, boolean z3) {
        boolean z4;
        ResolveInfo zzc;
        zzcek zzcekVar;
        Intent zzd;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo zzb;
        zzl(true);
        zzcek zzcekVar2 = (zzcek) zzaVar;
        Context context = zzcekVar2.getContext();
        zzauu zzS = zzcekVar2.zzS();
        View zzE = zzcekVar2.zzE();
        zzfdg zzT = zzcekVar2.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            zzcekVar = zzcekVar2;
            zzd = null;
        } else {
            Uri zze = zze(zzd(context, zzS, Uri.parse(str2), zzE, null, zzT));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzeZ)).booleanValue()) {
                    z4 = false;
                    Uri build = !"http".equalsIgnoreCase(zze.getScheme()) ? zze.buildUpon().scheme("https").build() : "https".equalsIgnoreCase(zze.getScheme()) ? zze.buildUpon().scheme("http").build() : null;
                    ArrayList arrayList = new ArrayList();
                    Intent zza = zzbjx.zza(zze, context, zzS, zzE, zzT);
                    Intent zza2 = zzbjx.zza(build, context, zzS, zzE, zzT);
                    if (z4) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        com.google.android.gms.ads.internal.util.zzs.zzs(context, zza);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        com.google.android.gms.ads.internal.util.zzs.zzs(context, zza2);
                    }
                    zzc = zzbjx.zzc(zza, arrayList, context, zzS, zzE, zzT);
                    if (zzc == null) {
                        zzd = zzbjx.zzd(zza, zzc, context, zzS, zzE, zzT);
                    } else {
                        if (zza2 != null && (zzb = zzbjx.zzb(zza2, context, zzS, zzE, zzT)) != null) {
                            zzd = zzbjx.zzd(zza, zzb, context, zzS, zzE, zzT);
                        }
                        if (arrayList.isEmpty()) {
                            zzcekVar = zzcekVar2;
                        } else {
                            if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                                int size = arrayList.size();
                                int i = 0;
                                loop0: while (i < size) {
                                    ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                                    Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                                    while (true) {
                                        int i2 = i + 1;
                                        if (it.hasNext()) {
                                            zzcekVar = zzcekVar2;
                                            if (it.next().processName.equals(resolveInfo.activityInfo.packageName)) {
                                                zzd = zzbjx.zzd(zza, resolveInfo, context, zzS, zzE, zzT);
                                                break loop0;
                                            }
                                            zzcekVar2 = zzcekVar;
                                        }
                                    }
                                }
                            }
                            zzcekVar = zzcekVar2;
                            if (parseBoolean) {
                                zzd = zzbjx.zzd(zza, (ResolveInfo) arrayList.get(0), context, zzS, zzE, zzT);
                            }
                        }
                        zzd = zza;
                    }
                    zzcekVar = zzcekVar2;
                }
            }
            z4 = true;
            if (!"http".equalsIgnoreCase(zze.getScheme())) {
            }
            ArrayList arrayList2 = new ArrayList();
            Intent zza3 = zzbjx.zza(zze, context, zzS, zzE, zzT);
            Intent zza22 = zzbjx.zza(build, context, zzS, zzE, zzT);
            if (z4) {
            }
            zzc = zzbjx.zzc(zza3, arrayList2, context, zzS, zzE, zzT);
            if (zzc == null) {
            }
            zzcekVar = zzcekVar2;
        }
        if (!z || this.zze == null || zzd == null || !zzi(zzaVar, zzcekVar.getContext(), zzd.getData().toString(), str)) {
            try {
                ((zzcga) zzaVar).zzaH(new com.google.android.gms.ads.internal.overlay.zzc(zzd, this.zzh), z2, z3, str);
            } catch (ActivityNotFoundException e) {
                String message = e.getMessage();
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            }
        }
    }

    private final void zzl(boolean z) {
        zzbrv zzbrvVar = this.zzd;
        if (zzbrvVar != null) {
            zzbrvVar.zzb(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i) {
        zzdsm zzdsmVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfc)).booleanValue() || (zzdsmVar = this.zzb) == null) {
            return;
        }
        zzdsl zza = zzdsmVar.zza();
        zza.zzc("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zza.zzc("cct_open_status", str);
        zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcmi zzcmiVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzcek zzcekVar = (zzcek) zzaVar;
        if (zzcekVar.zzC() != null) {
            hashMap = zzcekVar.zzC().zzaw;
        }
        String zza = zzbxt.zza(str, zzcekVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzgot.zzq((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkQ)).booleanValue() && (zzcmiVar = this.zzf) != null && zzcmi.zzc(zza)) ? zzcmiVar.zzb(zza, com.google.android.gms.ads.internal.client.zzbb.zze()) : zzgot.zza(zza), new zzbju(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(zza);
        }
    }
}
