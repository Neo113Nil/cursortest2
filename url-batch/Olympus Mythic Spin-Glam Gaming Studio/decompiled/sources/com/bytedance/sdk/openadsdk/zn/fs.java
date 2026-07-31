package com.bytedance.sdk.openadsdk.zn;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.core.nqi;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class fs {
    private static volatile fs zmn;
    private final nqi<com.bytedance.sdk.openadsdk.fb.zmn> fs = kgc.zn();

    private fs() {
    }

    public static fs zmn() {
        if (zmn == null) {
            synchronized (fs.class) {
                try {
                    if (zmn == null) {
                        zmn = new fs();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zmn;
    }

    public void zmn(@NonNull String str, List<FilterWord> list, String str2) {
        zmn(str, list, null, null, str2);
    }

    public void zmn(@NonNull String str, List<FilterWord> list, JSONObject jSONObject, String str2, String str3) {
        this.fs.zmn(str, list, jSONObject, str2, str3);
    }
}
