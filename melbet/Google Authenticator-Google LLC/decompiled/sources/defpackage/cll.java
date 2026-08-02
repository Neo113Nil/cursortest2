package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cll extends clm {
    private static volatile Boolean f;
    private crr g;
    private static final Object e = new Object();
    public static final cll a = new cll();
    public static final int b = clm.c;

    public final PendingIntent a(Context context, clg clgVar) {
        return clgVar.b() ? clgVar.d : super.n(context, clgVar.c, null);
    }

    public final ddi b(cmw cmwVar, cmw... cmwVarArr) {
        return c(ddl.a, cmwVar, cmwVarArr);
    }

    public final ddi c(Executor executor, cmw cmwVar, cmw... cmwVarArr) {
        cog cogVar;
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(cmwVar);
        arrayList.addAll(Arrays.asList(cmwVarArr));
        synchronized (cog.c) {
            oy.au(cog.d, "Must guarantee manager is non-null before using getInstance");
            cogVar = cog.d;
        }
        gam gamVar = new gam(arrayList);
        Handler handler = cogVar.o;
        handler.sendMessage(handler.obtainMessage(2, gamVar));
        Object obj = gamVar.a;
        return ((ddi) ((bst) obj).a).b(executor, new clj());
    }

    public final void d(Context context, clg clgVar, boolean z) {
        Integer num = clgVar.f;
        cpp cppVar = new cpp(num == null ? -1 : num.intValue(), context.getPackageName(), System.currentTimeMillis(), clgVar.c, z);
        crr crrVar = this.g;
        if (crrVar == null) {
            crrVar = new crr(context);
            this.g = crrVar;
        }
        crrVar.a(cppVar);
    }

    public final void e(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof bg) {
                by a2 = ((bg) activity).a();
                cmf cmfVar = new cmf();
                oy.au(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener(null);
                dialog.setOnDismissListener(null);
                cmfVar.aj = dialog;
                if (onCancelListener != null) {
                    cmfVar.ak = onCancelListener;
                }
                cmfVar.o(a2, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        clh clhVar = new clh();
        oy.au(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        clhVar.a = dialog;
        if (onCancelListener != null) {
            clhVar.b = onCancelListener;
        }
        clhVar.show(fragmentManager, str);
    }

    public final boolean f(int i) {
        if (i == 9) {
            return true;
        }
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                switch (i) {
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        return true;
                    default:
                        return false;
                }
        }
    }

    public final Dialog g(Context context, int i, cqa cqaVar, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(cpu.b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        String string = i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(com.google.android.apps.authenticator2.R.string.common_google_play_services_enable_button) : resources.getString(com.google.android.apps.authenticator2.R.string.common_google_play_services_update_button) : resources.getString(com.google.android.apps.authenticator2.R.string.common_google_play_services_install_button);
        if (string != null) {
            builder.setPositiveButton(string, cqaVar);
        }
        String c = cpu.c(context, i);
        if (c != null) {
            builder.setTitle(c);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i)), new IllegalArgumentException());
        return builder.create();
    }

    public final void h(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog g = g(activity, i, new cpy(m(activity, i, "d"), activity, i2), onCancelListener);
        if (g == null) {
            return;
        }
        e(activity, g, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void i(Context context, int i) {
        j(context, new clg(1, i, super.n(context, i, "n"), null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Context context, clg clgVar) {
        int i;
        String c;
        NotificationChannel notificationChannel;
        CharSequence name;
        boolean z;
        int i2;
        Bundle bundle;
        ArrayList arrayList;
        int i3;
        Icon icon;
        Icon createWithBitmap;
        String str;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        Object obj = e;
        synchronized (obj) {
            if (f == null) {
                f = false;
            }
        }
        int i4 = clgVar.c;
        f.booleanValue();
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, methodKey=%d, tag=%s", Integer.valueOf(i4), clgVar.f, null), new IllegalArgumentException());
        if (i4 == 18) {
            new clk(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        PendingIntent pendingIntent = clgVar.d;
        if (pendingIntent == null) {
            if (i4 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i4 == 6) {
            c = cpu.e(context, "common_google_play_services_resolution_required_title");
            i = 6;
        } else {
            i = i4;
            c = cpu.c(context, i4);
        }
        if (c == null) {
            c = context.getResources().getString(com.google.android.apps.authenticator2.R.string.common_google_play_services_try_again_title);
        }
        String d = (i == 6 || i == 19) ? cpu.d(context, "common_google_play_services_resolution_required_text", cpu.a(context)) : cpu.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        oy.at(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        ui uiVar = new ui(context);
        uiVar.j = true;
        Notification notification = uiVar.m;
        notification.flags |= 16;
        uiVar.e = ui.b(c);
        uh uhVar = new uh();
        uhVar.a = ui.b(d);
        uiVar.d(uhVar);
        boolean c2 = csk.c(context);
        int i5 = R.drawable.stat_sys_warning;
        if (c2) {
            int i6 = context.getApplicationInfo().icon;
            if (i6 != 0) {
                i5 = i6;
            }
            uiVar.c(i5);
            uiVar.h = 2;
            if (csk.e(context)) {
                uiVar.b.add(new ug(IconCompat.c(2131230899), resources.getString(com.google.android.apps.authenticator2.R.string.common_open_on_phone), pendingIntent, new Bundle()));
            } else {
                uiVar.g = pendingIntent;
            }
        } else {
            uiVar.c(R.drawable.stat_sys_warning);
            notification.tickerText = ui.b(resources.getString(com.google.android.apps.authenticator2.R.string.common_google_play_services_notification_ticker));
            notification.when = System.currentTimeMillis();
            uiVar.g = pendingIntent;
            uiVar.f = ui.b(d);
        }
        synchronized (obj) {
        }
        notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string = context.getResources().getString(com.google.android.apps.authenticator2.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
        } else {
            name = notificationChannel.getName();
            if (!string.contentEquals(name)) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        uiVar.l = "com.google.android.gms.availability";
        Bundle bundle2 = new Bundle();
        Notification.Builder builder = new Notification.Builder(uiVar.a, uiVar.l);
        Notification notification2 = uiVar.m;
        builder.setWhen(notification2.when).setSmallIcon(notification2.icon, notification2.iconLevel).setContent(notification2.contentView).setTicker(notification2.tickerText, null).setVibrate(notification2.vibrate).setLights(notification2.ledARGB, notification2.ledOnMS, notification2.ledOffMS).setOngoing((notification2.flags & 2) != 0).setOnlyAlertOnce((notification2.flags & 8) != 0).setAutoCancel((notification2.flags & 16) != 0).setDefaults(notification2.defaults).setContentTitle(uiVar.e).setContentText(uiVar.f).setContentInfo(null).setContentIntent(uiVar.g).setDeleteIntent(notification2.deleteIntent).setFullScreenIntent(null, (notification2.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(uiVar.h);
        ArrayList arrayList2 = uiVar.b;
        int size = arrayList2.size();
        int i7 = 0;
        while (i7 < size) {
            ug ugVar = (ug) arrayList2.get(i7);
            IconCompat a2 = ugVar.a();
            if (a2 != null) {
                int i8 = a2.b;
                switch (i8) {
                    case -1:
                        arrayList = arrayList2;
                        i3 = size;
                        icon = (Icon) a2.c;
                        break;
                    case 0:
                    default:
                        throw new IllegalArgumentException("Unknown type");
                    case 1:
                        arrayList = arrayList2;
                        i3 = size;
                        createWithBitmap = Icon.createWithBitmap((Bitmap) a2.c);
                        colorStateList = a2.h;
                        if (colorStateList != null) {
                            createWithBitmap.setTintList(colorStateList);
                        }
                        mode = a2.i;
                        if (mode != IconCompat.a) {
                            createWithBitmap.setTintMode(mode);
                        }
                        icon = createWithBitmap;
                        break;
                    case 2:
                        arrayList = arrayList2;
                        i3 = size;
                        if (i8 == -1) {
                            str = ((Icon) a2.c).getResPackage();
                        } else {
                            if (i8 != 2) {
                                Objects.toString(a2);
                                throw new IllegalStateException("called getResPackage() on ".concat(a2.toString()));
                            }
                            String str2 = a2.k;
                            str = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) a2.c).split(":", -1)[0] : a2.k;
                        }
                        createWithBitmap = Icon.createWithResource(str, a2.f);
                        colorStateList = a2.h;
                        if (colorStateList != null) {
                        }
                        mode = a2.i;
                        if (mode != IconCompat.a) {
                        }
                        icon = createWithBitmap;
                        break;
                    case 3:
                        arrayList = arrayList2;
                        i3 = size;
                        createWithBitmap = Icon.createWithData((byte[]) a2.c, a2.f, a2.g);
                        colorStateList = a2.h;
                        if (colorStateList != null) {
                        }
                        mode = a2.i;
                        if (mode != IconCompat.a) {
                        }
                        icon = createWithBitmap;
                        break;
                    case 4:
                        arrayList = arrayList2;
                        createWithBitmap = Icon.createWithContentUri((String) a2.c);
                        i3 = size;
                        colorStateList = a2.h;
                        if (colorStateList != null) {
                        }
                        mode = a2.i;
                        if (mode != IconCompat.a) {
                        }
                        icon = createWithBitmap;
                        break;
                    case 5:
                        arrayList = arrayList2;
                        createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) a2.c);
                        i3 = size;
                        colorStateList = a2.h;
                        if (colorStateList != null) {
                        }
                        mode = a2.i;
                        if (mode != IconCompat.a) {
                        }
                        icon = createWithBitmap;
                        break;
                    case 6:
                        arrayList = arrayList2;
                        if (Build.VERSION.SDK_INT < 30) {
                            Uri b2 = a2.b();
                            Objects.toString(b2);
                            throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(b2)));
                        }
                        createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(a2.b());
                        i3 = size;
                        colorStateList = a2.h;
                        if (colorStateList != null) {
                        }
                        mode = a2.i;
                        if (mode != IconCompat.a) {
                        }
                        icon = createWithBitmap;
                        break;
                        break;
                }
            } else {
                arrayList = arrayList2;
                i3 = size;
                icon = null;
            }
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, ugVar.e, ugVar.f);
            oy[] oyVarArr = ugVar.g;
            Bundle bundle3 = new Bundle(ugVar.a);
            boolean z2 = ugVar.b;
            bundle3.putBoolean("android.support.allowGeneratedReplies", true);
            boolean z3 = ugVar.b;
            builder2.setAllowGeneratedReplies(true);
            bundle3.putInt("android.support.action.semanticAction", 0);
            builder2.setSemanticAction(0);
            if (Build.VERSION.SDK_INT >= 29) {
                builder2.setContextual(false);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                builder2.setAuthenticationRequired(false);
            }
            if (Build.VERSION.SDK_INT >= 37) {
                builder2.setEmphasisHint(0);
                builder2.setStyleHint(0);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", ugVar.c);
            builder2.addExtras(bundle3);
            builder.addAction(builder2.build());
            i7++;
            arrayList2 = arrayList;
            size = i3;
        }
        Bundle bundle4 = uiVar.k;
        if (bundle4 != null) {
            bundle2.putAll(bundle4);
        }
        builder.setShowWhen(true);
        builder.setLocalOnly(uiVar.j);
        builder.setGroup(null);
        builder.setSortKey(null);
        builder.setGroupSummary(false);
        builder.setCategory(null);
        builder.setColor(0);
        builder.setVisibility(0);
        builder.setPublicVersion(null);
        builder.setSound(notification2.sound, notification2.audioAttributes);
        ArrayList arrayList3 = uiVar.n;
        if (!arrayList3.isEmpty()) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                builder.addPerson((String) it.next());
            }
        }
        if (uiVar.d.size() > 0) {
            Bundle bundle5 = uiVar.a().getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i9 = 0;
            while (i9 < uiVar.d.size()) {
                ArrayList arrayList4 = uiVar.d;
                String num = Integer.toString(i9);
                ug ugVar2 = (ug) arrayList4.get(i9);
                Bundle bundle8 = new Bundle();
                IconCompat a3 = ugVar2.a();
                int i10 = i9;
                bundle8.putInt("icon", a3 != null ? a3.a() : 0);
                bundle8.putCharSequence("title", ugVar2.e);
                bundle8.putParcelable("actionIntent", ugVar2.f);
                Bundle bundle9 = new Bundle(ugVar2.a);
                boolean z4 = ugVar2.b;
                bundle9.putBoolean("android.support.allowGeneratedReplies", true);
                bundle8.putBundle("extras", bundle9);
                oy[] oyVarArr2 = ugVar2.g;
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", ugVar2.c);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i9 = i10 + 1;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            uiVar.a().putBundle("android.car.EXTENSIONS", bundle5);
            bundle2.putBundle("android.car.EXTENSIONS", bundle6);
        }
        builder.setExtras(uiVar.k);
        builder.setRemoteInputHistory(null);
        builder.setBadgeIconType(0);
        builder.setSettingsText(null);
        builder.setShortcutId(null);
        builder.setTimeoutAfter(0L);
        builder.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(uiVar.l)) {
            builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        ArrayList arrayList5 = uiVar.c;
        if (arrayList5.size() > 0) {
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setAllowSystemGeneratedContextualActions(true);
            builder.setBubbleMetadata(null);
        }
        if (Build.VERSION.SDK_INT >= 36) {
            builder.setShortCriticalText(null);
        }
        uj ujVar = uiVar.i;
        if (ujVar != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText(((uh) ujVar).a);
        }
        Notification build = builder.build();
        if (ujVar != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        if (i == 1 || i == 2 || i == 3 || i == 21) {
            z = false;
            cmd.c.set(false);
            i2 = 10436;
        } else {
            i2 = 39789;
            z = false;
        }
        notificationManager.notify(i2, build);
        d(context, clgVar, z);
    }
}
