package I;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class u0 {
    public static int a(int i2) {
        int statusBars;
        int i5 = 0;
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            if ((i2 & i7) != 0) {
                if (i7 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i7 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i7 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i7 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i7 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i7 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i7 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i7 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                } else if (i7 == 512) {
                    statusBars = WindowInsets.Type.systemOverlays();
                }
                i5 |= statusBars;
            }
        }
        return i5;
    }
}
