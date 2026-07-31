package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zs2 {
    public static void a(Context context, boolean z6) {
        String sb;
        if (z6) {
            sb = "This request is sent from a test device.";
        } else {
            qw.b();
            String t6 = bo0.t(context);
            StringBuilder sb2 = new StringBuilder(String.valueOf(t6).length() + 102);
            sb2.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
            sb2.append(t6);
            sb2.append("\")) to get test ads on this device.");
            sb = sb2.toString();
        }
        io0.f(sb);
    }

    public static void b(int i7, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i7);
        io0.f(sb.toString());
        a3.r1.l(str, th);
        if (i7 == 3) {
            return;
        }
        y2.t.p().r(th, str);
    }
}
