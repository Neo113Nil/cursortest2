package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* loaded from: classes3.dex */
public final class zzah {
    @CanIgnoreReturnValue
    static Object[] zza(Object[] objArr, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            if (objArr[i9] == null) {
                throw new NullPointerException("at index " + i9);
            }
        }
        return objArr;
    }
}
