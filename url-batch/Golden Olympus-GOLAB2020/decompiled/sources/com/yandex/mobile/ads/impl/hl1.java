package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.qi0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class hl1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ab2 f26791a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final qi0 f26792b;

    private static final class a implements qi0.b {

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ m2.h[] f26793c = {C1873da.a(a.class, "preview", "getPreview()Landroid/widget/ImageView;", 0), C1873da.a(a.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0)};

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final ao1 f26794a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ao1 f26795b;

        public a(@NotNull ImageView preview, @NotNull ProgressBar progressBar) {
            Intrinsics.checkNotNullParameter(preview, "preview");
            Intrinsics.checkNotNullParameter(progressBar, "progressBar");
            this.f26794a = bo1.a(preview);
            this.f26795b = bo1.a(progressBar);
        }

        @Override // com.yandex.mobile.ads.impl.qi0.b
        public final void a(@Nullable Bitmap bitmap) {
            if (bitmap == null) {
                ProgressBar progressBar = (ProgressBar) this.f26795b.getValue(this, f26793c[1]);
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                    return;
                }
                return;
            }
            ao1 ao1Var = this.f26794a;
            m2.h[] hVarArr = f26793c;
            ImageView imageView = (ImageView) ao1Var.getValue(this, hVarArr[0]);
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                imageView.setVisibility(0);
            } else {
                ProgressBar progressBar2 = (ProgressBar) this.f26795b.getValue(this, hVarArr[1]);
                if (progressBar2 != null) {
                    progressBar2.setVisibility(0);
                }
            }
        }
    }

    public hl1(@NotNull ab2 video, @NotNull qi0 imageForPresentProvider) {
        Intrinsics.checkNotNullParameter(video, "video");
        Intrinsics.checkNotNullParameter(imageForPresentProvider, "imageForPresentProvider");
        this.f26791a = video;
        this.f26792b = imageForPresentProvider;
    }

    public final void a(@NotNull pe2 placeholderView) {
        Intrinsics.checkNotNullParameter(placeholderView, "placeholderView");
        ImageView a4 = placeholderView.a();
        ProgressBar b4 = placeholderView.b();
        if (a4 == null || this.f26791a.a() == null) {
            b4.setVisibility(0);
        } else {
            this.f26792b.a(this.f26791a.a(), new a(a4, b4));
        }
    }
}
