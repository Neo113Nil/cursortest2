package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class mp3 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile mp3 f8669b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile mp3 f8670c;

    /* renamed from: d, reason: collision with root package name */
    static final mp3 f8671d = new mp3(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map<lp3, zp3<?, ?>> f8672a;

    mp3() {
        this.f8672a = new HashMap();
    }

    mp3(boolean z6) {
        this.f8672a = Collections.emptyMap();
    }

    public static mp3 a() {
        mp3 mp3Var = f8669b;
        if (mp3Var == null) {
            synchronized (mp3.class) {
                mp3Var = f8669b;
                if (mp3Var == null) {
                    mp3Var = f8671d;
                    f8669b = mp3Var;
                }
            }
        }
        return mp3Var;
    }

    public static mp3 b() {
        mp3 mp3Var = f8670c;
        if (mp3Var != null) {
            return mp3Var;
        }
        synchronized (mp3.class) {
            mp3 mp3Var2 = f8670c;
            if (mp3Var2 != null) {
                return mp3Var2;
            }
            mp3 b7 = vp3.b(mp3.class);
            f8670c = b7;
            return b7;
        }
    }

    public final <ContainingType extends kr3> zp3<ContainingType, ?> c(ContainingType containingtype, int i7) {
        return (zp3) this.f8672a.get(new lp3(containingtype, i7));
    }
}
