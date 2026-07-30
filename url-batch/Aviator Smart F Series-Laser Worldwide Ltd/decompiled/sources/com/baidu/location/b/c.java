package com.baidu.location.b;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class c {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final c f4510a = new c();
    }

    private c() {
    }

    public static c a() {
        return b.f4510a;
    }

    public void a(Context context) {
        Log.d("UrlConfigManger", "updateUrl");
        if (context == null) {
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getExternalFilesDir(Environment.DIRECTORY_MOVIES));
            String str = File.separator;
            sb.append(str);
            sb.append("baiduLocDev");
            sb.append(str);
            sb.append("loc_local_config");
            String sb2 = sb.toString();
            StringBuilder sb3 = new StringBuilder();
            try {
                if (!new File(sb2).exists()) {
                    Log.d("baidu_location_dev", "loc_local_config not exit...");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(sb2);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        fileInputStream.close();
                        a(sb3.toString());
                        return;
                    }
                    sb3.append(new String(bArr, 0, read));
                }
            } catch (FileNotFoundException e8) {
                e = e8;
                e.printStackTrace();
            } catch (IOException e9) {
                e = e9;
                e.printStackTrace();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void a(String str, String str2, String str3) {
        Log.d("UrlConfigManger", "setConfig");
        Log.d("baidu_location_dev", "type:" + str + ", owner: " + str2 + " ,url: " + str3);
        if (str2.contains("default_owner") || "default_url".equals(str3) || !str3.contains("https")) {
            Log.d("baidu_location_dev", "url 不合法");
            return;
        }
        str.hashCode();
        switch (str) {
            case "indoor_roadnet":
                com.baidu.location.e.e.f5205d = str3;
                break;
            case "vdr_log_update":
                com.baidu.location.e.e.f5208g = str3;
                break;
            case "hdyawupdate":
                com.baidu.location.e.e.f5210i = str3;
                break;
            case "basement_inout":
                com.baidu.location.e.e.f5211j = str3;
                break;
            case "indoor_poi_data":
                com.baidu.location.e.e.f5207f = str3;
                break;
            case "loc":
                com.baidu.location.e.e.f5203b = str3;
                break;
            case "cfgs":
                com.baidu.location.e.e.f5204c = str3;
                break;
            case "indoor_rects":
                com.baidu.location.e.e.f5206e = str3;
                break;
        }
    }

    private boolean a(String str) {
        JSONArray optJSONArray;
        Log.d("UrlConfigManger", "parseConfig");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("url_config") || (optJSONArray = jSONObject.optJSONArray("url_config")) == null) {
                return true;
            }
            for (int i8 = 0; i8 < optJSONArray.length(); i8++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i8);
                a(optJSONObject.optString("type"), optJSONObject.optString("owner"), optJSONObject.optString("url"));
            }
            return true;
        } catch (JSONException e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
