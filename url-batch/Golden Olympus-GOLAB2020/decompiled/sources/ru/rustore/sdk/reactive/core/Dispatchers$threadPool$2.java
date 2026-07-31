package ru.rustore.sdk.reactive.core;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.s;

@Metadata
/* loaded from: classes3.dex */
final class Dispatchers$threadPool$2 extends s implements Function0<ThreadPoolExecutor> {
    public static final Dispatchers$threadPool$2 INSTANCE = new Dispatchers$threadPool$2();

    Dispatchers$threadPool$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final ThreadPoolExecutor invoke() {
        return new ThreadPoolExecutor(3, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue());
    }
}
