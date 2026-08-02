package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class Fd extends AbstractC0416cf implements InterfaceC0990yl {
    public Fd(Oa oa, String str) {
        super(oa, str);
    }

    public final String c(String str, String str2) {
        return this.f7142a.getString(f(str), str2);
    }

    public final InterfaceC0990yl d(String str, String str2) {
        return (InterfaceC0990yl) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.f7142a.a(f(str));
    }

    public abstract String f(String str);

    public InterfaceC0990yl g(String str) {
        return (InterfaceC0990yl) d(f(str));
    }

    public Fd(Oa oa) {
        this(oa, null);
    }

    public final InterfaceC0990yl d(String str, int i3) {
        return (InterfaceC0990yl) b(f(str), i3);
    }

    public final int c(String str, int i3) {
        return this.f7142a.getInt(f(str), i3);
    }

    public final InterfaceC0990yl d(String str, long j3) {
        return (InterfaceC0990yl) b(f(str), j3);
    }

    public final InterfaceC0990yl d(String str, boolean z) {
        return (InterfaceC0990yl) b(f(str), z);
    }

    public final long c(String str, long j3) {
        return this.f7142a.getLong(f(str), j3);
    }

    public final boolean c(String str, boolean z) {
        return this.f7142a.getBoolean(f(str), z);
    }
}
