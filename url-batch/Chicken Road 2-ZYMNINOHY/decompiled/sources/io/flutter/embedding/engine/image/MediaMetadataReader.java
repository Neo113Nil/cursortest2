package io.flutter.embedding.engine.image;

import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import io.flutter.Log;
import java.io.IOException;

/* loaded from: classes.dex */
class MediaMetadataReader {
    private static final String TAG = "MediaMetadataReader";

    private static MediaExtractor getMediaExtractor(final byte[] bArr) throws IOException {
        MediaDataSource mediaDataSource = new MediaDataSource() { // from class: io.flutter.embedding.engine.image.MediaMetadataReader.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }

            @Override // android.media.MediaDataSource
            public long getSize() throws IOException {
                return bArr.length;
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j4, byte[] bArr2, int i4, int i5) throws IOException {
                byte[] bArr3 = bArr;
                if (j4 >= bArr3.length) {
                    return -1;
                }
                if (i5 + j4 > bArr3.length) {
                    i5 = (int) (bArr3.length - j4);
                }
                System.arraycopy(bArr3, (int) j4, bArr2, i4, i5);
                return i5;
            }
        };
        MediaExtractor mediaExtractor = new MediaExtractor();
        mediaExtractor.setDataSource(mediaDataSource);
        return mediaExtractor;
    }

    public static void read(byte[] bArr, Metadata metadata) {
        try {
            read(bArr, metadata, getMediaExtractor(bArr));
        } catch (Exception e4) {
            Log.e(TAG, "Failed to decode HEIF image using MediaExtractor", e4);
        }
    }

    public static void read(byte[] bArr, Metadata metadata, MediaExtractor mediaExtractor) {
        try {
            int trackCount = mediaExtractor.getTrackCount();
            for (int i4 = 0; i4 < trackCount; i4++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i4);
                String string = trackFormat.getString("mime");
                if (string != null && string.startsWith("image/")) {
                    int integer = trackFormat.containsKey("rotation-degrees") ? trackFormat.getInteger("rotation-degrees") : 0;
                    int i5 = metadata.originalWidth;
                    int i6 = metadata.originalHeight;
                    if (integer != 90 && integer != 270) {
                        i6 = i5;
                        i5 = i6;
                    }
                    metadata.height = i5;
                    metadata.width = i6;
                    metadata.rotation = integer;
                    return;
                }
            }
        } catch (Exception e4) {
            Log.e(TAG, "Failed to decode HEIF image using MediaExtractor", e4);
        }
    }
}
