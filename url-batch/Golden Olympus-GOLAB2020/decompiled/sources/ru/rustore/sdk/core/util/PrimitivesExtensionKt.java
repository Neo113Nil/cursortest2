package ru.rustore.sdk.core.util;

import kotlin.Metadata;

@Metadata
/* loaded from: classes3.dex */
public final class PrimitivesExtensionKt {
    public static final int safeToInt(long j4) {
        if (-2147483648L > j4 || j4 > 2147483647L) {
            return 0;
        }
        return (int) j4;
    }
}
