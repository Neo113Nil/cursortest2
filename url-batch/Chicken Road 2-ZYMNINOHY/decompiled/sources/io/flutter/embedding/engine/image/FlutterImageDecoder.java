package io.flutter.embedding.engine.image;

import android.graphics.Bitmap;
import android.os.Build;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class FlutterImageDecoder {

    public interface HeaderListener {
        void onImageHeader(int i4, int i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap decodeImage(ByteBuffer byteBuffer, HeaderListener headerListener) {
        ImageDecoderDefaultImpl imageDecoderDefaultImpl;
        Metadata create = Metadata.create(byteBuffer, headerListener);
        if (create.isHeif()) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 == 36) {
                imageDecoderDefaultImpl = new ImageDecoderHeifApi36Impl();
            } else if (i4 < 36) {
                imageDecoderDefaultImpl = new ImageDecoderHeifPre36Impl();
            }
            if (imageDecoderDefaultImpl == null) {
                imageDecoderDefaultImpl = new ImageDecoderDefaultImpl(headerListener);
            }
            return imageDecoderDefaultImpl.decodeImage(byteBuffer, create);
        }
        imageDecoderDefaultImpl = null;
        if (imageDecoderDefaultImpl == null) {
        }
        return imageDecoderDefaultImpl.decodeImage(byteBuffer, create);
    }
}
