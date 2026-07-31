package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class ef3 {

    /* renamed from: c, reason: collision with root package name */
    public static final ef3 f4595c = new ef3(0, 0, 1, 1, null);

    /* renamed from: d, reason: collision with root package name */
    public static final my3<ef3> f4596d = new my3() { // from class: com.google.android.gms.internal.ads.yw1
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f4597a = 1;

    /* renamed from: b, reason: collision with root package name */
    private AudioAttributes f4598b;

    /* synthetic */ ef3(int i7, int i8, int i9, int i10, zn2 zn2Var) {
    }

    public final AudioAttributes a() {
        if (this.f4598b == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            if (n13.f8865a >= 29) {
                usage.setAllowedCapturePolicy(1);
            }
            this.f4598b = usage.build();
        }
        return this.f4598b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ef3.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 15699889;
    }
}
