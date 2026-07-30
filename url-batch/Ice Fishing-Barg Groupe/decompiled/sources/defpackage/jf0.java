package defpackage;

import com.ice.fishing.grenza.R;
import com.ice.fishing.grenza.presentation.navigation.GameRoute;
import com.ice.fishing.grenza.presentation.navigation.MenuRoute;
import com.ice.fishing.grenza.presentation.navigation.RatedRoute;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class jf0 implements qe0 {
    public final /* synthetic */ lb1 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ jf0(lb1 lb1Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = lb1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (r2 == r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r2 == r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0244, code lost:
    
        if (r2 == r5) goto L69;
     */
    @Override // defpackage.qe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a92UlCVFR9N8(Object obj, Object obj2, Object obj3) {
        long j;
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        jx1 jx1Var = fp.lS5Rgt96tfkO;
        lb1 lb1Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                hp hpVar = (hp) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((qx0) obj).getClass();
                tf0 tf0Var = (tf0) hpVar;
                if (tf0Var.Pf0ThKz3j5YS(intValue & 1, (intValue & 17) != 16)) {
                    gg1 gg1Var = mp.PxuCJdSBwIXG;
                    String BjEWd04qc7Mw = jh0.BjEWd04qc7Mw(R.string.tic_tac_toe, tf0Var);
                    boolean rtx2ld2ELZv4 = tf0Var.rtx2ld2ELZv4(lb1Var);
                    Object nLZGh9p8gVSu = tf0Var.nLZGh9p8gVSu();
                    if (!rtx2ld2ELZv4) {
                        hp.Companion.getClass();
                        break;
                    }
                    nLZGh9p8gVSu = new dz(lb1Var, 1);
                    tf0Var.JTxCbbCwomzt(nLZGh9p8gVSu);
                    ki0.RAsUl2FVSrh6(BjEWd04qc7Mw, (ae0) nLZGh9p8gVSu, null, tf0Var, 0, 4);
                } else {
                    tf0Var.i68hK7ahKtgp();
                }
                return no2Var;
            case 1:
                hp hpVar2 = (hp) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((qx0) obj).getClass();
                tf0 tf0Var2 = (tf0) hpVar2;
                if (tf0Var2.Pf0ThKz3j5YS(intValue2 & 1, (intValue2 & 17) != 16)) {
                    gg1 gg1Var2 = mp.PxuCJdSBwIXG;
                    n61 lS5Rgt96tfkO = c62.lS5Rgt96tfkO(n61.Companion, 1.0f);
                    y9 y9Var = new y9(10.0f, new u9(0));
                    s.Companion.getClass();
                    dm PxuCJdSBwIXG = bm.PxuCJdSBwIXG(y9Var, r.cpQdD2nAriOS, tf0Var2, 6);
                    int hashCode = Long.hashCode(tf0Var2.wLFCmsViZrNT);
                    il1 x50lh2ztY7Y5 = tf0Var2.x50lh2ztY7Y5();
                    n61 xfACYKDMU6Dj = ov2.xfACYKDMU6Dj(tf0Var2, lS5Rgt96tfkO);
                    yo.Companion.getClass();
                    dq dqVar = xo.lS5Rgt96tfkO;
                    tf0Var2.ngxnMNrpiKat();
                    if (tf0Var2.zf8DYfih6EZu) {
                        tf0Var2.dgRBjINgWbAK(dqVar);
                    } else {
                        tf0Var2.hVNtCUZb4tYH();
                    }
                    th0.tmVwIGCQF4zR(tf0Var2, xo.a92UlCVFR9N8, PxuCJdSBwIXG);
                    th0.tmVwIGCQF4zR(tf0Var2, xo.e9gEMXR7LXtO, x50lh2ztY7Y5);
                    th0.tmVwIGCQF4zR(tf0Var2, xo.RAsUl2FVSrh6, Integer.valueOf(hashCode));
                    th0.kpCQ9veP6n3I(tf0Var2, xo.rtx2ld2ELZv4);
                    th0.tmVwIGCQF4zR(tf0Var2, xo.Y1f8riQaR6yg, xfACYKDMU6Dj);
                    tf0Var2.IXK6ba3ucyzm(962519743);
                    int i2 = 0;
                    for (Object obj4 : fx1.D0aTLcX6Uhyo(new hm2(MenuRoute.INSTANCE, Integer.valueOf(R.string.tab_table), "▤"), new hm2(RatedRoute.INSTANCE, Integer.valueOf(R.string.tab_scored), "★"), new hm2(GameRoute.INSTANCE, Integer.valueOf(R.string.tab_fun), "⊞"))) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            fx1.mFd1aGiJX24N();
                            throw null;
                        }
                        hm2 hm2Var = (hm2) obj4;
                        Object obj5 = hm2Var.rtx2ld2ELZv4;
                        int intValue3 = ((Number) hm2Var.OPXfSBeufaJ8).intValue();
                        String str = (String) hm2Var.wdg6QnbFHrFF;
                        String BjEWd04qc7Mw2 = jh0.BjEWd04qc7Mw(intValue3, tf0Var2);
                        if (i2 == 1) {
                            tf0Var2.IXK6ba3ucyzm(762081340);
                            gg1 gg1Var3 = mp.PxuCJdSBwIXG;
                            j = ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).wdg6QnbFHrFF;
                            tf0Var2.gPXPFXrUH4XX(false);
                        } else {
                            tf0Var2.IXK6ba3ucyzm(762176603);
                            gg1 gg1Var4 = mp.PxuCJdSBwIXG;
                            j = ((pl) tf0Var2.wdg6QnbFHrFF(rl.PxuCJdSBwIXG)).a92UlCVFR9N8;
                            tf0Var2.gPXPFXrUH4XX(false);
                        }
                        boolean rtx2ld2ELZv42 = tf0Var2.rtx2ld2ELZv4(lb1Var) | tf0Var2.rtx2ld2ELZv4(obj5);
                        Object nLZGh9p8gVSu2 = tf0Var2.nLZGh9p8gVSu();
                        if (!rtx2ld2ELZv42) {
                            hp.Companion.getClass();
                            if (nLZGh9p8gVSu2 != jx1Var) {
                                bs0.e9gEMXR7LXtO(str, BjEWd04qc7Mw2, j, (ae0) nLZGh9p8gVSu2, tf0Var2, 0);
                                i2 = i3;
                            }
                        }
                        nLZGh9p8gVSu2 = new e6(14, lb1Var, obj5);
                        tf0Var2.JTxCbbCwomzt(nLZGh9p8gVSu2);
                        bs0.e9gEMXR7LXtO(str, BjEWd04qc7Mw2, j, (ae0) nLZGh9p8gVSu2, tf0Var2, 0);
                        i2 = i3;
                    }
                    tf0Var2.gPXPFXrUH4XX(false);
                    tf0Var2.gPXPFXrUH4XX(true);
                    gg1 gg1Var5 = mp.PxuCJdSBwIXG;
                } else {
                    tf0Var2.i68hK7ahKtgp();
                }
                return no2Var;
            case 2:
                hp hpVar3 = (hp) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((qx0) obj).getClass();
                tf0 tf0Var3 = (tf0) hpVar3;
                if (tf0Var3.Pf0ThKz3j5YS(intValue4 & 1, (intValue4 & 17) != 16)) {
                    gg1 gg1Var6 = mp.PxuCJdSBwIXG;
                    String BjEWd04qc7Mw3 = jh0.BjEWd04qc7Mw(R.string.tab_table, tf0Var3);
                    boolean rtx2ld2ELZv43 = tf0Var3.rtx2ld2ELZv4(lb1Var);
                    Object nLZGh9p8gVSu3 = tf0Var3.nLZGh9p8gVSu();
                    if (!rtx2ld2ELZv43) {
                        hp.Companion.getClass();
                        break;
                    }
                    nLZGh9p8gVSu3 = new dz(lb1Var, 2);
                    tf0Var3.JTxCbbCwomzt(nLZGh9p8gVSu3);
                    ki0.RAsUl2FVSrh6(BjEWd04qc7Mw3, (ae0) nLZGh9p8gVSu3, null, tf0Var3, 0, 4);
                } else {
                    tf0Var3.i68hK7ahKtgp();
                }
                return no2Var;
            default:
                hp hpVar4 = (hp) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((qx0) obj).getClass();
                tf0 tf0Var4 = (tf0) hpVar4;
                if (tf0Var4.Pf0ThKz3j5YS(intValue5 & 1, (intValue5 & 17) != 16)) {
                    gg1 gg1Var7 = mp.PxuCJdSBwIXG;
                    String BjEWd04qc7Mw4 = jh0.BjEWd04qc7Mw(R.string.tab_scored, tf0Var4);
                    boolean rtx2ld2ELZv44 = tf0Var4.rtx2ld2ELZv4(lb1Var);
                    Object nLZGh9p8gVSu4 = tf0Var4.nLZGh9p8gVSu();
                    if (!rtx2ld2ELZv44) {
                        hp.Companion.getClass();
                        break;
                    }
                    nLZGh9p8gVSu4 = new dz(lb1Var, 4);
                    tf0Var4.JTxCbbCwomzt(nLZGh9p8gVSu4);
                    ki0.RAsUl2FVSrh6(BjEWd04qc7Mw4, (ae0) nLZGh9p8gVSu4, null, tf0Var4, 0, 4);
                } else {
                    tf0Var4.i68hK7ahKtgp();
                }
                return no2Var;
        }
    }
}
