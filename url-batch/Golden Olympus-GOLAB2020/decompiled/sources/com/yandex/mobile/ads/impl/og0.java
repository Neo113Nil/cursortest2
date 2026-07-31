package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jh1;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class og0 extends w32 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ng0 f30021e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ug0 f30022f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og0(String str, ng0 ng0Var, ug0 ug0Var) {
        super(str, true);
        this.f30021e = ng0Var;
        this.f30022f = ug0Var;
    }

    @Override // com.yandex.mobile.ads.impl.w32
    public final long e() {
        try {
            this.f30021e.e().a(this.f30022f);
            return -1L;
        } catch (IOException e4) {
            int i4 = jh1.f27657c;
            jh1 a4 = jh1.a.a();
            String str = "Http2Connection.Listener failure for " + this.f30021e.c();
            a4.getClass();
            jh1.a(4, str, e4);
            try {
                this.f30022f.a(i50.f27091e, e4);
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }
}
