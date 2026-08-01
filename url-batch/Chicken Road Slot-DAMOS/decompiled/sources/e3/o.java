package e3;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import n4.f0;
import s.s0;
import te.f1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f3827a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3828b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3829c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3830d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3831e;

    /* JADX WARN: Multi-variable type inference failed */
    public o(g gVar) {
        int i3;
        ArrayList arrayList;
        int i10;
        this.f3831e = new Bundle();
        this.f3830d = gVar;
        Context context = gVar.f3802a;
        ArrayList arrayList2 = gVar.f3822w;
        ArrayList arrayList3 = gVar.f3804c;
        ArrayList arrayList4 = gVar.f3805d;
        this.f3828b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f3829c = j.a(context, gVar.f3818s);
        } else {
            this.f3829c = new Notification.Builder(context);
        }
        Notification notification = gVar.f3821v;
        Context context2 = null;
        ((Notification.Builder) this.f3829c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(gVar.f3806e).setContentText(gVar.f3807f).setContentInfo(null).setContentIntent(gVar.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(gVar.f3809i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) this.f3829c;
        IconCompat iconCompat = gVar.f3808h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.f(context));
        ((Notification.Builder) this.f3829c).setSubText(null).setUsesChronometer(false).setPriority(gVar.j);
        ArrayList arrayList5 = gVar.f3803b;
        int size = arrayList5.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList5.get(i11);
            i11++;
            c cVar = (c) obj;
            if (cVar.f3793b == null && (i10 = cVar.f3796e) != 0) {
                cVar.f3793b = IconCompat.b(i10);
            }
            IconCompat iconCompat2 = cVar.f3793b;
            boolean z10 = cVar.f3794c;
            Bundle bundle = cVar.f3792a;
            ArrayList arrayList6 = arrayList5;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != null ? iconCompat2.f(context2) : context2, cVar.f3797f, cVar.g);
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z10);
            builder2.setAllowGeneratedReplies(z10);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 28) {
                k.p(builder2);
            }
            if (i12 >= 29) {
                l.k(builder2);
            }
            if (i12 >= 31) {
                m.b(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", cVar.f3795d);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.f3829c).addAction(builder2.build());
            arrayList5 = arrayList6;
            context2 = null;
        }
        Bundle bundle3 = gVar.f3815p;
        if (bundle3 != null) {
            ((Bundle) this.f3831e).putAll(bundle3);
        }
        ((Notification.Builder) this.f3829c).setShowWhen(gVar.f3810k);
        ((Notification.Builder) this.f3829c).setLocalOnly(gVar.f3814o);
        ((Notification.Builder) this.f3829c).setGroup(gVar.f3812m);
        ((Notification.Builder) this.f3829c).setSortKey(null);
        ((Notification.Builder) this.f3829c).setGroupSummary(gVar.f3813n);
        this.f3827a = gVar.f3819t;
        ((Notification.Builder) this.f3829c).setCategory(null);
        ((Notification.Builder) this.f3829c).setColor(gVar.f3816q);
        ((Notification.Builder) this.f3829c).setVisibility(gVar.f3817r);
        ((Notification.Builder) this.f3829c).setPublicVersion(null);
        ((Notification.Builder) this.f3829c).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    throw v4.a.i(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    s.f fVar = new s.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Object obj2 = arrayList2.get(i13);
                i13++;
                ((Notification.Builder) this.f3829c).addPerson((String) obj2);
            }
        }
        if (arrayList4.size() > 0) {
            if (gVar.f3815p == null) {
                gVar.f3815p = new Bundle();
            }
            Bundle bundle4 = gVar.f3815p.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                String num = Integer.toString(i14);
                c cVar2 = (c) arrayList4.get(i14);
                Bundle bundle7 = new Bundle();
                if (cVar2.f3793b == null && (i3 = cVar2.f3796e) != 0) {
                    cVar2.f3793b = IconCompat.b(i3);
                }
                IconCompat iconCompat3 = cVar2.f3793b;
                Bundle bundle8 = cVar2.f3792a;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.c() : 0);
                bundle7.putCharSequence("title", cVar2.f3797f);
                bundle7.putParcelable("actionIntent", cVar2.g);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean("android.support.allowGeneratedReplies", cVar2.f3794c);
                bundle7.putBundle("extras", bundle9);
                bundle7.putParcelableArray("remoteInputs", null);
                bundle7.putBoolean("showsUserInterface", cVar2.f3795d);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (gVar.f3815p == null) {
                gVar.f3815p = new Bundle();
            }
            gVar.f3815p.putBundle("android.car.EXTENSIONS", bundle4);
            ((Bundle) this.f3831e).putBundle("android.car.EXTENSIONS", bundle5);
        }
        ((Notification.Builder) this.f3829c).setExtras(gVar.f3815p);
        ((Notification.Builder) this.f3829c).setRemoteInputHistory(null);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 26) {
            j.j((Notification.Builder) this.f3829c);
            j.p((Notification.Builder) this.f3829c);
            j.q((Notification.Builder) this.f3829c);
            j.r((Notification.Builder) this.f3829c);
            j.l((Notification.Builder) this.f3829c, gVar.f3819t);
            if (!TextUtils.isEmpty(gVar.f3818s)) {
                ((Notification.Builder) this.f3829c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i15 >= 28) {
            Iterator it2 = arrayList3.iterator();
            if (it2.hasNext()) {
                throw v4.a.i(it2);
            }
        }
        if (i15 >= 29) {
            l.i((Notification.Builder) this.f3829c, gVar.f3820u);
            l.j((Notification.Builder) this.f3829c);
        }
        if (i15 >= 36) {
            n.e((Notification.Builder) this.f3829c);
        }
    }

    public void a(boolean z10) {
        o(Boolean.valueOf(z10));
    }

    public void b(byte b10) {
        o(Byte.valueOf(b10));
    }

    public void c(char c10) {
        o(Character.valueOf(c10));
    }

    public void d(double d10) {
        o(Double.valueOf(d10));
    }

    public void e(re.e eVar, int i3) {
        eVar.getClass();
        this.f3827a = i3;
    }

    public void f(float f3) {
        o(Float.valueOf(f3));
    }

    public o g(re.e eVar) {
        eVar.getClass();
        if (r4.d.e(eVar)) {
            this.f3827a = 0;
        }
        return this;
    }

    public o h(f1 f1Var, int i3) {
        f1Var.getClass();
        e(f1Var, i3);
        g(f1Var.h(i3));
        return this;
    }

    public void i(int i3) {
        o(Integer.valueOf(i3));
    }

    public void j(long j) {
        o(Long.valueOf(j));
    }

    public void k(re.e eVar, int i3, pe.a aVar, Object obj) {
        eVar.getClass();
        aVar.getClass();
        e(eVar, i3);
        l(aVar, obj);
    }

    public void l(pe.a aVar, Object obj) {
        aVar.getClass();
        s(obj);
    }

    public void m(short s3) {
        o(Short.valueOf(s3));
    }

    public void n(String str) {
        str.getClass();
        o(str);
    }

    public void o(Object obj) {
        obj.getClass();
        s(obj);
    }

    public n4.s p(int i3) {
        return r(i3, (n4.u) this.f3828b, null, false);
    }

    public n4.s q(String str, boolean z10) {
        Object obj;
        n4.u uVar;
        str.getClass();
        s0 s0Var = (s0) this.f3829c;
        s0Var.getClass();
        Iterator it = de.k.b(new hd.u(7, s0Var)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            n4.s sVar = (n4.s) obj;
            if (kotlin.text.o.f((String) sVar.f7115e.f1698e, str, false) || sVar.f7115e.c(str) != null) {
                break;
            }
        }
        n4.s sVar2 = (n4.s) obj;
        if (sVar2 != null) {
            return sVar2;
        }
        if (!z10 || (uVar = ((n4.u) this.f3828b).f7116i) == null) {
            return null;
        }
        o oVar = uVar.f7125t;
        oVar.getClass();
        if (StringsKt.r(str)) {
            return null;
        }
        return oVar.q(str, true);
    }

    public n4.s r(int i3, n4.s sVar, n4.s sVar2, boolean z10) {
        n4.u uVar = (n4.u) this.f3828b;
        s0 s0Var = (s0) this.f3829c;
        n4.s sVar3 = (n4.s) s0Var.c(i3);
        if (sVar2 != null) {
            if (Intrinsics.a(sVar3, sVar2) && Intrinsics.a(sVar3.f7116i, sVar2.f7116i)) {
                return sVar3;
            }
            sVar3 = null;
        } else if (sVar3 != null) {
            return sVar3;
        }
        if (z10) {
            Iterator it = de.k.b(new hd.u(7, s0Var)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    sVar3 = null;
                    break;
                }
                n4.s sVar4 = (n4.s) it.next();
                sVar3 = (!(sVar4 instanceof n4.u) || sVar4.equals(sVar)) ? null : ((n4.u) sVar4).f7125t.r(i3, uVar, sVar2, true);
                if (sVar3 != null) {
                    break;
                }
            }
        }
        if (sVar3 != null) {
            return sVar3;
        }
        n4.u uVar2 = uVar.f7116i;
        if (uVar2 == null || uVar2.equals(sVar)) {
            return null;
        }
        n4.u uVar3 = uVar.f7116i;
        uVar3.getClass();
        return uVar3.f7125t.r(i3, uVar, sVar2, z10);
    }

    public void s(Object obj) {
        String d10 = ((pe.a) this.f3828b).d().d(this.f3827a);
        f0 f0Var = (f0) ((LinkedHashMap) this.f3829c).get(d10);
        if (f0Var == null) {
            throw new IllegalStateException(n0.l.g("Cannot find NavType for argument ", d10, ". Please provide NavType through typeMap.").toString());
        }
        ((LinkedHashMap) this.f3831e).put(d10, f0Var instanceof n4.e ? ((n4.e) f0Var).i(obj) : x.c(f0Var.f(obj)));
    }

    public n4.r t(n4.r rVar, a1.n nVar, boolean z10, n4.s sVar) {
        n4.r rVar2;
        n4.u uVar = (n4.u) this.f3828b;
        ArrayList arrayList = new ArrayList();
        Iterator it = uVar.iterator();
        while (true) {
            q4.j jVar = (q4.j) it;
            if (!jVar.hasNext()) {
                break;
            }
            n4.s sVar2 = (n4.s) jVar.next();
            rVar2 = Intrinsics.a(sVar2, sVar) ? null : sVar2.e(nVar);
            if (rVar2 != null) {
                arrayList.add(rVar2);
            }
        }
        n4.r rVar3 = (n4.r) CollectionsKt.E(arrayList);
        n4.u uVar2 = uVar.f7116i;
        if (uVar2 != null && z10 && !uVar2.equals(sVar)) {
            rVar2 = uVar2.f(nVar, uVar);
        }
        return (n4.r) CollectionsKt.E(w.m(new n4.r[]{rVar, rVar3, rVar2}));
    }

    public o(n4.u uVar) {
        this.f3828b = uVar;
        this.f3829c = new s0(0);
    }

    public o(pe.a aVar, LinkedHashMap linkedHashMap) {
        this.f3828b = aVar;
        this.f3829c = linkedHashMap;
        this.f3830d = ue.a.f9716a;
        this.f3831e = new LinkedHashMap();
        this.f3827a = -1;
    }
}
