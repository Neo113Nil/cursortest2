package com.bytedance.sdk.openadsdk.klz.zmn;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.zmn.zn;
import com.bytedance.sdk.openadsdk.core.fkt;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class zmn extends com.bytedance.sdk.component.zmn.zn<JSONObject, JSONObject> {
    private final WeakReference<fkt> zmn;

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, final fkt fktVar) {
        cnVar.zmn("getNetworkData", new zn.fs() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.zmn.1
            @Override // com.bytedance.sdk.component.zmn.zn.fs
            public com.bytedance.sdk.component.zmn.zn zmn() {
                return new zmn(fkt.this);
            }
        });
    }

    public zmn(fkt fktVar) {
        this.zmn = new WeakReference<>(fktVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.zmn.zn
    public void zmn(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        fkt fktVar = this.zmn.get();
        if (fktVar == null) {
            zn();
        } else {
            fktVar.zmn(jSONObject, new com.bytedance.sdk.openadsdk.mw.fb() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.zmn.2
                @Override // com.bytedance.sdk.openadsdk.mw.fb
                public void zmn(boolean z, com.bytedance.sdk.openadsdk.core.model.zmn zmnVar) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z) {
                            zmn.this.zmn((zmn) jSONObject2);
                        } else {
                            jSONObject2.put("creatives", fkt.zmn(zmnVar));
                            zmn.this.zmn((zmn) jSONObject2);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
