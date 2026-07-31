package com.bykv.vk.openvk.zmn.zmn.fs;

import android.text.TextUtils;
import com.bykv.vk.openvk.zmn.zmn.zmn.zmn.fs;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class zmn {
    private static fs btk = null;
    public static int fb = 10;
    public static int fs = 10;
    private static boolean hhw = false;
    private static int nps = 1;
    private static int zg = 8192;
    public static int zmn = 50;
    public static int zn = 10;

    public static void zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            zmn = jSONObject.optInt("splash", 50);
            fs = jSONObject.optInt("reward", 10);
            zn = jSONObject.optInt("brand", 10);
            int optInt = jSONObject.optInt("other", 10);
            fb = optInt;
            if (zmn < 0) {
                zmn = 50;
            }
            if (fs < 0) {
                fs = 10;
            }
            if (zn < 0) {
                zn = 10;
            }
            if (optInt < 0) {
                fb = 10;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void zmn(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            hhw = jSONObject.optInt("check_moov", 0) == 1;
            nps = jSONObject.optInt("new_media_source", 1);
            zg = jSONObject.optInt("read_buffer_size_k", 8) * 1024;
        } catch (JSONException unused) {
        }
    }

    public static boolean fs(String str) {
        return hhw && str != null && str.endsWith(".mp4");
    }

    public static void zmn(fs fsVar) {
        btk = fsVar;
    }

    public static void zmn() {
        fs fsVar = btk;
        if (fsVar != null) {
            fsVar.fb();
        }
    }

    public static int fs() {
        return zmn;
    }

    public static int zn() {
        return fs;
    }

    public static int fb() {
        return zn;
    }

    public static int btk() {
        return fb;
    }

    public static int hhw() {
        return nps;
    }

    public static int nps() {
        return zg;
    }
}
