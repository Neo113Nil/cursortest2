package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.bn0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class cn0 implements nj0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bn0 f24264a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List<C2276uf<?>> f24265b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ zi0 f24266c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bn0.a f24267d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ob2<on0> f24268e;

    cn0(bn0 bn0Var, List list, zi0 zi0Var, mn0 mn0Var, ob2 ob2Var) {
        this.f24264a = bn0Var;
        this.f24265b = list;
        this.f24266c = zi0Var;
        this.f24267d = mn0Var;
        this.f24268e = ob2Var;
    }

    @Override // com.yandex.mobile.ads.impl.nj0
    public final void a(@NotNull String url, @NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
    }

    @Override // com.yandex.mobile.ads.impl.nj0
    public final void a(@NotNull Map<String, Bitmap> images) {
        C2105n4 c2105n4;
        C2140og c2140og;
        jj0 jj0Var;
        Intrinsics.checkNotNullParameter(images, "images");
        c2105n4 = this.f24264a.f23875b;
        c2105n4.a(EnumC2082m4.f28858o);
        c2140og = this.f24264a.f23876c;
        ArrayList a4 = c2140og.a(this.f24265b, images);
        jj0Var = this.f24264a.f23877d;
        jj0Var.a(a4, images);
        this.f24266c.a(images);
        this.f24267d.h(this.f24268e);
    }
}
