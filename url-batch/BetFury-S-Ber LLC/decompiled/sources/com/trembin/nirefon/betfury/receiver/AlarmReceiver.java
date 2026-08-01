package com.trembin.nirefon.betfury.receiver;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.trembin.nirefon.betfury.R;
import defpackage.di;
import defpackage.e40;
import defpackage.i5;
import defpackage.i7;
import defpackage.k0;
import defpackage.s9;
import defpackage.v6;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class AlarmReceiver extends BroadcastReceiver {
    public static final Companion Companion = new Companion(null);
    public static final String EXTRA_CONTENT = "extra_content";
    public static final String EXTRA_TITLE = "extra_title";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle bundle;
        context.getClass();
        intent.getClass();
        String stringExtra = intent.getStringExtra(EXTRA_TITLE);
        String str = stringExtra;
        if (stringExtra == null) {
            String string = context.getString(R.string.app_name);
            string.getClass();
            str = string;
        }
        String stringExtra2 = intent.getStringExtra(EXTRA_CONTENT);
        String str2 = stringExtra2;
        if (stringExtra2 == null) {
            str2 = "";
        }
        e40 e40Var = new e40();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Notification notification = new Notification();
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        boolean z = false;
        e40Var.c = 0;
        ArrayList arrayList4 = new ArrayList();
        e40Var.f = true;
        notification.icon = R.drawable.ic_bell;
        int length = str.length();
        CharSequence charSequence = str;
        if (length > 5120) {
            charSequence = str.subSequence(0, 5120);
        }
        e40Var.a = charSequence;
        e40Var.b = str2.length() > 5120 ? str2.subSequence(0, 5120) : str2;
        i5 i5Var = new i5(23, z);
        int length2 = str2.length();
        CharSequence charSequence2 = str2;
        if (length2 > 5120) {
            charSequence2 = str2.subSequence(0, 5120);
        }
        i5Var.h = charSequence2;
        e40Var.a(i5Var);
        e40Var.c = 1;
        notification.flags |= 16;
        Bundle bundle2 = new Bundle();
        Notification.Builder builder = new Notification.Builder(context, "win_reminders");
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(e40Var.a).setContentText(e40Var.b).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        builder.setLargeIcon((Icon) null);
        builder.setSubText(null).setUsesChronometer(false).setPriority(e40Var.c);
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            s9.c();
            return;
        }
        Bundle bundle3 = e40Var.e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        builder.setShowWhen(true);
        builder.setLocalOnly(false);
        builder.setGroup(null);
        builder.setSortKey(null);
        builder.setGroupSummary(false);
        builder.setCategory(null);
        builder.setColor(0);
        builder.setVisibility(0);
        builder.setPublicVersion(null);
        builder.setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList5 = new ArrayList(arrayList2.size());
            Iterator it2 = arrayList2.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                s9.c();
                return;
            } else {
                i7 i7Var = new i7(arrayList4.size() + arrayList5.size());
                i7Var.addAll(arrayList5);
                i7Var.addAll(arrayList4);
                arrayList4 = new ArrayList(i7Var);
            }
        }
        if (!arrayList4.isEmpty()) {
            int size = arrayList4.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList4.get(i);
                i++;
                builder.addPerson((String) obj);
            }
        }
        if (arrayList3.size() > 0) {
            if (e40Var.e == null) {
                e40Var.e = new Bundle();
            }
            Bundle bundle4 = e40Var.e.getBundle("android.car.EXTENSIONS");
            if (bundle4 == null) {
                bundle4 = new Bundle();
            }
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            if (arrayList3.size() > 0) {
                Integer.toString(0);
                if (arrayList3.get(0) != null) {
                    s9.c();
                    return;
                } else {
                    new Bundle();
                    throw null;
                }
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (e40Var.e == null) {
                e40Var.e = new Bundle();
            }
            e40Var.e.putBundle("android.car.EXTENSIONS", bundle4);
            bundle2.putBundle("android.car.EXTENSIONS", bundle5);
        }
        builder.setExtras(e40Var.e);
        builder.setRemoteInputHistory(null);
        builder.setBadgeIconType(0);
        builder.setSettingsText(null);
        builder.setShortcutId(null);
        builder.setTimeoutAfter(0L);
        builder.setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty("win_reminders")) {
            builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            Iterator it3 = arrayList2.iterator();
            if (it3.hasNext()) {
                it3.next().getClass();
                s9.c();
                return;
            }
        }
        if (i2 >= 29) {
            v6.e(builder, e40Var.f);
            v6.f(builder);
        }
        if (i2 >= 36) {
            k0.e(builder);
        }
        i5 i5Var2 = e40Var.d;
        if (i5Var2 != null) {
            new Notification.BigTextStyle(builder).setBigContentTitle(null).bigText((CharSequence) i5Var2.h);
        }
        Notification build = builder.build();
        if (i5Var2 != null) {
            e40Var.d.getClass();
        }
        if (i5Var2 != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
        }
        build.getClass();
        ((NotificationManager) context.getSystemService(NotificationManager.class)).notify((int) System.currentTimeMillis(), build);
    }

    /* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
    public static final class Companion {
        public /* synthetic */ Companion(di diVar) {
            this();
        }

        private Companion() {
        }
    }
}
