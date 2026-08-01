package com.bytedance.sdk.openadsdk.core.ugen.vG;

import com.bytedance.adsdk.ugeno.core.mnm;
import com.bytedance.sdk.component.adexpress.icD.Ju;
import org.json.JSONObject;

/* compiled from: UGRenderRequest.java */
/* loaded from: classes2.dex */
public class pvs extends Ju {
    private float Jd;
    private mnm icD;
    private JSONObject pvs;
    private float vG;

    public pvs(C0081pvs c0081pvs) {
        super(c0081pvs);
        this.pvs = c0081pvs.pvs;
        this.icD = c0081pvs.icD;
        this.vG = c0081pvs.vG;
        this.Jd = c0081pvs.Jd;
    }

    public float dX() {
        return this.vG;
    }

    public float CvL() {
        return this.Jd;
    }

    public JSONObject Gp() {
        return this.pvs;
    }

    public mnm ae() {
        return this.icD;
    }

    /* compiled from: UGRenderRequest.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ugen.vG.pvs$pvs, reason: collision with other inner class name */
    public static class C0081pvs extends Ju.pvs {
        private float Jd;
        private mnm icD;
        private JSONObject pvs;
        private float vG;

        public C0081pvs pvs(JSONObject jSONObject) {
            this.pvs = jSONObject;
            return this;
        }

        public C0081pvs pvs(mnm mnmVar) {
            this.icD = mnmVar;
            return this;
        }

        public C0081pvs pvs(float f) {
            this.vG = f;
            return this;
        }

        public C0081pvs icD(float f) {
            this.Jd = f;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.icD.Ju.pvs
        /* renamed from: icD, reason: merged with bridge method [inline-methods] */
        public pvs pvs() {
            return new pvs(this);
        }
    }
}
