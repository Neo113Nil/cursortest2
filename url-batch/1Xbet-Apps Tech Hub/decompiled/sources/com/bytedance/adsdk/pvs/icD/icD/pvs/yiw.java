package com.bytedance.adsdk.pvs.icD.icD.pvs;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: KeywordNode.java */
/* loaded from: classes.dex */
public class yiw implements com.bytedance.adsdk.pvs.icD.icD.pvs {
    private final Object pvs;

    public yiw(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.pvs = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.pvs = Boolean.FALSE;
        } else {
            if (str.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                this.pvs = null;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public Object pvs(Map<String, JSONObject> map) {
        return this.pvs;
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public com.bytedance.adsdk.pvs.icD.Jd.NB pvs() {
        return com.bytedance.adsdk.pvs.icD.Jd.sUS.CONSTANT;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.pvs + "]";
    }

    @Override // com.bytedance.adsdk.pvs.icD.icD.pvs
    public String icD() {
        Object obj = this.pvs;
        return obj != null ? obj.toString() : "NULL";
    }
}
