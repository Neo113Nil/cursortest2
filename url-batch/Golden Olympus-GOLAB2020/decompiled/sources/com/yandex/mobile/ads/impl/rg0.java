package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;

/* loaded from: classes3.dex */
public final class rg0 extends w32 {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ng0 f31182e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f31183f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3372e f31184g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f31185h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg0(String str, ng0 ng0Var, int i4, C3372e c3372e, int i5, boolean z4) {
        super(str, true);
        this.f31182e = ng0Var;
        this.f31183f = i4;
        this.f31184g = c3372e;
        this.f31185h = i5;
    }

    @Override // com.yandex.mobile.ads.impl.w32
    public final long e() {
        try {
            wm1 wm1Var = this.f31182e.f29582l;
            C3372e source = this.f31184g;
            int i4 = this.f31185h;
            ((vm1) wm1Var).getClass();
            Intrinsics.checkNotNullParameter(source, "source");
            source.H(i4);
            this.f31182e.k().a(this.f31183f, i50.f27095i);
            synchronized (this.f31182e) {
                this.f31182e.f29570B.remove(Integer.valueOf(this.f31183f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
