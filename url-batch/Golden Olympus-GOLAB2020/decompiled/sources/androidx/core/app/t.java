package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.s;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class t implements r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11697a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f11698b;

    /* renamed from: c, reason: collision with root package name */
    private final s.e f11699c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f11700d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f11701e;

    /* renamed from: f, reason: collision with root package name */
    private final List f11702f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f11703g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f11704h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f11705i;

    static class a {
        static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        static Notification.Action.Builder e(int i4, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i4, charSequence, pendingIntent);
        }

        static String f(Notification notification) {
            return notification.getGroup();
        }

        static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        static Notification.Builder h(Notification.Builder builder, boolean z4) {
            return builder.setGroupSummary(z4);
        }

        static Notification.Builder i(Notification.Builder builder, boolean z4) {
            return builder.setLocalOnly(z4);
        }

        static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    static class b {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        static Notification.Builder c(Notification.Builder builder, int i4) {
            return builder.setColor(i4);
        }

        static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        static Notification.Builder f(Notification.Builder builder, int i4) {
            return builder.setVisibility(i4);
        }
    }

    static class c {
        static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    static class d {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
            return builder.setAllowGeneratedReplies(z4);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class e {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setBadgeIconType(i4);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z4) {
            return builder.setColorized(z4);
        }

        static Notification.Builder d(Notification.Builder builder, int i4) {
            return builder.setGroupAlertBehavior(i4);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j4) {
            return builder.setTimeoutAfter(j4);
        }
    }

    static class f {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i4) {
            return builder.setSemanticAction(i4);
        }
    }

    static class g {
        static Notification.Builder a(Notification.Builder builder, boolean z4) {
            return builder.setAllowSystemGeneratedContextualActions(z4);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z4) {
            return builder.setContextual(z4);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    static class h {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z4) {
            return builder.setAuthenticationRequired(z4);
        }

        static Notification.Builder b(Notification.Builder builder, int i4) {
            return builder.setForegroundServiceBehavior(i4);
        }
    }

    t(s.e eVar) {
        int i4;
        this.f11699c = eVar;
        Context context = eVar.f11667a;
        this.f11697a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f11698b = e.a(context, eVar.f11656K);
        } else {
            this.f11698b = new Notification.Builder(eVar.f11667a);
        }
        Notification notification = eVar.f11663R;
        this.f11698b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f11675i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f11671e).setContentText(eVar.f11672f).setContentInfo(eVar.f11677k).setContentIntent(eVar.f11673g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f11674h, (notification.flags & UserVerificationMethods.USER_VERIFY_PATTERN) != 0).setNumber(eVar.f11678l).setProgress(eVar.f11686t, eVar.f11687u, eVar.f11688v);
        Notification.Builder builder = this.f11698b;
        IconCompat iconCompat = eVar.f11676j;
        c.b(builder, iconCompat == null ? null : iconCompat.m(context));
        this.f11698b.setSubText(eVar.f11683q).setUsesChronometer(eVar.f11681o).setPriority(eVar.f11679m);
        ArrayList arrayList = eVar.f11668b;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            b((s.a) obj);
        }
        Bundle bundle = eVar.f11649D;
        if (bundle != null) {
            this.f11703g.putAll(bundle);
        }
        int i6 = Build.VERSION.SDK_INT;
        this.f11700d = eVar.f11653H;
        this.f11701e = eVar.f11654I;
        this.f11698b.setShowWhen(eVar.f11680n);
        a.i(this.f11698b, eVar.f11692z);
        a.g(this.f11698b, eVar.f11689w);
        a.j(this.f11698b, eVar.f11691y);
        a.h(this.f11698b, eVar.f11690x);
        this.f11704h = eVar.f11660O;
        b.b(this.f11698b, eVar.f11648C);
        b.c(this.f11698b, eVar.f11650E);
        b.f(this.f11698b, eVar.f11651F);
        b.d(this.f11698b, eVar.f11652G);
        b.e(this.f11698b, notification.sound, notification.audioAttributes);
        List e4 = i6 < 28 ? e(g(eVar.f11669c), eVar.f11666U) : eVar.f11666U;
        if (e4 != null && !e4.isEmpty()) {
            Iterator it = e4.iterator();
            while (it.hasNext()) {
                b.a(this.f11698b, (String) it.next());
            }
        }
        this.f11705i = eVar.f11655J;
        if (eVar.f11670d.size() > 0) {
            Bundle bundle2 = eVar.c().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i7 = 0; i7 < eVar.f11670d.size(); i7++) {
                bundle4.putBundle(Integer.toString(i7), u.a((s.a) eVar.f11670d.get(i7)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            eVar.c().putBundle("android.car.EXTENSIONS", bundle2);
            this.f11703g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i8 = Build.VERSION.SDK_INT;
        Object obj2 = eVar.f11665T;
        if (obj2 != null) {
            c.c(this.f11698b, obj2);
        }
        this.f11698b.setExtras(eVar.f11649D);
        d.e(this.f11698b, eVar.f11685s);
        RemoteViews remoteViews = eVar.f11653H;
        if (remoteViews != null) {
            d.c(this.f11698b, remoteViews);
        }
        RemoteViews remoteViews2 = eVar.f11654I;
        if (remoteViews2 != null) {
            d.b(this.f11698b, remoteViews2);
        }
        RemoteViews remoteViews3 = eVar.f11655J;
        if (remoteViews3 != null) {
            d.d(this.f11698b, remoteViews3);
        }
        if (i8 >= 26) {
            e.b(this.f11698b, eVar.f11657L);
            e.e(this.f11698b, eVar.f11684r);
            e.f(this.f11698b, eVar.f11658M);
            e.g(this.f11698b, eVar.f11659N);
            e.d(this.f11698b, eVar.f11660O);
            if (eVar.f11647B) {
                e.c(this.f11698b, eVar.f11646A);
            }
            if (!TextUtils.isEmpty(eVar.f11656K)) {
                this.f11698b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i8 >= 28) {
            Iterator it2 = eVar.f11669c.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.b.a(it2.next());
                throw null;
            }
        }
        if (i8 >= 29) {
            g.a(this.f11698b, eVar.f11662Q);
            g.b(this.f11698b, s.d.a(null));
        }
        if (i8 >= 31 && (i4 = eVar.f11661P) != 0) {
            h.b(this.f11698b, i4);
        }
        if (eVar.f11664S) {
            if (this.f11699c.f11690x) {
                this.f11704h = 2;
            } else {
                this.f11704h = 1;
            }
            this.f11698b.setVibrate(null);
            this.f11698b.setSound(null);
            int i9 = notification.defaults & (-4);
            notification.defaults = i9;
            this.f11698b.setDefaults(i9);
            if (i8 >= 26) {
                if (TextUtils.isEmpty(this.f11699c.f11689w)) {
                    a.g(this.f11698b, "silent");
                }
                e.d(this.f11698b, this.f11704h);
            }
        }
    }

    private void b(s.a aVar) {
        IconCompat d4 = aVar.d();
        Notification.Action.Builder a4 = c.a(d4 != null ? d4.l() : null, aVar.h(), aVar.a());
        if (aVar.e() != null) {
            for (RemoteInput remoteInput : A.b(aVar.e())) {
                a.c(a4, remoteInput);
            }
        }
        Bundle bundle = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i4 = Build.VERSION.SDK_INT;
        d.a(a4, aVar.b());
        bundle.putInt("android.support.action.semanticAction", aVar.f());
        if (i4 >= 28) {
            f.b(a4, aVar.f());
        }
        if (i4 >= 29) {
            g.c(a4, aVar.j());
        }
        if (i4 >= 31) {
            h.a(a4, aVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.g());
        a.b(a4, bundle);
        a.a(this.f11698b, a.d(a4));
    }

    private static List e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.b bVar = new androidx.collection.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.r
    public Notification.Builder a() {
        return this.f11698b;
    }

    public Notification c() {
        Bundle a4;
        RemoteViews f4;
        RemoteViews d4;
        s.f fVar = this.f11699c.f11682p;
        if (fVar != null) {
            fVar.b(this);
        }
        RemoteViews e4 = fVar != null ? fVar.e(this) : null;
        Notification d5 = d();
        if (e4 != null) {
            d5.contentView = e4;
        } else {
            RemoteViews remoteViews = this.f11699c.f11653H;
            if (remoteViews != null) {
                d5.contentView = remoteViews;
            }
        }
        if (fVar != null && (d4 = fVar.d(this)) != null) {
            d5.bigContentView = d4;
        }
        if (fVar != null && (f4 = this.f11699c.f11682p.f(this)) != null) {
            d5.headsUpContentView = f4;
        }
        if (fVar != null && (a4 = s.a(d5)) != null) {
            fVar.a(a4);
        }
        return d5;
    }

    protected Notification d() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f11698b.build();
        }
        Notification build = this.f11698b.build();
        if (this.f11704h != 0) {
            if (a.f(build) != null && (build.flags & UserVerificationMethods.USER_VERIFY_NONE) != 0 && this.f11704h == 2) {
                h(build);
            }
            if (a.f(build) != null && (build.flags & UserVerificationMethods.USER_VERIFY_NONE) == 0 && this.f11704h == 1) {
                h(build);
            }
        }
        return build;
    }

    Context f() {
        return this.f11697a;
    }
}
