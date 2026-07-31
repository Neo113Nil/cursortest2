package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationChannel;
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
import com.google.android.gms.ads.AdService;
import j.e;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes.dex */
public final class w42 extends mg0 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f13709f;

    /* renamed from: g, reason: collision with root package name */
    private final wv1 f13710g;

    /* renamed from: h, reason: collision with root package name */
    private final oo0 f13711h;

    /* renamed from: i, reason: collision with root package name */
    private final o42 f13712i;

    /* renamed from: j, reason: collision with root package name */
    private final xw2 f13713j;

    public w42(Context context, o42 o42Var, oo0 oo0Var, wv1 wv1Var, xw2 xw2Var) {
        this.f13709f = context;
        this.f13710g = wv1Var;
        this.f13711h = oo0Var;
        this.f13712i = o42Var;
        this.f13713j = xw2Var;
    }

    public static void t6(Context context, wv1 wv1Var, xw2 xw2Var, o42 o42Var, String str, String str2) {
        u6(context, wv1Var, xw2Var, o42Var, str, str2, new HashMap());
    }

    public static void u6(Context context, wv1 wv1Var, xw2 xw2Var, o42 o42Var, String str, String str2, Map<String, String> map) {
        String e7;
        if (((Boolean) sw.c().b(m10.f8287q6)).booleanValue()) {
            ww2 b7 = ww2.b(str2);
            b7.a("gqi", str);
            y2.t.q();
            b7.a("device_connectivity", true == a3.g2.j(context) ? "online" : "offline");
            b7.a("event_timestamp", String.valueOf(y2.t.a().b()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b7.a(entry.getKey(), entry.getValue());
            }
            e7 = xw2Var.b(b7);
        } else {
            vv1 a7 = wv1Var.a();
            a7.b("gqi", str);
            a7.b("action", str2);
            y2.t.q();
            a7.b("device_connectivity", true == a3.g2.j(context) ? "online" : "offline");
            a7.b("event_timestamp", String.valueOf(y2.t.a().b()));
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                a7.b(entry2.getKey(), entry2.getValue());
            }
            e7 = a7.e();
        }
        o42Var.i(new q42(y2.t.a().b(), str, e7, 2));
    }

    public static void v6(final Activity activity, final z2.o oVar, final a3.x0 x0Var, final o42 o42Var, final wv1 wv1Var, final xw2 xw2Var, final String str, final String str2) {
        y2.t.q();
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, y2.t.r().k());
        final Resources d7 = y2.t.p().d();
        builder.setTitle(d7 == null ? "Open ad when you're back online." : d7.getString(w2.b.f23006g)).setMessage(d7 == null ? "We'll send you a notification with a link to the advertiser site." : d7.getString(w2.b.f23005f)).setPositiveButton(d7 == null ? "OK" : d7.getString(w2.b.f23002c), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.t42
            /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
            
                if (r0.zzf(x3.b.B3(r10), r14, r13) == false) goto L11;
             */
            @Override // android.content.DialogInterface.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onClick(DialogInterface dialogInterface, int i7) {
                final z2.o oVar2;
                wv1 wv1Var2 = wv1.this;
                Activity activity2 = activity;
                xw2 xw2Var2 = xw2Var;
                o42 o42Var2 = o42Var;
                String str3 = str;
                a3.x0 x0Var2 = x0Var;
                String str4 = str2;
                Resources resources = d7;
                z2.o oVar3 = oVar;
                if (wv1Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "confirm");
                    oVar2 = oVar3;
                    w42.u6(activity2, wv1Var2, xw2Var2, o42Var2, str3, "dialog_click", hashMap);
                } else {
                    oVar2 = oVar3;
                }
                try {
                } catch (RemoteException e7) {
                    io0.e("Failed to schedule offline notification poster.", e7);
                }
                o42Var2.h(str3);
                if (wv1Var2 != null) {
                    w42.t6(activity2, wv1Var2, xw2Var2, o42Var2, str3, "offline_notification_worker_not_scheduled");
                }
                y2.t.q();
                AlertDialog.Builder builder2 = new AlertDialog.Builder(activity2, y2.t.r().k());
                builder2.setMessage(resources == null ? "You'll get a notification with the link when you're back online" : resources.getString(w2.b.f23003d)).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.r42
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        z2.o oVar4 = z2.o.this;
                        if (oVar4 != null) {
                            oVar4.a();
                        }
                    }
                });
                AlertDialog create = builder2.create();
                create.show();
                Timer timer = new Timer();
                timer.schedule(new v42(create, timer, oVar2), 3000L);
            }
        }).setNegativeButton(d7 == null ? "No thanks" : d7.getString(w2.b.f23004e), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.u42
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i7) {
                o42 o42Var2 = o42.this;
                String str3 = str;
                wv1 wv1Var2 = wv1Var;
                Activity activity2 = activity;
                xw2 xw2Var2 = xw2Var;
                z2.o oVar2 = oVar;
                o42Var2.h(str3);
                if (wv1Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    w42.u6(activity2, wv1Var2, xw2Var2, o42Var2, str3, "dialog_click", hashMap);
                }
                if (oVar2 != null) {
                    oVar2.a();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.s42
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                o42 o42Var2 = o42.this;
                String str3 = str;
                wv1 wv1Var2 = wv1Var;
                Activity activity2 = activity;
                xw2 xw2Var2 = xw2Var;
                z2.o oVar2 = oVar;
                o42Var2.h(str3);
                if (wv1Var2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    w42.u6(activity2, wv1Var2, xw2Var2, o42Var2, str3, "dialog_click", hashMap);
                }
                if (oVar2 != null) {
                    oVar2.a();
                }
            }
        });
        builder.create().show();
    }

    private final void w6(String str, String str2, Map<String, String> map) {
        u6(this.f13709f, this.f13710g, this.f13713j, this.f13712i, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final void R0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            y2.t.q();
            boolean j7 = a3.g2.j(this.f13709f);
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                r8 = true == j7 ? (char) 1 : (char) 2;
                hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Context context = this.f13709f;
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    context.startActivity(launchIntentForPackage);
                    hashMap.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    hashMap.put("olaa", "olaf");
                }
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            w6(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.f13712i.getWritableDatabase();
                if (r8 == 1) {
                    this.f13712i.v(writableDatabase, this.f13711h, stringExtra2);
                } else {
                    o42.x(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e7) {
                io0.d("Failed to get writable offline buffering database: ".concat(e7.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final void d() {
        o42 o42Var = this.f13712i;
        final oo0 oo0Var = this.f13711h;
        o42Var.q(new pv2() { // from class: com.google.android.gms.internal.ads.h42
            @Override // com.google.android.gms.internal.ads.pv2
            public final Object c(Object obj) {
                o42.f(oo0.this, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.ng0
    public final void t5(x3.a aVar, String str, String str2) {
        Context context = (Context) x3.b.O0(aVar);
        y2.t.q();
        if (v3.l.j()) {
            NotificationChannel notificationChannel = new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
            notificationChannel.setShowBadge(false);
            ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(notificationChannel);
        }
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        int i7 = u33.f12618a;
        PendingIntent a7 = u33.a(context, 0, intent, i7 | 1073741824, 0);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent a8 = u33.a(context, 0, intent2, i7 | 1073741824, 0);
        Resources d7 = y2.t.p().d();
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, new e.d(context, "offline_notification_channel").o(d7 == null ? "View the ad you saved when you were offline" : d7.getString(w2.b.f23001b)).n(d7 == null ? "Tap to open ad" : d7.getString(w2.b.f23000a)).j(true).p(a8).m(a7).w(context.getApplicationInfo().icon).c());
        w6(str2, "offline_notification_impression", new HashMap());
    }
}
