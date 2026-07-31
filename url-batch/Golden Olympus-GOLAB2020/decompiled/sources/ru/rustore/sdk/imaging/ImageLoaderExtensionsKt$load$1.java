package ru.rustore.sdk.imaging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ru.rustore.sdk.imaging.model.ImageRequest;

@Metadata
/* loaded from: classes3.dex */
public final class ImageLoaderExtensionsKt$load$1 extends s implements Function1<ImageRequest.Builder, Unit> {
    public static final ImageLoaderExtensionsKt$load$1 INSTANCE = new ImageLoaderExtensionsKt$load$1();

    public ImageLoaderExtensionsKt$load$1() {
        super(1);
    }

    public final void invoke(ImageRequest.Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ImageRequest.Builder) obj);
        return Unit.f41027a;
    }
}
