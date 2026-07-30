package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.majelw.libystne.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bt1 {
    public final Context a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public rp3 l;
    public Bundle n;
    public String q;
    public final boolean r;
    public final Notification s;
    public final ArrayList t;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean m = false;
    public int o = 0;
    public int p = 0;

    public bt1(Context context, String str) {
        Notification notification = new Notification();
        this.s = notification;
        this.a = context;
        this.q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.t = new ArrayList();
        this.r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Notification a() {
        Bundle bundle;
        int i;
        ArrayList arrayList;
        int i2;
        js0 js0Var = new js0();
        js0Var.p = new Bundle();
        js0Var.o = this;
        Context context = this.a;
        js0Var.m = context;
        if (Build.VERSION.SDK_INT >= 26) {
            js0Var.n = k31.h(context, this.q);
        } else {
            js0Var.n = new Notification.Builder(context);
        }
        Notification.Builder builder = (Notification.Builder) js0Var.n;
        Notification notification = this.s;
        Context context2 = null;
        int i3 = 0;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(this.e).setContentText(this.f).setContentInfo(null).setContentIntent(this.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(this.i).setProgress(0, 0, false);
        Notification.Builder builder2 = (Notification.Builder) js0Var.n;
        IconCompat iconCompat = this.h;
        builder2.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) js0Var.n).setSubText(null).setUsesChronometer(false).setPriority(this.j);
        ArrayList arrayList2 = this.b;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            xs1 xs1Var = (xs1) obj;
            if (xs1Var.b == null && (i2 = xs1Var.e) != 0) {
                xs1Var.b = IconCompat.b(i2);
            }
            IconCompat iconCompat2 = xs1Var.b;
            boolean z = xs1Var.c;
            Bundle bundle2 = xs1Var.a;
            Notification.Action.Builder builder3 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, xs1Var.f, xs1Var.g);
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            bundle3.putBoolean("android.support.allowGeneratedReplies", z);
            builder3.setAllowGeneratedReplies(z);
            bundle3.putInt("android.support.action.semanticAction", 0);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 28) {
                km.v(builder3);
            }
            if (i5 >= 29) {
                x6.u(builder3);
            }
            if (i5 >= 31) {
                t8.g(builder3);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", xs1Var.d);
            builder3.addExtras(bundle3);
            ((Notification.Builder) js0Var.n).addAction(builder3.build());
            context2 = null;
        }
        Bundle bundle4 = this.n;
        if (bundle4 != null) {
            ((Bundle) js0Var.p).putAll(bundle4);
        }
        ((Notification.Builder) js0Var.n).setShowWhen(this.k);
        ((Notification.Builder) js0Var.n).setLocalOnly(this.m);
        ((Notification.Builder) js0Var.n).setGroup(null);
        ((Notification.Builder) js0Var.n).setSortKey(null);
        ((Notification.Builder) js0Var.n).setGroupSummary(false);
        ((Notification.Builder) js0Var.n).setCategory(null);
        ((Notification.Builder) js0Var.n).setColor(this.o);
        ((Notification.Builder) js0Var.n).setVisibility(this.p);
        ((Notification.Builder) js0Var.n).setPublicVersion(null);
        ((Notification.Builder) js0Var.n).setSound(notification.sound, notification.audioAttributes);
        int i6 = Build.VERSION.SDK_INT;
        ArrayList arrayList3 = this.t;
        ArrayList arrayList4 = this.c;
        if (i6 < 28) {
            if (arrayList4 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList4.size());
                Iterator it = arrayList4.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    b71.o();
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList3 == null) {
                    arrayList3 = arrayList;
                } else {
                    ii iiVar = new ii(arrayList3.size() + arrayList.size());
                    iiVar.addAll(arrayList);
                    iiVar.addAll(arrayList3);
                    arrayList3 = new ArrayList(iiVar);
                }
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                ((Notification.Builder) js0Var.n).addPerson((String) obj2);
            }
        }
        ArrayList arrayList5 = this.d;
        if (arrayList5.size() > 0) {
            if (this.n == null) {
                this.n = new Bundle();
            }
            Bundle bundle5 = this.n.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList5.size()) {
                String num = Integer.toString(i8);
                xs1 xs1Var2 = (xs1) arrayList5.get(i8);
                Bundle bundle8 = new Bundle();
                if (xs1Var2.b == null && (i = xs1Var2.e) != 0) {
                    xs1Var2.b = IconCompat.b(i);
                }
                IconCompat iconCompat3 = xs1Var2.b;
                Bundle bundle9 = xs1Var2.a;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i3);
                bundle8.putCharSequence("title", xs1Var2.f);
                bundle8.putParcelable("actionIntent", xs1Var2.g);
                Bundle bundle10 = bundle9 != null ? new Bundle(bundle9) : new Bundle();
                bundle10.putBoolean("android.support.allowGeneratedReplies", xs1Var2.c);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", xs1Var2.d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i8++;
                i3 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.n == null) {
                this.n = new Bundle();
            }
            this.n.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) js0Var.p).putBundle("android.car.EXTENSIONS", bundle6);
        }
        ((Notification.Builder) js0Var.n).setExtras(this.n);
        ((Notification.Builder) js0Var.n).setRemoteInputHistory(null);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            k31.w((Notification.Builder) js0Var.n);
            k31.D((Notification.Builder) js0Var.n);
            k31.E((Notification.Builder) js0Var.n);
            k31.F((Notification.Builder) js0Var.n);
            k31.y((Notification.Builder) js0Var.n);
            if (!TextUtils.isEmpty(this.q)) {
                ((Notification.Builder) js0Var.n).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i9 >= 28) {
            Iterator it2 = arrayList4.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                b71.o();
                throw null;
            }
        }
        if (i9 >= 29) {
            x6.r((Notification.Builder) js0Var.n, this.r);
            x6.t((Notification.Builder) js0Var.n);
        }
        if (i9 >= 36) {
            e2.g((Notification.Builder) js0Var.n);
        }
        bt1 bt1Var = (bt1) js0Var.o;
        rp3 rp3Var = bt1Var.l;
        if (rp3Var != null) {
            rp3Var.g(js0Var);
        }
        int i10 = Build.VERSION.SDK_INT;
        Notification.Builder builder4 = (Notification.Builder) js0Var.n;
        Notification build = i10 >= 26 ? builder4.build() : builder4.build();
        if (rp3Var != null) {
            bt1Var.l.getClass();
        }
        if (rp3Var != null && (bundle = build.extras) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", rp3Var.i());
        }
        return build;
    }

    public final void c(boolean z) {
        Notification notification = this.s;
        if (z) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void e(rp3 rp3Var) {
        if (this.l != rp3Var) {
            this.l = rp3Var;
            if (((bt1) rp3Var.m) != this) {
                rp3Var.m = this;
                e(rp3Var);
            }
        }
    }
}
