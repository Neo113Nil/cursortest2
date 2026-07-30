package com.baidu.ar;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class jb {

    /* renamed from: a, reason: collision with root package name */
    public Map<String, String> f2614a;

    /* renamed from: b, reason: collision with root package name */
    public int f2615b;

    public static jb a() {
        jb jbVar = new jb();
        jbVar.f2614a = new HashMap();
        jbVar.f2615b = o.a();
        return jbVar;
    }

    public int b() {
        return this.f2615b;
    }

    public static jb a(Context context) {
        jb jbVar = new jb();
        SharedPreferences sharedPreferences = context.getSharedPreferences("ar_res_info", 0);
        String string = sharedPreferences.getString("res_version", "");
        jbVar.f2614a = new HashMap();
        if (!TextUtils.isEmpty(string)) {
            for (String str : string.split("\n")) {
                String trim = str.trim();
                int indexOf = trim.indexOf(cn.hutool.core.text.l.SPACE);
                if (indexOf > 0) {
                    jbVar.f2614a.put(trim.substring(0, indexOf).trim(), trim.substring(indexOf + 1).trim());
                }
            }
        }
        jbVar.f2615b = sharedPreferences.getInt("ar_sdk_version", 0);
        return jbVar;
    }

    public String a(String str) {
        return this.f2614a.get(str);
    }

    public static void a(Context context, jb jbVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("ar_res_info", 0).edit();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : jbVar.f2614a.entrySet()) {
            sb.append(entry.getKey() + cn.hutool.core.text.l.SPACE + entry.getValue() + "\n");
        }
        edit.putString("res_version", sb.toString());
        edit.putInt("ar_sdk_version", jbVar.f2615b);
        edit.apply();
    }

    public void a(String str, String str2) {
        this.f2614a.put(str, str2);
    }
}
