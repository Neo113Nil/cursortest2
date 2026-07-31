package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.openadsdk.core.kgc;
import com.bytedance.sdk.openadsdk.utils.mw;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zn {
    private static final ConcurrentHashMap<String, fs> zmn = new ConcurrentHashMap<>();

    @WorkerThread
    public static void zmn(boolean z) {
        File zmn2 = zmn();
        if (zmn2.exists()) {
            try {
                HashMap<String, fs> fs = fs(new JSONArray(new String(com.bytedance.sdk.component.utils.nps.fb(zmn2))));
                if (fs.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, fs> entry : fs.entrySet()) {
                    zmn.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    @NonNull
    private static HashMap<String, fs> fs(JSONArray jSONArray) {
        HashMap<String, fs> hashMap = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                fs zmn2 = zmn(jSONArray.getJSONObject(i));
                if (zmn2 != null) {
                    hashMap.put(zmn2.zmn, zmn2);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    @NonNull
    public static File zmn() {
        return com.bytedance.sdk.component.utils.nps.zmn(kgc.zmn(), kgc.zmn().getFilesDir(), "tt_ads_conf_sr");
    }

    private static fs zmn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new fs(jSONObject);
    }

    @NonNull
    public static fs zmn(String str) {
        fs fsVar = zmn.get(str);
        return fsVar == null ? fs(str) : fsVar;
    }

    private static fs fs(String str) {
        return new fs(str, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098 A[ORIG_RETURN, RETURN] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zmn(JSONArray jSONArray) {
        HashMap<String, fs> fs;
        FileWriter fileWriter;
        if (jSONArray == null) {
            return;
        }
        File zmn2 = zmn();
        File file = new File(zmn2.getParent(), zmn2.getName() + ".tmp");
        FileWriter fileWriter2 = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                fileWriter = new FileWriter(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            fileWriter.write(jSONArray.toString());
            file.renameTo(zmn2);
            if (file.exists()) {
                file.delete();
            }
            mw.zmn(fileWriter);
        } catch (Exception e2) {
            e = e2;
            fileWriter2 = fileWriter;
            Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
            if (file.exists()) {
                file.delete();
            }
            mw.zmn(fileWriter2);
            fs = fs(jSONArray);
            if (fs.isEmpty()) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            if (file.exists()) {
                file.delete();
            }
            mw.zmn(fileWriter2);
            throw th;
        }
        fs = fs(jSONArray);
        if (fs.isEmpty()) {
            for (Map.Entry<String, fs> entry : fs.entrySet()) {
                zmn.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void fs() {
        File zmn2 = zmn();
        if (zmn2.exists()) {
            zmn2.delete();
        }
    }
}
