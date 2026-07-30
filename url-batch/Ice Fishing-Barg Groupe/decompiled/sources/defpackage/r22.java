package defpackage;

import android.view.MotionEvent;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class r22 {
    public static final rc1 PxuCJdSBwIXG;

    static {
        j22.Companion.getClass();
        PxuCJdSBwIXG = i22.TSizfFm2Yiuu;
    }

    public static final boolean PxuCJdSBwIXG(qn1 qn1Var) {
        MotionEvent PxuCJdSBwIXG2;
        List list = qn1Var.PxuCJdSBwIXG;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            int i2 = ((ao1) list.get(i)).OPXfSBeufaJ8;
            ho1.Companion.getClass();
            if (i2 == 2) {
                i++;
            } else {
                MotionEvent PxuCJdSBwIXG3 = qn1Var.PxuCJdSBwIXG();
                if ((PxuCJdSBwIXG3 == null || !PxuCJdSBwIXG3.isFromSource(8194)) && ((PxuCJdSBwIXG2 = qn1Var.PxuCJdSBwIXG()) == null || !PxuCJdSBwIXG2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
