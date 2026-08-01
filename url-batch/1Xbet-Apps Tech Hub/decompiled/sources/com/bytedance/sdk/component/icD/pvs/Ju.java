package com.bytedance.sdk.component.icD.pvs;

import androidx.browser.trusted.sharing.ShareTarget;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: Request.java */
/* loaded from: classes.dex */
public abstract class Ju {
    public com.bytedance.sdk.component.vG.pvs.pvs icD = new com.bytedance.sdk.component.vG.pvs.pvs();
    public qh pvs;

    public abstract Map<String, List<String>> Jd();

    public abstract com.bytedance.sdk.component.icD.pvs.pvs NB();

    public abstract yiw icD();

    public abstract Object pvs();

    public abstract String sUS();

    public IP so() {
        return null;
    }

    public abstract String vG();

    public abstract int yiw();

    public void pvs(qh qhVar) {
        this.pvs = qhVar;
    }

    public pvs Mxy() {
        return new pvs(this);
    }

    /* compiled from: Request.java */
    public static class pvs {
        String Jd;
        Object NB;
        Map<String, List<String>> icD;
        com.bytedance.sdk.component.icD.pvs.pvs pvs;
        IP sUS;
        String so;
        yiw vG;
        int yiw;

        public pvs() {
            this.icD = new HashMap();
        }

        public pvs pvs(com.bytedance.sdk.component.icD.pvs.pvs pvsVar) {
            this.pvs = pvsVar;
            return this;
        }

        public pvs pvs(String str) {
            this.so = str;
            return this;
        }

        public pvs pvs(int i) {
            this.yiw = i;
            return this;
        }

        pvs(Ju ju) {
            this.vG = ju.icD();
            this.Jd = ju.vG();
            this.icD = ju.Jd();
            this.NB = ju.pvs();
            this.sUS = ju.so();
            this.pvs = ju.NB();
            this.yiw = ju.yiw();
            this.so = ju.sUS();
        }

        public pvs pvs(Object obj) {
            this.NB = obj;
            return this;
        }

        public pvs icD(String str) {
            return pvs(yiw.vG(str));
        }

        public pvs pvs(yiw yiwVar) {
            this.vG = yiwVar;
            return this;
        }

        public pvs pvs(String str, String str2) {
            return icD(str, str2);
        }

        public pvs icD(String str, String str2) {
            if (!this.icD.containsKey(str)) {
                this.icD.put(str, new ArrayList());
            }
            this.icD.get(str).add(str2);
            return this;
        }

        public pvs pvs() {
            return pvs(ShareTarget.METHOD_GET, (IP) null);
        }

        private pvs pvs(String str, IP ip) {
            this.Jd = str;
            this.sUS = ip;
            return this;
        }

        public pvs pvs(IP ip) {
            return pvs(ShareTarget.METHOD_POST, ip);
        }

        public Ju icD() {
            return new Ju() { // from class: com.bytedance.sdk.component.icD.pvs.Ju.pvs.1
                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.icD.pvs.Ju
                public Object pvs() {
                    return pvs.this.NB;
                }

                @Override // com.bytedance.sdk.component.icD.pvs.Ju
                public yiw icD() {
                    return pvs.this.vG;
                }

                @Override // com.bytedance.sdk.component.icD.pvs.Ju
                public String vG() {
                    return pvs.this.Jd;
                }

                @Override // com.bytedance.sdk.component.icD.pvs.Ju
                public Map Jd() {
                    return pvs.this.icD;
                }

                @Override // com.bytedance.sdk.component.icD.pvs.Ju
                public com.bytedance.sdk.component.icD.pvs.pvs NB() {
                    return pvs.this.pvs;
                }

                @Override // com.bytedance.sdk.component.icD.pvs.Ju
                public String sUS() {
                    return pvs.this.so;
                }

                @Override // com.bytedance.sdk.component.icD.pvs.Ju
                public int yiw() {
                    return pvs.this.yiw;
                }

                @Override // com.bytedance.sdk.component.icD.pvs.Ju
                public IP so() {
                    return pvs.this.sUS;
                }
            };
        }
    }
}
