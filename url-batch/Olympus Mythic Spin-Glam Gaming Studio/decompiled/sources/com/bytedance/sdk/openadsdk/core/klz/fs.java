package com.bytedance.sdk.openadsdk.core.klz;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
class fs {
    private static com.bytedance.sdk.openadsdk.core.klz.zmn zmn;

    private fs() {
        zmn = new com.bytedance.sdk.openadsdk.core.klz.zmn();
    }

    public void zmn(String str) {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar;
        if (TextUtils.isEmpty(str) || (zmnVar = zmn) == null) {
            return;
        }
        zmnVar.zmn(str);
    }

    public void fs(String str) {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar;
        if (TextUtils.isEmpty(str) || (zmnVar = zmn) == null) {
            return;
        }
        zmnVar.fs(str);
    }

    public void zmn(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar = zmn;
        if (zmnVar != null) {
            zmnVar.zmn(map);
        }
    }

    public void zmn() {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar = zmn;
        if (zmnVar != null) {
            zmnVar.zn();
        }
    }

    public static fs fs() {
        return zmn.zmn;
    }

    public void zmn(@NonNull String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar = zmn;
        if (zmnVar != null) {
            zmnVar.zmn(str, map);
        }
    }

    public boolean zn() {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar = zmn;
        if (zmnVar == null) {
            return false;
        }
        return zmnVar.fs();
    }

    public String fb() {
        String fb;
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar = zmn;
        return (zmnVar == null || (fb = zmnVar.fb()) == null) ? "" : fb;
    }

    public Map<String, String> zmn(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar = zmn;
        if (zmnVar != null) {
            return zmnVar.zmn(str, bArr);
        }
        return new HashMap();
    }

    public String btk() {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar = zmn;
        if (zmnVar != null) {
            return zmnVar.btk();
        }
        return "";
    }

    public long hhw() {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar = zmn;
        if (zmnVar != null) {
            return zmnVar.hhw();
        }
        return 0L;
    }

    public int nps() {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar = zmn;
        if (zmnVar != null) {
            return zmnVar.nps();
        }
        return 1;
    }

    public void zmn(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.klz.zmn zmnVar = zmn;
        if (zmnVar != null) {
            zmnVar.zmn(motionEvent);
        }
    }

    private static class zmn {
        private static final fs zmn = new fs();
    }
}
