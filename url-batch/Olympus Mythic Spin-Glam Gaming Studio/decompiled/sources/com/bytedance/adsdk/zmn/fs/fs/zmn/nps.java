package com.bytedance.adsdk.zmn.fs.fs.zmn;

import com.ironsource.X3;
import com.pubmatic.sdk.common.POBCommonConstants;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class nps implements com.bytedance.adsdk.zmn.fs.fs.zmn {
    private final Object zmn;

    public nps(String str) {
        if (str.equalsIgnoreCase("true")) {
            this.zmn = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.zmn = Boolean.FALSE;
        } else {
            if (str.equalsIgnoreCase(POBCommonConstants.NULL_VALUE)) {
                this.zmn = null;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public Object zmn(Map<String, JSONObject> map) {
        return this.zmn;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public com.bytedance.adsdk.zmn.fs.fb.btk zmn() {
        return com.bytedance.adsdk.zmn.fs.fb.hhw.CONSTANT;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.zmn + X3.j.e;
    }

    @Override // com.bytedance.adsdk.zmn.fs.fs.zmn
    public String fs() {
        Object obj = this.zmn;
        if (obj != null) {
            return obj.toString();
        }
        return "NULL";
    }
}
