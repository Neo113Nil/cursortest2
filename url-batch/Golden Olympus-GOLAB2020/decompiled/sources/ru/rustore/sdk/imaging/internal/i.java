package ru.rustore.sdk.imaging.internal;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache<String, Bitmap> f43662a;

    public i(LruCache<String, Bitmap> memoryCache) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f43662a = memoryCache;
    }

    public final Bitmap a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f43662a.get(key);
    }

    public final void a(String key, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f43662a.put(key, bitmap);
    }
}
