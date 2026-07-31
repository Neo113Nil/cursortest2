package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.qi0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mj0 extends kg2<ImageView, ej0> {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final zi0 f29124c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final qi0 f29125d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final ij0 f29126e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final a02 f29127f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ mj0(ImageView imageView, zi0 zi0Var, C2360y7 c2360y7) {
        this(imageView, zi0Var, c2360y7, new qi0(r0, new r81(c2360y7), zi0Var), new ij0(zi0Var), new a02());
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void a(ImageView imageView) {
        ImageView view = imageView;
        Intrinsics.checkNotNullParameter(view, "view");
        view.setImageDrawable(null);
        this.f29127f.a(view);
        super.a((mj0) view);
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final void b(ImageView imageView, ej0 ej0Var) {
        ImageView view = imageView;
        ej0 imageValue = ej0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        a(imageValue);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(@NotNull ImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setImageDrawable(null);
        this.f29127f.a(view);
        super.a((mj0) view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj0(@NotNull ImageView view, @NotNull zi0 imageProvider, @NotNull C2360y7<?> adResponse, @NotNull qi0 imageForPresentProvider, @NotNull ij0 imageValueValidator, @NotNull a02 smartCenterImageRenderer) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(imageForPresentProvider, "imageForPresentProvider");
        Intrinsics.checkNotNullParameter(imageValueValidator, "imageValueValidator");
        Intrinsics.checkNotNullParameter(smartCenterImageRenderer, "smartCenterImageRenderer");
        this.f29124c = imageProvider;
        this.f29125d = imageForPresentProvider;
        this.f29126e = imageValueValidator;
        this.f29127f = smartCenterImageRenderer;
    }

    @Override // com.yandex.mobile.ads.impl.kg2
    public final boolean a(ImageView imageView, ej0 ej0Var) {
        ImageView imageView2 = imageView;
        ej0 imageValue = ej0Var;
        Intrinsics.checkNotNullParameter(imageView2, "imageView");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        return this.f29126e.a(imageView2.getDrawable(), imageValue);
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    public final void a2(@NotNull ImageView view, @NotNull ej0 imageValue) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(imageValue, "imageValue");
        a(imageValue);
    }

    private final void a(final ej0 ej0Var) {
        this.f29125d.a(ej0Var, new qi0.b() { // from class: com.yandex.mobile.ads.impl.W9
            @Override // com.yandex.mobile.ads.impl.qi0.b
            public final void a(Bitmap bitmap) {
                mj0.a(mj0.this, ej0Var, bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(mj0 this$0, ej0 imageValue, Bitmap bitmap) {
        ImageView b4;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(imageValue, "$imageValue");
        if (bitmap == null || (b4 = this$0.b()) == null) {
            return;
        }
        if (imageValue.e() != null) {
            this$0.f29127f.a(bitmap, b4, imageValue);
        } else {
            b4.setImageBitmap(bitmap);
        }
    }
}
