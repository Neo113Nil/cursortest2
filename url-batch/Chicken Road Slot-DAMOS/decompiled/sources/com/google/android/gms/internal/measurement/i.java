package com.google.android.gms.internal.measurement;

import android.os.Build;
import dalvik.system.VMStack;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f2387b;

    static {
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
            h.class.getName().equals(a());
        } catch (Throwable unused) {
        }
        String str = Build.FINGERPRINT;
        if (str != null) {
            "robolectric".equals(str);
        }
        f2387b = new h1(4);
    }

    public static String a() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable unused) {
            return null;
        }
    }
}
