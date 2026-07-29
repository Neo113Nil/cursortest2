package com.tapjoy.internal;

import android.graphics.Bitmap;
import com.tapjoy.internal.id;
import javax.annotation.Nonnull;

/* loaded from: classes.dex */
final class ii implements id.a {
    ii() {
    }

    @Override // com.tapjoy.internal.id.a
    @Nonnull
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.tapjoy.internal.id.a
    public final byte[] a(int i) {
        return new byte[i];
    }

    @Override // com.tapjoy.internal.id.a
    public final int[] b(int i) {
        return new int[i];
    }
}
