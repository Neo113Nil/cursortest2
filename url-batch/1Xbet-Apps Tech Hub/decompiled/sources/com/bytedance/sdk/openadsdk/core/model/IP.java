package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.icD.vG;
import org.json.JSONObject;

/* compiled from: DynamicClickInfo.java */
/* loaded from: classes2.dex */
public class IP implements com.bytedance.sdk.component.adexpress.vG {
    public SparseArray<vG.pvs> IP;
    public final float Jd;
    public JSONObject Ju;
    public final int Mxy;
    public final long NB;
    public final int Wyp;
    public final boolean bNS;
    public final float icD;
    public int kj;
    public int mnm;
    public final float pvs;
    public final String qh;
    public final long sUS;
    public final int so;
    public JSONObject vA;
    public final float vG;
    public final int yiw;

    private IP(pvs pvsVar) {
        this.pvs = pvsVar.yiw;
        this.icD = pvsVar.sUS;
        this.vG = pvsVar.NB;
        this.Jd = pvsVar.Jd;
        this.NB = pvsVar.vG;
        this.sUS = pvsVar.icD;
        this.yiw = pvsVar.so;
        this.so = pvsVar.Mxy;
        this.Mxy = pvsVar.Wyp;
        this.Wyp = pvsVar.qh;
        this.qh = pvsVar.kj;
        this.IP = pvsVar.pvs;
        this.bNS = pvsVar.vA;
        this.kj = pvsVar.Ju;
        this.Ju = pvsVar.IP;
        this.mnm = pvsVar.bNS;
        this.vA = pvsVar.mnm;
    }

    /* compiled from: DynamicClickInfo.java */
    public static class pvs {
        private JSONObject IP;
        private float Jd;
        private int Ju;
        private int Mxy;
        private float NB;
        private int Wyp;
        private int bNS;
        private long icD;
        private String kj;
        private JSONObject mnm;
        protected SparseArray<vG.pvs> pvs = new SparseArray<>();
        private int qh;
        private float sUS;
        private int so;
        private boolean vA;
        private long vG;
        private float yiw;

        public pvs pvs(int i) {
            this.bNS = i;
            return this;
        }

        public pvs icD(int i) {
            this.Ju = i;
            return this;
        }

        public pvs pvs(JSONObject jSONObject) {
            this.IP = jSONObject;
            return this;
        }

        public pvs pvs(boolean z) {
            this.vA = z;
            return this;
        }

        public pvs pvs(long j) {
            this.icD = j;
            return this;
        }

        public pvs icD(long j) {
            this.vG = j;
            return this;
        }

        public pvs pvs(float f) {
            this.Jd = f;
            return this;
        }

        public pvs icD(float f) {
            this.NB = f;
            return this;
        }

        public pvs vG(float f) {
            this.sUS = f;
            return this;
        }

        public pvs Jd(float f) {
            this.yiw = f;
            return this;
        }

        public pvs vG(int i) {
            this.so = i;
            return this;
        }

        public pvs Jd(int i) {
            this.Mxy = i;
            return this;
        }

        public pvs NB(int i) {
            this.Wyp = i;
            return this;
        }

        public pvs sUS(int i) {
            this.qh = i;
            return this;
        }

        public pvs pvs(String str) {
            this.kj = str;
            return this;
        }

        public pvs pvs(SparseArray<vG.pvs> sparseArray) {
            this.pvs = sparseArray;
            return this;
        }

        public pvs icD(JSONObject jSONObject) {
            this.mnm = jSONObject;
            return this;
        }

        public IP pvs() {
            return new IP(this);
        }
    }
}
