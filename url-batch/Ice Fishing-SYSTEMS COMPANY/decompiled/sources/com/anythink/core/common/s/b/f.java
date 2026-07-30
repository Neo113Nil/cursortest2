package com.anythink.core.common.s.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public class f implements com.anythink.core.common.s.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16565a = "f";

    /* renamed from: b, reason: collision with root package name */
    private final Context f16566b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16567c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16568d;

    public f(com.anythink.core.common.s.c cVar) {
        this.f16566b = cVar.a();
        this.f16567c = cVar.b();
        this.f16568d = cVar.d();
    }

    private static boolean a(int i) {
        return i != 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> V b(String str, V v6) {
        if (this.f16566b != null && !TextUtils.isEmpty(this.f16567c) && !TextUtils.isEmpty(str) && v6 != 0) {
            try {
                SharedPreferences sharedPreferences = this.f16566b.getSharedPreferences(this.f16567c, 0);
                return v6 instanceof String ? (V) sharedPreferences.getString(str, (String) v6) : v6 instanceof Integer ? (V) Integer.valueOf(sharedPreferences.getInt(str, ((Integer) v6).intValue())) : v6 instanceof Long ? (V) Long.valueOf(sharedPreferences.getLong(str, ((Long) v6).longValue())) : v6 instanceof Double ? (V) Double.valueOf(sharedPreferences.getFloat(str, Float.parseFloat(v6.toString()))) : v6 instanceof Float ? (V) Float.valueOf(sharedPreferences.getFloat(str, ((Float) v6).floatValue())) : v6 instanceof Boolean ? (V) Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) v6).booleanValue())) : v6;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return v6;
    }

    public final String c() {
        return this.f16567c;
    }

    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v6) {
        a(str, v6, this.f16568d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.anythink.core.common.s.a
    public final <V> void a(String str, V v6, int i) {
        if (this.f16566b == null || TextUtils.isEmpty(this.f16567c) || TextUtils.isEmpty(str) || v6 == 0) {
            return;
        }
        try {
            SharedPreferences.Editor edit = this.f16566b.getSharedPreferences(this.f16567c, 0).edit();
            String obj = v6.toString();
            if (v6 instanceof String) {
                edit.putString(str, (String) v6);
            } else if (v6 instanceof Integer) {
                edit.putInt(str, Integer.parseInt(obj));
            } else if (v6 instanceof Long) {
                edit.putLong(str, Long.parseLong(obj));
            } else if (v6 instanceof Double) {
                edit.putFloat(str, Float.parseFloat(obj));
            } else if (v6 instanceof Float) {
                edit.putFloat(str, Float.parseFloat(obj));
            } else if (v6 instanceof Boolean) {
                edit.putBoolean(str, Boolean.parseBoolean(obj));
            }
            if (a(i)) {
                edit.apply();
            } else {
                edit.commit();
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final void b(String str) {
        if (this.f16566b == null || TextUtils.isEmpty(this.f16567c)) {
            return;
        }
        try {
            SharedPreferences.Editor edit = this.f16566b.getSharedPreferences(this.f16567c, 0).edit();
            edit.remove(str);
            edit.apply();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final Map<String, Object> a() {
        if (this.f16566b != null && !TextUtils.isEmpty(this.f16567c)) {
            try {
                return this.f16566b.getSharedPreferences(this.f16567c, 0).getAll();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return null;
    }

    @Override // com.anythink.core.common.s.a
    public final void b() {
        if (this.f16566b == null || TextUtils.isEmpty(this.f16567c)) {
            return;
        }
        try {
            SharedPreferences.Editor edit = this.f16566b.getSharedPreferences(this.f16567c, 0).edit();
            edit.clear();
            edit.apply();
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    @Override // com.anythink.core.common.s.a
    public final boolean a(String str) {
        if (this.f16566b != null && !TextUtils.isEmpty(this.f16567c)) {
            try {
                return this.f16566b.getSharedPreferences(this.f16567c, 0).contains(str);
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return false;
    }
}
