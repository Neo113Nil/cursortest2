package m;

import android.graphics.Bitmap;
import android.os.Build;

/* loaded from: classes.dex */
public final class a {
    public static int a(Bitmap bitmap) {
        return Build.VERSION.SDK_INT >= 19 ? bitmap.getAllocationByteCount() : bitmap.getByteCount();
    }
}
