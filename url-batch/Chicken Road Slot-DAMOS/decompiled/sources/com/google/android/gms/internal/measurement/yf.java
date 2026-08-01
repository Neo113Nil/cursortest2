package com.google.android.gms.internal.measurement;

import java.util.HashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class yf {

    /* renamed from: a, reason: collision with root package name */
    public int f3018a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3019b;

    /* renamed from: c, reason: collision with root package name */
    public yf f3020c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f3021d = new HashMap(0);

    public yf(int i3, int i10) {
        if (i3 > i10) {
            throw new IllegalArgumentException();
        }
        this.f3018a = i3;
        this.f3019b = i10;
        this.f3020c = null;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        return v4.a.n(new StringBuilder(String.valueOf(identityHashCode).length() + 4), "Node", identityHashCode);
    }
}
