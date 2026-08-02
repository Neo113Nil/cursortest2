package com.squareup.cash.support.screenshot;

import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealScreenshotManager$toCompleteCachePath$1 extends PropertyReference1Impl {
    public static final RealScreenshotManager$toCompleteCachePath$1 INSTANCE = new RealScreenshotManager$toCompleteCachePath$1(Storage.class, "cache", "getCache()Lokio/FileSystem;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((RealStorage) ((Storage) obj)).cache;
    }
}
