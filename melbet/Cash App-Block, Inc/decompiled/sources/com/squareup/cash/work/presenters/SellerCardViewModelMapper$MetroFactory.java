package com.squareup.cash.work.presenters;

import com.squareup.protos.cash.api.Error;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class SellerCardViewModelMapper$MetroFactory implements Factory {
    public static final SellerCardViewModelMapper$MetroFactory INSTANCE = new SellerCardViewModelMapper$MetroFactory();

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Error.Code.Companion(13);
    }
}
