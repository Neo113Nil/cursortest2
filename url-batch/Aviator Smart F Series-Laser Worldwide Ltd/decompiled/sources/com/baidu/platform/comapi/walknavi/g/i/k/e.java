package com.baidu.platform.comapi.walknavi.g.i.k;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    protected static UUID f10075a;

    public e(Context context) {
        try {
            if (f10075a != null || context == null) {
                return;
            }
            synchronized (e.class) {
                try {
                    if (f10075a == null) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("bd_plugin_ar_device_id.xml", 0);
                        String string = sharedPreferences.getString("device_id", null);
                        if (string != null) {
                            f10075a = UUID.fromString(string);
                        } else {
                            f10075a = UUID.randomUUID();
                            sharedPreferences.edit().putString("device_id", f10075a.toString()).commit();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e8) {
            a.a("DeviceUuidFactory exception: " + e8.getMessage());
        }
    }

    public UUID a() {
        return f10075a;
    }
}
