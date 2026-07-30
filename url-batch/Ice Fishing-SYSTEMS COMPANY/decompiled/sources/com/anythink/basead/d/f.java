package com.anythink.basead.d;

import t0.AbstractC5051n;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    protected String f6301a;

    /* renamed from: b, reason: collision with root package name */
    protected String f6302b;

    public f(String str, String str2) {
        this.f6301a = str;
        this.f6302b = str2;
    }

    public final String a() {
        return this.f6301a;
    }

    public final String b() {
        return this.f6302b;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder("code[ ");
        sb.append(this.f6301a);
        sb.append(" ],desc[ ");
        return AbstractC5051n.g(sb, this.f6302b, " ]");
    }
}
