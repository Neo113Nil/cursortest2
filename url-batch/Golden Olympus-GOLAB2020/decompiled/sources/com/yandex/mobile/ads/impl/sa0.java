package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.qi0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sa0 extends kg2<ImageView, pa0> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final qi0 f31646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(@NotNull ImageView view, @NotNull qi0 imageProvider) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        this.f31646c = imageProvider;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(ImageView imageView, pa0 pa0Var) {
        ImageView view = imageView;
        pa0 feedbackValue = pa0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(feedbackValue, "feedbackValue");
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void b(ImageView imageView, pa0 pa0Var) {
        ImageView view = imageView;
        pa0 feedbackValue = pa0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(feedbackValue, "feedbackValue");
        ej0 a4 = feedbackValue.a();
        if (a4 == null) {
            return;
        }
        view.setForeground(null);
        view.setBackground(null);
        a(a4);
    }

    private final void a(ej0 ej0Var) {
        this.f31646c.a(ej0Var, new qi0.b() { // from class: com.yandex.mobile.ads.impl.Ed
            @Override // com.yandex.mobile.ads.impl.qi0.b
            public final void a(Bitmap bitmap) {
                sa0.a(sa0.this, bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(sa0 this$0, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (bitmap != null) {
            ImageView b4 = this$0.b();
            if (b4 != null) {
                b4.setImageBitmap(bitmap);
                return;
            }
            return;
        }
        ImageView b5 = this$0.b();
        if (b5 != null) {
            b5.setImageDrawable(androidx.core.content.a.g(b5.getContext(), R.drawable.monetization_ads_internal_default_adtune_feedback_icon));
        }
    }
}
