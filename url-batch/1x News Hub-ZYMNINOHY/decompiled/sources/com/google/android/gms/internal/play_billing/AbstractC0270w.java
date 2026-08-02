package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.play_billing.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0270w {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f2944a;

    /* renamed from: b, reason: collision with root package name */
    public int f2945b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2946c;

    public AbstractC0270w() {
        AbstractC0216d1.h(4, "initialCapacity");
        this.f2944a = new Object[4];
        this.f2945b = 0;
    }

    public static int b(int i3, int i4) {
        if (i4 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i4 <= i3) {
            return i3;
        }
        int i5 = i3 + (i3 >> 1) + 1;
        if (i5 < i4) {
            int highestOneBit = Integer.highestOneBit(i4 - 1);
            i5 = highestOneBit + highestOneBit;
        }
        if (i5 < 0) {
            return Integer.MAX_VALUE;
        }
        return i5;
    }

    public final void a(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f2944a;
        int i3 = this.f2945b;
        this.f2945b = i3 + 1;
        objArr[i3] = obj;
    }

    public final void c(int i3) {
        int length = this.f2944a.length;
        int b3 = b(length, this.f2945b + i3);
        if (b3 > length || this.f2946c) {
            this.f2944a = Arrays.copyOf(this.f2944a, b3);
            this.f2946c = false;
        }
    }
}
