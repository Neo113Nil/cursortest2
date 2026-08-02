package com.squareup.cash.storage;

import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes6.dex */
public final /* synthetic */ class TempFileDownloaderModule$bindTempFileDownloader$1 extends PropertyReference1Impl {
    public static final TempFileDownloaderModule$bindTempFileDownloader$1 INSTANCE = new TempFileDownloaderModule$bindTempFileDownloader$1(Storage.class, "temp", "getTemp()Lokio/FileSystem;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((RealStorage) ((Storage) obj)).temp;
    }
}
