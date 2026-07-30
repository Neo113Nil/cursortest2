package com.baidu.platform.comapi.c.a;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private final c f8995a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8996b;

    public a(b bVar, String str) {
        this.f8995a = c.a(bVar);
        this.f8996b = str;
    }

    public int a(int i8) {
        a();
        return this.f8995a.a(this.f8996b, i8);
    }

    public void b(int i8) {
        a();
        this.f8995a.b(this.f8996b, i8);
    }

    private void a() {
        if (TextUtils.isEmpty(this.f8996b)) {
            throw new IllegalArgumentException();
        }
    }

    public void b() {
        a();
        this.f8995a.a(this.f8996b);
    }
}
