package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0795me {

    /* renamed from: a, reason: collision with root package name */
    public final int f12354a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final int f12355b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f12356c = 1;

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.f12354a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f12355b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f12356c;
        }
        throw new G1.a();
    }

    public final Boolean a(int i4) {
        if (i4 == this.f12355b) {
            return Boolean.FALSE;
        }
        if (i4 == this.f12356c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
