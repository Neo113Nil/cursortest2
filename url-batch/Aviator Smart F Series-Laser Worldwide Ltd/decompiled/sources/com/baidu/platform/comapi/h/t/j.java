package com.baidu.platform.comapi.h.t;

import android.annotation.SuppressLint;
import android.os.Vibrator;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private Vibrator f9286a;

    static class b {

        /* renamed from: a, reason: collision with root package name */
        static j f9287a = new j();
    }

    @SuppressLint({"NewApi"})
    private boolean a() {
        Vibrator vibrator = this.f9286a;
        return vibrator != null && vibrator.hasVibrator();
    }

    public static j b() {
        return b.f9287a;
    }

    public void c() {
        Vibrator vibrator;
        try {
            this.f9286a = (Vibrator) com.baidu.platform.comapi.h.t.q.a.a().getSystemService("vibrator");
            if (a() && (vibrator = this.f9286a) != null) {
                vibrator.vibrate(500L);
            }
        } catch (Exception unused) {
        }
    }

    private j() {
    }
}
