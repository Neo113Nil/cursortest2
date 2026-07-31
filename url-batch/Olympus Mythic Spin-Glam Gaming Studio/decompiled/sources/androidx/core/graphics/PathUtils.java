package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes14.dex */
public final class PathUtils {

    @RequiresApi
    static class Api26Impl {
        @DoNotInline
        static float[] approximate(Path path, float f) {
            return path.approximate(f);
        }
    }
}
