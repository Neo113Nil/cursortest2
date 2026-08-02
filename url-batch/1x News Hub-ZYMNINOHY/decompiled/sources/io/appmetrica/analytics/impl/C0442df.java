package io.appmetrica.analytics.impl;

import E1.AbstractC0033i;

/* renamed from: io.appmetrica.analytics.impl.df, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0442df {

    /* renamed from: a, reason: collision with root package name */
    public final String f7184a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7185b;

    public C0442df(String str, String str2) {
        this.f7184a = str;
        this.f7185b = a(str2);
    }

    public final String a(String str) {
        return str != null ? AbstractC0033i.m(new StringBuilder(), this.f7184a, str) : this.f7184a;
    }
}
