package com.yandex.div.core.images;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class CachedBitmap {

    @NonNull
    private final Bitmap mBitmap;
    private final byte[] mBytes;
    private final Uri mCacheUri;

    @NonNull
    private final BitmapSource mFrom;

    public CachedBitmap(@NonNull Bitmap bitmap, Uri uri, @NonNull BitmapSource bitmapSource) {
        this(bitmap, null, uri, bitmapSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CachedBitmap cachedBitmap = (CachedBitmap) obj;
            if (!this.mBitmap.equals(cachedBitmap.getBitmap()) || this.mFrom != cachedBitmap.getFrom()) {
                return false;
            }
            Uri cacheUri = cachedBitmap.getCacheUri();
            Uri uri = this.mCacheUri;
            if (uri != null) {
                return uri.equals(cacheUri);
            }
            if (cacheUri == null) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public byte[] getBytes() {
        return this.mBytes;
    }

    public Uri getCacheUri() {
        return this.mCacheUri;
    }

    @NonNull
    public BitmapSource getFrom() {
        return this.mFrom;
    }

    public int hashCode() {
        int hashCode = ((this.mBitmap.hashCode() * 31) + this.mFrom.hashCode()) * 31;
        Uri uri = this.mCacheUri;
        return hashCode + (uri != null ? uri.hashCode() : 0);
    }

    public CachedBitmap(@NonNull Bitmap bitmap, byte[] bArr, Uri uri, @NonNull BitmapSource bitmapSource) {
        this.mBitmap = bitmap;
        this.mCacheUri = uri;
        this.mBytes = bArr;
        this.mFrom = bitmapSource;
    }
}
