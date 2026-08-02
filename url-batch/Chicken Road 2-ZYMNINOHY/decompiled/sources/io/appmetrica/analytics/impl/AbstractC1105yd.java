package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1105yd extends Xe implements InterfaceC1009ul {
    public AbstractC1105yd(Ha ha, String str) {
        super(ha, str);
    }

    public final String c(String str, String str2) {
        return this.f11265a.getString(f(str), str2);
    }

    public final InterfaceC1009ul d(String str, String str2) {
        return (InterfaceC1009ul) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.f11265a.a(f(str));
    }

    public abstract String f(String str);

    public InterfaceC1009ul g(String str) {
        return (InterfaceC1009ul) d(f(str));
    }

    public AbstractC1105yd(Ha ha) {
        this(ha, null);
    }

    public final InterfaceC1009ul d(String str, int i4) {
        return (InterfaceC1009ul) b(f(str), i4);
    }

    public final int c(String str, int i4) {
        return this.f11265a.getInt(f(str), i4);
    }

    public final InterfaceC1009ul d(String str, long j4) {
        return (InterfaceC1009ul) b(f(str), j4);
    }

    public final InterfaceC1009ul d(String str, boolean z) {
        return (InterfaceC1009ul) b(f(str), z);
    }

    public final long c(String str, long j4) {
        return this.f11265a.getLong(f(str), j4);
    }

    public final boolean c(String str, boolean z) {
        return this.f11265a.getBoolean(f(str), z);
    }
}
