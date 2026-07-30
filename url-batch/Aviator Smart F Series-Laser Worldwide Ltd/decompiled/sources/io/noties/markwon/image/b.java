package io.noties.markwon.image;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes4.dex */
public abstract class b {
    @NonNull
    public static b noOp() {
        return new c();
    }

    public abstract void cancel(@NonNull a aVar);

    public abstract void load(@NonNull a aVar);

    @Nullable
    public abstract Drawable placeholder(@NonNull a aVar);
}
