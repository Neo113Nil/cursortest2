package j;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import j.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f18024a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f18025b;

    /* renamed from: c, reason: collision with root package name */
    private final e.d f18026c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f18027d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f18028e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Bundle> f18029f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f18030g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f18031h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f18032i;

    f(e.d dVar) {
        int i7;
        Icon icon;
        List<String> e7;
        Bundle bundle;
        String str;
        this.f18026c = dVar;
        this.f18024a = dVar.f17994a;
        int i8 = Build.VERSION.SDK_INT;
        Context context = dVar.f17994a;
        this.f18025b = i8 >= 26 ? new Notification.Builder(context, dVar.L) : new Notification.Builder(context);
        Notification notification = dVar.T;
        this.f18025b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f18002i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f17998e).setContentText(dVar.f17999f).setContentInfo(dVar.f18004k).setContentIntent(dVar.f18000g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f18001h, (notification.flags & 128) != 0).setLargeIcon(dVar.f18003j).setNumber(dVar.f18005l).setProgress(dVar.f18014u, dVar.f18015v, dVar.f18016w);
        if (i8 < 21) {
            this.f18025b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i8 >= 16) {
            this.f18025b.setSubText(dVar.f18011r).setUsesChronometer(dVar.f18008o).setPriority(dVar.f18006m);
            Iterator<e.a> it = dVar.f17995b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = dVar.E;
            if (bundle2 != null) {
                this.f18030g.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.A) {
                    this.f18030g.putBoolean("android.support.localOnly", true);
                }
                String str2 = dVar.f18017x;
                if (str2 != null) {
                    this.f18030g.putString("android.support.groupKey", str2);
                    if (dVar.f18018y) {
                        bundle = this.f18030g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f18030g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = dVar.f18019z;
                if (str3 != null) {
                    this.f18030g.putString("android.support.sortKey", str3);
                }
            }
            this.f18027d = dVar.I;
            this.f18028e = dVar.J;
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 17) {
            this.f18025b.setShowWhen(dVar.f18007n);
        }
        if (i9 >= 19 && i9 < 21 && (e7 = e(f(dVar.f17996c), dVar.W)) != null && !e7.isEmpty()) {
            this.f18030g.putStringArray("android.people", (String[]) e7.toArray(new String[e7.size()]));
        }
        if (i9 >= 20) {
            this.f18025b.setLocalOnly(dVar.A).setGroup(dVar.f18017x).setGroupSummary(dVar.f18018y).setSortKey(dVar.f18019z);
            this.f18031h = dVar.P;
        }
        if (i9 >= 21) {
            this.f18025b.setCategory(dVar.D).setColor(dVar.F).setVisibility(dVar.G).setPublicVersion(dVar.H).setSound(notification.sound, notification.audioAttributes);
            List e8 = i9 < 28 ? e(f(dVar.f17996c), dVar.W) : dVar.W;
            if (e8 != null && !e8.isEmpty()) {
                Iterator it2 = e8.iterator();
                while (it2.hasNext()) {
                    this.f18025b.addPerson((String) it2.next());
                }
            }
            this.f18032i = dVar.K;
            if (dVar.f17997d.size() > 0) {
                Bundle bundle3 = dVar.e().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i10 = 0; i10 < dVar.f17997d.size(); i10++) {
                    bundle5.putBundle(Integer.toString(i10), g.b(dVar.f17997d.get(i10)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                dVar.e().putBundle("android.car.EXTENSIONS", bundle3);
                this.f18030g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 23 && (icon = dVar.V) != null) {
            this.f18025b.setSmallIcon(icon);
        }
        if (i11 >= 24) {
            this.f18025b.setExtras(dVar.E).setRemoteInputHistory(dVar.f18013t);
            RemoteViews remoteViews = dVar.I;
            if (remoteViews != null) {
                this.f18025b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.J;
            if (remoteViews2 != null) {
                this.f18025b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.K;
            if (remoteViews3 != null) {
                this.f18025b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i11 >= 26) {
            this.f18025b.setBadgeIconType(dVar.M).setSettingsText(dVar.f18012s).setShortcutId(dVar.N).setTimeoutAfter(dVar.O).setGroupAlertBehavior(dVar.P);
            if (dVar.C) {
                this.f18025b.setColorized(dVar.B);
            }
            if (!TextUtils.isEmpty(dVar.L)) {
                this.f18025b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i11 >= 28) {
            Iterator<i> it3 = dVar.f17996c.iterator();
            while (it3.hasNext()) {
                this.f18025b.addPerson(it3.next().h());
            }
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 29) {
            this.f18025b.setAllowSystemGeneratedContextualActions(dVar.R);
            this.f18025b.setBubbleMetadata(e.c.a(dVar.S));
        }
        if (p.a.b() && (i7 = dVar.Q) != 0) {
            this.f18025b.setForegroundServiceBehavior(i7);
        }
        if (dVar.U) {
            if (this.f18026c.f18018y) {
                this.f18031h = 2;
            } else {
                this.f18031h = 1;
            }
            this.f18025b.setVibrate(null);
            this.f18025b.setSound(null);
            int i13 = notification.defaults & (-2);
            notification.defaults = i13;
            int i14 = i13 & (-3);
            notification.defaults = i14;
            this.f18025b.setDefaults(i14);
            if (i12 >= 26) {
                if (TextUtils.isEmpty(this.f18026c.f18017x)) {
                    this.f18025b.setGroup("silent");
                }
                this.f18025b.setGroupAlertBehavior(this.f18031h);
            }
        }
    }

    private void b(e.a aVar) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 20) {
            if (i7 >= 16) {
                this.f18029f.add(g.f(this.f18025b, aVar));
                return;
            }
            return;
        }
        IconCompat f7 = aVar.f();
        Notification.Action.Builder builder = i7 >= 23 ? new Notification.Action.Builder(f7 != null ? f7.u() : null, aVar.j(), aVar.a()) : new Notification.Action.Builder(f7 != null ? f7.i() : 0, aVar.j(), aVar.a());
        if (aVar.g() != null) {
            for (RemoteInput remoteInput : j.b(aVar.g())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.h());
        if (i8 >= 28) {
            builder.setSemanticAction(aVar.h());
        }
        if (i8 >= 29) {
            builder.setContextual(aVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
        builder.addExtras(bundle);
        this.f18025b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        h.b bVar = new h.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> f(List<i> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<i> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i7 = notification.defaults & (-2);
        notification.defaults = i7;
        notification.defaults = i7 & (-3);
    }

    @Override // j.d
    public Notification.Builder a() {
        return this.f18025b;
    }

    public Notification c() {
        Bundle a7;
        RemoteViews k7;
        RemoteViews i7;
        e.AbstractC0081e abstractC0081e = this.f18026c.f18010q;
        if (abstractC0081e != null) {
            abstractC0081e.b(this);
        }
        RemoteViews j7 = abstractC0081e != null ? abstractC0081e.j(this) : null;
        Notification d7 = d();
        if (j7 != null || (j7 = this.f18026c.I) != null) {
            d7.contentView = j7;
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 16 && abstractC0081e != null && (i7 = abstractC0081e.i(this)) != null) {
            d7.bigContentView = i7;
        }
        if (i8 >= 21 && abstractC0081e != null && (k7 = this.f18026c.f18010q.k(this)) != null) {
            d7.headsUpContentView = k7;
        }
        if (i8 >= 16 && abstractC0081e != null && (a7 = e.a(d7)) != null) {
            abstractC0081e.a(a7);
        }
        return d7;
    }

    protected Notification d() {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            return this.f18025b.build();
        }
        if (i7 >= 24) {
            Notification build = this.f18025b.build();
            if (this.f18031h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f18031h == 2) {
                    g(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f18031h == 1) {
                    g(build);
                }
            }
            return build;
        }
        if (i7 >= 21) {
            this.f18025b.setExtras(this.f18030g);
            Notification build2 = this.f18025b.build();
            RemoteViews remoteViews = this.f18027d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f18028e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f18032i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f18031h != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f18031h == 2) {
                    g(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f18031h == 1) {
                    g(build2);
                }
            }
            return build2;
        }
        if (i7 >= 20) {
            this.f18025b.setExtras(this.f18030g);
            Notification build3 = this.f18025b.build();
            RemoteViews remoteViews4 = this.f18027d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f18028e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f18031h != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.f18031h == 2) {
                    g(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f18031h == 1) {
                    g(build3);
                }
            }
            return build3;
        }
        if (i7 >= 19) {
            SparseArray<Bundle> a7 = g.a(this.f18029f);
            if (a7 != null) {
                this.f18030g.putSparseParcelableArray("android.support.actionExtras", a7);
            }
            this.f18025b.setExtras(this.f18030g);
            Notification build4 = this.f18025b.build();
            RemoteViews remoteViews6 = this.f18027d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f18028e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        }
        if (i7 < 16) {
            return this.f18025b.getNotification();
        }
        Notification build5 = this.f18025b.build();
        Bundle a8 = e.a(build5);
        Bundle bundle = new Bundle(this.f18030g);
        for (String str : this.f18030g.keySet()) {
            if (a8.containsKey(str)) {
                bundle.remove(str);
            }
        }
        a8.putAll(bundle);
        SparseArray<Bundle> a9 = g.a(this.f18029f);
        if (a9 != null) {
            e.a(build5).putSparseParcelableArray("android.support.actionExtras", a9);
        }
        RemoteViews remoteViews8 = this.f18027d;
        if (remoteViews8 != null) {
            build5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.f18028e;
        if (remoteViews9 != null) {
            build5.bigContentView = remoteViews9;
        }
        return build5;
    }
}
