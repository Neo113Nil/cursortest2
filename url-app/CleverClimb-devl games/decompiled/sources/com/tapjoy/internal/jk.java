package com.tapjoy.internal;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompatExtras;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.tapjoy.internal.jj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
final class jk implements ji {

    /* renamed from: a, reason: collision with root package name */
    final Notification.Builder f8458a;

    /* renamed from: b, reason: collision with root package name */
    final jj.c f8459b;

    /* renamed from: c, reason: collision with root package name */
    RemoteViews f8460c;

    /* renamed from: d, reason: collision with root package name */
    RemoteViews f8461d;
    final List e = new ArrayList();
    final Bundle f = new Bundle();
    int g;
    RemoteViews h;

    jk(jj.c cVar) {
        this.f8459b = cVar;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8458a = new Notification.Builder(cVar.f8450a, cVar.H);
        } else {
            this.f8458a = new Notification.Builder(cVar.f8450a);
        }
        Notification notification = cVar.M;
        this.f8458a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, cVar.g).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(cVar.f8452c).setContentText(cVar.f8453d).setContentInfo(cVar.i).setContentIntent(cVar.e).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(cVar.f, (notification.flags & 128) != 0).setLargeIcon(cVar.h).setNumber(cVar.j).setProgress(cVar.q, cVar.r, cVar.s);
        if (Build.VERSION.SDK_INT < 21) {
            this.f8458a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f8458a.setSubText(cVar.o).setUsesChronometer(cVar.m).setPriority(cVar.k);
            Iterator it = cVar.f8451b.iterator();
            while (it.hasNext()) {
                a((jj.a) it.next());
            }
            if (cVar.A != null) {
                this.f.putAll(cVar.A);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (cVar.w) {
                    this.f.putBoolean(NotificationCompatExtras.EXTRA_LOCAL_ONLY, true);
                }
                if (cVar.t != null) {
                    this.f.putString(NotificationCompatExtras.EXTRA_GROUP_KEY, cVar.t);
                    if (cVar.u) {
                        this.f.putBoolean(NotificationCompatExtras.EXTRA_GROUP_SUMMARY, true);
                    } else {
                        this.f.putBoolean(NotificationManagerCompat.EXTRA_USE_SIDE_CHANNEL, true);
                    }
                }
                if (cVar.v != null) {
                    this.f.putString(NotificationCompatExtras.EXTRA_SORT_KEY, cVar.v);
                }
            }
            this.f8460c = cVar.E;
            this.f8461d = cVar.F;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f8458a.setShowWhen(cVar.l);
            if (Build.VERSION.SDK_INT < 21 && cVar.N != null && !cVar.N.isEmpty()) {
                this.f.putStringArray(NotificationCompat.EXTRA_PEOPLE, (String[]) cVar.N.toArray(new String[cVar.N.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f8458a.setLocalOnly(cVar.w).setGroup(cVar.t).setGroupSummary(cVar.u).setSortKey(cVar.v);
            this.g = cVar.L;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f8458a.setCategory(cVar.z).setColor(cVar.B).setVisibility(cVar.C).setPublicVersion(cVar.D).setSound(notification.sound, notification.audioAttributes);
            Iterator it2 = cVar.N.iterator();
            while (it2.hasNext()) {
                this.f8458a.addPerson((String) it2.next());
            }
            this.h = cVar.G;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f8458a.setExtras(cVar.A).setRemoteInputHistory(cVar.p);
            if (cVar.E != null) {
                this.f8458a.setCustomContentView(cVar.E);
            }
            if (cVar.F != null) {
                this.f8458a.setCustomBigContentView(cVar.F);
            }
            if (cVar.G != null) {
                this.f8458a.setCustomHeadsUpContentView(cVar.G);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f8458a.setBadgeIconType(cVar.I).setShortcutId(cVar.J).setTimeoutAfter(cVar.K).setGroupAlertBehavior(cVar.L);
            if (cVar.y) {
                this.f8458a.setColorized(cVar.x);
            }
            if (TextUtils.isEmpty(cVar.H)) {
                return;
            }
            this.f8458a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
    }

    @Override // com.tapjoy.internal.ji
    public final Notification.Builder a() {
        return this.f8458a;
    }

    private void a(jj.a aVar) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(aVar.e, aVar.f, aVar.g);
            if (aVar.f8447b != null) {
                for (RemoteInput remoteInput : jm.a(aVar.f8447b)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            if (aVar.f8446a != null) {
                bundle = new Bundle(aVar.f8446a);
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.f8449d);
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(aVar.f8449d);
            }
            builder.addExtras(bundle);
            this.f8458a.addAction(builder.build());
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.e.add(jl.a(this.f8458a, aVar));
        }
    }

    static void a(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
