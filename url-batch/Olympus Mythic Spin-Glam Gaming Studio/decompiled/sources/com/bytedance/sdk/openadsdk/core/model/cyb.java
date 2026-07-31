package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.zn.zn;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class cyb implements com.bytedance.sdk.component.adexpress.zn {
    public final long btk;
    public JSONObject bvs;
    public int cn;
    public String cyb;
    public final float fb;
    public final float fs;
    public final long hhw;
    public SparseArray<zn.zmn> iv;
    public int klz;
    public JSONObject mw;
    public final String nps;
    public int olo;
    public final boolean rc;
    public boolean rt;
    public int zg;
    public final float zmn;
    public final float zn;

    private cyb(@NonNull zmn zmnVar) {
        this.rt = false;
        this.zmn = zmnVar.nps;
        this.fs = zmnVar.hhw;
        this.zn = zmnVar.btk;
        this.fb = zmnVar.fb;
        this.btk = zmnVar.zn;
        this.hhw = zmnVar.fs;
        this.nps = zmnVar.bvs;
        this.iv = zmnVar.zmn;
        this.rc = zmnVar.olo;
        this.zg = zmnVar.iv;
        this.bvs = zmnVar.rc;
        this.klz = zmnVar.klz;
        this.mw = zmnVar.mw;
        this.rt = zmnVar.rt;
        this.cn = zmnVar.zg;
        this.cyb = zmnVar.cn;
        this.olo = zmnVar.cyb;
    }

    public static class zmn {
        private float btk;
        private String bvs;
        private String cn;
        private int cyb;
        private float fb;
        private long fs;
        private float hhw;
        private int iv;
        private int klz;
        private JSONObject mw;
        private float nps;
        private boolean olo;
        private JSONObject rc;
        private int zg;
        private long zn;
        private boolean rt = false;
        protected SparseArray<zn.zmn> zmn = new SparseArray<>();

        public zmn zmn(int i) {
            this.klz = i;
            return this;
        }

        public zmn fs(int i) {
            this.iv = i;
            return this;
        }

        public zmn zmn(JSONObject jSONObject) {
            this.rc = jSONObject;
            return this;
        }

        public zmn zmn(boolean z) {
            this.olo = z;
            return this;
        }

        public zmn zn(int i) {
            this.zg = i;
            return this;
        }

        public zmn zmn(long j) {
            this.fs = j;
            return this;
        }

        public zmn fs(long j) {
            this.zn = j;
            return this;
        }

        public zmn zmn(float f) {
            this.fb = f;
            return this;
        }

        public zmn fs(float f) {
            this.btk = f;
            return this;
        }

        public zmn zn(float f) {
            this.hhw = f;
            return this;
        }

        public zmn fb(float f) {
            this.nps = f;
            return this;
        }

        public zmn zmn(String str) {
            this.bvs = str;
            return this;
        }

        public zmn zmn(SparseArray<zn.zmn> sparseArray) {
            this.zmn = sparseArray;
            return this;
        }

        public zmn fs(JSONObject jSONObject) {
            this.mw = jSONObject;
            return this;
        }

        public zmn fs(boolean z) {
            this.rt = z;
            return this;
        }

        public zmn fs(String str) {
            this.cn = str;
            return this;
        }

        public zmn fb(int i) {
            this.cyb = i;
            return this;
        }

        public cyb zmn() {
            return new cyb(this);
        }
    }
}
