package com.bytedance.sdk.openadsdk.core.mw.hhw;

import com.bytedance.adsdk.ugeno.core.kgc;
import com.bytedance.sdk.component.adexpress.fs.mw;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class zmn extends mw {
    private boolean btk;
    private float fb;
    private kgc fs;
    private JSONObject zmn;
    private float zn;

    public zmn(C0171zmn c0171zmn) {
        super(c0171zmn);
        this.zmn = c0171zmn.zmn;
        this.fs = c0171zmn.fs;
        this.zn = c0171zmn.zn;
        this.fb = c0171zmn.fb;
        this.btk = c0171zmn.btk;
    }

    public float yj() {
        return this.zn;
    }

    public float so() {
        return this.fb;
    }

    public JSONObject ev() {
        return this.zmn;
    }

    public kgc tf() {
        return this.fs;
    }

    public boolean fkt() {
        return this.btk;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.mw.hhw.zmn$zmn, reason: collision with other inner class name */
    public static class C0171zmn extends mw.zmn {
        private boolean btk;
        private float fb;
        private kgc fs;
        private JSONObject zmn;
        private float zn;

        public C0171zmn zmn(JSONObject jSONObject) {
            this.zmn = jSONObject;
            return this;
        }

        public C0171zmn zmn(kgc kgcVar) {
            this.fs = kgcVar;
            return this;
        }

        public C0171zmn zmn(float f) {
            this.zn = f;
            return this;
        }

        public C0171zmn fs(float f) {
            this.fb = f;
            return this;
        }

        public C0171zmn nps(boolean z) {
            this.btk = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.fs.mw.zmn
        /* renamed from: fs, reason: merged with bridge method [inline-methods] */
        public zmn zmn() {
            return new zmn(this);
        }
    }
}
