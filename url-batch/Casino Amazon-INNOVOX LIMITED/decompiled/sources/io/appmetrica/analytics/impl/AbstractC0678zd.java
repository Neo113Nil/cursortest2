package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0678zd extends Ye implements InterfaceC0586vl {
    public AbstractC0678zd(Ia ia, String str) {
        super(ia, str);
    }

    public final String c(String str, String str2) {
        return this.f1131a.getString(f(str), str2);
    }

    public final InterfaceC0586vl d(String str, String str2) {
        return (InterfaceC0586vl) b(f(str), str2);
    }

    public final boolean e(String str) {
        return this.f1131a.a(f(str));
    }

    public abstract String f(String str);

    public InterfaceC0586vl g(String str) {
        return (InterfaceC0586vl) d(f(str));
    }

    public AbstractC0678zd(Ia ia) {
        this(ia, null);
    }

    public final InterfaceC0586vl d(String str, int i) {
        return (InterfaceC0586vl) b(f(str), i);
    }

    public final int c(String str, int i) {
        return this.f1131a.getInt(f(str), i);
    }

    public final InterfaceC0586vl d(String str, long j) {
        return (InterfaceC0586vl) b(f(str), j);
    }

    public final InterfaceC0586vl d(String str, boolean z) {
        return (InterfaceC0586vl) b(f(str), z);
    }

    public final long c(String str, long j) {
        return this.f1131a.getLong(f(str), j);
    }

    public final boolean c(String str, boolean z) {
        return this.f1131a.getBoolean(f(str), z);
    }
}
