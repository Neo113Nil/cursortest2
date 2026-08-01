package com.bytedance.sdk.component.icD.pvs;

import java.util.ArrayList;
import java.util.List;

/* compiled from: FormBody.java */
/* loaded from: classes.dex */
public final class NB extends IP {
    List<String> icD;
    List<String> pvs;

    NB(List<String> list, List<String> list2) {
        this.pvs = list;
        this.icD = list2;
    }

    /* compiled from: FormBody.java */
    public static final class pvs {
        private final List<String> pvs = new ArrayList();
        private final List<String> icD = new ArrayList();

        public pvs pvs(String str, String str2) {
            this.pvs.add(str);
            this.icD.add(str2);
            return this;
        }

        public NB pvs() {
            return new NB(this.pvs, this.icD);
        }
    }
}
