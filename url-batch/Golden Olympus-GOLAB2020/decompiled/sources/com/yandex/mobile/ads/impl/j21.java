package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.mobile.ads.impl.au0;
import com.yandex.mobile.ads.impl.lj2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class j21 extends qf1 {

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final a21 f27444k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private lj2 f27445l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final n21 f27446m;

    /* renamed from: n, reason: collision with root package name */
    @NotNull
    private au0 f27447n;

    public interface a {
        void a();

        void b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j21(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        a21 a21Var = new a21();
        this.f27444k = a21Var;
        this.f27445l = lj2.c.f28624a;
        this.f27446m = new n21(this, a21Var);
        this.f27447n = new gy1();
    }

    public final void a(@NotNull String htmlResponse, @Nullable a aVar) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        if (this.f27445l instanceof lj2.c) {
            this.f27445l = new lj2.b(aVar);
            this.f27446m.b(htmlResponse);
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1
    public final void h() {
        this.f27446m.b();
    }

    @NotNull
    public final a21 k() {
        return this.f27444k;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected final void onMeasure(int i4, int i5) {
        au0.a a4 = this.f27447n.a(i4, i5);
        super.onMeasure(a4.f23449a, a4.f23450b);
    }

    public final void setAspectRatio(float f4) {
        this.f27447n = new fm1(f4);
    }

    public final void setClickListener(@NotNull io clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f27446m.a(clickListener);
    }

    public final void setPreloadingState(@NotNull lj2 lj2Var) {
        Intrinsics.checkNotNullParameter(lj2Var, "<set-?>");
        this.f27445l = lj2Var;
    }

    @Override // com.yandex.mobile.ads.impl.qf1, com.yandex.mobile.ads.impl.hg0
    public final void a() {
        super.a();
        lj2 lj2Var = this.f27445l;
        lj2.b bVar = lj2Var instanceof lj2.b ? (lj2.b) lj2Var : null;
        if (bVar != null) {
            a a4 = bVar.a();
            if (a4 != null) {
                a4.b();
            }
            this.f27445l = lj2.a.f28622a;
        }
    }

    @Override // com.yandex.mobile.ads.impl.qf1, com.yandex.mobile.ads.impl.hg0
    public final void a(int i4) {
        super.a(i4);
        lj2 lj2Var = this.f27445l;
        lj2.b bVar = lj2Var instanceof lj2.b ? (lj2.b) lj2Var : null;
        if (bVar != null) {
            a a4 = bVar.a();
            if (a4 != null) {
                a4.a();
            }
            stopLoading();
            this.f27445l = lj2.c.f28624a;
        }
    }
}
