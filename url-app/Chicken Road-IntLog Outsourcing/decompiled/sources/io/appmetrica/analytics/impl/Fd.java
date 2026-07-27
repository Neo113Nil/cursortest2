package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Fd extends AbstractC0567cf implements InterfaceC1141yl {
    public Fd(Oa oa, String str) {
        super(oa, str);
    }

    public final String c(String str, String str2) {
        return this.f7998a.getString(f(str), str2);
    }

    public final InterfaceC1141yl d(String str, String str2) {
        return (InterfaceC1141yl) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.f7998a.a(f(str));
    }

    public abstract String f(String str);

    public InterfaceC1141yl g(String str) {
        return (InterfaceC1141yl) d(f(str));
    }

    public Fd(Oa oa) {
        this(oa, null);
    }

    public final InterfaceC1141yl d(String str, int i2) {
        return (InterfaceC1141yl) b(f(str), i2);
    }

    public final int c(String str, int i2) {
        return this.f7998a.getInt(f(str), i2);
    }

    public final InterfaceC1141yl d(String str, long j2) {
        return (InterfaceC1141yl) b(f(str), j2);
    }

    public final InterfaceC1141yl d(String str, boolean z) {
        return (InterfaceC1141yl) b(f(str), z);
    }

    public final long c(String str, long j2) {
        return this.f7998a.getLong(f(str), j2);
    }

    public final boolean c(String str, boolean z) {
        return this.f7998a.getBoolean(f(str), z);
    }
}
