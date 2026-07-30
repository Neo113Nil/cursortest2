package com.baidu.ar;

import android.content.Context;
import android.os.Vibrator;

/* loaded from: classes.dex */
public class wd {

    /* renamed from: b, reason: collision with root package name */
    public static wd f3632b;

    /* renamed from: a, reason: collision with root package name */
    public Vibrator f3633a;

    public wd(Context context) {
        this.f3633a = (Vibrator) context.getSystemService("vibrator");
    }

    public static synchronized wd a(Context context) {
        wd wdVar;
        synchronized (wd.class) {
            try {
                if (f3632b == null) {
                    f3632b = new wd(context);
                }
                wdVar = f3632b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wdVar;
    }

    public void a(long j8) {
        this.f3633a.vibrate(j8);
    }

    public void a(long[] jArr) {
        this.f3633a.vibrate(jArr, -1);
    }
}
