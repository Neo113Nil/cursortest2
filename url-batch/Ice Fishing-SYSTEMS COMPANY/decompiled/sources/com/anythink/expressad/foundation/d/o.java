package com.anythink.expressad.foundation.d;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class o implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f19001a;

    /* renamed from: b, reason: collision with root package name */
    private String f19002b;

    /* renamed from: c, reason: collision with root package name */
    private int f19003c;

    private o(String str, String str2, int i) {
        this.f19002b = str;
        this.f19001a = str2;
        this.f19003c = i;
    }

    private String a() {
        return this.f19001a;
    }

    private String b() {
        return this.f19002b;
    }

    private void a(String str) {
        this.f19001a = str;
    }

    private void b(String str) {
        this.f19002b = str;
    }
}
