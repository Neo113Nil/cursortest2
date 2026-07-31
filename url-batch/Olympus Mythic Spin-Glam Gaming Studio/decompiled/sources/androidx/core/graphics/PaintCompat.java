package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes15.dex */
public final class PaintCompat {
    private static final ThreadLocal sRectThreadLocal = new ThreadLocal();

    public static boolean hasGlyph(Paint paint, String str) {
        return Api23Impl.hasGlyph(paint, str);
    }

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static void setBlendMode(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    @RequiresApi
    static class Api23Impl {
        @DoNotInline
        static boolean hasGlyph(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }
}
