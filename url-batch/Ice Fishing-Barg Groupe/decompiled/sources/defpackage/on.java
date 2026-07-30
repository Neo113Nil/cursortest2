package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class on implements pe0, qe0, re0, se0, te0, ue0, ve0, we0, be0, ce0, ee0, fe0, ge0, he0, ie0, je0, ke0, me0, ne0 {
    public final boolean OPXfSBeufaJ8;
    public zs1 dgRBjINgWbAK;
    public final int rtx2ld2ELZv4;
    public xe0 wdg6QnbFHrFF;
    public ArrayList x50lh2ztY7Y5;

    public on(int i, boolean z, xe0 xe0Var) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = z;
        this.wdg6QnbFHrFF = xe0Var;
    }

    public final Object RAsUl2FVSrh6(Object obj, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(this.rtx2ld2ELZv4);
        cpQdD2nAriOS(tf0Var);
        int x50lh2ztY7Y5 = tf0Var.a92UlCVFR9N8(this) ? bs0.x50lh2ztY7Y5(2, 1) : bs0.x50lh2ztY7Y5(1, 1);
        xe0 xe0Var = this.wdg6QnbFHrFF;
        mm2.S9EYkSpbGuxq(3, xe0Var);
        Object a92UlCVFR9N8 = ((qe0) xe0Var).a92UlCVFR9N8(obj, tf0Var, Integer.valueOf(x50lh2ztY7Y5 | i));
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new ln(i, 0, this, obj);
        }
        return a92UlCVFR9N8;
    }

    public final Object TSizfFm2Yiuu(int i, hp hpVar) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(this.rtx2ld2ELZv4);
        cpQdD2nAriOS(tf0Var);
        int x50lh2ztY7Y5 = i | (tf0Var.a92UlCVFR9N8(this) ? bs0.x50lh2ztY7Y5(2, 0) : bs0.x50lh2ztY7Y5(1, 0));
        xe0 xe0Var = this.wdg6QnbFHrFF;
        mm2.S9EYkSpbGuxq(2, xe0Var);
        Object rtx2ld2ELZv4 = ((pe0) xe0Var).rtx2ld2ELZv4(tf0Var, Integer.valueOf(x50lh2ztY7Y5));
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new nn(2, this, on.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return rtx2ld2ELZv4;
    }

    @Override // defpackage.ve0
    public final /* bridge */ /* synthetic */ Object Y1f8riQaR6yg(Object obj, Object obj2, Boolean bool, Object obj3, Object obj4, Object obj5, tf0 tf0Var, Integer num) {
        return dgRBjINgWbAK(obj, obj2, bool, obj3, obj4, obj5, tf0Var, num.intValue());
    }

    @Override // defpackage.qe0
    public final /* bridge */ /* synthetic */ Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        return RAsUl2FVSrh6(obj, (hp) obj2, ((Number) obj3).intValue());
    }

    public final void cpQdD2nAriOS(hp hpVar) {
        zs1 ZbWwgt3aGe7A;
        if (!this.OPXfSBeufaJ8 || (ZbWwgt3aGe7A = ((tf0) hpVar).ZbWwgt3aGe7A()) == null) {
            return;
        }
        ZbWwgt3aGe7A.lS5Rgt96tfkO |= 1;
        zs1 zs1Var = this.dgRBjINgWbAK;
        if (zs1Var == null || !zs1Var.PxuCJdSBwIXG() || zs1Var == ZbWwgt3aGe7A || cs0.wdg6QnbFHrFF(zs1Var.TSizfFm2Yiuu, ZbWwgt3aGe7A.TSizfFm2Yiuu)) {
            this.dgRBjINgWbAK = ZbWwgt3aGe7A;
            return;
        }
        ArrayList arrayList = this.x50lh2ztY7Y5;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.x50lh2ztY7Y5 = arrayList2;
            arrayList2.add(ZbWwgt3aGe7A);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zs1 zs1Var2 = (zs1) arrayList.get(i);
            if (zs1Var2 == null || !zs1Var2.PxuCJdSBwIXG() || zs1Var2 == ZbWwgt3aGe7A || cs0.wdg6QnbFHrFF(zs1Var2.TSizfFm2Yiuu, ZbWwgt3aGe7A.TSizfFm2Yiuu)) {
                arrayList.set(i, ZbWwgt3aGe7A);
                return;
            }
        }
        arrayList.add(ZbWwgt3aGe7A);
    }

    public final Object dgRBjINgWbAK(final Object obj, final Object obj2, final Boolean bool, final Object obj3, final Object obj4, final Object obj5, hp hpVar, final int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(this.rtx2ld2ELZv4);
        cpQdD2nAriOS(tf0Var);
        int x50lh2ztY7Y5 = tf0Var.a92UlCVFR9N8(this) ? bs0.x50lh2ztY7Y5(2, 6) : bs0.x50lh2ztY7Y5(1, 6);
        xe0 xe0Var = this.wdg6QnbFHrFF;
        mm2.S9EYkSpbGuxq(8, xe0Var);
        Object Y1f8riQaR6yg = ((ve0) xe0Var).Y1f8riQaR6yg(obj, obj2, bool, obj3, obj4, obj5, tf0Var, Integer.valueOf(i | x50lh2ztY7Y5));
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new pe0() { // from class: mn
                @Override // defpackage.pe0
                public final Object rtx2ld2ELZv4(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    on.this.dgRBjINgWbAK(obj, obj2, bool, obj3, obj4, obj5, (hp) obj6, ki0.bEKsvqmvPh2y(i) | 1);
                    return no2.PxuCJdSBwIXG;
                }
            };
        }
        return Y1f8riQaR6yg;
    }

    public final Object e9gEMXR7LXtO(zc zcVar, Object obj, Object obj2, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(this.rtx2ld2ELZv4);
        cpQdD2nAriOS(tf0Var);
        int x50lh2ztY7Y5 = tf0Var.a92UlCVFR9N8(this) ? bs0.x50lh2ztY7Y5(2, 3) : bs0.x50lh2ztY7Y5(1, 3);
        xe0 xe0Var = this.wdg6QnbFHrFF;
        mm2.S9EYkSpbGuxq(5, xe0Var);
        Object x50lh2ztY7Y52 = ((se0) xe0Var).x50lh2ztY7Y5(zcVar, obj, obj2, tf0Var, Integer.valueOf(x50lh2ztY7Y5 | i));
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new kn(this, zcVar, obj, obj2, i, 0);
        }
        return x50lh2ztY7Y52;
    }

    @Override // defpackage.re0
    public final /* bridge */ /* synthetic */ Object r3s1LDPKFs1S(Object obj, Object obj2, Object obj3, Object obj4) {
        return wdg6QnbFHrFF(obj, obj2, (hp) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.pe0
    public final /* bridge */ /* synthetic */ Object rtx2ld2ELZv4(Object obj, Object obj2) {
        return TSizfFm2Yiuu(((Number) obj2).intValue(), (hp) obj);
    }

    public final Object wdg6QnbFHrFF(Object obj, Object obj2, hp hpVar, int i) {
        tf0 tf0Var = (tf0) hpVar;
        tf0Var.JHNfcAUfKc4G(this.rtx2ld2ELZv4);
        cpQdD2nAriOS(tf0Var);
        int x50lh2ztY7Y5 = tf0Var.a92UlCVFR9N8(this) ? bs0.x50lh2ztY7Y5(2, 2) : bs0.x50lh2ztY7Y5(1, 2);
        xe0 xe0Var = this.wdg6QnbFHrFF;
        mm2.S9EYkSpbGuxq(4, xe0Var);
        Object r3s1LDPKFs1S = ((re0) xe0Var).r3s1LDPKFs1S(obj, obj2, tf0Var, Integer.valueOf(x50lh2ztY7Y5 | i));
        zs1 XL4ISE6Oc65B = tf0Var.XL4ISE6Oc65B();
        if (XL4ISE6Oc65B != null) {
            XL4ISE6Oc65B.Y1f8riQaR6yg = new q5(this, obj, obj2, i);
        }
        return r3s1LDPKFs1S;
    }

    @Override // defpackage.se0
    public final /* bridge */ /* synthetic */ Object x50lh2ztY7Y5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e9gEMXR7LXtO((zc) obj, obj2, obj3, (hp) obj4, ((Number) obj5).intValue());
    }
}
