package com.baidu.ar;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.UUID;

/* loaded from: classes.dex */
public final class h3 {

    /* renamed from: a, reason: collision with root package name */
    public static UUID f2358a;

    public h3(Context context) {
        if (f2358a == null) {
            synchronized (h3.class) {
                try {
                    if (f2358a == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("bd_plugin_ar_device_id.xml", 0);
                        String string = sharedPreferences.getString("device_id", null);
                        if (string != null) {
                            f2358a = UUID.fromString(string);
                        } else {
                            String string2 = Settings.Secure.getString(context.getContentResolver(), "android_id");
                            try {
                                if (!"9774d56d682e549c".equals(string2) && !TextUtils.isEmpty(string2)) {
                                    f2358a = UUID.nameUUIDFromBytes(string2.getBytes("utf8"));
                                }
                                if (f2358a != null) {
                                    sharedPreferences.edit().putString("device_id", f2358a.toString()).apply();
                                }
                            } catch (UnsupportedEncodingException e8) {
                                throw new RuntimeException(e8);
                            }
                        }
                    }
                } finally {
                }
            }
        }
    }

    public UUID a() {
        return f2358a;
    }
}
