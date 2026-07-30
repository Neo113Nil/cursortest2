package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class ex1 {
    public static final cx1 Companion = new cx1();
    public at PxuCJdSBwIXG;
    public Executor TSizfFm2Yiuu;
    public rk2 Y1f8riQaR6yg;
    public ns0 a92UlCVFR9N8;
    public bx1 e9gEMXR7LXtO;
    public hu lS5Rgt96tfkO;
    public final op0 RAsUl2FVSrh6 = new op0(new g1(0, this, ex1.class, "onClosed", "onClosed()V", 0, 0, 4));
    public final ThreadLocal rtx2ld2ELZv4 = new ThreadLocal();
    public final LinkedHashMap OPXfSBeufaJ8 = new LinkedHashMap();
    public boolean wdg6QnbFHrFF = true;

    public final boolean OPXfSBeufaJ8() {
        bx1 bx1Var = this.e9gEMXR7LXtO;
        if (bx1Var == null) {
            cs0.tmVwIGCQF4zR("connectionManager");
            throw null;
        }
        pd0 pd0Var = bx1Var.rtx2ld2ELZv4;
        if (pd0Var != null) {
            return pd0Var.isOpen();
        }
        return false;
    }

    public List PxuCJdSBwIXG(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(w41.i68hK7ahKtgp(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(kj0.e6tOsSdd2EFb((eu0) entry.getKey()), entry.getValue());
        }
        return p50.rtx2ld2ELZv4;
    }

    public final boolean RAsUl2FVSrh6() {
        bx1 bx1Var = this.e9gEMXR7LXtO;
        if (bx1Var != null) {
            return bx1Var.RAsUl2FVSrh6 != null;
        }
        cs0.tmVwIGCQF4zR("connectionManager");
        throw null;
    }

    public v40 TSizfFm2Yiuu() {
        throw new ce1(0);
    }

    public final ns0 Y1f8riQaR6yg() {
        ns0 ns0Var = this.a92UlCVFR9N8;
        if (ns0Var != null) {
            return ns0Var;
        }
        cs0.tmVwIGCQF4zR("internalTracker");
        throw null;
    }

    public LinkedHashMap a92UlCVFR9N8() {
        int i68hK7ahKtgp = w41.i68hK7ahKtgp(al.KZw9XyiywG4x(t50.rtx2ld2ELZv4, 10));
        if (i68hK7ahKtgp < 16) {
            i68hK7ahKtgp = 16;
        }
        return new LinkedHashMap(i68hK7ahKtgp);
    }

    public Set e9gEMXR7LXtO() {
        return zk.l(new ArrayList(al.KZw9XyiywG4x(t50.rtx2ld2ELZv4, 10)));
    }

    public abstract ns0 lS5Rgt96tfkO();

    public final boolean rtx2ld2ELZv4() {
        if (OPXfSBeufaJ8()) {
            bx1 bx1Var = this.e9gEMXR7LXtO;
            if (bx1Var == null) {
                cs0.tmVwIGCQF4zR("connectionManager");
                throw null;
            }
            tb2 tb2Var = bx1Var.RAsUl2FVSrh6;
            if (tb2Var == null) {
                u9.rtx2ld2ELZv4("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
                return false;
            }
            if (tb2Var.EpkonXwzFgDB().S9EYkSpbGuxq()) {
                return true;
            }
        }
        return false;
    }

    public final Object wdg6QnbFHrFF(boolean z, pe0 pe0Var, ct ctVar) {
        bx1 bx1Var = this.e9gEMXR7LXtO;
        if (bx1Var != null) {
            return bx1Var.a92UlCVFR9N8.EcgxDIVH5in8(z, pe0Var, ctVar);
        }
        cs0.tmVwIGCQF4zR("connectionManager");
        throw null;
    }
}
