package io.flutter.embedding.engine.image;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
class ImageDecoderHeifPre36Impl extends ImageDecoderDefaultImpl {
    private static final String TAG = "FlutterImageDecoderImplHeifPre36";

    public ImageDecoderHeifPre36Impl() {
        super(null);
    }

    @Override // io.flutter.embedding.engine.image.ImageDecoderDefaultImpl, io.flutter.embedding.engine.image.ImageDecoder
    public Bitmap decodeImage(ByteBuffer byteBuffer, Metadata metadata) {
        return ImageUtils.applyFlipIfNeeded(super.decodeImage(byteBuffer, metadata), metadata.orientation);
    }
}
