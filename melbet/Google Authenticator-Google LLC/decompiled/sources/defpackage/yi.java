package defpackage;

import android.content.res.Resources;
import android.database.SQLException;
import android.graphics.Rect;
import android.os.Build;
import android.view.InputDevice;
import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class yi {
    public yi() {
    }

    public static zz a(View view, zz zzVar, Rect rect) {
        WindowInsets e = zzVar.e();
        if (e != null) {
            return zz.q(view.computeSystemWindowInsets(e, rect), view);
        }
        rect.setEmpty();
        return zzVar;
    }

    static void b(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void c(View view, xq xqVar) {
        yh yhVar = xqVar != null ? new yh(view, xqVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, yhVar);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (yhVar != null) {
            view.setOnApplyWindowInsetsListener(yhVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static int d(Resources resources, int i, wt wtVar, int i2) {
        int dimensionPixelSize;
        return i != -1 ? (i == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i)) < 0) ? i2 : dimensionPixelSize : ((Integer) wtVar.a()).intValue();
    }

    public static boolean e(int i, int i2, int i3) {
        InputDevice device = InputDevice.getDevice(i);
        return (device == null || device.getMotionRange(i2, i3) == null) ? false : true;
    }

    public static boolean f(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static long[] g(Object obj) {
        if (!(obj instanceof int[])) {
            if (obj instanceof long[]) {
                return (long[]) obj;
            }
            return null;
        }
        int[] iArr = (int[]) obj;
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            jArr[i] = iArr[i];
        }
        return jArr;
    }

    public static void h(int i, String str) {
        throw new SQLException(a.Y(i, "Error code: ").concat(", message: ".concat(str)));
    }

    public static void i(View view, ame ameVar) {
        view.getClass();
        view.setTag(R.id.view_tree_saved_state_registry_owner, ameVar);
    }

    public static brr j(ame ameVar) {
        return new brr(new amg(ameVar, new nb(ameVar, 10)));
    }

    public yi(byte[] bArr) {
    }
}
