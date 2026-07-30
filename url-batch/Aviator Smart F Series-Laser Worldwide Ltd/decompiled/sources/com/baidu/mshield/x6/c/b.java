package com.baidu.mshield.x6.c;

import android.os.Build;
import android.view.InputDevice;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.mshield.x6.f.f;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    public static String a() {
        try {
            int[] deviceIds = InputDevice.getDeviceIds();
            JSONArray jSONArray = new JSONArray();
            for (int i8 : deviceIds) {
                InputDevice device = InputDevice.getDevice(i8);
                if (device != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("0", device.getName());
                    jSONObject.put("1", device.isVirtual() ? 1 : 0);
                    jSONObject.put("2", device.getVendorId());
                    jSONObject.put(ExifInterface.GPS_MEASUREMENT_3D, device.getSources());
                    String inputDevice = device.toString();
                    jSONObject.put("4", inputDevice.indexOf("Location: built-in") > 0 ? 1 : inputDevice.indexOf("Location: external") > 0 ? 2 : 0);
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray.toString().replace("   ", "");
        } catch (Exception e8) {
            f.b(e8);
            return "";
        }
    }

    public static boolean b() {
        try {
            return Build.VERSION.SDK_INT >= 26;
        } catch (Throwable th) {
            f.b(th);
            return false;
        }
    }
}
