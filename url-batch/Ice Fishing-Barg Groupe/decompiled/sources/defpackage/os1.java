package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class os1 {
    public static final ms1 Companion = new ms1();
    public final long PxuCJdSBwIXG;
    public final ns1 TSizfFm2Yiuu;
    public final ConcurrentLinkedQueue Y1f8riQaR6yg;
    public final zd2 lS5Rgt96tfkO;

    public os1(be2 be2Var) {
        be2Var.getClass();
        TimeUnit.MINUTES.getClass();
        this.PxuCJdSBwIXG = 300000000000L;
        this.lS5Rgt96tfkO = be2Var.Y1f8riQaR6yg();
        this.TSizfFm2Yiuu = new ns1(this, o0.gPXPFXrUH4XX(new StringBuilder(), mv2.lS5Rgt96tfkO, " ConnectionPool connection closer"));
        this.Y1f8riQaR6yg = new ConcurrentLinkedQueue();
    }

    public final int PxuCJdSBwIXG(ls1 ls1Var, long j) {
        TimeZone timeZone = mv2.PxuCJdSBwIXG;
        ArrayList arrayList = ls1Var.BRwzKIf41E4i;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + ls1Var.TSizfFm2Yiuu.PxuCJdSBwIXG.rtx2ld2ELZv4 + " was leaked. Did you forget to close a response body?";
                km1.Companion.getClass();
                km1.PxuCJdSBwIXG.wdg6QnbFHrFF(((gs1) reference).PxuCJdSBwIXG, str);
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    ls1Var.XL4ISE6Oc65B = j - this.PxuCJdSBwIXG;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
