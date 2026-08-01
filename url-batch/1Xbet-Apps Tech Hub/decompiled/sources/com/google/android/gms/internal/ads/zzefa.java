package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.net.HttpHeaders;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzefa extends zzbth {
    private final Context zza;
    private final zzdtp zzb;
    private final zzcbs zzc;
    private final zzeep zzd;
    private final zzfje zze;
    private String zzf;
    private String zzg;

    public zzefa(Context context, zzeep zzeepVar, zzcbs zzcbsVar, zzdtp zzdtpVar, zzfje zzfjeVar) {
        this.zza = context;
        this.zzb = zzdtpVar;
        this.zzc = zzcbsVar;
        this.zzd = zzeepVar;
        this.zze = zzfjeVar;
    }

    public static void zzc(Context context, zzdtp zzdtpVar, zzfje zzfjeVar, zzeep zzeepVar, String str, String str2, Map map) {
        String zza;
        String str3 = true != com.google.android.gms.ads.internal.zzt.zzo().zzz(context) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zziv)).booleanValue() || zzdtpVar == null) {
            zzfjd zzb = zzfjd.zzb(str2);
            zzb.zza("gqi", str);
            zzb.zza("device_connectivity", str3);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzb.zza((String) entry.getKey(), (String) entry.getValue());
            }
            zza = zzfjeVar.zza(zzb);
        } else {
            zzdto zza2 = zzdtpVar.zza();
            zza2.zzb("gqi", str);
            zza2.zzb("action", str2);
            zza2.zzb("device_connectivity", str3);
            zza2.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            for (Map.Entry entry2 : map.entrySet()) {
                zza2.zzb((String) entry2.getKey(), (String) entry2.getValue());
            }
            zza = zza2.zzf();
        }
        zzeepVar.zzd(new zzeer(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), str, zza, 2));
    }

    public static final PendingIntent zzo(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzfre.zzb(context, 0, intent, zzfre.zza | 1073741824, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzfre.zza(context, 0, intent, 201326592);
    }

    private static String zzp(int i, String str) {
        Resources zze = com.google.android.gms.ads.internal.zzt.zzo().zze();
        return zze == null ? str : zze.getString(i);
    }

    private final void zzq(String str, String str2, Map map) {
        zzc(this.zza, this.zzb, this.zze, this.zzd, str, str2, map);
    }

    private final void zzr() {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzt.zzy(this.zza).zzf(ObjectWrapper.wrap(this.zza), this.zzg, this.zzf)) {
                return;
            }
        } catch (RemoteException e) {
            zzcbn.zzh("Failed to schedule offline notification poster.", e);
        }
        this.zzd.zzc(this.zzf);
        zzq(this.zzf, "offline_notification_worker_not_scheduled", zzfwx.zzd());
    }

    private final void zzs(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (NotificationManagerCompat.from(activity).areNotificationsEnabled()) {
            zzr();
            zzt(activity, zzlVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzq(this.zzf, "asnpdi", zzfwx.zzd());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzp();
            AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(activity);
            zzJ.setTitle(zzp(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzp(R.string.notifications_permission_confirm, HttpHeaders.ALLOW), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzees
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzefa.this.zzd(activity, zzlVar, dialogInterface, i);
                }
            }).setNegativeButton(zzp(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeet
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    zzefa.this.zzj(zzlVar, dialogInterface, i);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeeu
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    zzefa.this.zzk(zzlVar, dialogInterface);
                }
            });
            zzJ.create().show();
            zzq(this.zzf, "rtsdi", zzfwx.zzd());
        }
    }

    private final void zzt(Activity activity, final com.google.android.gms.ads.internal.overlay.zzl zzlVar) {
        String zzp = zzp(R.string.offline_opt_in_confirmation, "You'll get a notification with the link when you're back online");
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(activity);
        zzJ.setMessage(zzp).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeey
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzl zzlVar2 = com.google.android.gms.ads.internal.overlay.zzl.this;
                if (zzlVar2 != null) {
                    zzlVar2.zzb();
                }
            }
        });
        AlertDialog create = zzJ.create();
        create.show();
        Timer timer = new Timer();
        timer.schedule(new zzeez(this, create, timer, zzlVar), 3000L);
    }

    final /* synthetic */ void zzd(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzq(this.zzf, "rtsdc", hashMap);
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzq().zzg(activity));
        zzr();
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zzz = com.google.android.gms.ads.internal.zzt.zzo().zzz(this.zza);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == zzz ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.zza.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.zza.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zzq(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zzd.getWritableDatabase();
                if (r8 == 1) {
                    this.zzd.zzg(writableDatabase, this.zzc, stringExtra2);
                } else {
                    zzeep.zzi(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                zzcbn.zzg("Failed to get writable offline buffering database: ".concat(e.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzf(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                zzefc zzefcVar = (zzefc) ObjectWrapper.unwrap(iObjectWrapper);
                Activity zza = zzefcVar.zza();
                com.google.android.gms.ads.internal.overlay.zzl zzb = zzefcVar.zzb();
                HashMap hashMap = new HashMap();
                if (iArr[i] == 0) {
                    hashMap.put("dialog_action", "confirm");
                    zzr();
                    zzt(zza, zzb);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (zzb != null) {
                        zzb.zzb();
                    }
                }
                zzq(this.zzf, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzg(IObjectWrapper iObjectWrapper) {
        zzefc zzefcVar = (zzefc) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity zza = zzefcVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzl zzb = zzefcVar.zzb();
        this.zzf = zzefcVar.zzc();
        this.zzg = zzefcVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbdc.zzio)).booleanValue()) {
            zzs(zza, zzb);
            return;
        }
        zzq(this.zzf, "dialog_impression", zzfwx.zzd());
        com.google.android.gms.ads.internal.zzt.zzp();
        AlertDialog.Builder zzJ = com.google.android.gms.ads.internal.util.zzt.zzJ(zza);
        zzJ.setTitle(zzp(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzp(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzp(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeev
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzefa.this.zzl(zza, zzb, dialogInterface, i);
            }
        }).setNegativeButton(zzp(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzeew
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzefa.this.zzm(zzb, dialogInterface, i);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzeex
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzefa.this.zzn(zzb, dialogInterface);
            }
        });
        zzJ.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzh() {
        final zzcbs zzcbsVar = this.zzc;
        this.zzd.zze(new zzfhx() { // from class: com.google.android.gms.internal.ads.zzeei
            @Override // com.google.android.gms.internal.ads.zzfhx
            public final Object zza(Object obj) {
                zzeep.zzb(zzcbs.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbti
    public final void zzi(IObjectWrapper iObjectWrapper, String str, String str2) {
        String str3;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        com.google.android.gms.ads.internal.zzt.zzq().zzh(context, "offline_notification_channel", "AdMob Offline Notifications");
        NotificationCompat.Builder smallIcon = new NotificationCompat.Builder(context, "offline_notification_channel").setContentTitle(zzp(R.string.offline_notification_title, "View the ad you saved when you were offline")).setContentText(zzp(R.string.offline_notification_text, "Tap to open ad")).setAutoCancel(true).setDeleteIntent(zzo(context, "offline_notification_dismissed", str2, str)).setContentIntent(zzo(context, "offline_notification_clicked", str2, str)).setSmallIcon(context.getApplicationInfo().icon);
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap = new HashMap();
        try {
            notificationManager.notify(str2, 54321, smallIcon.build());
            str3 = "offline_notification_impression";
        } catch (IllegalArgumentException e) {
            hashMap.put("notification_not_shown_reason", e.getMessage());
            str3 = "offline_notification_failed";
        }
        zzq(str2, str3, hashMap);
    }

    final /* synthetic */ void zzj(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzq(this.zzf, "rtsdc", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    final /* synthetic */ void zzk(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzq(this.zzf, "rtsdc", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "confirm");
        zzq(this.zzf, "dialog_click", hashMap);
        zzs(activity, zzlVar);
    }

    final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface, int i) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzq(this.zzf, "dialog_click", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }

    final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzl zzlVar, DialogInterface dialogInterface) {
        this.zzd.zzc(this.zzf);
        HashMap hashMap = new HashMap();
        hashMap.put("dialog_action", "dismiss");
        zzq(this.zzf, "dialog_click", hashMap);
        if (zzlVar != null) {
            zzlVar.zzb();
        }
    }
}
