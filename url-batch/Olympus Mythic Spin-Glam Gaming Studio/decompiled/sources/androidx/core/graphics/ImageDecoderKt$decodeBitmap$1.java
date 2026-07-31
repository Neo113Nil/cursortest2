package androidx.core.graphics;

import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* compiled from: ImageDecoder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "decoder", "Landroid/graphics/ImageDecoder;", "info", "Landroid/graphics/ImageDecoder$ImageInfo;", "source", "Landroid/graphics/ImageDecoder$Source;", "onHeaderDecoded"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes15.dex */
public final class ImageDecoderKt$decodeBitmap$1 implements ImageDecoder$OnHeaderDecodedListener {
    final /* synthetic */ Function3 $action;

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        this.$action.invoke(imageDecoder, imageInfo, source);
    }
}
