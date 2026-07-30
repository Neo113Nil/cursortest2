package com.google.android.exoplayer2.util;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.common.util.concurrent.ListenableFuture;

@Deprecated
/* loaded from: classes3.dex */
public interface BitmapLoader {
    ListenableFuture<Bitmap> decodeBitmap(byte[] bArr);

    ListenableFuture<Bitmap> loadBitmap(Uri uri);

    @Nullable
    ListenableFuture<Bitmap> loadBitmapFromMetadata(MediaMetadata mediaMetadata);
}
