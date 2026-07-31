package androidx.media3.common.util;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;
import com.google.common.util.concurrent.ListenableFuture;

@UnstableApi
/* loaded from: classes10.dex */
public interface BitmapLoader {
    ListenableFuture decodeBitmap(byte[] bArr);

    ListenableFuture loadBitmap(Uri uri);

    boolean supportsMimeType(String str);

    @Nullable
    default ListenableFuture loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }
}
