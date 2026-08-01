package com.bytedance.sdk.component.widget.pvs;

/* compiled from: BaseAdapterInstance.java */
/* loaded from: classes.dex */
public class pvs {
    private static volatile pvs icD;
    private volatile icD pvs;

    private pvs() {
    }

    public static pvs pvs() {
        if (icD == null) {
            synchronized (pvs.class) {
                if (icD == null) {
                    icD = new pvs();
                }
            }
        }
        return icD;
    }

    public void pvs(icD icd) {
        this.pvs = icd;
    }

    public icD icD() {
        return this.pvs;
    }
}
