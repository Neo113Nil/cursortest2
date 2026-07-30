package com.anythink.core.common.m.d;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: a, reason: collision with root package name */
    String f14748a;

    /* renamed from: c, reason: collision with root package name */
    int f14750c;

    /* renamed from: l, reason: collision with root package name */
    private final String f14751l = "c";

    /* renamed from: b, reason: collision with root package name */
    boolean f14749b = true;

    public c(String str, int i) {
        this.f14750c = 1;
        this.f14748a = str;
        if (i == 1000) {
            this.f14750c = 1;
        } else if (i == 1001) {
            this.f14750c = 2;
        }
    }

    @Override // com.anythink.core.common.m.d.d
    public final void a(String str, String str2, String str3, int i) {
    }

    @Override // com.anythink.core.common.m.d.d
    public final int c() {
        return this.f14750c;
    }

    @Override // com.anythink.core.common.m.d.d
    public final int d() {
        return 3;
    }

    @Override // com.anythink.core.common.m.d.d
    public final byte[] e() {
        return !TextUtils.isEmpty(this.f14748a) ? d.a(this.f14748a) : new byte[0];
    }

    @Override // com.anythink.core.common.m.d.d
    public final boolean f() {
        return this.f14749b;
    }
}
