package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import com.appsflyer.internal.l;
import com.feathherdashh.dashgame.R;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.Adler32;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class i8 implements s51, tw, OnCompleteListener {
    public static volatile i8 i;
    public static final Object j = new Object();
    public final /* synthetic */ int d;
    public Object e;
    public Object g;
    public Object h;

    public i8(gq0 gq0Var) {
        int i2;
        int i3;
        this.d = 15;
        new ArrayList();
        this.h = new Bundle();
        this.g = gq0Var;
        Context context = gq0Var.a;
        ArrayList arrayList = gq0Var.d;
        Notification.Builder builder = new Notification.Builder(context, gq0Var.q);
        this.e = builder;
        Notification notification = gq0Var.s;
        Icon icon = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(gq0Var.e).setContentText(gq0Var.f).setContentInfo(null).setContentIntent(gq0Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(gq0Var.i).setProgress(0, 0, false);
        IconCompat iconCompat = gq0Var.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.c());
        builder.setSubText(null).setUsesChronometer(false).setPriority(gq0Var.j);
        ArrayList arrayList2 = gq0Var.b;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            aq0 aq0Var = (aq0) obj;
            if (aq0Var.b == null && (i3 = aq0Var.e) != 0) {
                aq0Var.b = IconCompat.a(i3);
            }
            IconCompat iconCompat2 = aq0Var.b;
            boolean z = aq0Var.c;
            Bundle bundle = aq0Var.a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.c() : icon, aq0Var.f, aq0Var.g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            builder2.setSemanticAction(0);
            builder2.setContextual(false);
            if (Build.VERSION.SDK_INT >= 31) {
                d8.e(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", aq0Var.d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.e).addAction(builder2.build());
            icon = null;
        }
        Bundle bundle3 = gq0Var.n;
        if (bundle3 != null) {
            ((Bundle) this.h).putAll(bundle3);
        }
        ((Notification.Builder) this.e).setShowWhen(gq0Var.k);
        ((Notification.Builder) this.e).setLocalOnly(gq0Var.m);
        ((Notification.Builder) this.e).setGroup(null);
        ((Notification.Builder) this.e).setSortKey(null);
        ((Notification.Builder) this.e).setGroupSummary(false);
        ((Notification.Builder) this.e).setCategory(null);
        ((Notification.Builder) this.e).setColor(gq0Var.o);
        ((Notification.Builder) this.e).setVisibility(gq0Var.p);
        ((Notification.Builder) this.e).setPublicVersion(null);
        ((Notification.Builder) this.e).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList3 = gq0Var.t;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            int size2 = arrayList3.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList3.get(i5);
                i5++;
                ((Notification.Builder) this.e).addPerson((String) obj2);
            }
        }
        if (arrayList.size() > 0) {
            if (gq0Var.n == null) {
                gq0Var.n = new Bundle();
            }
            Bundle bundle4 = gq0Var.n.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                String num = Integer.toString(i6);
                aq0 aq0Var2 = (aq0) arrayList.get(i6);
                Bundle bundle7 = new Bundle();
                if (aq0Var2.b == null && (i2 = aq0Var2.e) != 0) {
                    aq0Var2.b = IconCompat.a(i2);
                }
                IconCompat iconCompat3 = aq0Var2.b;
                Bundle bundle8 = aq0Var2.a;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.b() : 0);
                bundle7.putCharSequence("title", aq0Var2.f);
                bundle7.putParcelable("actionIntent", aq0Var2.g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", aq0Var2.c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", aq0Var2.d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (gq0Var.n == null) {
                gq0Var.n = new Bundle();
            }
            gq0Var.n.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.h).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.e).setExtras(gq0Var.n);
        ((Notification.Builder) this.e).setRemoteInputHistory(null);
        ((Notification.Builder) this.e).setBadgeIconType(0);
        ((Notification.Builder) this.e).setSettingsText(null);
        ((Notification.Builder) this.e).setShortcutId(null);
        ((Notification.Builder) this.e).setTimeoutAfter(0L);
        ((Notification.Builder) this.e).setGroupAlertBehavior(0);
        if (!TextUtils.isEmpty(gq0Var.q)) {
            ((Notification.Builder) this.e).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator it = gq0Var.c.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            af.c();
            throw null;
        }
        ((Notification.Builder) this.e).setAllowSystemGeneratedContextualActions(gq0Var.r);
        ((Notification.Builder) this.e).setBubbleMetadata(null);
    }

    public static i8 h(Context context) {
        if (i == null) {
            synchronized (j) {
                try {
                    if (i == null) {
                        i = new i8(context);
                    }
                } finally {
                }
            }
        }
        return i;
    }

    public void a(jd0 jd0Var, ua0 ua0Var) {
        s40 s40Var = (s40) this.e;
        s40 s40Var2 = (s40) this.g;
        s40 s40Var3 = (s40) this.h;
        int ordinal = ua0Var.ordinal();
        if (ordinal == 0) {
            s40Var.k(jd0Var);
            s40Var3.k(jd0Var);
            return;
        }
        if (ordinal == 1) {
            s40Var2.k(jd0Var);
            s40Var3.k(jd0Var);
            return;
        }
        if (ordinal == 2) {
            if (jd0Var.m != null) {
                s40Var3.k(jd0Var);
                return;
            } else {
                s40Var.k(jd0Var);
                return;
            }
        }
        if (ordinal != 3) {
            l.a();
        } else if (jd0Var.m != null) {
            s40Var3.k(jd0Var);
        } else {
            s40Var2.k(jd0Var);
        }
    }

    public cc b() {
        String str = ((String) this.e) == null ? " backendName" : "";
        if (((dz0) this.h) == null) {
            str = str.concat(" priority");
        }
        if (str.isEmpty()) {
            return new cc((String) this.e, (byte[]) this.g, (dz0) this.h);
        }
        dd0.j("Missing required properties:".concat(str));
        return null;
    }

    public boolean c(jd0 jd0Var) {
        return !(jd0Var.m == null) && (((fc1) ((s40) this.e).e).contains(jd0Var) || ((fc1) ((s40) this.g).e).contains(jd0Var));
    }

    public void d(Bundle bundle) {
        HashSet hashSet = (HashSet) this.g;
        String string = ((Context) this.h).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (l80.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    e((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new ij(e);
            }
        }
    }

    public Object e(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.e;
        if (yi1.a()) {
            try {
                ca0.e(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                l80 l80Var = (l80) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = l80Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            e(cls2, hashSet);
                        }
                    }
                }
                obj = l80Var.b((Context) this.h);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new ij(th);
            }
        }
        return obj;
    }

    public void f(Object obj, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap hashMap = (HashMap) this.e;
        k01 k01Var = new k01(byteArrayOutputStream, hashMap, (HashMap) this.g, (oq0) this.h);
        oq0 oq0Var = (oq0) hashMap.get(obj.getClass());
        if (oq0Var != null) {
            oq0Var.a(obj, k01Var);
            return;
        }
        throw new wv("No encoder for " + obj.getClass());
    }

    public xf g() {
        return ((zf) this.h).d.c;
    }

    @Override // defpackage.o01
    public Object get() {
        switch (this.d) {
            case 20:
                return new i8((Context) ((o01) this.e).get(), ((o01) this.g).get(), ((a60) this.h).get(), 11);
            case 21:
                long l = t90.l();
                if (l == gi1.a) {
                    return this.h;
                }
                di1 di1Var = (di1) ((AtomicReference) this.e).get();
                int a = di1Var.a(l);
                if (a >= 0) {
                    return di1Var.c[a];
                }
                return null;
            default:
                return new ij1(new me1(5), new me1(3), (oq) ((mc) this.e).get(), (ne0) ((ek) this.g).get(), (o91) ((o91) this.h).get());
        }
    }

    public long i() {
        return ((zf) this.h).d.d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(81:5|(2:7|(2:9|(2:10|(2:12|(3:14|15|(1:17)(0))(1:18))(1:19)))(0))(0)|20|(78:240|241|(1:24)|25|26|27|(1:29)|237|31|32|33|34|35|(69:216|(65:218|(1:220)|38|(1:40)|41|(1:43)|44|(2:46|(1:204)(55:48|49|(1:51)|52|(1:54)(2:196|(1:201)(1:200))|55|(1:57)(1:195)|58|(1:60)(5:183|(1:185)|186|(1:188)(1:194)|(1:190)(2:191|(1:193)))|61|(1:63)(6:165|(4:168|(2:176|177)(1:174)|175|166)|178|179|(1:181)|182)|64|(1:66)(1:164)|(1:68)|69|(38:160|161|(1:75)|76|(1:78)|79|(32:151|(1:155)|(1:83)|84|(28:146|(1:150)|(1:88)|89|(24:143|(1:145)|(1:93)|94|(1:96)|97|(1:99)|100|(3:102|(1:107)(1:105)|106)|108|(1:110)|111|(1:113)|114|(1:116)|117|(1:142)|119|(6:127|128|(1:130)(1:137)|131|(1:133)(1:136)|134)|121|122|(1:124)|125|126)|91|(0)|94|(0)|97|(0)|100|(0)|108|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|122|(0)|125|126)|86|(0)|89|(0)|91|(0)|94|(0)|97|(0)|100|(0)|108|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|122|(0)|125|126)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|97|(0)|100|(0)|108|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|122|(0)|125|126)|71|(38:156|157|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|97|(0)|100|(0)|108|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|122|(0)|125|126)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|97|(0)|100|(0)|108|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|122|(0)|125|126))(1:215)|205|(2:210|211)|(1:208)(1:209)|49|(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|97|(0)|100|(0)|108|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|122|(0)|125|126)|221|(65:223|(1:225)|38|(0)|41|(0)|44|(0)(0)|205|(0)|(0)(0)|49|(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|97|(0)|100|(0)|108|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|122|(0)|125|126)(1:233)|226|(3:228|(1:230)(1:232)|231)|38|(0)|41|(0)|44|(0)(0)|205|(0)|(0)(0)|49|(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|97|(0)|100|(0)|108|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|122|(0)|125|126)|37|38|(0)|41|(0)|44|(0)(0)|205|(0)|(0)(0)|49|(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|97|(0)|100|(0)|108|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|122|(0)|125|126)|22|(0)|25|26|27|(0)|237|31|32|33|34|35|(0)|37|38|(0)|41|(0)|44|(0)(0)|205|(0)|(0)(0)|49|(0)|52|(0)(0)|55|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|(0)|69|(0)|71|(0)|73|(0)|76|(0)|79|(0)|81|(0)|84|(0)|86|(0)|89|(0)|91|(0)|94|(0)|97|(0)|100|(0)|108|(0)|111|(0)|114|(0)|117|(0)|119|(0)|121|122|(0)|125|126) */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x00c1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x00c2, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x050d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x037e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bb A[Catch: NameNotFoundException -> 0x00c1, TRY_LEAVE, TryCatch #6 {NameNotFoundException -> 0x00c1, blocks: (B:27:0x00b5, B:29:0x00bb), top: B:26:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0496  */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v170 */
    /* JADX WARN: Type inference failed for: r0v171 */
    /* JADX WARN: Type inference failed for: r0v88, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean j() {
        b70 b70Var;
        FirebaseMessagingService firebaseMessagingService;
        nq0 nq0Var;
        Bundle bundle;
        AtomicInteger atomicInteger;
        String y;
        String y2;
        String z;
        int i2;
        int i3;
        int i4;
        String z2;
        Uri defaultUri;
        String z3;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String z4;
        Integer valueOf;
        String z5;
        Integer s;
        Integer s2;
        Integer s3;
        Long x;
        long[] A;
        int[] u;
        ?? r0;
        String z6;
        IconCompat iconCompat;
        IconCompat iconCompat2;
        boolean z7;
        int i5;
        String string;
        ApplicationInfo applicationInfo;
        if (((nq0) this.h).r("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService2 = (FirebaseMessagingService) this.g;
        if (!((KeyguardManager) firebaseMessagingService2.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            int myPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService2.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == myPid) {
                        if (next.importance == 100) {
                            return false;
                        }
                    }
                }
            }
        }
        String z8 = ((nq0) this.h).z("gcm.n.image");
        if (!TextUtils.isEmpty(z8)) {
            try {
                b70Var = new b70(new URL(z8));
            } catch (MalformedURLException unused) {
                Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + z8);
            }
            if (b70Var != null) {
                ExecutorService executorService = (ExecutorService) this.e;
                ng1 ng1Var = new ng1();
                b70Var.e = executorService.submit(new x4(b70Var, 6, ng1Var));
                b70Var.g = ng1Var.a;
            }
            firebaseMessagingService = (FirebaseMessagingService) this.g;
            nq0Var = (nq0) this.h;
            AtomicInteger atomicInteger2 = bj.a;
            applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
            bundle = Bundle.EMPTY;
            Bundle bundle2 = bundle;
            String z9 = nq0Var.z("gcm.n.android_channel_id");
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(z9)) {
                    if (notificationManager.getNotificationChannel(z9) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + z9 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    atomicInteger = bj.a;
                    String packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    PackageManager packageManager = firebaseMessagingService.getPackageManager();
                    gq0 gq0Var = new gq0(firebaseMessagingService, z9);
                    y = nq0Var.y(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(y)) {
                        gq0Var.e = gq0.b(y);
                    }
                    y2 = nq0Var.y(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(y2)) {
                        gq0Var.f = gq0.b(y2);
                        eq0 eq0Var = new eq0();
                        eq0Var.e = gq0.b(y2);
                        gq0Var.d(eq0Var);
                    }
                    z = nq0Var.z("gcm.n.icon");
                    if (TextUtils.isEmpty(z)) {
                        i2 = 1;
                    } else {
                        i4 = resources.getIdentifier(z, "drawable", packageName);
                        if (i4 != 0 || (i4 = resources.getIdentifier(z, "mipmap", packageName)) != 0) {
                            i2 = 1;
                            gq0Var.s.icon = i4;
                            z2 = nq0Var.z("gcm.n.sound2");
                            if (TextUtils.isEmpty(z2)) {
                                z2 = nq0Var.z("gcm.n.sound");
                            }
                            if (!TextUtils.isEmpty(z2)) {
                                defaultUri = null;
                            } else if ("default".equals(z2) || resources.getIdentifier(z2, "raw", packageName) == 0) {
                                defaultUri = RingtoneManager.getDefaultUri(2);
                            } else {
                                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + z2);
                            }
                            if (defaultUri == null) {
                                Notification notification = gq0Var.s;
                                notification.sound = defaultUri;
                                notification.audioStreamType = -1;
                                notification.audioAttributes = fq0.a(fq0.d(fq0.c(fq0.b(), 4), 5));
                            }
                            z3 = nq0Var.z("gcm.n.click_action");
                            if (TextUtils.isEmpty(z3)) {
                                launchIntentForPackage = new Intent(z3);
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setFlags(268435456);
                            } else {
                                String z10 = nq0Var.z("gcm.n.link_android");
                                if (TextUtils.isEmpty(z10)) {
                                    z10 = nq0Var.z("gcm.n.link");
                                }
                                Uri parse = !TextUtils.isEmpty(z10) ? Uri.parse(z10) : null;
                                if (parse != null) {
                                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                    launchIntentForPackage.setPackage(packageName);
                                    launchIntentForPackage.setData(parse);
                                } else {
                                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                    if (launchIntentForPackage == null) {
                                        Log.w("FirebaseMessaging", "No activity found to launch app");
                                    }
                                }
                            }
                            if (launchIntentForPackage != null) {
                                activity = null;
                            } else {
                                launchIntentForPackage.addFlags(67108864);
                                Bundle bundle3 = (Bundle) nq0Var.e;
                                Bundle bundle4 = new Bundle(bundle3);
                                for (String str : bundle3.keySet()) {
                                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                        bundle4.remove(str);
                                    }
                                }
                                launchIntentForPackage.putExtras(bundle4);
                                if (nq0Var.r("google.c.a.e")) {
                                    launchIntentForPackage.putExtra("gcm.n.analytics_data", nq0Var.D());
                                }
                                activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                            }
                            gq0Var.g = activity;
                            broadcast = nq0Var.r("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(nq0Var.D())), 1140850688);
                            if (broadcast != null) {
                                gq0Var.s.deleteIntent = broadcast;
                            }
                            z4 = nq0Var.z("gcm.n.color");
                            if (!TextUtils.isEmpty(z4)) {
                                try {
                                    valueOf = Integer.valueOf(Color.parseColor(z4));
                                } catch (IllegalArgumentException unused2) {
                                    Log.w("FirebaseMessaging", "Color is invalid: " + z4 + ". Notification will use default color.");
                                }
                                if (valueOf != null) {
                                    gq0Var.o = valueOf.intValue();
                                }
                                gq0Var.c(!nq0Var.r("gcm.n.sticky"));
                                gq0Var.m = nq0Var.r("gcm.n.local_only");
                                z5 = nq0Var.z("gcm.n.ticker");
                                if (z5 != null) {
                                    gq0Var.s.tickerText = gq0.b(z5);
                                }
                                s = nq0Var.s("gcm.n.notification_priority");
                                if (s != null) {
                                    if (s.intValue() < -2 || s.intValue() > 2) {
                                        Log.w("FirebaseMessaging", "notificationPriority is invalid " + s + ". Skipping setting notificationPriority.");
                                    }
                                    if (s != null) {
                                        gq0Var.j = s.intValue();
                                    }
                                    s2 = nq0Var.s("gcm.n.visibility");
                                    if (s2 != null) {
                                        if (s2.intValue() < -1 || s2.intValue() > i2) {
                                            Log.w("NotificationParams", "visibility is invalid: " + s2 + ". Skipping setting visibility.");
                                        }
                                        if (s2 != null) {
                                            gq0Var.p = s2.intValue();
                                        }
                                        s3 = nq0Var.s("gcm.n.notification_count");
                                        if (s3 != null) {
                                            if (s3.intValue() < 0) {
                                                Log.w("FirebaseMessaging", "notificationCount is invalid: " + s3 + ". Skipping setting notificationCount.");
                                            }
                                            if (s3 != null) {
                                                gq0Var.i = s3.intValue();
                                            }
                                            x = nq0Var.x();
                                            if (x != null) {
                                                gq0Var.k = true;
                                                gq0Var.s.when = x.longValue();
                                            }
                                            A = nq0Var.A();
                                            if (A != null) {
                                                gq0Var.s.vibrate = A;
                                            }
                                            u = nq0Var.u();
                                            if (u != null) {
                                                int i6 = u[0];
                                                int i7 = u[1];
                                                int i8 = u[2];
                                                Notification notification2 = gq0Var.s;
                                                notification2.ledARGB = i6;
                                                notification2.ledOnMS = i7;
                                                notification2.ledOffMS = i8;
                                                notification2.flags = ((i7 == 0 || i8 == 0) ? 0 : 1) | ((-2) & notification2.flags);
                                            }
                                            boolean r = nq0Var.r("gcm.n.default_sound");
                                            boolean z11 = r;
                                            if (nq0Var.r("gcm.n.default_vibrate_timings")) {
                                                z11 = (r ? 1 : 0) | 2;
                                            }
                                            r0 = z11;
                                            if (nq0Var.r("gcm.n.default_light_settings")) {
                                                r0 = (z11 ? 1 : 0) | 4;
                                            }
                                            Notification notification3 = gq0Var.s;
                                            notification3.defaults = r0;
                                            if ((r0 & 4) != 0) {
                                                notification3.flags |= 1;
                                            }
                                            z6 = nq0Var.z("gcm.n.tag");
                                            if (TextUtils.isEmpty(z6)) {
                                                z6 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                            }
                                            String str2 = z6;
                                            if (b70Var != null) {
                                                try {
                                                    zu1 zu1Var = b70Var.g;
                                                    y90.i(zu1Var);
                                                    Bitmap bitmap = (Bitmap) t80.d(zu1Var, 5L);
                                                    if (bitmap == null) {
                                                        iconCompat = null;
                                                    } else {
                                                        iconCompat = new IconCompat(1);
                                                        iconCompat.b = bitmap;
                                                    }
                                                    gq0Var.h = iconCompat;
                                                    dq0 dq0Var = new dq0();
                                                    if (bitmap == null) {
                                                        iconCompat2 = null;
                                                        z7 = true;
                                                    } else {
                                                        z7 = true;
                                                        iconCompat2 = new IconCompat(1);
                                                        iconCompat2.b = bitmap;
                                                    }
                                                    dq0Var.e = iconCompat2;
                                                    dq0Var.f = null;
                                                    dq0Var.g = z7;
                                                    gq0Var.d(dq0Var);
                                                } catch (InterruptedException unused3) {
                                                    Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                                                    b70Var.close();
                                                    Thread.currentThread().interrupt();
                                                } catch (ExecutionException e) {
                                                    Log.w("FirebaseMessaging", "Failed to download image: " + e.getCause());
                                                } catch (TimeoutException unused4) {
                                                    Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                                                    b70Var.close();
                                                }
                                            }
                                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                                                Log.d("FirebaseMessaging", "Showing notification");
                                            }
                                            ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str2, 0, gq0Var.a());
                                            return true;
                                        }
                                        s3 = null;
                                        if (s3 != null) {
                                        }
                                        x = nq0Var.x();
                                        if (x != null) {
                                        }
                                        A = nq0Var.A();
                                        if (A != null) {
                                        }
                                        u = nq0Var.u();
                                        if (u != null) {
                                        }
                                        boolean r2 = nq0Var.r("gcm.n.default_sound");
                                        boolean z112 = r2;
                                        if (nq0Var.r("gcm.n.default_vibrate_timings")) {
                                        }
                                        r0 = z112;
                                        if (nq0Var.r("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification32 = gq0Var.s;
                                        notification32.defaults = r0;
                                        if ((r0 & 4) != 0) {
                                        }
                                        z6 = nq0Var.z("gcm.n.tag");
                                        if (TextUtils.isEmpty(z6)) {
                                        }
                                        String str22 = z6;
                                        if (b70Var != null) {
                                        }
                                        if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        }
                                        ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str22, 0, gq0Var.a());
                                        return true;
                                    }
                                    s2 = null;
                                    if (s2 != null) {
                                    }
                                    s3 = nq0Var.s("gcm.n.notification_count");
                                    if (s3 != null) {
                                    }
                                    s3 = null;
                                    if (s3 != null) {
                                    }
                                    x = nq0Var.x();
                                    if (x != null) {
                                    }
                                    A = nq0Var.A();
                                    if (A != null) {
                                    }
                                    u = nq0Var.u();
                                    if (u != null) {
                                    }
                                    boolean r22 = nq0Var.r("gcm.n.default_sound");
                                    boolean z1122 = r22;
                                    if (nq0Var.r("gcm.n.default_vibrate_timings")) {
                                    }
                                    r0 = z1122;
                                    if (nq0Var.r("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification322 = gq0Var.s;
                                    notification322.defaults = r0;
                                    if ((r0 & 4) != 0) {
                                    }
                                    z6 = nq0Var.z("gcm.n.tag");
                                    if (TextUtils.isEmpty(z6)) {
                                    }
                                    String str222 = z6;
                                    if (b70Var != null) {
                                    }
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    }
                                    ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str222, 0, gq0Var.a());
                                    return true;
                                }
                                s = null;
                                if (s != null) {
                                }
                                s2 = nq0Var.s("gcm.n.visibility");
                                if (s2 != null) {
                                }
                                s2 = null;
                                if (s2 != null) {
                                }
                                s3 = nq0Var.s("gcm.n.notification_count");
                                if (s3 != null) {
                                }
                                s3 = null;
                                if (s3 != null) {
                                }
                                x = nq0Var.x();
                                if (x != null) {
                                }
                                A = nq0Var.A();
                                if (A != null) {
                                }
                                u = nq0Var.u();
                                if (u != null) {
                                }
                                boolean r222 = nq0Var.r("gcm.n.default_sound");
                                boolean z11222 = r222;
                                if (nq0Var.r("gcm.n.default_vibrate_timings")) {
                                }
                                r0 = z11222;
                                if (nq0Var.r("gcm.n.default_light_settings")) {
                                }
                                Notification notification3222 = gq0Var.s;
                                notification3222.defaults = r0;
                                if ((r0 & 4) != 0) {
                                }
                                z6 = nq0Var.z("gcm.n.tag");
                                if (TextUtils.isEmpty(z6)) {
                                }
                                String str2222 = z6;
                                if (b70Var != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str2222, 0, gq0Var.a());
                                return true;
                            }
                            i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                            if (i5 != 0) {
                                try {
                                    valueOf = Integer.valueOf(firebaseMessagingService.getColor(i5));
                                } catch (Resources.NotFoundException unused5) {
                                    Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                                }
                                if (valueOf != null) {
                                }
                                gq0Var.c(!nq0Var.r("gcm.n.sticky"));
                                gq0Var.m = nq0Var.r("gcm.n.local_only");
                                z5 = nq0Var.z("gcm.n.ticker");
                                if (z5 != null) {
                                }
                                s = nq0Var.s("gcm.n.notification_priority");
                                if (s != null) {
                                }
                                s = null;
                                if (s != null) {
                                }
                                s2 = nq0Var.s("gcm.n.visibility");
                                if (s2 != null) {
                                }
                                s2 = null;
                                if (s2 != null) {
                                }
                                s3 = nq0Var.s("gcm.n.notification_count");
                                if (s3 != null) {
                                }
                                s3 = null;
                                if (s3 != null) {
                                }
                                x = nq0Var.x();
                                if (x != null) {
                                }
                                A = nq0Var.A();
                                if (A != null) {
                                }
                                u = nq0Var.u();
                                if (u != null) {
                                }
                                boolean r2222 = nq0Var.r("gcm.n.default_sound");
                                boolean z112222 = r2222;
                                if (nq0Var.r("gcm.n.default_vibrate_timings")) {
                                }
                                r0 = z112222;
                                if (nq0Var.r("gcm.n.default_light_settings")) {
                                }
                                Notification notification32222 = gq0Var.s;
                                notification32222.defaults = r0;
                                if ((r0 & 4) != 0) {
                                }
                                z6 = nq0Var.z("gcm.n.tag");
                                if (TextUtils.isEmpty(z6)) {
                                }
                                String str22222 = z6;
                                if (b70Var != null) {
                                }
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                }
                                ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str22222, 0, gq0Var.a());
                                return true;
                            }
                            valueOf = null;
                            if (valueOf != null) {
                            }
                            gq0Var.c(!nq0Var.r("gcm.n.sticky"));
                            gq0Var.m = nq0Var.r("gcm.n.local_only");
                            z5 = nq0Var.z("gcm.n.ticker");
                            if (z5 != null) {
                            }
                            s = nq0Var.s("gcm.n.notification_priority");
                            if (s != null) {
                            }
                            s = null;
                            if (s != null) {
                            }
                            s2 = nq0Var.s("gcm.n.visibility");
                            if (s2 != null) {
                            }
                            s2 = null;
                            if (s2 != null) {
                            }
                            s3 = nq0Var.s("gcm.n.notification_count");
                            if (s3 != null) {
                            }
                            s3 = null;
                            if (s3 != null) {
                            }
                            x = nq0Var.x();
                            if (x != null) {
                            }
                            A = nq0Var.A();
                            if (A != null) {
                            }
                            u = nq0Var.u();
                            if (u != null) {
                            }
                            boolean r22222 = nq0Var.r("gcm.n.default_sound");
                            boolean z1122222 = r22222;
                            if (nq0Var.r("gcm.n.default_vibrate_timings")) {
                            }
                            r0 = z1122222;
                            if (nq0Var.r("gcm.n.default_light_settings")) {
                            }
                            Notification notification322222 = gq0Var.s;
                            notification322222.defaults = r0;
                            if ((r0 & 4) != 0) {
                            }
                            z6 = nq0Var.z("gcm.n.tag");
                            if (TextUtils.isEmpty(z6)) {
                            }
                            String str222222 = z6;
                            if (b70Var != null) {
                            }
                            if (Log.isLoggable("FirebaseMessaging", 3)) {
                            }
                            ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str222222, 0, gq0Var.a());
                            return true;
                        }
                        i2 = 1;
                        Log.w("FirebaseMessaging", "Icon resource " + z + " not found. Notification will use default icon.");
                    }
                    i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i3 == 0) {
                        try {
                            i3 = packageManager.getApplicationInfo(packageName, 0).icon;
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e2);
                        }
                    }
                    i4 = i3 != 0 ? i3 : 17301651;
                    gq0Var.s.icon = i4;
                    z2 = nq0Var.z("gcm.n.sound2");
                    if (TextUtils.isEmpty(z2)) {
                    }
                    if (!TextUtils.isEmpty(z2)) {
                    }
                    if (defaultUri == null) {
                    }
                    z3 = nq0Var.z("gcm.n.click_action");
                    if (TextUtils.isEmpty(z3)) {
                    }
                    if (launchIntentForPackage != null) {
                    }
                    gq0Var.g = activity;
                    if (nq0Var.r("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    z4 = nq0Var.z("gcm.n.color");
                    if (!TextUtils.isEmpty(z4)) {
                    }
                    i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i5 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    gq0Var.c(!nq0Var.r("gcm.n.sticky"));
                    gq0Var.m = nq0Var.r("gcm.n.local_only");
                    z5 = nq0Var.z("gcm.n.ticker");
                    if (z5 != null) {
                    }
                    s = nq0Var.s("gcm.n.notification_priority");
                    if (s != null) {
                    }
                    s = null;
                    if (s != null) {
                    }
                    s2 = nq0Var.s("gcm.n.visibility");
                    if (s2 != null) {
                    }
                    s2 = null;
                    if (s2 != null) {
                    }
                    s3 = nq0Var.s("gcm.n.notification_count");
                    if (s3 != null) {
                    }
                    s3 = null;
                    if (s3 != null) {
                    }
                    x = nq0Var.x();
                    if (x != null) {
                    }
                    A = nq0Var.A();
                    if (A != null) {
                    }
                    u = nq0Var.u();
                    if (u != null) {
                    }
                    boolean r222222 = nq0Var.r("gcm.n.default_sound");
                    boolean z11222222 = r222222;
                    if (nq0Var.r("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z11222222;
                    if (nq0Var.r("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222 = gq0Var.s;
                    notification3222222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    z6 = nq0Var.z("gcm.n.tag");
                    if (TextUtils.isEmpty(z6)) {
                    }
                    String str2222222 = z6;
                    if (b70Var != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str2222222, 0, gq0Var.a());
                    return true;
                }
                z9 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(z9)) {
                    if (notificationManager.getNotificationChannel(z9) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    atomicInteger = bj.a;
                    String packageName2 = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    PackageManager packageManager2 = firebaseMessagingService.getPackageManager();
                    gq0 gq0Var2 = new gq0(firebaseMessagingService, z9);
                    y = nq0Var.y(resources2, packageName2, "gcm.n.title");
                    if (!TextUtils.isEmpty(y)) {
                    }
                    y2 = nq0Var.y(resources2, packageName2, "gcm.n.body");
                    if (!TextUtils.isEmpty(y2)) {
                    }
                    z = nq0Var.z("gcm.n.icon");
                    if (TextUtils.isEmpty(z)) {
                    }
                    i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i3 == 0) {
                    }
                    if (i3 != 0) {
                    }
                    gq0Var2.s.icon = i4;
                    z2 = nq0Var.z("gcm.n.sound2");
                    if (TextUtils.isEmpty(z2)) {
                    }
                    if (!TextUtils.isEmpty(z2)) {
                    }
                    if (defaultUri == null) {
                    }
                    z3 = nq0Var.z("gcm.n.click_action");
                    if (TextUtils.isEmpty(z3)) {
                    }
                    if (launchIntentForPackage != null) {
                    }
                    gq0Var2.g = activity;
                    if (nq0Var.r("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    z4 = nq0Var.z("gcm.n.color");
                    if (!TextUtils.isEmpty(z4)) {
                    }
                    i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i5 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    gq0Var2.c(!nq0Var.r("gcm.n.sticky"));
                    gq0Var2.m = nq0Var.r("gcm.n.local_only");
                    z5 = nq0Var.z("gcm.n.ticker");
                    if (z5 != null) {
                    }
                    s = nq0Var.s("gcm.n.notification_priority");
                    if (s != null) {
                    }
                    s = null;
                    if (s != null) {
                    }
                    s2 = nq0Var.s("gcm.n.visibility");
                    if (s2 != null) {
                    }
                    s2 = null;
                    if (s2 != null) {
                    }
                    s3 = nq0Var.s("gcm.n.notification_count");
                    if (s3 != null) {
                    }
                    s3 = null;
                    if (s3 != null) {
                    }
                    x = nq0Var.x();
                    if (x != null) {
                    }
                    A = nq0Var.A();
                    if (A != null) {
                    }
                    u = nq0Var.u();
                    if (u != null) {
                    }
                    boolean r2222222 = nq0Var.r("gcm.n.default_sound");
                    boolean z112222222 = r2222222;
                    if (nq0Var.r("gcm.n.default_vibrate_timings")) {
                    }
                    r0 = z112222222;
                    if (nq0Var.r("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222 = gq0Var2.s;
                    notification32222222.defaults = r0;
                    if ((r0 & 4) != 0) {
                    }
                    z6 = nq0Var.z("gcm.n.tag");
                    if (TextUtils.isEmpty(z6)) {
                    }
                    String str22222222 = z6;
                    if (b70Var != null) {
                    }
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                    }
                    ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str22222222, 0, gq0Var2.a());
                    return true;
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                z9 = "fcm_fallback_notification_channel";
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = firebaseMessagingService.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                atomicInteger = bj.a;
                String packageName22 = firebaseMessagingService.getPackageName();
                Resources resources22 = firebaseMessagingService.getResources();
                PackageManager packageManager22 = firebaseMessagingService.getPackageManager();
                gq0 gq0Var22 = new gq0(firebaseMessagingService, z9);
                y = nq0Var.y(resources22, packageName22, "gcm.n.title");
                if (!TextUtils.isEmpty(y)) {
                }
                y2 = nq0Var.y(resources22, packageName22, "gcm.n.body");
                if (!TextUtils.isEmpty(y2)) {
                }
                z = nq0Var.z("gcm.n.icon");
                if (TextUtils.isEmpty(z)) {
                }
                i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i3 == 0) {
                }
                if (i3 != 0) {
                }
                gq0Var22.s.icon = i4;
                z2 = nq0Var.z("gcm.n.sound2");
                if (TextUtils.isEmpty(z2)) {
                }
                if (!TextUtils.isEmpty(z2)) {
                }
                if (defaultUri == null) {
                }
                z3 = nq0Var.z("gcm.n.click_action");
                if (TextUtils.isEmpty(z3)) {
                }
                if (launchIntentForPackage != null) {
                }
                gq0Var22.g = activity;
                if (nq0Var.r("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                z4 = nq0Var.z("gcm.n.color");
                if (!TextUtils.isEmpty(z4)) {
                }
                i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i5 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                gq0Var22.c(!nq0Var.r("gcm.n.sticky"));
                gq0Var22.m = nq0Var.r("gcm.n.local_only");
                z5 = nq0Var.z("gcm.n.ticker");
                if (z5 != null) {
                }
                s = nq0Var.s("gcm.n.notification_priority");
                if (s != null) {
                }
                s = null;
                if (s != null) {
                }
                s2 = nq0Var.s("gcm.n.visibility");
                if (s2 != null) {
                }
                s2 = null;
                if (s2 != null) {
                }
                s3 = nq0Var.s("gcm.n.notification_count");
                if (s3 != null) {
                }
                s3 = null;
                if (s3 != null) {
                }
                x = nq0Var.x();
                if (x != null) {
                }
                A = nq0Var.A();
                if (A != null) {
                }
                u = nq0Var.u();
                if (u != null) {
                }
                boolean r22222222 = nq0Var.r("gcm.n.default_sound");
                boolean z1122222222 = r22222222;
                if (nq0Var.r("gcm.n.default_vibrate_timings")) {
                }
                r0 = z1122222222;
                if (nq0Var.r("gcm.n.default_light_settings")) {
                }
                Notification notification322222222 = gq0Var22.s;
                notification322222222.defaults = r0;
                if ((r0 & 4) != 0) {
                }
                z6 = nq0Var.z("gcm.n.tag");
                if (TextUtils.isEmpty(z6)) {
                }
                String str222222222 = z6;
                if (b70Var != null) {
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                }
                ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str222222222, 0, gq0Var22.a());
                return true;
            }
            z9 = null;
            atomicInteger = bj.a;
            String packageName222 = firebaseMessagingService.getPackageName();
            Resources resources222 = firebaseMessagingService.getResources();
            PackageManager packageManager222 = firebaseMessagingService.getPackageManager();
            gq0 gq0Var222 = new gq0(firebaseMessagingService, z9);
            y = nq0Var.y(resources222, packageName222, "gcm.n.title");
            if (!TextUtils.isEmpty(y)) {
            }
            y2 = nq0Var.y(resources222, packageName222, "gcm.n.body");
            if (!TextUtils.isEmpty(y2)) {
            }
            z = nq0Var.z("gcm.n.icon");
            if (TextUtils.isEmpty(z)) {
            }
            i3 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (i3 == 0) {
            }
            if (i3 != 0) {
            }
            gq0Var222.s.icon = i4;
            z2 = nq0Var.z("gcm.n.sound2");
            if (TextUtils.isEmpty(z2)) {
            }
            if (!TextUtils.isEmpty(z2)) {
            }
            if (defaultUri == null) {
            }
            z3 = nq0Var.z("gcm.n.click_action");
            if (TextUtils.isEmpty(z3)) {
            }
            if (launchIntentForPackage != null) {
            }
            gq0Var222.g = activity;
            if (nq0Var.r("google.c.a.e")) {
            }
            if (broadcast != null) {
            }
            z4 = nq0Var.z("gcm.n.color");
            if (!TextUtils.isEmpty(z4)) {
            }
            i5 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i5 != 0) {
            }
            valueOf = null;
            if (valueOf != null) {
            }
            gq0Var222.c(!nq0Var.r("gcm.n.sticky"));
            gq0Var222.m = nq0Var.r("gcm.n.local_only");
            z5 = nq0Var.z("gcm.n.ticker");
            if (z5 != null) {
            }
            s = nq0Var.s("gcm.n.notification_priority");
            if (s != null) {
            }
            s = null;
            if (s != null) {
            }
            s2 = nq0Var.s("gcm.n.visibility");
            if (s2 != null) {
            }
            s2 = null;
            if (s2 != null) {
            }
            s3 = nq0Var.s("gcm.n.notification_count");
            if (s3 != null) {
            }
            s3 = null;
            if (s3 != null) {
            }
            x = nq0Var.x();
            if (x != null) {
            }
            A = nq0Var.A();
            if (A != null) {
            }
            u = nq0Var.u();
            if (u != null) {
            }
            boolean r222222222 = nq0Var.r("gcm.n.default_sound");
            boolean z11222222222 = r222222222;
            if (nq0Var.r("gcm.n.default_vibrate_timings")) {
            }
            r0 = z11222222222;
            if (nq0Var.r("gcm.n.default_light_settings")) {
            }
            Notification notification3222222222 = gq0Var222.s;
            notification3222222222.defaults = r0;
            if ((r0 & 4) != 0) {
            }
            z6 = nq0Var.z("gcm.n.tag");
            if (TextUtils.isEmpty(z6)) {
            }
            String str2222222222 = z6;
            if (b70Var != null) {
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
            }
            ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str2222222222, 0, gq0Var222.a());
            return true;
        }
        b70Var = null;
        if (b70Var != null) {
        }
        firebaseMessagingService = (FirebaseMessagingService) this.g;
        nq0Var = (nq0) this.h;
        AtomicInteger atomicInteger22 = bj.a;
        applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
        if (applicationInfo != null) {
        }
        bundle = Bundle.EMPTY;
        Bundle bundle22 = bundle;
        String z92 = nq0Var.z("gcm.n.android_channel_id");
        if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
        }
        z92 = null;
        atomicInteger = bj.a;
        String packageName2222 = firebaseMessagingService.getPackageName();
        Resources resources2222 = firebaseMessagingService.getResources();
        PackageManager packageManager2222 = firebaseMessagingService.getPackageManager();
        gq0 gq0Var2222 = new gq0(firebaseMessagingService, z92);
        y = nq0Var.y(resources2222, packageName2222, "gcm.n.title");
        if (!TextUtils.isEmpty(y)) {
        }
        y2 = nq0Var.y(resources2222, packageName2222, "gcm.n.body");
        if (!TextUtils.isEmpty(y2)) {
        }
        z = nq0Var.z("gcm.n.icon");
        if (TextUtils.isEmpty(z)) {
        }
        i3 = bundle22.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i3 == 0) {
        }
        if (i3 != 0) {
        }
        gq0Var2222.s.icon = i4;
        z2 = nq0Var.z("gcm.n.sound2");
        if (TextUtils.isEmpty(z2)) {
        }
        if (!TextUtils.isEmpty(z2)) {
        }
        if (defaultUri == null) {
        }
        z3 = nq0Var.z("gcm.n.click_action");
        if (TextUtils.isEmpty(z3)) {
        }
        if (launchIntentForPackage != null) {
        }
        gq0Var2222.g = activity;
        if (nq0Var.r("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        z4 = nq0Var.z("gcm.n.color");
        if (!TextUtils.isEmpty(z4)) {
        }
        i5 = bundle22.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i5 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        gq0Var2222.c(!nq0Var.r("gcm.n.sticky"));
        gq0Var2222.m = nq0Var.r("gcm.n.local_only");
        z5 = nq0Var.z("gcm.n.ticker");
        if (z5 != null) {
        }
        s = nq0Var.s("gcm.n.notification_priority");
        if (s != null) {
        }
        s = null;
        if (s != null) {
        }
        s2 = nq0Var.s("gcm.n.visibility");
        if (s2 != null) {
        }
        s2 = null;
        if (s2 != null) {
        }
        s3 = nq0Var.s("gcm.n.notification_count");
        if (s3 != null) {
        }
        s3 = null;
        if (s3 != null) {
        }
        x = nq0Var.x();
        if (x != null) {
        }
        A = nq0Var.A();
        if (A != null) {
        }
        u = nq0Var.u();
        if (u != null) {
        }
        boolean r2222222222 = nq0Var.r("gcm.n.default_sound");
        boolean z112222222222 = r2222222222;
        if (nq0Var.r("gcm.n.default_vibrate_timings")) {
        }
        r0 = z112222222222;
        if (nq0Var.r("gcm.n.default_light_settings")) {
        }
        Notification notification32222222222 = gq0Var2222.s;
        notification32222222222.defaults = r0;
        if ((r0 & 4) != 0) {
        }
        z6 = nq0Var.z("gcm.n.tag");
        if (TextUtils.isEmpty(z6)) {
        }
        String str22222222222 = z6;
        if (b70Var != null) {
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((NotificationManager) ((FirebaseMessagingService) this.g).getSystemService("notification")).notify(str22222222222, 0, gq0Var2222.a());
        return true;
    }

    public boolean k(CharSequence charSequence, int i2, int i3, yj1 yj1Var) {
        if ((yj1Var.c & 3) == 0) {
            zp zpVar = (zp) this.h;
            rl0 b = yj1Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.h).getShort(a + b.d);
            }
            zpVar.getClass();
            ThreadLocal threadLocal = zp.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = zpVar.a;
            String sb2 = sb.toString();
            int i4 = lu0.a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i5 = yj1Var.c & 4;
            yj1Var.c = hasGlyph ? i5 | 2 : i5 | 1;
        }
        return (yj1Var.c & 3) == 2;
    }

    public boolean l() {
        return !(((fc1) ((s40) this.e).e).isEmpty() && ((fc1) ((s40) this.h).e).isEmpty() && ((fc1) ((s40) this.g).e).isEmpty());
    }

    public boolean m() {
        if (((yd1) this.e).getValue() != this.h) {
            return true;
        }
        i8 i8Var = (i8) this.g;
        return i8Var != null && i8Var.m();
    }

    public Object n(CharSequence charSequence, int i2, int i3, int i4, boolean z, ev evVar) {
        int i5;
        char c;
        gv gvVar = new gv((tl0) ((o91) this.g).g);
        int codePointAt = Character.codePointAt(charSequence, i2);
        int i6 = 0;
        boolean z2 = true;
        int i7 = i2;
        loop0: while (true) {
            i5 = i7;
            while (i7 < i3 && i6 < i4 && z2) {
                SparseArray sparseArray = gvVar.c.a;
                tl0 tl0Var = sparseArray == null ? null : (tl0) sparseArray.get(codePointAt);
                if (gvVar.a == 2) {
                    if (tl0Var != null) {
                        gvVar.c = tl0Var;
                        gvVar.f++;
                    } else {
                        if (codePointAt == 65038) {
                            gvVar.a();
                        } else if (codePointAt != 65039) {
                            tl0 tl0Var2 = gvVar.c;
                            if (tl0Var2.b != null) {
                                if (gvVar.f != 1) {
                                    gvVar.d = tl0Var2;
                                    gvVar.a();
                                } else if (gvVar.b()) {
                                    gvVar.d = gvVar.c;
                                    gvVar.a();
                                } else {
                                    gvVar.a();
                                }
                                c = 3;
                            } else {
                                gvVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (tl0Var == null) {
                    gvVar.a();
                    c = 1;
                } else {
                    gvVar.a = 2;
                    gvVar.c = tl0Var;
                    gvVar.f = 1;
                    c = 2;
                }
                gvVar.e = codePointAt;
                if (c == 1) {
                    i7 = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                    if (i7 < i3) {
                        codePointAt = Character.codePointAt(charSequence, i7);
                    }
                } else if (c == 2) {
                    int charCount = Character.charCount(codePointAt) + i7;
                    if (charCount < i3) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i7 = charCount;
                } else if (c == 3) {
                    if (z || !k(charSequence, i5, i7, gvVar.d.b)) {
                        z2 = evVar.b(charSequence, i5, i7, gvVar.d.b);
                        i6++;
                    }
                }
            }
        }
        if (gvVar.a == 2 && gvVar.c.b != null && ((gvVar.f > 1 || gvVar.b()) && i6 < i4 && z2 && (z || !k(charSequence, i5, i7, gvVar.c.b)))) {
            evVar.b(charSequence, i5, i7, gvVar.c.b);
        }
        return evVar.a();
    }

    public void o(cc ccVar, int i2, boolean z) {
        yb ybVar = (yb) this.g;
        Context context = (Context) this.h;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = ccVar.a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        dz0 dz0Var = ccVar.c;
        adler32.update(allocate.putInt(ez0.a(dz0Var)).array());
        byte[] bArr = ccVar.b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i3 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i3 >= i2) {
                        xa0.k("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", ccVar);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((b51) this.e).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(ez0.a(dz0Var))});
        try {
            Long valueOf = rawQuery.moveToNext() ? Long.valueOf(rawQuery.getLong(0)) : 0L;
            rawQuery.close();
            long longValue = valueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(ybVar.a(dz0Var, longValue, i2));
            Set set = ((zb) ybVar.b.get(dz0Var)).c;
            if (set.contains(t61.d)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(t61.g)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(t61.e)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i2);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", ez0.a(dz0Var));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {ccVar, Integer.valueOf(value), Long.valueOf(ybVar.a(dz0Var, longValue, i2)), valueOf, Integer.valueOf(i2)};
            String concat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(concat, 3)) {
                Log.d(concat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        t41 t41Var = (t41) this.e;
        String str = (String) this.g;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.h;
        synchronized (t41Var.a) {
            t41Var.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    public void p(ib ibVar) {
        dd0 dd0Var = new dd0(13);
        ij1 ij1Var = (ij1) this.h;
        cc ccVar = (cc) this.e;
        vv vvVar = (vv) this.g;
        oq oqVar = ij1Var.c;
        i8 a = cc.a();
        a.r(ccVar.a);
        a.h = dz0.d;
        a.g = ccVar.b;
        cc b = a.b();
        jb jbVar = new jb();
        jbVar.f = new HashMap();
        jbVar.d = Long.valueOf(ij1Var.a.d());
        jbVar.e = Long.valueOf(ij1Var.b.d());
        jbVar.a = "FCM_CLIENT_EVENT_LOGGING";
        ol0 ol0Var = ibVar.a;
        i8 i8Var = d01.a;
        i8Var.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            i8Var.f(ol0Var, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        jbVar.c = new sv(vvVar, byteArrayOutputStream.toByteArray());
        jbVar.b = null;
        oqVar.b.execute(new lq(oqVar, b, dd0Var, jbVar.g()));
    }

    public void q(Object obj) {
        long l = t90.l();
        if (l == gi1.a) {
            this.h = obj;
            return;
        }
        synchronized (this.g) {
            di1 di1Var = (di1) ((AtomicReference) this.e).get();
            int a = di1Var.a(l);
            if (a < 0) {
                ((AtomicReference) this.e).set(di1Var.b(l, obj));
            } else {
                di1Var.c[a] = obj;
            }
        }
    }

    public void r(String str) {
        if (str != null) {
            this.e = str;
        } else {
            l.b("Null backendName");
        }
    }

    public void s(xf xfVar) {
        ((zf) this.h).d.c = xfVar;
    }

    public void t(nr nrVar) {
        ((zf) this.h).d.a = nrVar;
    }

    public void u(vc0 vc0Var) {
        ((zf) this.h).d.b = vc0Var;
    }

    public void v(long j2) {
        ((zf) this.h).d.d = j2;
    }

    public void w() {
        vn0 vn0Var = (vn0) this.e;
        String str = (String) this.g;
        List list = (List) vn0Var.k(str);
        if (list != null) {
            list.remove((Function0) this.h);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        vn0Var.m(str, list);
    }

    public /* synthetic */ i8(Context context, Object obj, Object obj2, int i2) {
        this.d = i2;
        this.h = context;
        this.e = obj;
        this.g = obj2;
    }

    public /* synthetic */ i8(Object obj, Object obj2, Object obj3, int i2) {
        this.d = i2;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    public i8(j11 j11Var) {
        this.d = 14;
        this.e = new ha(0);
        this.g = new mc();
        this.h = new vc(this, 6, j11Var);
    }

    public i8(cc ccVar, vv vvVar, dd0 dd0Var, ij1 ij1Var) {
        this.d = 22;
        this.e = ccVar;
        this.g = vvVar;
        this.h = ij1Var;
    }

    public i8(int i2) {
        this.d = i2;
        int i3 = 2;
        switch (i2) {
            case 2:
                this.e = new lj0(16);
                long[] jArr = q61.a;
                this.g = new vn0();
                this.h = new sc1(i3);
                break;
            case ry0.BYTES_FIELD_NUMBER /* 8 */:
                this.e = new s40(21);
                this.g = new s40(21);
                this.h = new s40(21);
                break;
            case 16:
                long[] jArr2 = q61.a;
                this.e = new vn0();
                break;
            case 21:
                this.e = new AtomicReference(p4.n);
                this.g = new Object();
                break;
            case 25:
                this.e = new WeakHashMap();
                this.g = new WeakHashMap();
                this.h = new WeakHashMap();
                break;
            default:
                this.h = new sc1(i3);
                break;
        }
    }

    public i8(FirebaseMessagingService firebaseMessagingService, nq0 nq0Var, ExecutorService executorService) {
        this.d = 9;
        this.e = executorService;
        this.g = firebaseMessagingService;
        this.h = nq0Var;
    }

    public i8(zf zfVar) {
        this.d = 4;
        this.h = zfVar;
        this.e = new s40(11, this);
    }

    public /* synthetic */ i8(int i2, boolean z) {
        this.d = i2;
    }

    public i8(Context context) {
        this.d = 0;
        this.h = context.getApplicationContext();
        this.g = new HashSet();
        this.e = new HashMap();
    }

    public i8(o91 o91Var, a60 a60Var, zp zpVar, Set set) {
        this.d = 10;
        this.e = a60Var;
        this.g = o91Var;
        this.h = zpVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            n(str, 0, str.length(), 1, true, new fv(str, 0));
        }
    }

    public i8(dk1 dk1Var, i8 i8Var) {
        this.d = 24;
        this.e = dk1Var;
        this.g = i8Var;
        this.h = dk1Var.getValue();
    }

    public i8(nq0 nq0Var) {
        this.d = 18;
        this.e = nq0Var.z("gcm.n.title");
        nq0Var.w("gcm.n.title");
        Object[] v = nq0Var.v("gcm.n.title");
        if (v != null) {
            String[] strArr = new String[v.length];
            for (int i2 = 0; i2 < v.length; i2++) {
                strArr[i2] = String.valueOf(v[i2]);
            }
        }
        this.g = nq0Var.z("gcm.n.body");
        nq0Var.w("gcm.n.body");
        Object[] v2 = nq0Var.v("gcm.n.body");
        if (v2 != null) {
            String[] strArr2 = new String[v2.length];
            for (int i3 = 0; i3 < v2.length; i3++) {
                strArr2[i3] = String.valueOf(v2[i3]);
            }
        }
        nq0Var.z("gcm.n.icon");
        if (TextUtils.isEmpty(nq0Var.z("gcm.n.sound2"))) {
            nq0Var.z("gcm.n.sound");
        }
        nq0Var.z("gcm.n.tag");
        nq0Var.z("gcm.n.color");
        nq0Var.z("gcm.n.click_action");
        nq0Var.z("gcm.n.android_channel_id");
        String z = nq0Var.z("gcm.n.link_android");
        z = TextUtils.isEmpty(z) ? nq0Var.z("gcm.n.link") : z;
        if (!TextUtils.isEmpty(z)) {
            Uri.parse(z);
        }
        this.h = nq0Var.z("gcm.n.image");
        nq0Var.z("gcm.n.ticker");
        nq0Var.s("gcm.n.notification_priority");
        nq0Var.s("gcm.n.visibility");
        nq0Var.s("gcm.n.notification_count");
        nq0Var.r("gcm.n.sticky");
        nq0Var.r("gcm.n.local_only");
        nq0Var.r("gcm.n.default_sound");
        nq0Var.r("gcm.n.default_vibrate_timings");
        nq0Var.r("gcm.n.default_light_settings");
        nq0Var.x();
        nq0Var.u();
        nq0Var.A();
    }
}
