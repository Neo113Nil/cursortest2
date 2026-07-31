package ru.rustore.sdk.pay.internal;

import android.graphics.BitmapFactory;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.imaging.ImageLoaderExtensionsKt;
import ru.rustore.sdk.imaging.model.ImageRequest;
import ru.rustore.sdk.imaging.model.Transformation;

/* loaded from: classes3.dex */
public final class q6 {

    public static final class a extends kotlin.jvm.internal.s implements Function1<ImageRequest.Builder, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.core.graphics.drawable.d f44812a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f44813b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.core.graphics.drawable.d dVar, float f4) {
            super(1);
            this.f44812a = dVar;
            this.f44813b = f4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ImageRequest.Builder load = (ImageRequest.Builder) obj;
            Intrinsics.checkNotNullParameter(load, "$this$load");
            load.crossfade(true);
            load.placeholder(this.f44812a);
            load.error(this.f44812a);
            load.transformations(Transformation.Companion.roundedCorners(this.f44813b));
            return Unit.f41027a;
        }
    }

    public static /* synthetic */ void a(ImageView imageView, String str, Integer num, int i4) {
        if ((i4 & 2) != 0) {
            num = null;
        }
        a(imageView, str, num, 0.0f);
    }

    public static final void a(@NotNull ImageView imageView, @NotNull String imageUrl, @Nullable Integer num, float f4) {
        androidx.core.graphics.drawable.d dVar;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        if (num != null) {
            dVar = androidx.core.graphics.drawable.e.a(imageView.getResources(), BitmapFactory.decodeResource(imageView.getResources(), num.intValue()));
            dVar.f(f4);
        } else {
            dVar = null;
        }
        if (imageUrl.length() == 0) {
            imageView.setImageDrawable(dVar);
        } else {
            ImageLoaderExtensionsKt.load(imageView, imageUrl, new a(dVar, f4));
        }
    }
}
