package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import android.view.TextureView;
import com.yandex.mobile.ads.impl.zh1;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class lf2 implements zh1.b {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private uy1 f28529a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private uy1 f28530b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    private TextureView f28531c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    private nf2 f28532d;

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void a(@NotNull rf2 videoSize) {
        Matrix a4;
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        int i4 = videoSize.f31177b;
        float f4 = videoSize.f31180e;
        if (f4 > 0.0f) {
            i4 = AbstractC3185a.c(i4 * f4);
        }
        uy1 uy1Var = new uy1(i4, videoSize.f31178c);
        this.f28529a = uy1Var;
        uy1 uy1Var2 = this.f28530b;
        nf2 nf2Var = this.f28532d;
        TextureView textureView = this.f28531c;
        if (uy1Var2 == null || nf2Var == null || textureView == null || (a4 = new mf2(uy1Var2, uy1Var).a(nf2Var)) == null) {
            return;
        }
        textureView.setTransform(a4);
    }

    @Override // com.yandex.mobile.ads.impl.zh1.b
    public final void onSurfaceSizeChanged(int i4, int i5) {
        Matrix a4;
        uy1 uy1Var = new uy1(i4, i5);
        this.f28530b = uy1Var;
        nf2 nf2Var = this.f28532d;
        uy1 uy1Var2 = this.f28529a;
        TextureView textureView = this.f28531c;
        if (uy1Var2 == null || nf2Var == null || textureView == null || (a4 = new mf2(uy1Var, uy1Var2).a(nf2Var)) == null) {
            return;
        }
        textureView.setTransform(a4);
    }

    public final void a(@Nullable nf2 nf2Var) {
        this.f28532d = nf2Var;
        TextureView textureView = this.f28531c;
        if (nf2Var == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }

    public final void a(@Nullable TextureView textureView) {
        this.f28531c = textureView;
        if (this.f28532d == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
    }
}
