package com.yandex.div.core.timer;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
final class Ticker$timer$2 extends s implements Function0<FixedRateScheduler> {
    public static final Ticker$timer$2 INSTANCE = new Ticker$timer$2();

    Ticker$timer$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final FixedRateScheduler invoke() {
        return new FixedRateScheduler();
    }
}
