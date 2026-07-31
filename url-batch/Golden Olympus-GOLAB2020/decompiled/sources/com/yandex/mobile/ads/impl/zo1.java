package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.C1836bl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zo1 implements C1836bl.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ap1 f35650a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ mb1 f35651b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bp1 f35652c;

    zo1(ap1 ap1Var, mb1 mb1Var, bp1 bp1Var) {
        this.f35650a = ap1Var;
        this.f35651b = mb1Var;
        this.f35652c = bp1Var;
    }

    @Override // com.yandex.mobile.ads.impl.C1836bl.b
    public final void a(@NotNull Bitmap bitmap) {
        yo1 yo1Var;
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        yo1Var = this.f35650a.f23400d;
        mb1 mb1Var = this.f35651b;
        bp1 bp1Var = this.f35652c;
        yo1Var.getClass();
        yo1.a(mb1Var, bp1Var, bitmap);
    }
}
