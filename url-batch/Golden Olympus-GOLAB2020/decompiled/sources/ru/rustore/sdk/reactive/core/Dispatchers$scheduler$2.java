package ru.rustore.sdk.reactive.core;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class Dispatchers$scheduler$2 extends s implements Function0<ScheduledThreadPoolExecutor> {
    public static final Dispatchers$scheduler$2 INSTANCE = new Dispatchers$scheduler$2();

    Dispatchers$scheduler$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ScheduledThreadPoolExecutor invoke() {
        return new ScheduledThreadPoolExecutor(1);
    }
}
