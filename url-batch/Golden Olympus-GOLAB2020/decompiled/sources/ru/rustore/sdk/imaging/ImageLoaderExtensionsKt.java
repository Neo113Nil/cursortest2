package ru.rustore.sdk.imaging;

import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.imaging.internal.f;
import ru.rustore.sdk.imaging.internal.k;
import ru.rustore.sdk.imaging.model.ImageLoaderNotCreatedException;
import ru.rustore.sdk.imaging.model.ImageRequest;

@Metadata
/* loaded from: classes3.dex */
public final class ImageLoaderExtensionsKt {
    public static final void load(ImageView imageView, String url, Function1<? super ImageRequest.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(builder, "builder");
        k kVar = k.f43663m;
        if (kVar == null) {
            throw new ImageLoaderNotCreatedException("To get an instance of the ImageLoader, you must first initialize it", null, 2, null);
        }
        f fVar = (f) kVar.f43675l.getValue();
        fVar.getClass();
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ImageRequest.Builder builder2 = new ImageRequest.Builder(imageView, url);
        builder.invoke(builder2);
        fVar.a(builder2.build());
    }

    public static /* synthetic */ void load$default(ImageView imageView, String str, Function1 function1, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            function1 = ImageLoaderExtensionsKt$load$1.INSTANCE;
        }
        load(imageView, str, function1);
    }
}
