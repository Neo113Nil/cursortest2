package com.squareup.cash.tax.web;

import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes7.dex */
public final /* synthetic */ class TaxWebAppBridge$openTakePhotoIntent$intent$1$fileUri$1 extends PropertyReference1Impl {
    public static final TaxWebAppBridge$openTakePhotoIntent$intent$1$fileUri$1 INSTANCE = new TaxWebAppBridge$openTakePhotoIntent$intent$1$fileUri$1(Storage.class, "cache", "getCache()Lokio/FileSystem;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((RealStorage) ((Storage) obj)).cache;
    }
}
