package com.squareup.cash.support.backend.real;

import dev.zacsweers.metro.internal.Factory;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class RealSupportFlowManager {
    public final LinkedHashMap articles = new LinkedHashMap();

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new RealSupportFlowManager();
        }
    }
}
