package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class YK {

    /* renamed from: a, reason: collision with root package name */
    public static volatile YK f28820a;

    /* renamed from: b, reason: collision with root package name */
    public static final YK f28821b;

    static {
        YK yk = new YK();
        Map map = Collections.EMPTY_MAP;
        f28821b = yk;
    }

    public static YK a() {
        YK yk = f28820a;
        if (yk != null) {
            return yk;
        }
        synchronized (YK.class) {
            try {
                YK yk2 = f28820a;
                if (yk2 != null) {
                    return yk2;
                }
                int i = KK.f25952a;
                YK r9 = AbstractC3035cL.r();
                f28820a = r9;
                return r9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
