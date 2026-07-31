package com.bytedance.sdk.component.adexpress.fs;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class mw {
    private JSONObject am;
    private int bjh;
    private int btk;
    private boolean bvs;
    private int cn;
    private boolean cyb;
    private int doe;
    private int ev;
    private bvs fb;
    private final String fkt;
    private btk fs;
    private final String hgd;
    private String hhw;
    private int iqz;
    private int iv;
    private int kgc;
    private JSONObject kjb;
    private int klz;
    private int kw;
    private String mw;
    private String nps;
    private String nqi;
    private final boolean nu;
    private String olo;
    private int phc;
    private long rc;
    private boolean rp;
    private Map<String, String> rt;
    private String so;
    private final boolean tf;
    private double uqh;
    private boolean yj;
    private JSONObject zak;
    private String zg;
    private JSONObject zmn;
    private String zn;

    public mw(zmn zmnVar) {
        this.zmn = zmnVar.zmn;
        this.fs = zmnVar.fs;
        this.zn = zmnVar.zn;
        this.fb = zmnVar.fb;
        this.btk = zmnVar.btk;
        this.hhw = zmnVar.hhw;
        this.nps = zmnVar.nps;
        this.zg = zmnVar.zg;
        this.bvs = zmnVar.bvs;
        this.iv = zmnVar.iv;
        this.rc = zmnVar.rc;
        this.klz = zmnVar.klz;
        this.mw = zmnVar.mw;
        this.rt = zmnVar.rt;
        this.cn = zmnVar.cn;
        this.cyb = zmnVar.cyb;
        this.olo = zmnVar.olo;
        this.kgc = zmnVar.kgc;
        this.kw = zmnVar.kw;
        this.iqz = zmnVar.iqz;
        this.phc = zmnVar.phc;
        this.doe = zmnVar.doe;
        this.nqi = zmnVar.nqi;
        this.uqh = zmnVar.uqh;
        this.bjh = zmnVar.bjh;
        this.rp = zmnVar.rp;
        this.kjb = zmnVar.kjb;
        this.zak = zmnVar.zak;
        this.am = zmnVar.am;
        this.yj = zmnVar.yj;
        this.so = zmnVar.so;
        this.ev = zmnVar.hgd;
        this.tf = zmnVar.ev;
        this.fkt = zmnVar.tf;
        this.hgd = zmnVar.fkt;
        this.nu = zmnVar.nu;
    }

    public boolean zmn() {
        return this.rp;
    }

    public double fs() {
        return this.uqh;
    }

    public JSONObject zn() {
        btk btkVar;
        if (this.zmn == null && (btkVar = this.fs) != null) {
            this.zmn = btkVar.zmn();
        }
        return this.zmn;
    }

    public String fb() {
        return this.zn;
    }

    public bvs btk() {
        return this.fb;
    }

    public int hhw() {
        return this.btk;
    }

    public int nps() {
        return this.bjh;
    }

    public boolean zg() {
        return this.bvs;
    }

    public long bvs() {
        return this.rc;
    }

    public int iv() {
        return this.klz;
    }

    public Map<String, String> rc() {
        return this.rt;
    }

    public int klz() {
        return this.cn;
    }

    public boolean mw() {
        return this.cyb;
    }

    public String rt() {
        return this.olo;
    }

    public int cn() {
        return this.kgc;
    }

    public int cyb() {
        return this.kw;
    }

    public int olo() {
        return this.iqz;
    }

    public JSONObject kgc() {
        return this.kjb;
    }

    public JSONObject kw() {
        return this.zak;
    }

    public JSONObject iqz() {
        return this.am;
    }

    public int phc() {
        return this.phc;
    }

    public int doe() {
        return this.doe;
    }

    public boolean nqi() {
        return this.yj;
    }

    public String uqh() {
        return this.so;
    }

    public int bjh() {
        return this.ev;
    }

    public boolean rp() {
        return this.tf;
    }

    public String kjb() {
        return this.fkt;
    }

    public String zak() {
        return this.hgd;
    }

    public boolean am() {
        return this.nu;
    }

    public static class zmn {
        private JSONObject am;
        private int bjh;
        private int btk;
        private boolean bvs;
        private int cn;
        private boolean cyb;
        private int doe;
        private bvs fb;
        private String fkt;
        private btk fs;
        private int hgd;
        private String hhw;
        private int iqz;
        private int iv;
        private int kgc;
        private JSONObject kjb;
        private int klz;
        private int kw;
        private String mw;
        private String nps;
        private String nqi;
        private String olo;
        private int phc;
        private long rc;
        private Map<String, String> rt;
        private String so;
        private String tf;
        private double uqh;
        private boolean yj;
        private JSONObject zak;
        private String zg;
        private JSONObject zmn;
        private String zn;
        private boolean rp = true;
        private boolean ev = true;
        private boolean nu = false;

        public zmn zmn(btk btkVar) {
            this.fs = btkVar;
            return this;
        }

        public zmn zmn(boolean z) {
            this.rp = z;
            return this;
        }

        public zmn zmn(String str) {
            this.zn = str;
            return this;
        }

        public zmn zmn(bvs bvsVar) {
            this.fb = bvsVar;
            return this;
        }

        public zmn zmn(int i) {
            this.btk = i;
            return this;
        }

        public zmn fs(String str) {
            this.hhw = str;
            return this;
        }

        public zmn zn(String str) {
            this.nps = str;
            return this;
        }

        public zmn fb(String str) {
            this.zg = str;
            return this;
        }

        public zmn fs(boolean z) {
            this.bvs = z;
            return this;
        }

        public zmn zn(boolean z) {
            this.ev = z;
            return this;
        }

        public zmn fs(int i) {
            this.iv = i;
            return this;
        }

        public zmn zmn(long j) {
            this.rc = j;
            return this;
        }

        public zmn zn(int i) {
            this.klz = i;
            return this;
        }

        public zmn zmn(Map<String, String> map) {
            this.rt = map;
            return this;
        }

        public zmn fb(int i) {
            this.cn = i;
            return this;
        }

        public zmn fb(boolean z) {
            this.cyb = z;
            return this;
        }

        public zmn btk(String str) {
            this.olo = str;
            return this;
        }

        public zmn btk(int i) {
            this.bjh = i;
            return this;
        }

        public zmn btk(boolean z) {
            this.yj = z;
            return this;
        }

        public zmn hhw(String str) {
            this.so = str;
            return this;
        }

        public zmn hhw(int i) {
            this.hgd = i;
            return this;
        }

        public mw zmn() {
            return new mw(this);
        }

        public zmn zmn(double d) {
            this.uqh = d;
            return this;
        }

        public zmn nps(String str) {
            this.tf = str;
            return this;
        }

        public zmn zg(String str) {
            this.fkt = str;
            return this;
        }

        public zmn hhw(boolean z) {
            this.nu = z;
            return this;
        }
    }
}
