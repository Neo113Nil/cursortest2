package com.ironsource;

import com.ironsource.ai;

/* loaded from: classes2.dex */
public class qs implements ai.b {

    /* renamed from: a, reason: collision with root package name */
    private String f18884a;

    /* renamed from: b, reason: collision with root package name */
    private int f18885b;

    public qs(String str, int i4) {
        this.f18884a = str;
        this.f18885b = i4;
    }

    @Override // com.ironsource.ai.b
    public int b() {
        return this.f18885b;
    }

    @Override // com.ironsource.ai.b
    public String c() {
        return this.f18884a;
    }
}
