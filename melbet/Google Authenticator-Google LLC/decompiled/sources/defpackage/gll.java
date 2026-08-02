package defpackage;

import android.os.Process;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class gll extends glk implements gje, gjd, glp {
    public static final /* synthetic */ int c = 0;
    private static final long d = SystemClock.elapsedRealtime();
    public gva a;
    public koe b;
    private Boolean e;

    @Override // defpackage.gjd
    public final long c() {
        return d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (r0.equals(":leakcanary") != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r0.equals(":train") != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r0.equals(":learning_bg") != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        if (r0.equals(":primes_lifeboat") != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0066, code lost:
    
        if (r0.startsWith(":privileged_process") != false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x0038. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean d() {
        String I;
        boolean isIsolated;
        boolean z;
        if (eos.n == null) {
            isIsolated = Process.isIsolated();
            if (!isIsolated) {
                String str = eos.m;
                if (str == null) {
                    String I2 = eos.I();
                    if (I2 == null) {
                        str = null;
                    } else {
                        int indexOf = I2.indexOf(58);
                        if (indexOf == -1) {
                            eos.m = "";
                        } else {
                            eos.m = I2.substring(indexOf);
                        }
                        str = eos.m;
                    }
                }
                if (str != null) {
                    switch (str.hashCode()) {
                        case -737791795:
                            break;
                        case -733923188:
                            break;
                        case 1771111950:
                            break;
                        case 1892872565:
                            break;
                    }
                    eos.n = Boolean.valueOf(z);
                }
                z = false;
                eos.n = Boolean.valueOf(z);
            }
            z = true;
            eos.n = Boolean.valueOf(z);
        }
        if (!eos.n.booleanValue()) {
            Boolean bool = this.e;
            if (bool == null) {
                hjb hjbVar = hjb.a;
                hjbVar.getClass();
                bool = Boolean.valueOf((hjbVar.isEmpty() || (I = eos.I()) == null) ? false : hjbVar.contains(I));
                this.e = bool;
            }
            if (!bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Application
    public void onCreate() {
        gty aC;
        if (!d()) {
            super.onCreate();
            return;
        }
        if (gta.u()) {
            ((ewr) this.b.b()).a();
            super.onCreate();
            return;
        }
        long bl = hnu.bl();
        long bk = hnu.bk(bl);
        gvz c2 = gvz.c();
        if (c2.e()) {
            gtt b = this.a.b(191, bk, 1000000 * bl);
            try {
                gta.p();
                aC = hoq.aC(192, "Application.onCreate");
                try {
                    ((ewr) this.b.b()).a();
                    super.onCreate();
                    aC.close();
                    b.close();
                } finally {
                }
            } finally {
            }
        } else {
            gut a = c2.a();
            try {
                aC = hoq.aC(189, "Application creation");
                try {
                    gty aC2 = hoq.aC(190, "Application.onCreate");
                    try {
                        ((ewr) this.b.b()).a();
                        super.onCreate();
                        aC2.close();
                        aC.close();
                        a.close();
                    } finally {
                    }
                } finally {
                    try {
                        aC.close();
                        throw th;
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } finally {
            }
        }
    }

    @Override // defpackage.gje
    public final long x() {
        long startElapsedRealtime;
        startElapsedRealtime = Process.getStartElapsedRealtime();
        return startElapsedRealtime;
    }
}
