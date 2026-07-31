package com.bytedance.sdk.openadsdk.core.rt.zmn;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.model.nqi;
import com.bytedance.sdk.openadsdk.core.rt.fs.zn;
import com.bytedance.sdk.openadsdk.cyb.fb;
import com.bytedance.sdk.openadsdk.utils.jy;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class fs {
    public int btk;
    protected double fb;
    protected final Context fs;
    public zmn hhw;
    public int zmn;
    protected int zn;

    public static class zmn {
        public int fs;
        public int zmn;
        public boolean zn;
    }

    public abstract com.bytedance.sdk.openadsdk.core.rt.zmn zmn(String str, File file, List<zn> list);

    public fs(Context context, int i, int i2) {
        this.zn = 0;
        this.fb = 0.0d;
        if (i2 > 0 && i > 0) {
            this.fb = i / i2;
        }
        float zg = jy.zg(context);
        if (zg != 0.0f && i > 0) {
            this.zn = (int) (i / zg);
        }
        this.fs = context.getApplicationContext();
    }

    protected void zmn(Exception exc, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TelemetryCategory.EXCEPTION, exc.getMessage());
            jSONObject.put("error_code", i);
            fb.zmn().zmn("load_vast", jSONObject);
        } catch (Exception unused) {
        }
    }

    protected boolean zmn(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            return Integer.parseInt(str) < 2;
        } catch (NumberFormatException unused) {
            return true;
        }
    }

    protected String zmn(String str, List<zn> list) {
        int i = this.zmn;
        String str2 = null;
        if (i >= 5) {
            return null;
        }
        this.zmn = i + 1;
        if (str == null) {
            return null;
        }
        try {
            com.bytedance.sdk.component.nps.fs.fs zn = com.bytedance.sdk.openadsdk.iqz.fs.fs().zn().zn();
            zn.zn(str);
            com.bytedance.sdk.component.nps.fs btk = zn.btk();
            str2 = btk.fb();
            btk.zmn();
            return str2;
        } catch (Exception e) {
            zmn(e, 0);
            if (list.isEmpty()) {
                return str2;
            }
            zn.fs((nqi) null, list, com.bytedance.sdk.openadsdk.core.rt.zmn.zmn.WRAPPER_TIMEOUT, -1L, (String) null, (String) null);
            return str2;
        }
    }
}
