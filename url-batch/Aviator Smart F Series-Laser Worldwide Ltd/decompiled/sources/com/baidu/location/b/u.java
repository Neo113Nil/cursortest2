package com.baidu.location.b;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private static Object f4888a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static u f4889b;

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f4890c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f4891d = null;

    public u() {
        this.f4890c = null;
        if (com.baidu.location.f.getServiceContext() != null) {
            this.f4890c = a(com.baidu.location.f.getServiceContext());
        }
    }

    public synchronized long a(String str, long j8) {
        SharedPreferences sharedPreferences = this.f4890c;
        if (sharedPreferences != null) {
            try {
                j8 = sharedPreferences.getLong(str, j8);
            } catch (Exception unused) {
            }
        }
        return j8;
    }

    public SharedPreferences b(Context context) {
        if (this.f4891d == null && context != null) {
            try {
                this.f4891d = context.getSharedPreferences("MapCoreServicePregck", 0);
            } catch (Exception e8) {
                e8.printStackTrace();
                this.f4891d = null;
            }
        }
        return this.f4891d;
    }

    public static SharedPreferences a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences("MapCoreServicePreIA", 0);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public synchronized void b(String str, long j8) {
        SharedPreferences sharedPreferences = this.f4890c;
        if (sharedPreferences != null) {
            try {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putLong(str, j8);
                edit.commit();
            } catch (Exception unused) {
            }
        }
    }

    public static u a() {
        u uVar;
        synchronized (f4888a) {
            try {
                if (f4889b == null) {
                    f4889b = new u();
                }
                uVar = f4889b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public synchronized void b(String str, String str2) {
        SharedPreferences sharedPreferences = this.f4890c;
        if (sharedPreferences != null) {
            try {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(str, str2);
                edit.commit();
            } catch (Exception unused) {
            }
        }
    }

    public synchronized String a(String str, String str2) {
        SharedPreferences sharedPreferences = this.f4890c;
        if (sharedPreferences != null) {
            try {
                str2 = sharedPreferences.getString(str, str2);
            } catch (Exception unused) {
            }
        }
        return str2;
    }
}
