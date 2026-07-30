package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public final class o implements d {
    final LruCache<String, b> cache;

    class a extends LruCache {
        a(int i8) {
            super(i8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        public int sizeOf(String str, b bVar) {
            return bVar.byteCount;
        }
    }

    static final class b {
        final Bitmap bitmap;
        final int byteCount;

        b(Bitmap bitmap, int i8) {
            this.bitmap = bitmap;
            this.byteCount = i8;
        }
    }

    public o(@NonNull Context context) {
        this(d0.calculateMemoryCacheSize(context));
    }

    @Override // com.squareup.picasso.d
    public void clear() {
        this.cache.evictAll();
    }

    @Override // com.squareup.picasso.d
    public void clearKeyUri(String str) {
        for (String str2 : this.cache.snapshot().keySet()) {
            if (str2.startsWith(str) && str2.length() > str.length() && str2.charAt(str.length()) == '\n') {
                this.cache.remove(str2);
            }
        }
    }

    public int evictionCount() {
        return this.cache.evictionCount();
    }

    @Override // com.squareup.picasso.d
    @Nullable
    public Bitmap get(@NonNull String str) {
        b bVar = this.cache.get(str);
        if (bVar != null) {
            return bVar.bitmap;
        }
        return null;
    }

    public int hitCount() {
        return this.cache.hitCount();
    }

    @Override // com.squareup.picasso.d
    public int maxSize() {
        return this.cache.maxSize();
    }

    public int missCount() {
        return this.cache.missCount();
    }

    public int putCount() {
        return this.cache.putCount();
    }

    @Override // com.squareup.picasso.d
    public void set(@NonNull String str, @NonNull Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int bitmapBytes = d0.getBitmapBytes(bitmap);
        if (bitmapBytes > maxSize()) {
            this.cache.remove(str);
        } else {
            this.cache.put(str, new b(bitmap, bitmapBytes));
        }
    }

    @Override // com.squareup.picasso.d
    public int size() {
        return this.cache.size();
    }

    public o(int i8) {
        this.cache = new a(i8);
    }
}
