package androidx.core.os;

import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class BuildCompat$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ int m() {
        return Build.VERSION.SDK_INT < 36 ? Build.VERSION.SDK_INT * AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength : Build.VERSION.SDK_INT_FULL;
    }
}
