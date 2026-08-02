package io.flutter.embedding.engine.image;

import O.c;
import O.g;
import io.flutter.Log;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* loaded from: classes.dex */
class ExifMetadataReader {
    private static final String TAG = "ExifMetadataReader";

    public static void read(byte[] bArr, Metadata metadata) {
        int e4;
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                g gVar = new g(byteArrayInputStream);
                c c4 = gVar.c("Orientation");
                if (c4 != null) {
                    try {
                        e4 = c4.e(gVar.f1995e);
                    } catch (NumberFormatException unused) {
                    }
                    metadata.orientation = e4;
                    byteArrayInputStream.close();
                }
                e4 = 1;
                metadata.orientation = e4;
                byteArrayInputStream.close();
            } finally {
            }
        } catch (IOException e5) {
            Log.e(TAG, "Failed to read EXIF metadata", e5);
        }
    }
}
