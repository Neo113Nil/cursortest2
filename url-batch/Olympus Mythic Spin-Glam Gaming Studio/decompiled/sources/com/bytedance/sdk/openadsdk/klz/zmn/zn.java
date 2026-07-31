package com.bytedance.sdk.openadsdk.klz.zmn;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.zmn.zn;
import com.bytedance.sdk.openadsdk.core.fkt;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class zn extends com.bytedance.sdk.component.zmn.zn<JSONObject, JSONObject> {
    private final WeakReference<fkt> zmn;

    public static void zmn(com.bytedance.sdk.component.zmn.cn cnVar, final fkt fktVar) {
        cnVar.zmn("newClickEvent", new zn.fs() { // from class: com.bytedance.sdk.openadsdk.klz.zmn.zn.1
            @Override // com.bytedance.sdk.component.zmn.zn.fs
            public com.bytedance.sdk.component.zmn.zn zmn() {
                return new zn(fkt.this);
            }
        });
    }

    public zn(fkt fktVar) {
        this.zmn = new WeakReference<>(fktVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.zmn.zn
    public void zmn(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.zmn.btk btkVar) throws Exception {
        fkt fktVar = this.zmn.get();
        if (fktVar == null) {
            zn();
        } else {
            fktVar.btk(jSONObject);
        }
    }
}
