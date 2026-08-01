package com.bytedance.sdk.component.adexpress.icD;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: RenderRequest.java */
/* loaded from: classes.dex */
public class Ju {
    private JSONObject CvL;
    private JSONObject Gp;
    private Map<String, String> IP;
    private Mxy Jd;
    private String Ju;
    private boolean Mxy;
    private int NB;
    private int OT;
    private int Wyp;
    private double ZhG;
    private JSONObject ae;
    private int bNS;
    private int cR;
    private boolean dX;
    private final boolean dx;
    private int dyT;
    private boolean gA;
    private NB icD;
    private String jlb;
    private int kj;
    private boolean mnm;
    private String ny;
    private JSONObject pvs;
    private long qh;
    private int rCZ;
    private String sUS;
    private String so;
    private int uc;
    private String vA;
    private String vG;
    private String yiw;
    private int zM;

    public Ju(pvs pvsVar) {
        this.pvs = pvsVar.pvs;
        this.icD = pvsVar.icD;
        this.vG = pvsVar.vG;
        this.Jd = pvsVar.Jd;
        this.NB = pvsVar.NB;
        this.sUS = pvsVar.sUS;
        this.yiw = pvsVar.yiw;
        this.so = pvsVar.so;
        this.Mxy = pvsVar.Mxy;
        this.Wyp = pvsVar.Wyp;
        this.qh = pvsVar.qh;
        this.kj = pvsVar.kj;
        this.Ju = pvsVar.Ju;
        this.IP = pvsVar.IP;
        this.bNS = pvsVar.bNS;
        this.mnm = pvsVar.mnm;
        this.vA = pvsVar.vA;
        this.cR = pvsVar.cR;
        this.zM = pvsVar.zM;
        this.uc = pvsVar.uc;
        this.rCZ = pvsVar.rCZ;
        this.OT = pvsVar.OT;
        this.ny = pvsVar.ny;
        this.ZhG = pvsVar.ZhG;
        this.dyT = pvsVar.dyT;
        this.dX = pvsVar.dX;
        this.CvL = pvsVar.CvL;
        this.Gp = pvsVar.Gp;
        this.ae = pvsVar.ae;
        this.gA = pvsVar.gA;
        this.jlb = pvsVar.jlb;
        this.dx = pvsVar.dx;
    }

    public boolean pvs() {
        return this.dX;
    }

    public double icD() {
        return this.ZhG;
    }

    public JSONObject vG() {
        NB nb;
        if (this.pvs == null && (nb = this.icD) != null) {
            this.pvs = nb.pvs();
        }
        return this.pvs;
    }

    public String Jd() {
        return this.vG;
    }

    public Mxy NB() {
        return this.Jd;
    }

    public int sUS() {
        return this.NB;
    }

    public int yiw() {
        return this.dyT;
    }

    public boolean so() {
        return this.Mxy;
    }

    public long Mxy() {
        return this.qh;
    }

    public int Wyp() {
        return this.kj;
    }

    public Map<String, String> qh() {
        return this.IP;
    }

    public int kj() {
        return this.bNS;
    }

    public boolean Ju() {
        return this.mnm;
    }

    public String IP() {
        return this.vA;
    }

    public int bNS() {
        return this.cR;
    }

    public int mnm() {
        return this.zM;
    }

    public int vA() {
        return this.uc;
    }

    public JSONObject cR() {
        return this.CvL;
    }

    public JSONObject zM() {
        return this.Gp;
    }

    public JSONObject uc() {
        return this.ae;
    }

    public int rCZ() {
        return this.rCZ;
    }

    public int OT() {
        return this.OT;
    }

    public boolean ny() {
        return this.gA;
    }

    public String ZhG() {
        return this.jlb;
    }

    public boolean dyT() {
        return this.dx;
    }

    /* compiled from: RenderRequest.java */
    public static class pvs {
        private JSONObject CvL;
        private JSONObject Gp;
        private Map<String, String> IP;
        private Mxy Jd;
        private String Ju;
        private boolean Mxy;
        private int NB;
        private int OT;
        private int Wyp;
        private double ZhG;
        private JSONObject ae;
        private int bNS;
        private int cR;
        private boolean dX = true;
        private boolean dx = true;
        private int dyT;
        private boolean gA;
        private NB icD;
        private String jlb;
        private int kj;
        private boolean mnm;
        private String ny;
        private JSONObject pvs;
        private long qh;
        private int rCZ;
        private String sUS;
        private String so;
        private int uc;
        private String vA;
        private String vG;
        private String yiw;
        private int zM;

        public pvs pvs(NB nb) {
            this.icD = nb;
            return this;
        }

        public pvs pvs(boolean z) {
            this.dX = z;
            return this;
        }

        public pvs pvs(String str) {
            this.vG = str;
            return this;
        }

        public pvs pvs(Mxy mxy) {
            this.Jd = mxy;
            return this;
        }

        public pvs pvs(int i) {
            this.NB = i;
            return this;
        }

        public pvs icD(String str) {
            this.sUS = str;
            return this;
        }

        public pvs vG(String str) {
            this.yiw = str;
            return this;
        }

        public pvs Jd(String str) {
            this.so = str;
            return this;
        }

        public pvs icD(boolean z) {
            this.Mxy = z;
            return this;
        }

        public pvs vG(boolean z) {
            this.dx = z;
            return this;
        }

        public pvs icD(int i) {
            this.Wyp = i;
            return this;
        }

        public pvs pvs(long j) {
            this.qh = j;
            return this;
        }

        public pvs vG(int i) {
            this.kj = i;
            return this;
        }

        public pvs pvs(Map<String, String> map) {
            this.IP = map;
            return this;
        }

        public pvs Jd(int i) {
            this.bNS = i;
            return this;
        }

        public pvs Jd(boolean z) {
            this.mnm = z;
            return this;
        }

        public pvs NB(String str) {
            this.vA = str;
            return this;
        }

        public pvs NB(int i) {
            this.dyT = i;
            return this;
        }

        public pvs NB(boolean z) {
            this.gA = z;
            return this;
        }

        public pvs sUS(String str) {
            this.jlb = str;
            return this;
        }

        public Ju pvs() {
            return new Ju(this);
        }

        public pvs pvs(double d) {
            this.ZhG = d;
            return this;
        }
    }
}
