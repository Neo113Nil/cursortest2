package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.qq1;
import java.io.UnsupportedEncodingException;

/* loaded from: classes3.dex */
public final class t22 extends op1<String> {

    /* renamed from: s, reason: collision with root package name */
    private final Object f32139s;

    /* renamed from: t, reason: collision with root package name */
    private qq1.b<String> f32140t;

    public t22(String str, qq1.b bVar, qq1.a aVar) {
        super(0, str, aVar);
        this.f32139s = new Object();
        this.f32140t = bVar;
    }

    @Override // com.yandex.mobile.ads.impl.op1
    public final void a() {
        super.a();
        synchronized (this.f32139s) {
            this.f32140t = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    protected final void a(String str) {
        qq1.b<String> bVar;
        String str2 = str;
        synchronized (this.f32139s) {
            bVar = this.f32140t;
        }
        if (bVar != null) {
            bVar.a(str2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.op1
    protected final qq1<String> a(lc1 lc1Var) {
        String str;
        try {
            str = new String(lc1Var.f28506b, ch0.a(lc1Var.f28507c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(lc1Var.f28506b);
        }
        return qq1.a(str, ch0.a(lc1Var));
    }
}
