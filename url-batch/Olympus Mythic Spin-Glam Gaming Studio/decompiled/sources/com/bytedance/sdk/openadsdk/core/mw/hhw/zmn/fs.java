package com.bytedance.sdk.openadsdk.core.mw.hhw.zmn;

import com.bytedance.sdk.openadsdk.core.model.nqi;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class fs {
    protected nqi zmn;

    public abstract JSONObject fs();

    public abstract String zmn();

    public void zmn(JSONObject jSONObject) {
    }

    public fs(nqi nqiVar) {
        this.zmn = nqiVar;
    }

    public static class zmn {
        public static fs zmn(nqi nqiVar, com.bytedance.sdk.openadsdk.core.mw.hhw.zmn zmnVar) {
            if (nqiVar == null) {
                return null;
            }
            int sft = nqiVar.sft();
            if (sft == 1) {
                return new com.bytedance.sdk.openadsdk.core.mw.hhw.zmn.zmn(nqiVar, zmnVar);
            }
            if (sft == 3) {
                return new fb(nqiVar, zmnVar);
            }
            if (sft == 7 || sft == 8) {
                return new btk(nqiVar, zmnVar);
            }
            return null;
        }
    }
}
