package com.bytedance.sdk.component.yiw;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.sdk.component.icD.pvs.qh;
import com.bytedance.sdk.component.icD.pvs.so;
import com.bytedance.sdk.component.utils.cR;
import com.bytedance.sdk.component.yiw.Jd.vG;
import com.bytedance.sdk.component.yiw.icD.Jd;
import com.bytedance.sdk.component.yiw.vG.yiw;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: NetClient.java */
/* loaded from: classes.dex */
public class pvs {
    private yiw icD;
    private qh pvs;
    private int vG;

    private pvs(C0060pvs c0060pvs) {
        qh.pvs icD = new qh.pvs().pvs(c0060pvs.pvs, TimeUnit.MILLISECONDS).vG(c0060pvs.vG, TimeUnit.MILLISECONDS).icD(c0060pvs.icD, TimeUnit.MILLISECONDS);
        if (c0060pvs.Jd) {
            yiw yiwVar = new yiw();
            this.icD = yiwVar;
            icD.pvs(yiwVar);
        }
        if (c0060pvs.NB != null && c0060pvs.NB.size() > 0) {
            Iterator<so> it = c0060pvs.NB.iterator();
            while (it.hasNext()) {
                icD.pvs(it.next());
            }
        }
        if (c0060pvs.yiw != null) {
            Bundle unused = c0060pvs.yiw;
        }
        Set unused2 = c0060pvs.sUS;
        this.pvs = icD.pvs();
    }

    public void pvs(Context context, boolean z, com.bytedance.sdk.component.yiw.vG.icD icd) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        }
        if (icd == null) {
            throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
        }
        int pvs = icd.pvs();
        this.vG = pvs;
        yiw yiwVar = this.icD;
        if (yiwVar != null) {
            yiwVar.pvs(pvs);
        }
        com.bytedance.sdk.component.yiw.vG.so.pvs().pvs(this.vG).pvs(z);
        com.bytedance.sdk.component.yiw.vG.so.pvs().pvs(this.vG).pvs(icd);
        com.bytedance.sdk.component.yiw.vG.so.pvs().pvs(this.vG).pvs(context, cR.pvs(context));
    }

    public void pvs(Context context, boolean z) {
        com.bytedance.sdk.component.yiw.vG.pvs.icD(true);
        if (pvs(context) || (!cR.pvs(context) && z)) {
            com.bytedance.sdk.component.yiw.vG.so.pvs().pvs(this.vG, context).Jd();
            com.bytedance.sdk.component.yiw.vG.so.pvs().pvs(this.vG, context).pvs();
        }
        if (cR.pvs(context)) {
            com.bytedance.sdk.component.yiw.vG.so.pvs().pvs(this.vG, context).Jd();
            com.bytedance.sdk.component.yiw.vG.so.pvs().pvs(this.vG, context).pvs();
        }
    }

    public static void pvs() {
        vG.pvs(vG.pvs.DEBUG);
    }

    public Jd icD() {
        return new Jd(this.pvs);
    }

    public com.bytedance.sdk.component.yiw.icD.icD vG() {
        return new com.bytedance.sdk.component.yiw.icD.icD(this.pvs);
    }

    public com.bytedance.sdk.component.yiw.icD.pvs Jd() {
        return new com.bytedance.sdk.component.yiw.icD.pvs(this.pvs);
    }

    private static boolean pvs(Context context) {
        String icD = cR.icD(context);
        if (icD != null) {
            return icD.endsWith(":push") || icD.endsWith(":pushservice");
        }
        return false;
    }

    public qh NB() {
        return this.pvs;
    }

    /* compiled from: NetClient.java */
    /* renamed from: com.bytedance.sdk.component.yiw.pvs$pvs, reason: collision with other inner class name */
    public static final class C0060pvs {
        private Set<String> sUS;
        private Bundle yiw;
        boolean Jd = true;
        final List<so> NB = new ArrayList();
        int pvs = 10000;
        int icD = 10000;
        int vG = 10000;

        public C0060pvs pvs(long j, TimeUnit timeUnit) {
            this.pvs = pvs("timeout", j, timeUnit);
            return this;
        }

        public C0060pvs icD(long j, TimeUnit timeUnit) {
            this.icD = pvs("timeout", j, timeUnit);
            return this;
        }

        public C0060pvs vG(long j, TimeUnit timeUnit) {
            this.vG = pvs("timeout", j, timeUnit);
            return this;
        }

        public C0060pvs pvs(boolean z) {
            this.Jd = z;
            return this;
        }

        private static int pvs(String str, long j, TimeUnit timeUnit) {
            if (j < 0) {
                throw new IllegalArgumentException(str + " < 0");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException(str + " too large.");
            }
            if (millis != 0 || j <= 0) {
                return (int) millis;
            }
            throw new IllegalArgumentException(str + " too small.");
        }

        public pvs pvs() {
            return new pvs(this);
        }
    }
}
