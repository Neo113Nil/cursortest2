package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes6.dex */
public final class PointerIconCompat {

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static PointerIcon getSystemIcon(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }

        @DoNotInline
        static PointerIcon create(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        @DoNotInline
        static PointerIcon load(Resources resources, int i) {
            return PointerIcon.load(resources, i);
        }
    }
}
