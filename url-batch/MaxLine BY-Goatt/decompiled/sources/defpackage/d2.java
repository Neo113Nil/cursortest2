package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class d2 {
    public static int a() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    public static PackageInfo b(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object c(Bundle bundle, String str) {
        return bundle.getParcelable(str, t3.class);
    }

    public static String d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics e(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean f(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean g(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    public static boolean h(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void i(m32 m32Var, he heVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (heVar == null || (findOnBackInvokedDispatcher = m32Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, heVar);
    }

    public static final void j(m32 m32Var, he heVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (heVar == null || (findOnBackInvokedDispatcher = m32Var.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(heVar);
    }

    public static final void k(CursorAnchorInfo.Builder builder, w72 w72Var) {
        builder.setEditorBoundsInfo(new EditorBoundsInfo.Builder().setEditorBounds(bd3.J(w72Var)).setHandwritingBounds(bd3.J(w72Var)).build());
    }

    public static final void l(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }
}
