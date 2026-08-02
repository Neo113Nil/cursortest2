package com.squareup.cash.storage;

import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes.dex */
public final /* synthetic */ class FileSystemProviderModule$provideProvider$1 extends PropertyReference1Impl {
    public static final FileSystemProviderModule$provideProvider$1 INSTANCE = new FileSystemProviderModule$provideProvider$1(Storage.class, "cache", "getCache()Lokio/FileSystem;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((RealStorage) ((Storage) obj)).cache;
    }
}
