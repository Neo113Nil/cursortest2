package n;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static void a(Drawable drawable, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof b) {
            ((b) drawable).b(colorStateList);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Drawable drawable, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof b) {
            ((b) drawable).a(mode);
        }
    }
}
