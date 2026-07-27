package v0;

import android.os.Bundle;
import android.view.ViewStructure;

/* renamed from: v0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1242h {
    public static Bundle a(ViewStructure viewStructure) {
        return viewStructure.getExtras();
    }

    public static void b(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public static void c(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public static void d(ViewStructure viewStructure, int i2, int i4, int i5, int i6, int i7, int i8) {
        viewStructure.setDimens(i2, i4, i5, i6, i7, i8);
    }

    public static void e(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void f(ViewStructure viewStructure, float f4, int i2, int i4, int i5) {
        viewStructure.setTextStyle(f4, i2, i4, i5);
    }
}
