package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class uz1 implements pe0 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ uz1(int i) {
        this.rtx2ld2ELZv4 = 28;
    }

    @Override // defpackage.pe0
    public final Object rtx2ld2ELZv4(Object obj, Object obj2) {
        x8 x8Var;
        Object PxuCJdSBwIXG;
        switch (this.rtx2ld2ELZv4) {
            case 0:
                t11 t11Var = (t11) obj2;
                return fx1.S9EYkSpbGuxq(t11Var.PxuCJdSBwIXG, zz1.PxuCJdSBwIXG(t11Var.lS5Rgt96tfkO, zz1.OPXfSBeufaJ8, (vy1) obj));
            case 1:
                long j = ((jj2) obj2).PxuCJdSBwIXG;
                jj2.Companion.getClass();
                if (jj2.PxuCJdSBwIXG(j, 8589934592L)) {
                    return 0;
                }
                if (jj2.PxuCJdSBwIXG(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 2:
                bf1 bf1Var = (bf1) obj2;
                bf1.Companion.getClass();
                return bf1Var != null ? bf1.lS5Rgt96tfkO(bf1Var.PxuCJdSBwIXG, 9205357640488583168L) : false ? Boolean.FALSE : fx1.S9EYkSpbGuxq(Float.valueOf(Float.intBitsToFloat((int) (bf1Var.PxuCJdSBwIXG >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bf1Var.PxuCJdSBwIXG & 4294967295L))));
            case 3:
                vy1 vy1Var = (vy1) obj;
                u8 u8Var = (u8) obj2;
                Object obj3 = u8Var.PxuCJdSBwIXG;
                if (obj3 instanceof bj1) {
                    x8Var = x8.rtx2ld2ELZv4;
                } else if (obj3 instanceof q82) {
                    x8Var = x8.OPXfSBeufaJ8;
                } else if (obj3 instanceof bq2) {
                    x8Var = x8.wdg6QnbFHrFF;
                } else if (obj3 instanceof cp2) {
                    x8Var = x8.dgRBjINgWbAK;
                } else if (obj3 instanceof u11) {
                    x8Var = x8.x50lh2ztY7Y5;
                } else if (obj3 instanceof t11) {
                    x8Var = x8.cpQdD2nAriOS;
                } else {
                    if (!(obj3 instanceof ea2)) {
                        throw new UnsupportedOperationException();
                    }
                    x8Var = x8.r3s1LDPKFs1S;
                }
                switch (x8Var.ordinal()) {
                    case 0:
                        obj3.getClass();
                        PxuCJdSBwIXG = zz1.PxuCJdSBwIXG((bj1) obj3, zz1.RAsUl2FVSrh6, vy1Var);
                        break;
                    case 1:
                        obj3.getClass();
                        PxuCJdSBwIXG = zz1.PxuCJdSBwIXG((q82) obj3, zz1.rtx2ld2ELZv4, vy1Var);
                        break;
                    case 2:
                        obj3.getClass();
                        PxuCJdSBwIXG = zz1.PxuCJdSBwIXG((bq2) obj3, zz1.TSizfFm2Yiuu, vy1Var);
                        break;
                    case 3:
                        obj3.getClass();
                        PxuCJdSBwIXG = zz1.PxuCJdSBwIXG((cp2) obj3, zz1.Y1f8riQaR6yg, vy1Var);
                        break;
                    case 4:
                        obj3.getClass();
                        PxuCJdSBwIXG = zz1.PxuCJdSBwIXG((u11) obj3, zz1.e9gEMXR7LXtO, vy1Var);
                        break;
                    case 5:
                        obj3.getClass();
                        PxuCJdSBwIXG = zz1.PxuCJdSBwIXG((t11) obj3, zz1.a92UlCVFR9N8, vy1Var);
                        break;
                    case 6:
                        obj3.getClass();
                        PxuCJdSBwIXG = ((ea2) obj3).PxuCJdSBwIXG;
                        break;
                    default:
                        u9.gPXPFXrUH4XX();
                        return null;
                }
                return fx1.S9EYkSpbGuxq(x8Var, PxuCJdSBwIXG, Integer.valueOf(u8Var.lS5Rgt96tfkO), Integer.valueOf(u8Var.TSizfFm2Yiuu), u8Var.Y1f8riQaR6yg);
            case 4:
                vy1 vy1Var2 = (vy1) obj;
                List list = ((p21) obj2).rtx2ld2ELZv4;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(zz1.PxuCJdSBwIXG((n21) list.get(i), zz1.IAToe7bXGz4N, vy1Var2));
                }
                return arrayList;
            case 5:
                return ((n21) obj2).PxuCJdSBwIXG.toLanguageTag();
            case 6:
                vy1 vy1Var3 = (vy1) obj;
                p11 p11Var = (p11) obj2;
                return fx1.S9EYkSpbGuxq(zz1.PxuCJdSBwIXG(new j11(p11Var.PxuCJdSBwIXG), zz1.jyegZNwi31qc, vy1Var3), zz1.PxuCJdSBwIXG(new o11(p11Var.lS5Rgt96tfkO), zz1.aF05bpZJlKEP, vy1Var3), zz1.PxuCJdSBwIXG(new m11(p11Var.TSizfFm2Yiuu), zz1.kpCQ9veP6n3I, vy1Var3));
            case 7:
                return Float.valueOf(((j11) obj2).PxuCJdSBwIXG);
            case 8:
                return Integer.valueOf(((o11) obj2).PxuCJdSBwIXG);
            case 9:
                return Integer.valueOf(((m11) obj2).PxuCJdSBwIXG);
            case 10:
                return ((bq2) obj2).PxuCJdSBwIXG;
            case 11:
                vy1 vy1Var4 = (vy1) obj;
                bj1 bj1Var = (bj1) obj2;
                Object PxuCJdSBwIXG2 = zz1.PxuCJdSBwIXG(new he2(bj1Var.PxuCJdSBwIXG), zz1.BRwzKIf41E4i, vy1Var4);
                Object PxuCJdSBwIXG3 = zz1.PxuCJdSBwIXG(new nf2(bj1Var.lS5Rgt96tfkO), zz1.XL4ISE6Oc65B, vy1Var4);
                Object PxuCJdSBwIXG4 = zz1.PxuCJdSBwIXG(new hj2(bj1Var.TSizfFm2Yiuu), zz1.VhhvGxCb8gfr, vy1Var4);
                zh2 zh2Var = bj1Var.Y1f8riQaR6yg;
                yh2 yh2Var = zh2.Companion;
                Object PxuCJdSBwIXG5 = zz1.PxuCJdSBwIXG(zh2Var, zz1.x50lh2ztY7Y5, vy1Var4);
                xm1 xm1Var = bj1Var.e9gEMXR7LXtO;
                wm1 wm1Var = xm1.Companion;
                Object PxuCJdSBwIXG6 = zz1.PxuCJdSBwIXG(xm1Var, f2.S9EYkSpbGuxq, vy1Var4);
                p11 p11Var2 = bj1Var.a92UlCVFR9N8;
                k11 k11Var = p11.Companion;
                Object PxuCJdSBwIXG7 = zz1.PxuCJdSBwIXG(p11Var2, zz1.e6tOsSdd2EFb, vy1Var4);
                Object PxuCJdSBwIXG8 = zz1.PxuCJdSBwIXG(new g11(bj1Var.RAsUl2FVSrh6), f2.S2OOm9zPNm0h, vy1Var4);
                Object PxuCJdSBwIXG9 = zz1.PxuCJdSBwIXG(new om0(bj1Var.rtx2ld2ELZv4), zz1.RfyTYNmI9Srp, vy1Var4);
                qi2 qi2Var = bj1Var.OPXfSBeufaJ8;
                ni2 ni2Var = qi2.Companion;
                return fx1.S9EYkSpbGuxq(PxuCJdSBwIXG2, PxuCJdSBwIXG3, PxuCJdSBwIXG4, PxuCJdSBwIXG5, PxuCJdSBwIXG6, PxuCJdSBwIXG7, PxuCJdSBwIXG8, PxuCJdSBwIXG9, zz1.PxuCJdSBwIXG(qi2Var, f2.ZbWwgt3aGe7A, vy1Var4));
            case 12:
                return ((cp2) obj2).PxuCJdSBwIXG;
            case 13:
                vy1 vy1Var5 = (vy1) obj;
                q82 q82Var = (q82) obj2;
                hl hlVar = new hl(q82Var.PxuCJdSBwIXG.lS5Rgt96tfkO());
                yz1 yz1Var = zz1.gPXPFXrUH4XX;
                Object PxuCJdSBwIXG10 = zz1.PxuCJdSBwIXG(hlVar, yz1Var, vy1Var5);
                hj2 hj2Var = new hj2(q82Var.lS5Rgt96tfkO);
                yz1 yz1Var2 = zz1.VhhvGxCb8gfr;
                Object PxuCJdSBwIXG11 = zz1.PxuCJdSBwIXG(hj2Var, yz1Var2, vy1Var5);
                xc0 xc0Var = q82Var.TSizfFm2Yiuu;
                wc0 wc0Var = xc0.Companion;
                Object PxuCJdSBwIXG12 = zz1.PxuCJdSBwIXG(xc0Var, zz1.cpQdD2nAriOS, vy1Var5);
                Object PxuCJdSBwIXG13 = zz1.PxuCJdSBwIXG(q82Var.Y1f8riQaR6yg, zz1.EcgxDIVH5in8, vy1Var5);
                Object PxuCJdSBwIXG14 = zz1.PxuCJdSBwIXG(q82Var.e9gEMXR7LXtO, zz1.S9EYkSpbGuxq, vy1Var5);
                String str = q82Var.RAsUl2FVSrh6;
                Object PxuCJdSBwIXG15 = zz1.PxuCJdSBwIXG(new hj2(q82Var.rtx2ld2ELZv4), yz1Var2, vy1Var5);
                Object PxuCJdSBwIXG16 = zz1.PxuCJdSBwIXG(q82Var.OPXfSBeufaJ8, zz1.r3s1LDPKFs1S, vy1Var5);
                Object PxuCJdSBwIXG17 = zz1.PxuCJdSBwIXG(q82Var.wdg6QnbFHrFF, zz1.dgRBjINgWbAK, vy1Var5);
                p21 p21Var = q82Var.dgRBjINgWbAK;
                o21 o21Var = p21.Companion;
                Object PxuCJdSBwIXG18 = zz1.PxuCJdSBwIXG(p21Var, zz1.pnx5pC0XzaCw, vy1Var5);
                Object PxuCJdSBwIXG19 = zz1.PxuCJdSBwIXG(new hl(q82Var.x50lh2ztY7Y5), yz1Var, vy1Var5);
                Object PxuCJdSBwIXG20 = zz1.PxuCJdSBwIXG(q82Var.cpQdD2nAriOS, zz1.wdg6QnbFHrFF, vy1Var5);
                w42 w42Var = q82Var.r3s1LDPKFs1S;
                v42 v42Var = w42.Companion;
                return fx1.S9EYkSpbGuxq(PxuCJdSBwIXG10, PxuCJdSBwIXG11, PxuCJdSBwIXG12, PxuCJdSBwIXG13, PxuCJdSBwIXG14, -1, str, PxuCJdSBwIXG15, PxuCJdSBwIXG16, PxuCJdSBwIXG17, PxuCJdSBwIXG18, PxuCJdSBwIXG19, PxuCJdSBwIXG20, zz1.PxuCJdSBwIXG(w42Var, zz1.QrzZRwfaDlRX, vy1Var5));
            case 14:
                vy1 vy1Var6 = (vy1) obj;
                mi2 mi2Var = (mi2) obj2;
                q82 q82Var2 = mi2Var.PxuCJdSBwIXG;
                cr1 cr1Var = zz1.rtx2ld2ELZv4;
                return fx1.S9EYkSpbGuxq(zz1.PxuCJdSBwIXG(q82Var2, cr1Var, vy1Var6), zz1.PxuCJdSBwIXG(mi2Var.lS5Rgt96tfkO, cr1Var, vy1Var6), zz1.PxuCJdSBwIXG(mi2Var.TSizfFm2Yiuu, cr1Var, vy1Var6), zz1.PxuCJdSBwIXG(mi2Var.Y1f8riQaR6yg, cr1Var, vy1Var6));
            case 15:
                xm1 xm1Var2 = (xm1) obj2;
                Boolean valueOf = Boolean.valueOf(xm1Var2.PxuCJdSBwIXG);
                cr1 cr1Var2 = zz1.PxuCJdSBwIXG;
                return fx1.S9EYkSpbGuxq(valueOf, zz1.PxuCJdSBwIXG(new i50(xm1Var2.lS5Rgt96tfkO), f2.VhhvGxCb8gfr, (vy1) obj));
            case 16:
                return Integer.valueOf(((i50) obj2).PxuCJdSBwIXG);
            case 17:
                return Integer.valueOf(((g11) obj2).PxuCJdSBwIXG);
            case 18:
                qi2 qi2Var2 = (qi2) obj2;
                return fx1.S9EYkSpbGuxq(zz1.PxuCJdSBwIXG(new pi2(qi2Var2.PxuCJdSBwIXG), f2.pnx5pC0XzaCw, (vy1) obj), Boolean.valueOf(qi2Var2.lS5Rgt96tfkO));
            case 19:
                return Integer.valueOf(((pi2) obj2).PxuCJdSBwIXG);
            case 20:
                return Integer.valueOf(((q02) obj2).PxuCJdSBwIXG.rtx2ld2ELZv4());
            case 21:
                eu0 eu0Var = (eu0) obj;
                List list2 = (List) obj2;
                eu0Var.getClass();
                list2.getClass();
                ArrayList Y1f8riQaR6yg = SerializersKt.Y1f8riQaR6yg(cs0.jJwa0q7P5wHq, list2, true);
                Y1f8riQaR6yg.getClass();
                return SerializersKt.PxuCJdSBwIXG(eu0Var, Y1f8riQaR6yg, new ri0(1, list2));
            case 22:
                eu0 eu0Var2 = (eu0) obj;
                List list3 = (List) obj2;
                eu0Var2.getClass();
                list3.getClass();
                ArrayList Y1f8riQaR6yg2 = SerializersKt.Y1f8riQaR6yg(cs0.jJwa0q7P5wHq, list3, true);
                Y1f8riQaR6yg2.getClass();
                KSerializer PxuCJdSBwIXG21 = SerializersKt.PxuCJdSBwIXG(eu0Var2, Y1f8riQaR6yg2, new ri0(2, list3));
                if (PxuCJdSBwIXG21 != null) {
                    return BuiltinSerializersKt.PxuCJdSBwIXG(PxuCJdSBwIXG21);
                }
                return null;
            case 23:
                return Integer.valueOf(((e51) obj).i68hK7ahKtgp(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((e51) obj).IXK6ba3ucyzm(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((e51) obj).ngxnMNrpiKat(((Integer) obj2).intValue()));
            case 26:
                return Integer.valueOf(((e51) obj).a92UlCVFR9N8(((Integer) obj2).intValue()));
            case 27:
                ug2 ug2Var = (ug2) obj2;
                return fx1.D0aTLcX6Uhyo(Float.valueOf(ug2Var.PxuCJdSBwIXG.rtx2ld2ELZv4()), Boolean.valueOf(((th1) ug2Var.a92UlCVFR9N8.getValue()) == th1.rtx2ld2ELZv4));
            case 28:
                ((Integer) obj2).getClass();
                kj2.PxuCJdSBwIXG(ki0.bEKsvqmvPh2y(7), (hp) obj);
                return no2.PxuCJdSBwIXG;
            default:
                fu fuVar = (fu) obj2;
                if (!(fuVar instanceof mj2)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num != null ? num.intValue() : 1;
                return intValue == 0 ? fuVar : Integer.valueOf(intValue + 1);
        }
    }

    public /* synthetic */ uz1(int i, byte b) {
        this.rtx2ld2ELZv4 = i;
    }
}
