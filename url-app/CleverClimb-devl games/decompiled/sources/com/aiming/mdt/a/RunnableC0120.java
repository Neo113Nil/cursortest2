package com.aiming.mdt.a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.aiming.mdt.utils.C0282;

/* renamed from: com.aiming.mdt.a.ʼʽʿˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0120 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private /* synthetic */ Throwable f369;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ C0076 f370;

    RunnableC0120(C0076 c0076, Throwable th) {
        this.f370 = c0076;
        this.f369 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        SharedPreferences sharedPreferences4;
        if (this.f369 != null) {
            sharedPreferences = this.f370.f180;
            if (sharedPreferences == null) {
                return;
            }
            sharedPreferences2 = this.f370.f180;
            if (sharedPreferences2.getAll() != null) {
                sharedPreferences4 = this.f370.f180;
                if (sharedPreferences4.getAll().size() >= 10) {
                    return;
                }
            }
            try {
                String concat = "5.5.8:".concat(C0076.m230(this.f369));
                if (TextUtils.isEmpty(concat)) {
                    return;
                }
                sharedPreferences3 = this.f370.f180;
                SharedPreferences.Editor edit = sharedPreferences3.edit();
                edit.putString(Long.toString(System.currentTimeMillis()), concat.trim());
                edit.apply();
            } catch (Exception e) {
                C0282.m972("CrashUtil", e);
            }
        }
    }
}
