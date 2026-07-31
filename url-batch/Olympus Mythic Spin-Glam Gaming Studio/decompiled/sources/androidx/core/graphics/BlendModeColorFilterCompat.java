package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes12.dex */
public class BlendModeColorFilterCompat {

    @RequiresApi
    static class Api29Impl {
        @DoNotInline
        static ColorFilter createBlendModeColorFilter(int i, Object obj) {
            return new BlendModeColorFilter(i, (BlendMode) obj);
        }
    }
}
