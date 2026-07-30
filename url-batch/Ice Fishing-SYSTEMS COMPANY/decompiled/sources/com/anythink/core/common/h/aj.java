package com.anythink.core.common.h;

/* loaded from: classes.dex */
public final class aj {

    /* renamed from: a, reason: collision with root package name */
    private String f13647a;

    /* renamed from: b, reason: collision with root package name */
    private int f13648b;

    /* renamed from: c, reason: collision with root package name */
    private long f13649c;

    /* renamed from: d, reason: collision with root package name */
    private long f13650d;

    private aj() {
    }

    public static aj a(String str, int i) {
        aj ajVar = new aj();
        ajVar.f13647a = str;
        ajVar.f13648b = i;
        return ajVar;
    }

    public final long b() {
        return this.f13649c;
    }

    public final String c() {
        String str = this.f13647a;
        return str == null ? "" : str;
    }

    public final int d() {
        return this.f13648b;
    }

    public final String toString() {
        return "DynWFAdSourceFilterEntity{adSourceId='" + this.f13647a + "', filterReason=" + this.f13648b + ", reqLimitIntervalTime=" + this.f13649c + ", reqLimitEndTime=" + this.f13650d + '}';
    }

    public final void a(long j9) {
        this.f13649c = j9;
        if (j9 > 0) {
            this.f13650d = System.currentTimeMillis() + j9;
        }
    }

    public final long a() {
        return this.f13650d;
    }
}
