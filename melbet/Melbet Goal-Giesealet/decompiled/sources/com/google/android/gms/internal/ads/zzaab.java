package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import com.facebook.react.uimanager.ViewProps;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzaab {
    public static boolean zza(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(ViewProps.DISPLAY);
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
