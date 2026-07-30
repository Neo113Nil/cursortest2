package defpackage;

import android.app.Application;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Vibrator;
import com.appsflyer.internal.l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class z8 extends d7 {
    public final yw b;
    public final la c;
    public final rj0 d;
    public final be1 e;
    public final g11 f;
    public iw0 g;

    public z8(Application application) {
        application.getClass();
        Context applicationContext = application.getApplicationContext();
        applicationContext.getClass();
        this.b = new yw(applicationContext, 4);
        Context applicationContext2 = application.getApplicationContext();
        applicationContext2.getClass();
        this.c = new la(applicationContext2);
        Context applicationContext3 = application.getApplicationContext();
        applicationContext3.getClass();
        this.d = new rj0(applicationContext3);
        v8 v8Var = new v8(true, true, true);
        jo joVar = new jo();
        nv nvVar = nv.d;
        be1 c = m90.c(new w8(s8.a, mt0.a, v8Var, 0, 0, joVar, nvVar, nvVar, null, false, true));
        this.e = c;
        this.f = new g11(c);
        v8 v8Var2 = new v8(true, true, true);
        jo joVar2 = new jo();
        ov ovVar = ov.d;
        ovVar.getClass();
        this.g = new iw0(v8Var2, 0, 0, joVar2, nvVar, ovVar, rv.d);
        dn dnVar = null;
        uq1.N(mo.t(this), null, new y8(this, dnVar, 0), 3);
        uq1.N(mo.t(this), null, new y8(this, dnVar, 1), 3);
    }

    public static ArrayList e(iw0 iw0Var) {
        List<d2> list = c2.a;
        ArrayList arrayList = new ArrayList(ai.h(list));
        for (d2 d2Var : list) {
            Map map = iw0Var.f;
            e2 e2Var = d2Var.d;
            int i = d2Var.e;
            Integer num = (Integer) map.get(e2Var.name());
            boolean z = false;
            int intValue = num != null ? num.intValue() : 0;
            int min = Math.min(intValue, i);
            if (intValue >= i) {
                z = true;
            }
            arrayList.add(new b2(d2Var, min, z, iw0Var.g.contains(d2Var.a)));
        }
        return arrayList;
    }

    public static float h(e40 e40Var) {
        long j = e40Var.g;
        if (j > 0) {
            long j2 = e40Var.h;
            long j3 = j + j2;
            if (j3 > 0) {
                float b = b11.b(j2 / j3, 0.0f, 1.0f);
                float sin = (float) Math.sin(b * 3.141592653589793d);
                float f = e40Var.i;
                return b11.b(((1.0f - (f * 0.35f)) * sin) + ((1.0f - b) * f), 0.0f, 1.15f);
            }
        }
        return 0.0f;
    }

    public static float l(z50 z50Var) {
        int ordinal = z50Var.ordinal();
        if (ordinal == 0) {
            return 0.052f;
        }
        if (ordinal == 1) {
            return 0.062f;
        }
        if (ordinal == 2) {
            return 0.072f;
        }
        if (ordinal == 3) {
            return 0.045f;
        }
        if (ordinal == 4) {
            return 0.066f;
        }
        if (ordinal == 5) {
            return 0.052f;
        }
        l.a();
        return 0.0f;
    }

    public static Map m(Map map, int i) {
        if (i <= 0) {
            return map;
        }
        Integer num = (Integer) map.get("TOTAL_EARNED");
        Integer valueOf = Integer.valueOf((num != null ? num.intValue() : 0) + i);
        Pair pair = new Pair("TOTAL_EARNED", valueOf);
        if (map.isEmpty()) {
            return hk0.b(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("TOTAL_EARNED", valueOf);
        return linkedHashMap;
    }

    public static Map v(Map map, String str, int i) {
        Integer num = (Integer) map.get(str);
        if (i <= (num != null ? num.intValue() : 0)) {
            return map;
        }
        Integer valueOf = Integer.valueOf(i);
        Pair pair = new Pair(str, valueOf);
        if (map.isEmpty()) {
            return hk0.b(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(str, valueOf);
        return linkedHashMap;
    }

    @Override // defpackage.tn1
    public final void d() {
        la laVar = this.c;
        laVar.b();
        laVar.b.release();
        rj0 rj0Var = this.d;
        rj0Var.getClass();
        try {
            i31 i31Var = k31.d;
            Vibrator vibrator = (Vibrator) rj0Var.h;
            if (vibrator != null) {
                vibrator.cancel();
            }
        } catch (Throwable unused) {
            i31 i31Var2 = k31.d;
        }
    }

    public final void f() {
        be1 be1Var;
        Object value;
        this.d.a(28L);
        do {
            be1Var = this.e;
            value = be1Var.getValue();
        } while (!be1Var.h(value, w8.a((w8) value, null, mt0.a, null, 0, 0, null, null, null, null, false, 2045)));
        u();
    }

    public final void g() {
        Object value;
        be1 be1Var = this.e;
        e40 e40Var = ((w8) be1Var.getValue()).i;
        if (e40Var == null) {
            return;
        }
        do {
            value = be1Var.getValue();
        } while (!be1Var.h(value, w8.a((w8) value, null, mt0.a, null, 0, 0, null, null, null, e40.a(e40Var, f40.d, 0, 0, 0, nv.d, 0L, 0L, 0.0f, 1, 700L, 0L, 0.0f, 14365), false, 1789)));
        this.d.a(28L);
    }

    public final void i() {
        be1 be1Var;
        Object value;
        do {
            be1Var = this.e;
            value = be1Var.getValue();
        } while (!be1Var.h(value, w8.a((w8) value, r8.a, mt0.a, null, 0, 0, null, null, null, null, false, 1788)));
        u();
    }

    public final void j(gc1 gc1Var, long j) {
        Integer num;
        la laVar = this.c;
        laVar.getClass();
        if (laVar.d && laVar.e && laVar.g && (num = (Integer) laVar.c.get(gc1Var)) != null) {
            laVar.b.play(num.intValue(), 0.72f, 0.72f, 1, 0, 1.0f);
        }
        this.d.a(j);
    }

    public final void k(ia iaVar, int i, boolean z) {
        be1 be1Var;
        Object value;
        ja jaVar = iaVar.e;
        Map map = this.g.f;
        Integer num = (Integer) map.get("ATTEMPTS");
        int i2 = 0;
        int intValue = (num != null ? num.intValue() : 0) + 1;
        Integer num2 = (Integer) map.get("VICTORIES");
        int intValue2 = num2 != null ? num2.intValue() : 0;
        int i3 = iaVar.c;
        ja jaVar2 = ja.d;
        int i4 = intValue2 + (jaVar == jaVar2 ? 1 : 0);
        Integer num3 = (Integer) map.get("HARD_VICTORIES");
        int intValue3 = num3 != null ? num3.intValue() : 0;
        if (jaVar == jaVar2 && iaVar.b == ds.HARD) {
            i2 = 1;
        }
        Map m = m(v(v(v(v(map, "BEST_SECTIONS", i3), "ATTEMPTS", intValue), "VICTORIES", i4), "HARD_VICTORIES", intValue3 + i2), i);
        iw0 iw0Var = this.g;
        r(iw0.a(iw0Var, null, iw0Var.b + i, Math.max(iw0Var.c, i3), null, CollectionsKt.x(CollectionsKt.u(yh.b(iaVar), this.g.e), 20), m, null, 73));
        if (z) {
            return;
        }
        do {
            be1Var = this.e;
            value = be1Var.getValue();
        } while (!be1Var.h(value, w8.a((w8) value, null, mt0.a, null, 0, 0, null, null, null, null, false, 1789)));
    }

    public final void n(u8 u8Var) {
        this.d.a(28L);
        while (true) {
            be1 be1Var = this.e;
            Object value = be1Var.getValue();
            u8 u8Var2 = u8Var;
            if (be1Var.h(value, w8.a((w8) value, u8Var2, mt0.a, null, 0, 0, null, null, null, null, false, 2044))) {
                u();
                return;
            }
            u8Var = u8Var2;
        }
    }

    public final void o() {
        be1 be1Var;
        Object value;
        this.d.a(28L);
        do {
            be1Var = this.e;
            value = be1Var.getValue();
        } while (!be1Var.h(value, w8.a((w8) value, null, nt0.a, null, 0, 0, null, null, null, null, false, 2045)));
    }

    public final void p() {
        Object value;
        be1 be1Var = this.e;
        e40 e40Var = ((w8) be1Var.getValue()).i;
        if (e40Var != null) {
            k(new ia(System.currentTimeMillis(), e40Var.a, e40Var.c, 0, ja.e), 0, false);
        }
        do {
            value = be1Var.getValue();
        } while (!be1Var.h(value, w8.a((w8) value, r8.a, mt0.a, null, 0, 0, null, null, null, null, false, 1788)));
        u();
    }

    public final void q() {
        be1 be1Var;
        Object value;
        this.d.a(28L);
        do {
            be1Var = this.e;
            value = be1Var.getValue();
        } while (!be1Var.h(value, w8.a((w8) value, null, mt0.a, null, 0, 0, null, null, null, null, false, 2045)));
    }

    public final void r(iw0 iw0Var) {
        be1 be1Var;
        Object value;
        this.g = iw0Var;
        do {
            be1Var = this.e;
            value = be1Var.getValue();
        } while (!be1Var.h(value, w8.a((w8) value, null, null, iw0Var.a, iw0Var.b, iw0Var.c, iw0Var.d, iw0Var.e, e(iw0Var), null, false, 1795)));
        uq1.N(mo.t(this), null, new d(this, iw0Var, (dn) null, 2), 3);
    }

    public final void s(boolean z) {
        boolean z2;
        while (true) {
            be1 be1Var = this.e;
            Object value = be1Var.getValue();
            z2 = z;
            if (be1Var.h(value, w8.a((w8) value, null, null, null, 0, 0, null, null, null, null, z2, 1023))) {
                break;
            } else {
                z = z2;
            }
        }
        la laVar = this.c;
        laVar.e = z2;
        if (z2) {
            an0 an0Var = laVar.h;
            if (an0Var == an0.d) {
                an0Var = null;
            }
            if (an0Var != null) {
                laVar.a(an0Var);
            }
        } else {
            MediaPlayer mediaPlayer = laVar.i;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
        }
        rj0 rj0Var = this.d;
        rj0Var.e = z2;
        if (!z2) {
            try {
                i31 i31Var = k31.d;
                Vibrator vibrator = (Vibrator) rj0Var.h;
                if (vibrator != null) {
                    vibrator.cancel();
                }
            } catch (Throwable unused) {
                i31 i31Var2 = k31.d;
            }
        }
        if (z2) {
            u();
        }
    }

    public final void t(ds dsVar) {
        e40 e40Var = new e40(dsVar, f40.d, 0, 0, 0, nv.d, 0L, 0L, 0.0f, 1, 650L, 1L, 0.0f);
        iw0 iw0Var = this.g;
        r(iw0.a(iw0Var, null, 0, 0, null, null, v(iw0Var.f, "FIRST_RUN", 1), null, 95));
        while (true) {
            be1 be1Var = this.e;
            Object value = be1Var.getValue();
            e40 e40Var2 = e40Var;
            if (be1Var.h(value, w8.a((w8) value, p8.a, mt0.a, null, 0, 0, null, null, null, e40Var2, false, 1788))) {
                this.c.a(an0.g);
                return;
            }
            e40Var = e40Var2;
        }
    }

    public final void u() {
        w8 w8Var = (w8) this.e.getValue();
        if (w8Var.j && w8Var.k) {
            u8 u8Var = w8Var.a;
            boolean a = Intrinsics.a(u8Var, r8.a);
            la laVar = this.c;
            if (a || Intrinsics.a(u8Var, q8.a) || Intrinsics.a(u8Var, o8.a) || Intrinsics.a(u8Var, t8.a)) {
                laVar.a(an0.e);
                return;
            }
            if (Intrinsics.a(u8Var, p8.a)) {
                laVar.a(an0.g);
            } else {
                if (!Intrinsics.a(u8Var, s8.a)) {
                    l.a();
                    return;
                }
                laVar.getClass();
                laVar.h = an0.d;
                laVar.b();
            }
        }
    }
}
