package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class p20<T> {

    /* renamed from: a, reason: collision with root package name */
    private final String f10013a;

    /* renamed from: b, reason: collision with root package name */
    private final T f10014b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10015c;

    protected p20(String str, T t6, int i7) {
        this.f10013a = str;
        this.f10014b = t6;
        this.f10015c = i7;
    }

    public static p20<Double> a(String str, double d7) {
        return new p20<>(str, Double.valueOf(d7), 3);
    }

    public static p20<Long> b(String str, long j7) {
        return new p20<>(str, Long.valueOf(j7), 2);
    }

    public static p20<String> c(String str, String str2) {
        return new p20<>(str, str2, 4);
    }

    public static p20<Boolean> d(String str, boolean z6) {
        return new p20<>(str, Boolean.valueOf(z6), 1);
    }

    public final T e() {
        q30 a7 = s30.a();
        if (a7 != null) {
            int i7 = this.f10015c - 1;
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? (T) a7.b(this.f10013a, (String) this.f10014b) : (T) a7.a(this.f10013a, ((Double) this.f10014b).doubleValue()) : (T) a7.c(this.f10013a, ((Long) this.f10014b).longValue()) : (T) a7.d(this.f10013a, ((Boolean) this.f10014b).booleanValue());
        }
        if (s30.b() != null) {
            s30.b().zza();
        }
        return this.f10014b;
    }
}
