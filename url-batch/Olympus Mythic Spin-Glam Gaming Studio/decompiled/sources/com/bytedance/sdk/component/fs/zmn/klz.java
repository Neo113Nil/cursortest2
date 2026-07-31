package com.bytedance.sdk.component.fs.zmn;

import com.ironsource.C4701ic;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public abstract class klz {
    private long fb = 30000;
    public com.bytedance.sdk.component.zn.zmn.zmn fs = new com.bytedance.sdk.component.zn.zmn.zmn();
    public rc zmn;
    private List<String> zn;

    public abstract String btk();

    public abstract int bvs();

    public abstract nps fb();

    public abstract Map<String, List<String>> hhw();

    public mw iv() {
        return null;
    }

    public abstract com.bytedance.sdk.component.fs.zmn.zmn nps();

    public abstract String zg();

    public abstract Object zn();

    public List<String> zmn() {
        return this.zn;
    }

    public long fs() {
        return this.fb;
    }

    public void zmn(rc rcVar) {
        this.zmn = rcVar;
    }

    public zmn rc() {
        return new zmn(this);
    }

    public static class zmn {
        Object btk;
        private List<String> bvs;
        String fb;
        Map<String, List<String>> fs;
        mw hhw;
        private long iv;
        int nps;
        String zg;
        com.bytedance.sdk.component.fs.zmn.zmn zmn;
        nps zn;

        public zmn() {
            this.iv = 30000L;
            this.fs = new HashMap();
        }

        public zmn zmn(com.bytedance.sdk.component.fs.zmn.zmn zmnVar) {
            this.zmn = zmnVar;
            return this;
        }

        public zmn zmn(String str) {
            this.zg = str;
            return this;
        }

        public zmn zmn(int i) {
            this.nps = i;
            return this;
        }

        zmn(klz klzVar) {
            this.iv = 30000L;
            this.zn = klzVar.fb();
            this.fb = klzVar.btk();
            this.fs = klzVar.hhw();
            this.btk = klzVar.zn();
            this.hhw = klzVar.iv();
            this.zmn = klzVar.nps();
            this.nps = klzVar.bvs();
            this.zg = klzVar.zg();
            this.bvs = klzVar.zmn();
            this.iv = klzVar.fs();
        }

        public zmn zmn(Object obj) {
            this.btk = obj;
            return this;
        }

        public zmn fs(String str) {
            return zmn(nps.zn(str));
        }

        public zmn zmn(nps npsVar) {
            this.zn = npsVar;
            return this;
        }

        public zmn zmn(String str, String str2) {
            return fs(str, str2);
        }

        public zmn fs(String str, String str2) {
            if (!this.fs.containsKey(str)) {
                this.fs.put(str, new ArrayList());
            }
            this.fs.get(str).add(str2);
            return this;
        }

        public zmn zmn() {
            return zmn(C4701ic.a, (mw) null);
        }

        private zmn zmn(String str, mw mwVar) {
            this.fb = str;
            this.hhw = mwVar;
            return this;
        }

        public zmn zmn(mw mwVar) {
            return zmn("POST", mwVar);
        }

        public zmn zmn(List<String> list) {
            this.bvs = list;
            return this;
        }

        public zmn zmn(long j) {
            this.iv = j;
            return this;
        }

        public klz fs() {
            return new klz() { // from class: com.bytedance.sdk.component.fs.zmn.klz.zmn.1
                @Override // com.bytedance.sdk.component.fs.zmn.klz
                public Object zn() {
                    return zmn.this.btk;
                }

                @Override // com.bytedance.sdk.component.fs.zmn.klz
                public nps fb() {
                    return zmn.this.zn;
                }

                @Override // com.bytedance.sdk.component.fs.zmn.klz
                public String btk() {
                    return zmn.this.fb;
                }

                @Override // com.bytedance.sdk.component.fs.zmn.klz
                public Map hhw() {
                    return zmn.this.fs;
                }

                @Override // com.bytedance.sdk.component.fs.zmn.klz
                public com.bytedance.sdk.component.fs.zmn.zmn nps() {
                    return zmn.this.zmn;
                }

                @Override // com.bytedance.sdk.component.fs.zmn.klz
                public String zg() {
                    return zmn.this.zg;
                }

                @Override // com.bytedance.sdk.component.fs.zmn.klz
                public int bvs() {
                    return zmn.this.nps;
                }

                public String toString() {
                    return "";
                }

                @Override // com.bytedance.sdk.component.fs.zmn.klz
                public mw iv() {
                    return zmn.this.hhw;
                }

                @Override // com.bytedance.sdk.component.fs.zmn.klz
                public List<String> zmn() {
                    return zmn.this.bvs;
                }

                @Override // com.bytedance.sdk.component.fs.zmn.klz
                public long fs() {
                    return zmn.this.iv;
                }
            };
        }
    }
}
