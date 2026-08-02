package io.flutter.embedding.engine.image;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
interface ImageDecoder {
    Bitmap decodeImage(ByteBuffer byteBuffer, Metadata metadata);
}
