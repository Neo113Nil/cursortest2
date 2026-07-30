package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.os.ext.SdkExtensions;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class c2 {
    public static Icon a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static void b(int i) {
        SdkExtensions.getExtensionVersion(i);
    }

    public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static String d(a4 a4Var) {
        if (a4Var instanceof z3) {
            return "image/*";
        }
        if (a4Var instanceof y3) {
            return null;
        }
        a.b();
        return null;
    }

    public static Insets e(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static boolean f(Context context) {
        return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
    }

    public static boolean g() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }

    public static boolean h(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean i(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean j(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static void k(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void l(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void m(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void n(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void o(Outline outline, oa oaVar) {
        if (oaVar instanceof oa) {
            outline.setPath(oaVar.a);
        } else {
            ch2.h("Unable to obtain android.graphics.Path");
        }
    }

    public static void p(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}
