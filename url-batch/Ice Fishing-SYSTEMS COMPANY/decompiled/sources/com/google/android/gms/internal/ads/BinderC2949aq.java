package com.google.android.gms.internal.ads;

import D.C0298s;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.icefishing.icefishingliveapp.C5284R;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import r2.C4957a;
import s2.BinderC4996d;

/* renamed from: com.google.android.gms.internal.ads.aq, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2949aq extends AbstractBinderC3186f8 implements InterfaceC3101de {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f29329A = 0;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f29330n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f29331u;

    /* renamed from: v, reason: collision with root package name */
    public final C3165eo f29332v;

    /* renamed from: w, reason: collision with root package name */
    public final u2.l f29333w;

    /* renamed from: x, reason: collision with root package name */
    public final C2834Vp f29334x;

    /* renamed from: y, reason: collision with root package name */
    public String f29335y;

    /* renamed from: z, reason: collision with root package name */
    public String f29336z;

    public BinderC2949aq(Context context, C2834Vp c2834Vp, u2.l lVar, C3165eo c3165eo) {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        this.f29330n = new HashMap();
        this.f29331u = context;
        this.f29332v = c3165eo;
        this.f29333w = lVar;
        this.f29334x = c2834Vp;
    }

    public static void H3(Context context, C3165eo c3165eo, C2834Vp c2834Vp, String str, String str2, Map map) {
        String str3;
        p2.j jVar = p2.j.f39798C;
        String str4 = true != jVar.f39808h.i(context) ? "offline" : "online";
        if (c3165eo != null) {
            C2593Hm a9 = c3165eo.a();
            a9.r("gqi", str);
            a9.r(NativeAdvancedJsUtils.f18064p, str2);
            a9.r("device_connectivity", str4);
            jVar.f39810k.getClass();
            a9.r("event_timestamp", String.valueOf(System.currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                a9.r((String) entry.getKey(), (String) entry.getValue());
            }
            str3 = ((C3165eo) a9.f25416u).f30506a.f32003f.a((ConcurrentHashMap) a9.f25417v);
        } else {
            str3 = "";
        }
        String str5 = str3;
        p2.j.f39798C.f39810k.getClass();
        C3614n5 c3614n5 = new C3614n5(str, str5, 2, System.currentTimeMillis());
        c2834Vp.getClass();
        c2834Vp.a(new C2593Hm(9, c2834Vp, c3614n5));
    }

    public static final PendingIntent I3(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return PendingIntent.getService(context, 0, AbstractC4212yA.a(1140850688, intent), 1140850688);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return PendingIntent.getActivity(context, 0, AbstractC4212yA.a(201326592, intent), 201326592);
    }

    public static String N3(int i, String str) {
        Resources c4 = p2.j.f39798C.f39808h.c();
        if (c4 != null) {
            try {
                return c4.getString(i);
            } catch (Resources.NotFoundException unused) {
            }
        }
        return str;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Intent intent = (Intent) AbstractC3241g8.b(parcel, Intent.CREATOR);
                AbstractC3241g8.f(parcel);
                q0(intent);
                break;
            case 2:
                V2.a u02 = V2.b.u0(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                AbstractC3241g8.f(parcel);
                h3(u02, new C4957a(readString, readString2, ""));
                break;
            case 3:
                e();
                break;
            case 4:
                V2.a u03 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                Q(u03);
                break;
            case 5:
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                V2.a u04 = V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                Z2(createStringArray, createIntArray, u04);
                break;
            case 6:
                V2.a u05 = V2.b.u0(parcel.readStrongBinder());
                C4957a c4957a = (C4957a) AbstractC3241g8.b(parcel, C4957a.CREATOR);
                AbstractC3241g8.f(parcel);
                h3(u05, c4957a);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void G3(String str, C3917sm c3917sm) {
        InterfaceC3637nb interfaceC3637nb;
        String f6 = c3917sm.f();
        String a9 = c3917sm.a();
        String str2 = "";
        if (TextUtils.isEmpty(f6)) {
            f6 = a9 != null ? a9 : "";
        }
        InterfaceC3637nb b9 = c3917sm.b();
        if (b9 != null) {
            try {
                str2 = b9.i().toString();
            } catch (RemoteException unused) {
            }
        }
        synchronized (c3917sm) {
            interfaceC3637nb = c3917sm.f34292s;
        }
        Drawable drawable = null;
        if (interfaceC3637nb != null) {
            try {
                V2.a d2 = interfaceC3637nb.d();
                if (d2 != null) {
                    drawable = (Drawable) V2.b.A0(d2);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f29330n.put(str, new C2800Tp(f6, str2, drawable));
    }

    public final void J3(Activity activity, BinderC4996d binderC4996d) {
        t2.G g9 = p2.j.f39798C.f39803c;
        if (D.I.a(new D.N(activity).f516b)) {
            K3();
            L3(activity, binderC4996d);
            return;
        }
        int i = Build.VERSION.SDK_INT;
        C3944tC c3944tC = C3944tC.f34377z;
        if (i >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            M3(this.f29335y, "asnpdi", c3944tC);
        } else {
            AlertDialog.Builder k6 = t2.G.k(activity);
            k6.setTitle(N3(C5284R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(N3(C5284R.string.notifications_permission_confirm, "Allow"), new DialogInterfaceOnClickListenerC2902Zp(this, activity, binderC4996d, 0)).setNegativeButton(N3(C5284R.string.notifications_permission_decline, "Don't allow"), new DialogInterfaceOnClickListenerC2868Xp(1, this, binderC4996d)).setOnCancelListener(new DialogInterfaceOnCancelListenerC2885Yp(this, binderC4996d, 1));
            k6.create().show();
            M3(this.f29335y, "rtsdi", c3944tC);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K3() {
        boolean z8;
        boolean z9;
        try {
            t2.G g9 = p2.j.f39798C.f39803c;
            Context context = this.f29331u;
            t2.u b9 = t2.G.b(context);
            V2.b bVar = new V2.b(context);
            String str = this.f29336z;
            String str2 = this.f29335y;
            C2800Tp c2800Tp = (C2800Tp) this.f29330n.get(str2);
            z8 = b9.zzg(bVar, new C4957a(str, str2, c2800Tp == null ? "" : c2800Tp.f27839b));
            if (z8) {
                z9 = true;
            } else {
                try {
                    z9 = b9.zze(new V2.b(context), this.f29336z, this.f29335y);
                } catch (RemoteException e6) {
                    e = e6;
                    int i = t2.C.f40822b;
                    u2.i.d("Failed to schedule offline notification poster.", e);
                    z9 = z8;
                    if (z9) {
                    }
                }
            }
        } catch (RemoteException e9) {
            e = e9;
            z8 = false;
        }
        if (z9) {
            this.f29334x.g(this.f29335y);
            M3(this.f29335y, "offline_notification_worker_not_scheduled", C3944tC.f34377z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L3(Activity activity, BinderC4996d binderC4996d) {
        XmlResourceParser layout;
        AlertDialog create;
        p2.j jVar = p2.j.f39798C;
        t2.G g9 = jVar.f39803c;
        AlertDialog.Builder onCancelListener = t2.G.k(activity).setOnCancelListener(new DialogInterfaceOnCancelListenerC3589mh(2, binderC4996d));
        Resources c4 = jVar.f39808h.c();
        if (c4 != null) {
            try {
                layout = c4.getLayout(C5284R.layout.offline_ads_dialog);
            } catch (Resources.NotFoundException unused) {
            }
            if (layout != null) {
                onCancelListener.setMessage(N3(C5284R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                create = onCancelListener.create();
            } else {
                try {
                    View inflate = activity.getLayoutInflater().inflate(layout, (ViewGroup) null);
                    onCancelListener.setView(inflate);
                    HashMap hashMap = this.f29330n;
                    C2800Tp c2800Tp = (C2800Tp) hashMap.get(this.f29335y);
                    String str = c2800Tp == null ? "" : c2800Tp.f27838a;
                    if (!TextUtils.isEmpty(str)) {
                        TextView textView = (TextView) inflate.findViewById(C5284R.id.offline_dialog_advertiser_name);
                        textView.setVisibility(0);
                        textView.setText(str);
                    }
                    C2800Tp c2800Tp2 = (C2800Tp) hashMap.get(this.f29335y);
                    Drawable drawable = c2800Tp2 != null ? c2800Tp2.f27840c : null;
                    if (drawable != null) {
                        ((ImageView) inflate.findViewById(C5284R.id.offline_dialog_image)).setImageDrawable(drawable);
                    }
                    create = onCancelListener.create();
                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                } catch (Resources.NotFoundException unused2) {
                    onCancelListener.setMessage(N3(C5284R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
                    create = onCancelListener.create();
                }
            }
            create.show();
            Timer timer = new Timer();
            timer.schedule(new C2851Wp(this, create, timer, binderC4996d), com.anythink.expressad.video.module.a.a.m.ai);
        }
        layout = null;
        if (layout != null) {
        }
        create.show();
        Timer timer2 = new Timer();
        timer2.schedule(new C2851Wp(this, create, timer2, binderC4996d), com.anythink.expressad.video.module.a.a.m.ai);
    }

    public final void M3(String str, String str2, Map map) {
        H3(this.f29331u, this.f29332v, this.f29334x, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101de
    public final void Q(V2.a aVar) {
        C2817Up c2817Up = (C2817Up) V2.b.A0(aVar);
        Activity activity = c2817Up.f28087a;
        this.f29335y = c2817Up.f28089c;
        this.f29336z = c2817Up.f28090d;
        boolean booleanValue = ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.F9)).booleanValue();
        BinderC4996d binderC4996d = c2817Up.f28088b;
        if (booleanValue) {
            J3(activity, binderC4996d);
            return;
        }
        M3(this.f29335y, "dialog_impression", C3944tC.f34377z);
        t2.G g9 = p2.j.f39798C.f39803c;
        AlertDialog.Builder k6 = t2.G.k(activity);
        k6.setTitle(N3(C5284R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(N3(C5284R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(N3(C5284R.string.offline_opt_in_confirm, "OK"), new DialogInterfaceOnClickListenerC2902Zp(this, activity, binderC4996d, 1)).setNegativeButton(N3(C5284R.string.offline_opt_in_decline, "No thanks"), new DialogInterfaceOnClickListenerC2868Xp(0, this, binderC4996d)).setOnCancelListener(new DialogInterfaceOnCancelListenerC2885Yp(this, binderC4996d, 0));
        k6.create().show();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101de
    public final void Z2(String[] strArr, int[] iArr, V2.a aVar) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("android.permission.POST_NOTIFICATIONS")) {
                C2817Up c2817Up = (C2817Up) V2.b.A0(aVar);
                Activity activity = c2817Up.f28087a;
                HashMap hashMap = new HashMap();
                int i4 = iArr[i];
                BinderC4996d binderC4996d = c2817Up.f28088b;
                if (i4 == 0) {
                    hashMap.put("dialog_action", "confirm");
                    K3();
                    L3(activity, binderC4996d);
                } else {
                    hashMap.put("dialog_action", "dismiss");
                    if (binderC4996d != null) {
                        binderC4996d.z();
                    }
                }
                M3(this.f29335y, "asnpdc", hashMap);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101de
    public final void e() {
        this.f29334x.a(new Rx(29, this.f29333w));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(1:3)(1:32)|4|(1:6)(1:31)|7|(2:9|(9:11|12|(2:24|25)|14|15|16|17|18|19))|30|(0)|14|15|16|17|18|19) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ea, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
    
        r9.put("notification_not_shown_reason", r8.getMessage());
        r8 = "offline_notification_failed";
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3101de
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h3(V2.a aVar, C4957a c4957a) {
        Bitmap bitmap;
        Context context = (Context) V2.b.A0(aVar);
        String str = c4957a.f40278n;
        C2800Tp c2800Tp = (C2800Tp) this.f29330n.get(this.f29335y);
        String str2 = c2800Tp == null ? "" : c2800Tp.f27838a;
        p2.j.f39798C.f39806f.A(context);
        String str3 = c4957a.f40279u;
        PendingIntent I32 = I3(context, "offline_notification_clicked", str3, str);
        PendingIntent I33 = I3(context, "offline_notification_dismissed", str3, str);
        D.v vVar = new D.v(context, "offline_notification_channel");
        if (TextUtils.isEmpty(str2)) {
            vVar.f553e = D.v.b(N3(C5284R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            vVar.f553e = D.v.b(String.format(N3(C5284R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), str2));
        }
        vVar.d(16, true);
        vVar.f569v.deleteIntent = I33;
        vVar.f555g = I32;
        vVar.f569v.icon = context.getApplicationInfo().icon;
        C3151ea c3151ea = AbstractC3368ia.G9;
        q2.r rVar = q2.r.f40116e;
        vVar.f557j = ((Integer) rVar.f40119c.a(c3151ea)).intValue();
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.I9)).booleanValue()) {
            String str4 = c4957a.f40280v;
            if (!str4.isEmpty()) {
                try {
                    bitmap = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
                } catch (IOException unused) {
                }
                if (bitmap != null) {
                    try {
                        vVar.e(bitmap);
                        C0298s c0298s = new C0298s();
                        IconCompat iconCompat = new IconCompat(1);
                        iconCompat.f4805b = bitmap;
                        c0298s.f544e = iconCompat;
                        c0298s.f545f = null;
                        c0298s.f546g = true;
                        vVar.g(c0298s);
                    } catch (Resources.NotFoundException unused2) {
                    }
                }
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                HashMap hashMap = new HashMap();
                notificationManager.notify(str3, 54321, vVar.a());
                String str5 = "offline_notification_impression";
                M3(str3, str5, hashMap);
            }
        }
        bitmap = null;
        if (bitmap != null) {
        }
        NotificationManager notificationManager2 = (NotificationManager) context.getSystemService("notification");
        HashMap hashMap2 = new HashMap();
        notificationManager2.notify(str3, 54321, vVar.a());
        String str52 = "offline_notification_impression";
        M3(str3, str52, hashMap2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3101de
    public final void q0(Intent intent) {
        C2834Vp c2834Vp = this.f29334x;
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                C2892Zf c2892Zf = p2.j.f39798C.f39808h;
                Context context = this.f29331u;
                boolean i = c2892Zf.i(context);
                HashMap hashMap = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    hashMap.put("offline_notification_action", "offline_notification_clicked");
                    r10 = true == i ? (char) 1 : (char) 2;
                    hashMap.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    hashMap.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
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
                M3(stringExtra2, "offline_notification_action", hashMap);
                try {
                    SQLiteDatabase writableDatabase = c2834Vp.getWritableDatabase();
                    if (r10 == 1) {
                        c2834Vp.f28310u.execute(new RunnableC3771q0(writableDatabase, stringExtra2, this.f29333w, 7));
                    } else {
                        writableDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{stringExtra2, Integer.toString(0)});
                    }
                } catch (SQLiteException e6) {
                    String concat = "Failed to get writable offline buffering database: ".concat(e6.toString());
                    int i4 = t2.C.f40822b;
                    u2.i.c(concat);
                }
            }
        }
    }
}
