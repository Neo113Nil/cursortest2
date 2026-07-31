package androidx.core.view;

import android.view.ViewStructure;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public class ViewStructureCompat {

    @RequiresApi
    private static class Api23Impl {
        @DoNotInline
        static void setDimens(ViewStructure viewStructure, int i, int i2, int i3, int i4, int i5, int i6) {
            viewStructure.setDimens(i, i2, i3, i4, i5, i6);
        }

        @DoNotInline
        static void setText(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setText(charSequence);
        }

        @DoNotInline
        static void setClassName(ViewStructure viewStructure, String str) {
            viewStructure.setClassName(str);
        }

        @DoNotInline
        static void setContentDescription(ViewStructure viewStructure, CharSequence charSequence) {
            viewStructure.setContentDescription(charSequence);
        }
    }
}
