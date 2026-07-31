package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.od2;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import o2.C3345o;
import o2.InterfaceC3343n;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pd2 implements xp1<List<? extends bb2>> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3343n f30420a;

    pd2(C3345o c3345o) {
        this.f30420a = c3345o;
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(@NotNull hb2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        error.a();
        ap0.b(new Object[0]);
        if (this.f30420a.isActive()) {
            InterfaceC3343n interfaceC3343n = this.f30420a;
            Result.Companion companion = Result.Companion;
            interfaceC3343n.resumeWith(Result.m243constructorimpl(new od2.a(error)));
        }
    }

    @Override // com.yandex.mobile.ads.impl.xp1
    public final void a(List<? extends bb2> list) {
        List<? extends bb2> result = list;
        Intrinsics.checkNotNullParameter(result, "result");
        if (this.f30420a.isActive()) {
            InterfaceC3343n interfaceC3343n = this.f30420a;
            Result.Companion companion = Result.Companion;
            interfaceC3343n.resumeWith(Result.m243constructorimpl(new od2.b(result)));
        }
    }
}
