package io.appmetrica.analytics.impl;

import E.AbstractC0005f;

/* loaded from: classes.dex */
public final class Ye {

    /* renamed from: a, reason: collision with root package name */
    public final String f11305a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11306b;

    public Ye(String str, String str2) {
        this.f11305a = str;
        this.f11306b = a(str2);
    }

    public final String a(String str) {
        return str != null ? AbstractC0005f.q(new StringBuilder(), this.f11305a, str) : this.f11305a;
    }
}
