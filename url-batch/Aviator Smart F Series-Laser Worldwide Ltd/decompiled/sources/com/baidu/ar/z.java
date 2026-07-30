package com.baidu.ar;

import android.os.Build;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public static Map<String, Integer> f3784a = new HashMap();

    public static Map<String, String> a() {
        try {
            HashMap hashMap = new HashMap();
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                String[] split = readLine.split(":");
                if (split.length > 1) {
                    String replace = split[0].trim().replace(cn.hutool.core.text.l.SPACE, "_");
                    if (replace.equals("model_name")) {
                        replace = "cpu_model";
                    }
                    String trim = split[1].trim();
                    if (replace.equals("cpu_model")) {
                        trim = trim.replaceAll("\\s+", cn.hutool.core.text.l.SPACE);
                    }
                    hashMap.put(replace, trim);
                }
            }
            bufferedReader.close();
            if (!hashMap.keySet().contains("Hardware")) {
                hashMap.put("Hardware", Build.HARDWARE);
            }
            h.b("DEVICE_INFO", (String) hashMap.get("Hardware"));
            return hashMap;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public static int b() {
        if (f3784a.size() <= 0) {
            a("{\n  \"high\": [\n    \"kirin990\",\n    \"qualcomm technologies, inc sdm855\",\n    \"qualcomm technologies, inc sm8150\",\n    \"kirin980\",\n    \"qualcomm technologies, inc sdm845\",\n    \"kirin810\",\n    \"kirin970\",\n    \"qualcomm technologies, inc sdm730\",\n    \"qualcomm technologies, inc msm8998\",\n    \"hi3660\",\n    \"qualcomm technologies, inc sdm712\",\n    \"kirin960\",\n    \"qualcomm technologies, inc sdm710\",\n    \"qualcomm technologies, inc sdm675\",\n    \"mt6799\",\n    \"mt6785\",\n    \"mt6779\",\n    \"qualcomm technologies, inc sdm670\",\n    \"qualcomm technologies, inc msm8996\",\n    \"mt6775\",\n    \"mt6771v/c\",\n    \"qualcomm technologies, inc sdm665\",\n    \"hisilicon kirin 955\",\n    \"qualcomm technologies, inc sdm660\"\n  ],\n  \"medium\": [\n    \"sailfish\",\n    \"qualcomm technologies, inc sdm636\",\n    \"hi3650\",\n    \"qualcomm technologies, inc msm8994\",\n    \"mt6797\",\n    \"mt6758\",\n    \"mt6763\",\n    \"mt6762\",\n    \"mt6757\",\n    \"mt6795\",\n    \"mt6755\",\n    \"qualcomm technologies, inc msm8976sg\",\n    \"qualcomm technologies, inc msm8976\",\n    \"qualcomm technologies, inc msm8965\",\n    \"qualcomm technologies, inc msm8956\",\n    \"qualcomm technologies, inc msm8992\",\n    \"hi3635\",\n    \"qualcomm technologies, inc 626\",\n    \"qualcomm technologies, inc msm8953\"\n  ],\n  \"low\": [\n    \"qualcomm technologies, inc msm8940\",\n    \"qualcomm technologies, inc msm8974\",\n    \"hi3630\"\n  ],\n  \"blackList\": []\n}");
        }
        String str = a().get("Hardware");
        if (!TextUtils.isEmpty(str)) {
            String trim = str.toLowerCase().replace("hisilicon", "").trim();
            if (f3784a.containsKey(trim)) {
                return f3784a.get(trim).intValue();
            }
        }
        return nc.i() ? 2 : 0;
    }

    public static void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("high");
            for (int i8 = 0; i8 < jSONArray.length(); i8++) {
                f3784a.put(jSONArray.get(i8).toString(), 2);
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray(FirebaseAnalytics.Param.MEDIUM);
            for (int i9 = 0; i9 < jSONArray2.length(); i9++) {
                f3784a.put(jSONArray2.get(i9).toString(), 1);
            }
            JSONArray jSONArray3 = jSONObject.getJSONArray("low");
            for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
                f3784a.put(jSONArray3.get(i10).toString(), 0);
            }
            JSONArray jSONArray4 = jSONObject.getJSONArray("blackList");
            for (int i11 = 0; i11 < jSONArray4.length(); i11++) {
                f3784a.put(jSONArray4.get(i11).toString(), -1);
            }
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }
}
