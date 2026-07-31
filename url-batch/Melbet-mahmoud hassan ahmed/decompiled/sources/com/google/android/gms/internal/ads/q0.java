package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10494a;

    public q0(int i7) {
        this.f10494a = i7;
    }

    public static int a(int i7) {
        return (i7 >> 24) & 255;
    }

    public static String b(int i7) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i7 >> 24) & 255));
        sb.append((char) ((i7 >> 16) & 255));
        sb.append((char) ((i7 >> 8) & 255));
        sb.append((char) (i7 & 255));
        return sb.toString();
    }

    public String toString() {
        return b(this.f10494a);
    }
}
