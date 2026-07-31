package com.bytedance.sdk.openadsdk.klz.zmn;

import com.bytedance.sdk.openadsdk.core.fkt;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class klz extends com.bytedance.sdk.component.zmn.kgc<JSONObject, JSONObject> {
    private static final HashSet<String> zmn = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));
    private final fkt fs;

    public klz(fkt fktVar) {
        this.fs = fktVar;
    }

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, fkt fktVar) {
        cnVar.zmn(zmn, new klz(fktVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.component.zmn.fb
    public JSONObject zmn(String str, JSONObject jSONObject, com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        str.hashCode();
        switch (str) {
            case "popupDismiss":
                this.fs.cyb();
                return null;
            case "popupShow":
                this.fs.cn();
                return null;
            case "getCurrentCountdownStatus":
                return this.fs.olo();
            case "popupRenderDidFinish":
                this.fs.kgc();
                return null;
            case "changeCountdownStatus":
                this.fs.rc(jSONObject);
                return null;
            default:
                return null;
        }
    }
}
