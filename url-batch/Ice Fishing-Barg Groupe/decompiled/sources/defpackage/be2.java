package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class be2 {
    public static final ae2 Companion = new ae2();
    public static final Logger dgRBjINgWbAK;
    public static final be2 x50lh2ztY7Y5;
    public final ArrayList OPXfSBeufaJ8;
    public final b42 PxuCJdSBwIXG;
    public int RAsUl2FVSrh6;
    public int TSizfFm2Yiuu;
    public boolean Y1f8riQaR6yg;
    public int a92UlCVFR9N8;
    public long e9gEMXR7LXtO;
    public final Logger lS5Rgt96tfkO;
    public final ArrayList rtx2ld2ELZv4;
    public final o1 wdg6QnbFHrFF;

    static {
        Logger logger = Logger.getLogger(be2.class.getName());
        logger.getClass();
        dgRBjINgWbAK = logger;
        x50lh2ztY7Y5 = new be2(new b42(new lv2(o0.gPXPFXrUH4XX(new StringBuilder(), mv2.lS5Rgt96tfkO, " TaskRunner"), true)));
    }

    public be2(b42 b42Var) {
        Logger logger = dgRBjINgWbAK;
        logger.getClass();
        this.PxuCJdSBwIXG = b42Var;
        this.lS5Rgt96tfkO = logger;
        this.TSizfFm2Yiuu = 10000;
        this.rtx2ld2ELZv4 = new ArrayList();
        this.OPXfSBeufaJ8 = new ArrayList();
        this.wdg6QnbFHrFF = new o1(3, this);
    }

    public static final void PxuCJdSBwIXG(be2 be2Var, td2 td2Var, long j, boolean z) {
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        zd2 zd2Var = td2Var.TSizfFm2Yiuu;
        zd2Var.getClass();
        if (zd2Var.Y1f8riQaR6yg != td2Var) {
            u9.rtx2ld2ELZv4("Check failed.");
            return;
        }
        boolean z2 = zd2Var.a92UlCVFR9N8;
        zd2Var.a92UlCVFR9N8 = false;
        zd2Var.Y1f8riQaR6yg = null;
        be2Var.rtx2ld2ELZv4.remove(zd2Var);
        if (j != -1 && !z2 && !zd2Var.TSizfFm2Yiuu) {
            zd2Var.Y1f8riQaR6yg(td2Var, j, true);
        }
        if (zd2Var.e9gEMXR7LXtO.isEmpty()) {
            return;
        }
        be2Var.OPXfSBeufaJ8.add(zd2Var);
        if (z) {
            return;
        }
        be2Var.e9gEMXR7LXtO();
    }

    public final void TSizfFm2Yiuu(zd2 zd2Var) {
        zd2Var.getClass();
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        if (zd2Var.Y1f8riQaR6yg == null) {
            boolean isEmpty = zd2Var.e9gEMXR7LXtO.isEmpty();
            ArrayList arrayList = this.OPXfSBeufaJ8;
            if (isEmpty) {
                arrayList.remove(zd2Var);
            } else {
                byte[] bArr = kv2.PxuCJdSBwIXG;
                arrayList.getClass();
                if (!arrayList.contains(zd2Var)) {
                    arrayList.add(zd2Var);
                }
            }
        }
        if (this.Y1f8riQaR6yg) {
            notify();
        } else {
            e9gEMXR7LXtO();
        }
    }

    public final zd2 Y1f8riQaR6yg() {
        int i;
        synchronized (this) {
            i = this.TSizfFm2Yiuu;
            this.TSizfFm2Yiuu = i + 1;
        }
        return new zd2(this, o0.wdg6QnbFHrFF("Q", i));
    }

    public final void e9gEMXR7LXtO() {
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        int i = this.a92UlCVFR9N8;
        if (i > this.RAsUl2FVSrh6) {
            return;
        }
        this.a92UlCVFR9N8 = i + 1;
        o1 o1Var = this.wdg6QnbFHrFF;
        o1Var.getClass();
        ((ThreadPoolExecutor) this.PxuCJdSBwIXG.OPXfSBeufaJ8).execute(o1Var);
    }

    public final td2 lS5Rgt96tfkO() {
        long j;
        td2 td2Var;
        boolean z;
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        while (true) {
            ArrayList arrayList = this.OPXfSBeufaJ8;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i = 0;
            td2 td2Var2 = null;
            while (true) {
                if (i >= size) {
                    j = nanoTime;
                    td2Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                td2 td2Var3 = (td2) ((zd2) obj).e9gEMXR7LXtO.get(0);
                j = nanoTime;
                td2Var = null;
                long max = Math.max(0L, td2Var3.Y1f8riQaR6yg - j);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (td2Var2 != null) {
                        z = true;
                        break;
                    }
                    td2Var2 = td2Var3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.rtx2ld2ELZv4;
            if (td2Var2 != null) {
                TimeZone timeZone2 = mv2.PxuCJdSBwIXG;
                td2Var2.Y1f8riQaR6yg = -1L;
                zd2 zd2Var = td2Var2.TSizfFm2Yiuu;
                zd2Var.getClass();
                zd2Var.e9gEMXR7LXtO.remove(td2Var2);
                arrayList.remove(zd2Var);
                zd2Var.Y1f8riQaR6yg = td2Var2;
                arrayList2.add(zd2Var);
                if (z || (!this.Y1f8riQaR6yg && !arrayList.isEmpty())) {
                    e9gEMXR7LXtO();
                }
                return td2Var2;
            }
            if (this.Y1f8riQaR6yg) {
                if (j2 >= this.e9gEMXR7LXtO - j) {
                    return td2Var;
                }
                notify();
                return td2Var;
            }
            this.Y1f8riQaR6yg = true;
            this.e9gEMXR7LXtO = j + j2;
            try {
                try {
                    TimeZone timeZone3 = mv2.PxuCJdSBwIXG;
                    if (j2 > 0) {
                        long j3 = j2 / 1000000;
                        long j4 = j2 - (1000000 * j3);
                        if (j3 > 0 || j2 > 0) {
                            wait(j3, (int) j4);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = mv2.PxuCJdSBwIXG;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((zd2) arrayList2.get(size2)).PxuCJdSBwIXG();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        zd2 zd2Var2 = (zd2) arrayList.get(size3);
                        zd2Var2.PxuCJdSBwIXG();
                        if (zd2Var2.e9gEMXR7LXtO.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.Y1f8riQaR6yg = false;
            }
        }
    }
}
