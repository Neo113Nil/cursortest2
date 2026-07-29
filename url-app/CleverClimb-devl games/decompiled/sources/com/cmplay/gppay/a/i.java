package com.cmplay.gppay.a;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f4100a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences.Editor f4101b;

    public i(Context context, String str) {
        this.f4100a = context.getSharedPreferences(str, 0);
        this.f4101b = this.f4100a.edit();
    }

    public void a(String str, Object obj) {
        SharedPreferences.Editor editor;
        String obj2;
        if (!(obj instanceof String)) {
            if (obj instanceof Integer) {
                this.f4101b.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Boolean) {
                this.f4101b.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Float) {
                this.f4101b.putFloat(str, ((Float) obj).floatValue());
            } else if (obj instanceof Long) {
                this.f4101b.putLong(str, ((Long) obj).longValue());
            } else {
                editor = this.f4101b;
                obj2 = obj.toString();
            }
            this.f4101b.commit();
        }
        editor = this.f4101b;
        obj2 = (String) obj;
        editor.putString(str, obj2);
        this.f4101b.commit();
    }
}
