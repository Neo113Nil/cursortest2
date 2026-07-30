package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.baidu.platform.comapi.map.MapBundleKey;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class x8 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray<w8> f3702a = new SparseArray<>();

    public SparseArray<w8> a() {
        return this.f3702a;
    }

    public static String a(Context context, String str) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(str), cn.hutool.core.util.l.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (IOException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    }
                    String sb2 = sb.toString();
                    try {
                        bufferedReader.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                    return sb2;
                } catch (Exception e9) {
                    e = e9;
                    e.printStackTrace();
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
    }

    public void a(String str, Context context) {
        String a8;
        boolean z7;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("file:///android_asset/")) {
            str = str.substring(22);
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            a8 = a(context, str + "dl_config.json");
            z7 = true;
        } else {
            a8 = a(new File(str, "dl_config.json"));
            z7 = false;
        }
        a(a8, str, z7);
    }

    public final void a(String str, String str2, boolean z7) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i8);
                int i9 = jSONObject.getInt("type");
                JSONArray jSONArray2 = jSONObject.getJSONArray("models");
                int length2 = jSONArray2.length();
                w8 w8Var = new w8();
                w8Var.f3619a = new String[length2];
                for (int i10 = 0; i10 < length2; i10++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i10);
                    int optInt = jSONObject2.optInt("model_type", i10);
                    File file = new File(str2, jSONObject2.getString(MapBundleKey.MapObjKey.OBJ_DIR));
                    String optString = jSONObject2.optString("design_model", "");
                    if (!TextUtils.isEmpty(optString)) {
                        file = new File(file, optString);
                    }
                    String absolutePath = file.getAbsolutePath();
                    if (z7) {
                        absolutePath = absolutePath.substring(1);
                    }
                    w8Var.f3619a[optInt] = absolutePath;
                }
                try {
                    this.f3702a.put(i9, w8Var);
                } catch (JSONException e8) {
                    e = e8;
                    e.printStackTrace();
                    return;
                }
            }
        } catch (JSONException e9) {
            e = e9;
        }
    }
}
