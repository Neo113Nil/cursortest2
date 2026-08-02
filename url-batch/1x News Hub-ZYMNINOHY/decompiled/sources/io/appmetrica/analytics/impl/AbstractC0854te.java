package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.te, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0854te {

    /* renamed from: a, reason: collision with root package name */
    public final int f8366a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final int f8367b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f8368c = 1;

    public final int a(Boolean bool) {
        if (bool == null) {
            return this.f8366a;
        }
        if (bool.equals(Boolean.FALSE)) {
            return this.f8367b;
        }
        if (bool.equals(Boolean.TRUE)) {
            return this.f8368c;
        }
        throw new O0.b();
    }

    public final Boolean a(int i3) {
        if (i3 == this.f8367b) {
            return Boolean.FALSE;
        }
        if (i3 == this.f8368c) {
            return Boolean.TRUE;
        }
        return null;
    }
}
